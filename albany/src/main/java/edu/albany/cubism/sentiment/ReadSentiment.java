/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.albany.cubism.sentiment;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mehrdad
 */
public class ReadSentiment {

    public static ArrayList<ArrayList<Sentiment>> readSentimentFromFile() {

        BufferedReader br = null;
        ArrayList<Sentiment> sentimentArray = new ArrayList<Sentiment>();
        ArrayList<Sentiment> notSentimentArray = new ArrayList<Sentiment>();

        ArrayList<ArrayList<Sentiment>> Sentiments = new ArrayList<ArrayList<Sentiment>>();

        try {
            File infile = new File("/home/aparna/Downloads/Validation_Ting_all.txt");
            br = new BufferedReader(new FileReader(infile));
            int strt = 0;
            int nd = 0;
            String cntx = "";
            String slt = "";
            String oqn = "";
            String rel = "";
            Double strgth = 0.0;
            String fndans = "";
            Boolean correct = true;
            Boolean firstLine = true;

            String line = "";

            while ((line = br.readLine()) != null) {
                if (line.contains(":")) {
                    String token[] = line.split(":");
                    String attribute = token[0].trim();
                    String value = token[1].trim();
                    if (attribute.toLowerCase().startsWith("start")) {
                        strt = Integer.valueOf(value);
                    } else if (attribute.toLowerCase().startsWith("end")) {

                        nd = Integer.valueOf(value);
                    } else if (attribute.toLowerCase().startsWith("context")) {

                        cntx = value;
                    } else if (attribute.toLowerCase().startsWith("slot")) {

                        slt = value;
                    } else if (attribute.toLowerCase().startsWith("ori")) {

                        oqn = value;
                    } else if (attribute.toLowerCase().startsWith("relation")) {

                        rel = value;
                    } else if (attribute.toLowerCase().startsWith("sentiment")) {

                        strgth = Double.valueOf(value);
                    } else if (attribute.toLowerCase().startsWith("found")) {

                        fndans = value;
                    }
                } else if (line.toLowerCase().startsWith("incorrect")) {
                    correct = false;
                } else if (line.startsWith("*")) {
                    if (firstLine){
                        firstLine = false;
                        continue;
                    }
                    Sentiment sentiment = new Sentiment(strt, nd, cntx, slt, oqn, rel, strgth, fndans);
                    if (correct) {
                        sentimentArray.add(sentiment);
                    } else {
                        notSentimentArray.add(sentiment);
                    }
                    correct = true;
                }
            }

            Sentiment sentiment = new Sentiment(strt, nd, cntx, slt, oqn, rel, strgth, fndans);
            if (correct) {
                sentimentArray.add(sentiment);
            } else {
                notSentimentArray.add(sentiment);
            }

            Sentiments.add(sentimentArray);
            Sentiments.add(notSentimentArray);
            
            br.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Sentiment.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Sentiment.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                br.close();
            } catch (IOException ex) {
                Logger.getLogger(Sentiment.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        return Sentiments;
    }
    
    public static void printSentiment(Sentiment s) {
        System.out.println(
                s.getStart() + "\t" + 
                s.getEnd() + "\t" + 
                s.getContext() + "\t" + 
                s.getSlot() + "\t" + 
                s.getOriginalQueryName() + "\t" + 
                s.getRelation() + "\t" + 
                s.getStrenght() + "\t" + 
                s.getFoundAnswer());
    }
    
    public static void main(String[] args) {
        
        ArrayList<ArrayList<Sentiment>> test = new ArrayList<ArrayList<Sentiment>>();

        test = ReadSentiment.readSentimentFromFile();

        System.out.println("List of Correct Sentiments:");
        for (Sentiment s : test.get(0)) {
            printSentiment(s);
        }

        System.out.println("List of inCorrect Sentiments:");
        for (Sentiment s : test.get(1)) {
            printSentiment(s);
        }
    }
}
