/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.albany.cubism.relation;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.logging.Level;
import java.util.logging.Logger;
//import net.didion.jwnl.data.POS;
//import net.didion.jwnl.data.Synset;

/**
 *
 * @author ting
 */
public class Relation implements Serializable {

    public Relation() {
    }

    public ArrayList getBadNodes() {
        return bad_nodes_;
    }

    public void setFiltered(boolean filter_type_) {
        this.filtered_ = filter_type_;
    }

    public boolean isFiltered() {
        return this.filtered_;
    }

    /**
     * * get attributes **
     */
    public int getRelationID() {
        return relationID;
    }

    public String getConcept() {
        return concept_;
    }

    public String getDomain() {
        return domain_;
    }

    public String getName() {
        return name_;
    }

    public String getType() {
        return type_;
    }

    public Path getPath() {
        return path_;
    }

    public ArrayList getRelNodes() {
        return rel_nodes_;
    }

    public Node getRelNode() {
        return ori_node_;
    }

    public String getRelPhrase() {
        sort(rel_nodes_);
        return rel_nodes_.toString(con_head_, ori_node_);
    }

    public String getRelPhraseWO() {
        sort(rel_nodes_);
        return rel_nodes_.toStringWithOW(con_head_, ori_node_);
    }

    public String pathAndRels() {
        Path all = new Path();
        all.addAll(path_);
        for (Node rel_node : rel_nodes_) {
            if (!all.contains(rel_node)) {
                all.add(rel_node);
            }
        }
        //Collections.sort(all);
        sort(all);
        return all.toString(con_head_, ori_node_);
    }

    public boolean isNeighbour() {
        return this.is_neighbor_;
    }

    public Path pathAndRelsNodes() {
        Path all = new Path();
        all.addAll(path_);
        for (Node rel_node : rel_nodes_) {
            if (!all.contains(rel_node)) {
                all.add(rel_node);
            }
        }
        //Collections.sort(all);
        sort(all);
        return all;
    }


    public String getPOS(String pos) {
        if (pos.startsWith("N")) {
            return "noun";
        } else if (pos.startsWith("V")) {
            return "verb";
        } else if (pos.startsWith("A")) {
            return "adj";
        } else {
            return "noun";
        }
    }

    public void setTTopics(ArrayList<String> ttopics) {
        ttopics_ = ttopics;
    }

    public String getNameLemma() {
        return name_lemma_;
    }

    public Node getConceptHead() {
        return con_head_;
    }

    /**
     * * set attributes **
     */
    public void setConcept(String concept_) {
        this.concept_ = concept_;
    }

    public void setIsNeighbour(boolean is_nei) {
        this.is_neighbor_ = is_nei;
    }

    public void sort(ArrayList<Node> all) {
        for (int i = 0; i < all.size() - 1; i++) {
            Node n1 = all.get(i);
            if (n1.getName().trim().length() < 2) {
                //remove those words with only one letter
                all.remove(i);
                i--;
                continue;
            }
            for (int j = i + 1; j < all.size(); j++) {
                Node n2 = all.get(j);
                if (n1.getId() > n2.getId()) {
                    all.set(i, n2);
                    all.set(j, n1);
                    n1 = n2;
                } else if (n1.getId() == n2.getId()) {
                    System.out.println("remove: " + n2.getName());
                    all.remove(n2);
                    j--;
//                    i--;
                }
            }
        }
    }

    public void setRelationID(int param) {
        relationID = param;
    }

    public int getPassageID() {
        return passageID;
    }

    public void setPassageID(int param) {
        passageID = param;
    }

    public void setConceptHead(Node con_head) {
        con_head_ = con_head;
    }

    public void setDomain(String domain_) {
        this.domain_ = domain_;
    }

    public void setName(String name_) {
        this.name_ = name_;
    }

    public void setNameNode(Node node) {
        this.ori_node_ = node;
        rel_nodes_.add(node);
        probe();
    }

    public void setType(String type_) {
        this.type_ = type_;
    }

    public boolean setPath(Path path) {
        this.path_ = path;
        return true;
    }

    public void setTree(Graph tree) {
        tree_ = tree;
    }
//    //@Zumrut
//    public Graph getTree()
//    {
//        return tree_;
//    }

    public void setNameLemma(String name_lemma_) {
        this.name_lemma_ = name_lemma_;
    }

    public void setOriNode(Node ori_node_) {
        this.ori_node_ = ori_node_;
    }

    /*
     * Add prep in or if be is link verb, then and the noun of the other side
     */
    public void probe() {
        ArrayList<Node> children = tree_.getChildren(ori_node_);
        if (ori_node_.getName().equalsIgnoreCase("auction")) {
            //System.out.println("children: " + children);
        }
        for (Node child : children) {
            if (!(child.getId() + 1 == ori_node_.getId()
                    || child.getId() - 1 == ori_node_.getId())
                    && !child.getPos().startsWith("V")) {
                //the child has to be next to rel node
                continue;
            }

            if (child.getPos().equals("RP")
                    || child.getPos().equals("IN")
                    || (child.getPos().equals("VBZ")
                    && ori_node_.getPos().startsWith("N"))) {
                if (!rel_nodes_.contains(child)
                        && !(/*
                         * child.getName().equalsIgnoreCase("be") ||
                         * child.getName().equalsIgnoreCase("is") ||
                         * child.getName().equalsIgnoreCase("was") ||
                         * child.getName().equalsIgnoreCase("are") ||
                         * child.getName().equalsIgnoreCase("were") ||
                         * child.getName().equalsIgnoreCase("been") ||
                         */child.getName().equalsIgnoreCase("has")
                        || child.getName().equalsIgnoreCase("have")
                        || child.getName().equalsIgnoreCase("had"))) {
                    if (ori_node_.getName().equals("answer")) {
                        System.out.println("adding: " + child.getName());
                    }
                    if (child.getPos().equals("IN")) {
                        if (child.getId() > this.getRelNode().getId() && child.getId() < this.getConceptHead().getId()
                                || child.getId() < this.getRelNode().getId() && child.getId() > this.getConceptHead().getId()) {
                            rel_nodes_.add(child);
                        }
                    } else {
                        rel_nodes_.add(child);
                    }
                }
            }
        }
    }

    /**
     * Determines if the target concept possessive.
     *
     * @return True: (if possessive) False: (Not Possessive)
     */
    // Created by John M. Lien
    public boolean isPossessive() {
        return this.isPossessiveEnglish(); //English Possessiveness Test.
    }

    /**
     * Checks possessiveness for English words.
     *
     * @return True: (If Possessive) False: (If Non Possessive)
     */
    // Created by John M. Lien
    private boolean isPossessiveEnglish() {
        if (this.ori_node_.getId() < this.con_head_.getId()) {
            /* Check to the left of the concept if the relation comes betore the concept */
            return isPossessiveEnglish_CheckLeft(this.con_head_, this.ori_node_, tree_);
        }
        /* Check to the right of the concept if the relation comes after the concept */
        return isPossessiveEnglish_CheckRight(this.con_head_, this.ori_node_, tree_);
    }

    /**
     * Looks to the left side of the concept and determines if the relationship
     * between the relation and the concept is a possessive one.
     *
     * @param con_node Concept Node
     * @param rel_node Relation Node
     * @param ti_cont_graph REMND Parse Tree
     * @return True: (if possessive) False: (Not Possessive)
     */
    // Created by John M. Lien
    private boolean isPossessiveEnglish_CheckLeft(Node con_node, Node rel_node, Graph ti_cont_graph) {
        Node mid_node = ti_cont_graph.getNode(rel_node.getId() + 1);
        /**
         * If the relation is a noun or proper noun, the word to the immediate
         * right of the relation is "of" and is used as a prefix, and the
         * relation is a preposition of the concept, then it is a possessive
         * relationship.
         *
         * Example: The Great Carnival of Poverty
         */
        String relationship = ti_cont_graph.getRelation(rel_node, mid_node);
        if (relationship != null) {
            return rel_node.getPos().startsWith("NN")
                    && mid_node.getName().equalsIgnoreCase("of")
                    && mid_node.getPos().equals("IN")
                    && (relationship.equals("prep")
                    || (relationship.equals("poss")));
        }
        return false;
    }

    /**
     * Looks to the right side of the concept and determines if the relationship
     * between the relation and the concept is a possessive one.
     *
     * @param con_node Concept Node
     * @param rel_node Relation Node
     * @param ti_cont_graph REMND Parse Tree
     * @return True: (if possessive) False: (Not Possessive)
     */
    // Created by John M. Lien
    private boolean isPossessiveEnglish_CheckRight(Node con_node, Node rel_node, Graph ti_cont_graph) {
        Node mid_node = ti_cont_graph.getNode(con_node.getId() + 1);
        String relationship_1 = ti_cont_graph.getRelation(con_node, mid_node);
        String relationship_2 = ti_cont_graph.getRelation(con_node, rel_node);
        /**
         * If the relation is a noun, the word to the immediate right of the
         * concept is "'s", and the relationship between to concept and relation
         * is "poss", then this is a indirect possessive relationship.
         *
         * Example: Poverty's big ugly face.
         */
        if (relationship_1 != null && relationship_2 != null) {
            return rel_node.getPos().startsWith("NN")
                    && mid_node.getName().equalsIgnoreCase("'s")
                    && relationship_1.equals("possessive")
                    && relationship_2.equals("poss");
        }
        return false;
    }

    // Created by John M. Lien
    /**
     * Grab the substring starting at the first difference in characters between
     * the two strings with respect to str1. This means that F(a,b) may not
     * equal F(b,a).
     *
     * @param str1 - First String
     * @param str2 - Second String
     * @return returns the first parameter if the first characters in each
     * string to no match.
     */
    private static String stringDifference(String str1, String str2) {
        String ending;
        ending = stringIntersection(str1, str2);
        if (ending != null) {
            return str1.substring(ending.length(), str1.length());
        } else {
            return null;
        }
    }

    // Created by John M. Lien
    /**
     * Returns the substring which the two parameters share starting at index 0.
     *
     * @param str1 - First String
     * @param str2 - Second String
     * @return returns empty if the first characters in each string to no match.
     */
    private static String stringIntersection(String str1, String str2) {
        /* variables */
        int length;
        char[] s1, s2;
        StringBuilder sb = new StringBuilder();

        /* check strings for null */
        if (str1 == null || str2 == null) {
            return null;
        }

        /* if both strings are not null then convert them to character arrays */
        s1 = str1.toCharArray();
        s2 = str2.toCharArray();

        /* find the shoreste length string */
        if (str1.length() > str2.length()) {
            length = str2.length();
        } else {
            length = str1.length();
        }

        /* loop until the characters do not match */
        for (int i = 0; i < length; i++) {
            if (s1[i] != s2[i]) {
                break;
            } else {
                sb.append(s1[i]);
            }
        }

        /*return characters matched */
        return sb.toString();
    }

    // Created by John M. Lien
    private boolean isPossessiveFarsi() {
        String relationship = tree_.getRelation(ori_node_, con_head_);
        return (relationship == null) ? false : relationship.equals("pos");
    }

    /*
     * Add noun on the other side of verb if the verb is very common, such as
     * be, have,
     */
    public void createNodeList() {
        node_list_ = tree_.getNodes(this.ori_node_, this.con_head_);
    }

    /**
     * * other operation **
     */
    @Override
    public String toString() {

        return "Relation:" + "\nRelation id: " + relationID + "\nRelation Name: " + getRelPhrase()
                + "\nConcept: " + concept_ + "\nDomain: " + domain_ + "\nRelation Type: " + type_
                + "\npath: " + pathAndRels() + "\n";
    }

    public String toStringWithOriginalHead() {
        return "Relation:" + "\nRelation id: " + relationID + "\nInvolved Instance\n" + "\nRelation Name: " + this.getRelPhraseWO()
                + "\nConcept: " + concept_ + "\nDomain: " + domain_ + "\nRelation Type: " + type_
                + "\npath: " + pathAndRels() + "\n";
    }
    /*
     public void repositoryInsert(){
     int pid = instance_.getPassageId();
     String path = pathAndRels();
     boolean exists = Repository.doesRelationExist(pid, path);
     String table = "relation_english";
     String lang = Settings.getValue(Settings.LANGUAGE);
     if (!lang.equalsIgnoreCase("english"))
     if (lang.equalsIgnoreCase("spanish"))
     table = "relation_spanish";
     else if (lang.equalsIgnoreCase("russian"))
     table = "relation_russian";
     else if (lang.equalsIgnoreCase("farsi"))
     table = "relation_farsi";
     if (pid != -1 && !exists){
     int newRelationID = Repository.getNewRelationID();
     String relation = q("Involved Instance");
     String context = instance_.getSentence();
     String SQL = "INSERT INTO " + table + " (relation_id, relation, relation_name, "
     + "relation_type, context, path, passage_id, concept) VALUES ("
     + Integer.toString(newRelationID) + ", " + relation + ", "
     + q(getRelPhrase()) + ", " + q(type_) + ", " + q(context) + ", "
     + q(pathAndRels()) + ", " + Integer.toString(pid) + ", "
     + q(concept_) + ");";
     System.out.println(SQL);
     //Repository.executeUpdate(SQL);
     }
     }
     */

    private String q(String val) {
        return "'" + val.replace("'", "''") + "'";
    }
    /**
     * * attributes definition **
     */
//    private Wordnet wn_ = new Wordnet();
    private String name_ = null;
    private Node ori_node_ = null;
    private String name_lemma_ = null;
    private Path rel_nodes_ = new Path();
    private String concept_ = null;
    private Node con_head_ = null;
    private String domain_ = null;
    private String type_ = null;
    private Path path_ = null;
    private Path node_list_ = null;
    private Graph tree_ = null;
    private int relationID = -1;
    private int passageID = -1;
    private HashSet<String> comm_verbs_en_ = null;
    private HashSet<String> comm_verbs_sp_ = null;
    private HashSet<String> comm_verbs_ru_ = null;
    private HashSet<String> comm_verbs_fa_ = null;
    private ArrayList<String> highImg = new ArrayList<String>();
    private ArrayList<String> highCon = new ArrayList<String>();
    private ArrayList<Node> highICs = new ArrayList();
    private final String opion_word_ = "cerebrate";
    private final String sp_opion_word_ = "pensar";
    private Long idSense1 = 0L;
    private Long idSense2 = 0L;
    private ArrayList ttopics_ = null;
    private static ArrayList bad_nodes_ = new ArrayList();
    private static ArrayList opinion_words_ = new ArrayList();
    private static final long serialVersionUID = 6034784516155575009L;
    private HashMap<String, Integer> verbList = null;
    private boolean isInTop3Clusters = false; // 4/25/13 11:54 AM - m2w
    private double rel_img_ = -1;
    private double rel_con_ = -1;
    private String tcContext_ = null;
    private double i_thr_ = 0.35;
    private double rel_valence_ = -1.5;
    private double rel_nom_valence_ = -1.5;
    private boolean is_neighbor_ = false;
    private boolean filtered_ = false;
    private String govId = "";
//    SpImageability spimageability_ = new SpImageability(TargetMessageSpanishParser.getSp());
//    SpConcreteness spconcreteness_ = new SpConcreteness(TargetMessageSpanishParser.getSp());
    private static ArrayList<String> bad_prepositions_ = new ArrayList() {
        {
            add("because");
            add("before");
            add("concerning");
            add("condiering");
            add("after");
            add("despite");
            add("during");
            add("following");
            add("minus");
            add("regarding");
            add("save");
            add("since");
            add("unlike");
            add("until");
            add("than");
        }
    };
    private boolean for_gov_test_ = true;

    private boolean badPrepostion() {
//        System.out.println("bad_prepositinos: " + bad_prepositions_);
        for (Node node : path_) {
            if (node.getPos().equals("IN")) {
                if (node.getName() != null && bad_prepositions_.contains(node.getName().toLowerCase())) {
                    return true;
                }
                ArrayList<Edge> edges = node.getAdjacencies();
                for (Edge edge : edges) {
                    for (String bad_preposition : bad_prepositions_) {
                        if (edge.getRelation().indexOf(bad_preposition) != -1) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public boolean badRelation() {
        if (ttopics_.contains(this.ori_node_.getLemmaWord())
                || ttopics_.contains(ori_node_.getName())) {
            return true;
        }
        this.createNodeList();
        if (this.ori_node_.getPos().startsWith("J")
                || this.ori_node_.getPos().startsWith("N")) {
            System.out.println("badRelation ori_node_: " + ori_node_.getName());
            return (this.node_list_.contains(this.path_.WORD, ",")
                    || this.node_list_.contains(this.path_.WORD, ":")
                    || this.node_list_.contains(this.path_.WORD, "\""));
        }
        return false;
    }

    /**
     * @return the isInTop3Clusters
     */
    public boolean isIsInTop3Clusters() {
        return isInTop3Clusters;
    }

    /**
     * @param isInTop3Clusters the isInTop3Clusters to set
     */
    public void setIsInTop3Clusters(boolean isInTop3Clusters) {
        this.isInTop3Clusters = isInTop3Clusters;
    }

    public double getRelImg() {
        return rel_img_;
    }

    public double getRelCon() {
        return rel_con_;
    }

    public ArrayList<Node> getHighICs() {
        return highICs;
    }

    public void setHighICs(ArrayList<Node> highICs) {
        this.highICs = highICs;
    }


    public String getTcContext() {
        return tcContext_;
    }

    public void setTcContext(String tc) {
        tcContext_ = tc;
    }

    public void setForGovTest(boolean for_gov_test_) {
        this.for_gov_test_ = for_gov_test_;
    }

    public boolean isForGovTest() {
        return for_gov_test_;
    }

    public String getGovId() {
        return govId;
    }

    public void setGovId(String govId) {
        this.govId = govId;
    }
}
