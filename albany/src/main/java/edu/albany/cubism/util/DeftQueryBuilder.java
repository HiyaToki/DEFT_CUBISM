/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.albany.cubism.util;

import edu.albany.cubism.sentiment.CustomFileReader;
import edu.albany.cubism.sentiment.LoadQuerys;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 *
 * @author ting
 */
public class DeftQueryBuilder {

    String process_query_path = null;
    String new_query_path = null;
    HashSet<String> processed_queries = new HashSet();
    String oriDoc = null;
    ArrayList<DeftQuery> new_queries = new ArrayList();
    String docid = null;
    HashSet<String> docids = new HashSet();

    public DeftQueryBuilder() {

    }

    public static void main(String[] args) {
        DeftQueryBuilder dqb = new DeftQueryBuilder();
        try {
            dqb.loadProcessedQueries();
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(DeftQueryBuilder.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SAXException ex) {
            Logger.getLogger(DeftQueryBuilder.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(DeftQueryBuilder.class.getName()).log(Level.SEVERE, null, ex);
        }
        dqb.parseDocument(Settings.getValue("kbp_data_path") + "/Source_Corpus_Files_Assessment/");
        try {
            dqb.createDeftQueryXMLFile(dqb.getNew_queries(), Settings.getValue("kbp_data_path") + "/2014evaluation/", "cubisum_sentiment_population_queries");
        } catch (IOException ex) {
            Logger.getLogger(DeftQueryBuilder.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void loadProcessedQueries() throws ParserConfigurationException, SAXException, IOException {

        System.out.println("Creating Query Data Structure...\n");

        // Create an ARRAY LIST that stors all the information in the Query
        ArrayList<LoadQuerys.QueryInput> queryArrayList = new ArrayList();

        // Open up the query File and establish the Document Builder tools in order to read an XML File
        //2014 Evaluation
        System.out.println("Settings.getValue(\"kbp_data_path\"):" + Settings.getValue("kbp_data_path"));
        File queryFile = new File(Settings.getValue("kbp_data_path") + "/2014evaluation/tac_2014_kbp_english_sentiment_slot_filling_evaluation_queries_copy.xml");
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
                DeftQuery dq = new DeftQuery();
                dq.setQuery_id(eElement.getAttribute("id"));
                dq.setName(eElement.getElementsByTagName("name").item(0).getTextContent());
                dq.setDocid(eElement.getElementsByTagName("docid").item(0).getTextContent());
                dq.setStartx(eElement.getElementsByTagName("beg").item(0).getTextContent());
                dq.setEndx(eElement.getElementsByTagName("end").item(0).getTextContent());
                dq.setEntity_type(eElement.getElementsByTagName("enttype").item(0).getTextContent());
                dq.setSlot(eElement.getElementsByTagName("slot").item(0).getTextContent());

                // Add the new node to the data structure
                //queryList.add(newQueryNode);
                processed_queries.add(dq.getDocid() + "_" + dq.getName());
                this.docids.add(dq.getDocid());
            }
        }
        System.out.println("processed_queries" + processed_queries);
        System.out.println("docids: " + docids);
    }

    public void parseDocument(String docPathName) {

        StringBuilder totalDocBuilder = new StringBuilder();        // A string that will hold the entire document
        File docpath = new File(docPathName);
        String[] file_list = docpath.list();
        for (String file : file_list) {
            if (!file.startsWith("bolt")) {
                continue;
            }
            CustomFileReader read = new CustomFileReader(docpath.getAbsolutePath() + "/" + file);  // Open up the file found earlier
            String offsetSentence;
            String currLine = "\n";                                     // The line before looking at the next
            String nextLine = "\n";                                     // The currently read line
            String totalDoc;                                            // A string to hold the document in the document id  
            boolean endOfDoc = false;                                   // Tells us if we are at the end of the document
            String docid = null;

            // While there is a another line to be read in the file and
            // we haven't gotten to the end of the needed document
            while (read.hasNextLine()) {
                currLine = nextLine;
                nextLine = read.getNextLine();
//            System.out.println("nextLine: " + nextLine);
//            System.out.println("totalDocBuilder.length(): " + totalDocBuilder.length());
                // We are finished if we are reading the file still and we run into the end of the document
                // Now add the sentence found within the document to the hashmap
                if (totalDocBuilder.length() != 0 && (nextLine.contains("</doc>") || nextLine.contains("</DOC>"))) {
                    System.out.println("add to doclist");
                    totalDocBuilder.append(nextLine);
                    endOfDoc = true;
                    totalDoc = totalDocBuilder.toString();
                    totalDocBuilder = new StringBuilder();
                    this.oriDoc = totalDoc;
                }

                // Keep copying text over if the length of the document is greater than zero and
                // we have not reached the end of the document
                if (totalDocBuilder.length() != 0 && !endOfDoc) { //modified by TL from && to ||, change it back for multiple documents in one file 11/09/2015
                    totalDocBuilder.append(nextLine);

                    //////////////////////////////
                    //MAY NEED TO FIX THIS LINE//
                    ////////////////////////////
                    totalDocBuilder.append("\n");

                } else {
                    totalDocBuilder.append(nextLine);
                }

                // If we found the line that has the document id, then we decide where
                // we should start copying over the data from the specific file
                if (nextLine.contains("doc id=")) {
                    docid = nextLine.substring(nextLine.indexOf("doc id=") + 8, nextLine.lastIndexOf("\">"));
                    this.docid = docid;
                    System.out.println("docid: " + this.docid);
                }

                if (nextLine.contains("post author=\"")) {
                    String speaker = nextLine.substring(nextLine.indexOf("post author=\"") + 13, nextLine.indexOf("\" datetime"));
//                    if (this.docids.contains(this.docid)) {
//                        System.out.println("found one: " + this.docid + "_" + speaker);
//                    }
                    if (this.docid != null
                            && this.docids.contains(this.docid)
                            && !this.processed_queries.contains(this.docid + "_" + speaker)) {
                        System.out.println("found one: " + this.docid + "_" + speaker);
                        this.processed_queries.add(this.docid + "_" + speaker);
                        int startx = totalDocBuilder.indexOf("post author=\"" + speaker);
                        int endx = startx + speaker.length();
                        DeftQuery newq = new DeftQuery();
                        newq.setDocid(this.docid);
                        newq.setStartx(new Integer(startx).toString());
                        newq.setEndx(new Integer(endx).toString());
                        newq.setName(speaker);
                        newq.setEntity_type("PER");
                        newq.setSlot("neg-from");
                        this.new_queries.add(newq);
                        newq = new DeftQuery();
                        newq.setDocid(this.docid);
                        newq.setStartx(new Integer(startx).toString());
                        newq.setEndx(new Integer(endx).toString());
                        newq.setName(speaker);
                        newq.setEntity_type("PER");
                        newq.setSlot("pos-from");
                        this.new_queries.add(newq);
                    }
                }

            }
        }
        System.out.println("new_queries:" + new_queries.size());
    }

    public void createDeftQueryXMLFile(ArrayList<DeftQuery> queries, String outpath, String source_file_name) throws IOException {
        try {
            String query_id = "Cubism_Sentiment_Population_";
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

            // root elements
            Document doc = docBuilder.newDocument();
            Element rootElement = doc.createElement("kbpsentslotfill");
            doc.appendChild(rootElement);

//            Attr attr = doc.createAttribute("id");
//            attr.setValue(source_file_name);
//            rootElement.setAttributeNode(attr);
            int count = 1;
            for (DeftQuery query : queries) {
                // queryItem elements
                Element queryItem = doc.createElement("query");
                rootElement.appendChild(queryItem);

                // set attribute to queryItem element
                Attr belief_id = doc.createAttribute("id");
                belief_id.setValue(query_id + count);
                queryItem.setAttributeNode(belief_id);

                count++;

                Element queryname = doc.createElement("name");
                queryname.appendChild(doc.createTextNode(query.getName()));
                queryItem.appendChild(queryname);

                Element docid = doc.createElement("docid");
                docid.appendChild(doc.createTextNode(query.getDocid()));
                queryItem.appendChild(docid);

                Element offset = doc.createElement("beg");
                offset.appendChild(doc.createTextNode(query.getStartx()));
                queryItem.appendChild(offset);

                Element length = doc.createElement("end");
                length.appendChild(doc.createTextNode(query.getEndx()));
                queryItem.appendChild(length);

                // entity_type elements
                Element entity_type = doc.createElement("enttype");
                entity_type.appendChild(doc.createTextNode(query.getEntity_type()));
                queryItem.appendChild(entity_type);

                // slot elements
                Element slot = doc.createElement("slot");
                slot.appendChild(doc.createTextNode(query.getSlot()));
                queryItem.appendChild(slot);

            }
            // write the content into xml file
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");

            DOMSource source = new DOMSource(doc);
            System.out.println(outpath + "/" + source_file_name + ".xml");
            File output = new File(outpath + "/" + source_file_name + ".xml");
            
            if (!output.exists()) {
                output.createNewFile();
            }
            StreamResult result = new StreamResult(output);

            // Output to console for testing
            // StreamResult result = new StreamResult(System.out);
            transformer.transform(source, result);

            System.out.println("File saved!");

        } catch (ParserConfigurationException pce) {
            pce.printStackTrace();
        } catch (TransformerException tfe) {
            tfe.printStackTrace();
        }
    }

    public String getProcess_query_path() {
        return process_query_path;
    }

    public void setProcess_query_path(String process_query_path) {
        this.process_query_path = process_query_path;
    }

    public String getNew_query_path() {
        return new_query_path;
    }

    public void setNew_query_path(String new_query_path) {
        this.new_query_path = new_query_path;
    }

    public HashSet<String> getProcessed_queries() {
        return processed_queries;
    }

    public void setProcessed_queries(HashSet<String> processed_queries) {
        this.processed_queries = processed_queries;
    }

    public String getOriDoc() {
        return oriDoc;
    }

    public void setOriDoc(String oriDoc) {
        this.oriDoc = oriDoc;
    }

    public ArrayList<DeftQuery> getNew_queries() {
        return new_queries;
    }

    public void setNew_queries(ArrayList<DeftQuery> new_queries) {
        this.new_queries = new_queries;
    }

    public String getDocid() {
        return docid;
    }

    public void setDocid(String docid) {
        this.docid = docid;
    }

}
