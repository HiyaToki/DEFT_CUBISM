/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.albany.cubism.sentiment;

import edu.albany.cubism.sentiment.CustomFileReader;
import edu.albany.cubism.sentiment.CustomFileReader;
import edu.albany.cubism.sentiment.CustomFileWriter;
import edu.albany.cubism.sentiment.CustomFileWriter;
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
import edu.albany.cubism.ie.Argument;
import edu.albany.cubism.ie.CharSeq;
import edu.albany.cubism.ie.OldEntity;
import edu.albany.cubism.ie.OldRelation;
import edu.albany.cubism.ie.OldRelationMention;
import edu.albany.cubism.ie.ReplaceWordData;
import edu.albany.cubism.sentiment.CustomFileReader;
import edu.albany.cubism.sentiment.CustomFileWriter;

/**
 *
 * @author jrgiarrusso
 */
public class NewswireFindPreAnnotation {

    ArrayList<OldEntity> entityList = null;
    ArrayList<OldRelation> relList = null;

    public ArrayList<OldEntity> initializeNew(String pathName, String docID, String x) throws ParserConfigurationException {

        ArrayList<String> nameList = new ArrayList();
        if (this.entityList == null) {
            entityList = createEntityList(pathName);
        }
        /*
        if (this.relList == null) {
            relList = this.createRelationList(pathName);
        }
        */
//        System.out.println("START WORD:\t" + x);
//        System.out.println("Doc StartOffset:\t" + startOffset);
//        System.out.println("Doc EndOffset:\t" + endOffset);

        for (int j = 0; j < entityList.size(); j++) {
            for (int i = 0; i < entityList.get(j).wordData.size(); i++) {
                for (int l = 0; l < entityList.get(j).replaceWordData.size(); l++) {
//                        System.out.println("Replace Word:\t" + entityList.get(j).replaceWordData.get(l).replaceWord);
//                        System.out.println("WordData Word:\t" + entityList.get(j).wordData.get(i).keyWord);
                    if (entityList.get(j).replaceWordData.get(l).endOffset == entityList.get(j).wordData.get(i).endOffset
                            && entityList.get(j).replaceWordData.get(l).startOffset == entityList.get(j).wordData.get(i).startOffset
                            && x.contains(entityList.get(j).wordData.get(i).keyWord)) {

//                            System.out.println("Replace Word:\t" + entityList.get(j).replaceWordData.get(l).replaceWord);
//                            System.out.println("WordData Word:\t" + entityList.get(j).wordData.get(i).keyWord);
//                            System.out.println("String x:\t" + x);
//                            System.out.println("IT MATCHES!");
//                            System.out.println("keyWord:\t" + entityList.get(j).wordData.get(i).keyWord);
//                            System.out.println(x + " -> " + entityList.get(j).replaceWordData.get(l).replaceWord);
                        return entityList;

                    }
                }
            }

        }
        return entityList;
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
            doc = dBuilder.parse(pathName); //CS
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
            String id = entityNode.getAttribute("ID");
            //added by TL since some time extent is too long 03_30_15

            /*(1)*/// get the CHARSEQ items
            NodeList entityMentionList = entityNode.getElementsByTagName("entity_mention");
            for (int j = 0; j < entityMentionList.getLength(); j++) {
                Element mentionNode = (Element) entityMentionList.item(j);
                NodeList headNodes = mentionNode.getElementsByTagName("head");
                String mention_id = mentionNode.getAttribute("ID");
                if (headNodes == null) {
                    continue;
                }
                Element headNode = (Element) headNodes.item(0);
//                if (mentionNode.getTagName().equals("extent")) {
//                    continue;
//                } 
//                System.out.println("tag name: " + headNode.getTagName());
                // OBTAINED THE CHARSEQ NAMES
                charSeq = headNode.getElementsByTagName("charseq").item(0).getTextContent();
                //System.out.println("CHARSEQ:\t" + mentionNode.getElementsByTagName("charseq").item(0).getTextContent());
                //OBTAIN THE CHARSEQ NUMS
                NodeList charseqList = headNode.getElementsByTagName("charseq");
                Element charseqNode = (Element) charseqList.item(0);
                startChar = charseqNode.getAttribute("START");
                endChar = charseqNode.getAttribute("END");
                //System.out.println("START:\t\t" + charseqNode.getAttribute("START"));
                //System.out.println("END:\t\t" + charseqNode.getAttribute("END"));
                CharSeq charNode = new CharSeq(Integer.parseInt(startChar), Integer.parseInt(endChar), charSeq, mention_id);
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
//                    if (newWord.length() > pre_newWord.length()) {
                    //NodeList offSetList = nameNode.getElementsByTagName("charseq");
//                        System.out.println("newWord: " + newWord);
                    pre_newWord = newWord;
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
                    if (replaceWordList.size() == 0) {
                        replaceWordList.add(replaceNode);
                    } else if (newWord.split("[\\s]+").length > replaceWordList.get(0).replaceWord.split("[\\s]+").length) { //edit by TL to keep the entity representation for most number of words 03_24_15
                        replaceWordList.set(0, replaceNode);
                    }
//                    }
                }
                OldEntity finalEntityNode = new OldEntity(replaceWordList, charSeqList, en_type, id);
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

    public ArrayList<OldRelation> createRelationList(String pathName) throws ParserConfigurationException {

        ArrayList<OldRelation> relationList = new ArrayList();     // An ArrayList to store the entities in the XML file 
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
            doc = dBuilder.parse(pathName); //CS
        } catch (Exception ex) {
            System.out.println("Cannot find pathName:\t" + pathName);
            System.out.flush();

        }
        doc.getDocumentElement().normalize();

        // For One of every OldEntity Object in the XML file, grab the necessary data
        NodeList relationNodeList = doc.getElementsByTagName("relation");
        for (int i = 0; i < relationNodeList.getLength(); i++) {
            Element relationNode = (Element) relationNodeList.item(i);

            // Create an Array List that will store the CharSeq information 
            ArrayList<OldRelationMention> relMenList = new ArrayList();
            ArrayList<ReplaceWordData> replaceWordList = new ArrayList();
            String rel_type = relationNode.getAttribute("TYPE");
            String rel_sub_type = relationNode.getAttribute("SUBTYPE");
            String id = relationNode.getAttribute("ID");
            //added by TL since some time extent is too long 03_30_15
            NodeList relationArgumentList = relationNode.getElementsByTagName("relation_argument");
            ArrayList<Argument> rel_args = new ArrayList();
            for (int k = 0; k < relationArgumentList.getLength(); k++) {
                Element argumentNode = (Element) relationArgumentList.item(k);
                String ref_id = argumentNode.getAttribute("REFID");
                String role = argumentNode.getAttribute("ROLE");
                Argument arg = new Argument(ref_id, role, -1, -1, null);
                arg.setRelRefId(id);
                rel_args.add(arg);
            }

            /*(1)*/// get the CHARSEQ items
            NodeList relationMentionList = relationNode.getElementsByTagName("relation_mention");
            for (int j = 0; j < relationMentionList.getLength(); j++) {
                Element mentionNode = (Element) relationMentionList.item(j);
                String mention_id = mentionNode.getAttribute("ID");
//                if (mentionNode.getTagName().equals("extent")) {
//                    continue;
//                } 
//                System.out.println("tag name: " + headNode.getTagName());
                // OBTAINED THE CHARSEQ NAMES
                //System.out.println("CHARSEQ:\t" + mentionNode.getElementsByTagName("charseq").item(0).getTextContent());
                //OBTAIN THE CHARSEQ NUMS
                Element headNode = (Element) mentionNode.getElementsByTagName("extent").item(0);
                String content = headNode.getElementsByTagName("charseq").item(0).getTextContent();
                int startx = Integer.parseInt(((Element) headNode.getElementsByTagName("charseq").item(0)).getAttribute("START"));
                int endx = Integer.parseInt(((Element) headNode.getElementsByTagName("charseq").item(0)).getAttribute("END"));
                NodeList charseqList = mentionNode.getElementsByTagName("relation_mention_argument");
                ArrayList<Argument> args = new ArrayList();
                for (int k = 0; k < charseqList.getLength(); k++) {
                    Element argumentNode = (Element) charseqList.item(k);
                    String ref_id = argumentNode.getAttribute("REFID");
                    String role = argumentNode.getAttribute("ROLE");
                    Element arg_headNode = (Element) mentionNode.getElementsByTagName("extent").item(0);
                    String arg_content = arg_headNode.getElementsByTagName("charseq").item(0).getTextContent();
                    System.out.println("arg_content: " + arg_content);
                    int arg_startx = Integer.parseInt(((Element) headNode.getElementsByTagName("charseq").item(0)).getAttribute("START"));
                    int arg_endx = Integer.parseInt(((Element) headNode.getElementsByTagName("charseq").item(0)).getAttribute("END"));
                    Argument arg = new Argument(ref_id, role, arg_startx, arg_endx, arg_content);
                    arg.setRelRefId(mention_id);
                    args.add(arg);
                }
                //System.out.println("START:\t\t" + charseqNode.getAttribute("START"));
                //System.out.println("END:\t\t" + charseqNode.getAttribute("END"));
                OldRelationMention rel_men = new OldRelationMention(startx, endx, content, args, mention_id);
                relMenList.add(rel_men);
            }

            /*(2)*/// Get the REPLACEWORD items
            OldRelation rel = new OldRelation(rel_type, rel_sub_type, id, rel_args, relMenList);
            relationList.add(rel);

        }
        return relationList;

    }

    public ArrayList<OldEntity> initialize(String pathName, String docID, String x) throws ParserConfigurationException {

        ArrayList<String> nameList = new ArrayList();
        ArrayList<OldEntity> entityList = createEntityList(pathName);
//        System.out.println("START WORD:\t" + x);
//        System.out.println("Doc StartOffset:\t" + startOffset);
//        System.out.println("Doc EndOffset:\t" + endOffset);

        for (int j = 0; j < entityList.size(); j++) {
            for (int i = 0; i < entityList.get(j).wordData.size(); i++) {
                for (int l = 0; l < entityList.get(j).replaceWordData.size(); l++) {
//                        System.out.println("Replace Word:\t" + entityList.get(j).replaceWordData.get(l).replaceWord);
//                        System.out.println("WordData Word:\t" + entityList.get(j).wordData.get(i).keyWord);
                    if (entityList.get(j).replaceWordData.get(l).endOffset == entityList.get(j).wordData.get(i).endOffset
                            && entityList.get(j).replaceWordData.get(l).startOffset == entityList.get(j).wordData.get(i).startOffset
                            && x.contains(entityList.get(j).wordData.get(i).keyWord)) {

//                            System.out.println("Replace Word:\t" + entityList.get(j).replaceWordData.get(l).replaceWord);
//                            System.out.println("WordData Word:\t" + entityList.get(j).wordData.get(i).keyWord);
//                            System.out.println("String x:\t" + x);
//                            System.out.println("IT MATCHES!");
//                            System.out.println("keyWord:\t" + entityList.get(j).wordData.get(i).keyWord);
//                            System.out.println(x + " -> " + entityList.get(j).replaceWordData.get(l).replaceWord);
                        return entityList;

                    }
                }
            }

        }
        return entityList;
    }

    public ArrayList<OldEntity> createEntityListNew(String pathName) throws ParserConfigurationException {

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
            String id = entityNode.getAttribute("ID");
            //added by TL since some time extent is too long 03_30_15

            /*(1)*/// get the CHARSEQ items
            NodeList entityMentionList = entityNode.getElementsByTagName("entity_mention");
            for (int j = 0; j < entityMentionList.getLength(); j++) {
                Element mentionNode = (Element) entityMentionList.item(j);
                String mention_id = mentionNode.getAttribute("ID");
                NodeList headNodes = mentionNode.getElementsByTagName("head");
                if (headNodes == null) {
                    continue;
                }
                Element headNode = (Element) headNodes.item(0);
//                if (mentionNode.getTagName().equals("extent")) {
//                    continue;
//                } 
//                System.out.println("tag name: " + headNode.getTagName());
                // OBTAINED THE CHARSEQ NAMES
                charSeq = headNode.getElementsByTagName("charseq").item(0).getTextContent();
                //System.out.println("CHARSEQ:\t" + mentionNode.getElementsByTagName("charseq").item(0).getTextContent());
                //OBTAIN THE CHARSEQ NUMS
                NodeList charseqList = headNode.getElementsByTagName("charseq");
                Element charseqNode = (Element) charseqList.item(0);
                startChar = charseqNode.getAttribute("START");
                endChar = charseqNode.getAttribute("END");
                //System.out.println("START:\t\t" + charseqNode.getAttribute("START"));
                //System.out.println("END:\t\t" + charseqNode.getAttribute("END"));
                CharSeq charNode = new CharSeq(Integer.parseInt(startChar), Integer.parseInt(endChar), charSeq, mention_id);
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
//                    if (newWord.length() > pre_newWord.length()) {
                    //NodeList offSetList = nameNode.getElementsByTagName("charseq");
//                        System.out.println("newWord: " + newWord);
                    pre_newWord = newWord;
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
                    if (replaceWordList.size() == 0) {
                        replaceWordList.add(replaceNode);
                    } else if (newWord.split("[\\s]+").length > replaceWordList.get(0).replaceWord.split("[\\s]+").length) { //edit by TL to keep the entity representation for most number of words 03_24_15
                        replaceWordList.set(0, replaceNode);
                    }
//                    }
                }
                OldEntity finalEntityNode = new OldEntity(replaceWordList, charSeqList, en_type, id);
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

        CustomFileReader read = new CustomFileReader(pathName);
        //String apath="/home/cslin/ILS-Projects/KBPSentimentEvaluation_2014/conf/Sentiment/Data/2014evaluation/batchNewswire";
        //pathName=apath+pathName.substring(pathName.lastIndexOf("/"), pathName.length());
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
