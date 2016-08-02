"""
This module contains classes to represent belief and sentiment annotations
and methods to read XML annotations into an OOP representation.
"""
import sys
import xml.etree.ElementTree as ET
from xml.etree.ElementTree import tostring
from deft_ere import EREAnnotations, AnnotationFormatError, read_ere_xml

__author__ = 'Daniel Bauer'
__email__ = 'bauer@cs.columbia.edu'
__date__ = 'May 31 2016'

class AnnotationConsistencyError(RuntimeError):
    pass

class Belief(object):
    def __init__(self, source_mention, target_mention, btype, polarity, sarcasm):
        self.source = source_mention
        self.target = target_mention # relation or event mention
        self.belief_type = btype
        self.polarity = polarity
        self.sarcasm = sarcasm

    def __repr__(self):
        return '<Belief {0} {1} {2}>'.format(self.belief_type, self.source.mention_id, self.target.mention_id,)

class ArgumentBelief(object):
    """
    A belief whose target is an event argument.
    """
    def __init__(self, source_mention, target_event_mention, target_argument, btype, polarity, sarcasm):

        self.source = source_mention
        self.target_event_mention = target_event_mention
        self.target = target_argument
        self.belief_type = btype
        self.polarity = polarity
        self.sarcasm = sarcasm

    def __repr__(self):
        return '<ArgumentBelief {0} {1} {3} (of {2})>'.format(self.belief_type, self.source.mention_id, self.target_event_mention.mention_id, self.target.mention_id,)


class Sentiment(object):
    def __init__(self, source_mention, target_mention, polarity, sarcasm):
        self.source = source_mention
        self.target = target_mention # relation, event, or entity mention
        self.polarity = polarity
        self.sarcasm = sarcasm

    def __repr__(self):
        return '<Sentiment {0} {1} {2}>'.format(self.polarity, self.source.mention_id, self.target.mention_id,)

class BeStAnnotations(object):
    """
    A set of Belief and Sentiment annotations linked against an EREAnnotation object.
    """
    def __init__(self, ere_annotations):
        self.sources = {}
        self.ere_annotations = ere_annotations
        self.beliefs = []
        self.sentiments = []
        self.argument_beliefs = []

    def integrate_beliefs_for_mention(self, etree, mention):
        """
        This method adds the annotated beliefs over a relation or event mention.
        """
        if etree is None:
            raise AssertionError('Got None, expected ElementTree object.')
        for child_et in etree:
            assert child_et.tag == 'belief'
            btype = child_et.get('type')
            polarity = child_et.get('polarity')
            sarcasm = child_et.get('sarcasm')

            # Get the source entity
            source_et = child_et.find('source')
            if source_et is None:
                sys.stderr.write('Warning: Skipping belief annotation for {0}. No source annotated.\n'.format(mention.mention_id))
            else:
                source_mention_id= source_et.get('id')
                if source_mention_id is None:
                    source_mention_id = source_et.get('ere_id')
                try:
                    source_entity_mention = self.ere_annotations.entity_mentions[source_mention_id]
                except KeyError:
                    raise AnnotationConsistencyError("Could not find entity mention {0} in ERE annotation.".format(source_mention_id))
                # These items are already recorded in the mention entry. No need to read them again.
                #source_et.text
                #source_et.get('offset')
                #source_et.get('length')

                belief = Belief(source_entity_mention, mention, btype, polarity, sarcasm)
                self.beliefs.append(belief)
                source_entity_mention.beliefs.append(belief)
                mention.beliefs.append(belief)

    def integrate_belief_relations(self, etree):
        for child_et in etree:
            if child_et.tag == 'relation':
                relation_mention_id = child_et.get('id')
                if relation_mention_id is None:
                    relation_mention_id = child_et.get('ere_id')
                try:
                    relation = self.ere_annotations.relation_mentions[relation_mention_id]
                except KeyError:
                    raise AnnotationConsistencyError("Could not find relation mention {0} in ERE annotation.".format(relation_mention_id))
                self.integrate_beliefs_for_mention(child_et.find('beliefs'), relation)
            else:
                pass # ignore triggers

    def integrate_beliefs_for_event_argument(self, etree, target_event_mention, arguments):
        """
        This method adds the annotated beliefs over an event argument 
        """
    
        for child_et in etree:
            assert child_et.tag == 'belief'
            btype = child_et.get('type')
            polarity = child_et.get('polarity')
            sarcasm = child_et.get('sarcasm')

            # Get the source entity
            source_et = child_et.find('source')
            if source_et is None:
                sys.stderr.write('Warning: Skipping belief annotation for arguments {0} of {1}. No source annotated.\n'.format(arguments, target_event_mention.mention_id))
            else:
                source_mention_id= source_et.get('id')
                if source_mention_id is None:
                    source_mention_id = source_et.get('ere_id')
                try:
                    source_entity_mention = self.ere_annotations.entity_mentions[source_mention_id]
                except KeyError:
                    raise AnnotationConsistencyError("Could not find entity mention {0} in ERE annotation.".format(source_mention_id))
                belief = ArgumentBelief(source_entity_mention, target_event_mention, arguments, btype, polarity, sarcasm)
                self.argument_beliefs.append(belief)
                source_entity_mention.argument_beliefs.append(belief)
                for argument in arguments:
                    argument.beliefs.append(belief)

    def integrate_belief_event_arguments(self, etree, event):
        for child_et in etree:
            assert child_et.tag == 'arg'
            argument_mention_id = child_et.get('id')
            if argument_mention_id is None:
                argument_mention_id = child_et.get('ere_id')
            try:
                arguments = event.argument_index[argument_mention_id]
            except KeyError:
                raise AnnotationConsistencyError("Event mention {0} has no argument {1} in ERE annotation.".format(event.mention_id, argument_mention_id))
            for arg_child_et in child_et:
                if arg_child_et.tag == "beliefs":
                    self.integrate_beliefs_for_event_argument(arg_child_et, event, arguments)
                elif arg_child_et.tag == "text":
                    pass # Already in ERE annotation
                else: 
                    print tostring(child_et)
                    raise AnnotationFormatError('unexpected XML element {0}.'.format(tostring(arg_child_et)))

    def integrate_belief_events(self, etree):
        for child_et in etree:
            if child_et.tag == 'event':
                event_mention_id = child_et.get('id')
                if event_mention_id is None:
                    event_mention_id = child_et.get('ere_id')
                try:
                    event = self.ere_annotations.event_mentions[event_mention_id]
                except KeyError:
                    raise AnnotationConsistencyError("Could not find event mention {0} in ERE annotation.".format(event_mention_id))
                for event_child_et in child_et:
                    if event_child_et.tag == "beliefs":
                        self.integrate_beliefs_for_mention(event_child_et, event)
                    elif event_child_et.tag == "arguments":
                        self.integrate_belief_event_arguments(event_child_et, event)
                    elif event_child_et.tag =="trigger":
                        pass
                    else:
                        raise AnnotationFormatError('unexpected XML element {0}.'.format(tostring(event_child_et)))
                                               
            else:
                pass # ignore triggers

    def integrate_belief_annotations(self, etree, source):
        for child_et in etree:
            if child_et.tag == 'relations':
                self.integrate_belief_relations(child_et)
            elif child_et.tag == 'events':
                self.integrate_belief_events(child_et)
            else:
                raise AnnotationFormatError('unexpected XML element {0}.'.format(tostring(child_et)))

    def integrate_sentiments_for_mention(self, etree, mention):
        """
        This method adds the annotated beliefs over a relation or event mention.
        """
        if etree is None:
            raise AssertionError('Got None, expected ElementTree object.')
        for child_et in etree:
            if child_et.tag == 'sentiment':
                polarity = child_et.get('polarity')
                sarcasm = child_et.get('sarcasm')
                # Get the source entity
                source_et = child_et.find('source')
                if source_et is None:
                    sys.stderr.write('Warning: Skipping sentiment annotation for {0}. No source annotated.\n'.format(mention.mention_id))
                else:
                    source_mention_id= source_et.get('id')
                    if source_mention_id is None:
                        source_mention_id = source_et.get('ere_id')
                    try:
                        source_entity_mention = self.ere_annotations.entity_mentions[source_mention_id]
                    except KeyError:
                        raise AnnotationConsistencyError("Could not find entity mention {0} in ERE annotation.".format(source_mention_id))
                    # These items are already recorded in the mention entry. No need to read them again.
                    #source_et.text
                    #source_et.get('offset')
                    #source_et.get('length')

                    sentiment = Sentiment(source_entity_mention, mention, polarity, sarcasm)
                    self.sentiments.append(sentiment)
                    source_entity_mention.has_sentiments.append(sentiment)
                    mention.sentiments.append(sentiment)

    def integrate_sentiment_relations(self, etree):
        for child_et in etree:
            if child_et.tag == 'relation':
                relation_mention_id = child_et.get('id')
                if relation_mention_id is None:
                    relation_mention_id = child_et.get('ere_id')
                try:
                    relation = self.ere_annotations.relation_mentions[relation_mention_id]
                except KeyError:
                    raise AnnotationConsistencyError("Could not find relation mention {0} in ERE annotation.".format(relation_mention_id))
                self.integrate_sentiments_for_mention(child_et, relation)
            else:
                pass # ignore triggers

    def integrate_sentiment_events(self, etree):
        for child_et in etree:
            if child_et.tag == 'event':
                event_mention_id = child_et.get('id')
                if event_mention_id is None:
                    event_mention_id = child_et.get('ere_id')
                try:
                    event = self.ere_annotations.event_mentions[event_mention_id]
                except KeyError:
                    raise AnnotationConsistencyError("Could not find event mention {0} in ERE annotation.".format(event_mention_id))
                self.integrate_sentiments_for_mention(child_et, event)
            else:
                pass # ignore triggers

    def integrate_sentiment_entities(self, etree):
        for child_et in etree:
            if child_et.tag == 'entity':
                entity_mention_id = child_et.get('id')
                if entity_mention_id is None:
                    entity_mention_id = child_et.get('ere_id')
                try:
                    entity = self.ere_annotations.entity_mentions[entity_mention_id]
                except KeyError:
                    raise AnnotationConsistencyError("Could not find entity mention {0} in ERE annotation.".format(entity_mention_id))
                self.integrate_sentiments_for_mention(child_et, entity)
            else:
                pass # ignore triggers

    def integrate_sentiment_annotations(self, etree, source):
        for child_et in etree:
            if child_et.tag == 'entities':
                self.integrate_sentiment_entities(child_et)
            elif child_et.tag == 'relations':
                self.integrate_sentiment_relations(child_et)
            elif child_et.tag == 'events':
                self.integrate_sentiment_events(child_et)
            else:
                raise AnnotationFormatError('unexpected XML element {0}.'.format(tostring(child_et)))

    def integrate_etree(self, etree):
        """
        Add the content of an e-tree object into the annotation data structure.
        """
        root = etree.getroot()
        # Create a new source object
        source = BeStDocumentSource(root.get('id'))
        if not source.doc_id in self.sources:
            self.sources[source.doc_id] = source
        else:
            source = self.sources[source.doc_id]

        # Now process the children
        for child in root:
            if child.tag == 'belief_annotations':
                self.integrate_belief_annotations(child, source)
            elif child.tag == 'sentiment_annotations':
                self.integrate_sentiment_annotations(child, source)
            else:
                raise AnnotationFormatError('unexpected XML element {0}.'.format(tostring(child_et)))


class BeStDocumentSource(object):
    def __init__(self, doc_id):
        self.doc_id = doc_id


def read_best_xml(ere_annotations, *sources):
    """
    Read in one or more XML sources and return a BeStAnnotations bject.
    """

    annotations = BeStAnnotations(ere_annotations); # The new annotations object

    for source_f in sources:
        et = ET.parse(source_f)
        annotations.integrate_etree(et)

    return annotations


if __name__ == '__main__': # Test the XML readers
    if len(sys.argv) == 3:
        ere_annotations = read_ere_xml(sys.argv[1])
        print('Successfully read ERE annotations from {0}.'.format(sys.argv[1]))
        best_annotations = read_best_xml(ere_annotations, sys.argv[2])
        print('Successfully read BeSt annotations from {0}.'.format(sys.argv[2]))
    else:
        print('deft_best.py -- library for DEFT ERE and BeSt annotations.')
        print(' This script should terminate without error if the annotations are well formed.')
        print(' Usage: python deft_best.py [rich ere XML file] [BeST XML file]')
     
