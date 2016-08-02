/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.albany.cubism.sentiment;

/**
 *
 * @author tejasrao
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import edu.albany.cubism.util.Settings;

public class FormatOutput {

//    public static void main(String[] args) throws IOException {
//        Test(St);
//
//    }

    public static void Test(String sortedOutput) throws FileNotFoundException, IOException {
        //String inputFile = "/home/tejasrao/Documents/tejas_look_in_here/Data/2014evaluation/annotation/tac_2014_kbp_english_sentiment_slot_filling_evaluation_annotations.tab";
        //String inputFile = "/home/tejasrao/Documents/tejas_look_in_here/Data/2013_Evaluation/LDC2013E89_TAC_2013_KBP_English_Sentiment_Slot_Filling_Evaluation_Queries_and_Annotations/data/tac_2013_kbp_sentiment_slot_filling_evaluation_annotations.tab";
        //String inputFile = "/home/tejasrao/Documents/tejas_look_in_here/base_sorted.txt";
        String outputFile = Settings.getValue("kbp_sentiment_path")+"/base_sorted_formatted1.txt";
        BufferedReader reader = new BufferedReader(new FileReader(sortedOutput));
        BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));
        String currLine;
        ArrayList<String> lines = new ArrayList<String>();
        ArrayList<String> nil = new ArrayList<String>();
        ArrayList<String> notnil = new ArrayList<String>();
        String nextLine;
        String[] splits;
        while ((currLine = reader.readLine()) != null) {
            if (!currLine.contains("NIL")) {
                lines.add(currLine);
                //System.out.println(currLine);
            } else {
                nil.add(currLine);
            }
        }
        boolean repeatValue = true;
        boolean docfound = true;
        String name = null;
        String query = null;
        for (int i = 0; i < lines.size(); i++) {
            String docID = lines.get(i).split("\t")[3];
            if (i > 0) { 
                name = lines.get(i - 1).split("\t")[4];
                query = lines.get(i - 1).split("\t")[0];
            }
            String checkValueString = lines.get(i).split("\t")[0];
            boolean checkValue = true;

            //skip duplicates
            if ((i > 0) && (lines.get(i).split("\t")[0].contentEquals(query)) && (lines.get(i).split("\t")[4].contentEquals(name))) {

            } else {

                for (int j = i + 1; j < lines.size(); j++) {

//                if (checkValueString.contentEquals(lines.get(j).split("\t")[0])) {
                    if ((lines.get(i).split("\t")[0].contentEquals(lines.get(j).split("\t")[0])) && (lines.get(i).split("\t")[4].contentEquals(lines.get(j).split("\t")[4]))) {
                        docID = docID + "," + lines.get(j).split("\t")[3];

//                    System.out.println(+",""+lines.get(i).split("\t")[3]
                    } else {
                        checkValue = false;

                    }

                }
                if (!lines.get(i).contains("NIL")) {
                //System.out.println(lines.get(i).split("\t")[0] + "\t" + lines.get(i).split("\t")[1] + "\t" + lines.get(i).split("\t")[2] + "\t" + docID + "\t" + lines.get(i).split("\t")[4] + "\t" + lines.get(i).split("\t")[5] + "\t" + "\t" + lines.get(i).split("\t")[6]);

                    nil.add(lines.get(i).split("\t")[0] + "\t" + lines.get(i).split("\t")[1] + "\t" + lines.get(i).split("\t")[2] + "\t" + docID + "\t" + lines.get(i).split("\t")[4] + "\t" + lines.get(i).split("\t")[5] );

                    //nil.add(lines.get(i).split("\t")[0] + "\t" + lines.get(i).split("\t")[1] + "\t" + lines.get(i).split("\t")[2] + "\t" + docID + "\t" + lines.get(i).split("\t")[4] + "\t" + lines.get(i).split("\t")[5] + "\t" + "\t" + lines.get(i).split("\t")[6]);
                } else {
                    //System.out.println(lines.get(i).split("\t")[0] + "\t" + lines.get(i).split("\t")[1] + "\t" + lines.get(i).split("\t")[2] + "\t" + "NIL");
                }
            }
        }
        Collections.sort(nil);
        for (String unique : nil) {
            writer.write(unique);
            writer.newLine();
        }
        writer.close();

        reader.close();
        
    }
}
