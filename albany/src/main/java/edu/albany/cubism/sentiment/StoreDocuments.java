/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.albany.cubism.sentiment;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import edu.albany.cubism.sentiment.LoadQuerys.QueryInput;
import edu.albany.cubism.sentiment.CustomFileReader;
import edu.albany.cubism.sentiment.CustomFileWriter;
import edu.albany.cubism.util.Settings;

/**
 *
 * @author Robert J. Giarrusso
 */
public class StoreDocuments {

    public HashMap<String, String> searchArrayList(ArrayList<QueryInput> queryArrayList) {

        File[] parentDirect = new File(Settings.getValue("kbp_data_path")+"/2014evaluation/Source_Corpus_Files").listFiles();  // The starting directory of the data
        HashMap<String, String> docsFullHash = new HashMap();       // A HashMap to store the documents necessary

        // For every individual index of the array List
        for (int i = 0; i < queryArrayList.size(); i++) {

            // Look at every file and see if it is the matching one
            for (File child : parentDirect) {
                if (queryArrayList.get(i).docid.contains(child.getName())) {

                    // We Have a match, so now open the file based on the child's pathname
                    System.out.println("FOUND A MATCH: " + child.getName());

                    parseDocument(child.getAbsolutePath(), queryArrayList.get(i).docid, docsFullHash);
                }
            }
        }

        // Test to print out the entire hashmap
//        for (int i = 0; i < queryArrayList.size(); i++){
//            if(docsFullHash.get(queryArrayList.get(i).docid) != null)
//                System.out.println(docsFullHash.get(queryArrayList.get(i).docid) + "\n");
//        }
        writeSentencesToFile(docsFullHash, queryArrayList);
        
        return docsFullHash;

    }

    public void parseDocument(String docPathName, String docid, HashMap docsFullHash) {

        StringBuilder totalDocBuilder = new StringBuilder();        // A string that will hold the entire document
        CustomFileReader read = new CustomFileReader(docPathName);  // Open up the file found earlier
        String currLine = "\n";                                     // The line before looking at the next
        String nextLine = "\n";                                     // The currently read line
        String totalDoc;                                            // A string to hold the document in the document id  
        boolean endOfDoc = false;                                   // Tells us if we are at the end of the document

        // While there is a another line to be read in the file and
        // we haven't gotten to the end of the needed document
        System.out.println("docid: " + docid);
        while (read.hasNextLine() && !endOfDoc) {
            currLine = nextLine;
            nextLine = read.getNextLine();

            // We are finished if we are reading the file still and we run into the end of the document
            if (totalDocBuilder.length() != 0 && (nextLine.contains("</doc>") || nextLine.contains("</DOC>"))) {

                totalDocBuilder.append(nextLine);
                endOfDoc = true;
                totalDoc = totalDocBuilder.toString();

                // Save the Entire document into the docsFullHash
                docsFullHash.put(docid, totalDoc);

                //System.out.println(totalDocBuilder);
            }

            // Keep copying text over if the length of the document is greater than zero and
            // we have not reached the end of the document
            if (totalDocBuilder.length() != 0 && !endOfDoc) {
                totalDocBuilder.append(nextLine);

                //////////////////////////////
                //MAY NEED TO FIX THIS LINE//
                ////////////////////////////
                totalDocBuilder.append("\n");

            }

            // If we found the line that has the document id, then we decide where
            // we should start copying over the data from the specific file
            if (nextLine.contains(docid)) {
                decideParse(currLine, nextLine, totalDocBuilder);
            }

        }

    }

    public void decideParse(String currLine, String nextLine, StringBuilder totalDoc) {

        //Decide where to start appending to the total document string
        if (nextLine.startsWith("<DOCID> ")) {
            totalDoc.append(currLine);
            totalDoc.append(nextLine);
        }
        if (nextLine.startsWith("<DOC ") || nextLine.startsWith("<doc ")) {
            totalDoc.append(nextLine);
        }
    }

    public void writeSentencesToFile(HashMap docsFullHash, ArrayList<QueryInput> queryArrayList) {
        
        String docPathName = Settings.getValue("kbp_data_path")+"/2014evaluation/Source_Corpus_Files/output_sentences.txt";
        CustomFileWriter write = new CustomFileWriter(docPathName);  // Open up the file found earlier

        // Go through the Array list all of the assessment documents and then for each one, find it's corresponding query information from the .XML file
        // as well as print out the entire document.
        for (int i = 0; i < queryArrayList.size(); i++) {

            System.out.println(queryArrayList.get(i).queryid);

            // THE NEWSWIRE CASE
            if (queryArrayList.get(i).docid.charAt(3) == '_') {
                write.println("NEWSWIRE CASE\n");
                System.out.println("NEWSWIRE -" + queryArrayList.get(i).docid);
            }
            // THE FORUM CASE
            if (queryArrayList.get(i).docid.startsWith("bolt")) {
                write.println("FORUM CASE\n");
                System.out.println("FORUM -" + queryArrayList.get(i).docid);
            }
            // THE WEB CASE
            if (queryArrayList.get(i).docid.startsWith("eng")) {
                write.println("WEB CASE\n");
                System.out.println("WEB -" + queryArrayList.get(i).docid);
            }

            write.println("QueryID:\t" + queryArrayList.get(i).queryid);
            write.println("Name:\t\t" + queryArrayList.get(i).name);
            write.println("DocID_Name:\t" + queryArrayList.get(i).docid);
            write.println("Entity_Type:\t" + queryArrayList.get(i).enttype);
            write.println("Sentiment_Slot:\t" + queryArrayList.get(i).slot);
            write.println("\nFull Document:\n");
            write.println(docsFullHash.get(queryArrayList.get(i).docid));
            write.println("\n--------------------------------------------------------\n");

        }

        write.closeFile();

    }
}
