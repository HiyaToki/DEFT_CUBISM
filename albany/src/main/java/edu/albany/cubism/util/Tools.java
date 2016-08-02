/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.albany.cubism.util;

import edu.albany.cubism.ie.BoltDocument;
import edu.albany.cubism.relation.Utterance;
import edu.albany.cubism.sentiment.CustomFileReader;
import edu.albany.cubism.sentiment.Wordnet;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ting
 */
public class Tools {

    private static HashSet bad_relations = null;
    private static HashSet good_neg_relations = null;

    private static HashMap<String, Double> eng_neg = null;
    private static HashMap<String, Double> eng_pos = null;

    private static HashMap<String, Double> sentinet_eng_neg = null;
    private static HashMap<String, Double> sentinet_eng_pos = null;
    private static HashMap<String, Double> twitter_neg = null;
    private static HashMap<String, Double> twitter_pos = null;
    private HashMap<String, Double> good_twitter_neg = new HashMap();
    private HashMap<String, Double> good_twitter_pos = new HashMap();    
    private OpenANEW oa = new OpenANEW();
    private static Wordnet wn_ = new Wordnet();
    private static HashSet opinion_words = FileProcessor.readMostFrequentVerbs(Settings.getValue("opinion_words"));
    private static HashSet good_pos_relations = null;

    public static boolean isBadRelation(String relatino) {
        if (bad_relations == null) {
            loadBadRelations();
        }
        if (bad_relations.contains(relatino)) {
            return true;
        }
        return false;
    }
    
    public static boolean isOpinionWords(String word) {
        String w_bf = getBaseForm(word, null);
        if (w_bf == null) {
            w_bf = word;
        }
        return opinion_words.contains(w_bf);
    }

    public static String getBaseForm(String relation, String pos) {
        pos = getPOS(pos);
        System.out.println("POS: " + pos);
        if (pos != null) {
            String bf = wn_.getBaseForm(clearEndingNumbers(relation), pos);
            if (bf == null) {
                bf = clearEndingNumbers(relation);
            }
            return bf;
        }
        String bf = wn_.getBaseForm(clearEndingNumbers(relation), "noun");
        if (bf == null) {
            bf = wn_.getBaseForm(clearEndingNumbers(relation), "verb");
        }
        if (bf == null) {
            bf = wn_.getBaseForm(clearEndingNumbers(relation), "adjective");
        }
        if (bf == null) {
            bf = clearEndingNumbers(relation);
        }
        return bf;
    }
    public static String getPOS(String pos) {
        String back_pos = null;
        if (pos == null) {
            return null;
        } else if (pos.startsWith("N")) {
            return "noun";
        } else if (pos.startsWith("V")) {
            return "verb";
        } else if (pos.startsWith("JJ")) {
            return "adjective";
        }
        return null;
    }


    public static String clearEndingNumbers(String item) {

        int startIndex;             // Start of number
        int endIndex;               // End of number

        // Calculate the start and end Indexes
        String cleanData = item;
        startIndex = cleanData.lastIndexOf("-");

        endIndex = cleanData.length();

        String num = cleanData.substring(startIndex + 1, endIndex);
        try {
            Integer s = new Integer(num);
        } catch (Exception e) {
            System.out.println("this is not a number");
            return item;
        }
        if (startIndex == -1) {
            return item;
        }
        try {

            // Replace the numbers with nothing and return the new item
            cleanData = cleanData.replace(cleanData.substring(startIndex, endIndex), "");

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return cleanData;
        //  }

    }
    
    public static boolean isGoodNegRelation(String relation) {
        if (good_neg_relations == null) {
            loadGoodNegRelations();
        }
        if (relation == null) {
            return false;
        }
        relation = relation.toLowerCase();
        if (good_neg_relations.contains(relation)) {
            return true;
        }
        return false;
    }

    public static boolean isGoodPosRelation(String relation) {
        if (good_pos_relations == null) {
            loadGoodPosRelations();
        }
        if (relation == null) {
            return false;
        }
        relation = relation.toLowerCase();
        if (good_pos_relations.contains(relation)) {
            return true;
        }
        return false;
    }

    public void loadTwitterPositive() {
        try {
            BufferedReader br = new BufferedReader(new FileReader(new File(Settings.getValue(Settings.TWITTER_POS_RELATIONS))));
            twitter_pos = new HashMap();
            String a_line = null;
            try {
                while ((a_line = br.readLine()) != null  && a_line.trim().length() > 1) {
                    if (a_line.trim().split("\t").length > 1  && a_line.trim().split("\t").length < 3) {
                        twitter_pos.put(a_line.split("\t")[0], new Double(a_line.split("\t")[1]));
                    }
                }
                br.close();
//                System.out.println("bad_relations: " + bad_relations);
            } catch (IOException ex) {
                Logger.getLogger(Tools.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Tools.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void loadTwitterNegative() {
        try {
            BufferedReader br = new BufferedReader(new FileReader(new File(Settings.getValue(Settings.TWITTER_NEG_RELATIONS))));
            twitter_neg = new HashMap();
            String a_line = null;
            try {
                while ((a_line = br.readLine()) != null && a_line.trim().length() > 1) {
                    if (a_line.trim().split("\t").length > 1 && a_line.trim().split("\t").length < 3) {
//                        System.out.println("processing: " + a_line.split("\t").length + "%%%%%" + a_line.split("\t")[0] + " ---- " + a_line.split("\t")[1]);
                        twitter_neg.put(a_line.split("\t")[0], new Double(a_line.split("\t")[1]));
                    }
                }
                br.close();
//                System.out.println("bad_relations: " + bad_relations);
            } catch (IOException ex) {
                Logger.getLogger(Tools.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Tools.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void loadBadRelations() {
        try {
            BufferedReader br = new BufferedReader(new FileReader(new File(Settings.getValue(Settings.BAD_RELATIONS))));
            bad_relations = new HashSet();
            String a_line = null;
            try {
                while ((a_line = br.readLine()) != null) {
                    if (a_line.trim().length() > 0) {
                        bad_relations.add(a_line.split(",")[0]);
                    }
                }
                br.close();
//                System.out.println("bad_relations: " + bad_relations);
            } catch (IOException ex) {
                Logger.getLogger(Tools.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Tools.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void loadGoodNegRelations() {
        try {
            BufferedReader br = new BufferedReader(new FileReader(new File(Settings.getValue(Settings.GOOD_NEG_RELATIONS))));
            good_neg_relations = new HashSet();
            String a_line = null;
            try {
                while ((a_line = br.readLine()) != null) {
                    if (a_line.trim().length() > 0) {
                        good_neg_relations.add(a_line.split(",")[0]);
                    }
                }
                br.close();
//                System.out.println("good_neg_relations: " + good_neg_relations);
            } catch (IOException ex) {
                Logger.getLogger(Tools.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Tools.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void loadGoodPosRelations() {
        try {
            BufferedReader br = new BufferedReader(new FileReader(new File(Settings.getValue(Settings.GOOD_POS_RELATIONS))));
            good_pos_relations = new HashSet();
            String a_line = null;
            try {
                while ((a_line = br.readLine()) != null) {
                    if (a_line.trim().length() > 0) {
                        good_pos_relations.add(a_line.split(",")[0]);
                    }
                }
                br.close();
//                System.out.println("good_neg_relations: " + good_neg_relations);
            } catch (IOException ex) {
                Logger.getLogger(Tools.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Tools.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void loadEngNeg() {
        try {
            BufferedReader br = new BufferedReader(new FileReader(new File("./conf/English/neg.txt")));
            eng_neg = new HashMap<String, Double>();
            String a_line = null;
            try {
                while ((a_line = br.readLine()) != null) {
                    String[] n_tokens = a_line.trim().split("\t");
                    if (n_tokens.length == 2) {
                        eng_neg.put(n_tokens[0], Double.parseDouble(n_tokens[1]));
                        //System.out.println(n_tokens[0]+Double.parseDouble(n_tokens[1]));
                    }
                }
                br.close();
            } catch (IOException ex) {
                Logger.getLogger(Tools.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Tools.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static boolean isEngNeg(String str) {
        if (eng_neg == null) {
            loadEngNeg();
        }
        if (eng_neg.containsKey(str)) {
            return true;
        }
        return false;
    }

    public static void loadEngPos() {
        try {
            BufferedReader br = new BufferedReader(new FileReader(new File("./conf/English/pos.txt")));
            eng_pos = new HashMap<String, Double>();
            String a_line = null;
            try {
                while ((a_line = br.readLine()) != null) {
                    String[] n_tokens = a_line.trim().split("\t");
                    if (n_tokens.length == 2) {
                        eng_pos.put(n_tokens[0], Double.parseDouble(n_tokens[1]));
                        //System.out.println(n_tokens[0]+Double.parseDouble(n_tokens[1]));
                    }
                }
                br.close();
            } catch (IOException ex) {
                Logger.getLogger(Tools.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Tools.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static boolean isEngPos(String str) {
        if (eng_pos == null) {
            loadEngPos();
        }
        if (eng_pos.containsKey(str)) {
            return true;
        }
        return false;
    }

    //Neg and Pos words from SentiWordNet_3.0.0_20130122
    public static void loadSentinetEngNeg() {
        try {
            BufferedReader br = new BufferedReader(new FileReader(new File("./conf/English/sentinet_neg")));
            sentinet_eng_neg = new HashMap<String, Double>();
            String a_line = null;
            try {
                while ((a_line = br.readLine()) != null) {
                    String[] n_tokens = a_line.trim().split("\t");
                    if (n_tokens.length == 2) {
                        sentinet_eng_neg.put(n_tokens[0], Double.parseDouble(n_tokens[1]));
                        //System.out.println(n_tokens[0]+Double.parseDouble(n_tokens[1]));
                    }
                }
                br.close();
            } catch (IOException ex) {
                Logger.getLogger(Tools.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Tools.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static boolean isSentinetEngNeg(String str) {
        if (sentinet_eng_neg == null) {
            loadSentinetEngNeg();
        }
        if (sentinet_eng_neg.containsKey(str)) {
            return true;
        }
        return false;
    }

    public static void loadSentinetEngPos() {
        try {
            BufferedReader br = new BufferedReader(new FileReader(new File("./conf/English/sentinet_pos")));
            sentinet_eng_pos = new HashMap<String, Double>();
            String a_line = null;
            try {
                while ((a_line = br.readLine()) != null) {
                    String[] n_tokens = a_line.trim().split("\t");
                    if (n_tokens.length == 2) {
                        sentinet_eng_pos.put(n_tokens[0], Double.parseDouble(n_tokens[1]));
                        //System.out.println(n_tokens[0]+Double.parseDouble(n_tokens[1]));
                    }
                }
                br.close();
            } catch (IOException ex) {
                Logger.getLogger(Tools.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Tools.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static boolean isSentinetEngPos(String str) {
        if (sentinet_eng_pos == null) {
            loadSentinetEngPos();
        }
        if (sentinet_eng_pos.containsKey(str)) {
            return true;
        }
        return false;
    }

    public static void pullDateTime(String path) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(new File(path)));
            StringBuffer item = new StringBuffer();
            HashMap<String, ArrayList> sents = Tools.parseBoltDocs("/Users/ting/NetBeansProjects/deft2015/ihmc/src/main/resources/us/albany/cubism/Data/Source_Corpus_Files_Assessment_backup");
            String aLine = null;
            while ((aLine = br.readLine()) != null) {
                String[] items = aLine.split("\t");
                String source = items[8];
                String clean_chunk = items[2].replaceAll("[\\p{Punct}]+", "").toLowerCase();
                String chunk = items[2];
                String slot = items[3];
                String target = items[4];
                String target_type = items[5];
                String sent_score = items[9];
//                System.out.println("source: " + source);
                String tmp_source = null;
                if (source.endsWith("cano")) {
                    tmp_source = "Ame##icano";
//                    System.out.println("source: " + source);
                }
                ArrayList<ArrayList> utts = sents.get(source);
                if (utts == null && tmp_source != null) {
                    utts = sents.get(tmp_source);
                }
                boolean found = false;
                for (ArrayList<String> utt : utts) {
                    String ori_chunk = utt.get(0).replaceAll("[\\p{Punct}]+", "").toLowerCase();
                    String datetime = utt.get(1);
                    if (ori_chunk.contains(clean_chunk)
                            || ori_chunk.contains("stance on the issue indicates his ignorance of".replaceAll("[\\p{Punct}]+", ""))
                            && clean_chunk.contains("stance on the issue indicates his ignorance of".replaceAll("[\\p{Punct}]+", ""))
                            || ori_chunk.contains("but if it turns out that weiner is unwilling to allow an official transparent investigation then".replaceAll("[\\p{Punct}]+", ""))
                            && clean_chunk.contains("but if it turns out that weiner is unwilling to allow an official transparent investigation then".replaceAll("[\\p{Punct}]+", ""))
                            || ori_chunk.contains("a porn star stripper and fan of rep".replaceAll("[\\p{Punct}]+", ""))
                            && clean_chunk.contains("a porn star stripper and fan of rep".replaceAll("[\\p{Punct}]+", ""))
                            || ori_chunk.contains("but if it turns out that weiner is unwilling to allow an official transparent investigation then he".replaceAll("[\\p{Punct}]+", ""))
                            && clean_chunk.contains("but if it turns out that weiner is unwilling to allow an official transparent investigation then he".replaceAll("[\\p{Punct}]+", ""))
                            || ori_chunk.contains("her profound and comprehensive ignorance on matters both political and legal render her unqualified for national".replaceAll("[\\p{Punct}]+", ""))
                            && clean_chunk.contains("her profound and comprehensive ignorance on matters both political and legal render her unqualified for national".replaceAll("[\\p{Punct}]+", ""))) {
                        item.append(source).append("\t").append(target).append("\t").append(target_type).append("\t").append(slot).append("\t").append(sent_score).append("\t").append(chunk).append("\t").append(datetime).append("\n");
                        found = true;
                        break;
                    }
                }
                if (!found) {
//                    System.out.println("missed: " + clean_chunk);
//                    System.out.println("speaker: " + source);
                }
            }
            BufferedWriter bw = new BufferedWriter(new FileWriter(new File("/Users/ting/NetBeansProjects/deft2015/adept/adept-kb/src/test/resources/adept/kbapi/sentiment_mentions_withdate.txt")));
            bw.write(item.toString());
            bw.flush();
            bw.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Tools.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Tools.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static HashMap<String, ArrayList> parseBoltDocs(String path) {
        HashMap<String, ArrayList> sents = new HashMap();
        BufferedReader br = null;
        File dir = new File(path);
        File[] files = dir.listFiles();
        try {
            for (File file : files) {
                if (!file.getName().startsWith("bolt")) {
                    continue;
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
            }
//            System.out.println("sents: " + sents);
            return sents;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Tools.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Tools.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                br.close();
            } catch (IOException ex) {
                Logger.getLogger(Tools.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return sents;
    }

    public static ArrayList<BoltDocument> parseDocument(String path) {
        ArrayList boltDocs = new ArrayList();
        return boltDocs;
    }

    /**
     * get each post information
     *
     * @param read
     * @param currLine
     * @param doc
     * @param startx
     * @param utts
     * @param oriDoc
     * @return offset
     */
    public static int getPostInfoforBelief(BufferedReader read, String currLine, StringBuffer doc, int startx, ArrayList utts, StringBuffer oriDoc) {

        try {
            Utterance utt = new Utterance();
            int endx = 0;
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
//        System.out.println("speaker: " + speaker);
//        System.out.println("id: " + id);
//        System.out.println("before get PostInfo, startx: " + startx);
            while ((currLine = read.readLine()) != null) {
//	    System.out.println("currLine: " + currLine);
//	    System.out.println("oriDoc length: " + oriDoc.length());
                currLine = currLine; /* removed trim() by TL at 05/07/15*/

                oriDoc.append(currLine); /* removed trim() by TL at 05/07/15*/

                oriDoc.append("\n");
                doc.append(currLine.trim() + "\n");
//            System.out.println("currLine: " + currLine);
                if (currLine.trim().startsWith("<quote")) {
                    //skip quotes
//                    quote_count += 1;
                    startx += currLine.length();
                    continue;
                }
                if (currLine.trim().startsWith("</quote")) {
                    //quote is over
//                    quote_count -= 1;
                    startx += currLine.length();
                    continue;
                }
                if (quote_count > 0) {
//                    continue;
                }
                if (currLine.trim().startsWith("<a ")) {
                    //skip links
                    startx += currLine.length();
                    continue;
                }
                if (currLine.startsWith("<post")) {
                    utt = new Utterance();
                    speaker = currLine.substring(currLine.indexOf("author=\"") + "author=\"".length(), currLine.indexOf("\" datetime"));
                    posttime = currLine.substring(currLine.indexOf("datetime=\"") + "datetime=\"".length(), currLine.indexOf("\" id="));
                    id = currLine.substring(currLine.indexOf("id=\"") + "id=\"".length(), currLine.indexOf("\">"));
                    con_buff = new StringBuffer();
                    quote_count = 0;
                    startx += currLine.length();
                }
                if (!currLine.startsWith("</pos")) {
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
                    if (post.length() > 60) {
                        //added by TL 05/13/15
                        String[] post_sents = post.split("(?<=[.?!])\\s+(?=[a-zA-Z])");
                        for (String post_sent : post_sents) {
                            utt.setContent(post_sent);
//                            System.out.println("split utt: " + post_sent);
//                            System.out.println("startx: " + startx);
//                utt.setRank(rank);
                            int utt_startx = doc_content.indexOf(post_sent, startx);
//                            System.out.println("utt_startx: " + utt_startx);
                            utt.setStartx(utt_startx);
                            utt.setEndx(utt_startx + post_sent.length());
                            startx = utt_startx + post_sent.length();
                            utt.setFilteredContent(post_sent.replaceAll("[\\s]+", " "));
                            utt.setSpeaker(speaker);
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
                        startx = utt_startx + post.length();
                        utt.setFilteredContent(post.replaceAll("[\\s]+", " "));
                        utt.setSpeaker(speaker);
                        utt.setPostTime(posttime);
                        utt.setId(id);
                        utts.add(utt);
                        utt = new Utterance();
                    }
                    continue;

                } else {
//                System.out.println("end of post, quit!");
                    startx += currLine.length();
                    continue;
                }
            }
//        System.out.println("oriDoc: " + oriDoc.toString());
            return oriDoc.length();
        } catch (IOException ex) {
            Logger.getLogger(Tools.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }

    public void parseBoltDocument(String docPathName) {

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
                boltDoc.setOriDoc(totalDoc);
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
                boltDoc = new BoltDocument();
                boltDoc.setName(docid);
            }

        }
    }
    
    public void findextraWords() {
        this.loadTwitterNegative();
        this.loadTwitterPositive();
        ArrayList<String> words = new ArrayList(Arrays.asList(twitter_pos.keySet().toArray()));
        for (String word: words) {
            if (word.split(" ").length > 1) {
                continue;
            }
            if (word.trim().length() < 2) {
                continue;
            }
            String bf = wn_.getBaseForm(word, "noun");
            if (bf == null) {
                bf = wn_.getBaseForm(word, "verb");
            }
//            if (bf != null) {
//                word = bf;
//            }
            if (bf == null) {
                bf = word;
            }
            if (bf.trim().length() < 2) {
                continue;
            }
            double adj_score = (twitter_pos.get(word) - 0.5)/0.5 * 4 + 5;
            if (this.oa.wordSentimentOf(bf) == -1 &&
                    twitter_pos.get(word) >= 0.75 &&
                    !twitter_neg.containsKey(word) &&
                    !good_twitter_pos.containsKey(bf)) {
                this.good_twitter_pos.put(bf, adj_score);
            }
        }
        System.out.println("good_twitter_pos: " + good_twitter_pos.size());
        words = new ArrayList(Arrays.asList(good_twitter_pos.keySet().toArray()));
        for (String word: words) {
            System.out.println(word + ": " + good_twitter_pos.get(word));
        }
        words = new ArrayList(Arrays.asList(twitter_neg.keySet().toArray()));
        for (String word: words) {
            if (word.split(" ").length > 1) {
                continue;
            }
            if (word.trim().length() < 2) {
                continue;
            }
            String bf = wn_.getBaseForm(word, "noun");
            if (bf == null) {
                bf = wn_.getBaseForm(word, "verb");
            }
//            if (bf != null) {
//                word = bf;
//            }
            if (bf == null) {
                bf = word;
            }
            if (bf.trim().length() < 2) {
                continue;
            }
            double adj_score = (twitter_neg.get(word) + 1)/0.5 * 4 + 1;
            if (this.oa.wordSentimentOf(bf) == -1 &&
                    twitter_neg.get(word) <= -0.75 &&
                    !twitter_pos.containsKey(word) &&
                    !good_twitter_neg.containsKey(bf)) {
                this.good_twitter_neg.put(word, adj_score);
            }
        }
        System.out.println("good_twitter_neg: " + good_twitter_neg.size());
        words = new ArrayList(Arrays.asList(good_twitter_neg.keySet().toArray()));
        for (String word: words) {
            System.out.println(word + ": " + good_twitter_neg.get(word));
        }
        
    }

    public static void main(String[] args) {
        /*
         System.out.println(isSentinetEngPos("adhere"));
         System.out.println(isSentinetEngPos("albany"));
         */
//        pullDateTime("/Users/ting/NetBeansProjects/deft2015/adept/adept-kb/src/test/resources/adept/kbapi/Validation_Ting_all_failureanalysis.txt");
        Tools tls = new Tools();
        tls.findextraWords();
    }
}
