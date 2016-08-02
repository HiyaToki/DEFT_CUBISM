/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.albany.cubism.ie;

import adept.common.ChannelName;
import adept.common.CharOffset;
import adept.common.ContentType;
import adept.common.Document;
import adept.common.EntityMention;
import adept.common.HltContentContainer;
import adept.common.Pair;
import adept.common.Token;
import adept.common.TokenOffset;
import adept.common.TokenStream;
import adept.common.TokenizerType;
import adept.common.TranscriptType;
import adept.common.Type;
import adept.metadata.SourceAlgorithm;
import adept.utilities.DocumentMaker;
import edu.albany.cubism.sentiment.CustomFileReader;
import edu.albany.cubism.sentiment.CustomFileWriter;
import edu.albany.cubism.util.Settings;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.junit.Assert;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import us.ihmc.cubism.sociolinguistics.SentimentExtractor;

/**
 * Read named entities and relations from text or information extraction system
 * input and convert them into entities and relations in Deft format
 *
 * @author ting
 */
public class InformationReader {

    private Document document = null;
    HashMap<Long, Pair<adept.common.Entity, List<EntityMention>>> entities;
    long entity_id = 0;
    long entity_mention_id = 0;

    public ArrayList<OldEntity> parseDocument(String doc_path) {
        // Open up the XML file using Document builder and the supplied pathname
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = null;
        org.w3c.dom.Document doc = null;
        try {
            dBuilder = dbFactory.newDocumentBuilder();
            doc = dBuilder.parse(removeSchema(doc_path));
            doc.getDocumentElement().normalize();
            return this.parseDocument(doc);
        } catch (Exception ex) {
            System.out.println("Cannot find pathName:\t" + doc_path);
            System.out.flush();

        }

        return null;
    }

    public ArrayList<OldEntity> parseDocument(org.w3c.dom.Document doc) {
        return null;
    }

    public Pair<adept.common.Entity, EntityMention> createEntityWithMentions(String text, String entityType,
            float entityConfidence, String entityMentionType, float entityMentionConfidence,
            float entityCanonicalMentionConfidence, long entity_id, long entity_mention_id) {
        Pair<adept.common.Entity, EntityMention> eem = null;
        try {
            // create entity
            if (this.entities.containsKey(entity_id)) {
                Pair<adept.common.Entity, List<EntityMention>> eems = this.entities.get(entity_id);
                ArrayList<EntityMention> ems = (ArrayList) eems.getR();
                boolean containsEm = false;
                for (EntityMention em : ems) {
                    if (em.getSequenceId() == entity_mention_id) {
                        eem = new Pair(eems.getL(), em);
                        containsEm = true;
                        break;
                    }
                }
                if (!containsEm) {
                    Pair<TokenOffset, TokenStream> tt = this.createTokenStream(text);
                    EntityMention mention = this.createEntityMention(tt, entity_id, entity_mention_id, entityType, entityMentionConfidence, entityMentionType);
                    ems.add(mention);
                    entity_mention_id++;
                    eem = new Pair(eems.getL(), mention);
                }
            } else {
                Pair<TokenOffset, TokenStream> tt = this.createTokenStream(text);

                // create mention
                List<EntityMention> mentions = new ArrayList<EntityMention>();
                EntityMention mention = this.createEntityMention(tt, entity_id, entity_mention_id, entityType, entityMentionConfidence, entityMentionType);
                mentions.add(mention);
                entity_mention_id++;

                // create entity
                adept.common.Entity entity = this.createEntity(mention, entityConfidence, entityCanonicalMentionConfidence, entity_id, entityType);
                entity_id++;
                Pair<adept.common.Entity, List<EntityMention>> eems = new Pair(entity, mentions);
                this.entities.put(entity_id, eems);
                eem = new Pair(entity, mention);
            }
            return eem;
        } catch (Exception ex) {
            ex.printStackTrace();
            Assert.fail("Unable to create entity object. " + ex.getMessage());
        }

        return eem;
    }

    public adept.common.Entity createEntity(EntityMention mention, float entityConfidence, float entityCanonicalMentionConfidence, long entity_id, String entityType) {
        adept.common.Entity entity = new adept.common.Entity(entity_id, new Type(entityType));
        entity.setCanonicalMentions(mention);
        entity.setEntityConfidence(entityConfidence);
        entity.setCanonicalMentionConfidence(entityCanonicalMentionConfidence);
        return entity;
    }

    public EntityMention createEntityMention(Pair<TokenOffset, TokenStream> tt, long entity_id, long entity_mention_id, String entityType,
            float entityMentionConfidence, String entityMentionType) {
        EntityMention mention = new EntityMention(entity_mention_id, tt.getL(), tt.getR());
        mention.addEntityConfidencePair(entity_id, entityMentionConfidence);
        mention.setMentionType(new Type(entityMentionType));
        mention.setSourceAlgorithm(new SourceAlgorithm("Sentiment", "CUBISM"));
        mention.setEntityType(new Type(entityType));
        return mention;
    }

    public Pair<TokenOffset, TokenStream> createTokenStream(String text) {
        int start = 0;
        int end = text.length();
        CharOffset testCharOff = new CharOffset(start, end);
        System.out.println("text: " + text);
        Token testToken = new Token(0, testCharOff, text);
        document = this.createDocument(text);
        TokenStream TokenStream1 = new TokenStream(TokenizerType.WHITESPACE, TranscriptType.SOURCE,
                "English", ChannelName.NONE, ContentType.TEXT, document);
        TokenOffset TokenOffset1 = new TokenOffset(0, 0);
        TokenStream1.add(testToken);
        return new Pair(TokenOffset1, TokenStream1);
    }

    public Document createDocument(String content) {
        String path = "";
        try {
            System.out.println("sample file path: " + Settings.getValue("tmp_file"));
            String curr_path = System.getProperty("user.dir");
//                    System.out.println("curr_path(in parseSettingsLine of Settings): " + curr_path);
            if (curr_path.endsWith("test-classes")
                    || curr_path.endsWith("test-classes/")) {
                path = curr_path + "/us/ihmc/cubism/sociolinguistics/conf/tmp_file";
            } else {
                path = curr_path + "/src/main/resources/us/albany/cubism/conf/tmp_file";
            }
            BufferedWriter bw = new BufferedWriter(new FileWriter(new File(path)));
            bw.write(content);
            bw.flush();
            bw.close();
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(SentimentExtractor.class.getName()).log(Level.SEVERE, null, ex);
        }
        Document document = DocumentMaker
                .getInstance()
                .createDefaultDocument(
                        "sample.txt",
                        null,
                        "Text",
                        "sample.txt",
                        "English",
                        //"/home/aparna/ihmc/deft/adept/adept-kb/src/test/resources/adept/kbapi/files/str" + c + ".txt",

                        path,
                        new HltContentContainer()
                );
        return document;
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
        org.w3c.dom.Document doc = null;
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
    
    public ArrayList<String> readBoltFiles(String path) {
//        ArrayList<String> file_content = 
        return null;
    }
}
