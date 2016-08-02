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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import edu.albany.cubism.ie.OldEntity;
import edu.albany.cubism.relation.Utterance;
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
public class ForumParse {

    public class OffsetInfo {

        public int w_startOffset;
        public int w_endOffset;
        public int startOffset;
        public int endOffset;
        public String annoteWord;
        public Utterance utt;

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

        public void setUtt(Utterance utt) {
            this.utt = utt;
        }

        public Utterance getUtt() {
            return utt;
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
    public HashMap<String, ArrayList<ArrayList<OffsetInfo>>> openForumText(ArrayList<QueryInput> queryArrayList) throws InterruptedException, IOException, ParserConfigurationException {

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
        ArrayList<Utterance> utts = new ArrayList();

        //Open up the document with the final test data and go through each line
        // Test Data
        String pathNameSource = Settings.getValue("kbp_data_path")+"/Source_Corpus_Files_Assessment/assessment_output_sentences.txt";
        // 2014 Data
        //String pathNameSource = Settings.getValue("kbp_data_path")+"/2014evaluation/Source_Corpus_Files/output_sentences.txt";
        CustomFileReader read = new CustomFileReader(pathNameSource);
        StringBuffer oriDoc = new StringBuffer();
        StringBuffer doc = new StringBuffer();
        boolean doc_start = false;
        int startx = 0;
        while (read.hasNextLine()) {

            // Keep track of the current line
            currLine = read.getNextLine();

            if (currLine.startsWith("<doc id")) {
                doc_start = true;
                copyChars = true;
//                oriDoc.append(currLine).append("\n");
            }

            // check if we have reached the NEWSWIRE CASE to start writing
            if (currLine.contentEquals("FORUM CASE")) {
                //just in case </doc> is not there
                copyChars = false;
                
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
                    oriDoc.append(currLine).append("\n");
                }

                // Receive the Name and Query ID of the document
                if (currLine.startsWith("Name:\t\t")) {
                    name = currLine.substring(7);
                }
                if (currLine.startsWith("QueryID:\t")) {
                    queryID = currLine.substring(8);

//                    System.out.println("QUERYQUERY:\t" + queryID);
//                    System.out.println("LOLOLQueryID:\t" + queryID);
//                    if (queryID.contains("SSF14_ENG_259")) {
//                        System.out.println("SKIP1");
//                        continue;
//                    }
                    //Start writing the new query file
                    //////////////////
                    //CHANGE THIS PATHNAME TO NOT 2014 IF TESTING/////
                    ////////////
                    String sentencePathName = Settings.getValue("kbp_data_path")+"/newswire_sentences/forum_text_" + queryID + ".txt";
                    write = new CustomFileWriter(sentencePathName);
                }

//                if (queryID.contains("SSF14_ENG_259")) {
//                    System.out.println("SKIP2");
//                    continue;
//                }
                if (currLine.startsWith("DocID_Excerpt:\t")) { //CHANGE THIS TO DOCID EXCERPT IF TESTING// // OTHERWISE, USE DOCIDNAME
//                    System.out.println("CURRLINE:\t" + currLine);
                    docID = currLine.substring(15);             // CHANGE THIS TO 15
//                    System.out.println("Doc ID HELP 4:\t" + docID);

                    //new arrayList here for the saved words and offset data from annotations
                    //pathName = new ForumMultiThreadSync().createThreads(docID);
//                    System.out.println("PATHNAMEDMMEIJ:\t" + pathName);
                    //entityList = new NewswireFindPreAnnotation().initialize(pathName, docID, name);
                    //CS added
                    pathName=Settings.getValue("kbp_data_path")+"/2014evaluation/batchForum/"+docID+".sgm.apf.xml";
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
                if (currLine.startsWith("</doc>")) {
                    doc_start = false;
                    enteredNews = false;
                    numChars = 0;
                    startOffset = 0;
                    endOffset = 0;
                    newStartOffset = 0;
                    newEndOffset = -1;
                    trueStartOffset = 0;
                    trueEndOffset = -1;
                    copyChars = false;
//                    oriDoc.append(currLine);
                    doc.append(currLine);
                    offsetCollection.put(queryID.trim(), offsetList);
//                    System.out.println("oriDoc: " + oriDoc.toString());
                    for (int i = 0; i < queryArrayList.size(); i++) {
                        if (queryArrayList.get(i).queryid.trim().equals(queryID.trim())) {
                            queryArrayList.get(i).docText = oriDoc.toString();
                            queryArrayList.get(i).utts = utts;
                        }
                    }
                    oriDoc = new StringBuffer();
                    startx = 0;
//                    System.out.println("utts size: " + utts.size());
                    nameSplit = name.split(" ");
                    int x_startOffset = -1;
                    int x_endOffset = -1;
                    for (Utterance utt : utts) {
                        startOffset = utt.getStartx();
                        endOffset = utt.getEndx();
                        if (true) { //set true from notFound
                            boolean processed = false;
                            for (int i = 0; i < nameSplit.length; i++) {
                                // Add code here to check to see if arrayList has any offset values within this range,
                                // if so, make printSentence true.
                                for (int k = 0; k < entityList.size(); k++) {
                                    for (int s = 0; s < entityList.get(k).wordData.size(); s++) {
                                        if (entityList.get(k).wordData.get(s).startOffset >= startOffset && entityList.get(k).wordData.get(s).endOffset <= endOffset + 2 //add 2 since the offset seems a little bit wrong
                                                /*&& !nameSplit[i].contains(entityList.get(k).wordData.get(s).keyWord)comment it out by TL 03/31/15*/) {
//                                            System.out.println("this sentencne contains entity: " + entityList.get(k).wordData.get(s).keyWord);
                                            for (int l = 0; l < entityList.get(k).replaceWordData.size(); l++) {

                                                if (entityList.get(k).replaceWordData.get(l).replaceWord.toLowerCase().contains(nameSplit[i].trim().toLowerCase())/* add to lowercase commented by TL for all matches, not just she/he/the coach
                                                         && !entityList.get(k).replaceWordData.get(l).replaceWord.contains(entityList.get(k).wordData.get(s).keyWord)
                                                         && !entityList.get(k).wordData.get(s).keyWord.contains(entityList.get(k).replaceWordData.get(l).replaceWord)*/) {
						    if (entityList.get(k).replaceWordData.get(l).replaceWord.equalsIgnoreCase("New York London") 
							&& nameSplit[i].trim().equalsIgnoreCase("London")) {
							continue;
						    }
//                                                    System.out.println("this entity overlaps with query term: " + entityList.get(k).replaceWordData.get(l).replaceWord + "(entity) ===== " + nameSplit[i].trim() + "(query term");
                                                    printSentence = true;
                                                    annoteWord = entityList.get(k).wordData.get(s).keyWord;
                                                    x_startOffset = entityList.get(k).wordData.get(s).startOffset;
                                                    x_endOffset = entityList.get(k).wordData.get(s).endOffset;
                                                    OffsetInfo newOffsetData = createOffsetNode(startOffset, endOffset, annoteWord);
                                                    newOffsetData.setW_startOffset(x_startOffset);
                                                    newOffsetData.setW_endOffset(x_endOffset);
                                                    q_list_in1s.add(newOffsetData);
                                                    newOffsetData.setUtt(utt);
                                                    utt.setQuery(name);
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
                        if (!printSentence) {
                            String speaker = utt.getSpeaker();
                            if (speaker.equalsIgnoreCase(name)) {
                                //query term is speaker
                                OffsetInfo newOffsetData = createOffsetNode(startOffset, endOffset, annoteWord);
                                newOffsetData.setW_startOffset(-100); //speaker is query term
                                newOffsetData.setW_endOffset(-100);
                                q_list_in1s.add(newOffsetData);
                                newOffsetData.setUtt(utt);
                                utt.setQuery(name);
                                printSentence = true;
                            } else {
                                String sent = utt.getContent();
                                String[] items = sent.split("[\\s\\p{Punct}]+");
                                for (String item : items) {
                                    for (String split_name : nameSplit) {
                                        if (split_name.equalsIgnoreCase(item)
                                                && split_name.length() > 3) {
                                            OffsetInfo newOffsetData = createOffsetNode(startOffset, endOffset, annoteWord);
                                            newOffsetData.setW_startOffset(-50); //speaker is query term
                                            newOffsetData.setW_endOffset(-50);
                                            q_list_in1s.add(newOffsetData);
                                            newOffsetData.setUtt(utt);
                                            utt.setQuery(name);
                                            printSentence = true;
                                        }
                                    }
                                }
                            }
                        }
                        if (printSentence) {
                            write.println(utt.getContent() + "\n");
                            offsetList.add(q_list_in1s);
                            q_list_in1s = new ArrayList();

                        }
                        printSentence = false;
//                        notFound = true;

                    }
                    doc = new StringBuffer();
                    utts = new ArrayList();
                    write.closeFile();
                } else if (doc_start) {
                    doc.append(currLine + "\n");

                    if (currLine.startsWith("<post ")) {
                        startx = this.getPostInfo(read, currLine, doc, startx, utts, oriDoc);
                    }
                }
            }// End of enteredNews
        }// End while loop
        read.closeFile();
        return offsetCollection;

    }

    /**
     * get each post information
     *
     * @param read
     * @param currLine
     * @param doc
     * @param startx
     * @param utts
     * @param oriDoc
     * @return offset
     */
    public int getPostInfo(CustomFileReader read, String currLine, StringBuffer doc, int startx, ArrayList utts, StringBuffer oriDoc) {

        Utterance utt = new Utterance();
        int endx = 0;
        String speaker = currLine.substring(currLine.indexOf("author=\"") + "author=\"".length(), currLine.indexOf("\" datetime"));
        utt.setSpeakerStartx(startx + currLine.indexOf("author=\"") + "author=\"".length());
        utt.setSpeakerEndx(startx + currLine.indexOf("\" datetime"));
        String posttime = currLine.substring(currLine.indexOf("datetime=\"") + "datetime=\"".length(), currLine.indexOf("\" id="));
        String id = currLine.substring(currLine.indexOf("id=\"") + "id=\"".length(), currLine.indexOf("\">"));
        StringBuffer con_buff = new StringBuffer();
        int quote_count = 0;
//        System.out.println("speaker: " + speaker);
//        System.out.println("id: " + id);
//        System.out.println("before get PostInfo, startx: " + startx);
        while (read.hasNextLine()) {
            currLine = read.getNextLine();
//	    System.out.println("currLine: " + currLine);
//	    System.out.println("oriDoc length: " + oriDoc.length());
            currLine = currLine; /* removed trim() by TL at 05/07/15*/

            oriDoc.append(currLine); /* removed trim() by TL at 05/07/15*/

            oriDoc.append("\n");
            doc.append(currLine.trim() + "\n");
//            System.out.println("currLine: " + currLine);
            if (currLine.trim().startsWith("<quote")) {
                //skip quotes
                quote_count += 1;
            }
            if (currLine.trim().startsWith("</quote")) {
                //quote is over
                quote_count -= 1;
                continue;
            }
            if (quote_count > 0) {
                continue;
            }
            if (currLine.trim().startsWith("<a ")) {
                //skip links
                continue;
            }
            if (!currLine.startsWith("</pos")) {
                String doc_content = oriDoc.toString();
                String post = currLine;
//                System.out.println("post: " + post);
//                System.out.println("speaker: " + speaker);

                if (post.length() > 60) {
                    //added by TL 05/13/15 
                    String[] post_sents = post.split("(?<=[.?!])\\s+(?=[a-zA-Z])");
                    for (String post_sent : post_sents) {
                        utt.setContent(post_sent);
//                        System.out.println("split utt: " + post_sent);
//                utt.setRank(rank);
                        int utt_startx = doc_content.indexOf(post_sent, startx);
//                        System.out.println("utt_startx: " + utt_startx);
                        utt.setStartx(utt_startx);
                        utt.setEndx(utt_startx + post_sent.length());
                        startx = utt_startx + post_sent.length();
                        utt.setFilteredContent(post_sent.replaceAll("[\\s]+", " "));
                        utt.setSpeaker(speaker);
                        utt.setPostTime(posttime);
                        utt.setId(id);
                        utts.add(utt);
                        utt = new Utterance();
                    }
                } else {
                    utt.setContent(post);
//                utt.setRank(rank);
                    int utt_startx = doc_content.indexOf(post, startx);
//                    System.out.println("utt_startx: " + utt_startx);
                    utt.setStartx(utt_startx);
                    utt.setEndx(utt_startx + post.length());
                    startx = utt_startx + post.length();
                    utt.setFilteredContent(post.replaceAll("[\\s]+", " "));
                    utt.setSpeaker(speaker);
                    utt.setPostTime(posttime);
                    utt.setId(id);
                    utts.add(utt);
                    utt = new Utterance();
                }
                continue;

            } else {
//                System.out.println("end of post, quit!");
                break;
            }
        }
//        System.out.println("oriDoc: " + oriDoc.toString());
        return oriDoc.length();
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
