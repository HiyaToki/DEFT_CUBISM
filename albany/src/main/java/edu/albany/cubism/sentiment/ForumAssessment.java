package edu.albany.cubism.sentiment;

import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
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
public class ForumAssessment {

    private static ForumAssessment setUp = new ForumAssessment();

    private class AssessItems {

        String queryID;
        String sent;
        String docID;
        String filler;
        String scndDocId;
        String score;
        String docChunk;

        public AssessItems(String queryID, String sent, String docID, String filler, String scndDocId, String score, String docChunk) {
            this.queryID = queryID;
            this.sent = sent;
            this.docID = docID;
            this.filler = filler;
            this.scndDocId = scndDocId;
            this.score = score;
            this.docChunk = docChunk;
        }
    }

    public static void main(String... args) throws IOException {
        setUp.Testing();

    }

    private void Testing() throws IOException {

        //Provide path to System Output File In order to format it to match the assessment format.
        String inputFile = Settings.getValue("kbp_data_path")+"/2014Answer";
        String outputFile = Settings.getValue("kbp_data_path")+"/forum_formatted.txt";
        String testFile = Settings.getValue("kbp_data_path")+"/forum_formatted.txt";
        ForumSort.Test(inputFile, outputFile);

        CustomFileReader answerInput = new CustomFileReader(Settings.getValue("kbp_data_path")+"/2014Answer");
        CustomFileReader answerOutput = new CustomFileReader(Settings.getValue("kbp_data_path")+"/2014evaluation/annotation/test_all_forum.txt");
//        CustomFileReader answerOutput = new CustomFileReader(Settings.getValue("kbp_data_path")+"/Assessment_Forum.txt");
        //CustomFileReader answerOutput = new CustomFileReader(Settings.getValue("kbp_data_path")+"/CombinedAnswer.txt");
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

        String assessSent = "";
        String secondDocId = "";
        String score = "";
	ArrayList<String> processed_items = new ArrayList();
	ArrayList<String> correct_items = new ArrayList();

        ArrayList<String> answer_items = new ArrayList();
        ArrayList<String> match_items = new ArrayList();
        while (answerInput.hasNextLine()) {
            currLine = answerInput.getNextLine();
            answer_items.add(currLine);
        }
        
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
                assessSent = assessLine[1];
                secondDocId = assessLine[5];
                score = "1.0";//assessLine[6];
                //System.out.println(assessFiller);
            } else {
                assessDocID = "NIL";
                assessFiller = "NIL";
                //foundFiller++;
            }
            assessItems.add(new ForumAssessment.AssessItems(assessQueryID, assessSent, assessDocID, assessFiller, secondDocId, score, documentAndOffset));

            if (!assessQueryID.contentEquals(prevQueryID)) {
                checkCount = true;
                mustCount = true;
            }

            if (checkCount) {
                if (assessDocID.contentEquals("NIL") || /*(assessDocID.startsWith("bolt"))||assessDocID.charAt(3) == '_' && mustCount) ||*/ ((mustCount == false && assessDocID.contentEquals(checkDocID)))) {
                    totalFiller++;
                    checkDocID = assessDocID;
                    mustCount = false;
                }
            }
            prevQueryID = assessQueryID;
            totalFiller++;
        }
        double numOfNil = 0;
        double nil = 0;
        System.out.println(foundFiller);
        answerOutput.closeFile();
        int inexact = 0;
        int offsetmatch = 0;
        boolean docfound = false;
        Set<String> lines = new HashSet<String>();
        Set<String> wrong = new HashSet<String>();
        //CustomFileReader newsOutput = new CustomFileReader(Settings.getValue("kbp_data_path")+"/Output/EvalAnswer1.txt");
        CustomFileReader newsOutput = new CustomFileReader(testFile);
        CustomFileWriter writer = new CustomFileWriter(Settings.getValue("kbp_data_path")+"/forum_wrong_merged.txt");

        while (newsOutput.hasNextLine()) {
            currLine = newsOutput.getNextLine();
            if (!currLine.contains("NIL")) {
                newsLine = currLine.split("\t");
                newsQueryID = newsLine[0].trim();
		newsFiller = newsLine[4];
                newsDoc = newsLine[3].split(",");
		String item = newsQueryID + "_" + newsFiller;
		if (!processed_items.contains(item)) {
		    processed_items.add(item);
		    allNewsPrinted++;
		}
                for (String s : newsDoc) {
                    //System.out.println(s);
                    newsDocID = s.substring(0, s.indexOf(":")).trim();
                    newsFillerParts = newsFiller.split(" ");
                    newsOffsetFinder = s.split(":");
                    newsOffset = newsOffsetFinder[1];
                    offsets = newsOffset.split("-");
                    lowerOffsetNews = Integer.parseInt(offsets[0]);

                    upperOffsetNews = Integer.parseInt(offsets[1]);
                    Boolean notFound = false;
                    ArrayList goodones = new ArrayList();
                    //System.out.println(lowerOffsetNews);
                    //System.out.println(assessItems.size());
                    for (int i = 0; i < assessItems.size(); i++) {

                        if (assessItems.get(i).docID.contentEquals(newsDocID) && assessItems.get(i).queryID.contentEquals(newsQueryID)) {
                            indDocs = assessItems.get(i).docChunk.split(",");

                            for (String docs : indDocs) {
//                                docfound = false;
                                assessOffsetFinder = docs.split(":");
                                assessOffset = assessOffsetFinder[1];
                                offsetsOfAssess = assessOffset.split("-");
                                lowerOffsetAssess = Integer.parseInt(offsetsOfAssess[0]);
                                upperOffsetAssess = Integer.parseInt(offsetsOfAssess[1]);
                                int expLower = lowerOffsetAssess;
                                int expUpper = upperOffsetAssess;
//                                System.out.println(lowerOffsetAssess);

//                                System.out.println(upperOffsetAssess);
//                                System.out.println(lowerOffsetNews);
//                                System.out.println(upperOffsetNews);
                                //System.out.println("Filler:"+newsFiller);
                                if (((lowerOffsetNews >= expLower - 200) && (lowerOffsetNews <= expUpper + 200)) 
				        || ((upperOffsetNews >= expLower - 200) && (upperOffsetNews <= expUpper + 200))
                                        || ((lowerOffsetNews - 200 <= expLower) && (upperOffsetNews + 200 >= expLower))
                                        || ((lowerOffsetNews - 200 <= expUpper) && (upperOffsetNews + 200 >= expUpper))) {
                                    if (docfound) {
                                    } else {
                                        offsetmatch++;
                                        notFound = true;
                                        for (int k = 0; k < newsFillerParts.length; k++) {
                                            System.out.println("newsfiller:" + newsFiller + "\t" + "assessfiller:" + assessItems.get(i).filler);
                                            if (found) {

                                            } else if ((newsFiller.contains(assessItems.get(i).filler) || assessItems.get(i).filler.contains(newsFiller))) {//&&(!newsFiller.contentEquals(assessItems.get(i).filler)))  {
                                                //} else if(newsFiller.contentEquals(assessItems.get(i).filler)){
                                                lines.add(assessItems.get(i).queryID + "@" + assessItems.get(i).docID + "@" + assessItems.get(i).filler + "@" + newsDocID + "@" + newsFiller + "@" /* lowerOffsetAssess + "-" + upperOffsetAssess + "@" + lowerOffsetNews + "-" + upperOffsetNews*/);
                                                for (int idx=0; idx<answer_items.size(); idx++){
                                                    String an_item=answer_items.get(idx);
                                                    if (an_item.contains(newsQueryID) && an_item.contains(newsFiller) && an_item.contains(s)){
                                                        if (!match_items.contains(an_item))
                                                           match_items.add(an_item);
                                                    }
                                                }
                                                goodones.add(assessItems.get(i).queryID + "\t" + assessItems.get(i).sent + "\t" + "suny_albany" + "\t" + assessItems.get(i).docID + ":" + lowerOffsetAssess + "-" + upperOffsetAssess + "\t" + assessItems.get(i).filler + "\t" + assessItems.get(i).scndDocId + "\t" + assessItems.get(i).score + "\n");
                                                //System.out.println(assessItems.get(i).queryID + "@" + assessItems.get(i).docID + "@" + assessItems.get(i).filler + "@" + newsDocID + "@" + newsFiller);
                                                found = true;
                                                docfound = true;
                                                //inexact++;
                                                //foundFiller++;
                                            } else {
                                                //System.out.print(assessItems.get(i).queryID + "@" + assessItems.get(i).docID + "@" + assessItems.get(i).filler + "@" + newsDocID + "@" + newsFiller + "@Wrong" + "\n");
//                                                if (/*k == newsFillerParts.length - 1 &&*/ !found) {
                                                //}
                                            }

                                        }
                                        if (!docfound) {
                                            if (!wrong.contains(assessItems.get(i).queryID + "\t" + assessItems.get(i).sent + "\t" + "suny_albany" + "\t" + assessItems.get(i).docID + ":" + lowerOffsetAssess + "-" + upperOffsetAssess + "\t" + assessItems.get(i).filler + "\t" + assessItems.get(i).scndDocId + "\t" + assessItems.get(i).score + "\n")
                                                    && !goodones.contains(assessItems.get(i).queryID + "\t" + assessItems.get(i).sent + "\t" + "suny_albany" + "\t" + assessItems.get(i).docID + ":" + lowerOffsetAssess + "-" + upperOffsetAssess + "\t" + assessItems.get(i).filler + "\t" + assessItems.get(i).scndDocId + "\t" + assessItems.get(i).score + "\n")) {
                                                wrong.add(assessItems.get(i).queryID + "\t" + assessItems.get(i).sent + "\t" + "suny_albany" + "\t" + assessItems.get(i).docID + ":" + lowerOffsetAssess + "-" + upperOffsetAssess + "\t" + assessItems.get(i).filler + "\t" + assessItems.get(i).scndDocId + "\t" + assessItems.get(i).score + "\n");
                                            }

//                                        System.out.println("FALSE:\t" + currLine);
                                            wrongCount++;
                                        }
                                        found = false;
                                    }

                                } else if (!docfound) {
                                    if (!wrong.contains(assessItems.get(i).queryID + "\t" + assessItems.get(i).sent + "\t" + "suny_albany" + "\t" + assessItems.get(i).docID + ":" + lowerOffsetAssess + "-" + upperOffsetAssess + "\t" + assessItems.get(i).filler + "\t" + assessItems.get(i).scndDocId + "\t" + assessItems.get(i).score + "\n")
                                            && !goodones.contains(assessItems.get(i).queryID + "\t" + assessItems.get(i).sent + "\t" + "suny_albany" + "\t" + assessItems.get(i).docID + ":" + lowerOffsetAssess + "-" + upperOffsetAssess + "\t" + assessItems.get(i).filler + "\t" + assessItems.get(i).scndDocId + "\t" + assessItems.get(i).score + "\n")) {
                                        wrong.add(assessItems.get(i).queryID + "\t" + assessItems.get(i).sent + "\t" + "suny_albany" + "\t" + assessItems.get(i).docID + ":" + lowerOffsetAssess + "-" + upperOffsetAssess + "\t" + assessItems.get(i).filler + "\t" + assessItems.get(i).scndDocId + "\t" + assessItems.get(i).score + "\n");
                                    }
                                }

                            }
                            docfound = false;

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
        ArrayList<String> sorted = new ArrayList<String>(wrong);
        Collections.sort(sorted);
        for (String wrg : sorted) {
            writer.print(wrg);
        }
        writer.closeFile();

        newsOutput.closeFile();
        double recall;
        double precision;
        double fmeasure;
        recall = (foundFiller / totalFiller * 100);
        precision = (foundFiller / allNewsPrinted * 100);
        fmeasure = 2 * precision * recall / (precision + recall);
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
        
        
        CustomFileWriter new_writer = new CustomFileWriter(Settings.getValue("kbp_data_path")+"/tmp_format.txt");
        for (int k=0; k<match_items.size(); k++)
            new_writer.println(match_items.get(k).split("@@@@@")[1]);
        new_writer.closeFile();
    }

}
