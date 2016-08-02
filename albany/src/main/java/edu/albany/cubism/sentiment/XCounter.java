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

/**
 *
 * @author tejasrao
 */
public class XCounter {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        String inputFile1 = "/home/tejasrao/Documents/tejas_look_in_here/Output/suny_albany1.eval.txt";

        BufferedReader reader = new BufferedReader(new FileReader(inputFile1));
        CustomFileWriter writer = new CustomFileWriter("/home/tejasrao/Documents/tejas_look_in_here/new_queries_formatted_again.txt");
        String currLine;
        String currLine1;
        int cAndNil = 0;
        int cAndNotNil = 0;
        int correct = 0;
        String[] splits;
        String[] ind;
        ArrayList<String> req = new ArrayList<String>();
        while ((currLine = reader.readLine()) != null) {

            if (currLine.contains("NIL")) {
                cAndNil++;
                splits = currLine.split(" ");
                ind = splits[1].split(":");
                req.add(ind[0]);
                System.out.println(ind[0]);
            } else if ((currLine.startsWith("C ") || currLine.startsWith("c ")) && !currLine.contains("NIL") && !currLine.contains("bolt-")) {
                cAndNotNil++;
            }
        }
        System.out.println("NIL:\t" + cAndNil);
        System.out.println("Correct and Not Nil and Not Forum:\t" + cAndNotNil);
        reader.close();
        String inputFile2 = "/home/tejasrao/Documents/tejas_look_in_here/new_queries_formatted.txt";
        BufferedReader reader1 = new BufferedReader(new FileReader(inputFile2));
        while ((currLine1 = reader1.readLine()) != null) {
            
            
            if(req.contains(currLine1.split("\t")[0])){
                
            }
            else{
                System.out.println(currLine1);
                writer.print(currLine1+"\n");
            }
            
        }
        reader1.close();
        writer.closeFile();
        
    }

}
