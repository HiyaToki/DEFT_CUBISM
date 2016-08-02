/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.albany.cubism.sentiment;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author tejasrao
 */
public class TextExtractor {

    public static void main(String[] args) {
        String currLine = "";               // The current line in the document
        String prevLine = "";
        String thisLine = "";
        String forum = "/home/tejasrao/Documents/tejas_look_in_here/Output/forum_wrong_merged.txt";
        CustomFileReader line = new CustomFileReader(forum);
        Set<String> wrong = new HashSet<String>();
        String[] splits;
        String[] offset;
        String[] doc;
        String lower;
        String upper;
        while (line.hasNextLine()) {
            prevLine = currLine;
            currLine = line.getNextLine();
            splits = currLine.split("\t");
            doc = splits[3].split(":");
            offset = doc[1].split("-");
            lower = offset[0];
            upper = offset[1];
            wrong.add(splits[0] + "@" + splits[3] + "@" + splits[4] + "@" + lower + "@" + upper);

        }
        for (String unique : wrong) {
            System.out.println(unique);
        }
        String[] parts;
        CustomFileWriter write = null;      // The writing file that will be used to write the entire document
        CustomFileWriter writeQuery = null;
        String pathNameSource = "/home/tejasrao/Documents/tejas_look_in_here/Output/assessment_output_sentences.txt";
        CustomFileReader read = new CustomFileReader(pathNameSource);
        for (String unique : wrong) {

            while (read.hasNextLine()) {
                currLine = read.getNextLine();
                parts = unique.split("@");
                if (currLine.startsWith("QueryID:") && currLine.contains(parts[0])) {
                    
                    System.out.println(currLine+"\t"+parts[0]);
                    
                }
            }
            
        }
    }
}
