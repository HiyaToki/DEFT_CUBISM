/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//2014
package edu.albany.cubism.sentiment;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import edu.albany.cubism.relation.Utterance;
import edu.albany.cubism.util.Settings;

/**
 *
 * @author jrgiarrusso
 */
public class LoadQuerys {

    // A class that takes in the input from a query and then stores it into the respective areas
    public class QueryInput {

        public String queryid; // The ID Number for the Query
        public String name;    // The Name of the entity
        public String docid;   // The name of the document to look at
        public String docidAss;// The name of the assessment doc to look at
        public String beg;     // The character offset where the name is found
        public String end;     // The character offset where the name ends
        public String enttype; // The type of the entity (ORG, PER, GPE)
        public String slot;    // The sentiment held by or about the entity
        public String answer;
        public String answerText;
        public String docText; //the original document the query is in
        public HashMap<String, HashMap<String, ArrayList<ArrayList<Integer>>>> aw_offsets = new HashMap(); //key: docid + content: answers + content: offsets of answers
        public ArrayList<Utterance> utts = null;

        public QueryInput(String queryid, String name, String docid, String docidAss, String beg, String end, String enttype, String slot, String answer, String answerText, HashMap aw_offsets) {
            this.queryid = queryid;
            this.name = name;
            this.docid = docid;
            this.docidAss = docidAss;
            this.beg = beg;
            this.end = end;
            this.enttype = enttype;
            this.slot = slot;
            this.answer = answer;
            this.answerText = answerText;
            this.aw_offsets = aw_offsets;
        }

        //added by TL 03/20/15

        public void setUtts(ArrayList<Utterance> utts) {
            this.utts = utts;
        }

        public void setAwOffsets(HashMap aw_offsets) {
            this.aw_offsets = aw_offsets;
        }

        public void addAwOffsets(String docId, HashMap offsets) {
            System.out.println("add " + docId + " " + offsets);
            if (aw_offsets.containsKey(docId)) {
                System.out.println("appending: " + offsets);
                HashMap aws = aw_offsets.get(docId);
                aws.putAll(offsets);
            } else {
                this.aw_offsets.put(docId, offsets);
            }
        }

        public HashMap getAwOffsets() {
            return aw_offsets;
        }
        //done adding

        public ArrayList<Utterance> getUtts() {
            return utts;
        }
    }

    public class LoadedQuery {

        public ArrayList<ArrayList<String>> docArrayList;
        public ArrayList<QueryInput> queryArrayList;

       public LoadedQuery(ArrayList<ArrayList<String>> docArrayList, ArrayList<QueryInput> queryArrayList) {
            docArrayList=new ArrayList<ArrayList<String>>();
           
            for (int i=0; i<queryArrayList.size(); i++){
                QueryInput qi=queryArrayList.get(i);
                ArrayList<String> aDoc=new ArrayList<String>();
                aDoc.add(qi.queryid+"\t"+qi.slot+"\t"+"Albany"+"\t"+qi.docid+":0000-0000"+"\t"+"NOANSWER"+"\t"+qi.docid+":0000-0000");
                aDoc.add(qi.queryid);
                aDoc.add(qi.docid+":0000-0000");
                docArrayList.add(aDoc);
            }
           
           
            this.docArrayList = docArrayList;
            this.queryArrayList = queryArrayList;
        }

        public String toStringDocs() {
            return docArrayList.toString();
        }

        public String toStringQuery() {
            return queryArrayList.toString();
        }
    }

    public ArrayList<QueryInput> createArrayList() throws ParserConfigurationException, SAXException, IOException {

        // Take the .XML Query and parse through it, then return it as an Array List
        ArrayList<QueryInput> queryArrayList = new ArrayList();
        queryArrayList = readXML();

        return queryArrayList;
    }

    public ArrayList<QueryInput> createArrayList(org.w3c.dom.Document xmldoc) throws ParserConfigurationException, SAXException, IOException {

        // Take the .XML Query and parse through it, then return it as an Array List
        ArrayList<QueryInput> queryArrayList = new ArrayList();
        queryArrayList = readXML(xmldoc);

        return queryArrayList;
    }

    public ArrayList<QueryInput> readXML() throws ParserConfigurationException, SAXException, IOException { 

        System.out.println("Creating Query Data Structure...\n");

        // Create an ARRAY LIST that stors all the information in the Query
        ArrayList<QueryInput> queryArrayList = new ArrayList();

        // Open up the query File and establish the Document Builder tools in order to read an XML File
        //2014 Evaluation
        //2016 population
//        File queryFile = new File(Settings.getValue("kbp_data_path")+"/2014evaluation/cubisum_sentiment_population_queries_1.xml");
        File queryFile = new File(Settings.getValue("kbp_data_path")+"/2014evaluation/tac_2014_kbp_english_sentiment_slot_filling_evaluation_queries.xml");
//        File queryFile = new File(Settings.getValue("kbp_data_path")+"/2014evaluation/LDC2014R39_TAC_2014_KBP_English_Sentiment_Slot_Filling_Evaluation_Queries_V1.1/data/tac_2014_kbp_english_sentiment_slot_filling_evaluation_queries.xml");

        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = null;
        Document doc = null;

        dBuilder = dbFactory.newDocumentBuilder();
        doc = dBuilder.parse(queryFile);

        doc.getDocumentElement().normalize();

        // Create a list that has as many nodes as there are Tags by the name of "query"
        NodeList nList = doc.getElementsByTagName("query");

        //System.out.println("----------");
        // Go through the list and store all of the information about the file into a linked list
        for (int temp = 0; temp < nList.getLength(); temp++) {

            Node nNode = nList.item(temp);

            if (nNode.getNodeType() == Node.ELEMENT_NODE) {

                Element eElement = (Element) nNode;

                // Create a new data node of type queryInput, so it will contain all vital information
                QueryInput newQueryNode = new QueryInput(eElement.getAttribute("id"), eElement.getElementsByTagName("name").item(0).getTextContent(),
                        eElement.getElementsByTagName("docid").item(0).getTextContent(), "", eElement.getElementsByTagName("beg").item(0).getTextContent(),
                        eElement.getElementsByTagName("end").item(0).getTextContent(), eElement.getElementsByTagName("enttype").item(0).getTextContent(),
                        eElement.getElementsByTagName("slot").item(0).getTextContent(), "", "", new HashMap());
                // Add the new node to the data structure
                //queryList.add(newQueryNode);
                queryArrayList.add(newQueryNode);
            }
        }
        return queryArrayList;
    }

    public ArrayList<QueryInput> readXML(org.w3c.dom.Document xmldoc) throws ParserConfigurationException, SAXException, IOException { 

        System.out.println("Creating Query Data Structure...\n");

        // Create an ARRAY LIST that stors all the information in the Query
        ArrayList<QueryInput> queryArrayList = new ArrayList();

        // Open up the query File and establish the Document Builder tools in order to read an XML File
        //2014 Evaluation
//        File queryFile = new File(Settings.getValue("kbp_data_path")+"/2014evaluation/tac_2014_kbp_english_sentiment_slot_filling_evaluation_queries.xml");
//        File queryFile = new File(Settings.getValue("kbp_data_path")+"/2014evaluation/LDC2014R39_TAC_2014_KBP_English_Sentiment_Slot_Filling_Evaluation_Queries_V1.1/data/tac_2014_kbp_english_sentiment_slot_filling_evaluation_queries.xml");

//        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
//        DocumentBuilder dBuilder = null;
        Document doc = xmldoc;

//        dBuilder = dbFactory.newDocumentBuilder();
//        doc = dBuilder.parse(queryFile);

        doc.getDocumentElement().normalize();

        // Create a list that has as many nodes as there are Tags by the name of "query"
        NodeList nList = doc.getElementsByTagName("query");

        //System.out.println("----------");
        // Go through the list and store all of the information about the file into a linked list
        for (int temp = 0; temp < nList.getLength(); temp++) {

            Node nNode = nList.item(temp);

            if (nNode.getNodeType() == Node.ELEMENT_NODE) {

                Element eElement = (Element) nNode;

                // Create a new data node of type queryInput, so it will contain all vital information
                QueryInput newQueryNode = new QueryInput(eElement.getAttribute("id"), eElement.getElementsByTagName("name").item(0).getTextContent(),
                        eElement.getElementsByTagName("docid").item(0).getTextContent(), "", eElement.getElementsByTagName("beg").item(0).getTextContent(),
                        eElement.getElementsByTagName("end").item(0).getTextContent(), eElement.getElementsByTagName("enttype").item(0).getTextContent(),
                        eElement.getElementsByTagName("slot").item(0).getTextContent(), "", "", new HashMap());
                // Add the new node to the data structure
                //queryList.add(newQueryNode);
                queryArrayList.add(newQueryNode);
            }
        }
        return queryArrayList;
    }

    public LoadedQuery initialize() throws InterruptedException, IOException, ParserConfigurationException, SAXException {

        // Creates an array list containing all of the files that need to be opened - THIS WORKS!
        OpenAssessments openAssess = new OpenAssessments();
        ArrayList<ArrayList<String>> assessDocArrayList = openAssess.selectAssessmentFiles();

        // Open and extract all the necessary assessments files from the source corpus identified by the array list assessdocArrayList - THIS WORKS!
        OpenSourceCorpusAssessments openSC = new OpenSourceCorpusAssessments();
        openSC.loadSourceCorpusAssess(assessDocArrayList);

        LoadedQuery lq = new LoadedQuery(assessDocArrayList, createArrayList());
        return lq;
    }

    public LoadedQuery initialize(org.w3c.dom.Document xmldoc) throws InterruptedException, IOException, ParserConfigurationException, SAXException {

        // Creates an array list containing all of the files that need to be opened - THIS WORKS!
        OpenAssessments openAssess = new OpenAssessments();
        ArrayList<ArrayList<String>> assessDocArrayList = openAssess.selectAssessmentFiles();

        // Open and extract all the necessary assessments files from the source corpus identified by the array list assessdocArrayList - THIS WORKS!
        OpenSourceCorpusAssessments openSC = new OpenSourceCorpusAssessments();
        openSC.loadSourceCorpusAssess(assessDocArrayList);

        LoadedQuery lq = new LoadedQuery(assessDocArrayList, createArrayList(xmldoc));
        return lq;
    }

}
