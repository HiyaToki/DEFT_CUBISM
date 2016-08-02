/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.albany.cubism.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mehrdad
 */
public class OpenANEWChinese extends OpenANEW {

    public OpenANEWChinese() {
        BufferedReader br = null;
        try {
            String aNewPath = Settings.getValue("ANEWChinese");
            System.out.println("aNew path: " + aNewPath);
            br = new BufferedReader(new FileReader(new File(aNewPath)));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(OpenANEW.class.getName()).log(Level.SEVERE, null, ex);
        }

        String a_line = null;
        int i = 0;
        try {
            while ((a_line = br.readLine()) != null) {
                if (i == 0) {
                    i++;
                    continue;
                }

                i++;
                if (a_line.trim().length() > 0) {
                    String[] tokens = a_line.split("\t");
                    String word = tokens[0].trim();
                    double score = Double.parseDouble(tokens[1]);
                    wsMap.put(word, score);
                }
            }
            br.close();
//                System.out.println("bad_relations: " + bad_relations);
        } catch (IOException ex) {
            System.out.println("No ANEWChinse file!");
        }
    }

    public static void main(String... args) throws SQLException, IOException {
//         new OpenANEW().printTable();
        OpenANEWChinese oa = new OpenANEWChinese();
        System.out.println("word senti: " + oa.wordSentimentOf("impressed"));
        System.out.println("word senti: " + oa.wordSentimentOf("暗杀"));
        System.out.println("word senti: " + oa.wordSentimentOf("downfall"));
    }
}