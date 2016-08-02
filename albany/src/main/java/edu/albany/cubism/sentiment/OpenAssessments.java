/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.albany.cubism.sentiment;

import java.io.File;
import java.util.ArrayList;
import edu.albany.cubism.sentiment.CustomFileReader;
import edu.albany.cubism.sentiment.CustomFileReader;
import edu.albany.cubism.util.Settings;

/**
 *
 * @author Robert J. Giarrusso
 */
public class OpenAssessments {

    public ArrayList<ArrayList<String>> selectAssessmentFiles() {

        String[] assessDocLine;
        // ArrayList<String> assessDocArrayList = new ArrayList();
        ArrayList<ArrayList<String>> chosenDocArrayList = new ArrayList();
        String oldForumQuery = "";
        String oldForumDocID = "";
        String oldNewsQuery = "";
        String oldNewsDocID = "";
        String oldWebQuery = "";
        String oldWebDocID = "";
        boolean news, web, forum;
        int nodeCount = -1;
        int newsCount = 0;
        int webCount = 0;
        int forumCount = 0;

        // Go through all of the files in the source and open each
        // for (File file : assessParDir) {
        // 2014 annotatino
//        CustomFileReader read = new CustomFileReader(Settings.getValue("kbp_data_path")+"/2014evaluation/annotation/tac_2014_kbp_english_sentiment_slot_filling_evaluation_annotations.tab");  // Open up the found file
        File eval = new File(Settings.getValue("kbp_data_path")+"/2014evaluation/annotation/test_all_forum.txt");
        if (!eval.exists()) {
            return chosenDocArrayList;
        }
        CustomFileReader read = new CustomFileReader(Settings.getValue("kbp_data_path")+"/2014evaluation/annotation/test_all_forum.txt");  // Open up the found file changed by TL 05/27/15
        String nextLine = "\n";     // The currently read line
        news = false;
        web = false;
        forum = false;

//        if ()
        // Only copy over up to 60 lines of data
        while (read.hasNextLine() /*&& chosenDocArrayList.size() < 60*/) {
            nextLine = read.getNextLine();
            assessDocLine = nextLine.split("\t");

            System.out.println("nextLine: " + nextLine);

            //* COMMENT OUT ENTIRE IF STATEMENT IF ONLY LOOKING AT FORUM*//
            if (!oldForumQuery.contains(assessDocLine[0])) {
                forum = false;
            }
            ///////////////////////////////////////////////////////////////
            if (!oldNewsQuery.contains(assessDocLine[0])) {
                news = false;
            }
            if (!oldWebQuery.contains(assessDocLine[0])) {
                web = false;
            }

            // If we are still looking at the same document ID, add the line to the DocArrayList
            // to make sure to get all slot filler entities for file
            if (forum == true &&/*  <---- comment out if forum*/ assessDocLine[3].contentEquals(oldForumDocID)) {
                chosenDocArrayList.get(nodeCount).add(nextLine);
                continue;
            }
            if (news == true && assessDocLine[3].contentEquals(oldNewsDocID)) {
                chosenDocArrayList.get(nodeCount).add(nextLine);
            }
            if (web == true && assessDocLine[3].contentEquals(oldWebDocID)) {
                chosenDocArrayList.get(nodeCount).add(nextLine);
            }

            if (!assessDocLine[3].contentEquals("NIL")) {
                // THE NEWSWIRE CASE
                if (assessDocLine[3].charAt(3) == '_' /*&& news == false /*&& newsCount < 0 /*&& (assessDocLine[1].contains("pos-towards"))*/) {
                    if (true/*assessDocLine[7].equals("C") && assessDocLine[8].equals("C") && assessDocLine[9].equals("C") && assessDocLine[10].equals("C")*/) {
                        
                        nodeCount++;
                        ArrayList<String> node = new ArrayList();
                        node.add(nextLine);
                        chosenDocArrayList.add(node);
                        //news = true;
                        newsCount++;
                        news = true;
                        oldNewsQuery = assessDocLine[0];
                        oldNewsDocID = assessDocLine[3];
                        node.add(oldNewsQuery);
                        node.add(oldNewsDocID);
                    }
                }
                // THE FORUM CASE
                if (assessDocLine[3].startsWith("bolt")/* comment out if forum ----->  && forum == false && forumCount < 0*/) {
                    if (true/*assessDocLine[7].equals("C") && assessDocLine[8].equals("C") && assessDocLine[9].equals("C") && assessDocLine[10].equals("C")*/) {
                        nodeCount++;
                        ArrayList<String> node = new ArrayList();
                        node.add(nextLine);
                        chosenDocArrayList.add(node);
                        // assessDocArrayList.add(nextLine);
                        forumCount++;
                        forum = true;
                        oldForumQuery = assessDocLine[0];
                        oldForumDocID = assessDocLine[3];
                        node.add(oldForumQuery);
                        node.add(oldForumDocID);
                    }
                }
                // THE WEB CASE
                if (assessDocLine[3].startsWith("eng") && web == false && webCount < 0) {
                    if (true/*assessDocLine[7].equals("C") && assessDocLine[8].equals("C") && assessDocLine[9].equals("C") && assessDocLine[10].equals("C")*/) {
                        nodeCount++;
                        ArrayList<String> node = new ArrayList();
                        node.add(nextLine);
                        chosenDocArrayList.add(node);
                    // assessDocArrayList.add(nextLine);
                        //web = true;
                        webCount++;
                        web = true;
                        oldWebQuery = assessDocLine[0];
                        oldWebDocID = assessDocLine[3];
                        node.add(oldWebQuery);
                        node.add(oldWebDocID);
                    }
                }
            }

        }
        // }
        System.out.println("newsCount: " + newsCount + " forumCount: " + forumCount + " webCount: " + webCount);

        return chosenDocArrayList;
    }
}
