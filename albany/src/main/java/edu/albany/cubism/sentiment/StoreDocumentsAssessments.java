/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.albany.cubism.sentiment;

import java.io.File;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
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
 * @author Ting Liu This class store Documents (contains evaluation queries) for
 * sentiment judgments
 */
public class StoreDocumentsAssessments {

    public HashMap<String, String> searchArrayList(ArrayList<ArrayList<String>> assessDocArrayList, ArrayList<QueryInput> queryArrayList) {

        File[] parentDirect = new File(Settings.getValue("kbp_data_path") + "/Source_Corpus_Files_Assessment").listFiles();  // The starting directory of the data
        HashMap<String, String> assessDocsSentenceHash = new HashMap();         // A HashMap to store the sections from the assessment files based on the query id
        HashMap<String, String> assessDocsFullHash = new HashMap();             // A hashMap to store the entire assessment document
        String[] assessLine, documentAndOffsetChunk;                            // Holds the set of docIDS and Offsets
        int docIDStringOffset;
        int offsetLoc;
//        String prevQuery = "";
        String currQuery;
        String anw = "";
        // A string arrray that will hold the tokenized assessment data line
        String docid, queryID, offset, documentAndOffset;                           // Strings that hold data provided with the query search
        
        Iterator<ArrayList<String>> itr = assessDocArrayList.iterator();                   // Iterates through all the documents specified from the assessment file
//        System.out.println("doc array list: " + assessDocArrayList);
        // Iterate through all of the documents in the DocArrayList and parse through each one, storing the entire document, as well as the excpert specified by the offset
        while (itr.hasNext()) {

            ArrayList<String> element = itr.next();
//            System.out.println("element: " + element);
            assessLine = element.get(0).split("\t");
//            // 2013 SLOT ASSESSMENT FORMAT
//            docid = assessLine[3];
//            queryID = assessLine[0].substring(0, /*13*/ 13);// 22 is training size (SSF13_ENG_TRAINING_003)*/
//            offset = assessLine[7];

            // 2014 ASSESSMENT FORMAT
            queryID = assessLine[0];
            documentAndOffset = assessLine[3];
            anw = assessLine[4];
            ArrayList<String> docOffsetString;
            documentAndOffsetChunk = documentAndOffset.split(",");

            currQuery = queryID;
            // Look at every file and see if it is the matching one
            for (File child : parentDirect) {
                docIDStringOffset = documentAndOffsetChunk[0].indexOf(":");
                docid = documentAndOffsetChunk[0].substring(0, docIDStringOffset);
//                System.out.println("docid: " + docid);
//                System.out.println("child name: " + child.getName());
//                System.out.println("DOC ID HELP 2:\t" + docid);
//                System.out.println("child path: " + child.getAbsolutePath());

                if (docid.contains(child.getName())||
                        child.getName().contains(docid) /*&& !prevQuery.contentEquals(currQuery)*/) {

//                    prevQuery = currQuery;
                    offsetLoc = documentAndOffsetChunk[0].length();
                    offset = documentAndOffsetChunk[0].substring(docIDStringOffset + 1, offsetLoc);

                    // We Have a match, so now open the file based on the child's pathname
//                    System.out.println("FOUND A MATCH: " + child.getName());
//                    System.out.println(queryID);
                    // Go through the document we found and find the sentences that are relevant to the assessment files.
                    //added by TL 03/20/15
                    assessDocsSentenceHash = parseDocument(child.getAbsolutePath(), docid, queryID, offset, assessDocsSentenceHash, assessDocsFullHash);
                    ArrayList offs = new ArrayList();
                    HashMap anw_offs = new HashMap();
                    anw_offs.put(anw, offs);
                    for (QueryInput qi : queryArrayList) {
                        if (qi.queryid.equals(queryID)) {
                            for (String aw_off : documentAndOffsetChunk) {
                                String[] offinfos = aw_off.split(":");
                                Integer start = new Integer(offinfos[1].split("-")[0]);
                                Integer end = new Integer(offinfos[1].split("-")[1]);
                                ArrayList off = new ArrayList();
                                off.add(start);
                                off.add(end);
                                offs.add(off);
                            }

                            qi.addAwOffsets(docid, anw_offs);
                        }
                    }
                }
            }
        }

        writeSentencesToFile(assessDocsSentenceHash, assessDocsFullHash, assessDocArrayList, queryArrayList);
        //writeSentencesToFile(assessDocsSentenceHash, assessDocsFullHash, queryArrayList);

        return assessDocsFullHash;
    }
    
    public void writeSentencesToFile(HashMap assessDocsSentenceHash, HashMap assessDocsFullHash, ArrayList<QueryInput> queryArrayList) {
        String docPathName = Settings.getValue("kbp_data_path") + "/Xudeo/";
        File[] parentDirect = new File(Settings.getValue("kbp_data_path") + "/Source_Corpus_Files_Assessment").listFiles();
        
        String queryID;
        
        String documentAndOffset;
        String prevQuery = "";
        String currQuery;
        int docIDStringOffset;
        String[] assessLine, documentAndOffsetChunk;
        int offsetLoc;
        CustomFileWriter write = null;
        
        
            for (int i = 0; i < queryArrayList.size(); i++) {
                    
                    String docID=queryArrayList.get(i).docid;

                    for (File child : parentDirect) {
                        if (docID.contains(child.getName())) {
                            write = new CustomFileWriter(docPathName+child.getName(), true);
                            
                            write.println(assessDocsFullHash.get(docID));    
                            break;
                        }
                    }
                     write.closeFile();
                    
            }

       

    }

    public HashMap<String, String> parseDocument(String docPathName, String docid, String queryID, String offset, HashMap assessDocsSentenceHash, HashMap assessDocsFullHash) {

        StringBuilder totalDocBuilder = new StringBuilder();        // A string that will hold the entire document
        CustomFileReader read = new CustomFileReader(docPathName);  // Open up the file found earlier
        String offsetSentence;
        String currLine = "\n";                                     // The line before looking at the next
        String nextLine = "\n";                                     // The currently read line
        String totalDoc;                                            // A string to hold the document in the document id  
        boolean endOfDoc = false;                                   // Tells us if we are at the end of the document

        // While there is a another line to be read in the file and
        // we haven't gotten to the end of the needed document
        while (read.hasNextLine() && !endOfDoc) {
            currLine = nextLine;
            nextLine = read.getNextLine();
//            System.out.println("nextLine: " + nextLine);
//            System.out.println("totalDocBuilder.length(): " + totalDocBuilder.length());
            // We are finished if we are reading the file still and we run into the end of the document
            // Now add the sentence found within the document to the hashmap
            if (totalDocBuilder.length() != 0 && (nextLine.contains("</doc>") || nextLine.contains("</DOC>"))) {
                System.out.println("add to doclist");
                totalDocBuilder.append(nextLine);
                endOfDoc = true;
                totalDoc = totalDocBuilder.toString();

                // Save the Entire document into the assessDocsFullHash
//                System.out.println("PUTTING IN FULL DOCUMENT");
//                System.out.println(docid);
//                System.out.println(totalDoc);
                assessDocsFullHash.put(docid, totalDoc);

                // Find the offset Sentence from the entire Document
//                offsetSentence = getOffsetSentence(offset, totalDoc);
                offsetSentence = "";

                // Store the excerpt from the document into the assessDocsSentenceHash
                System.out.println("docId to put: " + docid);
                assessDocsSentenceHash.put(docid, offsetSentence);
            }

            // Keep copying text over if the length of the document is greater than zero and
            // we have not reached the end of the document
            if (totalDocBuilder.length() != 0 && !endOfDoc) { //modified by TL from && to ||, change it back for multiple documents in one file 11/09/2015
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

        return assessDocsSentenceHash;
    }

    public void decideParse(String currLine, String nextLine, StringBuilder totalDoc) {

        //Decide where to start appending to the total document string
        if (nextLine.startsWith("<DOCID> ")) {
            totalDoc.append(currLine);
            totalDoc.append(nextLine);
        }
        if (nextLine.startsWith("<DOC ") || nextLine.startsWith("<doc ")) {
            totalDoc.append(nextLine);
            //added by TL 04/29/15 for no return of <headline> in forum data
            totalDoc.append("\n");
        }
    }

    public String getOffsetSentence(String offset, String totalDoc) {
        String[] offsets = offset.split("-|\\,");   // Seperate the offset values by the - and ,
        String offsetSentence = "";
        int i = 0;
        int j = 1;
        int startPoint, endPoint;
        while (j < offsets.length) {    // make sure to keep the offset values coupled together
            //if(j == 3) System.out.println("There are two!");
            //offsetSentence += "\nNEW OFFSET\n";
            startPoint = parseInt(offsets[i]);
            endPoint = parseInt(offsets[j]);
//            System.out.println("OFFSET SOFFIOJEFIJEFIJEF:\t" + offset);
            offsetSentence += String.valueOf(totalDoc.toCharArray(), startPoint - 2, endPoint - startPoint + 2);
            i = i + 2;
            j = j + 2;
        }
        //System.out.println(offsetSentence);
        //System.out.println("------------------");
        return offsetSentence;
    }

    public void writeSentencesToFile(HashMap assessDocsSentenceHash, HashMap assessDocsFullHash, ArrayList<ArrayList<String>> assessDocArrayList, ArrayList<QueryInput> queryArrayList) {
        String docPathName = Settings.getValue("kbp_data_path") + "/Source_Corpus_Files_Assessment/assessment_output_sentences.txt";
        String queryID;
        String docID;
        String documentAndOffset;
        String prevQuery = "";
        String currQuery;
        int docIDStringOffset;
        String[] assessLine, documentAndOffsetChunk;
        int offsetLoc;
        CustomFileWriter write = new CustomFileWriter(docPathName);  // Open up the file found earlier
        Iterator<ArrayList<String>> newitr = assessDocArrayList.iterator();

        // Go through the Array list all of the assessment documents and then for each one, find it's corresponding query information from the .XML file
        // as well as print out the passage excerpt where the answer to the query was found.
        while (newitr.hasNext()) {
            ArrayList<String> element = newitr.next();
            assessLine = element.get(0).split("\t");

            // 2014 ASSESSMENT FORMAT
            queryID = assessLine[0];
            documentAndOffset = assessLine[3];
            ArrayList<String> docOffsetString;
            documentAndOffsetChunk = documentAndOffset.split(",");
            docIDStringOffset = documentAndOffsetChunk[0].indexOf(":");
            docID = documentAndOffsetChunk[0].substring(0, docIDStringOffset);
            currQuery = queryID;
            System.out.println("queryID: " + queryID);

//            System.out.println("DOCUMENT HELP:\t" + docID);
            for (int i = 0; i < queryArrayList.size(); i++) {

//                System.out.println(queryArrayList.get(i).queryid);
                if (queryArrayList.get(i).queryid.equals(queryID) && !currQuery.contentEquals(prevQuery)) {
                    System.out.println("found query: " + queryID);
                    prevQuery = currQuery;

                    // THE NEWSWIRE CASE
                    if (assessLine[3].charAt(3) == '_' || Settings.getValue("SentiDataType").equals("newswire")) {
                        write.println("NEWSWIRE CASE\n");
                        //System.out.println("NEWSWIRE -" + assessLine[3]);
                    }
                    // THE FORUM CASE
                    if (assessLine[3].startsWith("bolt") || Settings.getValue("SentiDataType").equals("forum")) {
                        write.println("FORUM CASE\n");
//                        System.out.println("FORUM -" + assessLine[3]);
                    }
                    // THE WEB CASE
                    if (assessLine[3].startsWith("eng")) {
                        write.println("WEB CASE\n");
                        //System.out.println("WEB -" + assessLine[3]);
                    }
                    // THIS IS TO FIND THE DOCUMENT ASSESSMENT ID //////
                    queryArrayList.get(i).docidAss = assessLine[3];/////
                    ///////////////////////////////////////////////////
                    write.println("QueryID:\t" + queryArrayList.get(i).queryid);
                    write.println("Name:\t\t" + queryArrayList.get(i).name);
                    write.println("DocID_Name:\t" + queryArrayList.get(i).docid);
                    write.println("DocID_Excerpt:\t" + queryArrayList.get(i).docid);
                    write.println("Entity_Type:\t" + queryArrayList.get(i).enttype);
                    write.println("Sentiment_Slot:\t" + queryArrayList.get(i).slot);
//                    System.out.println("element: " + element);
                    for (int k = 0; k < element.size(); k++) {
                        String[] fillerLine = element.get(k).split("\t");
                        if (fillerLine.length < 5) {
                            continue;
                        }
                        write.println("Slot_Filler_" + (k + 1) + ":\t" + fillerLine[4]);
                    }
                    System.out.println("docID: " + docID);
                    write.println("\nAssessment Excerpt:");
                    System.out.println("assessDocs Ids: " + assessDocsSentenceHash.keySet().toString());
                    write.println(assessDocsSentenceHash.get(docID));
                    write.println("\nFull Document:\n");
                    write.println(assessDocsFullHash.get(docID));
                    write.println("\n--------------------------------------------------------\n");
                }
            }

        }
        write.closeFile();

    }

}
