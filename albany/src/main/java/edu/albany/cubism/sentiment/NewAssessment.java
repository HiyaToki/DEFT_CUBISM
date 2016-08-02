package edu.albany.cubism.sentiment;

import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import edu.albany.cubism.util.Settings;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tejasrao
 */
public class NewAssessment {

    private static NewAssessment setUp = new NewAssessment();

    private class AssessItems {

        String queryID;
        String docID;
        String filler;
        String docChunk;

        public AssessItems(String queryID, String docID, String filler, String docChunk) {
            this.queryID = queryID;
            this.docID = docID;
            this.filler = filler;
            this.docChunk = docChunk;
        }
    }

    public static void main(String... args) throws IOException {
        setUp.Testing();

    }

    private void Testing() throws IOException {
        
        //Provide path to System Output File In order to format it to match the assessment format.
        String inputFile = Settings.getValue("kbp_data_path")+"/2014Answer";
        String outputFile = Settings.getValue("kbp_sentiment_path")+"/base_sorted_merged.txt";
        String testFile = Settings.getValue("kbp_sentiment_path")+"/base_sorted_formatted1.txt";
        SortOutput.Test(inputFile, outputFile);
        
        CustomFileReader answerOutput = new CustomFileReader(Settings.getValue("kbp_data_path")+"/2014evaluation/annotation/Assessment.txt");
//        CustomFileReader answerOutput = new CustomFileReader("/home/tejasrao/Documents/tejas_look_in_here/Data/Assessment.txt");
        //CustomFileReader answerOutput = new CustomFileReader("/home/tejasrao/Documents/tejas_look_in_here/CombinedAnswer.txt");
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
        String docChunk = "";
        String[] newsOffsetFinder;
        String newsOffset = "";
        String[] offsets;
        int upperOffsetNews;
        int lowerOffsetNews;
        int upperOffsetAssess;
        int lowerOffsetAssess;
        String[] assessOffsetFinder;
        String assessOffset;
        String[] offsetsOfAssess;
        String[] indDocs;
        String[] newsDoc;

        while (answerOutput.hasNextLine()) {
            currLine = answerOutput.getNextLine();
            assessLine = currLine.split("\t");
            assessQueryID = assessLine[0];
            documentAndOffset = assessLine[3];
            if (!documentAndOffset.contentEquals("NIL")) {
                documentAndOffsetChunk = assessLine[3].split(",");
                docIDStringOffset = documentAndOffsetChunk[0].indexOf(":");
                assessDocID = documentAndOffsetChunk[0].substring(0, docIDStringOffset);
                assessFiller = assessLine[4];
                //System.out.println(assessFiller);
            } else {
                assessDocID = "NIL";
                assessFiller = "NIL";
                //foundFiller++;
            }
            assessItems.add(new AssessItems(assessQueryID, assessDocID, assessFiller, documentAndOffset));

            if (!assessQueryID.contentEquals(prevQueryID)) {
                checkCount = true;
                mustCount = true;
            }

            if (checkCount) {
                if (assessDocID.contentEquals("NIL") || /*(assessDocID.startsWith("bolt"))||*/ ((assessDocID.charAt(3) == '_' && mustCount) || (mustCount == false && assessDocID.contentEquals(checkDocID)))) {
                    totalFiller++;
                    checkDocID = assessDocID;
                    mustCount = false;
                }
            }
            prevQueryID = assessQueryID;
        }
        double numOfNil = 0;
        double nil=0;
        System.out.println(foundFiller);
        answerOutput.closeFile();
        int inexact = 0;
        int offsetmatch = 0;
        boolean docfound = false;
        Set<String> lines = new HashSet<String>();
        //CustomFileReader newsOutput = new CustomFileReader("/home/tejasrao/Documents/tejas_look_in_here/Output/EvalAnswer1.txt");
        CustomFileReader newsOutput = new CustomFileReader(testFile);
        while (newsOutput.hasNextLine()) {
            currLine = newsOutput.getNextLine();
            if (!currLine.contains("NIL")) {
                allNewsPrinted++;
                newsLine = currLine.split("\t");
                newsQueryID = newsLine[0].trim();

                newsDoc = newsLine[3].split(",");
                for (String s : newsDoc) {
                    //System.out.println(s);
                    newsDocID = s.substring(0, s.indexOf(":")).trim();
                    newsFiller = newsLine[4];
                    newsFillerParts = newsFiller.split(" ");
                    newsOffsetFinder = s.split(":");
                    newsOffset = newsOffsetFinder[1];
                    offsets = newsOffset.split("-");
                    lowerOffsetNews = Integer.parseInt(offsets[0]);

                    upperOffsetNews = Integer.parseInt(offsets[1]);
                    Boolean notFound = false;
                    //System.out.println(lowerOffsetNews);
                    //System.out.println(assessItems.size());
                    for (int i = 0; i < assessItems.size(); i++) {

                        if (assessItems.get(i).docID.contentEquals(newsDocID) && assessItems.get(i).queryID.contentEquals(newsQueryID)) {
                            indDocs = assessItems.get(i).docChunk.split(",");

                            for (String docs : indDocs) {
                                docfound = false;
                                assessOffsetFinder = docs.split(":");
                                assessOffset = assessOffsetFinder[1];
                                offsetsOfAssess = assessOffset.split("-");
                                lowerOffsetAssess = Integer.parseInt(offsetsOfAssess[0]);
                                upperOffsetAssess = Integer.parseInt(offsetsOfAssess[1]);
                                int expLower = lowerOffsetAssess - 200;
                                int expUpper = upperOffsetAssess + 200;
//                                System.out.println(lowerOffsetAssess);

//                                System.out.println(upperOffsetAssess);
//                                System.out.println(lowerOffsetNews);
//                                System.out.println(upperOffsetNews);
                                //System.out.println("Filler:"+newsFiller);
                                if (((lowerOffsetNews >= expLower) && (lowerOffsetNews <= expUpper)) || ((upperOffsetNews >= expLower) && (upperOffsetNews <= expUpper))) {
                                    if (docfound) {
                                    } else {
                                        offsetmatch++;
                                        notFound = true;
                                        for (int k = 0; k < newsFillerParts.length; k++) {
                                            if (found) {

                                            } else if ((newsFiller.contains(assessItems.get(i).filler) || assessItems.get(i).filler.contains(newsFiller))) {//&&(!newsFiller.contentEquals(assessItems.get(i).filler)))  {
                                                //} else if(newsFiller.contentEquals(assessItems.get(i).filler)){
                                                lines.add(assessItems.get(i).queryID + "@" + assessItems.get(i).docID + "@" + assessItems.get(i).filler + "@" + newsDocID + "@" + newsFiller + "@" + lowerOffsetAssess + "-" + upperOffsetAssess + "@" + lowerOffsetNews + "-" + upperOffsetNews);
                                                //System.out.println(assessItems.get(i).queryID + "@" + assessItems.get(i).docID + "@" + assessItems.get(i).filler + "@" + newsDocID + "@" + newsFiller);
                                                found = true;
                                                docfound = true;
                                                //inexact++;
                                                //foundFiller++;
                                            } else {
                                                //System.out.print(assessItems.get(i).queryID + "@" + assessItems.get(i).docID + "@" + assessItems.get(i).filler + "@" + newsDocID + "@" + newsFiller + "@Wrong" + "\n");
                                                if (k == newsFillerParts.length - 1 && !found) {
//                                        System.out.println("FALSE:\t" + currLine);
                                                    wrongCount++;
                                                }
                                            }

                                        }
                                        found = false;
                                    }

                                }
                                docfound = false;
                            }

                        }
                    }
                }

            } else {
                allNewsPrinted++;
                newsLine = currLine.split("\t");
                nil++;
                newsQueryID = newsLine[0].trim();
                for (int j = 0; j < assessItems.size(); j++) {
                    if (assessItems.get(j).queryID.contentEquals(newsQueryID)) {
                        //System.out.println(currLine);

                        System.out.print(assessItems.get(j).queryID + "@" + assessItems.get(j).docID + "@" + assessItems.get(j).filler + "@NIL" + "\n");
                        if (assessItems.get(j).filler.contentEquals("NIL")) {
                            System.out.println("Hello");
                            foundFiller++;
                            numOfNil++;
                        }
                    }

                }
            }

        }

        for (String unique : lines) {
            System.out.println(unique);
            foundFiller++;
        }

        newsOutput.closeFile();
        double recall;
        double precision;
        double fmeasure;
        recall = (foundFiller / totalFiller * 100);
        precision = (foundFiller / allNewsPrinted * 100);
        fmeasure = 2*precision*recall/(precision + recall);
        System.out.println("Number of NIL Matches:" + numOfNil);
        System.out.println("Number of NIL:" + nil);
        System.out.println("Offset Match:" + offsetmatch);
        System.out.println("WrongCount:\t" + wrongCount);
        System.out.println("FoundCount:\t" + foundCount);
        System.out.println("\nTotal Filler:" + totalFiller);
        System.out.println("\nRecall:\t\t\t\t" + (df.format(recall) + "%"));
        System.out.println("Precision:\t\t\t" + (df.format(precision) + "%"));
        System.out.println("F-Measure:\t\t\t" + (df.format(fmeasure)));
        System.out.println("Answers Matching Key:\t\t" + foundFiller);
        System.out.println("Total Answers Submitted:\t" + allNewsPrinted);
        System.out.println("Number of Key Answers:\t\t" + totalFiller);
    }

}
