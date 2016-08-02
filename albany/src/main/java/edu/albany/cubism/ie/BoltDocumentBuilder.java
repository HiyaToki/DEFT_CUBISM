/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.albany.cubism.ie;

import edu.albany.cubism.util.*;
import edu.albany.cubism.ie.BoltDocument;
import edu.albany.cubism.relation.Line;
import edu.albany.cubism.relation.Poster;
import edu.albany.cubism.relation.Quotation;
import edu.albany.cubism.relation.Utterance;
import edu.albany.cubism.sentiment.CustomFileReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.ParserConfigurationException;

/**
 *
 * @author ting
 */
public class BoltDocumentBuilder {

    public static HashMap<String, ArrayList> parseBoltDocs(File file) {
        HashMap<String, ArrayList> sents = new HashMap();
        BufferedReader br = null;
        try {
            if (!file.getName().startsWith("bolt")) {
                return null;
            }
            br = new BufferedReader(new FileReader(file));
            StringBuffer cont = new StringBuffer();
            String aLine = null;
            String speaker = null;
            String datetime = null;
            boolean in_post = false;
            int in_quote = 0;
            while ((aLine = br.readLine()) != null) {
                if (aLine.startsWith("</post")) {
                    if (speaker != null) {
                        if (speaker.endsWith("icano")) {
                            speaker = "Ame##icano";
                        }
                        ArrayList utt = new ArrayList();
                        if (cont.toString().contains("This is mostly due to the accesibility of housing")) {
//                                System.out.println("cont: " + cont.toString());
//                                System.out.println("speaker: " + speaker);
                        }
                        utt.add(cont.toString());
                        utt.add(datetime);
                        ArrayList utts = sents.get(speaker);
                        if (utts == null) {
                            utts = new ArrayList();
                            sents.put(speaker, utts);
                        }
                        utts.add(utt);
                    }
                    speaker = null;
                    datetime = null;
                    cont = new StringBuffer();
                    in_post = false;
                    continue;
                }
                if (aLine.startsWith("<post")) {
                    speaker = aLine.substring(aLine.indexOf("author=\"") + 8, aLine.indexOf("\" datetime="));
                    datetime = aLine.substring(aLine.indexOf("\" datetime=\"") + 12, aLine.indexOf("\" id="));
                    in_post = true;
                    continue;
                }
                if (aLine.startsWith("<quote")) {
                    in_quote++;
                    continue;
                }
                if (aLine.startsWith("</quote>")) {
                    in_quote--;
                    continue;
                }
                if (in_quote > 0) {
                    continue;
                }
                if (in_post) {
                    cont.append(aLine).append("\n");
                }
            }
//            System.out.println("sents: " + sents);
            return sents;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(BoltDocumentBuilder.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(BoltDocumentBuilder.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                br.close();
            } catch (IOException ex) {
                Logger.getLogger(BoltDocumentBuilder.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return sents;
    }

    /**
     * get each post information
     *
     * @param docContent
     * @return offset
     */
    public static ArrayList getPostInfoNew(String docContent, BoltDocument boltDoc) {

        try {
            Utterance utt = new Utterance();
            int endx = 0;
            int startx = 0;
            StringBuffer oriDoc = new StringBuffer();
            ArrayList utts = new ArrayList();
            BufferedReader read = new BufferedReader(new StringReader(docContent));
            /*
             currLine = read.readLine();
             System.out.println("currLine: " + currLine);
             String speaker = currLine.substring(currLine.indexOf("author=\"") + "author=\"".length(), currLine.indexOf("\" datetime"));
             String posttime = currLine.substring(currLine.indexOf("datetime=\"") + "datetime=\"".length(), currLine.indexOf("\" id="));
             String id = currLine.substring(currLine.indexOf("id=\"") + "id=\"".length(), currLine.indexOf("\">"));
             */
            String speaker = null;
            String posttime = null;
            String id = null;
            StringBuffer con_buff = new StringBuffer();
            int quote_count = 0;
            String currLine = null;
            Quotation curr_quo = null;
            Poster poster = null;
            ArrayList<Quotation> quos = new ArrayList();
            int spk_startx = 0;
            int spk_endx = 0;
//        System.out.println("speaker: " + speaker);
//        System.out.println("id: " + id);
//        System.out.println("before get PostInfo, startx: " + startx);
            while ((currLine = read.readLine()) != null) {
//                System.out.println("currLine: " + currLine);
//	    System.out.println("oriDoc length: " + oriDoc.length());
                currLine = currLine; /* removed trim() by TL at 05/07/15*/

                oriDoc.append(currLine); /* removed trim() by TL at 05/07/15*/

                oriDoc.append("\n");
//                doc.append(currLine.trim() + "\n");
//            System.out.println("currLine: " + currLine);
                if (currLine.trim().startsWith("<quote") && !currLine.trim().startsWith("<quote>")) {
                    //skip quotes
                    quote_count += 1;
                    String quo_speaker = currLine.substring(currLine.indexOf("orig_author=\"") + "orig_author=\"".length(), currLine.indexOf("\">"));
                    Quotation tmp_quo = new Quotation();
                    tmp_quo.setSpeaker(quo_speaker);
                    tmp_quo.setSp_startx(startx + currLine.indexOf("orig_author=\"") + "orig_author=\"".length());
                    tmp_quo.setSp_endx(startx + currLine.indexOf("\">"));
                    tmp_quo.setStartx(startx);
                    quos.add(tmp_quo);
                    curr_quo = tmp_quo;
                    System.out.println("oriDoc length: " + oriDoc.length());
                    System.out.println("startx: " + startx);
                    startx += currLine.length() + 1;
                    continue;
                }
                if (currLine.trim().startsWith("</quote")) {
                    //quote is over
                    if (quote_count > 0) {
                        quote_count -= 1;
                    } else {
                        startx += currLine.length() + 1;
                        continue;
                    }

                    startx += currLine.length() + 1;
                    curr_quo.setEndx(startx);
                    utts.addAll(curr_quo.genUtternces(oriDoc.toString()));
                    quos.remove(quos.size() - 1);
                    if (quos.size() > 0) {
                        curr_quo = quos.get(quos.size() - 1);
                    }
                    continue;
                }
                if (currLine.trim().startsWith("<a ")) {
                    //skip links
                    startx += currLine.length() + 1;
                    continue;
                }
                if (currLine.startsWith("<post")) {
                    utt = new Utterance();
                    speaker = currLine.substring(currLine.indexOf("author=\"") + "author=\"".length(), currLine.indexOf("\" datetime"));
                    spk_startx = startx + currLine.indexOf("author=\"") + "author=\"".length();
                    spk_endx = startx + currLine.indexOf("\" datetime");
                    posttime = currLine.substring(currLine.indexOf("datetime=\"") + "datetime=\"".length(), currLine.indexOf("\" id="));
                    id = currLine.substring(currLine.indexOf("id=\"") + "id=\"".length(), currLine.indexOf("\">"));
                    con_buff = new StringBuffer();
                    quote_count = 0;
                    startx += currLine.length() + 1;
                } else if (!currLine.startsWith("</pos")) {
                    String doc_content = oriDoc.toString();
                    String post = currLine;
//                    System.out.println("post: " + post);
//                    System.out.println("speaker: " + speaker);

//                Integer rank = 0;
//                try {
//                    rank = new Integer(post.substring(0, post.indexOf(".") - 1).trim());
//                } catch (NumberFormatException nfe) {
//                    System.out.println("first post");
//                    rank = 0;
//                }
//                if (rank > 0) {
//                    post = post.substring(post.indexOf(".") + 1).trim();
//                }
                    if (quote_count > 0) {
                        Line l = new Line();
                        l.setSpeaker(curr_quo.getSpeaker());
                        l.setSpk_startx(curr_quo.getSp_startx());
                        l.setSpk_endx(curr_quo.getSp_endx());
                        l.setContent(currLine);
                        l.setStartx(startx);
                        l.setEndx(startx + currLine.length());
                        l.setIn_quote(true);
                        curr_quo.addLine(l);
                    } else if (post.length() > 60) {
                        //added by TL 05/13/15
                        String language = Settings.getValue(Settings.LANGUAGE);
                        
                        String[] post_sents = post.split("(?<=[.?!])\\s+(?=[a-zA-Z])");
                        if (language.equalsIgnoreCase("chinese")) {
                            post_sents = ChineseSentenceSplitter.splitSents(post);//post.split("(?<=[。？！。？！！？。])\\s+(?=[一-龥])");
                        }
                        for (String post_sent : post_sents) {
                            utt.setContent(post_sent);
                            System.out.println("split utt: " + post_sent);
//                            System.out.println("startx: " + startx);
//                utt.setRank(rank);
                            int utt_startx = doc_content.indexOf(post_sent, startx);
//                            System.out.println("utt_startx: " + utt_startx);
                            utt.setStartx(utt_startx);
                            utt.setEndx(utt_startx + post_sent.length());
//                            startx = utt_startx + post_sent.length();
                            utt.setFilteredContent(post_sent.replaceAll("[\\s]+", " "));
                            utt.setSpeaker(speaker);
                            utt.setSpeakerStartx(spk_startx);
                            utt.setSpeakerEndx(spk_endx);
                            utt.setPostTime(posttime);
                            utt.setId(id);
                            utts.add(utt);
                            utt = new Utterance();
                        }
                    } else {
                        utt.setContent(post);
//                utt.setRank(rank);
                        int utt_startx = doc_content.indexOf(post, startx);
//                        System.out.println("utt_startx: " + utt_startx);
                        utt.setStartx(utt_startx);
                        utt.setEndx(utt_startx + post.length());
//                        startx = utt_startx + post.length();
                        utt.setFilteredContent(post.replaceAll("[\\s]+", " "));
                        utt.setSpeaker(speaker);
                        utt.setSpeakerStartx(spk_startx);
                        utt.setSpeakerEndx(spk_endx);
                        utt.setPostTime(posttime);
                        utt.setId(id);
                        utts.add(utt);
                        utt = new Utterance();
                    }
                    startx += currLine.length() + 1;
                    continue;

                } else {
//                System.out.println("end of post, quit!");
                    startx += currLine.length() + 1;
                    continue;
                }
            }
//        System.out.println("oriDoc: " + oriDoc.toString());
            ArrayList<Utterance> tmp_utts = utts;
            for (Utterance tmp_utt : tmp_utts) {
                System.out.println("utt: " + tmp_utt);
            }
//            System.out.println("utts: " + utts);
            return utts;
        } catch (IOException ex) {
            Logger.getLogger(BoltDocumentBuilder.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public static ArrayList<BoltDocument> parseBoltDocuments(String docPathName, String ere_path) {

        StringBuilder totalDocBuilder = new StringBuilder();        // A string that will hold the entire document
        CustomFileReader read = new CustomFileReader(docPathName);  // Open up the file found earlier
        String offsetSentence;
        String currLine = "\n";                                     // The line before looking at the next
        String nextLine = "\n";                                     // The currently read line
        String totalDoc;                                            // A string to hold the document in the document id  
        boolean endOfDoc = false;                                   // Tells us if we are at the end of the document
        String docid = null;
        ArrayList<BoltDocument> boltDocs = new ArrayList();

        // While there is a another line to be read in the file and
        // we haven't gotten to the end of the needed document
        BoltDocument boltDoc = new BoltDocument();
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
                boltDoc.setOriDoc(totalDoc);
                offsetSentence = "";
                System.out.println("createEntityList: " + docid);
                boltDoc.createEREEntityList(docid, ere_path);
                System.out.println("createRelationList");
                boltDoc.createERERelationList(docid, ere_path);
                System.out.println("createEventList");
                boltDoc.createEREEventList(docid, ere_path);
                System.out.println("setUtts");
                boltDoc.setUtts(BoltDocumentBuilder.getPostInfoNew(totalDoc, boltDoc));
                System.out.println("boltDoc info: " + boltDoc.toString());
                boltDocs.add(boltDoc);
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
                docid = nextLine.substring(nextLine.indexOf("doc id=") + 8, nextLine.lastIndexOf("\">"));
                boltDoc = new BoltDocument();
                boltDoc.setName(docid);
                boltDoc.setUri(docPathName);
                totalDocBuilder = new StringBuilder();
                endOfDoc = false;
            }

        }
        return boltDocs;
    }

    public static BoltDocument parseBoltDocument(String docPathName, String docId, String ere_path) {

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
        BoltDocument boltDoc = new BoltDocument();
        boolean start = true;
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
                boltDoc.setOriDoc(totalDoc);
                offsetSentence = "";
                System.out.println("createEntityList: " + docid);
                boltDoc.createEREEntityList(docid, ere_path);
                System.out.println("createRelationList");
                boltDoc.createERERelationList(docid, ere_path);
                System.out.println("createEventList");
                boltDoc.createEREEventList(docid, ere_path);
                System.out.println("setUtts");
                boltDoc.setUtts(BoltDocumentBuilder.getPostInfoNew(totalDoc, boltDoc));
                System.out.println("boltDoc info: " + boltDoc.toString());
                // Store the excerpt from the document into the assessDocsSentenceHash
                System.out.println("docId to put: " + docid);
            }

            // Keep copying text over if the length of the document is greater than zero and
            // we have not reached the end of the document
            if ((totalDocBuilder.length() != 0
                    || start && nextLine.startsWith("<post"))
                    && !endOfDoc) { //modified by TL from && to ||, change it back for multiple documents in one file 11/09/2015
                totalDocBuilder.append(nextLine);
                start = false;

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
                boltDoc = new BoltDocument();
                boltDoc.setName(docid);
                boltDoc.setUri(docPathName);
                totalDocBuilder = new StringBuilder();
                endOfDoc = false;
            }

        }
        if (totalDocBuilder.length() != 0) {
            System.out.println("add to doclist");
            endOfDoc = true;
            totalDoc = totalDocBuilder.toString();
            boltDoc.setOriDoc(totalDoc);
            offsetSentence = "";
            if (docid == null) {
                docid = docId;
            }
            System.out.println("createEntityList: " + docid);
            boltDoc.createEREEntityList(docid, ere_path);
            System.out.println("createRelationList");
            boltDoc.createERERelationList(docid, ere_path);
            System.out.println("createRelationList");
            boltDoc.createEREEventList(docid, ere_path);
            System.out.println("setUtts");
            boltDoc.setUtts(BoltDocumentBuilder.getPostInfoNew(totalDoc, boltDoc));
            System.out.println("boltDoc info: " + boltDoc.toString());
            // Store the excerpt from the document into the assessDocsSentenceHash
            System.out.println("docId to put: " + docid);

        }
        return boltDoc;
    }

}
