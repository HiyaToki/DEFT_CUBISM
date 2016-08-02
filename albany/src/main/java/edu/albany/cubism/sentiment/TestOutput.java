/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.albany.cubism.sentiment;

import java.io.File;
import java.text.DecimalFormat;
import java.util.ArrayList;
import edu.albany.cubism.util.Settings;

/**
 *
 * @author jrgiarrusso
 */
public class TestOutput {

    private static TestOutput setUp = new TestOutput();             // The SetUp Function

    private class AssessItems {

        String queryID;
        String docID;
        String filler;

        public AssessItems(String queryID, String docID, String filler) {
            this.queryID = queryID;
            this.docID = docID;
            this.filler = filler;
        }
    }

    public static void main(String... args) {
        setUp.Testing();

    }

    private void Testing() {

        //Training 
        //CustomFileReader answerOutput = new CustomFileReader(Settings.getValue("kbp_data_path")+"/training_test_data/tac_2013_kbp_sentiment_slot_filling_training_annotations.tab");
        //Non-Training 
//        CustomFileReader answerOutput = new CustomFileReader(Settings.getValue("kbp_data_path")+"/non_training_test_data/tac_2013_kbp_sentiment_slot_filling_evaluation_annotations.tab");
        //2014 TEST
        CustomFileReader answerOutput = new CustomFileReader(Settings.getValue("kbp_data_path")+"/2014evaluation/annotation/tac_2014_kbp_english_sentiment_slot_filling_evaluation_annotations.tab");

        ArrayList<AssessItems> assessItems = new ArrayList();
        String currLine = "";
        String[] assessLine;
        String[] newsLine;
        String newsFillerParts[];
        String assessQueryID = "";
        String prevQueryID = "";
        String assessDocID = "";
        String checkDocID = "";
        String assessFiller = "";
        String newsQueryID = "";
        String newsDocID = "";
        String newsFiller = "";
        int allNewsPrinted = 0;
        int wrongCount = 0;
        int foundCount = 0;
        int docIDStringOffset;
        double foundFiller = 0;
        double totalFiller = 0;
        boolean found = false;
        boolean checkCount = false;
        boolean mustCount = true;
        DecimalFormat df = new DecimalFormat("#.0");
        String[] documentAndOffsetChunk;                            // Holds the set of docIDS and Offsets
        String documentAndOffset;

        // Add the queryId, documentId, and the slot filler from each line of the assessment file and store them into an arraylist
        while (answerOutput.hasNextLine()) {
            currLine = answerOutput.getNextLine();
            assessLine = currLine.split("\t");
            assessQueryID = assessLine[0].substring(0, /*13*/ 13);// 22 is training size (SSF13_ENG_TRAINING_003)*/
            documentAndOffset = assessLine[3];
            if (!documentAndOffset.contentEquals("NIL")) {
                documentAndOffsetChunk = documentAndOffset.split(",");
                docIDStringOffset = documentAndOffsetChunk[0].indexOf(":");
                assessDocID = documentAndOffsetChunk[0].substring(0, docIDStringOffset);
                assessFiller = assessLine[4];
            } else {
                assessDocID = "NIL";
                assessFiller = "NIL";
                foundFiller++;

                System.out.println(assessDocID);
                System.out.println(assessFiller);
                System.out.println(assessQueryID);
            }

            assessItems.add(new AssessItems(assessQueryID, assessDocID, assessFiller));

            // Calculate the total number of slot fillers in the assessments
            if (!assessQueryID.contentEquals(prevQueryID)) {
                checkCount = true;
                mustCount = true;
            }

            if (checkCount) {
                if (assessDocID.contentEquals("NIL") || ((assessDocID.charAt(3) == '_' && mustCount) || (mustCount == false && assessDocID.contentEquals(checkDocID)))) {
                    totalFiller++;
                    checkDocID = assessDocID;
                    mustCount = false;
                }
            }
            prevQueryID = assessQueryID;
        }
        answerOutput.closeFile();

        // Search through all of the newswire output files and see which answers match the stored information from the assessment file
        File[] newsFiles = new File(Settings.getValue("kbp_data_path")+"/newswire_output").listFiles();
        for (File file : newsFiles) {
            CustomFileReader newsOutput = new CustomFileReader(file.getAbsolutePath());
            while (newsOutput.hasNextLine()) {

                // Find the docID and queryID for the line
                currLine = newsOutput.getNextLine();

                if (!currLine.contains("NIL")) {
                    allNewsPrinted++;
                    newsLine = currLine.split("\t");
                    newsQueryID = newsLine[0].trim();
                    newsDocID = newsLine[5].substring(0, newsLine[5].indexOf(":")).trim();
                    newsFiller = newsLine[4];
                    newsFillerParts = newsFiller.split(" ");
//                System.out.println("\n" + newsQueryID);
//                System.out.println(newsDocID);

                    // For every item in  the assessList
                    for (int j = 0; j < assessItems.size(); j++) {
                        if (assessItems.get(j).docID.contentEquals(newsDocID) && assessItems.get(j).queryID.contentEquals(newsQueryID)) {
                            for (int k = 0; k < newsFillerParts.length; k++) {
                                if (found) {
//                                System.out.println("Already Found");
                                } else if (newsFiller.contains(assessItems.get(j).filler) || assessItems.get(j).filler.contains(newsFillerParts[k])) {
//                                System.out.println("YES - " + j + " - " + totalFiller);
//                                System.out.println(currLine);
//                                System.out.println(assessItems.get(j).filler);
                                    found = true;
                                    foundFiller++;

                                } else {
                                    if (k == newsFillerParts.length - 1 && !found) {
//                                        System.out.println("FALSE:\t" + currLine);
                                        wrongCount++;
                                    }

//                                System.out.println("NO - " + j + " - " + totalFiller);
//                                System.out.println(currLine);
//                                System.out.println(assessItems.get(j).filler);
                                }

                            }

                            found = false;
                        }
                    }

                } else {
                    allNewsPrinted++;
                    newsLine = currLine.split("\t");
                    newsQueryID = newsLine[0].trim();
                    for (int j = 0; j < assessItems.size(); j++) {
                        if (assessItems.get(j).queryID.contentEquals(newsQueryID)) {
                            System.out.println(currLine);
                            System.out.println(assessItems.get(j).filler);
                            if (assessItems.get(j).filler.contentEquals("NIL")) {
                                foundFiller++;
                            }
                        }

                    }
                }

//                System.out.println("----------");
            }
        }
        System.out.println("WrongCount:\t" + wrongCount);
        System.out.println("FoundCount:\t" + foundCount);
        System.out.println("\nRecall:\t\t\t\t" + (df.format(foundFiller / totalFiller * 100) + "%"));
        System.out.println("Precision:\t\t\t" + (df.format(foundFiller / allNewsPrinted * 100) + "%"));
        System.out.println("Answers Matching Key:\t\t" + foundFiller);
        System.out.println("Total Answers Submitted:\t" + allNewsPrinted);
        System.out.println("Number of Key Answers:\t\t" + totalFiller);
    }
}
