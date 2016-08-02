/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.albany.cubism.sentiment;

import edu.albany.cubism.sentiment.LoadQuerys.QueryInput;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import javax.xml.parsers.ParserConfigurationException;
import edu.albany.cubism.ie.OldEntity;
import edu.albany.cubism.sentiment.CustomFileReader;
import edu.albany.cubism.sentiment.CustomFileReader;
import edu.albany.cubism.sentiment.CustomFileWriter;
import edu.albany.cubism.sentiment.CustomFileWriter;
import edu.albany.cubism.sentiment.GenerateMetaDataXML;
import edu.albany.cubism.sentiment.GenerateMetaDataXML;
import edu.albany.cubism.util.Settings;

/**
 *
 * @author jrgiarrusso
 */
public class NewswireParse {

    public class OffsetInfo {

        int w_startOffset;
        int w_endOffset;
        int startOffset;
        int endOffset;
        String annoteWord;

        public OffsetInfo(int startOffset, int endOffset, String annoteWord) {
            this.startOffset = startOffset;
            this.endOffset = endOffset;
            this.annoteWord = annoteWord;
        }

        public void setW_startOffset(int w_startOffset) {
            this.w_startOffset = w_startOffset;
        }

        public void setW_endOffset(int w_endOffset) {
            this.w_endOffset = w_endOffset;
        }

        public int getW_startOffset() {
            return w_startOffset;
        }

        public int getW_endOffset() {
            return w_endOffset;
        }

    }

    // Create a new node for that stores the offset data for the sentence
    private OffsetInfo createOffsetNode(int startOffset, int endOffset, String annoteWord) {
        OffsetInfo newOffsetNode = new OffsetInfo(startOffset, endOffset, annoteWord);
        return newOffsetNode;
    }

    public class EntityLabel {

        String labelItem;
        String caseNum;

        public EntityLabel(String labelItem, String caseNum) {
            this.labelItem = labelItem;
            this.caseNum = caseNum;
        }
    }

    // Create a new node for that stores the offset data for the sentence
    private EntityLabel createLabelNode(String labelItem, String caseNum) {
        EntityLabel labelNode = new EntityLabel(labelItem, caseNum);
        return labelNode;
    }

    /*
     find the specific word of query used in one sentence
     */
    public HashMap<String, ArrayList<ArrayList<OffsetInfo>>> openOutputText(ArrayList<QueryInput> queryArrayList) throws InterruptedException, IOException, ParserConfigurationException {

        int numChars = 0;                   // The number of chars found - to be used for offset calculation
        int startOffset = 0;                // The startign point of the offset
        int endOffset = 0;                  // The ending point of the offset
        int newStartOffset = 0;             // The new starting offset
        int newEndOffset = -1;               // The smaller offsets
        int trueStartOffset = 0;
        int trueEndOffset = -1;
        int dateStartNum;
        int dateEndNum;
        int personStartNum;
        int personEndNum;
        String currLine = "";               // The current line in the document
        String docName = "";                // The document name of the current forum discussion
        String annoteWord = "";             // The word that the annotations found
        ArrayList<OffsetInfo> q_list_in1s = new ArrayList();
        String paragraphBody = "";          // The body of the author's forum post
        String printParagraphBody = "";     // The body fo the autorh's forum post that will be printed
        String name = "";                   // The Name of the item to find sentiment towards or from
        String queryID = "";                // The queryID for the sentences
        String docID = "";                  // The document ID for the sentence
        String pathName = "";               // pathname for the annotation file to be found
        String entityPrintParagraph = "";   // The body of the author's forum post that will be printed in entity list form
        String entityParagraph = "";        // The entity labled version of the paragraph
        String entityItem = "";             // The item of the entity being read
        String[] entitySplit;               // The split version of the entity parsed paragraph
        String[] paragraphSplit;            // The split up paragraph body
        String[] printSplit;                // The split up paragraph body to be printed
        String[] nameSplit;                 // The split up name
        String answer = "";                 // the answer to the query
        String answerText = "";             // The text of the answer
        String headline = "";
        boolean enteredNews = false;        // Decide if it is okay to being looking to write to a new file
        boolean startWriting = false;       // Decide when to start writing to a new file
        boolean printSentence = false;      // The trigger to decide whether we should print out a sentence in the document
        boolean copyChars = false;          // The trigger to decide whether we should copy chars for offest calculation
//        boolean notFound = true;            // If we have found the annotations
        boolean runOnce = true;             // run once 
        CustomFileWriter write = null;      // The writing file that will be used to write the extracted sentences on
        GenerateMetaDataXML run = new GenerateMetaDataXML();

        // A Hashmap to hold all of the offset values for every file read, based on the query ID
        HashMap<String, ArrayList<ArrayList<OffsetInfo>>> offsetCollection = new HashMap();
        ArrayList<ArrayList<OffsetInfo>> offsetList = new ArrayList();
        ArrayList<OldEntity> entityList = new ArrayList();
        ArrayList<String> currLines = new ArrayList();
        ArrayList<EntityLabel> labelList = new ArrayList();

        //Open up the document with the final test data and go through each line
        // Test Data
        String pathNameSource = Settings.getValue("kbp_data_path")+"/Source_Corpus_Files_Assessment/assessment_output_sentences.txt";
        // 2014 Data
        //String pathNameSource = Settings.getValue("kbp_data_path")+"/2014evaluation/Source_Corpus_Files/output_sentences.txt";
        CustomFileReader read = new CustomFileReader(pathNameSource);
        String oriDoc = "";

        while (read.hasNextLine()) {

            // Keep track of the current line
            currLine = read.getNextLine();

            // check if we have reached the NEWSWIRE CASE to start writing
            if (currLine.contentEquals("NEWSWIRE CASE")) {

                //Initialize variables
                pathName = "";
                paragraphBody = "";
                name = "";
                queryID = "";
                enteredNews = true;
                offsetList = new ArrayList();
                q_list_in1s = new ArrayList();
                annoteWord = "";
//                notFound = true;
                answer = "";
                answerText = "";

            }

            if (enteredNews == true) {

                // copy the characters from this line and add to the total
                if (copyChars) {
                    numChars = numChars + currLine.length() + 1;    // 1 added for new line char
                    oriDoc = oriDoc.concat(currLine) + "\n";
                }

                // Receive the Name and Query ID of the document
                if (currLine.startsWith("Name:\t\t")) {
                    name = currLine.substring(7);
                }
                if (currLine.startsWith("QueryID:\t")) {
                    queryID = currLine.substring(8);

//                    System.out.println("QUERYQUERY:\t" + queryID);

//                    System.out.println("LOLOLQueryID:\t" + queryID);
                    if (queryID.contains("SSF14_ENG_259")) {
                        System.out.println("SKIP1");
                        continue;
                    }
                    //Start writing the new query file
                    //////////////////
                    //CHANGE THIS PATHNAME TO NOT 2014 IF TESTING/////
                    ////////////
                    String sentencePathName = Settings.getValue("kbp_data_path")+"/newswire_sentences/newswire_text_" + queryID + ".txt";
                    write = new CustomFileWriter(sentencePathName);
                }

                if (queryID.contains("SSF14_ENG_259")) {
                    System.out.println("SKIP2");
                    continue;
                }

                if (currLine.startsWith("DocID_Excerpt:\t")) { //CHANGE THIS TO DOCID EXCERPT IF TESTING// // OTHERWISE, USE DOCIDNAME
//                    System.out.println("CURRLINE:\t" + currLine);
                    docID = currLine.substring(15);             // CHANGE THIS TO 15
//                    System.out.println("Doc ID HELP 4:\t" + docID);

                    //new arrayList here for the saved words and offset data from annotations
                    //pathName = new NewswireMultiThreadSync().createThreads(docID);
//                    System.out.println("PATHNAMEDMMEIJ:\t" + pathName);
                    //entityList = new NewswireFindPreAnnotation().initialize(pathName, docID, name);
                    //CS added
                    pathName=Settings.getValue("kbp_data_path")+"/2014evaluation/batchNewswire/"+docID+".sgm.apf.xml";
                    entityList = new NewswireFindPreAnnotation().initializeNew(pathName, docID, name);
                }

                if (currLine.startsWith("Slot_Filler_1:\t")) {
                    answer = currLine.substring(15);
                    for (int i = 0; i < queryArrayList.size(); i++) {
                        if (queryArrayList.get(i).queryid.trim().contentEquals(queryID.trim())) {
                            queryArrayList.get(i).answer = answer;
                        }
                    }
                }

                if (currLine.startsWith("Assessment Excerpt:")) {
                    currLine = read.getNextLine();
                    while (!currLine.startsWith("Full Document:")) {

                        if (!currLine.contentEquals("")) {
                            answerText = answerText.concat(currLine + "\n");
                        }
                        currLine = read.getNextLine();
                    }
                    for (int i = 0; i < queryArrayList.size(); i++) {
                        if (queryArrayList.get(i).queryid.trim().equals(queryID.trim())) {
                            queryArrayList.get(i).answerText = answerText;
                        }
                    }

                }

                // End the copying of the document if /DOC is found
                if (currLine.startsWith("</DOC>")) {
                    enteredNews = false;
                    write.closeFile();
                    numChars = 0;
                    startOffset = 0;
                    endOffset = 0;
                    newStartOffset = 0;
                    newEndOffset = -1;
                    trueStartOffset = 0;
                    trueEndOffset = -1;
                    copyChars = false;
//                    System.out.println("QUERYBEFORE:\t" + queryID.trim());
                    offsetCollection.put(queryID.trim(), offsetList);
                    for (int i = 0; i < queryArrayList.size(); i++) {
                        if (queryArrayList.get(i).queryid.trim().equals(queryID.trim())) {
                            queryArrayList.get(i).docText = oriDoc;
                            oriDoc = "";
                        }
                    }
                    continue;
                }

                // See if we are starting the document to begin calculating where the offests for the sentences are
                if (currLine.startsWith("<DOC id=\"")) {
                    numChars = currLine.length() + 1;   // 1 added for the new line character
                    copyChars = true;
                    oriDoc = oriDoc.concat(currLine) + "\n";
                }

                // IF <P> is found, then we are to begin looking for sentences that contain
                // the specified name from the query
                if (currLine.startsWith("<P>") || currLine.contains("<HEADLINE>")) {

                    // Initialize variables
                    paragraphBody = "";
                    entityParagraph = "";
                    printParagraphBody = "";
                    currLines.clear();
                    runOnce = true;

                    // Move onto the nextline!
                    currLine = read.getNextLine();
                    oriDoc = oriDoc.concat(currLine) + "\n";

                    // Keep doing these steps until we run into the end of a paragraph
                    while (!currLine.startsWith("</P>") && !currLine.contains("</HEADLINE>")) {
                        if (runOnce) {
                            startOffset = numChars;
                            runOnce = false;
                        }
                        currLines.add(currLine);
                        numChars = numChars + currLine.length() + 1;    // 1 added for new line char
                        printParagraphBody += currLine.concat(" ");
                        paragraphBody += currLine;  // Doesn't add the empty space from new line
                        currLine = read.getNextLine();
                        oriDoc = oriDoc.concat(currLine) + "\n";
                    }
                    // Add a new offsetNode to the offsetList
                    endOffset = numChars;

                    numChars = numChars + currLine.length() + 1;    // 1 added for new line char
                    // Split the paragraph into sentences and the name into it's parts,
                    // Then calculate which sentences contain parts (or the whole) of the name

                    //        System.out.println("Get OldEntity Paragraphs");
                    // Do the entity parsing
                    labelList.clear();
                    entityParagraph = GenerateMetaDataXML.initialize(paragraphBody, run);
                    entityPrintParagraph = GenerateMetaDataXML.initialize(printParagraphBody, run);

                    // make sure to save the persons and date abreviations within the normal paragraph
                    //     System.out.println("Start Normal");
                    paragraphBody = savePersonsDates(entityParagraph, labelList, paragraphBody);
                    paragraphSplit = paragraphBody.split("(?<=[.?!])\\s+(?=[a-zA-Z])");
                    //     System.out.println("paragraphSplit1A:\t" + paragraphSplit[0]);
                    replacePlaceholders(paragraphSplit, labelList);
                    //      System.out.println("paragraphSplit1B:\t" + paragraphSplit[0]);

                    labelList.clear();

                    // make sure to save the persons and date abreviations within the print version of the paragraph
                    //           System.out.println("Start print Ver.");
                    printParagraphBody = savePersonsDates(entityPrintParagraph, labelList, printParagraphBody);
                    printSplit = printParagraphBody.split("(?<=[.?!])\\s+(?=[a-zA-Z])");
                    //          System.out.println("printSplit2A:\t" + printSplit[0]);
                    replacePlaceholders(printSplit, labelList);
                    //         System.out.println("printSplit2B:\t" + printSplit[0]);

                    nameSplit = name.split(" ");
                    newStartOffset = startOffset;

//                    System.out.println("PRINT:\t" + printSplit.length);
//                    System.out.println("PARAG:\t" + paragraphSplit.length);
                    if (printSplit.length == 2 && paragraphSplit.length == 3) {
//                        System.out.println("QUERYEYR:\t" + queryID);
//
//                        System.out.println(printSplit[0]);
//                        System.out.println(paragraphSplit[0]);
//                        System.out.println(printSplit[1]);
//                        System.out.println(paragraphSplit[1]);
                    }
                    for (int j = 0; j < paragraphSplit.length; j++) {
                        printSentence = false;
//                        notFound = true;
                        newStartOffset = newEndOffset + 1;
                        trueStartOffset = startOffset + 1;
                        newEndOffset = newStartOffset + paragraphSplit[j].length();
                        trueEndOffset = trueStartOffset + paragraphSplit[j].length();
//                                                System.out.println(paragraphSplit.length);
//
//                        System.out.println(paragraphBody);

//
//                        System.out.println("---------------------\n" + paragraphBody.substring(newStartOffset, newEndOffset));
//                        System.out.println("Paragraph Size:\t" + paragraphSplit.length);
//                        System.out.println(paragraphSplit[j]);
//                        System.out.println("Start Offset:\t" + startOffset);
//                        System.out.println("Real Start:\t" + (newStartOffset + startOffset));
//                        System.out.println("Real End:\t" + (newEndOffset + startOffset));
                        //comment out by TL 03/02
                        for (int i = 0; i < nameSplit.length; i++) {
                            if ((paragraphSplit[j].contains(nameSplit[i]) && (!nameSplit[i].trim().toLowerCase().contentEquals("the") && !nameSplit[i].trim().toLowerCase().contentEquals("of")
                                    && !nameSplit[i].trim().toLowerCase().contentEquals("a")))
                                    || paragraphSplit[j].contains(name)) {
                                printSentence = true;
//                                notFound = false;
                            }
                        }
                        int x_startOffset = -1;
                        int x_endOffset = -1;
                        //end of comment out

                        if (true) { //set true from notFound
                            boolean processed = false;
                            for (int i = 0; i < nameSplit.length; i++) {
                                // Add code here to check to see if arrayList has any offset values within this range,
                                // if so, make printSentence true.
                                for (int k = 0; k < entityList.size(); k++) {
                                    for (int s = 0; s < entityList.get(k).wordData.size(); s++) {
                                        if (entityList.get(k).wordData.get(s).startOffset >= (startOffset + newStartOffset) && entityList.get(k).wordData.get(s).endOffset <= (startOffset + newEndOffset + 2) //add 2 since the offset seems a little bit wrong 
                                                /*&& !nameSplit[i].contains(entityList.get(k).wordData.get(s).keyWord)comment it out by TL 03/31/15*/) {
                                            for (int l = 0; l < entityList.get(k).replaceWordData.size(); l++) {
//                                                System.out.println("-------");
//                                                System.out.println("Real Start:\t" + (newStartOffset + startOffset));
//                                                System.out.println("Real End:\t" + (newEndOffset + startOffset));
//                                                System.out.println("Word Start:\t" + entityList.get(k).wordData.get(s).startOffset);
//                                                System.out.println("Word Start:\t" + entityList.get(k).wordData.get(s).endOffset);
//                                                System.out.println("Replace Start:\t" + entityList.get(k).replaceWordData.get(l).startOffset);
//                                                System.out.println("Replace End:\t" + entityList.get(k).replaceWordData.get(l).endOffset);

                                                if (entityList.get(k).replaceWordData.get(l).replaceWord.toLowerCase().contains(nameSplit[i].trim().toLowerCase())/* add to lowercase commented by TL for all matches, not just she/he/the coach
                                                        && !entityList.get(k).replaceWordData.get(l).replaceWord.contains(entityList.get(k).wordData.get(s).keyWord)
                                                        && !entityList.get(k).wordData.get(s).keyWord.contains(entityList.get(k).replaceWordData.get(l).replaceWord)*/) {
                                                    //keep all found query terms in a sentence
//                                                    System.out.println(paragraphSplit[j]);
//                                                    System.out.println("Original Name:\t" + name);
//                                                    System.out.println("Word to be Replaced:\t" + entityList.get(k).wordData.get(s).keyWord);
//                                                    System.out.println("Word to be Replaced (offsets):\t" + entityList.get(k).wordData.get(s).startOffset + " --- " + entityList.get(k).wordData.get(s).endOffset);
//                                                    System.out.println("Replacement Word:\t " + entityList.get(k).replaceWordData.get(l).replaceWord + "\n");
//                                                    notFound = false;
                                                    printSentence = true;
                                                    annoteWord = entityList.get(k).wordData.get(s).keyWord;
                                                    x_startOffset = entityList.get(k).wordData.get(s).startOffset;
                                                    x_endOffset = entityList.get(k).wordData.get(s).endOffset;
//                                                    System.out.println("x_startOffset: " + x_startOffset);
//                                                    System.out.println("found query term: " + annoteWord);
//                                                    System.out.println("found query term (start): " + x_startOffset);
//                                                    System.out.println("found query term (end): " + x_endOffset);
                                                    OffsetInfo newOffsetData = createOffsetNode(startOffset, (startOffset + newEndOffset), annoteWord);
                                                    newOffsetData.setW_startOffset(x_startOffset);
                                                    newOffsetData.setW_endOffset(x_endOffset);
                                                    q_list_in1s.add(newOffsetData);
                                                    processed = true;
                                                    break; //found one instance, break the loop for next instance by TL 03/27/15
                                                }
                                            }
                                        }
                                    }
                                }
                                if (processed) {
                                    break;
                                }
                            }
                        }
                        if (printSentence && (printSplit.length >= paragraphSplit.length)) {
//                            System.out.println(queryID);
//                            System.out.println("BEFORE PRINTINE " + j);
//
//                            System.out.println("PRINTSLPLIT:\t" + printSplit[j]);

                            printSplit[j] = printSplit[j].trim(); 
                            //  if (printSplit[j].charAt(printSplit[j].length() - 1) != '.' && printSplit[j].charAt(printSplit[j].length() - 1) != '"'&& printSplit[j].charAt(printSplit[j].length() - 1) != '\'') {
                            //      printSplit[j] = printSplit[j].concat(".");
                            //  }
                            write.println(printSplit[j] + "\n");
//                            OffsetInfo newOffsetData = createOffsetNode(startOffset, (startOffset + newEndOffset), annoteWord);
//                            newOffsetData.setW_startOffset(x_startOffset);
//                            newOffsetData.setW_endOffset(x_endOffset);
//                            annoteWord = "";
                            offsetList.add(q_list_in1s);
                            q_list_in1s = new ArrayList();

                        }
                        printSentence = false;
//                        notFound = true;
                    }

                    newStartOffset = 0;
                    newEndOffset = -1;

                }
            }// End of enteredNews
        }// End while loop
        read.closeFile();
        return offsetCollection;

    }

    public String savePersonsDates(String entityParagraph, ArrayList<EntityLabel> labelList, String paragraphBody) {

        String entityItem;
        String personStart = "<PERSON>";
        String personEnd = "</PERSON>";
        String dateStart = "<DATE>";
        String dateEnd = "</DATE>";
        String locationStart = "<LOCATION>";
        String locationEnd = "</LOCATION>";
        int personStartNum;
        int dateStartNum;
        int locationStartNum;
        int personEndNum;
        int dateEndNum;
        int locationEndNum;
        int personCount = 1;
        int dateCount = 1;
        int locationCount = 1;

        //      System.out.println("FIRST:\t" + paragraphBody);
        while (entityParagraph.contains(personEnd) || entityParagraph.contains(dateEnd)) {

            if (entityParagraph.contains(personEnd)) {
                personStartNum = (entityParagraph.indexOf(personStart) + personStart.length());
                personEndNum = entityParagraph.indexOf(personEnd);
                entityItem = entityParagraph.substring(personStartNum, personEndNum);

                //            System.out.println("PERSON ENTITY:\t" + entityItem);
                EntityLabel labelNode = createLabelNode(entityItem, ("PERSON_" + personCount));
                labelList.add(labelNode);
                paragraphBody = paragraphBody.replaceFirst(entityItem, ("PERSON_" + personCount));

                personCount++;
                entityParagraph = entityParagraph.replaceFirst(personStart, "");
                entityParagraph = entityParagraph.replaceFirst(personEnd, "");

            }
            if (entityParagraph.contains(dateEnd)) {

                // Obtain the offset values for the date, and use them to find the date entity
                dateStartNum = (entityParagraph.indexOf(dateStart) + dateStart.length());
                dateEndNum = entityParagraph.indexOf(dateEnd);
                entityItem = entityParagraph.substring(dateStartNum, dateEndNum);

                //          System.out.println("DATE ENTITY:\t" + entityItem);
                // Create a new node to add to the arraylist of labeled entites, and then replace that enity with the generic DATE name
                EntityLabel labelNode = createLabelNode(entityItem, ("DATE_" + dateCount));
                labelList.add(labelNode);
                paragraphBody = paragraphBody.replaceFirst(entityItem, ("DATE_" + dateCount));

                dateCount++;
                entityParagraph = entityParagraph.replaceFirst(dateStart, "");
                entityParagraph = entityParagraph.replaceFirst(dateEnd, "");

            }
            if (entityParagraph.contains(locationEnd)) {

                // Obtain the offset values for the date, and use them to find the date entity
                locationStartNum = (entityParagraph.indexOf(locationStart) + locationStart.length());
                locationEndNum = entityParagraph.indexOf(locationEnd);
                entityItem = entityParagraph.substring(locationStartNum, locationEndNum);

                //          System.out.println("DATE ENTITY:\t" + entityItem);
                // Create a new node to add to the arraylist of labeled entites, and then replace that enity with the generic DATE name
                EntityLabel labelNode = createLabelNode(entityItem, ("LOCATION" + locationCount));
                labelList.add(labelNode);
                paragraphBody = paragraphBody.replaceFirst(entityItem, ("LOCATION" + locationCount));

                locationCount++;
                entityParagraph = entityParagraph.replaceFirst(locationStart, "");
                entityParagraph = entityParagraph.replaceFirst(locationEnd, "");

            }
        }
        //      System.out.println("SECOND:\t" + paragraphBody);

        return paragraphBody;
    }

    public void replacePlaceholders(String[] sentences, ArrayList<EntityLabel> labelList) {

//        System.out.println("length:\t" + sentences.length);
        for (int x = 0; x < sentences.length; x++) {
            //          System.out.println(sentences[x]);
            for (int y = 0; y < labelList.size(); y++) {
                if (sentences[x].contains(labelList.get(y).caseNum)) {
                    sentences[x] = sentences[x].replaceFirst(labelList.get(y).caseNum, labelList.get(y).labelItem);
                    //               System.out.println("case:\t" + labelList.get(y).caseNum);
                    //             System.out.println("item:\t" + labelList.get(y).labelItem);
                }

            }

        }

    }

//    public boolean annotePresent(String[] nameSplit, String docID, boolean findPath) throws InterruptedException, IOException{
//
//        
//        return true;
//    }
}
