/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.albany.cubism.sentiment;

import edu.albany.cubism.util.OpenANEW;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.ParserConfigurationException;
import edu.albany.cubism.ie.CharSeq;
import edu.albany.cubism.ie.EntityMention;
import edu.albany.cubism.ie.OldEntity;
import edu.albany.cubism.relation.Graph;
import edu.albany.cubism.relation.Node;
import edu.albany.cubism.relation.Path;
import edu.albany.cubism.relation.Utterance;
import edu.albany.cubism.sentiment.LoadQuerys.QueryInput;
import edu.albany.cubism.sentiment.StanfordParser;
import edu.albany.cubism.sentiment.StanfordParser.ParserParts;
import edu.albany.cubism.util.FileProcessor;
import edu.albany.cubism.util.Settings;
import edu.albany.cubism.util.Tools;
//import edu.illinois.cs.cogcomp.lbj.coref.*;

/**
 *
 * @author Ting Liu 2015 Forum Data Sentiment analysis
 */
public class ForumDependencies {

    private static String origSlot;             // The original Slot Filler that was read from the query
    private static ArrayList<String> passiveActionVerbs = createPassiveActionVerbs();     // An arrayList that holds words which should be ignored
    public static CustomFileWriter outputCSV = null;      // The writing file that will be used to write the entire document
    private static String CSVLocation = Settings.getValue("kbp_data_path") + "/2014_output.txt";
    private NewswireFindAnnotation newswireFA = new NewswireFindAnnotation();
    private Wordnet wordnet = new Wordnet();                                            // Open Wordnet in order to get bases of words.
    private OpenANEW openANEWDatabase = new OpenANEW();                                 // Open the ANEW database to obtain sentiment of words
    public HashSet common_verbs = null;
    public HashSet opinion_words = null;
    public ArrayList<CalculusInfo> sys_outputs = new ArrayList();
    private String evidence = "";

    private boolean passPathFilter(Path path) {
        int v_c = 0; //number of verbs
        int pre_c = 0; //number of preposition
//        if (path.size() > 5) {
//            return false;
//        }
        for (Node node : path) {
            if (node.getPos().startsWith("V")) {
                v_c++;
            }
            if (node.getPos().startsWith("IN")) {
                pre_c++;
            }
            if (v_c > 2 || pre_c > 1) {
                return false;
            }
        }
        return true;
    }

    private ArrayList<Node> getCanNodes(Graph sent_graph) {
        ArrayList<Node> cands = new ArrayList();
        ArrayList<Node> nodes = sent_graph.getSortedNodes();
        for (Node node : nodes) {
            if (node.getEntity() != null) {
//                System.out.println("find an entity: " + node.getName());
                //		    System.out.println("query_head: " + q_head);
                //		    System.out.println("query_term: " + q_head.getEntity().getFullExpression());
                cands.add(node);
            }
        }
        return cands;
    }

    // Class which stores each peice of the dependency relations in a sentence
    public class SentenceInfo {

        public String soloDepend;  // specific dependency data for a node
        int found;          // if the node has already been searched

        public SentenceInfo(String soloDepend, int found) {
            this.soloDepend = soloDepend;
            this.found = found;
        }
    }

    // Create a new node for that stores all the information for the sentence
    private SentenceInfo createSentenceNode(String soloDepend, int found) {
        SentenceInfo newSentenceInfoNode = new SentenceInfo(soloDepend, found);
        return newSentenceInfoNode;
    }

    // Holds the information gathered from each read sentence
    public class CalculusInfo {

        public String x;               // The answer we find
        public int xStart;             // The starting offset value for the answer
        public int xEnd;               // The ending offset value for the answer
        public String relation;        // The relation between the answer and the query name
        public String firstRelation;   // The first relation found
        public String target;          // The query name
        public String foundLine;       // The current line being read and looked at
        public int startOffset;        // The start offset where the line begins within the entire document
        public int endOffset;          // The end offset where the line begins within the entire document
        public double sentiment;       // The sentiment value of the relation, based on the ANEW database score
        public String pathName;        // The pathname to the document
        public String completeLine;    // The unfiltered version of the currentl ine ripped from the original document it came from
        public boolean negate;         // Decide whether to negate the relation
        public String oriQuery;        // Original query
        public String oriX;            // Original x
        public Graph sent_graph;       // sentence graph
        public Path path;              //links betwe x and query
        public Node query_node;
        public Node anw_node;
        public Node relation_node;
        public Utterance utt;
        public String slot;
        public ArrayList<String> relation_path = new ArrayList();
        public String evidence = "";
        public CharSeq en_x;
        public EntityMention enMention;

        //switch xstart and xend
        public CalculusInfo(String x, String oriX, CharSeq en_x, int xStart, int xEnd, String relation, String firstRelation, String target, String foundLine, int startOffset,
                int endOffset, double sentiment, String pathName, String completeLine, boolean negate) {
            this.x = x;
            this.oriX = oriX;
            this.xStart = xStart;
            this.xEnd = xEnd;
            this.relation = relation;
            this.firstRelation = firstRelation;
            this.target = target;
            this.foundLine = foundLine;
            this.startOffset = startOffset;
            this.endOffset = endOffset;
            this.sentiment = sentiment;
            this.pathName = pathName;
            this.completeLine = completeLine;
            this.negate = negate;
            this.en_x = en_x;
        }

        public CalculusInfo(String x, String oriX, EntityMention enMention, int xStart, int xEnd, String relation, String firstRelation, String target, String foundLine, int startOffset,
                int endOffset, double sentiment, String pathName, String completeLine, boolean negate) {
            this.x = x;
            this.oriX = oriX;
            this.xStart = xStart;
            this.xEnd = xEnd;
            this.relation = relation;
            this.firstRelation = firstRelation;
            this.target = target;
            this.foundLine = foundLine;
            this.startOffset = startOffset;
            this.endOffset = endOffset;
            this.sentiment = sentiment;
            this.pathName = pathName;
            this.completeLine = completeLine;
            this.negate = negate;
            this.enMention = enMention;
        }

        public void setGraph(Graph sent_graph) {
            this.sent_graph = sent_graph;
        }

        public Graph getGraph() {
            return sent_graph;
        }

        public void setUtterance(Utterance utt) {
            this.utt = utt;
        }

        public boolean equals(CalculusInfo c) {
            if (this.x.equals(c.x)
                    && this.foundLine.equals(c.foundLine)
                    && this.relation.equals(c.relation)
                    && this.slot.equals(c.slot)) {
                return true;
            }
            return false;
        }

        public void setQuery_node(Node query_node) {
            this.query_node = query_node;
        }

    }

    // The inital values for each of the variables
    private CalculusInfo reinitialzeCalcInfo(CalculusInfo calcData) {
        calcData.x = "";
        calcData.xStart = -1;
        calcData.xEnd = -1;
        calcData.relation = "";
        calcData.firstRelation = "";
        calcData.target = "";
        calcData.foundLine = "";
        calcData.startOffset = -1;
        calcData.endOffset = -1;
        calcData.sentiment = -1;
        calcData.pathName = "";
        calcData.negate = false;
        calcData.anw_node = null;
        calcData.query_node = null;
        calcData.utt = null;
        return calcData;

    }

    // Create a new node for that stores all the information for the sentence
    public CalculusInfo createCalculusNode(String x, String oriX, CharSeq en_x, int xStart, int xEnd, String relation, String firstRelation, String target, String foundLine, int startOffset, int endOffset,
            double sentiment, String pathName, String completeLine, boolean negate) {
        CalculusInfo newCalculusNode = new CalculusInfo(x, oriX, en_x, xStart, xEnd, relation, firstRelation, target, foundLine,
                startOffset, endOffset, sentiment, pathName, completeLine, negate);
        return newCalculusNode;
    }

    // Create a new node for that stores all the information for the sentence
    public CalculusInfo createCalculusNode(String x, String oriX, EntityMention en_x, int xStart, int xEnd, String relation, String firstRelation, String target, String foundLine, int startOffset, int endOffset,
            double sentiment, String pathName, String completeLine, boolean negate) {
        CalculusInfo newCalculusNode = new CalculusInfo(x, oriX, en_x, xStart, xEnd, relation, firstRelation, target, foundLine,
                startOffset, endOffset, sentiment, pathName, completeLine, negate);
        return newCalculusNode;
    }

    // Open a file containing a list of sentences and based on the name of the file, get all of the data associated with it
    public ArrayList getNewsSentenceFile(ArrayList<QueryInput> queryArrayList, HashMap<String, ArrayList<ArrayList<ForumParse.OffsetInfo>>> offsetCollection,
            HashMap<String, String> docsFullHash) throws SQLException, InterruptedException, IOException, ParserConfigurationException {

        // An Array List that stores the structured dependencies
        ArrayList<CalculusInfo> calcDataCollection = new ArrayList();   // Holds all of the gathered calculusInfo data
        ArrayList<Integer> invalidCalcData = new ArrayList();           // Holds the invalid calculusInfo data
        ArrayList<String> exemptWords = new ArrayList();                // Holds a list of words that should be exempt in certain cases
        Settings.initialize();
        common_verbs = FileProcessor.readMostFrequentVerbs(Settings.getValue("top_comm_verbs_eng"));
        opinion_words = FileProcessor.readMostFrequentVerbs(Settings.getValue("opinion_words"));
        System.out.println("opinion_words: " + opinion_words);
        // Create the list of exempt words
        exemptWords = createExemptWords();
        HashMap<String, ArrayList> annotations = new HashMap();
        HashMap<String, ArrayList> new_annotations = new HashMap();

        // Open each file containing the relevant sentences from a news article
        // Test Data Files
        File[] parentDirect = new File(Settings.getValue("kbp_data_path") + "/newswire_sentences").listFiles();
        outputCSV = new CustomFileWriter(CSVLocation);
        outputCSV.print("QUERYID{DOC_ID{NAME{SENTIMENT{SENTENCE{RELATION_I{ANSWER_I{RELATION_II{ANSWER_II{\n");
        boolean first_query = true;

        // 2014 Data Files
        //File[] parentDirect = new File(Settings.getValue("kbp_data_path")+"/2014evaluation/newswire_sentences").listFiles();
        HashMap<String, Integer> wrong = new HashMap();
        HashMap<String, Integer> correct = new HashMap();
        HashMap<String, Integer> correct_path = new HashMap();
        HashMap<String, Integer> missed = new HashMap();
        StanfordParser sp = new StanfordParser();
        int anwsb2 = 0;
        HashMap<String, Integer> q_relation_types = new HashMap();
        HashMap<String, Integer> a_relation_types = new HashMap();
        HashMap<String, Integer> subj_objs = new HashMap();
        HashMap<String, ArrayList> q_a_pairs = new HashMap();
        int sp_counts = 0;
        for (File child : parentDirect) {

            calcDataCollection.clear();
            invalidCalcData.clear();
            if (child.getName().length() < 13) {
                continue;
            }
            System.out.println("child: " + child);
            String queryID = getQueryID(child);
            String name = getName(queryArrayList, queryID);
            System.out.println("name: " + name);
            if (child.getName().contains("newswire_text_") || name.trim().equals("")) {
                continue;
            }
            String slot = getSlot(queryArrayList, queryID);
            String docID = getDocID(queryArrayList, queryID);
            String docAssID = getDocAssID(queryArrayList, queryID);
            String type = getType(queryArrayList, queryID);
            String answer = getAnswer(queryArrayList, queryID);
            String answerText = getAnswerText(queryArrayList, queryID);
            HashMap answers = getAnswerOffsets(queryArrayList, queryID);
            String oriDoc = this.getOriginalDoc(queryArrayList, queryID);
            ArrayList<Utterance> utts = this.getUtterances(queryArrayList, queryID);
            System.out.println("---------------------------");
            System.out.println("---\t" + queryID);
            System.out.println("---\t" + name);
            System.out.println("---\t" + slot);
            System.out.println("---\t" + docID);
            System.out.println("---------------------------");
            System.out.println("---\tAnswer:\t" + answer);
            System.out.println("---------------------------");
            System.out.println("---\tAnswer Text:\t");
            System.out.println("---------------------------");
            System.out.println("---\tBegin Processing ");
            System.out.println("---------------------------");

            System.out.println("OFFSET SIZE:\t" + offsetCollection.size());
            if (offsetCollection.size() == 0) {
                continue;
            }
//            for (int k = 0; k < offsetCollection.get(queryID).size(); k++) {
//                ///            System.out.println(offsetCollection.get(queryID).get(k).annoteWord);
//            }
            ArrayList<HashMap> an_keys = new ArrayList(answers.values());
            System.out.println("an_keys.size: " + an_keys.size());
            for (HashMap an_key : an_keys) {
//                HashMap doc_anwsers = (HashMap) answers.get(an_key);
                anwsb2 += an_key.size() - 1;
            }
            if (!queryID.contains("SSF14_ENG_259")/*slot.contains("towards")*/ && docsFullHash.containsKey(docAssID)) {
                // Read through the file to explore dependencies
                sp_counts = readLines(child, name, slot, sp, calcDataCollection, invalidCalcData, queryID, docsFullHash, docAssID, type, exemptWords, offsetCollection, answers, oriDoc, first_query, correct, wrong, missed, correct_path, q_relation_types, a_relation_types, subj_objs, q_a_pairs, sp_counts, annotations, new_annotations, utts);
                first_query = false;
                System.out.println(queryID);
                // Print out the collected data from the single query that was stored in calcDataCollection
                printNewswire(calcDataCollection, offsetCollection, invalidCalcData, queryID, slot, docID, docAssID, docsFullHash, type, oriDoc, utts);
            }
            if (sp_counts > 300) {
                sp = new StanfordParser();
            }
        }
        System.out.println("q_relation_types: " + q_relation_types);
        System.out.println("a_relation_types: " + a_relation_types);
        System.out.println("subj_objs: " + subj_objs);
////        Integer over_all = subj_objs.get("all");
////        Integer subj_obj = subj_objs.get("bot_s_o");
////        if (over_all != 0) {
////        System.out.println("rate: " + ((double) subj_obj) / over_all);
////        } else {
////            
////        }
//        this.printTrainInfo(subj_objs, over_all, q_a_pairs);
        System.out.println("anwsb2: " + anwsb2);
        System.out.println("correct relations: " + correct);
        System.out.println();
        System.out.println("correct path relations: " + correct_path);
        System.out.println();
        System.out.println("wrong relations: " + wrong);
        ArrayList<String> wrong_keys = new ArrayList(Arrays.asList(wrong.keySet().toArray()));
        System.out.print("\nwrong relation sentiment: ");
        for (String wrong_key : wrong_keys) {
            System.out.print(this.calSentiment(wrong_key) + ", ");
        }
        ArrayList<String> annKeys = new ArrayList(Arrays.asList(new_annotations.keySet().toArray()));
        System.out.println("===============golden answers===============");
        for (String annKey : annKeys) {
            ArrayList ann = new_annotations.get(annKey);
            System.out.println(annKey + ": " + ann);
        }
        System.out.println("===============    done      ===============");

        System.out.println("===============missed ones=================");
        ArrayList added_ak = new ArrayList();
        for (String annKey : annKeys) {
            String[] annKey_infos = annKey.split("----\\+\\)\\(\\(----");
            String answer = annKey_infos[1];
            Integer startx = new Integer(annKey_infos[2]);
            Integer endx = new Integer(annKey_infos[3]);
            String query = annKey_infos[4];
            String slot = annKey_infos[5].split(":")[1].trim();
//            System.out.println("golden answer: " + annKey);
            for (CalculusInfo calcData : sys_outputs) {
                if (answer.contains(calcData.x)
                        || calcData.x.contains(answer)) {
//                    System.out.println("found matched x: " + calcData.x);
//                    System.out.println("offset start: " + calcData.startOffset + " ===== offset end: " + calcData.endOffset);
                    if (calcData.startOffset >= startx - 200 && calcData.startOffset <= endx + 200
                            || calcData.endOffset >= startx - 200 && calcData.endOffset <= endx + 200
                            || startx >= calcData.startOffset - 200 && startx <= calcData.endOffset + 200
                            || endx >= calcData.startOffset - 200 && endx <= calcData.endOffset + 200) {
//                        System.out.println("in good offset");
//                        System.out.println("sys slot: " + calcData.slot);
                        if (calcData.slot.equals(slot)) {
                            //found one
                            added_ak.add(annKey);
                        }
                    }
                }
            }
        }
//        System.out.println("founded answers: " + added_ak);
        for (String annKey : annKeys) {
            if (added_ak.contains(annKey)) {
                continue;
            }
            ArrayList ann = new_annotations.get(annKey);
            System.out.println(annKey + ": " + ann);
        }
        System.out.println("===============    done      ===============");

        System.out.println("===============wrong ones=================");
        HashMap<String, Integer> wrong_relations = new HashMap();
        HashMap<String, ArrayList<Integer>> all_relations = new HashMap();
        ArrayList<CalculusInfo> additional_findings = new ArrayList();
        ArrayList<CalculusInfo> corrects = new ArrayList();
        for (CalculusInfo calcData : sys_outputs) {
            boolean found = false;
            for (String annKey : annKeys) {
                String[] annKey_infos = annKey.split("----\\+\\)\\(\\(----");
                String answer = annKey_infos[1];
                Integer startx = new Integer(annKey_infos[2]);
                Integer endx = new Integer(annKey_infos[3]);
                String query = annKey_infos[4];
                String slot = annKey_infos[5].split(":")[1].trim();
//            System.out.println("golden answer: " + annKey);
                if (answer.contains(calcData.x)
                        || calcData.x.contains(answer)) {
//                    System.out.println("found matched x: " + calcData.x);
//                    System.out.println("offset start: " + calcData.startOffset + " ===== offset end: " + calcData.endOffset);
                    if (calcData.startOffset >= startx - 200 && calcData.startOffset <= endx + 200
                            || calcData.endOffset >= startx - 200 && calcData.endOffset <= endx + 200
                            || startx >= calcData.startOffset - 200 && startx <= calcData.endOffset + 200
                            || endx >= calcData.startOffset - 200 && endx <= calcData.endOffset + 200) {
//                        System.out.println("in good offset");
//                        System.out.println("sys slot: " + calcData.slot);
                        if (calcData.slot.equals(slot)) {
                            //found one
                            found = true;
                        }
                    }
                }
            }
            if (!found) {
                boolean contains = false;
                for (CalculusInfo c : additional_findings) {
                    if (c.equals(calcData)) {
                        contains = true;
                        break;
                    }
                }
                if (!contains) {
                    additional_findings.add(calcData);
                    String bad_r = calcData.relation;
                    ArrayList<Integer> counts = all_relations.get(bad_r);
                    if (counts == null) {
                        counts = new ArrayList();
                        counts.add(0);
                        counts.add(0);
                        all_relations.put(bad_r, counts);
                    }
                    int bad = counts.get(1);
                    bad++;
                    counts.set(1, bad);
                }
            } else {
                boolean contains = false;
                for (CalculusInfo c : corrects) {
                    if (c.equals(calcData)) {
                        contains = true;
                        break;
                    }
                }
                if (!contains) {
                    corrects.add(calcData);
                    String good_r = calcData.relation;
                    ArrayList<Integer> counts = all_relations.get(good_r);
                    if (counts == null) {
                        counts = new ArrayList();
                        counts.add(0);
                        counts.add(0);
                        all_relations.put(good_r, counts);
                    }
                    int good = counts.get(0);
                    good++;
                    counts.set(0, good);
                }
            }
        }

//        System.out.println("founded answers: " + added_ak);
        ArrayList founded = new ArrayList();
        StringBuffer answer = new StringBuffer();
        System.out.println("*******************");
        for (CalculusInfo c : additional_findings) {
//            System.out.println("start: " + c.startOffset);
//            System.out.println("end: " + c.endOffset);
            answer = new StringBuffer();
            if (c.relation.equalsIgnoreCase("people")) {
                continue;
            }
            answer.append(c.oriQuery + "\t");
            if (c.en_x != null && c.en_x.keyWord != null) {
                answer.append(c.x + "\t"); //for aggregation porpuse
                if (c.en_x.keyWord.equalsIgnoreCase("I")
                        || c.en_x.keyWord.equalsIgnoreCase("me")
                        || c.en_x.keyWord.equalsIgnoreCase("my")
                        || c.en_x.keyWord.equalsIgnoreCase("mine")
                        || c.en_x.keyWord.equalsIgnoreCase("we")) {
                    continue;
                }
            } else {
                answer.append(c.x + "\t");
                if (c.x.equalsIgnoreCase("I")
                        || c.x.equalsIgnoreCase("me")
                        || c.x.equalsIgnoreCase("my")
                        || c.x.equalsIgnoreCase("mine")
                        || c.x.equalsIgnoreCase("we")) {
                    continue;
                }
            }
            if (c.en_x != null && c.en_x.getParent() != null) {
                answer.append(c.en_x.getParent().getType().toLowerCase());
            } else {
                answer.append("per");
            }
            answer.append("\t" + c.slot);
            double adj_sent = ((c.sentiment) / 9) * 7 - 4; //standlize the score
            answer.append("\t" + adj_sent);
            answer.append("\t" + c.foundLine);
            if (c.utt != null) {
                answer.append("\t" + c.utt.getPostTime() + "\n");
            }
            if (!founded.contains(answer.toString())) {
                System.out.print(answer.toString());
                founded.add(answer.toString());
            }

//            System.out.println("context: " + c.foundLine);
//            System.out.println("slot: " + c.slot);
//            System.out.println("Oringal Query Name:\t" + c.oriQuery);
//            if (c.query_node != null) {
//                System.out.println("query form in text: " + c.query_node.getName());
//                System.out.println("query position in text: " + c.query_node.getId());
//            }
//            if (c.utt != null) {
//                System.out.println("post time: " + c.utt.getPostTime());
//            }
//            System.out.print("Relation:\t");
//            System.out.println(c.relation);
//            System.out.println("sentiment: " + c.sentiment);
            Integer wrc = wrong_relations.get(c.relation);
            if (wrc == null) {
                wrc = new Integer(0);
            }
            wrc++;
            wrong_relations.put(c.relation, wrc);
//            System.out.println("Found Answer:\t" + c.x);
//            if (c.en_x != null && c.en_x.keyWord != null) {
//                System.out.println("Found Actual answer:\t" + c.en_x.keyWord);
//            } else {
//                System.out.println("Found Actual answer:\t" + c.x);
//            }
//            if (c.en_x != null && c.en_x.getParent() != null) {
//                System.out.println("answer type:\t" + c.en_x.getParent().getType());
//            } else {
//                System.out.println("answer type:\tPER");
//            }
        }
        System.out.println("wrong relations: " + wrong_relations);
        System.out.println("===============    done      ===============");
        System.out.println("all relations: " + all_relations);
        ArrayList<String> all_keys = new ArrayList(Arrays.asList(all_relations.keySet().toArray()));
        for (String all_key : all_keys) {
            ArrayList<Integer> counts = all_relations.get(all_key);
            System.out.println(all_key + ": " + ((double) counts.get(0)) / (counts.get(0) + counts.get(1)));
        }
        System.out.println("");
        System.out.println("missed: " + missed);
        outputCSV.closeFile();
        return sys_outputs;
    }

    public void printTrainInfo(HashMap<String, Integer> subj_objs, Integer overall, HashMap<String, ArrayList> q_a_pairs) {
        ArrayList<String> keys = new ArrayList(Arrays.asList(subj_objs.keySet().toArray()));
        for (String key : keys) {
            Integer count = subj_objs.get(key);
            System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&\n" + key + ": " + ((double) count) / overall);
            ArrayList<String> sents = q_a_pairs.get(key);
            if (sents != null) {
                for (String sent : sents) {
                    System.out.println("sentence:" + sent);
                }
            }
        }
    }

    public void saveAnnotations(HashMap<String, ArrayList<ArrayList<Integer>>> ann_answs, HashMap<String, ArrayList> annotations, String oriDoc, String name, String slot) {
        ArrayList<String> keys = new ArrayList(Arrays.asList(ann_answs.keySet().toArray()));
        for (String key : keys) {
            System.out.println("answer: " + key);
            ArrayList<ArrayList<Integer>> offsets = ann_answs.get(key);
            for (int ii = 0; ii < offsets.size(); ii++) {
                ArrayList<Integer> offset = offsets.get(ii);
                System.out.println("answer offset: " + offset);
                int startx = offset.get(0);
                int endx = offset.get(1);
                String anw_context = oriDoc.substring(startx, endx);
                if (anw_context != null && anw_context.contains("<post ")) {
                    int ext_endx = oriDoc.indexOf("</post", startx);
                    anw_context = oriDoc.substring(startx, ext_endx);
                }
                String ann_key = "answer: ----+)((----" + key + "----+)((----" + startx + "----+)((----" + endx + "----+)((----query: " + name + "----+)((----slot: " + slot;
                ArrayList an_list = annotations.get(ann_key);
                if (an_list == null) {
                    an_list = new ArrayList();
                    annotations.put(ann_key, an_list);
                }
                if (!an_list.contains(anw_context)) {
                    an_list.add(anw_context);
                }
            }
        }

    }

    public int readLines(File child, String name, String slot, StanfordParser sp,
            ArrayList<CalculusInfo> calcDataCollection, ArrayList<Integer> invalidCalcData, String queryID, HashMap<String, String> docsFullHash,
            String docAssID, String type, ArrayList<String> exemptWords, HashMap<String, ArrayList<ArrayList<ForumParse.OffsetInfo>>> offsetCollection, HashMap<String, HashMap<String, ArrayList<ArrayList<Integer>>>> answers,
            String oriDoc, boolean first_line, HashMap<String, Integer> correct, HashMap<String, Integer> wrong, HashMap<String, Integer> missed, HashMap<String, Integer> correct_path, HashMap<String, Integer> q_relation_types,
            HashMap<String, Integer> a_relation_types, HashMap<String, Integer> sub_objs, HashMap<String, ArrayList> q_a_pairs, int sp_counts, HashMap<String, ArrayList> annotations, HashMap<String, ArrayList> new_annotations, ArrayList utts) throws SQLException, InterruptedException, IOException, ParserConfigurationException {

        String typedDepend;                                                         // A String that stores the dependency string from parser
        String typedTree;                                                           // A String that stores the depentency tree from parser
        String currLine;                                                            // The current line being read from the newsfile
        String annoteWord = "";                                                     // The annotation word from the parser
        String usedName = "";                                                       // The used name for the word
        String offsetSentence = "";                                                 // A sentence found using the offset values
        String cutSentence = "";
        CalculusInfo calcData = new CalculusInfo("", "", (CharSeq)null, -1, -1, "", "", "", "", // initialze a new calculusInfo item
                -1, -1, -1, "", "", false);                                                // A variable that stores the information for basic calculs
        ArrayList<SentenceInfo> dependArrayList = new ArrayList();                  // An Array List that stores the structured dependencies
        int startLocation;                                                          // Initialize the startLocation where the name is found within the sentence Info struct
        int sentenceCount = -1;                                                     // The number of sentences
        int annoteVal = 0;                                                          // The annoation query word found in the parsing 
        int annoteStart;                                                            // The beginning offset for the annnotated word sentence
        int annoteEnd;                                                              // The beginning offset for the annoted word sentence
        int w_annoteStart;                                                          // The beginning offset for the annnotated word
        int w_annoteEnd;                                                          // The end offset for the annnotated word
        double relationSentiment = 0;                                               // The value of the sentiment of the relation
        String startOffset = "";                                                    // Offset value for the sentence in the document
        ParserParts pp;

        int saysCount = 0;

        ArrayList<CalculusInfo> sys_anws = new ArrayList();
        ArrayList<ArrayList> ann_anws = new ArrayList();

        // Open the file containing all the lines of the specified name and parse each line while
        // splitting each peice of the stanford parser result into its own node in an array list
        CustomFileReader read = new CustomFileReader(child.getAbsolutePath());
        oriDoc = oriDoc.replaceAll("\n", " ");
        System.out.println("docAssID: " + docAssID);
        HashMap<String, ArrayList<ArrayList<Integer>>> ann_answs = answers.get(docAssID);
        System.out.println("found answers: " + ann_answs);
        this.saveAnnotations(ann_answs, new_annotations, oriDoc, name, slot);
        boolean add_q_info = true;
        ArrayList booleanInfo = new ArrayList();
        booleanInfo.add(first_line);
        booleanInfo.add(add_q_info);
        //Modified by TL 05/08/15 switch to offsetInfo for all processes including getting sentences
        ArrayList<ArrayList<ForumParse.OffsetInfo>> query_lists = offsetCollection.get(queryID.trim());
        for (ArrayList<ForumParse.OffsetInfo> query_list : query_lists) {
            for (ForumParse.OffsetInfo query : query_list) {
                Utterance utt = query.getUtt();
                System.out.println("utt from qalist: " + utt);

//        System.out.println("oriDoc: " + oriDoc);
//        while (read.hasNextLine()) {
//            currLine = read.getNextLine();
                calcData.setUtterance(utt);
                currLine = utt.getContent();
                System.out.println("processing: " + currLine);
                int hypl_ref_start = currLine.indexOf("<a href");
                int hypl_ref_end = currLine.indexOf("</a>");
                if (hypl_ref_start != -1) {
                    currLine = currLine.substring(0, currLine.indexOf("<a href"));//.concat(currLine.substring(currLine.indexOf("</a>")));
                    int hypl_length = hypl_ref_end - hypl_ref_start + 1;
                    if (hypl_ref_end != -1) {
                        for (int i = 0; i < hypl_length; i++) {
                            currLine.concat(" ");
                        }
                    } else {
                        int hypl_ref_start_end = currLine.indexOf("\">");
                        hypl_length = hypl_ref_start_end - hypl_ref_start + 1;
                        for (int i = 0; i < hypl_length; i++) {
                            currLine.concat(" ");
                        }
                    }
                    if (hypl_ref_end != -1) {
                        //for sentence split by TL 05/14/15
                        currLine.concat(utt.getContent().substring(hypl_ref_end));
                    }
                }
                if (currLine.trim().length() == 0) {
                } else {
                    int location = oriDoc.indexOf(currLine);
                    currLine = currLine.replace("&apos;", "'");
                    System.out.println("currLine: " + currLine);
                    System.out.println("currLine length: " + currLine.length());
                    System.out.println("location: " + location);
                    if (location == -1) {
                        System.out.println("oriDoc: " + oriDoc);
                    }
                    // Print out to the CSV Output file the queryID
                    outputCSV.print(queryID.trim() + "{");
                    if (docAssID.isEmpty()) {
                        outputCSV.print("N/A+{");
                    } else {
                        outputCSV.print(docAssID + "{");
                    }
                    if (name.isEmpty()) {
                        outputCSV.print("N/A" + "{");
                    } else {
                        outputCSV.print(name + "{");
                    }
                    outputCSV.print(slot + "{");
                    if (currLine.isEmpty()) {
                        outputCSV.print("N/A" + "{");
                    } else {
                        outputCSV.print(currLine + "{");
                    }
//                ArrayList<ForumParse.OffsetInfo> query_list = offsetCollection.get(queryID.trim()).get(annoteVal);
                    String speaker = null;
                    annoteWord = query.annoteWord;    // The annoted word of the same queryID found previouslyh
                    annoteStart = query.startOffset;  // The annotated start offset of the same queryID
                    annoteEnd = query.endOffset;      // The annotated end offset of the same queryID
                    w_annoteStart = query.getW_startOffset();
                    w_annoteEnd = query.getW_endOffset();
                    speaker = utt.getSpeaker();
//                annoteStart = location; 
                    System.out.println("NAME USED: " + name);
                    if (!currLine.endsWith("!") && !currLine.endsWith(".")) {
                        cutSentence = currLine.concat(".");
                    }
                    Graph sent_graph = new Graph();
                    calcData.setGraph(sent_graph);
                    calcData.setUtterance(utt);
                    if (!cutSentence.contains("")) {
                        if (cutSentence.length() > 300) {
                            continue;
                        }
                        pp = sp.parse(cutSentence);
                        sp.buildDependcyGraph(cutSentence, sent_graph);
//                        System.out.println("Current Sentence:\t" + cutSentence);
                        sent_graph.setSentence(cutSentence);
                        sp_counts++;
                    } else {
                        //added by TL for long paragraph, need to be fixed later 04/29/15
                        if (currLine.length() > 300) {
                            continue;
                        }
                        pp = sp.parse(currLine);
                        sp.buildDependcyGraph(currLine, sent_graph);
//                        System.out.println("Current Sentence:\t" + currLine);
                        sent_graph.setSentence(currLine);
                        sp_counts++;
                    }
                    //use location instead of annotestart since it's not that accurate in many cases
                    //modified by TL 04/08/15
                    sent_graph.setStartx(location);
                    sent_graph.setEndx(location + currLine.length());
                    sent_graph.setNodesOffset();
                    System.out.println("annoteStart: " + annoteStart);
                    System.out.println("annoteEnd: " + annoteEnd);
                    ArrayList ann_anw = new ArrayList();
                    ArrayList ann_path = new ArrayList();
//                if (annoteStart != -1) {
                    //print out path of annotated answers
                    String pathName = new ForumMultiThreadSync().createThreads(docAssID);
                    calcData.pathName = pathName;
                    System.out.println("pathName: " + pathName);
                    if (pathName.substring(pathName.lastIndexOf("/"), pathName.length()).contains(".xml")) {
                        pathName = Settings.getValue("kbp_data_path") + "/2014evaluation/batchForum" + pathName.substring(pathName.lastIndexOf("/"), pathName.length());
                    } else {
                        pathName = Settings.getValue("kbp_data_path") + "/2014evaluation/batchForum" + pathName.substring(pathName.lastIndexOf("/"), pathName.length()) + ".xml";
                    }
                    newswireFA.findEnInstances(pathName, annoteStart, annoteEnd, currLine, sent_graph);
                    ArrayList<String> keys = new ArrayList(Arrays.asList(ann_answs.keySet().toArray()));
//		    ArrayList<ArrayList<Integer>> anwOffsets = new ArrayList();
                    ArrayList<Node> anwPhrases = new ArrayList();
                    ArrayList<Node> q_heads = sent_graph.getEnInstances(name, -1, -1, currLine, sent_graph); //added by TL to get query head from sent graph
                    for (String key : keys) {
                        System.out.println("answer: " + key);
                        ArrayList<ArrayList<Integer>> offsets = ann_answs.get(key);
                        for (int ii = 0; ii < offsets.size(); ii++) {
                            ArrayList<Integer> offset = offsets.get(ii);
                            System.out.println("answer offset: " + offset);
                            for (Integer offs : offset) {
//                            if (offs >= annoteStart && offs <= annoteEnd) {
                                if (offs >= location && offs <= annoteEnd + 3) { //changed by TL 04/08/15 because of annotestart not accurate
                                    anwPhrases.addAll(sent_graph.getEnInstances(key, location, location + currLine.length(), currLine, sent_graph));//newswireFA.getEnInstances(key, pathName, annoteStart, annoteEnd, sent_graph.getSentence()));
                                    String ann_key = "answer: " + key + "_" + offs + "  --- query: " + name + "---- slot: " + slot;
                                    ArrayList an_list = annotations.get(ann_key);
                                    if (an_list == null) {
                                        an_list = new ArrayList();
                                        annotations.put(ann_key, an_list);
                                    }
                                    an_list.add(currLine);
//                                offsets.remove(ii);
//                                ii--;
//                                if (offsets.size() == 0) {
//                                    ann_answs.remove(key);
//                                }
                                    continue;
                                }
                            }
                        }
                    }
//		    System.out.println("anwOffsets: " + anwOffsets);
                    System.out.println("anwPhrases: " + anwPhrases);
                    System.out.println("q_heads: " + q_heads);
                    ArrayList processed_anw_heads = new ArrayList();
                    ArrayList processed_q_heads = new ArrayList();
//			for (ArrayList<Integer> anwOff: anwOffsets) {
                    for (Node anw_head : anwPhrases) {
//			    int anw_startx = anwOff.get(0) - annoteStart - 1;
//			    int anw_endx = anwOff.get(1) - annoteStart;
//                            System.out.println("anw_startx: " + anw_startx);
//                            System.out.println("anw_endx: " + anw_endx);
//			    String anw_phrase = sent_graph.getSentence().substring(anw_startx, anw_endx);
//                    System.out.println("anw_phrase: " + anw_head.getEntity().keyWord);
//                    Node anw_head = sent_graph.getHead(anw_phrase);
                        if (anw_head != null) {
                            System.out.println("anw_head: " + anw_head.getName());
                        }
                        Path shortest = null;
//                    for (NewswireParse.OffsetInfo queryWord : query_list) {
                        for (Node q_head : q_heads) {
//                        System.out.println("q_phrase: " + q_head.getEntity().keyWord);
                            System.out.println("w_startOffset: " + q_head.getEntity().startOffset);
//                        Node q_head = sent_graph.getHead(queryWord.annoteWord, queryWord.w_startOffset);
                            if (q_head != null) {
                                System.out.println("q_head: " + q_head.getName());
                                q_head.setIsQuery(true);
                            }
                            if (q_head != null
                                    && anw_head != null/*
                                     && (!processed_anw_heads.contains(anw_head)
                                     || !processed_q_heads.contains(q_head))*/) {
                                ann_anw.add(anw_head.getEntity().keyWord);
                                Path path = new Path();
//                            ann_path.add(path);
                                path.addAll(sent_graph.shortestPathV2(q_head, anw_head));
//                            System.out.println("path: " + path);
                                if (shortest == null) {
                                    shortest = path;
                                } else {
                                    if (shortest.size() > path.size()) {
                                        shortest = path;
                                    }
                                }
                                processed_anw_heads.add(anw_head);
                            }
                            if (!processed_q_heads.contains(q_head)) {
                                processed_q_heads.add(q_head);
                            }
                        }
                        System.out.println("shortest path: " + shortest);
                        if (shortest != null) {
                            ann_path.add(shortest);
                            this.collectAnnInfo(shortest, sent_graph, q_relation_types, a_relation_types, sub_objs, q_a_pairs);
                        } else {
                            ann_path.add(null);
                        }
//                    }
                    }

//                System.out.println("annotStart: " + annoteStart);
//                System.out.println("annotEnd: " + annoteEnd);
//                System.out.println("w_annoteStart:" + w_annoteStart);
//                System.out.println("w_annoteEnd:" + w_annoteEnd);
                    int sent_start = oriDoc.indexOf(currLine);

//                System.out.println("annoteWord:\t" + annoteWord);
//                System.out.println("annoteStart:\t" + annoteStart);
//                System.out.println("annoteEnd:\t" + annoteEnd);
                    String q_phrase;
//                if (!annoteWord.equals("")
//                        && w_annoteStart >= sent_start
//                        && w_annoteEnd < sent_start) {
//                    q_phrase = currLine.substring(w_annoteStart - sent_start - 1, w_annoteEnd - sent_start);
//                    System.out.println("q_phrase: " + q_phrase);
//                    System.out.println("answers: " + answers);
//                    HashMap<String, ArrayList<ArrayList<Integer>>> ann_anwss = answers.get(docAssID);
//                    ArrayList<String> keys = new ArrayList(Arrays.asList(ann_anwss.keySet().toArray()));
//                    for (String key : keys) {
//                        ArrayList<ArrayList<Integer>> ann_anws = ann_anwss.get(key);
//                        for (ArrayList<Integer> ann_anw : ann_anws) {
//                            int ann_anw_start = ann_anw.get(0);
//                            int ann_anw_end = ann_anw.get(1);
//                            if (ann_anw_start >= sent_start
//                                    && ann_anw_end <= sent_start + currLine.length()) {
//                                String ann_anw_phrase = currLine.substring(ann_anw_start - sent_start - 1, ann_anw_end - sent_start);
//                                System.out.println("annotated string: " + key);
//                                Node ann_anw_head = sent_graph.getHead(ann_anw_phrase);
//                            }
//                        }
//                    }
//                }
                    // Reinitialize the CalcInfo variable
                    reinitialzeCalcInfo(calcData);
                    calcData.setGraph(sent_graph);
                    calcData.setUtterance(utt);
                    sentenceCount++;
                    calcData.pathName = pathName;
                    // Get the dependencies and trees from the current sentence
                    typedTree = pp.tree;
                    typedDepend = pp.dependency;
                    typedDepend = removeBrackets(typedDepend);

                    // Reinitialize the ArrayList,store it with the dependencies and get the starting location of the name
                    dependArrayList.clear();
                    dependArrayList = splitDepend(typedDepend);
                    origSlot = slot;

                    System.out.println();

                    // If the annotation word we found during the sentence parsing process is not empty, then we should use that instead of the query name
                    if (!annoteWord.contentEquals("")) {
                        System.out.println("Annotation Word Found!:\t[" + annoteWord + "]");
                        System.out.print(name + " -> ");
                        usedName = annoteWord;
                        System.out.println(usedName);
                    } else {
//                    System.out.println("Annotation Word not Found!");
                        usedName = name;
                    }

                    System.out.println("Before Finding, usedName:\t" + usedName);
                    // Try to find the start location of the name If the start location wasn't found,
                    // and the type is that of an organization, try it again, except with the abbreviation for it instead
                    startLocation = findStartingName(dependArrayList, usedName, calcData, type, slot);
                    if (startLocation == -1 && type.contains("ORG")) {
                        startLocation = findStartingName(dependArrayList, getAbbreviation(usedName), calcData, type, slot);
                    }
                    ArrayList<ArrayList<Node>> path_cands = this.getPaths(processed_q_heads, sent_graph);
                    ArrayList<Node> nodes_cands = null;
                    //for forum data process
                    if (path_cands == null
                            || path_cands.size() == 0) {
                        nodes_cands = this.getCanNodes(sent_graph);
                    }
                    //		System.out.println("Path_cands: " + path_cands);
                    System.out.println("slot: " + slot);

                    // if the start Location is still -1, check for passive verb actions and if present, switch the from to towards, or towards to from
                    //comment out by TL 03_23_15 uncomment by TL 03_24
//                if (startLocation == -1) {
////                    if (hasPassiveVerbs(currLine)) {
//                    System.out.println("\n~~~Second Run ~~~\n");
//                    origSlot = slot;
//                    if (slot.contains("neg-towards")) {
//                        slot = "neg-from";
//                    } else if (slot.contains("neg-from")) {
//                        slot = "neg-towards";
//                    } else if (slot.contains("pos-towards")) {
//                        slot = "pos-from";
//                    } else if (slot.contains("pos-from")) {
//                        slot = "pos-towards";
//                    }
//
//                    // Try to find the start location of the name If the start location wasn't found,
//                    // and the type is that of an organization, try it again, except with the abbreviation for it instead
//                    startLocation = findStartingName(dependArrayList, usedName, calcData, type, slot);
//                    if (startLocation == -1 && type.contains("ORG")) {
//                        startLocation = findStartingName(dependArrayList, getAbbreviation(usedName), calcData, type, slot);
////                        }
//                    }
//                }
                    //done comment out
//                System.out.println("BEFOREDOCID");
//                System.out.println("DOCID:\t" + docAssID);
//                System.out.println("BEFORECURRLINE");
//                System.out.println("CURRLINE:\t" + currLine);
                    if (docsFullHash.containsKey(docAssID)) {

                        // Get the offsets of the sentence, set the foundline for the current sentence, and find the offsetsentence bassed off the offsets
                        calcData.startOffset = docsFullHash.get(docAssID).replace("\n", " ").indexOf(currLine);
                        calcData.endOffset = calcData.startOffset + (currLine.length());
                        calcData.foundLine = currLine;
//                        offsetSentence = docsFullHash.get(docAssID).replace("\n", " ").substring(calcData.startOffset, calcData.endOffset);
//                        calcData.completeLine = offsetSentence;
                        sent_graph.setStartx(calcData.startOffset);
                        sent_graph.setEndx(calcData.endOffset);
                        sent_graph.setNodesOffset();
                    }

//                System.out.println("startOffset:\t" + calcData.startOffset);
//                System.out.println("endOffset:\t" + calcData.endOffset);
                    // Test to see if the offset values give the same sentence as the read one, and in fact it does!
//                System.out.println("THE FOUND LINE:\t" + calcData.foundLine);
//                System.out.println("THE OFFSET SENTENCE:\t" + offsetSentence);
                    // Decide whether we are looking at the From or Towards cases and process the sentences different depending on it
                    if (slot.contentEquals("pos-from") || slot.contentEquals("neg-from")) {
//                    System.out.println("Is positive from or negative from");
                        if (startLocation != -1) {
                            findSubjectFrom(startLocation, dependArrayList, usedName, calcData, typedTree, docAssID, docsFullHash, exemptWords);
                        }
                    } else {
//                    System.out.println("Is positive towards or negative towards");
                        if (startLocation != -1) {
                            findObjectTowards(startLocation, dependArrayList, usedName, calcData, typedTree, docAssID, docsFullHash, exemptWords);
                        }
                    }

                    // Print out the ~Update I~ text in the output - safe to delete
                    printUpdate(calcData, "I");

                    // If the relation is any type of variation of "says" or "said", then look for specific items within the dependencies
                    if (isSaid(clearEndingNumbers(calcData.relation))) {
                        revampSays(dependArrayList, calcData, docAssID, docsFullHash, exemptWords);
                        System.out.println("I: \t" + calcData.relation);

                        if (isSaid(clearEndingNumbers(calcData.relation))) {
                            saysRelation(dependArrayList, calcData, docAssID, docsFullHash, exemptWords);
                            System.out.println("II: \t" + calcData.relation);

                            if (isSaid(clearEndingNumbers(calcData.relation))) {
                                if (!calcData.firstRelation.contentEquals("")) {
                                    calcData.relation = calcData.firstRelation;
                                    System.out.println("III: \t" + calcData.relation);

                                }
                            }
                        }
                    } else {
                        //create path between x and query
                        if (calcData.relation.length() > 0) {
                            Integer rel_id = new Integer(calcData.relation.split("-")[calcData.relation.split("-").length - 1]);
                            Node rel_node = sent_graph.getNode(rel_id);
//                    Integer x_id = new Integer(calcData.x.split("-")[1]);
                            System.out.println("calcData.x is: " + calcData.x);

                            if (calcData.x != null && calcData.x.length() > 0) {
                                String ans = calcData.x;
                                if (calcData.x.length() > calcData.oriX.length()) {
                                    ans = calcData.oriX;
                                }
                                System.out.println("ans: " + ans);
                                /*
                                 Node x_node = sent_graph.getHead(ans);
                                 if (x_node == null && ans.contains("-")) {
                                 Integer x_id = new Integer(ans.split("-")[ans.split("-").length - 1]);
                                 x_node = sent_graph.getNode(x_id);
                                 }
                                 if (x_node != null && rel_node != null) {
                                 Path path = new Path();
                                 path.addAll(sent_graph.shortestPath(x_node, rel_node));
                                 System.out.println("path: " + path.toString());
                                 calcData.path = path;
                                 }
                                 */
                                //added by TL to filter out too long path
//                            if (calcData.path != null && !passPathFilter(calcData.path)) {
////                            if (calcData.path != null && calcData.path.size() > 4) {
//                                calcData.x = "";
//                            }
                            }
                        }
                    }

                    // System.out.println("LOLOL");
                    // See if the relation is a variation of "have"
                    checkForExtension(dependArrayList, calcData);
                    checkForHave(dependArrayList, calcData, slot);
                    checkForJoined(dependArrayList, calcData, typedTree);
                    checkForNegate(dependArrayList, calcData);
                    // Add the almost finalized calcData information into the calculusData collection
                    CalculusInfo anwCalcData = addCalcData(openANEWDatabase, wordnet, calcData, slot,
                            currLine, calcDataCollection, invalidCalcData, sentenceCount, annoteStart, annoteEnd, docAssID, nodes_cands, name, speaker, q_heads, utts);

                    // increment the annotation value that allows us to accurately recieve the next offset data from the offsetcollection data
//                    this.printAnyalsisInfo(booleanInfo, queryID, name, slot, anwPhrases, calcData, anwCalcData, currLine, correct, ann_path, correct_path, wrong, sent_graph, missed);
                    annoteVal++;

                    // Print Update to the CSV file
                    outputCSV.println("{");
//            }
                }
            }
        }
        read.closeFile();

        return sp_counts;
    }

    public void printAnyalsisInfo(ArrayList<Boolean> booleanInfos, String queryID, String name, String slot, ArrayList<Node> ann_anw,
            CalculusInfo calcData, CalculusInfo anwCalcData, String currLine, HashMap<String, Integer> correct, ArrayList<Path> ann_path,
            HashMap<String, Integer> correct_path, HashMap<String, Integer> wrong, Graph sent_graph, HashMap<String, Integer> missed) throws IOException, SQLException {
        boolean first_line = booleanInfos.get(0);
        BufferedWriter bw = new BufferedWriter(new FileWriter(new File(Settings.getValue("kbp_sentiment_path") + "/system_output/system_analysis.txt"), true));
        if (first_line) {
            bw = new BufferedWriter(new FileWriter(new File(Settings.getValue("kbp_sentiment_path") + "/system_output/system_analysis.txt")));
        }
        booleanInfos.set(0, false);
        boolean add_q_info = booleanInfos.get(1);
        if (add_q_info) {
            add_q_info = false;
            booleanInfos.set(1, add_q_info);
            bw.newLine();
            bw.write("=========================================================================================================");
            bw.newLine();
            bw.write("Query ID: " + queryID);
            bw.newLine();
            bw.write("Query Name: " + name);
            bw.newLine();
            bw.write("Query direction: " + slot);
            bw.newLine();
        }
        if (ann_anw.size() > 0
                || calcData.x != null
                && calcData.x.length() > 0) {
            bw.newLine();
            bw.write("---------------------------------------------------------------------------------------------------------");
            bw.newLine();
            bw.write(currLine);
        }
        bw.newLine();
        if (anwCalcData != null
                && anwCalcData.x != null
                && anwCalcData.x.length() > 0) {
            boolean printed = false;
            for (int i = 0; i < ann_anw.size(); i++) {
                String awnPhrase = (String) ann_anw.get(i).getEntity().keyWord;
                System.out.println("anwPhrase: " + awnPhrase);
                if (anwCalcData.oriX.contentEquals(awnPhrase.replaceAll("[\\s]+", " ").trim())
                        || anwCalcData.x.contentEquals(awnPhrase.replaceAll("[\\s]+", " ").trim())
                        || anwCalcData.x.contains(awnPhrase.replaceAll("[\\s]+", " ").trim())
                        || anwCalcData.oriX.contains(awnPhrase.replaceAll("[\\s]+", " ").trim())) {
                    System.out.println("Found a good anwser: " + awnPhrase);
                    if (!printed) {
                        bw.write("####\nFound a good anwser: " + awnPhrase);
                        bw.newLine();
                        String rel = clearEndingNumbers(anwCalcData.relation);
                        bw.write("relation: " + rel);
                        Integer count = correct.get(rel);
                        if (count == null) {
                            count = 0;
                        }
                        count++;
                        correct.put(rel, count);
                        bw.newLine();
                        bw.write("relation sentiment: " + anwCalcData.sentiment);
                        bw.newLine();
                    }
                    Path path = (Path) ann_path.get(i);
                    if (path != null) {
                        bw.write("annotted path: " + path.toString() + "\n");
                        bw.write("annotated relation: \n");
                        double max_sentiment = 0;
                        String max_word = null;
                        double min_sentiment = 100;
                        String min_word = null;
                        for (int ii = 0; ii < path.size() - 1; ii++) {
                            Node s_node = path.get(ii);
                            int jj = ii + 1;
                            Node e_node = path.get(jj);
                            String bf = this.getBaseForm(s_node.getName(), wordnet, s_node.getPos());
                            double senti = openANEWDatabase.wordSentimentOf(bf);
                            if (senti != -1 && senti > max_sentiment) {
                                max_sentiment = senti;
                                max_word = bf;
                            }
                            if (senti != -1 && senti < min_sentiment) {
                                min_sentiment = senti;
                                min_word = bf;
                            }
                            if (ii == path.size() - 2) {
                                //last loop process e_node
                                bf = this.getBaseForm(e_node.getName(), wordnet, e_node.getPos());
                                senti = openANEWDatabase.wordSentimentOf(bf);
                                if (senti != -1 && senti > max_sentiment) {
                                    max_sentiment = senti;
                                    max_word = bf;
                                }
                                if (senti != -1 && senti < min_sentiment) {
                                    min_sentiment = senti;
                                    min_word = bf;
                                }

                            }
                            if (ii != 0) {
                                Integer count = correct_path.get(s_node.getName());
                                if (count == null) {
                                    count = 0;
                                }
                                count++;
                                correct_path.put(s_node.getName(), count);
                            }
                            bw.write(sent_graph.getRelation(s_node, e_node) + ", ");
                        }
                        bw.newLine();
                        if (max_word != null) {
                            bw.write("max sentiment (" + max_word + "): " + max_sentiment);
                        } else {
                            bw.write("min sentiment (): N/A");
                        }
                        bw.newLine();
                        if (min_word != null) {
                            bw.write("min sentiment (" + min_word + "): " + min_sentiment);
                        } else {
                            bw.write("min sentiment (): N/A");
                        }
                        bw.newLine();
                    } else {
                        System.out.println("annotated answer path is null!!!!");
                    }
                    ann_anw.remove(i);
                    ann_path.remove(i);
                    i--;
                    printed = true;
                }

            }
            if (!printed) {
                System.out.println("Found a wrong anwser!");
                System.out.println("anwCalcData.x is: " + anwCalcData.x);
                String rel = clearEndingNumbers(anwCalcData.relation);
                System.out.println("anwCalcData.x relation: " + rel);
                System.out.println("anwCalcData.query is: " + anwCalcData.oriQuery);
                bw.write("%%%%\nFound a wrong anwser!\n");
                bw.write("anwCalcData.x is: " + anwCalcData.x + "\n");
                bw.write("anwCalcData.x relation: " + rel + "\n");
                bw.write("anwCalcData.x sentiment: " + anwCalcData.sentiment + "\n");
                bw.write("anwCalcData.query is: " + anwCalcData.oriQuery + "\n");
                Integer count = wrong.get(rel);
                if (count == null) {
                    count = 0;
                }
                count++;
                wrong.put(rel, count);
            }
        }
        for (int i = 0; ann_anw != null && i < ann_anw.size(); i++) {
            String awnPhrase = (String) ann_anw.get(i).getEntity().keyWord;
            Path path = (Path) ann_path.get(i);
            if (path == null) {
                path = new Path();
            }
            System.out.println("Missed a good anwser!");
            System.out.println("answer: " + awnPhrase);
            System.out.println("annotted path: " + path.toString());
            System.out.print("annotated relation: ");
            bw.write("$$$$\nMissed a good anwser!\n");
            bw.write("answer: " + awnPhrase + "\n");
            bw.write("annotted path: " + path.toString() + "\n");
            bw.write("annotated relation: \n");
            double max_sentiment = 0;
            String max_word = null;
            double min_sentiment = 100;
            String min_word = null;
            for (int ii = 0; ii < path.size() - 1; ii++) {
                Node s_node = path.get(ii);
                int jj = ii + 1;
                Node e_node = path.get(jj);
                String bf = this.getBaseForm(s_node.getName(), wordnet, s_node.getPos());
                double senti = openANEWDatabase.wordSentimentOf(bf);
                if (senti != -1 && senti > max_sentiment) {
                    max_sentiment = senti;
                    max_word = bf;
                }
                if (senti != -1 && senti < min_sentiment) {
                    min_sentiment = senti;
                    min_word = bf;
                }
                if (ii == path.size() - 2) {
                    //last loop process e_node
                    bf = this.getBaseForm(e_node.getName(), wordnet, e_node.getPos());
                    senti = openANEWDatabase.wordSentimentOf(bf);
                    if (senti != -1.0 && senti > max_sentiment) {
                        max_sentiment = senti;
                        max_word = bf;
                    }
                    if (senti != -1.0 && senti < min_sentiment) {
                        min_sentiment = senti;
                        min_word = bf;
                    }

                }
                if (ii != 0) {
                    Integer count = missed.get(s_node.getName());
                    if (count == null) {
                        count = 0;
                    }
                    count++;
                    missed.put(s_node.getName(), count);
                }
                System.out.print(sent_graph.getRelation(s_node, e_node) + ", ");
                bw.write(sent_graph.getRelation(s_node, e_node) + ", ");
            }
            bw.newLine();
            if (max_word != null) {
                bw.write("max sentiment (" + max_word + "): " + max_sentiment);
            } else {
                bw.write("max sentiment (): N/A");
            }
            bw.newLine();
            if (min_word != null) {
                bw.write("min sentiment (" + min_word + "): " + min_sentiment);
            } else {
                bw.write("min sentiment (): N/A");
            }
            System.out.println();
            bw.newLine();
        }
        bw.flush();
        bw.close();

    }

    public void collectAnnInfo(Path path, Graph sent_graph, HashMap<String, Integer> q_relation_types, HashMap<String, Integer> a_relation_types, HashMap<String, Integer> sub_objs, HashMap<String, ArrayList> q_a_pairs) {
        System.out.println("annotted path: " + path.toString());
        System.out.print("annotated relation: ");
        boolean contains_s = false;
        boolean contains_o = false;
        String q_relation = null;
        String a_relation = null;
        for (int ii = 0; ii < path.size() - 1; ii++) {
            Node s_node = path.get(ii);
            int jj = ii + 1;
            Node e_node = path.get(jj);
            String relation = sent_graph.getRelation(s_node, e_node);

            if (ii == 0) {
                Integer cc = q_relation_types.get(relation);
                q_relation = relation;
                if (cc == null) {
                    cc = 0;
                }
                cc++;
                q_relation_types.put(relation, cc);
                if (relation.contains("subj")) {
                    contains_s = true;
                }
            }
            if (ii == path.size() - 2) {
                Integer cc = a_relation_types.get(relation);
                a_relation = relation;
                if (cc == null) {
                    cc = 0;
                }
                if (relation.contains("obj")) {
                    contains_o = true;
                }
                cc++;
                a_relation_types.put(relation, cc);
            }

            System.out.print(relation + ", ");
        }
        if (contains_s && contains_o) {
            Integer cc = sub_objs.get("bot_s_o");
            ArrayList sents = q_a_pairs.get("bot_s_o");
            if (cc == null) {
                cc = 0;
                sents = new ArrayList();
                q_a_pairs.put("bot_s_o", sents);
            }
            String sent = sent_graph.getSentence() + "\nquery: " + path.get(0).getEntity().keyWord + "\nanswer: " + path.get(path.size() - 1).getEntity().keyWord;
            sents.add(sent);
            cc++;
            sub_objs.put("bot_s_o", cc);
        }
        Integer cc = sub_objs.get("all");
        if (cc == null) {
            cc = 0;
        }
        cc++;
        sub_objs.put("all", cc);
        cc = sub_objs.get(q_relation + "_" + a_relation);
        ArrayList sents = q_a_pairs.get(q_relation + "_" + a_relation);
        String sent = sent_graph.getSentence() + "\nquery: " + path.get(0).getEntity().keyWord + "\nanswer: " + path.get(path.size() - 1).getEntity().keyWord;
        if (cc == null) {
            cc = 0;
            sents = new ArrayList();
            q_a_pairs.put(q_relation + "_" + a_relation, sents);
        }
        sents.add(sent);
        cc++;
        sub_objs.put(q_relation + "_" + a_relation, cc);
        System.out.println();
    }

    public ArrayList<ArrayList<Node>> getPaths(ArrayList<Node> q_heads, Graph sent_graph) {
        ArrayList<Node> nodes = sent_graph.getSortedNodes();
        ArrayList<ArrayList<Node>> paths = new ArrayList();
        ArrayList shortest = null;
        for (Node node : nodes) {
            if (node.getEntity() != null && !q_heads.contains(node)) {
                System.out.println("find an entity: " + node.getName());
                System.out.println("find an entity: " + node.getEntity());

                shortest = null;
                for (Node q_head : q_heads) {
                    if (q_head == null) {
                        continue;
                    }
                    System.out.println("query_head: " + q_head);
                    System.out.println("query_term: " + q_head.getEntity().getFullExpression());
                    if (q_head.getEntity().getFullExpression().equals(node.getEntity().getFullExpression())) {
                        //			System.out.println("found a query node: " + node.getName());
                        node.setIsQuery(true);
                        q_heads.add(node);
                        break;
                    }
                    List list = sent_graph.shortestPathV2(q_head, node);
                    if (list == null) {
                        continue;
                    }
                    ArrayList<Node> path = new ArrayList(list);
                    //                    System.out.println("generate path: " + path);
                    if (shortest == null) {
                        shortest = path;
                    } else {
                        if (path != null && path.size() < shortest.size()) {
                            shortest = path;
                        }
                    }
                }
                if (shortest != null) {
                    paths.add(shortest);
                }
            }
        }
        return paths;
    }

    public String getPOS(String pos) {
        String back_pos = null;
        if (pos == null) {
            return null;
        } else if (pos.startsWith("N")) {
            return "noun";
        } else if (pos.startsWith("V")) {
            return "verb";
        } else if (pos.startsWith("JJ")) {
            return "adjective";
        }
        return null;
    }

    public double calSentiment(String word) {
        String bf = this.getBaseForm(word, wordnet, null);
        if (bf == null) {
            bf = word;
        }
        System.out.println("bf in calSEntiment: " + bf);
        double senti = openANEWDatabase.wordSentimentOf(bf);
        return senti;
    }

    public String getQueryID(File child) {
//        String queryID = child.getName().substring(child.getName().indexOf("Cubism_Sentiment"), child.getName().indexOf(".txt")); //for population
//        String queryID = child.getName().substring(child.getName().indexOf("Cubism_Sentiment") + 1, child.getName().indexOf(".txt"));
        String queryID = child.getName().substring(child.getName().indexOf(".txt") - 13, child.getName().indexOf(".txt"));
        System.out.println("queryID: " + queryID);
        return queryID;
    }

    public String getName(ArrayList<QueryInput> queryArrayList, String queryID) {
        String name = "";
        for (int i = 0; i < queryArrayList.size(); i++) {
            if (queryArrayList.get(i).queryid.equals(queryID)) {
                name = queryArrayList.get(i).name;
                return name;
            }
        }
        return name;
    }

    public String getSlot(ArrayList<QueryInput> queryArrayList, String queryID) {
        String slot = "";
        for (int i = 0; i < queryArrayList.size(); i++) {
            if (queryArrayList.get(i).queryid.equals(queryID)) {
                slot = queryArrayList.get(i).slot;
                return slot;
            }
        }
        return slot;
    }

    public String getDocID(ArrayList<QueryInput> queryArrayList, String queryID) {
        String docID = "";
        for (int i = 0; i < queryArrayList.size(); i++) {
            if (queryArrayList.get(i).queryid.equals(queryID)) {
                docID = queryArrayList.get(i).docid;
                return docID;
            }
        }
        return docID;
    }

    public String getDocAssID(ArrayList<QueryInput> queryArrayList, String queryID) {
        String docAssID = "";
        for (int i = 0; i < queryArrayList.size(); i++) {
            if (queryArrayList.get(i).queryid.equals(queryID)) {
                docAssID = queryArrayList.get(i).docid;
                return docAssID;
            }
        }
        return docAssID;
    }

    public String getType(ArrayList<QueryInput> queryArrayList, String queryID) {
        String type = "";
        for (int i = 0; i < queryArrayList.size(); i++) {
            if (queryArrayList.get(i).queryid.equals(queryID)) {
                type = queryArrayList.get(i).enttype;
                return type;
            }
        }
        return type;
    }

    public String getAnswer(ArrayList<QueryInput> queryArrayList, String queryID) {
        String answer = "";
        for (int i = 0; i < queryArrayList.size(); i++) {
            if (queryArrayList.get(i).queryid.equals(queryID)) {
                answer = queryArrayList.get(i).answer;
                return answer;
            }
        }
        return answer;
    }

    public String getAnswerText(ArrayList<QueryInput> queryArrayList, String queryID) {
        String answerText = "";
        for (int i = 0; i < queryArrayList.size(); i++) {
            if (queryArrayList.get(i).queryid.equals(queryID)) {
                answerText = queryArrayList.get(i).answerText;
                return answerText;
            }
        }
        return answerText;
    }

    /**
     * return assessed answer offsets
     */
    private HashMap<String, HashMap> getAnswerOffsets(ArrayList<QueryInput> queryArrayList, String queryID) {
        for (QueryInput qi : queryArrayList) {
            if (qi.queryid.equals(queryID)) {
                return qi.getAwOffsets();
            }
        }
        return null;
    }

    /**
     * return original document
     */
    private String getOriginalDoc(ArrayList<QueryInput> queryArrayList, String queryID) {
        for (QueryInput qi : queryArrayList) {
            if (qi.queryid.equals(queryID)) {
                return qi.docText;
            }
        }
        return null;
    }

    /**
     * return utterances of the doc
     *
     * @param queryArrayList
     * @param queryID
     * @return
     */
    private ArrayList getUtterances(ArrayList<QueryInput> queryArrayList, String queryID) {
        for (QueryInput qi : queryArrayList) {
            if (qi.queryid.equals(queryID)) {
                return qi.utts;
            }
        }
        return null;
    }

    public String removeBrackets(String typedDepend) {
        StringBuilder noBrackets = new StringBuilder(typedDepend);
        noBrackets.deleteCharAt(noBrackets.indexOf("[", 0));
        noBrackets.deleteCharAt(noBrackets.lastIndexOf("]"));
        typedDepend = noBrackets.toString();
        return typedDepend;
    }

    public ArrayList<SentenceInfo> splitDepend(String typedDepend) {

        int start = 0;
        boolean inParen = false;
        ArrayList<SentenceInfo> dependArrray = new ArrayList();

        // Seperate the individual dependencies and put them into an array list
        for (int i = 0; i < typedDepend.length(); i++) {
            char c = typedDepend.charAt(i);
            if (c == '(') {
                inParen = true;
            }
            if (c == ')' && inParen == true) {
                inParen = false;
                dependArrray.add(createSentenceNode(typedDepend.substring(start, i + 1).trim(), -1));
                start = i + 3;
            }
        }
        return dependArrray;
    }

    public int findStartingName(ArrayList<SentenceInfo> dependArray, String name, CalculusInfo calcData, String type, String slot) {

        // Ignore cases where the name is only 1 character
        if (name.length() < 2) {
            return -1;
        }

        String pairedItemOne = "";                          // The paired item within the dependencies
        String pairedItemTwo = "";                          // The paired item within the dependencies
        String tempRel = "";                                // temporary relation for the posessive case
        String nameSplit[] = name.split(" ");               // A String array that holds parts of the name split form spaces
        String nounCompound = "";                           // The compounded noun version of the potential subject found

        ArrayList<String> namePieces = new ArrayList();     // An arrayList that will store the vital peices of the name

        // Delete words like "of", "the"
        for (int i = 0; i < nameSplit.length; i++) {
            if (!nameSplit[i].trim().toLowerCase().contentEquals("of") || !nameSplit[i].trim().toLowerCase().contentEquals("and")
                    || !nameSplit[i].trim().toLowerCase().contentEquals("the") || !nameSplit[i].trim().toLowerCase().contentEquals("for")) {
                namePieces.add(nameSplit[i]);
            }
        }

        // If we are looking at the towards case
        if (slot.contains("towards")) {

            // For every dependecy, find the subject.  If that subject is the Name we are looking for, then we should most likely use it
            for (int j = 0; j < dependArray.size(); j++) {
//                System.out.println("dependency: " + dependArray.get(j).soloDepend);
                if (dependArray.get(j).soloDepend.startsWith("nsubj(") || dependArray.get(j).soloDepend.startsWith("nsubjpass(")) {

                    // Split the node peice by spaces
                    pairedItemTwo = easyPairedItem(dependArray.get(j).soloDepend, 2);
                    pairedItemOne = easyPairedItem(dependArray.get(j).soloDepend, 1);

                    for (String namePiece : namePieces) {
//                        System.out.println("LOOKING AT NAMEPIECE:\t" + namePiece);
                        nounCompound = nounCompoundModifier(dependArray, clearEndingNumbers(pairedItemTwo));

                        if ((pairedItemTwo.toLowerCase().contains(namePiece.toLowerCase()))) {
                            calcData.target = pairedItemTwo;
                            calcData.oriQuery = name;
                            calcData.relation = pairedItemOne;
                            return j;
                        }
                    }
                }
            }
        }

        // If we are looking at the towards case
        if (slot.contains("from")) {

            // For every dependecy, find the subject.  If that subject is the Name we are looking for, then we should most likely use it
            for (int j = 0; j < dependArray.size(); j++) {
                if (dependArray.get(j).soloDepend.startsWith("dobj(") || dependArray.get(j).soloDepend.startsWith("pobj(") || dependArray.get(j).soloDepend.startsWith("iobj(")) {

                    // Split the node peice by spaces
                    pairedItemTwo = easyPairedItem(dependArray.get(j).soloDepend, 2);
                    pairedItemOne = easyPairedItem(dependArray.get(j).soloDepend, 1);

                    for (String namePiece : namePieces) {
                        nounCompound = nounCompoundModifier(dependArray, clearEndingNumbers(pairedItemTwo));
                        if ((pairedItemTwo.toLowerCase().contains(namePiece.toLowerCase()))) {
                            calcData.target = pairedItemTwo;
                            calcData.oriQuery = name;
                            calcData.firstRelation = pairedItemOne;
//                            System.out.println("First Relation:\t" + calcData.firstRelation);
                            return j;
                        }
                    }
                }
            }

            // If we still didnt' find a target during the from case, see if the query name is posessing something instead of simply being a subject
            if (!pairedItemTwo.contentEquals("")) {
                for (String namePiece : namePieces) {
                    for (int j = 0; j < dependArray.size(); j++) {
                        if (dependArray.get(j).soloDepend.startsWith("poss(") && dependArray.get(j).soloDepend.toLowerCase().contains(namePiece.toLowerCase())) {
                            calcData.target = easyPairedItem(dependArray.get(j).soloDepend, 2);
                            calcData.oriQuery = name;
                            calcData.relation = easyPairedItem(dependArray.get(j).soloDepend, 1);
//                            System.out.println("NEW TARGET 2:\t" + calcData.target);
                            return j;
                        }
                    }
                }
            }
            // As a last resort, just look for the name within the sentence and find that location. We do not care about whether it is a subj or an
            // obj at this point anymore
            if (slot.contains("third")) {
                // For every dependecy, find the subject.  If that subject is the Name we are looking for, then we should most likely use it
                for (int j = 0; j < dependArray.size(); j++) {
//                    System.out.println(dependArray.get(j).soloDepend);

                    // Split the node peice by spaces
                    pairedItemTwo = easyPairedItem(dependArray.get(j).soloDepend, 2);
                    pairedItemOne = easyPairedItem(dependArray.get(j).soloDepend, 1);

                    for (String namePiece : namePieces) {
                        nounCompound = nounCompoundModifier(dependArray, clearEndingNumbers(pairedItemTwo));
                        if (pairedItemTwo.toLowerCase().contains(namePiece.toLowerCase())/* || nounCompound.contains(namePiece.toLowerCase())*/) {
                            calcData.target = pairedItemTwo;
                            calcData.oriQuery = name;
                            calcData.firstRelation = pairedItemOne;
                            return j;
                        }
                    }
                }
            }
        }
        return -1;
    }

    public void findObjectTowards(int currLocation, ArrayList<SentenceInfo> dependArrayList, String keyString, CalculusInfo calcData, String typedTree, String docAssID,
            HashMap<String, String> docsFullHash, ArrayList<String> exemptWords) throws InterruptedException, IOException, ParserConfigurationException, SQLException {

        String tempObj = "";            // A string to hold the string that may turn out to be the object
        String annoteObj = "";          // The annotated version of the object
        String tempRel = "";            // A possible relation update
        String pathName = "";           // The pathname of the document
        String tempItem;        // Original piece of depend array
        String possTemp;        // Temp object for the poss case
        boolean findPath = true;        // A trigger to remind us if we have already found the path of the file

//        System.out.println(" From the starting location determined from before,  look for an object");
//        System.out.println("Once an object is found, save the object and what it's an object to");
//        System.out.println("use the file's docID in order to find the pathname in our directory for its annotation file");
//        System.out.println("use the pathname to then see if there is an annotation for the object we found");
//        System.out.println("If there is, then set the object value to the annoated value we found");
//        System.out.println("If there isn't, then look for nounphrases attached to the found object and see if we can complete it fuller");
        while (currLocation < dependArrayList.size()) {

            //  System.out.println(dependArrayList.get(currLocation).soloDepend);
            //  System.out.println(dependArrayList.get(currLocation).soloDepend);
            if (dependArrayList.get(currLocation).soloDepend.startsWith("dobj(") || dependArrayList.get(currLocation).soloDepend.startsWith("pobj(") || dependArrayList.get(currLocation).soloDepend.startsWith("iobj(")) {

                tempObj = easyPairedItem(dependArrayList.get(currLocation).soloDepend, 2);
                tempRel = easyPairedItem(dependArrayList.get(currLocation).soloDepend, 1);
                tempItem = tempObj;

                // the temporary object by adding nouns.
                tempObj = nounCompoundModifier(dependArrayList, tempObj);
                // Find the pathname of this speciic document
                if (findPath) {
                    pathName = new ForumMultiThreadSync().createThreads(docAssID);
                    calcData.pathName = pathName;
                    findPath = false;
                }

                // See if there is an annotation for the currently loaded temporary object.  If so, set calcData.x has it, else, see if we can modify
                // the temporary object by adding nouns.
                if (pathName.substring(pathName.lastIndexOf("/"), pathName.length()).contains(".xml")) {
                    pathName = Settings.getValue("kbp_data_path") + "/2014evaluation/batchForum" + pathName.substring(pathName.lastIndexOf("/"), pathName.length());
                } else {
                    pathName = Settings.getValue("kbp_data_path") + "/2014evaluation/batchForum" + pathName.substring(pathName.lastIndexOf("/"), pathName.length()) + ".xml";
                }
                annoteObj = newswireFA.initialize(pathName, docAssID, clearEndingNumbers(tempObj), docsFullHash, calcData.startOffset, calcData.endOffset, calcData.foundLine);

                if (annoteObj.contentEquals("")) {
                    //   tempObj = nounCompoundModifier(dependArrayList, tempObj);
                    //comment out by TL 03/18/15
//                    ArrayList<String> namePieces = new ArrayList(); // An arrayList that will store the vital peices of the name
//                    String nameSplit[] = tempObj.split(" ");   // A String array that holds parts of the name split form spaces
//
//                    // Delete words like "of" "the"
//                    for (int i = 0; i < nameSplit.length; i++) {
//                        if (nameSplit[i].trim().toLowerCase().contentEquals("of") || nameSplit[i].trim().toLowerCase().contentEquals("and")
//                                || nameSplit[i].trim().toLowerCase().contentEquals("the") || nameSplit[i].trim().toLowerCase().contentEquals("for")) {
//                        } else {
//                            namePieces.add(nameSplit[i]);
//                        }
//                    }
//
//                    for (int j = 0; j < namePieces.size(); j++) {
//                        if ((Character.isUpperCase(tempObj.charAt(0)) || Character.isUpperCase(namePieces.get(j).charAt(0))) && !exemptWords.contains(clearEndingNumbers(namePieces.get(j).toLowerCase()))) {
//                            calcData.x = tempObj;
//                            calcData.oriX = calcData.x;
//                            return;
//                        } else {
//                            possTemp = possLinkNamedEntity(dependArrayList, tempItem);
//                            if (!tempItem.contentEquals(possTemp)) {
//                                calcData.x = possTemp;
//                                calcData.oriX = calcData.x;
//                            }
//                        }
//                    }
//
                    //done comment
                } else {
                    if (!exemptWords.contains(annoteObj.toLowerCase())) {
                        calcData.x = annoteObj;
                        calcData.oriX = tempObj;
                        System.out.println("find obj: " + calcData.x);
                        return;
                    }
                }
            }
            currLocation++;
        }
    }

    public void findSubjectFrom(int currLocation, ArrayList<SentenceInfo> dependArrayList, String keyString, CalculusInfo calcData, String typedTree, String docAssID,
            HashMap<String, String> docsFullHash, ArrayList<String> exemptWords) throws InterruptedException, IOException, ParserConfigurationException {

        String tempSubj = "";           // A string to hold the string that may turn out to be the object
        String tempRel = "";            // Holds the string that is connected to the temporary subj
        String annoteSubj = "";         // The annotated version of the object
        String pathName = "";           // The pathname of the document
        boolean findPath = true;        // A trigger to remind us if we have already found the path of the file

//        System.out.println("Parse through the dependencies from the starting location where we found the query topic variation");
//        System.out.println("I'm looking for a dependency that starts with nsubj( or nsubjpass; the subjects of the sentence");
//        System.out.println("If I find a subject, get the file pathname thorugh the use of the document ID and look through the annotation files"
//                + "to see if there is an annotation for that subject\n"
//                + "If there is an annotation for that subject, then use that as the x variable, if not, then see if there are any nounphrases"
//                + "attached to the word and then collect those and attach them to one another and set the x variable as that");
//        System.out.println("I then find the related word to the found subject and then set the relation for the sentence as the related word");
//        System.out.println("If the x variable we found is actually a date name like Tuesday or the word I, or He, then we ignore it and look for"
//                + "a new subject");
        while (currLocation >= 0) {

            //      System.out.println(dependArrayList.get(currLocation).soloDepend);
            if (dependArrayList.get(currLocation).soloDepend.startsWith("nsubj(") || dependArrayList.get(currLocation).soloDepend.startsWith("nsubjpass(")) {

                tempSubj = easyPairedItem(dependArrayList.get(currLocation).soloDepend, 2);
                tempRel = easyPairedItem(dependArrayList.get(currLocation).soloDepend, 1);

                // Find the pathname of this speciic document
                if (findPath) {
                    pathName = new ForumMultiThreadSync().createThreads(docAssID);
                    calcData.pathName = pathName;
                    findPath = false;
                }

                // See if there is an annotation for the currently loaded temporary object.  If so, set calcData.x has it, else, see if we can modify
                // the temporary object by adding nouns.
                if (docsFullHash.containsKey(docAssID)) {
                    if (pathName.substring(pathName.lastIndexOf("/"), pathName.length()).contains(".xml")) {
                        pathName = Settings.getValue("kbp_data_path") + "/2014evaluation/batchForum" + pathName.substring(pathName.lastIndexOf("/"), pathName.length());
                    } else {
                        pathName = Settings.getValue("kbp_data_path") + "/2014evaluation/batchForum" + pathName.substring(pathName.lastIndexOf("/"), pathName.length()) + ".xml";
                    }
                    annoteSubj = newswireFA.initialize(pathName, docAssID, clearEndingNumbers(tempSubj), docsFullHash, calcData.startOffset, calcData.endOffset, calcData.foundLine);
                }
                if (annoteSubj.contentEquals("")) {
                    //comment out by TL because it's not entity 03/18/15
//                    tempSubj = nounCompoundModifier(dependArrayList, tempSubj);
//                    if (Character.isUpperCase(tempSubj.charAt(0)) && !exemptWords.contains(clearEndingNumbers(tempSubj.toLowerCase()))) {
//                        calcData.x = tempSubj;
//                        calcData.relation = tempRel;
//                        calcData.oriX = calcData.x;
//                        return;
//                    }
                    //done comment
                } else {
                    if (!exemptWords.contains(clearEndingNumbers(annoteSubj.toLowerCase()))) {
                        calcData.x = annoteSubj;
                        calcData.relation = tempRel;
                        calcData.oriX = tempSubj;
                        System.out.println("find subj: " + calcData.x);
                        return;
                    }
                }
            }
            currLocation--;
        }
    }

    // Used only if the answer is a preposition
    public void checkForSays(ArrayList<SentenceInfo> dependArrayList, CalculusInfo calcData) {

        boolean present = false;
        String pairedItem = "";

        // Go through the dependency list and see if something like "Said" is part of the sentence
        for (int j = 0; j < dependArrayList.size(); j++) {

            // Find the item paired with ROOT and then find it's subject, then reset the counter to trace through the dependencies
            if (present == false && dependArrayList.get(j).soloDepend.startsWith("root")
                    && dependArrayList.get(j).soloDepend.contains("ROOT-0")) {
                pairedItem = easyPairedItem(dependArrayList.get(j).soloDepend, 2);
                if (pairedItem.toLowerCase().contains("said") || pairedItem.toLowerCase().contains("says")) {
                    present = true;
                }
            }

//            System.out.println("dependArrayList.get(j).soloDepend: " + dependArrayList.get(j).soloDepend);
            // Replace the old X value with the new X value if it is  
            if (present == true && (dependArrayList.get(j).soloDepend.startsWith("nsubj") || dependArrayList.get(j).soloDepend.startsWith("nsubjpass("))
                    && dependArrayList.get(j).soloDepend.contains(pairedItem)) {
                calcData.x = easyPairedItem(dependArrayList.get(j).soloDepend, 2);
                calcData.oriX = calcData.x;
            }
        }
    }

    private void revampSays(ArrayList<SentenceInfo> dependArray, CalculusInfo calcData, String docAssID, HashMap<String, String> docsFullHash,
            ArrayList<String> exemptWords) throws InterruptedException, IOException, ParserConfigurationException {
        String newObj;
        String newRel = "";
        String tempObj;
        boolean lookForObj = false;

        for (int x = 0; x < dependArray.size(); x++) {
            System.out.println("dependArrayList.get(j).soloDepend: " + dependArray.get(x).soloDepend);
            // Look for the first subject that isn't related to said
            if (!lookForObj && (dependArray.get(x).soloDepend.startsWith("nsubj(") || dependArray.get(x).soloDepend.startsWith("nsubjpass(") || dependArray.get(x).soloDepend.startsWith("isubj("))) {
                tempObj = easyPairedItem(dependArray.get(x).soloDepend, 2);
                if (Character.isUpperCase(tempObj.charAt(0)) && !exemptWords.contains(clearEndingNumbers(tempObj.toLowerCase()))) {
                    if (!tempObj.contentEquals(calcData.target)) {
                        if (clearEndingNumbers(tempObj).toLowerCase().contentEquals("i") || clearEndingNumbers(tempObj).toLowerCase().contentEquals("we")) {
                            newRel = easyPairedItem(dependArray.get(x).soloDepend, 1);
                            lookForObj = true;
                            System.out.println("find I/we (revampSays): " + newRel);
                            x++;
                        } else {

                            // Set the pathname if it hasn't been already found through the finding subj and obj functions
                            if (calcData.pathName.contentEquals("")) {
                                calcData.pathName = new ForumMultiThreadSync().createThreads(docAssID);
                            }

                            calcData.x = tempObj;
                            calcData.oriX = calcData.x;
                            calcData.relation = easyPairedItem(dependArray.get(x).soloDepend, 1);
                            System.out.println("in the else of revamp");
                            System.out.println("calcData.x: " + calcData.x);
                            System.out.println("calcData.relation: " + calcData.relation);
                            return;
                        }
                    } else {
//                        newRel = easyPairedItem(dependArray.get(x).soloDepend, 1);
//                        lookForObj = true;
//                        System.out.println("find query (revampSays): " + newRel);
//                        x++;
                    }
                } else {
                    String annoteSubj = "";
                    if (docsFullHash.containsKey(docAssID)) {
                        calcData.pathName = new ForumMultiThreadSync().createThreads(docAssID);
                        System.out.println("pathName: " + calcData.pathName);
                        System.out.println("tempObj: " + tempObj);
                        if (calcData.pathName.substring(calcData.pathName.lastIndexOf("/"), calcData.pathName.length()).contains(".xml")) {
                            calcData.pathName = Settings.getValue("kbp_data_path") + "/2014evaluation/batchForum" + calcData.pathName.substring(calcData.pathName.lastIndexOf("/"), calcData.pathName.length());
                        } else {
                            calcData.pathName = Settings.getValue("kbp_data_path") + "/2014evaluation/batchForum" + calcData.pathName.substring(calcData.pathName.lastIndexOf("/"), calcData.pathName.length()) + ".xml";
                        }
                        annoteSubj = newswireFA.initialize(calcData.pathName, docAssID, clearEndingNumbers(tempObj), docsFullHash, calcData.startOffset, calcData.endOffset, calcData.foundLine);
                    }
                    System.out.println("annoteSubj (revampSays): " + annoteSubj);
                    System.out.println("calcData target is: " + calcData.target);
                    if (calcData.pathName.substring(calcData.pathName.lastIndexOf("/"), calcData.pathName.length()).contains(".xml")) {
                        calcData.pathName = Settings.getValue("kbp_data_path") + "/2014evaluation/batchForum" + calcData.pathName.substring(calcData.pathName.lastIndexOf("/"), calcData.pathName.length());
                    } else {
                        calcData.pathName = Settings.getValue("kbp_data_path") + "/2014evaluation/batchForum" + calcData.pathName.substring(calcData.pathName.lastIndexOf("/"), calcData.pathName.length()) + ".xml";
                    }
                    String annoteQuery = newswireFA.initialize(calcData.pathName, docAssID, clearEndingNumbers(calcData.target), docsFullHash, calcData.startOffset, calcData.endOffset, calcData.foundLine);
                    System.out.println("calcData annoted target is: " + annoteQuery);
                    if (annoteSubj.contentEquals(clearEndingNumbers(calcData.target))
                            || annoteSubj.contentEquals(annoteQuery)) {
                        newRel = easyPairedItem(dependArray.get(x).soloDepend, 1);
                        lookForObj = true;
                        System.out.println("find query pronoun (revampSays): " + newRel);
                        x++;
                    }
                }
            }
            if (x < dependArray.size() && (lookForObj && (dependArray.get(x).soloDepend.startsWith("dobj(") || dependArray.get(x).soloDepend.startsWith("iobj(") || dependArray.get(x).soloDepend.startsWith("pobj(")))) {
                tempObj = easyPairedItem(dependArray.get(x).soloDepend, 2);
                System.out.println("LOOKFOR OBJ");
                if (!tempObj.contentEquals(calcData.target) && Character.isUpperCase(tempObj.charAt(0)) && !exemptWords.contains(clearEndingNumbers(tempObj.toLowerCase()))) {

                    // Set the pathname if it hasn't been already found through the finding subj and obj functions
                    if (calcData.pathName.contentEquals("")) {
                        calcData.pathName = new ForumMultiThreadSync().createThreads(docAssID);
                    }

                    System.out.println("NEW OBJECT:\t" + tempObj);
                    calcData.x = tempObj;
                    calcData.oriX = calcData.x;
                    calcData.relation = newRel;
                    System.out.println("In the main of revamp");
                    return;
                }
            }
        }
    }

    // If we have a relation as "has" then that is unacceptable and need to dig deeper for the true relation
    public void checkForHave(ArrayList<SentenceInfo> dependArrayList, CalculusInfo calcData, String slot) {

        boolean findKey = false;
        // Go through the dependency list and see if something like "has" is part of the sentence
        if (clearEndingNumbers(calcData.relation).toLowerCase().contentEquals("have") || clearEndingNumbers(calcData.relation).toLowerCase().contentEquals("has")) {
            String newRel = "";

            for (SentenceInfo dependArrayList1 : dependArrayList) {
                if (findKey == false && dependArrayList1.soloDepend.startsWith("advcl(") && dependArrayList1.soloDepend.contains(calcData.relation)) {
                    calcData.relation = easyPairedItem(dependArrayList1.soloDepend, 2);
                    System.out.println("~~checkForHave-1~~");
                    return;
                }
            }

            for (int j = 0; j < dependArrayList.size(); j++) {

                // Find the item paired with ROOT and then find it's subject, then reset the counter to trace through the dependencies
                if (findKey == false && (dependArrayList.get(j).soloDepend.startsWith("xcomp(") || dependArrayList.get(j).soloDepend.startsWith("ccomp(")) && dependArrayList.get(j).soloDepend.contains(calcData.relation)) {
                    newRel = easyPairedItem(dependArrayList.get(j).soloDepend, 2);
                    findKey = true;
                    j = 0;
                }
                if (findKey) {
                    if (slot.contains("towards")) {
                        if (dependArrayList.get(j).soloDepend.startsWith("dobj(") || dependArrayList.get(j).soloDepend.startsWith("pobj(") || dependArrayList.get(j).soloDepend.startsWith("iobj(")
                                && dependArrayList.get(j).soloDepend.contains(newRel)) {
                            System.out.println(calcData.relation + " -> " + newRel);
                            calcData.relation = newRel;
                            if (Character.isUpperCase(easyPairedItem(dependArrayList.get(j).soloDepend, 2).charAt(0))) {
                                calcData.x = easyPairedItem(dependArrayList.get(j).soloDepend, 2);
                                calcData.oriX = calcData.x;
                            }
                            System.out.println("~~checkForHave-2~~");
                            return;
                        }
                    } else {
                        if (dependArrayList.get(j).soloDepend.startsWith("nsubj(") || dependArrayList.get(j).soloDepend.startsWith("nsubjpass(")
                                && dependArrayList.get(j).soloDepend.contains(newRel)) {
                            System.out.println(calcData.relation + " -> " + newRel);
                            calcData.relation = newRel;
                            if (Character.isUpperCase(easyPairedItem(dependArrayList.get(j).soloDepend, 2).charAt(0))) {
                                calcData.x = easyPairedItem(dependArrayList.get(j).soloDepend, 2);
                                calcData.oriX = calcData.x;
                            }
                            System.out.println("~~checkForHave-2~~");
                            return;
                        }
                    }
                }
            }
        }
        return;
    }

    // Finds the word linked to says or tells or calls
    public void checkForExtension(ArrayList<SentenceInfo> dependArrayList, CalculusInfo calcData) {
        if (!calcData.relation.contentEquals("")) {
            for (SentenceInfo dependArrayList1 : dependArrayList) {
                if (dependArrayList1.soloDepend.startsWith("xcomp") && dependArrayList1.soloDepend.contains(calcData.relation)) {
                    if (dependArrayList1.soloDepend.contains("says") || dependArrayList1.soloDepend.contains("said") || dependArrayList1.soloDepend.contains("told")
                            || dependArrayList1.soloDepend.contains("tells") || dependArrayList1.soloDepend.contains("wrote")
                            || dependArrayList1.soloDepend.contains("written") || dependArrayList1.soloDepend.contains("calls")
                            || dependArrayList1.soloDepend.contains("called") || dependArrayList1.soloDepend.contains("saying")
                            || dependArrayList1.soloDepend.contains("added")) {
                    } else {
                        System.out.println("NEW RELATION:\t" + easyPairedItem(dependArrayList1.soloDepend, 2));
                        calcData.relation = easyPairedItem(dependArrayList1.soloDepend, 2);
                    }
                }
            }
        }
    }

    // Decides whether we are negating an answer or not
    public void checkForNegate(ArrayList<SentenceInfo> dependArrayList, CalculusInfo calcData) {
        if (!calcData.relation.contentEquals("")) {
            for (SentenceInfo dependArrayList1 : dependArrayList) {
                if (dependArrayList1.soloDepend.startsWith("neg") && dependArrayList1.soloDepend.contains(clearEndingNumbers(calcData.relation))) {
                    calcData.negate = true;
                    System.out.println("~~checkForNeg~~");
                    return;
                } else if (dependArrayList1.soloDepend.startsWith("amod")
                        && dependArrayList1.soloDepend.contains(clearEndingNumbers(calcData.relation))
                        && dependArrayList1.soloDepend.contains("less-")) {
                    //less risk
                    calcData.negate = true;
                    System.out.println("~~checkForNeg~~");
                    return;
                }
            }
        }
    }

    // Made to link answers that are actually prepositions to the real answer, ended up making the data WAY worse. Don't use it.
    public void linkPrep(ArrayList<SentenceInfo> dependArrayList, CalculusInfo calcData) {

        System.out.println("LINKPREP");
        String oldX = calcData.x;
        String newX = "";
        String linkPrep = "";
        boolean isPrep = false;
        if (!calcData.relation.contentEquals("")) {
            for (int j = 0; j < dependArrayList.size(); j++) {
                System.out.println(dependArrayList.get(j).soloDepend);
                if (isPrep == false && dependArrayList.get(j).soloDepend.startsWith("prep") && easyPairedItem(dependArrayList.get(j).soloDepend, 1).contains(oldX)) {
                    linkPrep = easyPairedItem(dependArrayList.get(j).soloDepend, 2);
                    isPrep = true;
                    System.out.println("->  linkPrep:\t" + linkPrep);
                }
                if (isPrep && dependArrayList.get(j).soloDepend.startsWith("pobj") && dependArrayList.get(j).soloDepend.contains(linkPrep)) {
                    calcData.x = easyPairedItem(dependArrayList.get(j).soloDepend, 2);
                    calcData.oriX = calcData.x;
                    System.out.println("->  calcData.x:\t" + oldX + "-> " + calcData.x);
                    calcData.relation = oldX;
                    System.out.println("->  relation:\t" + calcData.relation);
                    return;
                }
            }
        }
    }

    public void checkForJoined(ArrayList<SentenceInfo> dependArrayList, CalculusInfo calcData, String typedTree) {

        int startPoint = -1;
        String currWord = "";

        if (calcData.relation.toLowerCase().contains("joined")) {
            if (calcData.foundLine.toLowerCase().contains("joined in")) {
                for (int j = 0; j < dependArrayList.size(); j++) {
                    if (easyPairedItem(dependArrayList.get(j).soloDepend, 2).contains(calcData.relation)) {
                        startPoint = j;
                        j = dependArrayList.size();
                    }
                }

                while (startPoint + 1 < dependArrayList.size()) {
                    currWord = clearEndingNumbers(easyPairedItem(dependArrayList.get(startPoint).soloDepend, 2));
                    if (isVerb(currWord, typedTree)) {
                        calcData.relation = currWord;
                        System.out.println("~~checkForJoined~~");
                        return;
                    }
                    startPoint++;
                }
            }
        }
    }

    public String checkForPoss(ArrayList<SentenceInfo> dependArrayList, String x) {

        // Go through the dependency list and see if possession is present
        for (int j = 0; j < dependArrayList.size(); j++) {
            if (dependArrayList.get(j).soloDepend.startsWith("poss(") && dependArrayList.get(j).soloDepend.contains(x)) {
                return easyPairedItem(dependArrayList.get(j).soloDepend, 2);
            }
        }
        return x;
    }

    private String possLinkNamedEntity(ArrayList<SentenceInfo> dependArrayList, String x) {
        for (SentenceInfo dependArrayList1 : dependArrayList) {
            if (dependArrayList1.soloDepend.startsWith("poss(") && dependArrayList1.soloDepend.contains(x)) {
                if (Character.isUpperCase(easyPairedItem(dependArrayList1.soloDepend, 2).charAt(0))) {
                    return easyPairedItem(dependArrayList1.soloDepend, 2);
                }
            }
        }
        return x;
    }

    public String getBaseForm(String relation, Wordnet wordnet, String pos) {
        pos = this.getPOS(pos);
        System.out.println("POS: " + pos);
        if (pos != null) {
            String bf = wordnet.getBaseForm(clearEndingNumbers(relation), pos);
            if (bf == null) {
                bf = clearEndingNumbers(relation);
            }
            return bf;
        }
        String bf = wordnet.getBaseForm(clearEndingNumbers(relation), "adjective");
        if (bf == null) {
            bf = wordnet.getBaseForm(clearEndingNumbers(relation), "noun");
        }
        if (bf == null) {
            bf = wordnet.getBaseForm(clearEndingNumbers(relation), "verb");
        }
        if (bf == null) {
            bf = clearEndingNumbers(relation);
        }
        return bf;
    }

    public CalculusInfo addCalcData(OpenANEW openANEWDatabase, Wordnet wordnet, CalculusInfo calcData,
            String slot, String currLine, ArrayList<CalculusInfo> calcDataCollection, ArrayList<Integer> invalidCalcData,
            int sentenceCount, int annoteStart, int annoteEnd, String docAssID, ArrayList<Node> cands_nodes, String query_name, String speaker, ArrayList<Node> q_heads, ArrayList utts) throws SQLException {

        // Dont' do anything if any of the three main factors (relation, target, and x) are empty
        System.out.println("q_heads in addCalcData: " + q_heads);
        Graph sent_graph = calcData.sent_graph;

        //forum data
        ArrayList<String> added_x = new ArrayList();
        boolean foundone = false;
        boolean added = false;
        if (q_heads != null
                && q_heads.size() > 0) {
            for (Node q_head : q_heads) {
                Node ori_q_head = q_head;
                System.out.println("q_head: " + q_head);
                Node new_head = sent_graph.getHead(q_head);
                if (new_head != null) {
                    System.out.println("new_head: " + new_head);
                    q_head = new_head;
                }
                Node par = sent_graph.getParent(q_head);
                String relation = sent_graph.getRelation(par, q_head);
                if (relation == null) {
                    continue;
                }
                System.out.println("relation: " + relation);
                System.out.println("par: " + par.getName());
                if (relation.contains("subj")
                        || relation.contains("obj")
                        || relation.contains("nn") /* added by TL at 05/06/15*/
                        || relation.contains("amod") /* added by TL at 05/07/15*/) {
                    if (relation.equals("pobj")) {
                        //skip preposition, added by TL 05/11/15
                        par = sent_graph.getParent(par);
                    }
                    ArrayList parent1s = new ArrayList();
                    parent1s.add(par);
                    added = this.addToAnswer(sent_graph, q_head, parent1s, speaker, speaker, null, slot, calcData, added_x, calcDataCollection, par, query_name, utts, ori_q_head);
                    if (added) {
                        foundone = true;
                        added = false;
                        continue;
                    }
                } else if (relation.contains("poss")) {
                    if (par.getName().contains("/smilies/")) {
                        par.setName("smile");
                        ArrayList parent1s = new ArrayList();
                        parent1s.add(par);
                        added = this.addToAnswer(sent_graph, q_head, parent1s, speaker, speaker, null, slot, calcData, added_x, calcDataCollection, par, query_name, utts, ori_q_head);
                    }
                }
                ArrayList<Node> par_children = sent_graph.getChildren(par);
                for (Node par_child : par_children) {
                    if (par_child.equals(q_head)) {
                        continue;
                    }
                    ArrayList children = new ArrayList();
                    children.add(par_child);
                    added = this.addToAnswer(sent_graph, q_head, children, speaker, speaker, null, slot, calcData, added_x, calcDataCollection, par_child, query_name, utts, ori_q_head);
                    if (added) {
                        foundone = true;
                        break;
                    }
                }
                if (added) {
                    continue;
                }
                ArrayList<Node> children = sent_graph.getChildren(q_head);
                for (Node child : children) {
                    relation = sent_graph.getRelation(child, q_head);
                    ArrayList parent1s = new ArrayList();
                    parent1s.add(child);
                    added = this.addToAnswer(sent_graph, q_head, parent1s, speaker, speaker, null, slot, calcData, added_x, calcDataCollection, child, query_name, utts, ori_q_head);
                    if (added) {
                        foundone = true;
                        added = false;
                        break;
                    }
                }
            }
        } else if (speaker.equals(query_name)
                && slot.contains("towards")) {
            for (Node cand_node : cands_nodes) {
                Node par = sent_graph.getParent(cand_node);
                String relation = sent_graph.getRelation(par, cand_node);
                System.out.println("relation: " + relation);
                if (relation.contains("subj")
                        || relation.contains("obj")) {
                    ArrayList parent1s = new ArrayList();
                    if (relation.equals("pobj")) {
                        //skip preposition, added by TL 05/11/15
                        par = sent_graph.getParent(par);
                    }
                    parent1s.add(par);
                    added = this.addToAnswer(sent_graph, cand_node, parent1s, cand_node.getEntity().getFullExpression(), cand_node.getEntity().getKeyWord(), cand_node.getEntity(), slot, calcData, added_x, calcDataCollection, par, query_name, utts, null);
                    if (added) {
                        foundone = true;
                        added = false;
                        continue;
                    }
                }
                ArrayList<Node> par_children = sent_graph.getChildren(par);
                for (Node par_child : par_children) {
                    if (par_child.equals(cand_node)) {
                        continue;
                    }
                    ArrayList children = new ArrayList();
                    children.add(par_child);
                    added = this.addToAnswer(sent_graph, cand_node, children, cand_node.getEntity().getFullExpression(), cand_node.getEntity().getKeyWord(), cand_node.getEntity(), slot, calcData, added_x, calcDataCollection, par_child, query_name, utts, null);
                    if (added) {
                        foundone = true;
                        break;
                    }
                }
                if (added) {
                    added = false;
                    continue;
                }
                ArrayList<Node> children = sent_graph.getChildren(cand_node);
                for (Node child : children) {
                    relation = sent_graph.getRelation(child, cand_node);
                    ArrayList parent1s = new ArrayList();
                    parent1s.add(par);
                    added = this.addToAnswer(sent_graph, cand_node, parent1s, cand_node.getEntity().getFullExpression(), cand_node.getEntity().getKeyWord(), cand_node.getEntity(), slot, calcData, added_x, calcDataCollection, child, query_name, utts, null);
                    if (added) {
                        foundone = true;
                        added = false;
                        break;
                    }
                }
            }
        }
        if (!foundone) {
            System.out.println("invalid calc data");
            invalidCalcData.add(sentenceCount);
            return null;
        } else {
            return calcData;
        }
    }
    /*
     public boolean addToAnswer(ArrayList<Node> children, ArrayList<Node> cand_path, String slot, CalculusInfo calcData, ArrayList<String> added_x, ArrayList<CalculusInfo> calcDataCollection) {
     double max_sent = 0;
     String max_bf = null;
     double min_sent = 100;
     String min_bf = null;
     for (Node child : children) {
     if (child.getEntity() != null
     || cand_path.contains(child)) {
     continue;
     }
     String n_bf = this.getBaseForm(child.getName(), wordnet, child.getPos());
     System.out.println("n_bf: " + n_bf);
     double sent = 0;
     if (n_bf != null) {
     sent = this.calSentiment(n_bf);
     }
     if (sent > max_sent) {
     max_sent = sent;
     max_bf = n_bf;
     }
     if (sent != -1 && sent < min_sent) {
     min_sent = sent;
     min_bf = n_bf;
     }
     }
     if (slot.startsWith("pos") && max_sent > 5.9 && !this.common_verbs.contains(max_bf)
     || slot.startsWith("neg") && min_sent < 5.6 && !this.common_verbs.contains(min_bf)) {
     if (!added_x.contains(cand_path.get(0).getEntity().full_expression)
     && !added_x.contains(cand_path.get(cand_path.size() - 1).getEntity().full_expression)) {
     String x = cand_path.get(0).getEntity().getFullExpression();
     if (cand_path.get(0).isIsQuery()
     || calcData.target.contains(cand_path.get(0).getEntity().getFullExpression())) {
     if (cand_path.get(cand_path.size() - 1).isIsQuery()
     || calcData.target.contains(cand_path.get(cand_path.size() - 1).getEntity().getFullExpression())) {
     x = null;
     } else {
     x = cand_path.get(cand_path.size() - 1).getEntity().getFullExpression();
     }
     }
     if (x != null) {
     CalculusInfo newCalcData = createCalculusNode(x, calcData.xStart, calcData.xEnd, clearEndingNumbers(calcData.relation),
     clearEndingNumbers(calcData.firstRelation), clearEndingNumbers(calcData.target), calcData.foundLine, calcData.startOffset, calcData.endOffset, max_sent, calcData.pathName, calcData.completeLine, calcData.negate);
     if (slot.startsWith("neg")) {
     newCalcData = createCalculusNode(x, calcData.xStart, calcData.xEnd, clearEndingNumbers(calcData.relation),
     clearEndingNumbers(calcData.firstRelation), clearEndingNumbers(calcData.target), calcData.foundLine, calcData.startOffset, calcData.endOffset, min_sent, calcData.pathName, calcData.completeLine, calcData.negate);
     }
     calcDataCollection.add(newCalcData);
     added_x.add(x);
     return true;
     }
     }

     }
     return false;
     }
     */

    public boolean containsIf(Node node, Graph graph) {
        ArrayList<Node> children = graph.getChildren(node);
        if (children == null) {
            return false;
        }
        for (Node child : children) {
            if (child.getName().equalsIgnoreCase("if")) {
                return true;
            }
        }
        return false;
    }

    public boolean addToAnswer(Graph sent_graph, Node q_head, ArrayList<Node> children, String x, String oriX, CharSeq x_en, String slot, CalculusInfo calcData, ArrayList<String> added_x, ArrayList<CalculusInfo> calcDataCollection, Node relation, String query_name, ArrayList utts, Node ori_q_head) {
        double max_sent = 0;
        String max_bf = null;
        double min_sent = 100;
        String min_bf = null;
        boolean is_neg = sent_graph.isNegate(relation);
        if (slot.contains("from")
                && (q_head.getName().equalsIgnoreCase("i")
                || q_head.getName().equalsIgnoreCase("we")
                || q_head.getName().equalsIgnoreCase("our")
                || q_head.getName().equalsIgnoreCase("my")
                || q_head.getName().equalsIgnoreCase("me")
                || (ori_q_head != null
                && (ori_q_head.getName().equalsIgnoreCase("i")
                || ori_q_head.getName().equalsIgnoreCase("we")
                || ori_q_head.getName().equalsIgnoreCase("our")
                || ori_q_head.getName().equalsIgnoreCase("my")
                || ori_q_head.getName().equalsIgnoreCase("me"))))) {
            return false;
        }
        if (sent_graph.getSentence().trim().endsWith("?")) {
            //this is a question, shouldn't consider affect
            return false;
        }
        /*
         if (q_head != null 
         && relation != null) {
         ArrayList dep_types = sent_graph.getNodes(ori_q_head, q_head)
         }
         */
        String n_bf = null;
        for (Node child : children) {
            n_bf = this.getBaseForm(child.getName(), wordnet, child.getPos());
            System.out.println("n_bf: " + n_bf);
            double sent = 0;
            if (child.getPos().equals("PRP") ||
                    child.getPos().equals("IN") ||
                    child.getPos().equals("UH") ||
                    child.getPos().equals("RB") ||
                    child.getEntityRefs() != null ||
                    child.getPos().equals("DT")) {
                //relation is pronoun, skip it by TL 05.18/15
                //relation is preposition, skip it by TL 04/29/16
                continue;
            }
            if (query_name.contains(child.getName())) {
                //part of query, skip it by TL 05/18/15
                continue;
            }
            if (n_bf != null) {
                sent = this.calSentiment(n_bf);
            } else {
                sent = this.calSentiment(child.getName());
            }
            System.out.println("sent: " + sent);
            if (child.getEntity() != null
                    && (sent > 4.5 && slot.startsWith("neg")
                    || sent < 6.5 && slot.startsWith("pos"))) {
                continue;
            }
            if (is_neg
                    && sent != -1) {
                sent = 10 - sent; //added by TL 05/11/15
            }
            if (sent > max_sent) {
                max_sent = sent;
                max_bf = n_bf;
            }
            if (sent != -1 && sent < min_sent) {
                min_sent = sent;
                min_bf = n_bf;
            }
        }
        System.out.println("addToAnswer x: " + x);
        System.out.println("max_sent: " + max_sent);
        System.out.println("min_sent: " + min_sent);
        System.out.println("sentence: " + sent_graph.getSentence());
        System.out.println("addedx: " + added_x);
        System.out.println("slot: " + slot);
        if (n_bf == null) {
            n_bf = relation.getName();
        }
        if (slot.startsWith("pos") && max_sent > 5.9 && !this.common_verbs.contains(n_bf)
                || slot.startsWith("neg") && (min_sent < 5 && min_sent > 0 || Tools.isGoodNegRelation(n_bf)) && !this.common_verbs.contains(n_bf)) {//min_sent < 5.6 to < 4 by TL 05/10/15 to 5.6 again 05/13/15 add good neg  and > 0 05/19/15
            if (!added_x.contains(x)) {
                if (x != null) {
                    ArrayList<Integer> offsets = this.getOffset(calcData.utt, utts);
                    System.out.println("offsets: " + offsets);
                    CalculusInfo newCalcData = createCalculusNode(x, oriX, x_en, offsets.get(0), offsets.get(1), relation.getName(),
                            clearEndingNumbers(calcData.firstRelation), clearEndingNumbers(calcData.target), calcData.foundLine, offsets.get(0), offsets.get(1), max_sent, calcData.pathName, calcData.completeLine, calcData.negate);
                    if (slot.startsWith("neg")) {
                        newCalcData = createCalculusNode(x, oriX, x_en, offsets.get(0), offsets.get(1), relation.getName(),
                                clearEndingNumbers(calcData.firstRelation), clearEndingNumbers(calcData.target), calcData.foundLine, offsets.get(0), offsets.get(1), min_sent, calcData.pathName, calcData.completeLine, calcData.negate);
                    }
                    newCalcData.oriQuery = query_name;
                    newCalcData.target = q_head.getAnnoteEntity();
                    newCalcData.slot = slot;
                    newCalcData.setUtterance(calcData.utt);
                    if (!Tools.isBadRelation(relation.getName())
                            && !containsIf(relation, sent_graph)) {
                        System.out.println("adding " + x + "into answer list");
                        newCalcData.evidence = evidence;
                        calcDataCollection.add(newCalcData);
                        sys_outputs.add(newCalcData);
                        added_x.add(x);
                    }
                    return true;
                }
            }

        } else if (this.common_verbs.contains(max_bf)) {
            String relation_type = sent_graph.getRelation(q_head, children.get(0));
            boolean add = false;
            if (relation_type != null && relation_type.contains("subj")) {
                ArrayList<Node> gChildren = sent_graph.getChildren(children.get(0));
                for (Node gChild : gChildren) {
                    if (gChild.equals(q_head)) {
                        continue;
                    }
                    relation_type = sent_graph.getRelation(children.get(0), gChild);
                    if (relation_type != null
                            && relation_type.contains("obj")) {
                        double sent = this.calSentiment(gChild.getName());
                        if (sent_graph.isNegate(gChild)
                                && sent != -1) {
                            sent = 10 - sent;
                        }
                        if (slot.startsWith("pos") && sent > 5.9
                                || slot.startsWith("neg") && (min_sent < 5 && min_sent > 0 || Tools.isGoodNegRelation(min_bf))) { //by TL 05/11/15 from 5.6 to 5 add good neg  and > 0 05/19/15
                            relation = gChild;
                            if (!relation.getPos().equals("PRP")) {
                                //relation is pronoun, skip it by TL 05.18/15
                                if (!Tools.isBadRelation(relation.getName())
                                        && !containsIf(relation, sent_graph)) {
                                    add = true;
                                }
                            }
                        }
                        if (!add) {
                            ArrayList<Node> ggChildren = sent_graph.getChildren(gChild);
                            for (Node ggChild : ggChildren) {
                                if (ggChild.getPos().equals("JJ")
                                        || ggChild.getPos().startsWith("N")) {
                                    sent = this.calSentiment(ggChild.getName());
                                    if (sent_graph.isNegate(ggChild)) {
                                        sent = 10 - sent;
                                    }
                                    if (slot.startsWith("pos") && sent > 5.9
                                            || slot.startsWith("neg") && (min_sent < 5 || Tools.isGoodNegRelation(min_bf))) { //by TL 05/11/15 from 5.6
                                        relation = ggChild;
                                        if (relation.getPos().equals("PRP")) {
                                            //relation is pronoun, skip it by TL 05.18/15
                                            continue;
                                        }
                                        if (!Tools.isBadRelation(relation.getName())
                                                && !containsIf(relation, sent_graph)) {
                                            add = true;
                                        }
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (add) {
                if (relation.getPos().equals("PRP")) {
                    //relation is pronoun, skip it by TL 05.18/15
                    return false;
                }
                ArrayList<Integer> offsets = this.getOffset(calcData.utt, utts);
                CalculusInfo newCalcData = createCalculusNode(x, oriX, x_en, offsets.get(0), offsets.get(1), relation.getName(),
                        clearEndingNumbers(calcData.firstRelation), clearEndingNumbers(calcData.target), calcData.foundLine, offsets.get(0), offsets.get(1), max_sent, calcData.pathName, calcData.completeLine, calcData.negate);
                if (slot.startsWith("neg")) {
                    newCalcData = createCalculusNode(x, oriX, x_en, offsets.get(0), offsets.get(1), relation.getName(),
                            clearEndingNumbers(calcData.firstRelation), clearEndingNumbers(calcData.target), calcData.foundLine, offsets.get(0), offsets.get(1), min_sent, calcData.pathName, calcData.completeLine, calcData.negate);
                }
                newCalcData.setUtterance(calcData.utt);
                System.out.println("adding (in looking children of common verbs)" + x + "into answer list");
                newCalcData.slot = slot;
                newCalcData.oriQuery = query_name;
                newCalcData.target = q_head.getAnnoteEntity();
                newCalcData.evidence = evidence;
                calcDataCollection.add(newCalcData);
                sys_outputs.add(newCalcData);
                added_x.add(x);
                return true;
            }
        }
        return false;
    }

    public String clearEndingNumbers(String item) {

        int startIndex;             // Start of number
        int endIndex;               // End of number

        // Calculate the start and end Indexes
        String cleanData = item;
        startIndex = cleanData.lastIndexOf("-");

        endIndex = cleanData.length();

        String num = cleanData.substring(startIndex + 1, endIndex);
        try {
            Integer s = new Integer(num);
        } catch (Exception e) {
            System.out.println("this is not a number");
            return item;
        }
        if (startIndex == -1) {
            return item;
        }
        try {

            // Replace the numbers with nothing and return the new item
            cleanData = cleanData.replace(cleanData.substring(startIndex, endIndex), "");

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return cleanData;
        //  }

    }

    public boolean isNoun(String item, String tree) {

        int foundIndex = tree.indexOf(item);

        // Check to see if a character is an N, meaning we found a noun
        while (tree.charAt(foundIndex - 1) != '(') {
            if (tree.charAt(foundIndex - 1) == 'N') {
                return true;
            }
            foundIndex = foundIndex - 1;
        }
        return false;
    }

    public boolean isVerb(String item, String tree) {

        int foundIndex = tree.indexOf(item);

        try {
            // Check to see if a character is an "ing" verb
            if (tree.charAt(foundIndex - 2) == 'G' && tree.charAt(foundIndex - 3) == 'B' && tree.charAt(foundIndex - 4) == 'V') {
                return true;
            }
        } catch (Exception ex) {

        }
        return false;
    }

    public String nounCompoundModifier(ArrayList<SentenceInfo> dependArrayList, String entity) {

        String compoundNoun = "";
        String pairedItem = "";

        // Go through the dependency list and see if "nn" is a prefix for any of the items
        for (int j = 0; j < dependArrayList.size(); j++) {

            try {

                // Find the item paired with the X value is a compound noun, then attach it to the entire name
                if (dependArrayList.get(j).soloDepend.startsWith("nn(") && dependArrayList.get(j).soloDepend.contains(entity)) {
                    pairedItem = easyPairedItem(dependArrayList.get(j).soloDepend, 2);
                    if (entity.contentEquals(clearEndingNumbers(pairedItem))) {
                        return "";
                    }
                    pairedItem = clearEndingNumbers(pairedItem);
                    compoundNoun = compoundNoun.concat(pairedItem + " ");

                }
            } catch (Exception ex) {
                ex.printStackTrace();
                System.out.flush();
                //System.out.println(dependArrayList.get(j).soloDepend);
                System.exit(1);

                System.err.println("Error executing query");
            }
        }
        compoundNoun = compoundNoun.concat(entity);
        entity = compoundNoun.trim();

        return entity;
    }

    public boolean isProperNoun(String x, String typedTree) {

        // Find the starting point of the X string in the typed tree
        int xIndex = typedTree.indexOf(clearEndingNumbers(x));

        // If the string "NNP" is assoctiated with it, then that means it's a proper nound and should stay how it is
        if (typedTree.charAt(xIndex - 4) == 'N' && typedTree.charAt(xIndex - 3) == 'N' && typedTree.charAt(xIndex - 2) == 'P') {
            return true;
        } else {
            return false;
        }
    }

    public boolean isPrep(String x, String typedTree) {

        // Find the starting point of the X string in the typed tree
        int xIndex = typedTree.indexOf(clearEndingNumbers(x));

        // If the string "PRP" is assoctiated with it, then that means it's a proper nound and should stay how it is
        if (xIndex != -1 && typedTree.charAt(xIndex - 4) == 'P' && typedTree.charAt(xIndex - 3) == 'R' && typedTree.charAt(xIndex - 2) == 'P') {
            return true;
        } else {
            return false;
        }
    }

    // A function to find the abbreviation of a said name
    public String getAbbreviation(String name) {

        ArrayList<String> namePieces = new ArrayList(); // An arrayList that will store the vital peices of the name
        String nameSplit[] = name.split(" ");   // A String array that holds parts of the name split form spaces
        String newName = "";                       // A temporary string thath is used to check if a subset of a name was already found

        // Delete words like "of" "the"
        for (int i = 0; i < nameSplit.length; i++) {
            if (nameSplit[i].trim().toLowerCase().contentEquals("of") || nameSplit[i].trim().toLowerCase().contentEquals("and")
                    || nameSplit[i].trim().toLowerCase().contentEquals("the") || nameSplit[i].trim().toLowerCase().contentEquals("for")) {
            } else {
                namePieces.add(nameSplit[i]);
            }
        }

        // Get the first letter of everyword in the namepieces
        for (int j = 0; j < namePieces.size(); j++) {
            newName = newName.concat(namePieces.get(j).substring(0, 1));
        }
        return newName;
    }

    public void printNewswire(ArrayList<CalculusInfo> calcDataCollection, HashMap<String, ArrayList<ArrayList<ForumParse.OffsetInfo>>> offsetCollection,
            ArrayList<Integer> invalidCalcData, String queryID, String slot, String docID, String docAssID, HashMap<String, String> docsFullHash,
            String type, String oriDoc, ArrayList<Utterance> utts) {

        boolean runOnce = true;
        boolean notFound = true;
        boolean once = true;
        String newEntity = "";
        double confidenceScore;

        // Create a new file to print out the answers to 
        CustomFileWriter write = null;
        String sentencePathName = Settings.getValue("kbp_data_path") + "/newswire_output/" + queryID + ":" + type + ":" + origSlot;
        write = new CustomFileWriter(sentencePathName);

        // If the size of this calcdatacollection is zero, then we never found any sentences, so print out a file that reads "NIL"
        if (calcDataCollection.isEmpty()) {

        } else {
            // Print out all of the neccesary information to the file
            HashSet outputs = new HashSet();
            for (int j = 0; j < calcDataCollection.size(); j++) {

                //Decide if data should be printed to the new file, based on the scores and if positive or negatve
//                if (((calcDataCollection.get(j).sentiment > 5 && (origSlot.contains("pos-from") || origSlot.contains("pos-towards")))
//                        || (calcDataCollection.get(j).sentiment < 5 (min_sent < 5 || Tools.isGoodNegRelation(min_bf))  && calcDataCollection.get(j).sentiment >= 0 && (origSlot.contains("neg-from") || origSlot.contains("neg-towards"))))) {
                try {

                    //DocID = docID when 2014
                    //DocID = docAssID when test
			/*
                     if (docsFullHash.containsKey(docAssID)) {
                     newEntity = newswireFA.initialize(calcDataCollection.get(j).pathName, docAssID, calcDataCollection.get(j).x, docsFullHash, calcDataCollection.get(j).startOffset, calcDataCollection.get(j).endOffset, calcDataCollection.get(j).foundLine);
                     }
                     if (!newEntity.contentEquals("")) {
                     //DocID = docID when 2014
                     //DocID = docAssID when test
                     calcDataCollection.get(j).x = newEntity;//new NewswireFindAnnotation().initialize(calcDataCollection.get(j).pathName, docAssID, calcDataCollection.get(j).x, docsFullHash, calcDataCollection.get(j).startOffset, calcDataCollection.get(j).endOffset);
                     }
                     */
                    if (runOnce) {
                        System.out.println("\n------");
                        System.out.println("---\tSubmitted Solutions\t---");
                        System.out.println("------");

                        runOnce = false;
                    }

                    //  calcDataCollection.get(j).xStart = (calcDataCollection.get(j).completeLine.indexOf(calcDataCollection.get(j).x)) + calcDataCollection.get(j).startOffset;
                    //                        calcDataCollection.get(j).xEnd = calcDataCollection.get(j).xStart + calcDataCollection.get(j).x.length();
                    System.out.println(calcDataCollection.get(j).foundLine);
                    System.out.println(origSlot);
                    System.out.println("Query Name:\t" + calcDataCollection.get(j).target);
                    System.out.println("Oringal Query Name:\t" + calcDataCollection.get(j).oriQuery);
                    System.out.print("Relation:\t");
                    if (calcDataCollection.get(j).negate) {
                        System.out.printf("(Not) ");

                    }
                    System.out.println(calcDataCollection.get(j).relation);

                    System.out.println("Found Answer:\t" + calcDataCollection.get(j).x);
                    System.out.println("Found w/ Offset:\t" + oriDoc.substring(calcDataCollection.get(j).xStart, calcDataCollection.get(j).xEnd));
                    System.out.println("Score:\t\t" + calcDataCollection.get(j).sentiment);
                    System.out.println("\n");

                    //DocID = docID when 2014
                    //DocID = docAssID when test
                    notFound = false;
                    //adjustOffsetRange(calcDataCollection.get(j));

                    confidenceScore = convertScoretoConfidence(calcDataCollection.get(j).sentiment);
//                    write.println(queryID + "\t" + origSlot + "\t" + "suny_albany\t" + docAssID + ":" + calcDataCollection.get(j).startOffset
//                            + "-" + calcDataCollection.get(j).endOffset + "\t" + calcDataCollection.get(j).x + "\t"
//                            + docAssID + ":" + calcDataCollection.get(j).xStart + "-" + calcDataCollection.get(j).xEnd + "\t" + confidenceScore
//                            +"@@@@@"+calcDataCollection.get(j).oriQuery + "\t" + origSlot + "\t" + calcDataCollection.get(j).x+"\t"
//                            + calcDataCollection.get(j).evidence + "\t" + confidenceScore);

//                    write.println(queryID + "\t" + origSlot + "\t" + "suny_albany\t" + docAssID + ":" + calcDataCollection.get(j).startOffset
//                            + "-" + calcDataCollection.get(j).endOffset + "\t" + calcDataCollection.get(j).x + "\t"
//                            + docAssID + ":" + calcDataCollection.get(j).xStart + "-" + calcDataCollection.get(j).xEnd + "\t" + confidenceScore);
                    if (!outputs.contains(oriDoc.substring(calcDataCollection.get(j).xStart, calcDataCollection.get(j).xEnd) + "____" + calcDataCollection.get(j).relation)) {
//                        write.println(calcDataCollection.get(j).oriQuery + "\t" + "suny_albany\t" + docAssID + "\t" + calcDataCollection.get(j).foundLine + "\t" + calcDataCollection.get(j).x + "\t"
//                                + calcDataCollection.get(j).relation + "\t " + calcDataCollection.get(j).negate + "\n");
                        write.println(calcDataCollection.get(j).oriQuery + "\t" + origSlot + "\t" + "suny_albany\t" + docAssID + ":" + calcDataCollection.get(j).xStart + "-" + calcDataCollection.get(j).xEnd + "\t" + calcDataCollection.get(j).x + "\t"
                                + docAssID + ":" + calcDataCollection.get(j).xStart + "-" + calcDataCollection.get(j).xEnd + "\t" + confidenceScore + "\n");
                        outputs.add(oriDoc.substring(calcDataCollection.get(j).xStart, calcDataCollection.get(j).xEnd) + "____" + calcDataCollection.get(j).relation);
                    }
                } catch (Exception ex) {
                    ex.printStackTrace();
                    System.out.flush();
                    System.out.println("QueryID: " + queryID);
                    System.exit(1);
                }

                // The trial where we look for one case even if the score is below 5 if it is positive or if above 5 if it is negative
                //comment it out by TL 05/19/15
//                } else if (((calcDataCollection.get(j).sentiment <= 5 && (slot.contains("pos-from") || slot.contains("pos-towards")))
//                        || (calcDataCollection.get(j).sentiment > 5 && calcDataCollection.get(j).sentiment >= 0 && (slot.contains("neg-from") || slot.contains("neg-towards"))))
//                        && ((int) calcDataCollection.get(j).x.charAt(0) >= 65 && (int) calcDataCollection.get(j).x.charAt(0) <= 90)) {
//
//                    if (once) {
//                        
//                        try {
//
//                        //DocID = docID when 2014
//                            //DocID = docAssID when test
//                            newEntity = new NewswireFindAnnotation().initialize(calcDataCollection.get(j).pathName, docID, calcDataCollection.get(j).x, docsFullHash, calcDataCollection.get(j).startOffset, calcDataCollection.get(j).endOffset);
//                            if (!newEntity.contentEquals("")) {
//                            //DocID = docID when 2014
//                                //DocID = docAssID when test
//                                calcDataCollection.get(j).x = new NewswireFindAnnotation().initialize(calcDataCollection.get(j).pathName, docID, calcDataCollection.get(j).x, docsFullHash, calcDataCollection.get(j).startOffset, calcDataCollection.get(j).endOffset);
//                            }
//                            if (runOnce) {
//                                System.out.println("\n------");
//                                System.out.println("---\tSubmitted Solutions\t---");
//                                System.out.println("------");
//
//                                runOnce = false;
//                            }
//
//                            calcDataCollection.get(j).xStart = (calcDataCollection.get(j).completeLine.indexOf(calcDataCollection.get(j).x)) + calcDataCollection.get(j).startOffset;
//                            calcDataCollection.get(j).xEnd = calcDataCollection.get(j).xStart + calcDataCollection.get(j).x.length();
//
////                        System.out.println("Start:\t" + calcDataCollection.get(j).xStart);
////                        System.out.println("End:\t" + calcDataCollection.get(j).xEnd);
//                            System.out.println(calcDataCollection.get(j).foundLine);
//                            System.out.println(slot);
//                            System.out.println("Query Name:\t" + calcDataCollection.get(j).target);
//                            System.out.println("Relation:\t" + calcDataCollection.get(j).relation);
//                            System.out.println("Found Answer:\t" + calcDataCollection.get(j).x);
//                            System.out.println("Found w/ Offset:\t" + docsFullHash.get(docID).substring(calcDataCollection.get(j).xStart, calcDataCollection.get(j).xEnd));
//                            System.out.println("Score:\t\t" + calcDataCollection.get(j).sentiment);
//                            System.out.println("\n");
//                        //DocID = docID when 2014
//                            //DocID = docAssID when test
//
//                            notFound = false;
//                            adjustOffsetRange(calcDataCollection.get(j));
//
//                            confidenceScore = convertScoretoConfidence(calcDataCollection.get(j).sentiment);
//                            write.println(queryID + "\t" + slot + "\t" + "suny_albany5\t" + docID + ":" + calcDataCollection.get(j).startOffset
//                                    + "-" + calcDataCollection.get(j).endOffset + "\t" + calcDataCollection.get(j).x + "\t"
//                                    + docID + ":" + calcDataCollection.get(j).xStart + "-" + calcDataCollection.get(j).xEnd + "\t" + confidenceScore);
//
//                        } catch (Exception ex) {
//                            ex.printStackTrace();
//                            System.out.flush();
//                            System.out.println("QueryID: " + queryID);
//                            System.exit(1);
//                        }
//                    }
//                    once = false;
            }
        }
//        }
        if (notFound) {
            write.println(queryID + "\t" + origSlot + "\t" + "suny_albany5\t" + "NIL\t");
        }

        write.closeFile();
    }

    public void adjustOffsetRange(CalculusInfo calcData) {

        int sentenceStart = calcData.startOffset;
        int startRange = 0;
        int midRange = 75;
        int endRange = 149;
        int sentenceEnd = calcData.completeLine.length();
        boolean search = true;

        // If the offset difference is less than 150 characters already, then just return, no need to alter anything
        if (calcData.endOffset - calcData.startOffset <= 149) {
            return;
        } else {

            // Start at the beginning of the sentence and move forward 1 character at a time, all the while testing if
            // the relation and the x are within the 150 character window
            while (endRange <= sentenceEnd && !calcData.completeLine.substring(startRange, endRange).contains(calcData.x)
                    && !calcData.completeLine.substring(startRange, endRange).contains(calcData.relation)) {
                System.out.println("FIRST");
                System.out.println(calcData.completeLine.substring(startRange, endRange));
                System.out.println(calcData.x);
                System.out.println(calcData.relation + "\n");

                startRange++;
                endRange++;
            }

            // When we exit the while loop, see whether it is because we scanned the entire sentence or b/c we found the answer
            if (calcData.completeLine.substring(startRange, endRange).contains(calcData.x)
                    && calcData.completeLine.substring(startRange, endRange).contains(calcData.relation)) {

                System.out.println("FOUND");
                System.out.println(calcData.completeLine.substring(startRange, endRange));

                // Set the new offset values if we successfully found the answer
                calcData.startOffset = sentenceStart + startRange;
                calcData.endOffset = sentenceStart + endRange;
                return;

            } else {

                // Reset the start values
                startRange = -1;
                midRange = 74;
                endRange = 148;

                // if we are still in search mode
                while (search) {

                    startRange++;
                    midRange++;
                    endRange++;

                    System.out.println(calcData.completeLine.length());
                    System.out.println("start:\t" + startRange);
                    System.out.println("mid:\t" + midRange);
                    System.out.println("end:\t" + endRange);
                    System.out.flush();
                    System.out.println(calcData.completeLine.substring(startRange, endRange));

                    // If the line we are looking at even has the substring within it
                    if (calcData.completeLine.substring(startRange, endRange).contains(calcData.x)) {

                        // The answer is located to the left half of the sentence and should output immediately
                        if ((calcData.completeLine.indexOf(calcData.x) + calcData.x.length()) < midRange) {

                            System.out.println("Case 1");

                            calcData.startOffset = sentenceStart + startRange;
                            calcData.endOffset = sentenceStart + endRange;
                            return;
                        }
                        // The answer is located in the right half of the sentence and we should shift the character window to right to center it
                        if ((calcData.completeLine.indexOf(calcData.x) + calcData.x.length()) >= midRange
                                && calcData.completeLine.indexOf(calcData.x) <= midRange) {

                            System.out.println("Case 2");

                            calcData.startOffset = sentenceStart + startRange;
                            calcData.endOffset = sentenceStart + endRange;
                            return;
                        }

                        // The answer is located in the right half of the sentence and we can't shift the character window to the right anymore than we have
                        if (endRange == sentenceEnd) {

                            System.out.println("Case 3");

                            calcData.startOffset = sentenceStart + startRange;
                            calcData.endOffset = sentenceStart + endRange;
                            return;
                        }
                    }

                    System.out.println("SECOND");
                    System.out.println(calcData.completeLine.substring(startRange, endRange));
                    System.out.println(calcData.x + "\n");

                }
            }
        }
    }

    // Convert the ANEW score into a score that is applicable to the evaluation
    public double convertScoretoConfidence(double anewScore) {

        if ((anewScore >= 1 && anewScore < 3) || (anewScore > 7 && anewScore <= 9)) {
            return 8 * (0.1);
        }
        if ((anewScore >= 3 && anewScore < 4) || (anewScore > 6 && anewScore <= 7)) {
            return 5 * (0.1);
        }
        if ((anewScore >= 4 && anewScore <= 6)) {
            return 2 * (0.1);
        }
        return anewScore;
    }

    public String easyPairedItem(String soloDepend, int piece) {

        String[] pairedItemArray;
        String pairedItem;

        pairedItem = soloDepend;
        pairedItem = pairedItem.replaceAll("\\(", " ");
        pairedItem = pairedItem.replaceAll("\\)", "");
        pairedItem = pairedItem.replaceAll(",", "");
        pairedItemArray = pairedItem.split(" ");

        return pairedItemArray[piece];

    }

    public void saysRelation(ArrayList<SentenceInfo> dependArrayList, CalculusInfo calcData, String docAssID, HashMap<String, String> docsFullHash,
            ArrayList<String> exemptWords) throws InterruptedException, IOException, ParserConfigurationException {

        String pairedRelation = "";
        String pairedX;
        boolean fetch = false;

        // Go through the entire dependency list
        for (int j = 0; j < dependArrayList.size(); j++) {

            // If we find an instance of ccomp, then get its paired relation 
            if (fetch == false && dependArrayList.get(j).soloDepend.startsWith("ccomp(")) {
                pairedRelation = easyPairedItem(dependArrayList.get(j).soloDepend, 2);
                fetch = true;
                j = 0;
                System.out.println("fetch = true");

            }

            // Now that we know the relation, we can connect it to an object or a subject
            if (fetch && dependArrayList.get(j).soloDepend.contains(pairedRelation) && ((dependArrayList.get(j).soloDepend.startsWith("nsubj(")
                    || dependArrayList.get(j).soloDepend.startsWith("nsubjpass(")) || dependArrayList.get(j).soloDepend.startsWith("dobj(")
                    || dependArrayList.get(j).soloDepend.startsWith("pobj(") || dependArrayList.get(j).soloDepend.startsWith("dep(") || dependArrayList.get(j).soloDepend.startsWith("iobj("))) {
                pairedX = easyPairedItem(dependArrayList.get(j).soloDepend, 2);

                if (!clearEndingNumbers(pairedX).toLowerCase().contentEquals("i") && !clearEndingNumbers(pairedX).toLowerCase().contentEquals("we")) {
                    pairedX = checkForPoss(dependArrayList, pairedX);
                    System.out.println("AFTER PSOS:\t" + pairedX);

                    // Set the pathname if it hasn't been already found through the finding subj and obj functions
                    if (calcData.pathName.contentEquals("")) {
                        calcData.pathName = new ForumMultiThreadSync().createThreads(docAssID);
                    }
                    if (Character.isUpperCase(pairedX.charAt(0)) && !exemptWords.contains(clearEndingNumbers(pairedX.toLowerCase()))) {
                        System.out.println("~~SaysRelation~~");
                        calcData.x = pairedX;
                        calcData.oriX = calcData.x;
                        calcData.relation = pairedRelation;
                        return;
                    }
                }
            }
        }
    }

    public boolean isDataBad(CalculusInfo calcData, String typedTree, ArrayList<String> exemptWords) {
        return isPrep(calcData.x, typedTree) || clearEndingNumbers(calcData.x).toLowerCase().contentEquals("i")
                || exemptWords.contains(clearEndingNumbers(calcData.x).toLowerCase())
                || clearEndingNumbers(calcData.x).contentEquals(clearEndingNumbers(calcData.target))
                || clearEndingNumbers(calcData.relation).contentEquals("is") || clearEndingNumbers(calcData.relation).contentEquals("do")
                || calcData.relation.contains("says") || calcData.relation.contains("said") || calcData.relation.contains("told")
                || calcData.relation.contains("tells") || calcData.relation.contains("wrote") || calcData.relation.contains("written")
                || calcData.relation.contains("calls") || calcData.relation.contains("called");
    }

    public boolean isSaid(String relation) {

        return relation.contains("says") || relation.contains("said") || relation.contains("told")
                || relation.contains("tells") || relation.contains("wrote") || relation.contains("written")
                || relation.contains("calls") || relation.contains("called") || relation.contains("added")
                || relation.contains("state") || relation.contains("speak") || relation.contains("remark")
                || relation.contains("propose") || relation.contains("refute") || relation.contains("profess")
                || relation.contains("proclaim") || relation.contains("preach") || relation.contains("observe")
                || relation.contains("gloat") || relation.contains("exclaim") || relation.contains("detail")
                || relation.contains("detail") || relation.contains("deny") || relation.contains("declare")
                || relation.contains("declare") || relation.contains("warn");
    }

    public void printUpdate(CalculusInfo calcData, String updateNum) {

        System.out.println("~ Update " + updateNum + " ~");
        System.out.println(calcData.foundLine);
        System.out.println("Query Name:\t" + calcData.target);
        System.out.println("Relation:\t" + calcData.relation);
        System.out.println("Found Answer:\t" + calcData.x);

        // Print Update to the CSV file
        outputCSV.print(calcData.relation + "{");
        outputCSV.print(calcData.x + "{");

    }

    private boolean hasPassiveVerbs(String sentence) {
        for (int x = 0; x < passiveActionVerbs.size(); x++) {
            if (sentence.toLowerCase().contains(passiveActionVerbs.get(x))) {
                return true;
            }
        }
        return false;
    }

    public ArrayList<String> createExemptWords() {
        ArrayList<String> exemptWords = new ArrayList();
        exemptWords.add("monday");
        exemptWords.add("tuesday");
        exemptWords.add("wednesday");
        exemptWords.add("thursday");
        exemptWords.add("friday");
        exemptWords.add("saturday");
        exemptWords.add("sunday");
        exemptWords.add("january");
        exemptWords.add("february");
        exemptWords.add("march");
        exemptWords.add("april");
        exemptWords.add("may");
        exemptWords.add("june");
        exemptWords.add("july");
        exemptWords.add("august");
        exemptWords.add("september");
        exemptWords.add("october");
        exemptWords.add("november");
        exemptWords.add("december");
        exemptWords.add("tonight");
        exemptWords.add("tomorrow");
        exemptWords.add("yesterday");
        exemptWords.add("country");
        exemptWords.add("this");
        exemptWords.add("No.");
        exemptWords.add("tv");
        exemptWords.add("what");
        exemptWords.add("people");
        exemptWords.add("jan.");
        exemptWords.add("feb.");
        exemptWords.add("mar.");
        exemptWords.add("apr.");
        exemptWords.add("jun.");
        exemptWords.add("jul.");
        exemptWords.add("aug.");
        exemptWords.add("sep.");
        exemptWords.add("oct.");
        exemptWords.add("nov.");
        exemptWords.add("dec.");

        return exemptWords;

    }

    private static ArrayList<String> createPassiveActionVerbs() {
        ArrayList<String> passiveActionVerbs = new ArrayList();
        passiveActionVerbs.add(" wins ");
        passiveActionVerbs.add(" won ");
        passiveActionVerbs.add(" recieves ");
        passiveActionVerbs.add(" recieved ");
        passiveActionVerbs.add(" granted ");
        passiveActionVerbs.add(" grants ");
        passiveActionVerbs.add(" obtain ");
        passiveActionVerbs.add(" obtained ");
        passiveActionVerbs.add(" obtains ");
        passiveActionVerbs.add(" take ");
        passiveActionVerbs.add(" takes ");
        passiveActionVerbs.add(" took ");
        passiveActionVerbs.add(" taken ");
        passiveActionVerbs.add(" got ");
        passiveActionVerbs.add(" gotten ");
        passiveActionVerbs.add(" gets ");
        passiveActionVerbs.add(" earns ");
        passiveActionVerbs.add(" earned ");
        passiveActionVerbs.add(" earn ");
        return passiveActionVerbs;
    }

    public ArrayList<Integer> getOffset(Utterance utt, ArrayList<Utterance> utts) {
        int startx = 100000000;
        int endx = 0;
//        System.out.println("utt id: " + utt.getId());
        evidence = "";
        for (Utterance tmp_utt : utts) {
//            System.out.println("tmp_utt id: " + tmp_utt.getId());
            if (tmp_utt.getId().equals(utt.getId())) {
                boolean found = false;
                if (startx > tmp_utt.getStartx()) {
                    startx = tmp_utt.getStartx();
                    found = true;
                }
                if (endx < tmp_utt.getEndx()) {
                    endx = tmp_utt.getEndx();
                    found = true;
                }

                if (found) {
                    evidence = evidence + tmp_utt.getContent();
                }
            }

        }

        ArrayList<Integer> offsets = new ArrayList();
        offsets.add(startx);
        offsets.add(endx);
        return offsets;
    }
}
