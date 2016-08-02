/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.albany.cubism.ie;

import edu.albany.cubism.relation.Graph;
import edu.albany.cubism.relation.Node;
import edu.albany.cubism.relation.Utterance;
import edu.albany.cubism.sentiment.CustomFileReader;
import edu.albany.cubism.util.Settings;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

/**
 *
 * @author ting
 */
public class BoltDocument extends CubismDocument {

    public ArrayList<Entity> ereEntities = new ArrayList();
    public ArrayList<Relation> ereRelations = new ArrayList();
    public ArrayList<Event> ereEvents = new ArrayList();

    public void parseDocument(String docPathName) {

        StringBuilder totalDocBuilder = new StringBuilder();        // A string that will hold the entire document
        CustomFileReader read = new CustomFileReader(docPathName);  // Open up the file found earlier
        String offsetSentence;
        String currLine = "\n";                                     // The line before looking at the next
        String nextLine = "\n";                                     // The currently read line
        String totalDoc;                                            // A string to hold the document in the document id  
        boolean endOfDoc = false;                                   // Tells us if we are at the end of the document
        String docid = null;

        // While there is a another line to be read in the file and
        // we haven't gotten to the end of the needed document
        while (read.hasNextLine() && !endOfDoc) {
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
                this.oriDoc = totalDoc;

                offsetSentence = "";

                // Store the excerpt from the document into the assessDocsSentenceHash
                System.out.println("docId to put: " + docid);
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
                docid = nextLine.substring(nextLine.indexOf("doc id=") + 7, nextLine.lastIndexOf("\">"));
                this.name = docid;
            }

        }
    }

    /**
     * get uri of annotated file
     */
    public String getAnnotationURI(String docid, String path) {
        File[] ann_list = new File(path).listFiles();
        for (File ann : ann_list) {
            if (ann.getName().contains(docid)) {
                return ann.getAbsolutePath();
            }
        }
        return null;
    }

    public void decideParse(String currLine, String nextLine, StringBuilder totalDoc) {

        //Decide where to start appending to the total document string
        if (nextLine.startsWith("<DOCID> ")) {
            totalDoc.append(currLine);
            totalDoc.append(nextLine);
        }
        if (nextLine.startsWith("<DOC ") || nextLine.startsWith("<doc ")) {
            totalDoc.append(nextLine);
            //added by TL 04/29/15 for no return of <headline> in forum data
            totalDoc.append("\n");
        }
    }

    public ArrayList<Entity> createEREEntityList(String docName, String erepath) {
        String fullpath = erepath + docName + ".rich_ere.xml";
        System.out.println("fullpath: " + fullpath);
        this.ereEntities = EREParser.findEntities(fullpath);
        return this.ereEntities;
    }
    
    public EntityMention getEREEntityMention(String enm_id) {
        for (Entity e: ereEntities) {
            ArrayList<EntityMention> ems = e.getEntityMentions();
            for (EntityMention em: ems) {
                if (em.getEntityMentionId().equalsIgnoreCase(enm_id)) {
                    return em;
                }
            }
        }
        return null;
    }

    public ArrayList<Event> createEREEventList(String docName, String ere_path) {
        String fullpath = ere_path + docName + ".rich_ere.xml";
        this.events = EREParser.findEvents(fullpath);
        return this.events;
    }

    public ArrayList<Relation> createERERelationList(String docName , String ere_path) {
        String fullpath = ere_path + docName + ".rich_ere.xml";
        this.ereRelations = EREParser.findRelations(fullpath);
        return this.ereRelations;
    }

    public ArrayList<OldEntity> createEntityList(String docName) throws ParserConfigurationException {
        //added by TL to improve system process speed
        if (this.entities != null) {
            return this.entities;
        }
        entities = new ArrayList();
        //done adding
        String startChar = "";
        String endChar = "";
        String charSeq = "";
        String newWord = "";
        docName = Settings.getValue("kbp_data_path") + "/2014evaluation/batchForum/" + docName + ".sgm.apf.xml";
        // Open up the XML file using Document builder and the supplied pathname
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = null;
        Document doc = null;
        dBuilder = dbFactory.newDocumentBuilder();
        try {
            doc = dBuilder.parse((docName));
        } catch (Exception ex) {
            System.out.println("Cannot find pathName:\t" + docName);
            System.out.flush();

        }
        doc.getDocumentElement().normalize();

        // For One of every OldEntity Object in the XML file, grab the necessary data
        NodeList entityNodeList = doc.getElementsByTagName("entity");
        for (int i = 0; i < entityNodeList.getLength(); i++) {
            Element entityNode = (Element) entityNodeList.item(i);
            String en_type = entityNode.getAttribute("TYPE");
            String en_id = entityNode.getAttribute("ID");
            // Create an Array List that will store the CharSeq information 
            ArrayList<CharSeq> charSeqList = new ArrayList();
            ArrayList<ReplaceWordData> replaceWordList = new ArrayList();

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
                // OBTAINED THE CHARSEQ NAMES
                charSeq = headNode.getElementsByTagName("charseq").item(0).getTextContent();
//                System.out.println("CHARSEQ:\t" + mentionNode.getElementsByTagName("charseq").item(0).getTextContent());
                //OBTAIN THE CHARSEQ NUMS
                NodeList charseqList = headNode.getElementsByTagName("charseq");
                Element charseqNode = (Element) charseqList.item(0);
                startChar = charseqNode.getAttribute("START");
                endChar = charseqNode.getAttribute("END");
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

                        /*THIS ZERO IN PLACE OF 'K' IN THE NAMELIST.ITEM IS SO WE GET ONLY THE FIRST NAME*/
                        Element nameNode = (Element) nameList.item(k);
                        newWord = nameNode.getAttribute("NAME");
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
                entities.add(finalEntityNode);

            } catch (Exception ex) {

                ex.printStackTrace();
            }
        }
        return entities;

    }

    public ArrayList<OldRelation> createRelationList(String docName) throws ParserConfigurationException {

        if (relations != null) {
            return relations;
        }
        relations = new ArrayList();
        String startChar = "";
        String endChar = "";
        String charSeq = "";
        String newWord = "";

        docName = Settings.getValue("kbp_data_path") + "/2014evaluation/batchForum/" + docName + ".sgm.apf.xml";
        // Open up the XML file using Document builder and the supplied pathname
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = null;
        Document doc = null;
        dBuilder = dbFactory.newDocumentBuilder();
        try {
            doc = dBuilder.parse(docName); //CS
        } catch (Exception ex) {
            System.out.println("Cannot find pathName:\t" + docName);
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
                OldRelationMention rel_men = new OldRelationMention(startx, endx, content, args, mention_id);
                relMenList.add(rel_men);
            }

            OldRelation rel = new OldRelation(rel_type, rel_sub_type, id, rel_args, relMenList);
            relations.add(rel);

        }
        return relations;

    }

    /**
     * add entities into tree, input en has no use here
     */
    public void findEnInstances(int offset_s, int offset_e, String sentence, Graph sent_graph) {
        String pathName = this.name;
        if (this.entities == null) {
            try {
                entities = createEntityList(pathName);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("offset_s: " + offset_s);
        System.out.println("offset_e: " + offset_e);
        for (OldEntity entity : entities) {
            for (CharSeq chs : entity.wordData) {

                if ((chs.startOffset >= offset_s && chs.startOffset <= offset_e
                        || chs.endOffset >= offset_s && chs.endOffset <= offset_e)
                        && (sentence.contains(chs.keyWord.replaceAll("[\\s]+", " "))
                        || sentence.contains(chs.keyWord))) {
                    int offset = chs.startOffset;
                    if (offset < 0) {
                        offset = 0;
                    }
                    System.out.println("wordData Key: " + chs.keyWord);
                    System.out.println("wordData start: " + chs.startOffset);
                    System.out.println("wordData end: " + chs.endOffset);
                    System.out.println("offset: " + offset);
                    Node en_head = sent_graph.getHead(chs.keyWord, offset, offset + chs.keyWord.length());
                    System.out.println("find entity mentions: " + chs.keyWord);
                    if (en_head != null) {
                        System.out.println("en_head: " + en_head.getName());
                        System.out.println("en_offset: " + en_head.getStartx());
                        System.out.println("entity replaceWordData: " + entity.replaceWordData.toString());
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
    public void findEREEnInstances(int offset_s, int offset_e, String sentence, Graph sent_graph, String ere_path) {
        String pathName = this.name;
        if (this.ereEntities == null) {
            try {
                ereEntities = createEREEntityList(pathName, ere_path);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("offset_s: " + offset_s);
        System.out.println("offset_e: " + offset_e);
        for (Entity entity : ereEntities) {
            for (EntityMention chs : entity.entityMentions) {

                if ((chs.getEntityMentionOffset() >= offset_s && chs.getEntityMentionOffset() <= offset_e
                        || chs.getEntityMentionOffset() + chs.getEntityMentionLength() >= offset_s && chs.getEntityMentionOffset() + chs.getEntityMentionLength() <= offset_e)
                        && (sentence.contains(chs.getEntityMentionText().replaceAll("[\\s]+", " "))
                        || sentence.contains(chs.getEntityMentionText()))) {
                    int offset = chs.getEntityMentionOffset();
                    if (offset < 0) {
                        offset = 0;
                    }
                    System.out.println("wordData Key: " + chs.getEntityMentionText());
                    System.out.println("wordData start: " + chs.getEntityMentionOffset());
                    System.out.println("wordData end: " + (chs.getEntityMentionOffset() + chs.getEntityMentionLength()));
                    System.out.println("offset: " + offset);
                    NomHead nh = chs.getNomHead();
                    Node en_head = null;
                    if (nh != null) {
                        en_head = sent_graph.getHead(nh.getText(), nh.getOffset(), nh.getOffset() + nh.getLength());
                    } else {
                        en_head = sent_graph.getHead(chs.getEntityMentionText(), offset, offset + chs.getEntityMentionText().length());
                    }
                    System.out.println("find entity mentions: " + chs.getEntityMentionText());
                    System.out.println("entity mention id: " + chs.getEntityMentionId() + "/" + chs.getParent().getEntityId());
                    if (en_head != null) {
                        System.out.println("en_head: " + en_head.getName());
                        System.out.println("en_offset: " + en_head.getStartx());
                        en_head.setEre_entity(chs);
                    } else {
//                        System.out.println("no en head found!");
                    }

                }
            }
        }
    }

    /**
     * add relations into tree, input en has no use here
     */
    public void findERERelInstances(int offset_s, int offset_e, String sentence, Graph sent_graph, String ere_path) {
        String pathName = this.name;
        ArrayList<Relation> relList = this.ereRelations;
        if (relList == null) {
            try {
                relList = createERERelationList(pathName, ere_path);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        for (Relation rel : relList) {
            for (RelationMention relMen : rel.getRms()) {
                Trigger trigger = relMen.getTrigger();
                int startx = trigger.getOffset();
                int endx = trigger.getOffset() + trigger.getLength();
                if ((startx >= offset_s && startx <= offset_e
                        || endx >= offset_s && endx <= offset_e)
                        && (sentence.contains(trigger.getText().replaceAll("[\\s]+", " ")))) {
                    int offset = startx;
                    if (offset < 0) {
                        offset = 0;
                    }
                    System.out.println("relation mention trigger context: " + trigger.getText());
                    System.out.println("relation mention trigger start: " + startx);
                    System.out.println("relation mention trigger end: " + endx);
                    System.out.println("offset: " + offset);
                    Node en_head = sent_graph.getHead(trigger.getText(), startx, endx);
                    if (en_head != null) {
                        System.out.println("rel_trigger_mention_head: " + en_head.getName());
                        System.out.println("rel_trigger_mention_offset: " + en_head.getStartx());
                        System.out.println("relation : " + rel.getType());
                        en_head.setEreRelationMention(relMen);
                    } else {
//                        System.out.println("no en head found!");
                    }

                }
            }
        }
    }

    /**
     * add events into tree, input en has no use here
     */
    public void findEREEvInstances(int offset_s, int offset_e, String sentence, Graph sent_graph, String ere_path) {
        String pathName = this.name;
        ArrayList<Event> evList = this.ereEvents;
        if (evList == null) {
            try {
                evList = createEREEventList(pathName, ere_path);
                this.ereEvents = evList;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        for (Event ev : evList) {
            for (EventMention evMen : ev.getEvms()) {
                Trigger trigger = evMen.getTrigger();
                int startx = trigger.getOffset();
                int endx = trigger.getOffset() + trigger.getLength();
                if ((startx >= offset_s && startx <= offset_e
                        || endx >= offset_s && endx <= offset_e)
                        && (sentence.contains(trigger.getText().replaceAll("[\\s]+", " ")))) {
                    int offset = startx;
                    if (offset < 0) {
                        offset = 0;
                    }
                    System.out.println("event mention trigger context: " + trigger.getText());
                    System.out.println("event mention trigger start: " + startx);
                    System.out.println("event mention trigger end: " + endx);
                    System.out.println("offset: " + offset);
                    Node en_head = sent_graph.getHead(trigger.getText(), startx, endx);
                    if (en_head != null) {
                        System.out.println("ev_trigger_mention_head: " + en_head.getName());
                        System.out.println("ev_trigger_mention_offset: " + en_head.getStartx());
                        System.out.println("event : " + evMen.getType());
                        en_head.setEreEventMention(evMen);
                    } else {
//                        System.out.println("no en head found!");
                    }

                }
            }
        }
    }

    public EntityMention findEREMention(int startx, int endx, String name) {
        for (Entity en : this.ereEntities) {
            EntityMention em = en.containsEntity(startx, endx, name);
            if (em != null) {
                return em;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        StringBuffer out = new StringBuffer();
        out.append("doc path: ").append(this.uri).append("\n");
        out.append("doc id: ").append(this.name).append("\n");
        out.append("entity list size: ").append(this.ereEntities.size()).append("\n");
        out.append("relation list size: ").append(this.ereRelations.size()).append("\n");
        out.append("utts size: ").append(this.utts.size()).append("\n");
//        out.append("doc conent:\n").append(this.oriDoc);
        return out.toString(); //To change body of generated methods, choose Tools | Templates.
    }

    public void setUtts(ArrayList<Utterance> utts) {
        this.utts = utts;
        for (Utterance utt : utts) {
            String speaker = utt.getSpeaker();
            int startx = utt.getSpeakerStartx();
//            System.out.println("speaker startx: " + startx + "  " + speaker);
            int endx = utt.getSpeakerEndx();
            for (Entity en : this.ereEntities) {
                EntityMention em = en.containsEntity(startx, endx, speaker);
                if (em != null) {
                    utt.setSpk_mention(em);
//                    System.out.println("set speaker mention: " + em.getEntityMentionText());
                    break;
                } else {
//                    System.out.println("no speaker mention: " + speaker + " startx: " + startx + " endx: " + endx);
                }
            }
        }
    }
}
