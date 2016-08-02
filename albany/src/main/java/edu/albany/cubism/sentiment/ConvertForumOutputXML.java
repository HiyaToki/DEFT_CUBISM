/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.albany.cubism.sentiment;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import javax.xml.parsers.ParserConfigurationException;
import edu.albany.cubism.util.Settings;

/**
 *
 * @author Robert J. Giarrusso
 */
public class ConvertForumOutputXML {

    private class PostInfo {

        int turnNumKey; // The turn number for each specific post
        String postKey;    // The Name of the entity

        public PostInfo(int turnNumKey, String postKey) {
            this.turnNumKey = turnNumKey;
            this.postKey = postKey;
        }

    }

    // Create an ARRAY LIST that stores all the information in the Query
    private ArrayList<PostInfo> createPostList(int turnNumKey, String postKey) {

        ArrayList<PostInfo> postArrayList = new ArrayList();
        PostInfo newPostInfoNode = new PostInfo(turnNumKey, postKey);
        postArrayList.add(newPostInfoNode);
        return postArrayList;
    }

    public void openTestDocs(HashMap<String, String> assessDocsFullHash) throws IOException, InterruptedException, ParserConfigurationException {

        String currLine = "";               // The current line in the document
        String prevLine = "";               // The previous line in the document
        String docName = "";                // The document name of the current forum discussion
        String authorName = "";             // The name of the author who wrote the forum post
        String quoteAuthor = "";            // The name of the person being quoted
        String dateTime = "";               // The dateTime of the forum post
        String textBody = "";               // The body of the author's forum post
        String offTextBody = "";
        String quoteBody = "";              // The body of the quoted text from a forum post
        String xmlTopic = "";              // The topic of the conversations
        String topicToUse = "";              // The copied topic of the conversations
        String docID = "";                  // The document ID for the conversation
        String queryID = "";                // The query Id for the conversation
        String pathName = "";               // The pathname of the annotation file for the forum post
        String type = "";                   // Type of the query
        int forumCount = 0;                 // The number of times we have encountered a document of the forum type
        int turnNum = 0;                    // The number of turns in a discussion
        int responseNum = -1;               // The turn number of the quote being used
        int inQuote = 0;                    // The number that will increase or decrease depending on the number of quotes used in a post
        int startImg = 0;                   // Used to find the offset of the <img> and <a href> tags
        int endImg = 0;                     // Used to find the offset of the <img> and <a href> tags
        int firstIndex;                     // An offset used to help find the post author name
        int secondIndex;                    // An offset used to help find the post author name
        boolean quotePresent = false;       // A trigger to sequence events if a post uses a quote
        boolean enteredForum = false;       // Decide if it is okay to being looking to write to a new file
        boolean startWriting = false;       // Decide when to start writing to a new file
        boolean skipTopic = false;
        ArrayList<String> nameList = new ArrayList(); // Array list tos tore the annotation topics
        CustomFileWriter write = null;      // The writing file that will be used to write the entire document
        CustomFileWriter writeQuery = null; // The writing file that will be used to write the query index document

        // The HashMap that will store the turn number and text for each post
        HashMap<String, ArrayList<PostInfo>> postDataMap = new HashMap();

        //Start writing the new query file
        String queryDocName = "forum_convo_query.txt";
        String queryPathName = Settings.getValue("kbp_data_path")+"/2014evaluation/converted_docs/" + queryDocName;
        writeQuery = new CustomFileWriter(queryPathName);

        //Open up the document with the final test data and go through each line
  /* //CHANGE THIS LINE FOR OLD/NEW*/ String pathNameSource = Settings.getValue("kbp_data_path")+"/2014evaluation/Source_Corpus_Files/output_sentences.txt";
        CustomFileReader read = new CustomFileReader(pathNameSource);
        while (read.hasNextLine()) {

            // For each line, keep track of the current and previous lines read
            prevLine = currLine;
            currLine = read.getNextLine();

            // check if we have reached the FORUM CASE to start writing
            if (currLine.contentEquals("FORUM CASE")) {

                // Initialize starting variables
                postDataMap.clear();
                enteredForum = true;
                turnNum = 0;

                // Start writing to the new output file and increase the forumCount to give each document a unique ID
                forumCount++;
                docName = "forum_convo" + forumCount + ".xml";
                String pathNameDest = Settings.getValue("kbp_data_path")+"/2014evaluation/converted_docs/" + docName;
                write = new CustomFileWriter(pathNameDest);

                // Write the standard output at the top of the .XML file
                String xmlHeader = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?>";
                String dialogueID = "\n<Dialogue id=\"" + docName + "\">\n";
                write.print(xmlHeader + dialogueID);
            }
            
            // Store the document ID for the forum discussion and use  it to obtain the location of the annotation  file
            if (enteredForum && currLine.startsWith("QueryID:")) {
                queryID = currLine.substring(9);
            }

            // Print the post document name of the discussion as well as the Name of the discussion's item targer
            if (enteredForum && currLine.startsWith("Name:")) {
                writeQuery.print(docName + " = ");
                writeQuery.print(currLine.substring(7) + "; ");
                xmlTopic = currLine.substring(7);
            }
            // Store the document ID for the forum discussion and use  it to obtain the location of the annotation  file
            if (enteredForum && currLine.startsWith("DocID_Name:")) {
                docID = currLine.substring(12);
                System.out.println("DOCIDNAME:\t" + docID);
                pathName = new ForumMultiThreadSync().createThreads(docID);
                System.out.println("PATHNAME:\t" + pathName);

            }
            if (enteredForum && currLine.startsWith("Sentiment_Slot:")) {
                writeQuery.print(currLine.substring(16) + "; ");
                writeQuery.print(queryID);
                if (currLine.substring(16).contentEquals("neg-from") || currLine.substring(16).contentEquals("pos-from")) {
                    type = "from";
                } else {
                    type = "towards";
                }
            }
            if (enteredForum && currLine.startsWith("Slot_Filler_")) {
                writeQuery.print(currLine.substring(15) + " / ");
            }

            // Signal the program to start copying over the posts to the new XML document
            if (currLine.contentEquals("</headline>") && enteredForum) {
                writeQuery.print("\n");
                currLine = read.getNextLine();
                startWriting = true;
            }

            // Stop writing to this file and close it if we are at the end of the document
            if (currLine.contentEquals("</doc>")) {
                write.print("</Dialogue>");
                startWriting = false;
                enteredForum = false;
                write.closeFile();
            }
            if (currLine.contentEquals("</DOC>")) {
                startWriting = false;
                enteredForum = false;
            }

            // Begin copying over the posts to the new document
            if (startWriting) {
                // obtain the information given by the first line of an author's post
                if (currLine.startsWith("<post")) {

                    // Increment the Turn Number(post number)
                    turnNum++;
                    // Obtain the name of the post author
                    firstIndex = currLine.indexOf("author=\"") + 8;
                    secondIndex = currLine.indexOf("datetime=\"") - 2;
                    authorName = currLine.substring(firstIndex, secondIndex);
                    // Obtain the datetime
                    firstIndex = currLine.indexOf("datetime=\"") + 10;
                    secondIndex = currLine.indexOf("id=\"") - 2;
                    dateTime = currLine.substring(firstIndex, secondIndex);
                    continue;
                }

//                System.out.println("BEFORE PRINTING");
                // End the current search for information within the post
                if (currLine.startsWith("</post>")) {

                    // Store the textBodies and turnNumbers from each post into a datastruct
                    if (postDataMap.get(authorName) == null) {
                        postDataMap.put(authorName, createPostList(turnNum, textBody));
                    } else {
                        PostInfo newPostInfoNode = new PostInfo(turnNum, textBody);
                        postDataMap.get(authorName).add(newPostInfoNode);
                    }
//                    System.out.println("BEFORE PRINTING");
                    // Decide which post header to use depending on if somone is quoting someone or not
                    if (quotePresent) {
                        ///////// FAIL SAFE CODE//////////////////
                        if (postDataMap.get(quoteAuthor) == null) {
                            for (String key : postDataMap.keySet()) {
                                for (int j = 0; j < postDataMap.get(key).size(); j++) {
                                    if (postDataMap.get(key).get(j).postKey.trim().contains(quoteBody.trim())) {
                                        responseNum = postDataMap.get(key).get(j).turnNumKey;
                                    }
                                }
                            }
                        } ///////// END FAIL SAFE CODE////////////
                        else {
                            for (int j = 0; j < postDataMap.get(quoteAuthor).size(); j++) {
                                if (postDataMap.get(quoteAuthor).get(j).postKey.trim().contains(quoteBody.trim())) {
                                    responseNum = postDataMap.get(quoteAuthor).get(j).turnNumKey;
                                }
                            }
                        }
                        //   
                        ////////////// FAIL SAFE CODE //////////////////////
                        if (responseNum == -1) {

                            nameList = addTopic(assessDocsFullHash, pathName, offTextBody, docID, xmlTopic, type);

                            write.print("<turn comm_act_type=\"addressed-to\" dialog_act=\"\" emotion=\"\" emotion_list=\"\" "
                                    + "end_time=\"" + dateTime + "\" link_to=\"all-users\" mode=\"Wiki\" polarity=\"\" pos=\"\" "
                                    + "pos_count=\"\" post_origin=\"\" speaker=\"" + authorName + "\" topic=\"");
                            for (int l = 0; l < nameList.size(); l++) {
                                write.print(nameList.get(l));
                                if ((l + 1) < nameList.size()) {
                                    write.print(";");
                                }
                            }
                            write.print("\" turn_no=\"" + turnNum + "\">" + textBody + "</turn>\n");
                            /////////////// END FAIL SAFE ////////////////////////
                        } else {

                            nameList = addTopic(assessDocsFullHash, pathName, offTextBody, docID, xmlTopic, type);

                            write.print("<turn comm_act_type=\"response-to\" dialog_act=\"\" emotion=\"\" emotion_list=\"\" "
                                    + "end_time=\"" + dateTime + "\" link_to=\"" + quoteAuthor + ":" + responseNum + "\" mode=\"Wiki\" polarity=\"\" pos=\"\" "
                                    + "pos_count=\"\" post_origin=\"\" speaker=\"" + authorName + "\" topic=\"");
                            for (int l = 0; l < nameList.size(); l++) {
                                write.print(nameList.get(l));
                                if ((l + 1) < nameList.size()) {
                                    write.print(";");
                                }
                            }
                            write.print("\" turn_no=\"" + turnNum + "\">" + textBody + "</turn>\n");

                        }
                    } else {

                        nameList = addTopic(assessDocsFullHash, pathName, offTextBody, docID, xmlTopic, type);

                        write.print("<turn comm_act_type=\"addressed-to\" dialog_act=\"\" emotion=\"\" emotion_list=\"\" "
                                + "end_time=\"" + dateTime + "\" link_to=\"all-users\" mode=\"Wiki\" polarity=\"\" pos=\"\" "
                                + "pos_count=\"\" post_origin=\"\" speaker=\"" + authorName + "\" topic=\"");
                        for (int l = 0; l < nameList.size(); l++) {
                            write.print(nameList.get(l));
                            if ((l + 1) < nameList.size()) {
                                write.print(";");
                            }
                        }
                        write.print("\" turn_no=\"" + turnNum + "\">" + textBody + "</turn>\n");
                    }
                  //  }

                    // Reset reused variables and return to the while loop
                    quotePresent = false;
                    quoteAuthor = "";
                    textBody = "";
                    offTextBody = "";
                    quoteBody = "";
                    responseNum = -1;
                    skipTopic = false;
                    nameList.clear();
                    continue;
                }

                // Check if we are working with someone quoting another person
                if (currLine.startsWith("<quote orig_author") && inQuote == 0) {
                    quotePresent = true;
                    inQuote++;
                    quoteAuthor = getQuoteAuthor(currLine);
                    continue;
                }
                if (currLine.startsWith("<quote")) {
                    quotePresent = true;
                    inQuote++;
                    continue;
                }
                if (currLine.startsWith("</quote>")) {
                    inQuote--;
                    continue;
                }

                // If we are inside of the quotes, copy the text into the quote body
                if (inQuote == 1) {
                    quoteBody += currLine;

                }
                // If we are out of the quotes of a post, now start copying the text to the textBody string
                if (inQuote == 0) {

                    offTextBody += (currLine + "\n");
                    // Remove all Unwanted Tags
                    //currLine = removeImgTags(currLine, startImg, endImg);
                    //currLine = removeLinks(currLine, startImg, endImg);
                    textBody += currLine;
                }

            }// End startWriting
        }// End While Loop
        writeQuery.closeFile();

    }// End openTestDoc    

    // Obtain the name of the post author
    public String getQuoteAuthor(String currLine) {

        int firstIndex;     // The index in the line where the author name begins
        int secondIndex;    // The index in the line where the author name ends
        String quoteAuthor; // String to hold the name of the author

        firstIndex = currLine.indexOf("orig_author=\"") + 13;
        secondIndex = currLine.indexOf("\">");
        quoteAuthor = currLine.substring(firstIndex, secondIndex);

        return quoteAuthor;
    }

    public String removeImgTags(String currLine, int startImg, int endImg) {

        while (currLine.contains("<img src=") || currLine.contains("\"/>")) {

            endImg = 0;
            startImg = 0;
            // Get rid of extra tags!
            if (currLine.replaceAll(" ", "").contains("<imgsrc=")) {
                //      System.out.println(currLine);
                //     System.out.println((currLine.replaceAll(" ", "")));
                startImg = currLine.lastIndexOf("<img src=");
                endImg = currLine.lastIndexOf("\"/>");
                try {
                    String cutTxt = (String) currLine.subSequence(startImg, endImg + 3);
                    currLine = currLine.replace(cutTxt, "");
                } catch (Exception ex) {
                    ex.printStackTrace();
                    // System.out.println("\nERROR:" + prevLine+ "\n"+currLine);
                    System.out.flush();
                    System.exit(1);
                }
                //     System.out.println(currLine + "\n");
            }

            // check to see if there are still some weird issues with img tags
            if (currLine.replaceAll(" ", "").contains("\"/>") && !currLine.replaceAll(" ", "").contains("<")) {
                endImg = currLine.lastIndexOf("\"/>");
                try {
                    String cutTxt = (String) currLine.subSequence(0, endImg + 3);
                    currLine = currLine.replace(cutTxt, "");
                } catch (Exception ex) {
                    ex.printStackTrace();
                    //      System.out.println("\nERROR:" + prevLine+ "\n"+currLine);
                    System.out.flush();
                    System.exit(1);
                }
                //    System.out.println(currLine + "\n");
            }
        }
        return currLine;
    }

    public String removehrefTags(String currLine, int startImg, int endImg) {

        String cutTxt = "";
        boolean keepGoing = true;

        while (currLine.contains("<a href") || currLine.contains("</a>")) {
            // Check to see if the line has an <a href tag
            if (currLine.replaceAll(" ", "").contains("<ahref")) {
                //    System.out.println(currLine);

                startImg = currLine.lastIndexOf("<a href");
                int indexPoint = startImg;

                try {
                    if (currLine.charAt(currLine.length() - 1) == '>' && currLine.charAt(currLine.length() - 2) != 'a') {
                        indexPoint = currLine.length() - 1;
                    } else {
                        while (keepGoing && currLine.charAt(indexPoint) != '>') {
                            if (currLine.length() - indexPoint == 1) {
                                indexPoint = currLine.length();
                                keepGoing = false;
                            }
                            indexPoint++;
                        }
                    }

                } catch (Exception ex) {
                    ex.printStackTrace();
                    System.out.println("\nERROR:" + "\n" + currLine);
                    System.out.flush();
                    System.exit(1);

                }

                // Get rid of the <a href=....
                try {
                    if (keepGoing == false) {
                        cutTxt = (String) currLine.subSequence(startImg, indexPoint - 1);
                    } else {
                        cutTxt = (String) currLine.subSequence(startImg, indexPoint + 1);
                    }

                    currLine = currLine.replace(cutTxt, "");
                } catch (Exception ex) {
                    ex.printStackTrace();
                    System.out.println("\nERROR:" + "\n" + currLine);
                    System.out.flush();
                    System.exit(1);
                }
            }

            if (currLine.replaceAll(" ", "").contains("</a>")) {
                // Get rid of the </a>
                endImg = currLine.lastIndexOf("</a>");
                try {
                    cutTxt = (String) currLine.subSequence(endImg, endImg + 4);
                    currLine = currLine.replace(cutTxt, "");
                } catch (Exception ex) {
                    ex.printStackTrace();
                    System.out.println("\nERROR:" + "\n" + currLine);
                    System.out.flush();
                    System.exit(1);
                }
                // System.out.println(currLine + "\n");
            }
        }
        System.out.println(currLine + "\n");
        return currLine;
    }

    public String removeLinks(String currLine, int startImg, int endImg) {

        String txtToCut = "";
        while (currLine.contains("<a href") || currLine.contains("</a>")) {
            try {
                // If a line contains the entire href sequence
                if (currLine.contains("<a href") && currLine.contains("</a>")) {
                    startImg = currLine.indexOf("<a href");
                    endImg = currLine.lastIndexOf("</a>") + 3;
                    txtToCut = currLine.substring(startImg, endImg);
                    currLine = currLine.replace(txtToCut, "WEBLINK");
                    return currLine;
                }
                // If a line only contains the "<a href" portion
                if (currLine.contains("<a href") && !currLine.contains("</a>")) {
                    startImg = currLine.indexOf("<a href");
                    endImg = currLine.length();
                    txtToCut = currLine.substring(startImg, endImg);
                    currLine = currLine.replace(txtToCut, "WEBLINK PIECE");
                    return currLine;
                }
                // If a line only contains the "</a>" portion
                if (!currLine.contains("<a href") && currLine.contains("</a>")) {
                    startImg = 0;
                    endImg = currLine.indexOf("</a>");
                    txtToCut = currLine.substring(startImg, endImg);
                    currLine = currLine.replace(txtToCut, "WEBLINK PIECE");
                    return currLine;
                }
            } catch (Exception ex) {
                ex.printStackTrace();
                System.out.flush();
                System.out.println(currLine);
                System.out.println("startImg:\t" + startImg);
                System.out.println("endImg:\t" + endImg);
                System.exit(1);

            }
        }
        return currLine;
    }

    public ArrayList<String> addTopic(HashMap<String, String> assessDocsFullHash, String pathName, String textBody, String docID, String xmlTopic, String type) throws ParserConfigurationException {
        return new ForumFindAnnotation().initialize(pathName, docID, assessDocsFullHash, textBody, xmlTopic, type);

    }
}
