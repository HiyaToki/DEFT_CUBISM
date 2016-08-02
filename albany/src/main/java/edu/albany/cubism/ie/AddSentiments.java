/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.albany.cubism.ie;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Text;
import org.w3c.dom.Attr;
import org.w3c.dom.NamedNodeMap;

/**
 *
 * @author meenakshi
 */
public class AddSentiments {

    public static void main(String args[]) {
        try {

            FileInputStream fstream = new FileInputStream("/Users/ting/Documents/DEFT/data/sample/LDC2016E27_DEFT_English_Belief_and_Sentiment_Annotation/data/sys_sentiments_output_06_28_16_v1.txt");
            // Get the object of DataInputStream
            DataInputStream in = new DataInputStream(fstream);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            String strLine;
            String ere_path = "/Users/ting/NetBeansProjects/deft_2.3/albany/src/main/resources/us/albany/cubism/Data/2014evaluation/LDC2016E27_DEFT_English_Belief_and_Sentiment_Annotation/data/ere/";
            BoltDocument bd = new BoltDocument();

            List<SystemOutputClass> systemOutputObjArray = new ArrayList<SystemOutputClass>();
            String source_id = "";
            String target_id = "";
            String sentiment = "";
            String fileSource = "";
            String current_s_id = null;
            boolean keep = false;
            while ((strLine = br.readLine()) != null) {
//                System.out.println("line: " + strLine);
                if (strLine.equalsIgnoreCase("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$") && keep) {
                    SystemOutputClass systemOutputObj = new SystemOutputClass();
                    EntityMention sem = bd.getEREEntityMention(source_id);
                    EntityMention tem = bd.getEREEntityMention(target_id);
                    systemOutputObj.setSentiment(sentiment);
                    systemOutputObj.setSource(source_id);
                    systemOutputObj.setS_content(sem.getEntityMentionText());
                    systemOutputObj.setS_length(sem.getEntityMentionLength());
                    systemOutputObj.setS_offset(sem.getEntityMentionOffset());
                    systemOutputObj.setTarget(target_id);
                    systemOutputObj.setT_content(tem.getEntityMentionText());
                    systemOutputObj.setT_length(tem.getEntityMentionLength());
                    systemOutputObj.setT_offset(tem.getEntityMentionOffset());
                    systemOutputObj.setSourceFile(fileSource);
                    systemOutputObjArray.add(systemOutputObj);
                    keep = false;
                }
                if (strLine.contains("source:") && !strLine.contains("this.source")) {

                    source_id = (strLine.substring(strLine.indexOf(":") + 1, strLine.indexOf("/"))).trim();

                }
                if (strLine.contains("this.source")) {
                    String fn = (strLine.substring(strLine.indexOf(":") + 2, strLine.length())).trim();
                    fileSource = fn + ".best.xml";
                    if (current_s_id == null || !current_s_id.equalsIgnoreCase(fn)) {
                        current_s_id = fn;
                        bd.createEREEntityList(current_s_id, ere_path);
                    }

                }
                if (strLine.contains("target:")) {

                    target_id = (strLine.substring(strLine.indexOf(":") + 1, strLine.indexOf("/"))).trim();

                }
                if (strLine.contains("polarity:")) {

                    sentiment = (strLine.substring(strLine.indexOf(":") + 1, strLine.length()));

                }
                
                if (strLine.contains("Comment:agree")) {
                    keep = true;
                }

            }

            //System.out.println("----------------------------"+systemOutputObjArray.size());
            String src = "";
            String target = "";
            String senti = "";

            // File inputFile = new File("59f8514f6db132207ba9e5828f73d706.best.xml");
            DocumentBuilderFactory dbFactory
                    = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            HashMap<String, Document> docs = new HashMap();

            for (int i = 0; i < systemOutputObjArray.size(); i++) {
                String fileName = "";
                Document doc = null;
                if (docs.containsKey(systemOutputObjArray.get(i).getSourceFile())) {
                    doc = docs.get(systemOutputObjArray.get(i).getSourceFile());
                } else {
                    File folder = new File("/Users/ting/NetBeansProjects/deft_2.3/albany/src/main/resources/us/albany/cubism/Data/2014evaluation/LDC2016E27_DEFT_English_Belief_and_Sentiment_Annotation/data/annotation");
                    File[] listOfFiles = folder.listFiles();
                    //  System.out.println(""+systemOutputObjArray.get(i).getSourceFile());
                    for (File filename : listOfFiles) {

                        System.out.println("processing: " + filename.getName());
                        //    System.out.println(filename.getName().equalsIgnoreCase());
                        if (filename.getName().equalsIgnoreCase(systemOutputObjArray.get(i).getSourceFile())) {
                            System.out.println("hi");
                            fileName = filename.getName();
                            break;
                        }

                    }
                    File file = new File(folder.getAbsolutePath() + "/" + fileName);
                    doc = dBuilder.parse(file);
                    docs.put(fileName, doc);
                }
                doc.getDocumentElement().normalize();

                NodeList nList = doc.getElementsByTagName("entity");
                List<Element> elemaArray = new ArrayList<Element>();
                Element entity = null;
                System.out.println("step 1   " + nList.getLength());
                boolean contains = false;
                if (nList != null) {

                    for (int temp = 0; temp < nList.getLength(); temp++) {
                        System.out.println("hello");

                        Node nNode = nList.item(temp);

//            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                        Element eElement = (Element) nNode;
                        target = eElement.getAttribute("ere_id");
//                        System.out.println("target from annotation file: " + target);
                        NodeList node = eElement.getElementsByTagName("sentiment");
                        Element firstElement = (Element) node.item(0);
                        // NodeList children = firstElement.getChildNodes();

                        NodeList node1 = eElement.getElementsByTagName("source");
                        Element secondElement = (Element) node1.item(0);
                        src = secondElement.getAttribute("ere_id");
                        senti = firstElement.getAttribute("polarity");

                        //  }
                        System.out.println("before step 2.1" + systemOutputObjArray.get(i).getSource());
                        if (systemOutputObjArray.get(i).getSource().equalsIgnoreCase(src) && systemOutputObjArray.get(i).getTarget().equalsIgnoreCase(target)) {
                            System.out.println("step 2.1");
                            if (systemOutputObjArray.get(i).getSentiment().equalsIgnoreCase(senti)) {
                                System.out.println("Al gud");
                                contains = true;
                                break;
                            }

                        }

                    }
                }
                if (!contains) {
                    System.out.println("helloah");
                    entity = doc.createElement("entity");
                    Attr attrType1 = doc.createAttribute("ere_id");
                    attrType1.setValue(systemOutputObjArray.get(i).getTarget());
                    Attr attrType2 = doc.createAttribute("offset");
                    attrType2.setValue((new Integer(systemOutputObjArray.get(i).getT_offset())).toString());
                    Attr attrType3 = doc.createAttribute("length");
                    attrType3.setValue((new Integer(systemOutputObjArray.get(i).getT_length())).toString());
                    entity.setAttributeNode(attrType1);
                    entity.setAttributeNode(attrType2);
                    entity.setAttributeNode(attrType3);
                    Element text = doc.createElement("text");
                    text.appendChild(
                            doc.createTextNode(systemOutputObjArray.get(i).getT_content()));
                    entity.appendChild(text);
                    Element sentiment1 = doc.createElement("sentiment");
                    Attr senti1AttrType1 = doc.createAttribute("polarity");

                    senti1AttrType1.setValue(systemOutputObjArray.get(i).getSentiment().trim());

                    Attr senti1AttrType2 = doc.createAttribute("sarcasm");
                    senti1AttrType2.setValue("no");

                    sentiment1.setAttributeNode(senti1AttrType1);
                    sentiment1.setAttributeNode(senti1AttrType2);

                    Element source1 = doc.createElement("source");
                    Attr src1AttrType1 = doc.createAttribute("ere_id");
                    src1AttrType1.setValue(systemOutputObjArray.get(i).getSource());
                    Attr src1AttrType2 = doc.createAttribute("offset");
                    src1AttrType2.setValue((new Integer(systemOutputObjArray.get(i).getS_offset())).toString());
                    Attr src1AttrType3 = doc.createAttribute("length");
                    src1AttrType3.setValue((new Integer(systemOutputObjArray.get(i).getS_length())).toString());
                    source1.appendChild(
                            doc.createTextNode(systemOutputObjArray.get(i).getS_content()));
                    source1.setAttributeNode(src1AttrType1);
                    source1.setAttributeNode(src1AttrType2);
                    source1.setAttributeNode(src1AttrType3);
                    sentiment1.appendChild(source1);

                    entity.appendChild(sentiment1);
//                    doc.getElementsByTagName("entities").item(0).getParentNode().appendChild(entity);
                    doc.getElementsByTagName("entities").item(0).appendChild(entity);
                }

            }
            System.out.println("docs size: " + docs.size());
            ArrayList<String> keys = new ArrayList(Arrays.asList(docs.keySet().toArray()));
            System.out.println("keys: " + keys);
            for (String fileName : keys) {
                System.out.println("writing: " + fileName);
                Document doc = docs.get(fileName);
                TransformerFactory transformerFactory = TransformerFactory.newInstance();
                Transformer transformer = transformerFactory.newTransformer();
                System.out.println("Annotation" + fileName);
                DOMSource source = new DOMSource(doc);
                StreamResult result = new StreamResult(new File("/Users/ting/NetBeansProjects/deft_2.3/albany/src/main/resources/us/albany/cubism/Data/2014evaluation/LDC2016E27_DEFT_English_Belief_and_Sentiment_Annotation/data/Annotations/" + fileName));
                transformer.transform(source, result);
            }
        } catch (Exception e) {//Catch exception if any
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }

}
