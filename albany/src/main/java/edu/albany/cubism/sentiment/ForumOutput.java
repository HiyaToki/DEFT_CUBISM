/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.albany.cubism.sentiment;


import edu.albany.cubism.sentiment.LoadQuerys.QueryInput;
import java.util.ArrayList;
import java.util.HashMap;
import edu.albany.cubism.util.Settings;

/**
 *
 * @author jrgiarrusso
 */
public class ForumOutput {

    private class EvidenceInfo {

        int startOffset;  // specific dependency data for a node
        int endOffset;          // if the node has already been searched

        public EvidenceInfo(int startOffset, int endOffset) {
            this.startOffset = startOffset;
            this.endOffset = endOffset;
        }
    }

    public void initialize(HashMap<String, String> docsFullHash, ArrayList<QueryInput> queryArrayList) {

        String currLine = "";       // Holds the current line of the
        String queryID = "";        // The queryID for the current forum 
        String forumConvo = "";     // The forumConvo number used for the xml conversion

        // Open the file that has the list of queries for forum discussions
        CustomFileReader forumDiscussion = new CustomFileReader(Settings.getValue("kbp_data_path")+"/2014evaluation/converted_docs/forum_convo_query.txt");
        while (forumDiscussion.hasNextLine()) {

            // Obtain the queryID for that forum discussion
            currLine = forumDiscussion.getNextLine();
            queryID = currLine.substring(currLine.lastIndexOf(";") + 2, currLine.length());
            forumConvo = currLine.substring(0, currLine.indexOf("."));

            System.out.println("-----------------------");
            System.out.println("QueryID:\t" + queryID);
            System.out.println("ForumConvo:\t" + forumConvo + "\n");

            // Begin the process of writing to the file
            writeToFile(queryID, forumConvo, docsFullHash, queryArrayList);

        }

    }

    public void writeToFile(String queryID, String forumConvo, HashMap<String, String> docsFullHash, ArrayList<QueryInput> queryArrayList) {

        // Create a new file that will be in the correct Output format
        CustomFileWriter forumOutput = new CustomFileWriter(Settings.getValue("kbp_data_path")+"/2014evaluation/forum_output/" + queryID);

        // Go through the querryAraryList and find the query with the same queryID
        // Once found, do all the output processing
        for (int j = 0; j < queryArrayList.size(); j++) {
            if (queryArrayList.get(j).queryid.contentEquals(queryID)) {
                processOutput(j, queryID, queryArrayList.get(j).docid, forumConvo, docsFullHash, queryArrayList, forumOutput);
                forumOutput.closeFile();
                return;
            }
        }
    }

    public void processOutput(int listNumber, String queryID, String docID, String forumConvo, HashMap<String, String> docsFullHash, ArrayList<QueryInput> queryArrayList, CustomFileWriter forumOutput) {

        String csvLine = "";       // The currentLine in the CSV file
        String xmlLine = "";        // The currentLine in the XML file
        String answer = "";         // The answer for the query
        String speaker = "";        // The speaker in the line of the forum discussion
        String wholeSpeaker = "";   // The speaker fromt he entire document (ripped from)
        int speakerStart = 0;       // The speaker start offset
        int speakerEnd = 0;         // The speaker end offset
        String evidenceLine = "";   // The evidence Line for the forum discussion
        int evidenceStart = 0;      // The envidence start offset
        int evidenceEnd = 0;        // The evidence end offset
        int newLineCount = 0;
        String turnNumber = "";     // The turn number for the forum discussion
        String csvSplit[];          // A String array that holds parts of the name split form spaces
        String docSplit[];          // The split up forum document
        String nameOffset = "";     // The offset for the found name in the xml file
        double score = -1;          // The score of the ANEW evaluation.
        int charCount = -1;          // The character count number when calculating offset

        // Open up the CSV file and then look for the line that contains the same forumconvo as the queryID
        CustomFileReader csvFile = new CustomFileReader(Settings.getValue("kbp_data_path")+"/2014evaluation/evidence2.csv");
        while (csvFile.hasNextLine()) {

            // If the current Line has the forumConvo number, then get the next line and obtain the evidence line and the turn number
            csvLine = csvFile.getNextLine();

            System.out.println(csvLine);
            if (csvLine.contains(forumConvo)) {
                csvLine = csvFile.getNextLine();

                // The case where there is no found answer to the query
                if (csvLine.startsWith("\"Speaker Not Found\"") || csvLine.startsWith("\"All zeros\"")) {

                    // Write the beginning of the output file information to the file, regardless if we found an answer to it or not
                    forumOutput.print(queryID + "\t" + queryArrayList.get(listNumber).slot + "\tsuny_albany5\tNIL");
                    return;
                } // The case where there is an answer to the query
                else {
                    while (!csvLine.contentEquals(";;;;")) {

                        // Split the line into 4 different parts, using the delimiter of ';'
                        csvSplit = csvLine.split(";");
                        answer = csvSplit[0].substring(1, csvSplit[0].length() - 1);
                        speaker = csvSplit[1];
                        evidenceLine = csvSplit[2].substring(1, csvSplit[2].length() - 1);
                        score = convertScoretoConfidence(Double.parseDouble(csvSplit[3]));
                        turnNumber = "p" + csvSplit[4];

                        System.out.println(speaker + " / " + evidenceLine + " / " + score + " / " + turnNumber);

                        //Break the document into sentences
                        docSplit = docsFullHash.get(docID).split("\n");

                        // Search the document for the speaker ID to find the speaker offset values
                        for (int x = 0; x < docSplit.length; x++) {
                            if (docSplit[x].contains("id=\"" + turnNumber + "\"")) {
                                System.out.println("SPEAKERID:\t" + "id=\"" + turnNumber + "\"");
                                speakerStart = (docSplit[x].toLowerCase().indexOf(speaker) + 1);    // The 1 is taking into account how the name starts with a '"'
                                speakerEnd = (speakerStart + speaker.length() - 2);   // 2 is taking into account the two '"' and the 1 shift upwards from before

                                System.out.println("SpeakerStart:\t" + speakerStart);
                                System.out.println("SpeakerEnd:\t" + speakerEnd);
                                System.out.println("Original:\t" + speaker);
                                System.out.println("Individual:\t" + docSplit[x].substring(speakerStart, speakerEnd));
                                System.out.println("Whole:\t" + docsFullHash.get(docID).substring(charCount + speakerStart + 1, charCount + speakerEnd + 1));
                                wholeSpeaker = docsFullHash.get(docID).substring(charCount + speakerStart + 1, charCount + speakerEnd + 1);
                                speakerStart = charCount + speakerStart + 1;
                                speakerEnd = charCount + speakerEnd + 1;

                                charCount = charCount + docSplit[x].length() + 1;
                                x++;

                                System.out.println("ONE");
                                // Obtain the offsets for the sentences
                                while (!docSplit[x].startsWith("</post>")) {
                                    charCount = charCount + docSplit[x].length() + 1;
                                    x++;
                                }
                                System.out.println("TWO");

                                evidenceEnd = charCount;
                                x--;
                                while (!docSplit[x].startsWith("</quote>") && !docSplit[x].startsWith("<post author=")) {
                                    charCount = charCount - docSplit[x].length();
                                    x--;
                                    newLineCount++;
                                }
                                System.out.println("THREE");

                                evidenceStart = charCount;

                                System.out.println("Evidence:\t" + evidenceLine);
                                System.out.println("Sentence:\t" + docsFullHash.get(docID).substring(evidenceStart - newLineCount, evidenceEnd));
                                evidenceStart = evidenceStart - newLineCount;

                                x = docSplit.length;
                            } else {
                                System.out.println(docSplit[x]);
                                System.out.println("CharCount:\t" + charCount);
                                charCount = charCount + docSplit[x].length() + 1;
                            }
                        }
                      //  System.out.println("OLD:\t" + evidenceStart + "\n\t" + evidenceEnd);

                        EvidenceInfo newEvidenceInfo = adjustOffsetRange(evidenceStart, evidenceEnd, docsFullHash.get(docID).substring(evidenceStart - newLineCount, evidenceEnd), answer);
                        System.out.println("OLD:\t" + evidenceStart + "\n\t" + evidenceEnd);
                        System.out.println("NEW:\t" + newEvidenceInfo.startOffset + "\n\t" + newEvidenceInfo.endOffset);
                        forumOutput.println(queryID + "\t" + queryArrayList.get(listNumber).slot + "\tsuny_albany5\t"
                                + docID + ":" + newEvidenceInfo.startOffset + "-" + newEvidenceInfo.endOffset + "\t" + wholeSpeaker + "\t" + docID + ":" + speakerStart + "-" + speakerEnd + "\t" + score);
                        charCount = -1;
                        speakerEnd = 0;
                        speakerStart = 0;
                        evidenceEnd = 0;
                        evidenceStart = 0;
                        newLineCount = 0;

                        // DO MORE SHIT
//                        CustomFileReader postXML = new CustomFileReader(Settings.getValue("kbp_data_path")+"/2014evaluation/cleaned_xml/" + forumConvo + ".xml");
//                        while (postXML.hasNextLine()) {
//                            xmlLine = postXML.getNextLine();
//                            if(xmlLine.contains("turn_no=\"13\"")){
//                                
//                            }                                
//                        }
                        // Last step:
                        if (csvFile.hasNextLine()) {
                            csvLine = csvFile.getNextLine();
                        } else {
                            return;
                        }
                    }
                    csvFile.closeFile();
                    return;
                }
            }
        }
    }

    public EvidenceInfo adjustOffsetRange(int startOffset, int endOffset, String completeLine, String answer) {

        int sentenceStart = startOffset;
        int startRange = 0;
        int midRange = 75;
        int endRange = 149;
        int sentenceEnd = completeLine.length();
        boolean search = true;

        String nameSplit[] = answer.split(" ");               // A String array that holds parts of the name split form spaces
        ArrayList<String> namePieces = new ArrayList();     // An arrayList that will store the vital peices of the name

        //System.out.println("INSIDE starting location");
        // Delete words like "of" "the"
        for (int i = 0; i < nameSplit.length; i++) {
            if (!nameSplit[i].trim().toLowerCase().contentEquals("of") || !nameSplit[i].trim().toLowerCase().contentEquals("and")
                    || !nameSplit[i].trim().toLowerCase().contentEquals("the") || !nameSplit[i].trim().toLowerCase().contentEquals("for")) {
                namePieces.add(nameSplit[i]);
            }
        }

        // If the offset difference is less than 150 characters already, then just return, no need to alter anything
        if (endOffset - startOffset <= 149) {
            EvidenceInfo newEvidenceInfo = new EvidenceInfo(startOffset, endOffset);

            return newEvidenceInfo;
        } else {

            // Start at the beginning of the sentence and move forward 1 character at a time, all the while testing if
            // the relation and the x are within the 150 character window
            for (int j = 0; j < namePieces.size(); j++) {

                // Reset the start values
                startRange = -1;
                midRange = 74;
                endRange = 148;
                search = true;
                while (search) {

                    startRange++;
                    midRange++;
                    endRange++;

                    System.out.println(completeLine.length());
                    System.out.println(namePieces.get(j));
                    System.out.println("start:\t" + startRange);
                    System.out.println("mid:\t" + midRange);
                    System.out.println("end:\t" + endRange);

                    System.out.flush();

                    System.out.println(completeLine.toLowerCase().substring(startRange, endRange));

                    if (completeLine.toLowerCase().substring(startRange, endRange).contains(namePieces.get(j).toLowerCase())) {

                        if ((completeLine.toLowerCase().indexOf(namePieces.get(j).toLowerCase()) + namePieces.get(j).length()) < midRange) {

                            System.out.println("Case 1");

                            EvidenceInfo newEvidenceInfo = new EvidenceInfo(sentenceStart + startRange, sentenceStart + endRange);

                            return newEvidenceInfo;
                        }
                        if ((completeLine.toLowerCase().indexOf(namePieces.get(j).toLowerCase()) + namePieces.get(j).length()) >= midRange
                                && completeLine.toLowerCase().indexOf(namePieces.get(j)) <= midRange) {

                            System.out.println("Case 2");

                            EvidenceInfo newEvidenceInfo = new EvidenceInfo(sentenceStart + startRange, sentenceStart + endRange);

                            return newEvidenceInfo;
                        }
                        if (endRange == sentenceEnd) {
                            System.out.println("HERE WE GO");
                            if (j == namePieces.size() - 1) {
                                System.out.println("Case 3");
                                EvidenceInfo newEvidenceInfo = new EvidenceInfo(sentenceStart + startRange, sentenceStart + endRange);

                                return newEvidenceInfo;

                            } else {
                                search = false;
                            }
                        }

                    }
                    if (endRange == sentenceEnd) {
                        System.out.println("HERE ONE");
                        search = false;
                    }

                    System.out.println("SECOND");
                    System.out.println(completeLine.substring(startRange, endRange));
                    System.out.println(namePieces.get(j) + "\n");

                }
            }
        }
        EvidenceInfo newEvidenceInfo = new EvidenceInfo(sentenceStart + startRange, sentenceStart + endRange);
        return newEvidenceInfo;
    }

    public double convertScoretoConfidence(double anewScore) {

        if ((anewScore >= 1 && anewScore < 3) || (anewScore > 7 && anewScore <= 9)) {
            return 8 * (0.1);
        }
        if ((anewScore >= 3 && anewScore < 4) || (anewScore > 6 && anewScore <= 7)) {
            return 5 * (0.1);
        }
        if ((anewScore >= 4 && anewScore <= 6)) {
            return 2 * (0.1);
        }
        return anewScore;
    }

}
