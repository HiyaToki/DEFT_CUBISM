/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.albany.cubism.sentiment;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import edu.albany.cubism.util.Settings;

/**
 *
 * @author jrgiarrusso
 */
public class ModifyAnswer {

    private class QueryData {

        String queryID;
        String slot;
        String team;
        String docID;
        String nameOffset;
        String name;
        String evidenceOffset;
        String score;
        boolean touched;
        boolean skip;

        public QueryData(String queryID, String slot, String team, String docID, String nameOffset, String name, String evidenceOffset, String score, boolean touched, boolean skip) {
            this.queryID = queryID;
            this.slot = slot;
            this.team = team;
            this.docID = docID;
            this.nameOffset = nameOffset;
            this.name = name;
            this.evidenceOffset = evidenceOffset;
            this.score = score;
            this.touched = touched;
            this.skip = skip;
        }
    }

    public void initialize() {

        String currLine = "";       // Holds the current line of the
        String queryID = "";        // The queryID for the current forum 
        ArrayList<QueryData> querySet = new ArrayList();     // An arrayList that will store the vital peices of the name
        boolean print = true;

        // Open the file that has the list of queries for forum discussions
        CustomFileReader answerOutput = new CustomFileReader(Settings.getValue("kbp_data_path")+"/2014evaluation/validator/2014Answer");
        CustomFileWriter answerUpdate = new CustomFileWriter(Settings.getValue("kbp_data_path")+"/2014evaluation/validator/2014AnswerUpdate");

        currLine = answerOutput.getNextLine();
        while (print) {
            querySet.clear();
            queryID = getQueryID(currLine, queryID);

            // Gather all of the data for an individual query
            while (currLine.startsWith(queryID)) {
                QueryData newQueryData = getQueryData(currLine);
                querySet.add(newQueryData);
                currLine = answerOutput.getNextLine();
                if (!answerOutput.hasNextLine()) {
                    print = false;
                }
            }

            if (queryID.contains("SSF14_ENG_308")) {
                System.out.println(querySet.get(querySet.size() - 1).queryID);
            }

            printToUpdate(querySet, answerUpdate);

        }

        querySet.clear();
        queryID = getQueryID(currLine, queryID);
        QueryData newQueryData = getQueryData(currLine);
        querySet.add(newQueryData);
        printToUpdate(querySet, answerUpdate);

        answerOutput.closeFile();
        answerUpdate.closeFile();
    }

    public void printToUpdate(ArrayList<QueryData> querySet, CustomFileWriter answerUpdate) {

        boolean noChange;
        double totalScore = 0;
        double avgScore = 0;
        boolean skip = false;
        ArrayList<Integer> savedItems = new ArrayList();

        for (int i = 0; i < querySet.size(); i++) {

            noChange = true;
            for (int j = 0; j < querySet.size(); j++) {

                if (i != j && querySet.get(i).name.contentEquals(querySet.get(j).name) && querySet.get(j).touched == false) {
                    noChange = false;
                    if (querySet.get(i).touched == false) {
                        savedItems.add(i);
                    }
                    querySet.get(i).touched = true;
                    querySet.get(j).touched = true;
                    querySet.get(j).skip = true;
                    savedItems.add(j);
                }
            }

            if (querySet.get(i).skip) {

            } else if (noChange) {

                if (querySet.get(i).docID.contentEquals("NIL")) {
                    answerUpdate.println(querySet.get(i).queryID + "\t" + querySet.get(i).slot + "\t" + querySet.get(i).team
                            + "\t" + querySet.get(i).docID);
                } else {

                    if (querySet.get(i).queryID.contains("SSF14_ENG_308")) {
                        System.out.println(querySet.get(i).queryID);
                        System.out.println(querySet.get(i).docID);
                    }

                    answerUpdate.println(querySet.get(i).queryID + "\t" + querySet.get(i).slot + "\t" + querySet.get(i).team
                            + "\t" + querySet.get(i).docID + ":" + querySet.get(i).evidenceOffset + "\t" + querySet.get(i).name
                            + "\t" + querySet.get(i).docID + ":" + querySet.get(i).nameOffset + "\t" + querySet.get(i).score);
                }

            } else {

                answerUpdate.print(querySet.get(i).queryID + "\t" + querySet.get(i).slot + "\t" + querySet.get(i).team + "\t");

                //Print out the evidence Offsets
                for (int k = 0; k < savedItems.size(); k++) {
                    if (k < 2) {
                        answerUpdate.print(querySet.get(i).docID + ":" + querySet.get(savedItems.get(k)).evidenceOffset);
                        if (k < savedItems.size() - 1) {
                            answerUpdate.print(",");
                        }

                    }

                }

                answerUpdate.print("\t" + querySet.get(i).name + "\t");
                //Print out the name Offsets
                for (int x = 0; x < savedItems.size(); x++) {
                    if (x < 2) {
                        answerUpdate.print(querySet.get(i).docID + ":" + querySet.get(savedItems.get(x)).nameOffset);
                        if (x < savedItems.size() - 1) {
                            answerUpdate.print(",");
                        }
                    }

                }

                totalScore = 0;

                for (int y = 0; y < savedItems.size(); y++) {

                    totalScore = totalScore + Double.parseDouble(querySet.get(savedItems.get(y)).score);
                }
                avgScore = totalScore / savedItems.size();
                avgScore = Double.parseDouble(new DecimalFormat("#.#").format(avgScore));
                answerUpdate.println("\t" + avgScore);
            }
        }

    }

    public QueryData getQueryData(String currLine) {

        String queryID;
        String slot;
        String team;
        String docID;
        String nameOffset;
        String name;
        String evidenceOffset;
        String score;
        boolean touched;
        boolean skip;
        String querySplit[];          // The split up forum document

        querySplit = currLine.split("\t");
        queryID = querySplit[0];
        slot = querySplit[1];
        team = "suny_albany2";

        if (querySplit[3].contentEquals("NIL")) {
            docID = "NIL";
            nameOffset = "";
            name = "";
            evidenceOffset = "";
            score = "";
            touched = true;
            skip = false;
        } else {
            docID = querySplit[3].substring(0, querySplit[3].indexOf(":"));
            evidenceOffset = querySplit[3].substring(querySplit[3].indexOf(":") + 1, querySplit[3].length());
            name = querySplit[4];
            nameOffset = querySplit[5].substring(querySplit[5].indexOf(":") + 1, querySplit[5].length());
            score = querySplit[6];
            touched = false;
            skip = false;
        }

        QueryData newQueryData = new QueryData(queryID, slot, team, docID, nameOffset, name, evidenceOffset, score, touched, skip);
        return newQueryData;
    }

    public String getQueryID(String currLine, String queryID) {
        queryID = currLine.substring(0, currLine.indexOf("\t"));
        return queryID;
    }

}
