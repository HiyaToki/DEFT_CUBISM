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
import edu.albany.cubism.relation.Graph;
import edu.albany.cubism.relation.Node;
import edu.albany.cubism.sentiment.CustomFileReader;
import edu.albany.cubism.sentiment.CustomFileWriter;

/**
 *
 * @author Ting Liu
 */
public class NewswireFindAnnotation {

    ArrayList<OldEntity> entityList = null;
    ArrayList<OldRelation> relList = null;

    public String initialize(String pathName, String docID, String x, HashMap<String, String> docsFullHash, int startOffset, int endOffset, String sent) throws ParserConfigurationException {

        ArrayList<String> nameList = new ArrayList();
        if (this.entityList == null) {
            entityList = createEntityList(pathName);
        }
        if (this.relList == null) {
            relList = this.createRelationList(pathName);
        }
//        System.out.println("START WORD:\t" + x);
//        System.out.println("Doc StartOffset:\t" + startOffset);
//        System.out.println("Doc EndOffset:\t" + endOffset);
        int x_startx = sent.indexOf(x) + startOffset;
        int x_endx = x_startx + x.length();
        String rep_w_candidate = ""; //this one is extracted from intance
        String pre_rep_w_candidate = ""; //this one is the longest one in instance
        boolean found = false;
        for (int j = 0; j < entityList.size(); j++) {
            for (int i = 0; i < entityList.get(j).wordData.size(); i++) {
                if (entityList.get(j).wordData.get(i).startOffset >= startOffset && entityList.get(j).wordData.get(i).endOffset <= endOffset) {
                    for (int l = 0; l < entityList.get(j).replaceWordData.size(); l++) {
                        if (x_endx >= entityList.get(j).wordData.get(i).endOffset
                                && x_startx <= entityList.get(j).wordData.get(i).startOffset
                                && x.contains(entityList.get(j).wordData.get(i).keyWord.replaceAll("[\\s]+", " "))
                                || x_endx <= entityList.get(j).wordData.get(i).endOffset
                                && x_startx >= entityList.get(j).wordData.get(i).startOffset
                                && entityList.get(j).wordData.get(i).keyWord.replaceAll("[\\s]+", " ").contains(x)
                                || (x_endx <= entityList.get(j).wordData.get(i).endOffset
                                && x_endx >= entityList.get(j).wordData.get(i).startOffset
                                || x_startx <= entityList.get(j).wordData.get(i).endOffset
                                && x_startx >= entityList.get(j).wordData.get(i).startOffset)
                                && (entityList.get(j).wordData.get(i).keyWord.replaceAll("[\\s]+", " ").contains(x)
                                || x.contains(entityList.get(j).wordData.get(i).keyWord.replaceAll("[\\s]+", " ")))) {
                            found = true;
                            pre_rep_w_candidate = entityList.get(j).pref_rpw.replaceWord;
                            if ((x_endx <= entityList.get(j).replaceWordData.get(l).endOffset
                                    && x_endx >= entityList.get(j).replaceWordData.get(l).startOffset
                                    || x_startx <= entityList.get(j).replaceWordData.get(l).endOffset
                                    && x_startx >= entityList.get(j).replaceWordData.get(l).startOffset)) {
                                rep_w_candidate = entityList.get(j).replaceWordData.get(l).replaceWord;
                            }
                        }
                    }
                }
            }

        }
        if (pre_rep_w_candidate.split("[\\s]+").length > rep_w_candidate.split("[\\s]+").length) {
            rep_w_candidate = pre_rep_w_candidate;
        }
        System.out.println("Replace Word:\t" + pre_rep_w_candidate);
        System.out.println("String x:\t" + x);
        return rep_w_candidate;
    }

    public ArrayList<ArrayList<Integer>> getEnInstanceOffset(String en, String pathName, int offset_s, int offset_e, String sentence) {
        ArrayList<OldEntity> entityList = this.EnLists.get(pathName);//new ArrayList();     // An ArrayList to store the entities in the XML file          
        if (entityList == null) {
            try {
                entityList = createEntityList(pathName);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        ArrayList<ArrayList<Integer>> offsets = new ArrayList();
        for (OldEntity entity : entityList) {
            boolean found = false;
            for (ReplaceWordData rwd : entity.replaceWordData) {
                if (rwd.replaceWord.equalsIgnoreCase(en)) {
                    found = true;
                    break;
                }
            }
            if (found) {
                for (CharSeq chs : entity.wordData) {
                    if ((chs.startOffset >= offset_s && chs.startOffset <= offset_e
                            || chs.endOffset >= offset_s && chs.endOffset <= offset_e)
                            && chs.endOffset - offset_s <= offset_e - offset_s
                            && chs.endOffset <= offset_e
                            && chs.endOffset - offset_s <= sentence.length()) {
                        ArrayList offset = new ArrayList();
                        offset.add(chs.startOffset);
                        offset.add(chs.endOffset);
                        offsets.add(offset);
                    }
                }
            }
        }
        return offsets;
    }

    public ArrayList<String> getEnInstances(String en, String pathName, int offset_s, int offset_e, String sentence) {
        ArrayList<OldEntity> entityList = this.EnLists.get(pathName);//new ArrayList();     // An ArrayList to store the entities in the XML file          
        if (entityList == null) {
            try {
                entityList = createEntityList(pathName);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("en: " + en);
        System.out.println("offset_s: " + offset_s);
        System.out.println("offset_e: " + offset_e);
        ArrayList<String> offsets = new ArrayList();
        for (OldEntity entity : entityList) {
            boolean found = false;
            for (ReplaceWordData rwd : entity.replaceWordData) {
                if (rwd.replaceWord.equalsIgnoreCase(en)) {
                    found = true;
                    break;
                }
            }
            //For annotated answer "The Human Right Councile" contains more than entity words "Human Right Councile" by TL 04/02/2015
            if (!found) {
                if (en.contains(entity.pref_rpw.replaceWord)) {
                    found = true;
                }
            }
            if (found) {
                for (CharSeq chs : entity.wordData) {
                    System.out.println("wordData Key: " + chs.keyWord);
                    System.out.println("wordData start: " + chs.startOffset);
                    System.out.println("wordData end: " + chs.endOffset);

                    if ((chs.startOffset >= offset_s && chs.startOffset <= offset_e
                            || chs.endOffset >= offset_s && chs.endOffset <= offset_e)
                            && (sentence.contains(chs.keyWord.replaceAll("[\\s]+", " "))
                            || sentence.contains(chs.keyWord))) {
                        offsets.add(chs.keyWord);
                    }
                }
            }
        }
        return offsets;
    }

    /**
     * add entities into tree, input en has no use here
     */
    public void findEnInstances(String pathName, int offset_s, int offset_e, String sentence, Graph sent_graph) {
        ArrayList<OldEntity> entityList = this.EnLists.get(pathName);//new ArrayList();     // An ArrayList to store the entities in the XML file        
        System.out.println("pathname: " + pathName);
        if (entityList == null) {
            try {
                entityList = createEntityList(pathName);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("offset_s: " + offset_s);
        System.out.println("offset_e: " + offset_e);
        for (OldEntity entity : entityList) {
            for (CharSeq chs : entity.wordData) {

                if ((chs.startOffset >= offset_s && chs.startOffset <= offset_e
                        || chs.endOffset >= offset_s && chs.endOffset <= offset_e)
                        && (sentence.contains(chs.keyWord.replaceAll("[\\s]+", " "))
                        || sentence.contains(chs.keyWord))) {
                    int offset = chs.startOffset;
                    if (offset < 0) {
                        offset = 0;
                    }
//                    System.out.println("wordData Key: " + chs.keyWord);
//                    System.out.println("wordData start: " + chs.startOffset);
//                    System.out.println("wordData end: " + chs.endOffset);
//                    System.out.println("offset: " + offset);
                    Node en_head = sent_graph.getHead(chs.keyWord, offset, offset + chs.keyWord.length());
//                    System.out.println("find entity mentions: " + chs.keyWord);
                    if (en_head != null) {
//                        System.out.println("en_head: " + en_head.getName());
//			System.out.println("en_offset: " + en_head.getStartx());
//                        System.out.println("entity replaceWordData: " + entity.replaceWordData.toString());
                        en_head.setEntity(chs);
                        en_head.setEntityRefs(entity.replaceWordData);
                    } else {
//                        System.out.println("no en head found!");
                    }

                }
            }
        }
    }

    /**
     * add entities into tree, input en has no use here
     */
    public void findRelInstances(String pathName, int offset_s, int offset_e, String sentence, Graph sent_graph) {
        ArrayList<OldRelation> relList = this.RelLists.get(pathName);//new ArrayList();     // An ArrayList to store the entities in the XML file        
        System.out.println("pathname: " + pathName);
        if (relList == null) {
            try {
                relList = createRelationList(pathName);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("offset_s: " + offset_s);
        System.out.println("offset_e: " + offset_e);
        for (OldRelation rel : relList) {
            for (OldRelationMention relMen : rel.relMens) {

                if ((relMen.startOffset >= offset_s && relMen.startOffset <= offset_e
                        || relMen.endOffset >= offset_s && relMen.endOffset <= offset_e)
                        && (sentence.contains(relMen.context.replaceAll("[\\s]+", " "))
                        || sentence.contains(relMen.context))) {
                    int offset = relMen.startOffset;
                    if (offset < 0) {
                        offset = 0;
                    }
                    System.out.println("relation mention context: " + relMen.context);
                    System.out.println("relation mention start: " + relMen.startOffset);
                    System.out.println("relation mention end: " + relMen.endOffset);
                    System.out.println("offset: " + offset);
                    Node en_head = sent_graph.getHead(relMen.context, offset, offset + relMen.context.length());
                    System.out.println("find relation mentions: " + relMen.context);
                    if (en_head != null) {
                        System.out.println("rel_mention_head: " + en_head.getName());
			System.out.println("rel_mention_offset: " + en_head.getStartx());
                        System.out.println("relation : " + rel.type);
                        en_head.setRelMen(relMen);
                        en_head.setRel(rel);
                    } else {
//                        System.out.println("no en head found!");
                    }

                }
            }
        }
    }

    public ArrayList<OldEntity> createEntityList(String pathName) throws ParserConfigurationException {
        //added by TL to improve system process speed
        ArrayList<OldEntity> entityList = this.EnLists.get(pathName);//new ArrayList();     // An ArrayList to store the entities in the XML file 
        if (entityList == null) {
            entityList = new ArrayList();
            EnLists.put(pathName, entityList);
        } else {
            return entityList;
        }
        //done adding
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
            doc = dBuilder.parse((pathName));
        } catch (Exception ex) {
            System.out.println("Cannot find pathName:\t" + pathName);
            System.out.flush();

        }
        doc.getDocumentElement().normalize();

        // For One of every OldEntity Object in the XML file, grab the necessary data
        NodeList entityNodeList = doc.getElementsByTagName("entity");
        for (int i = 0; i < entityNodeList.getLength(); i++) {
            Element entityNode = (Element) entityNodeList.item(i);
            String en_type = entityNode.getAttribute("TYPE");
            String en_id = entityNode.getAttribute("ID");
//            if (!(en_type.equals("PER")
//                    || en_type.equals("GPE")
//                    || en_type.equals("ORG"))) {
//                continue;
//            }
            // Create an Array List that will store the CharSeq information 
            ArrayList<CharSeq> charSeqList = new ArrayList();
            ArrayList<ReplaceWordData> replaceWordList = new ArrayList();

            /*(1)*/// get the CHARSEQ items
            NodeList entityMentionList = entityNode.getElementsByTagName("entity_mention");
            for (int j = 0; j < entityMentionList.getLength(); j++) {

//                Element extentNode = (Element) entityMentionList.item(j);
                Element mentionNode = (Element) entityMentionList.item(j);
                String mention_id = mentionNode.getAttribute("ID");
                //added by TL since some time extent is too long 03_25_15
//                if (extentNode.getTagName().equals("extent")) {
//                    continue;
//                }
//                //end of adding by TL
//                // OBTAINED THE CHARSEQ NAMES
//                charSeq = extentNode.getElementsByTagName("charseq").item(0).getTextContent();
//                //System.out.println("CHARSEQ:\t" + extentNode.getElementsByTagName("charseq").item(0).getTextContent());
//                //OBTAIN THE CHARSEQ NUMS
//                NodeList charseqList = extentNode.getElementsByTagName("charseq");
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
//                System.out.println("CHARSEQ:\t" + mentionNode.getElementsByTagName("charseq").item(0).getTextContent());
                //OBTAIN THE CHARSEQ NUMS
                NodeList charseqList = headNode.getElementsByTagName("charseq");
                Element charseqNode = (Element) charseqList.item(0);
                startChar = charseqNode.getAttribute("START");
                endChar = charseqNode.getAttribute("END");
//                System.out.println("START:\t\t" + charseqNode.getAttribute("START"));
//                System.out.println("END:\t\t" + charseqNode.getAttribute("END"));
                CharSeq charNode = new CharSeq(Integer.parseInt(startChar), Integer.parseInt(endChar), charSeq, mention_id);
                charSeqList.add(charNode);
            }

            /*(2)*/// Get the REPLACEWORD items
            try {

                NodeList attributeList = entityNode.getElementsByTagName("entity_attributes");
                Element attributeNode = (Element) attributeList.item(0);
                if (attributeNode != null) {
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
                        //added by TL to keep only the first longest phrase to represent the entity 03_24_15
//                        if (replaceWordList.size() == 0) {
//                            replaceWordList.add(replaceNode);
//                        } else if (newWord.split("[\\s]+").length > replaceWordList.get(0).replaceWord.split("[\\s]+").length) { //edit by TL to keep the entity representation for most number of words 03_24_15
//                            replaceWordList.set(0, replaceNode);
//                        }
                        replaceWordList.add(replaceNode);
                    }
                }
                OldEntity finalEntityNode = null;
                if (replaceWordList.size() != 0) {
                    finalEntityNode = new OldEntity(replaceWordList, charSeqList, en_type, en_id);
                } else {
                    finalEntityNode = new OldEntity(replaceWordList, charSeqList, en_type, en_id);
                }
                entityList.add(finalEntityNode);

            } catch (Exception ex) {

                ex.printStackTrace();
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

        ArrayList<OldRelation> relationList = this.RelLists.get(pathName);//new ArrayList();     // An ArrayList to store the entities in the XML file 
        if (relationList != null) {
            return relationList;
        }
        relationList = new ArrayList();
        RelLists.put(pathName, relationList);
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

    public String removeSchema(String pathName) {

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

    private HashMap<String, ArrayList<OldEntity>> EnLists = new HashMap();
    private HashMap<String, ArrayList<OldRelation>> RelLists = new HashMap();
}
