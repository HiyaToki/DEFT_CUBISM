"""
Evaluate belief and sentiment predictions against gold annotaitons. 
"""
import sys
import argparse 
import os
from collections import defaultdict

from deft_ere import EREAnnotations, RelationMention, EventMention, read_ere_xml
from deft_best import BeStAnnotations, read_best_xml

__author__ = 'Daniel Bauer'
__email__ = 'bauer@cs.columbia.edu'
__date__ = 'May 31 2016'

debug = False

class PrivateStateTuple(object):
    """
    The 4-tuple that the evaluation is based on.
    """
    def __init__(self, source_entity, target_object, value, provenance_list=[]):
        self.source_entity = source_entity
        self.target_object = target_object
        self.value = value
        self.provenance_list = provenance_list

    def __repr__(self):
        return "<PST ({0},{1},{2},{3})>".format(self.source_entity, \
                self.target_object, self.value, self.provenance_list)

    def __eq__(self, other):
        """
        Equals function ignores the provenance list
        """ 
        other.source_entity == self.source_entity
        other.target_object == self.target_object
        other.value == self.value       
        self.provenance_list == other.provenance_list
        
    def __hash__(self):
        """
        Hash function ignores the provenance list
        """
        return 31 * hash(self.source_entity) + 199 * hash(self.target_object) +\
               383 * hash(self.value) + 701 * hash(tuple(self.provenance_list))


def compute_pr(gold_set, predict_set):
    """
    Compare the predict_set to the gold_set and return a tuple of
    precision, recall, and fscore
    """
    matched = float(len(gold_set | predict_set))
    recall = matched / len(gold_set)
    precision = matched / len(predict_set) 
    fscore = 2 * (precision * recall) / (precision+recall)
    return precision, recall, fscore

def get_private_state_tuples(ere_annotations, best_annotations, sentiment = True, belief = True):
    """
    Create a list of privaste_state_tuples from an ERE and a BeSt annotation object.
    """ 
    # an index mapping a (source string, target string, value string) tupple to a list of target mentions (provenance) 
    stv_to_provenance = defaultdict(list) 
  
    if belief:  
        for belief in best_annotations.beliefs:
            # Retrieve the actual source entity from the mention
            source_mention = belief.source
            source_mention_s = source_mention.mention_id
            source_entity_s = source_mention.entity.entity_id

            # Retrieve the actual target relation or event from the mention
            target_mention = belief.target
            target_object_s = target_mention.relation.relation_id if isinstance(target_mention, RelationMention) \
                                else target_mention.hopper.event_id
           
            value = belief.belief_type 
            stv_to_provenance[source_entity_s, target_object_s, value].append(target_mention.mention_id)
       
    if sentiment: 
        for sentiment in best_annotations.sentiments:
            # Retrieve the actual source entity from the mention
            source_mention = sentiment.source
            source_mention_s = source_mention.mention_id
            source_entity_s = source_mention.entity.entity_id

            # Retrieve the actual target relation or event from the mention
            target_mention = sentiment.target
            if isinstance(target_mention, RelationMention):
              target_object_s = target_mention.relation.relation_id
            elif isinstance(target_mention, EventMention): 
              target_object_s = target_mention.hopper.event_id 
            else: #entity mention
              target_object_s = target_mention.entity.entity_id

            value = sentiment.polarity
            stv_to_provenance[source_entity_s, target_object_s, value].append(target_mention.mention_id)

    result = []
    for (s,t,v),provenance_l in stv_to_provenance.items():
        result.append(PrivateStateTuple(s,t,v,provenance_l))

    return result

 
def score_pst_tuples(gold_pst_l, predict_pst_l, partial_provenance = True):
    """
    Run a recall-precision based analysis of a predicted list of PST tuples
    against a gold list of PST tuples. 
    
    Partial credit is assigned in the following cases: 
    1. Partial credit is given if the target is correct, but not  the source.
    2. Partial credit is given if the type of attitude is correct (i.e., belief
       or sentiment), but not the value (pos or neg for sentiment, CB, NCB, ROB
       for belief).  No partial credit is given if belief is predicted when there
       is a sentiment and vice versa.
    3. If partial_provenance==True, Partial credit is given for the provenance list 
       (i.e., pointers to documents and specific text passages that support the 
       claimed attitude from source to target). There are two conditions.
       In the full-provenance condition partial credit is given based on
       recall-precision analysis of the provenance list. 
       In the single-provenance condition, full credit is given if at least
       one correct provenance is detected.

    Parameters
    ----------
    gold_pst_l : list
        The list of gold PST 4-tuples 
    predict_pst_l : list
        The list of predict PST 4-tuples to score
    partial_provenance : boolean
        If True, award partial credit for provenance list. 
        If False, give full credit if one provenance matches. 

    Returns 
    -------
    a triple (true positive score, false negatives, false positives)
    """

    sentiment_values = ['pos','neg']
    belief_values = ['cb','ncb','rob','na']

    #Step 2: Initial analysis based on the first 3 fields in the tuple.
    matches_for_pst = defaultdict(list) # map (predict_pst, priority) to a list of possible gold PSTs

    for predict in predict_pst_l: 
        # Scan through the gold tokens and find the best possible match. 
        # Keep track of the current highest "priority", so that type C is preferred over type D etc.
        best_gold_pst = [None]
        best_gold_tp_priority = [0] 

        for gold in gold_pst_l: 
            source_matches = gold.source_entity == predict.source_entity

            target_matches = gold.target_object == predict.target_object

            belief_type_matches = (gold.value.lower() in sentiment_values and predict.value.lower() in sentiment_values) or \
                                  (gold.value.lower() in belief_values and predict.value.lower() in belief_values)
                
            value_matches = gold.value == predict.value
            
            if target_matches: 
                if belief_type_matches:
                    if value_matches: 
                        if source_matches: #Type B
                            matches_for_pst[predict, 4].append(gold)
                        else: #Type D
                            matches_for_pst[predict, 2].append(gold)
                    else: 
                        if source_matches: # Type C
                           matches_for_pst[predict, 3].append(gold) 
                        else: # Type E
                           matches_for_pst[predict, 1].append(gold) 

    optimal_match_for_predict = {} # map(predict_pst) to a tuple (priority, gold_pst)

    # For each match type priority see if we can find a match for each predicted PST.
    # Once a match is found, we remove the gold PST from the pool of possible PSTs.
    for priority in range(4,0,-1):
       for predict in predict_pst_l:
           if not predict in optimal_match_for_predict:  # Still need to find a match for this PST
               if (predict, priority) in matches_for_pst:
                   gold = matches_for_pst[predict,priority][0] # Just pick any
                   if gold in gold_pst_l:
                       gold_pst_l.remove(gold)
                       optimal_match_for_predict[predict] = (priority, gold)

    # All remaining gold PSTs are false negatives  
    fn = float(len(gold_pst_l))

    if debug: 
        print("---False Negatives---")
        for pst in gold_pst_l:
            print(pst)

    tp_scores_for_type = {\
        4 : 1.0,    # Type B
        3 : 2/3.0,  # Type C
        2 : 2/3.0,  # Type D
        1 : 1/3.0   # Type E
    }
    
    # Step 3:
    # Compute total weighted true positive count and false positive count
    tp = 0.0
    fp = 0.0
    if debug: 
        print("---True Positives---")
    false_positives = []
    for predict in predict_pst_l:
        if predict in optimal_match_for_predict:
            priority, gold = optimal_match_for_predict[predict]
            p, r, provenance_f = compute_pr(set(gold.provenance_list), set(predict.provenance_list))
            if provenance_f > 0.0:
                match_score = tp_scores_for_type[priority]
                
                if partial_provenance:
                    score = tp_scores_for_type[priority] * provenance_f
                else: 
                    score = tp_scores_for_type[priority]
                tp += score
                if debug: 
                    print("{0} TP match score: {1} provenance weight: {2} total: {3}".format(predict, match_score, provenance_f, score) )
            else: 
                false_positives.append(predict)
                fp += 1.0 
        else: 
            false_positives.append(predict)
            fp += 1.0 # No gold match found for this predicted PST
    
    if debug: 
        print("---False Positives---")
        for predict in false_positives:
            print(predict)    

    if debug:
        print("TP: {0}".format(tp))
        print("FN: {0}".format(fn))
        print("FP: {0}".format(fp))
 
    return tp, fn, fp #precision, recall, fscore 
 
def score_best_annotations(ere_annotation, gold_annotation, predict_annotation, partial_provenance = False, sentiment_flag = True, belief_flag = True):
    """
    Wrapper method for score_pst_tuples that first extracts pst tuples from gold_annotation and predict_annotation. 

    Parameters
    ----------
    ere_annotation : deft_ere.EREAnnotations
        The ERE definition used
    gold_annotation : deft_best.BeStAnnotations
        The gold annotations
    predict_annotations: deft_best.BeStAnntations
        The annotations to score

    Returns
    -------
    a triple (true positive score, false negatives, false positives)
    """
    # Step 1: Create 4-tuple notation
    if sentiment_flag or belief_flag: 
        sentiment, belief = sentiment_flag, belief_flag
    else: 
        sentiment, belief = True, True


    gold_tuples_l = get_private_state_tuples(ere_annotation, gold_annotation, sentiment, belief)
    if debug: 
        print("Gold private state tuples: {0}".format(gold_tuples_l))
    predict_tuples_l = get_private_state_tuples(ere_annotation, predict_annotation, sentiment, belief)
    if debug: 
        print("Predict private state tuples: {0}".format(gold_tuples_l))
    return score_pst_tuples(gold_tuples_l, predict_tuples_l, partial_provenance)

def process_batch_directory(ere_directory, gold_directory, predict_directory, provenance = False, belief_flag_only = False, micro = True, macro= True, per_file_scores = False, sentiment_flag = True, belief_flag = True):
    filenames = [f for f in os.listdir(gold_directory) if f.endswith('.best.xml')]

    total_tp = 0.0
    total_fn = 0.0
    total_fp = 0.0

    precisions = []
    recalls = []

    for f in filenames: 
        base_name = f.replace('.best.xml','')
        if debug: 
            print('\n---Scoring {0}---'.format(base_name))
        gold_path = os.path.join(gold_directory,f)
        predict_path = os.path.join(predict_directory,f)
        
        ere_fn = '{0}.rich_ere.xml'.format(base_name)
        ere_path = os.path.join(ere_directory, ere_fn)
       
        ere_annotations = read_ere_xml(ere_path) 
        gold_annotations = read_best_xml(ere_annotations, gold_path)
        predict_annotations = read_best_xml(ere_annotations, predict_path) 
        tp, fn, fp = score_best_annotations(ere_annotations, gold_annotations, predict_annotations, sentiment_flag = sentiment_flag, belief_flag = belief_flag) 
        total_tp += tp 
        total_fn += fn 
        total_fp += fp 
 
        precision = (tp / (tp + fp)) if (tp + fp) > 0.0 else 1.0
        recall = (tp / (tp + fn)) if (tp + fn) > 0.0 else 1.0
        precisions.append(precision)
        recalls.append(recall)
        fscore = 2 * (precision * recall) / (precision + recall) if (precision+recall) > 0.0 else 0.0
        if per_file_scores: 
            print('File {0}: P {1} R {2} F {3}'.format(base_name, precision, recall, fscore)) 
   
    if micro: # Print micro averaged results 
        micro_precision = (total_tp / (total_tp + total_fp)) if (total_tp + total_fp) > 0.0 else 1.0
        micro_recall = (total_tp / (total_tp + total_fn)) if (total_tp + total_fn) > 0.0 else 1.0    
        micro_fscore = 2 * (micro_precision * micro_recall) / (micro_precision + micro_recall) if \
                    (micro_precision + micro_recall) > 0.0 else 0.0
        if sentiment_flag: 
            print('\n---micro-averaged scores (sentiment only)---')
        elif belief_flag: 
            print('\n---micro-averaged scores (belief only)---')
        else: 
            print('\n---micro-averaged scores---')
        print('P: {0} R: {1} F: {2}'.format(micro_precision, micro_recall, micro_fscore))
    
    if macro: # Print macro averaged results
        macro_precision = sum(precisions) / float(len(precisions))
        macro_recall = sum(recalls) / float(len(recalls))
        macro_fscore = 2 * (macro_precision * macro_recall) / (macro_precision + macro_recall) if (macro_precision + macro_recall) > 0.0 else 0.0    
        if sentiment_flag: 
            print('\n---macro-averaged scores (sentiment only)---')
        elif belief_flag: 
            print('\n---macro-averaged scores (belief only)---')
        else: 
            print('\n---macro-averaged scores---')

        print('P: {0} R: {1} F: {2}'.format(macro_precision, macro_recall, macro_fscore))

def main():
    parser = argparse.ArgumentParser(description='Scorer for DEFT belief and sentiment annotations.') 
    parser.add_argument('ere_file', type=str, help = 'rich ERE XML file or directory')
    parser.add_argument('gold_file', type=str, help = 'gold belief and sentiment XML file or directory')
    parser.add_argument('predict_file', type=str, help = 'predicted belief and sentiment XML file or directory')
    
    parser.add_argument('-p','--partial-provenance', dest='provenance', action='store_true', default=False, help='give partial credit for provenance lists')
    group = parser.add_mutually_exclusive_group()
    group.add_argument('-s','--sentiment-only', default=False, dest='sentiment', action='store_true', help='score only sentiment annotations')
    group.add_argument('-b','--belief-only', default=False, dest='belief', action='store_true', help='score only belief annotations')

    parser.add_argument('-f','--per-file', dest='per_file', action='store_true', help = 'print per-file scores (batch mode only)')
    parser.add_argument('-v','--verbose', dest='verbose', action='store_true', help = 'show debugging output')

    args = parser.parse_args()

         

    global debug
    debug = args.verbose

    if os.path.isdir(args.gold_file):
        print('Evaluating all files in the specified directories (batch mode).')
        process_batch_directory(args.ere_file, args.gold_file, args.predict_file, provenance = args.provenance, per_file_scores = args.per_file, sentiment_flag = args.sentiment, belief_flag = args.belief)
    else: 
        ere_annotations = read_ere_xml(args.ere_file)
        if debug: 
            print('Successfully read ERE annotations from {0}.'.format(args.ere_file))
        gold_annotations = read_best_xml(ere_annotations, args.gold_file)
        if debug: 
            print('Successfully read GOLD BeSt annotations from {0}.'.format(args.gold_file))
        predict_annotations = read_best_xml(ere_annotations, args.predict_file) 
        if debug: 
            print('Successfully read PREDICT BeSt annotations from {0}.'.format(args.predict_file))
        
        tp, fn, fp = score_best_annotations(ere_annotations, gold_annotations, predict_annotations, partial_provenance = args.provenance, sentiment_flag = args.sentiment, belief_flag = args.belief)

        precision = (tp / (tp + fp)) if (tp + fp) > 0.0 else 1.0
        recall = (tp / (tp + fn)) if (tp + fn) > 0.0 else 1.0
        fscore = 2 * (precision * recall) / (precision + recall) if (precision+recall) > 0.0 else 0.0
        if args.belief: 
            print('\n---scores (belief only)---')
        elif args.sentiment:
            print('\n---scores (sentiment only)---')
        else: 
            print('\n---scores---')
        print('P: {0}  R: {1}  F: {2}'.format(precision, recall, fscore))
        

if __name__ == "__main__":
    main()
