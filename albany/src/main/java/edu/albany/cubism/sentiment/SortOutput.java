/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.albany.cubism.sentiment;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import static edu.albany.cubism.sentiment.FormatOutput.Test;

/**
 *
 * @author tejasrao
 */
public class SortOutput {

//    public static void main(String[] args) throws IOException {
//        Test();
//        
//    }
    public static void Test(String inputFile, String outputFile) throws FileNotFoundException, IOException {

        //String inputFile = "/home/tejasrao/Documents/tejas_look_in_here/Data/2014Answer";
        //String outputFile = "/home/tejasrao/Documents/tejas_look_in_here/base_sorted_merged.txt";
        BufferedReader reader = new BufferedReader(new FileReader(inputFile));
        CustomFileWriter writer = new CustomFileWriter(outputFile);
        String currLine;
        String[] splits;
        String[] sorts;
        ArrayList<String> lines = new ArrayList<String>();
        System.out.println("inputFile: " + inputFile);
        while ((currLine = reader.readLine()) != null) {
            if (!currLine.contains("NIL") && currLine.contains("bolt-")) {
                splits = currLine.split("\t");
                if(!splits[4].contentEquals("")){
                lines.add(splits[4] + "\t" + splits[0] + "\t" + splits[1] + "\t" + splits[2] + "\t" + splits[3] + "\t" + splits[5] + "\t" + splits[6]);
                }
            }
        }
        Collections.sort(lines);
        for (String unique : lines) {
            sorts = unique.split("\t");
            writer.print(sorts[1] + "\t" + sorts[2] + "\t" + sorts[3] + "\t" + sorts[4] + "\t" + sorts[0] + "\t" + sorts[5] + "\t" + sorts[6] + "\n");
            System.out.println(unique);
        }
        reader.close();
        writer.closeFile();
        
        
        FormatOutput.Test(outputFile);

    }

}
