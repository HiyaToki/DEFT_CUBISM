/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.albany.cubism.sentiment;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import edu.albany.cubism.ie.CharSeq;
import edu.albany.cubism.ie.OldEntity;
import edu.albany.cubism.ie.ReplaceWordData;

/**
 *
 * @author jrgiarrusso
 */
public class ForumFindAnnotation {

    public ArrayList<String> initialize(String pathName, String docID, HashMap<String, String> docsFullHash, String textBody, String xmlTopic, String type) throws ParserConfigurationException {

        ArrayList<String> nameList = new ArrayList();

        if (pathName.contentEquals("")) {
            return nameList;
        }
        ArrayList<OldEntity> entityList = createEntityList(pathName);

        int startOffset = 0;
        int endOffset = 0;
        if (textBody.length() > 0) {
            startOffset = docsFullHash.get(docID).indexOf(textBody.substring(0, textBody.length() - 1));
            endOffset = startOffset + textBody.length();
       //     System.out.println("docID" + docID);

            //     System.out.println("textBody Sentence:\t" + textBody);
            // System.out.println("OffSet Sentence:\t" + docsFullHash.get(docID).substring(startOffset, endOffset));
            //     System.out.println("startOffset:\t" + startOffset);
            //     System.out.flush();
            //     System.out.println("endOffset:\t" + endOffset);
            // System.out.println("Full document:\t" + docsFullHash.get(docID));
            //    System.out.flush();
            //     System.out.println("xmlTopic:\t" + xmlTopic);
        } else {
            return nameList;
        }
        for (int j = 0; j < entityList.size(); j++) {
            for (int i = 0; i < entityList.get(j).wordData.size(); i++) {

                // The From Case
                // If we found the corresponding annotation section of data with this specific textBody line, then see if the words in the annotations
                // are the same as the topic of the query.  If they are, check to see if the xmltopic is contained wihin one of the repalce words and if the coordinaties
                // for those replace words are the same as the word offsets
                if (type.contentEquals("from") && entityList.get(j).wordData.get(i).startOffset >= startOffset && entityList.get(j).wordData.get(i).endOffset <= endOffset) {
                    for (int k = 0; k < entityList.get(j).replaceWordData.size(); k++) {
                        if (xmlTopic.toLowerCase().contains((entityList.get(j).replaceWordData.get(k).replaceWord).toLowerCase())
                                && entityList.get(j).replaceWordData.get(k).endOffset == entityList.get(j).wordData.get(i).endOffset
                                && entityList.get(j).replaceWordData.get(k).startOffset == entityList.get(j).wordData.get(i).startOffset) {
                            nameList.add(xmlTopic);
                            return nameList;
                        }
                    }
                }
                // The Towards case
                // If the start and end offset of the word is within the text region, then for every replace word, see if the start offset is the same as the end offset,
                // if it is, then we found a match and should print the same replace word for every occurance.
                if (type.contentEquals("towards") && entityList.get(j).wordData.get(i).startOffset >= startOffset && entityList.get(j).wordData.get(i).endOffset <= endOffset) {
                    for (int l = 0; l < entityList.get(j).replaceWordData.size(); l++) {
                        if (entityList.get(j).replaceWordData.get(l).endOffset == entityList.get(j).wordData.get(i).endOffset
                                && entityList.get(j).replaceWordData.get(l).startOffset == entityList.get(j).wordData.get(i).startOffset
                                && !entityList.get(j).replaceWordData.get(0).replaceWord.toLowerCase().startsWith("http")
                                && !entityList.get(j).replaceWordData.get(0).replaceWord.toLowerCase().contains("\"") && entityList.get(j).replaceWordData.get(0).replaceWord.length() > 1) {

                            if (!nameList.contains(entityList.get(j).replaceWordData.get(0).replaceWord.replaceAll("[^\\x20-\\x7e]", ""))) {
                                nameList.add(entityList.get(j).replaceWordData.get(0).replaceWord.replaceAll("[^\\x20-\\x7e]", ""));

                            }
                        }
                    }

                }
            }

        }
        return nameList;
    }

    public ArrayList<OldEntity> createEntityList(String pathName) throws ParserConfigurationException {

        ArrayList<OldEntity> entityList = new ArrayList();     // An ArrayList to store the entities in the XML file 
        String startChar = "";
        String endChar = "";
        String charSeq = "";
        String newWord = "";

        // Open up the XML file using Document builder and the supplied pathname
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = null;
        Document doc = null;
        dBuilder = dbFactory.newDocumentBuilder();
        try {
            doc = dBuilder.parse(removeSchema(pathName));
        } catch (Exception ex) {
            System.out.println("Cannot find pathName:\t" + pathName);
            System.out.flush();

        }
        doc.getDocumentElement().normalize();

        // For One of every OldEntity Object in the XML file, grab the necessary data
        NodeList entityNodeList = doc.getElementsByTagName("entity");
        for (int i = 0; i < entityNodeList.getLength(); i++) {
            Element entityNode = (Element) entityNodeList.item(i);

            // Create an Array List that will store the CharSeq information 
            ArrayList<CharSeq> charSeqList = new ArrayList();
            ArrayList<ReplaceWordData> replaceWordList = new ArrayList();
            String en_type = entityNode.getAttribute("TYPE");

            /*(1)*/// get the CHARSEQ items
            NodeList entityMentionList = entityNode.getElementsByTagName("entity_mention");
            for (int j = 0; j < entityMentionList.getLength(); j++) {

                Element extentNode = (Element) entityMentionList.item(j);
                // OBTAINED THE CHARSEQ NAMES
                charSeq = extentNode.getElementsByTagName("charseq").item(0).getTextContent();
                //System.out.println("CHARSEQ:\t" + extentNode.getElementsByTagName("charseq").item(0).getTextContent());
                //OBTAIN THE CHARSEQ NUMS
                NodeList charseqList = extentNode.getElementsByTagName("charseq");
                Element charseqNode = (Element) charseqList.item(0);
                startChar = charseqNode.getAttribute("START");
                endChar = charseqNode.getAttribute("END");
                //System.out.println("START:\t\t" + charseqNode.getAttribute("START"));
                //System.out.println("END:\t\t" + charseqNode.getAttribute("END"));
                CharSeq charNode = new CharSeq(Integer.parseInt(startChar), Integer.parseInt(endChar), charSeq);
                charSeqList.add(charNode);
            }

            /*(2)*/// Get the REPLACEWORD items
            try {

                NodeList attributeList = entityNode.getElementsByTagName("entity_attributes");
                Element attributeNode = (Element) attributeList.item(0);
                String pre_newWord = "";
                NodeList nameList = attributeNode.getElementsByTagName("name");
                for (int k = 0; k < nameList.getLength(); k++) {

                    //System.out.println("replaceWordList Length:\t" + replaceWordList.getLength());
                    // System.out.println("k:" + k);
                    /*THIS ZERO IN PLACE OF 'K' IN THE NAMELIST.ITEM IS SO WE GET ONLY THE FIRST NAME*/
                    Element nameNode = (Element) nameList.item(k);
                    //     System.out.println("NAME " + (k + 1) + ":\t\t" + nameNode.getAttribute("NAME"));

                    newWord = nameNode.getAttribute("NAME");

                    if (newWord.length() > pre_newWord.length() 
                            && !newWord.equalsIgnoreCase("New York London")) { //skip new york london by TL 11/09/2015
                        //NodeList offSetList = nameNode.getElementsByTagName("charseq");
//                        System.out.println("newWord: " + newWord);
                        pre_newWord = newWord;
                        //NodeList offSetList = nameNode.getElementsByTagName("charseq");
                        NodeList offSetList = nameNode.getElementsByTagName("charseq");

                        Element charseqNode = (Element) offSetList.item(0);

                        try {
                            startChar = charseqNode.getAttribute("START");

                        } catch (Exception ex) {
                            ex.printStackTrace();
                            System.out.println("\nERROR:");
                            System.out.flush();
                            System.exit(1);

                        }
                        endChar = charseqNode.getAttribute("END");

                        ReplaceWordData replaceNode = new ReplaceWordData(Integer.parseInt(startChar), Integer.parseInt(endChar), newWord);
                        replaceWordList.add(replaceNode);
                    }

                }
                OldEntity finalEntityNode = new OldEntity(replaceWordList, charSeqList, en_type);
                entityList.add(finalEntityNode);

            } catch (Exception ex) {

                //ex.printStackTrace();
                // System.out.println("\nERROR:" + prevLine+ "\n"+currLine);
                //  System.out.flush();
                //  System.exit(1);
                //      System.out.println("No Attributes");
            }
            //   System.out.println("\n");

        }
        return entityList;

    }

    public String removeSchema(String pathName) {

        System.out.println("removeschema:\t" + pathName);
        System.out.flush();
        CustomFileReader read = new CustomFileReader(pathName);
        CustomFileWriter write = new CustomFileWriter(pathName + ".xml");
        String currLine = "";
        while (read.hasNextLine()) {
            currLine = read.getNextLine();
            if (!currLine.contains("<!DOCTYPE source_file SYSTEM")) {
                write.println(currLine);
            }
        }
        read.closeFile();
        write.closeFile();
        return pathName + ".xml";
    }
}
