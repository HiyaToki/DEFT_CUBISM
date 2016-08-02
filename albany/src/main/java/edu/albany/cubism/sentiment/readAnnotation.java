/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.albany.cubism.sentiment;

import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.lang.String;
import java.util.Arrays;
import java.util.HashMap;
import edu.albany.cubism.util.Settings;

/**
 *
 * @author Robert J. Giarrusso
 */
public class readAnnotation {

    public void parseAnnotation() throws FileNotFoundException, IOException {

        System.out.println("Creating Annotation Data Structure...\n");
        // Create the file buffers and readers
        //short example
        //FileReader annotFile = new FileReader("/home/jrgiarrusso/Documents/sentimentTestData/queries and annotations/LDC2013E61_TAC_2013_KBP_English_Sentiment_Slot_Filling_Sample_Queries_and_Annotations_V1.1/data/tac_2013_kbp_sentiment_slot_filling_sample_annotations.tab");   
        //long example
        //Training
        //FileReader annotFile = new FileReader("/home/jrgiarrusso/Documents/sentimentTestData/queries and annotations/LDC2013E78_TAC_2013_KBP_English_Sentiment_Slot_Filling_Training_Queries_and_Annotations_V1.0/data/tac_2013_kbp_sentiment_slot_filling_training_annotations.tab");
        //Non-Training
        FileReader annotFile = new FileReader(Settings.getValue("kbp_data_path")+"/2013_Evaluation/LDC2013E89_TAC_2013_KBP_English_Sentiment_Slot_Filling_Evaluation_Queries_and_Annotations/data/tac_2013_kbp_sentiment_slot_filling_evaluation_annotations.tab");
        
        BufferedReader br = new BufferedReader(annotFile);

        // String to store an entire line of the annotation file
        String annotLine;

        // Initialization of a Hashmap to store the tokens of each line
        HashMap<String, String[]> annoteHash = new HashMap<String, String[]>();

        // Go through all of the lines of the annotation file and obtain their tokens
        while ((annotLine = br.readLine()) != null) {

            // Split the line into different strings differentiated by the tab character
            String[] annoteLineParts = annotLine.split("\t");
            storeAnnotationLine(annoteLineParts, annoteHash);
            //System.out.println(Arrays.deepToString(annoteHash.get(annoteLineParts[0])));
        }
        br.close();

    }

    public void storeAnnotationLine(String[] token, HashMap<String, String[]> annoteHash) {

        //The Key is the Query ID and save the entire string array
        annoteHash.put(token[0], token.clone());

    }

}
