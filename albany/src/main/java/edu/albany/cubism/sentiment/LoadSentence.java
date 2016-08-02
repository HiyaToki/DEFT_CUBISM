/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.albany.cubism.sentiment;

import edu.albany.cubism.util.OpenANEW;
import edu.albany.cubism.sentiment.StanfordParser.ParserParts;
import edu.albany.ils.remnd.util.Wordnet;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.xml.parsers.ParserConfigurationException;

/**
 *
 * @author Robert J. Giarrusso
 */
public class LoadSentence {

    // Class which stores each peice of the dependency relations in a sentence
    public class SentenceInfo {

        String soloDepend;  // specific dependency data for a node

        public SentenceInfo(String soloDepend) {
            this.soloDepend = soloDepend;
        }
    }

    // Create a new node for that stores all the information for the sentence
    private SentenceInfo createSentenceNode(String soloDepend) {
        SentenceInfo newSentenceInfoNode = new SentenceInfo(soloDepend);
        return newSentenceInfoNode;
    }

    // Holds the information gathered from each read sentence
    private class CalculusInfo {

        String x;               // The answer we find
        String relation;        // The relation between the answer and the query name
        String firstRelation;   // The immediate relation found
        String target;          // The query name
        String foundLine;       // The current line being read and looked at
        double sentiment;       // The sentiment value of the relation, based on the ANEW database score
        boolean negate;         // Decide whether to negate the relation
        boolean ignore;         // Decide whether to ignore the first reported news check

        public CalculusInfo(String x, String relation, String firstRelation, String target, String foundLine,
                double sentiment, boolean negate, boolean ignore) {

            this.x = x;
            this.relation = relation;
            this.firstRelation = firstRelation;
            this.target = target;
            this.foundLine = foundLine;
            this.sentiment = sentiment;
            this.negate = negate;
            this.ignore = ignore;
        }

    }

    // Open a file containing a list of sentences and based on the name of the file, get all of the data associated with it
    private void setUpSentence(String object, String sentimentPosition, String sentence) throws SQLException, InterruptedException, IOException, ParserConfigurationException {

        // Create the list of exempt words
        ArrayList<String> exemptWords = new ArrayList();
        exemptWords = createExemptWords();

        // Create a stanfordParser to be used
        StanfordParser sp = new StanfordParser();

        readSentence(object, sentimentPosition, sentence, sp, exemptWords);
    }

    private void readSentence(String object, String sentimentPosition, String sentence, StanfordParser sp, ArrayList<String> exemptWords) throws SQLException, InterruptedException, IOException, ParserConfigurationException {

        String typedDepend;                                                         // A String that stores the dependency string from parser
        String typedTree;                                                           // A String that stores the depentency tree from parser
        CalculusInfo calcData = new CalculusInfo("", "", "", "", "", -1, false, false);    // A variable that stores the information for basic calculs
        ArrayList<SentenceInfo> dependArrayList = new ArrayList();                  // An Array List that stores the structured dependencies
        int startLocation = -1;                                                     // Initialize the startLocation where the name is found within the sentence Info struct
        double relationSentiment = 0;                                               // The value of the sentiment of the relation
        GenerateMetaDataXML run = new GenerateMetaDataXML();                        // Tool to see the type of entities are within the sentence
        OpenANEW openANEWDatabase = new OpenANEW();                                 // Open the ANEW database to obtain sentiment of words
        Wordnet wordnet = new Wordnet();                                            // Open Wordnet in order to get bases of words.

        // parse the line whiel splitting each piece of the stnaford parser dependencies into its 
        // own node in an array list
        ParserParts pp = sp.parse(sentence);
        typedTree = pp.tree;
        typedDepend = pp.dependency;
        typedDepend = removeBrackets(typedDepend);

        // Reinitialize the ArrayList,store it with the dependencies and get the starting location of the name
        dependArrayList.clear();
        dependArrayList = splitDepend(typedDepend);

        // Try to find the start location of the name If the start location wasn't found,
        // and the type is that of an organization, try it again, except with the abbreviation for it instead
        startLocation = findStartingName(dependArrayList, object, calcData, sentimentPosition);
        if (hasOrg(sentence) && startLocation == -1) {
            startLocation = findStartingName(dependArrayList, getAbbreviation(object), calcData, sentimentPosition);
        }

        // Decide whether we are looking at the From or Towards cases and process the sentences different depending on it
        if (sentimentPosition.contentEquals("pos-from") || sentimentPosition.contentEquals("neg-from")) {
            if (startLocation != -1) {
                findSubjectFrom(startLocation, dependArrayList, calcData, typedTree, exemptWords);
            }
        } else {
            if (startLocation != -1) {
                findObjectTowards(startLocation, dependArrayList, calcData, typedTree, exemptWords);
            }
        }
        calcData.foundLine = sentence;

        // Print out the ~Update I~ text in the output - safe to delete
        printUpdate(calcData, "I");

        // If the relation is any type of variation of "says" or "said", then look for specific items within the dependencies
        if (isSaid(clearEndingNumbers(calcData.relation))) {
            saysRelation(dependArrayList, calcData, exemptWords);
            if (isSaid(clearEndingNumbers(calcData.relation))) {
                if (!calcData.firstRelation.contentEquals("")) {
                    calcData.relation = calcData.firstRelation;
                }
            }
        }

        // See if the relation is a variation of "have" or other special cases
        checkForExtension(dependArrayList, calcData);
        checkForHave(dependArrayList, calcData, sentimentPosition);
        checkForJoined(dependArrayList, calcData, typedTree);
        checkForNegate(dependArrayList, calcData);

        // Print out the answer to the query
        printCalcData(object, relationSentiment, openANEWDatabase, wordnet, calcData, sentimentPosition, sentence, typedTree,
                dependArrayList, exemptWords);

    }

    private String removeBrackets(String typedDepend) {
        StringBuilder noBrackets = new StringBuilder(typedDepend);
        noBrackets.deleteCharAt(noBrackets.indexOf("[", 0));
        noBrackets.deleteCharAt(noBrackets.lastIndexOf("]"));
        typedDepend = noBrackets.toString();
        return typedDepend;
    }

    private ArrayList<SentenceInfo> splitDepend(String typedDepend) {

        int start = 0;
        boolean inParen = false;
        ArrayList<SentenceInfo> dependArrray = new ArrayList();

        // Seperate the individual dependencies and put them into an array list
        for (int i = 0; i < typedDepend.length(); i++) {
            char c = typedDepend.charAt(i);
            if (c == '(') {
                inParen = true;
            }
            if (c == ')' && inParen == true) {
                inParen = false;
                dependArrray.add(createSentenceNode(typedDepend.substring(start, i + 1).trim()));
                start = i + 3;
            }
        }
        return dependArrray;
    }

    private int findStartingName(ArrayList<SentenceInfo> dependArray, String name, CalculusInfo calcData, String sentimenPosition) {

        // Ignore cases where the name is only 1 character
        if (name.length() < 2) {
            return -1;
        }

        String pairedItemOne;                          // The paired item within the dependencies
        String pairedItemTwo = "";                          // The paired item within the dependencies
        String tempRel = "";                                // temporary relation for the posessive case
        String nameSplit[] = name.split(" ");               // A String array that holds parts of the name split form spaces
        ArrayList<String> namePieces = new ArrayList();     // An arrayList that will store the vital peices of the name

        // Delete words like "of", "the"
        for (String nameSplit1 : nameSplit) {
            if (!nameSplit1.trim().toLowerCase().contentEquals("of") || !nameSplit1.trim().toLowerCase().contentEquals("and") || !nameSplit1.trim().toLowerCase().contentEquals("the") || !nameSplit1.trim().toLowerCase().contentEquals("for")) {
                namePieces.add(nameSplit1);
            }
        }

        // If we are looking at the towards case
        if (sentimenPosition.contains("towards")) {

            // For every dependecy, find the subject.  If that subject is the Name we are looking for, then we should most likely use it
            for (int j = 0; j < dependArray.size(); j++) {
                if (dependArray.get(j).soloDepend.startsWith("nsubj(") || dependArray.get(j).soloDepend.startsWith("nsubjpass(")) {

                    // Split the node peice by spaces
                    pairedItemTwo = easyPairedItem(dependArray.get(j).soloDepend, 2);
                    pairedItemOne = easyPairedItem(dependArray.get(j).soloDepend, 1);

                    for (String namePiece : namePieces) {
                        if (pairedItemTwo.toLowerCase().contains(namePiece.toLowerCase())) {
                            calcData.target = pairedItemTwo;
                            calcData.relation = pairedItemOne;
                            return j;
                        }
                    }
                }
            }
        }

        // If we are looking at the towards case
        if (sentimenPosition.contains("from")) {

            // For every dependecy, find the subject.  If that subject is the Name we are looking for, then we should most likely use it
            for (int j = 0; j < dependArray.size(); j++) {
                if (dependArray.get(j).soloDepend.startsWith("dobj(") || dependArray.get(j).soloDepend.startsWith("pobj(") || dependArray.get(j).soloDepend.startsWith("iobj(")) {

                    // Split the node peice by spaces
                    pairedItemTwo = easyPairedItem(dependArray.get(j).soloDepend, 2);
                    pairedItemOne = easyPairedItem(dependArray.get(j).soloDepend, 1);

                    for (String namePiece : namePieces) {
                        if (pairedItemTwo.toLowerCase().contains(namePiece.toLowerCase())) {
                            calcData.target = pairedItemTwo;
                            calcData.firstRelation = pairedItemOne;
                            return j;
                        }
                    }
                }
            }

            // If we still didnt' find a target during the from case, see if the query name is posessing something instead of simply being a subject
            if (!pairedItemTwo.contentEquals("")) {
                for (String namePiece : namePieces) {
                    for (int j = 0; j < dependArray.size(); j++) {
                        if (dependArray.get(j).soloDepend.startsWith("poss(") && dependArray.get(j).soloDepend.toLowerCase().contains(namePiece.toLowerCase())) {
                            calcData.target = easyPairedItem(dependArray.get(j).soloDepend, 2);
                            calcData.relation = easyPairedItem(dependArray.get(j).soloDepend, 1);
                            return j;
                        }
                    }
                }
            }
        }
        return -1;
    }

    private void findObjectTowards(int currLocation, ArrayList<SentenceInfo> dependArrayList, CalculusInfo calcData, String typedTree,
            ArrayList<String> exemptWords) throws InterruptedException, IOException, ParserConfigurationException, SQLException {

        String tempObj;            // A string to hold the string that may turn out to be the object
        String tempRel = "";       // A possible relation update

        while (currLocation < dependArrayList.size()) {

            //  System.out.println(dependArrayList.get(currLocation).soloDepend);
            if (dependArrayList.get(currLocation).soloDepend.startsWith("dobj(") || dependArrayList.get(currLocation).soloDepend.startsWith("pobj(") || dependArrayList.get(currLocation).soloDepend.startsWith("iobj(")) {

                tempObj = easyPairedItem(dependArrayList.get(currLocation).soloDepend, 2);
                tempRel = easyPairedItem(dependArrayList.get(currLocation).soloDepend, 1);

                // See if there is an annotation for the currently loaded temporary object.  If so, set calcData.x has it, else, see if we can modify
                // the temporary object by adding nouns.
                tempObj = nounCompoundModifier(dependArrayList, tempObj);

                ArrayList<String> namePieces = new ArrayList(); // An arrayList that will store the vital peices of the name
                String nameSplit[] = tempObj.split(" ");   // A String array that holds parts of the name split form spaces

                // Delete words like "of" "the"
                for (String nameSplit1 : nameSplit) {
                    if (!nameSplit1.trim().toLowerCase().contentEquals("of") && !nameSplit1.trim().toLowerCase().contentEquals("and") && !nameSplit1.trim().toLowerCase().contentEquals("the") && !nameSplit1.trim().toLowerCase().contentEquals("for")) {
                        namePieces.add(nameSplit1);
                    }
                    for (String namePiece : namePieces) {
                        if (Character.isUpperCase(namePiece.charAt(0)) && !exemptWords.contains(clearEndingNumbers(namePiece.toLowerCase()))) {
                            calcData.x = tempObj;
                            return;
                        }
                        // REJECT CODE FOR DEALING WITH HAS as an OBJ (Query 110)
//                        if (Character.isUpperCase(namePiece.charAt(0))) {
//                            if (!exemptWords.contains(clearEndingNumbers(namePiece.toLowerCase()))) {
//                                calcData.x = tempObj;
//                                return;
//                            }
//                        } else if (dependArrayList.get(currLocation).soloDepend.contains("has") || dependArrayList.get(currLocation).soloDepend.contains("had")
//                                || dependArrayList.get(currLocation).soloDepend.contains("have")) {
//                            calcData.relation = tempObj;
//                        }
                    }
                }
            }
            currLocation++;
        }
    }

    private void findSubjectFrom(int currLocation, ArrayList<SentenceInfo> dependArrayList, CalculusInfo calcData, String typedTree,
            ArrayList<String> exemptWords) throws InterruptedException, IOException, ParserConfigurationException {

        String tempSubj;           // A string to hold the string that may turn out to be the object
        String tempRel;            // Holds the string that is connected to the temporary subj

        while (currLocation >= 0) {
            if (dependArrayList.get(currLocation).soloDepend.startsWith("nsubj(") || dependArrayList.get(currLocation).soloDepend.startsWith("nsubjpass(")) {

                tempSubj = easyPairedItem(dependArrayList.get(currLocation).soloDepend, 2);
                tempRel = easyPairedItem(dependArrayList.get(currLocation).soloDepend, 1);

                // See if there is an annotation for the currently loaded temporary object.  If so, set calcData.x has it, else, see if we can modify
                // the temporary object by adding nouns.
                tempSubj = nounCompoundModifier(dependArrayList, tempSubj);
                if (Character.isUpperCase(tempSubj.charAt(0)) && !exemptWords.contains(clearEndingNumbers(tempSubj.toLowerCase()))) {
                    calcData.x = tempSubj;
                    calcData.relation = tempRel;
                    return;
                }
            }
            currLocation--;
        }
    }

    // Used only if the answer is a preposition
    private void checkForSays(ArrayList<SentenceInfo> dependArrayList, CalculusInfo calcData) {

        boolean present = false;
        String pairedItem = "";

        for (SentenceInfo dependArrayList1 : dependArrayList) {
            // Find the item paired with ROOT and then find it's subject, then reset the counter to trace through the dependencies
            if (present == false && dependArrayList1.soloDepend.startsWith("root") && dependArrayList1.soloDepend.contains("ROOT-0")) {
                pairedItem = easyPairedItem(dependArrayList1.soloDepend, 2);
                if (pairedItem.toLowerCase().contains("said") || pairedItem.toLowerCase().contains("says")) {
                    present = true;
                }
            }
            // Replace the old X value with the new X value if it is
            if (present == true && (dependArrayList1.soloDepend.startsWith("nsubj") || dependArrayList1.soloDepend.startsWith("nsubjpass(")) && dependArrayList1.soloDepend.contains(pairedItem)) {
                calcData.x = easyPairedItem(dependArrayList1.soloDepend, 2);
            }
        }
    }

    // If we have a relation as "has" then that is unacceptable and need to dig deeper for the true relation
    private void checkForHave(ArrayList<SentenceInfo> dependArrayList, CalculusInfo calcData, String slot) {

        boolean findKey = false;
        // Go through the dependency list and see if something like "has" is part of the sentence
        if (clearEndingNumbers(calcData.relation).toLowerCase().contentEquals("have") || clearEndingNumbers(calcData.relation).toLowerCase().contentEquals("has")) {
            String newRel = "";

            for (SentenceInfo dependArrayList1 : dependArrayList) {
                if (findKey == false && dependArrayList1.soloDepend.startsWith("advcl(") && dependArrayList1.soloDepend.contains(calcData.relation)) {
                    calcData.relation = easyPairedItem(dependArrayList1.soloDepend, 2);
                    return;
                }
            }

            for (int j = 0; j < dependArrayList.size(); j++) {

                // Find the item paired with ROOT and then find it's subject, then reset the counter to trace through the dependencies
                if (findKey == false && (dependArrayList.get(j).soloDepend.startsWith("xcomp(") || dependArrayList.get(j).soloDepend.startsWith("ccomp(")) && dependArrayList.get(j).soloDepend.contains(calcData.relation)) {
                    newRel = easyPairedItem(dependArrayList.get(j).soloDepend, 2);
                    findKey = true;
                    j = 0;
                }
                if (findKey) {
                    if (slot.contains("towards")) {
                        if (dependArrayList.get(j).soloDepend.startsWith("dobj(") || dependArrayList.get(j).soloDepend.startsWith("pobj(") || dependArrayList.get(j).soloDepend.startsWith("iobj(")
                                && dependArrayList.get(j).soloDepend.contains(newRel)) {

                            System.out.println(calcData.relation + " -> " + newRel);

                            calcData.relation = newRel;
                            calcData.x = easyPairedItem(dependArrayList.get(j).soloDepend, 2);
                            return;
                        }
                    } else {
                        if (dependArrayList.get(j).soloDepend.startsWith("nsubj(") || dependArrayList.get(j).soloDepend.startsWith("nsubjpass(")
                                && dependArrayList.get(j).soloDepend.contains(newRel)) {

                            System.out.println(calcData.relation + " -> " + newRel);

                            calcData.relation = newRel;
                            calcData.x = easyPairedItem(dependArrayList.get(j).soloDepend, 2);
                            return;
                        }
                    }
                }
            }
        }
    }

    // Finds the word linked to says or tells or calls
    private void checkForExtension(ArrayList<SentenceInfo> dependArrayList, CalculusInfo calcData) {
        if (!calcData.relation.contentEquals("")) {
            for (SentenceInfo dependArrayList1 : dependArrayList) {
                if (dependArrayList1.soloDepend.startsWith("xcomp") && dependArrayList1.soloDepend.contains(calcData.relation)) {
                    if (dependArrayList1.soloDepend.contains("calls") || dependArrayList1.soloDepend.contains("called")
                            || dependArrayList1.soloDepend.contains("says") || dependArrayList1.soloDepend.contains("said") || dependArrayList1.soloDepend.contains("told")
                            || dependArrayList1.soloDepend.contains("tells") || dependArrayList1.soloDepend.contains("wrote")
                            || dependArrayList1.soloDepend.contains("written") || dependArrayList1.soloDepend.contains("saying")) {
                    } else {
                        System.out.println("NEW RELATION:\t" + easyPairedItem(dependArrayList1.soloDepend, 2));
                        calcData.relation = easyPairedItem(dependArrayList1.soloDepend, 2);
                    }
                }
            }
        }
    }

    // Decides whether we are negating an answer or not
    private void checkForNegate(ArrayList<SentenceInfo> dependArrayList, CalculusInfo calcData) {

        if (!calcData.relation.contentEquals("")) {
            for (SentenceInfo dependArrayList1 : dependArrayList) {
                if (dependArrayList1.soloDepend.startsWith("neg") && dependArrayList1.soloDepend.contains(clearEndingNumbers(calcData.relation))) {
                    calcData.negate = true;
                    return;
                }
            }
        }
    }

    private void checkForJoined(ArrayList<SentenceInfo> dependArrayList, CalculusInfo calcData, String typedTree) {

        int startPoint = -1;
        String currWord;

        if (calcData.relation.toLowerCase().contains("joined")) {
            if (calcData.foundLine.toLowerCase().contains("joined in")) {
                for (int j = 0; j < dependArrayList.size(); j++) {
                    if (easyPairedItem(dependArrayList.get(j).soloDepend, 2).contains(calcData.relation)) {
                        startPoint = j;
                        j = dependArrayList.size();
                    }
                }

                while (startPoint + 1 < dependArrayList.size()) {
                    currWord = clearEndingNumbers(easyPairedItem(dependArrayList.get(startPoint).soloDepend, 2));
                    if (isVerb(currWord, typedTree)) {
                        calcData.relation = currWord;
                        return;
                    }
                    startPoint++;
                }
            }
        }
    }

    private String checkForPoss(ArrayList<SentenceInfo> dependArrayList, String x) {

        // Go through the dependency list and see if possession is present
        for (SentenceInfo dependArrayList1 : dependArrayList) {
            if (dependArrayList1.soloDepend.startsWith("poss(") && dependArrayList1.soloDepend.contains(x)) {
                return easyPairedItem(dependArrayList1.soloDepend, 2);
            }
        }
        return x;
    }

    private void printCalcData(String object, double relationSentiment, OpenANEW openANEWDatabase, Wordnet wordnet, CalculusInfo calcData,
            String slot, String currLine, String typedTree, ArrayList<SentenceInfo> dependArrayList, ArrayList<String> exemptWords) throws SQLException {

        // Dont' do anything if any of the three main factors (relation, target, and x) are empty
        if (!calcData.relation.contentEquals("") && !calcData.target.contentEquals("") && !calcData.x.contentEquals("")) {

            // Search the ANEWdatabase for the score of the found relation
            relationSentiment = openANEWDatabase.wordSentimentOf((wordnet.getBaseForm(clearEndingNumbers(calcData.relation), "verb")));
            if (relationSentiment == -1) {
                relationSentiment = openANEWDatabase.wordSentimentOf((wordnet.getBaseForm(clearEndingNumbers(calcData.relation), "noun")));
            }

            if (isPrep(calcData.x, typedTree)) {
                checkForSays(dependArrayList, calcData);
            }

            // Determine whether we should get rid of some of our data
            if (isDataBad(calcData, typedTree, exemptWords)) {
                calcData.x = "";
                calcData.relation = "";
                System.out.println(object + "\t|\t" + slot + "\t|\tN/A");
                return;
            }

            // Adjust the sentiment value if we have negated the relation
            if (calcData.negate && relationSentiment != -1) {
                if (relationSentiment > 5) {
                    relationSentiment = relationSentiment - 5;
                } else {
                    relationSentiment = relationSentiment + 5;
                }
            }

            calcData.x = clearEndingNumbers(calcData.x);
            calcData.sentiment = relationSentiment;

            System.out.println("\n" + "~ Update II ~");
            System.out.println(calcData.foundLine);
            System.out.println("Query Name:\t" + calcData.target);
            System.out.println("Relation:\t" + calcData.relation + " = " + relationSentiment);
            System.out.println("Found Answer:\t" + calcData.x);

            if (slot.contains("pos") && relationSentiment > 5.0) {
                System.out.println("--------------------------------------------------------");
                System.out.println(object + "\t|\t" + slot + "\t|\t" + calcData.x);
                System.out.println("--------------------------------------------------------");
            }
            if (slot.contains("neg") && relationSentiment <= 5.0) {
                System.out.println("--------------------------------------------------------");
                System.out.println(object + "\t|\t" + slot + "\t|\t" + calcData.x);
                System.out.println("--------------------------------------------------------");

            }

        } else {
            System.out.println(object + "\t|\t" + slot + "\t|\tN/A");
        }
    }

    private String clearEndingNumbers(String item) {

        int startIndex;             // Start of number
        int endIndex;               // End of number

        // Calculate the start and end Indexes
        String cleanData = item;
        startIndex = cleanData.lastIndexOf("-");
        endIndex = cleanData.length();
        try {

            // Replace the numbers with nothing and return the new item
            cleanData = cleanData.replace(cleanData.substring(startIndex, endIndex), "");

        } catch (Exception ex) {

        }
        return cleanData;

    }

    private boolean isNoun(String item, String tree) {

        int foundIndex = tree.indexOf(item);

        // Check to see if a character is an N, meaning we found a noun
        while (tree.charAt(foundIndex - 1) != '(') {
            if (tree.charAt(foundIndex - 1) == 'N') {
                return true;
            }
            foundIndex = foundIndex - 1;
        }
        return false;
    }

    private boolean isVerb(String item, String tree) {

        int foundIndex = tree.indexOf(item);

        try {
            // Check to see if a character is an "ing" verb
            if (tree.charAt(foundIndex - 2) == 'G' && tree.charAt(foundIndex - 3) == 'B' && tree.charAt(foundIndex - 4) == 'V') {
                return true;
            }
        } catch (Exception ex) {

        }
        return false;
    }

    private String nounCompoundModifier(ArrayList<SentenceInfo> dependArrayList, String entity) {

        String compoundNoun = "";
        String pairedItem;

        // Go through the dependency list and see if "nn" is a prefix for any of the items
        for (SentenceInfo dependArrayList1 : dependArrayList) {
            try {
                // Find the item paired with the X value is a compound noun, then attach it to the entire name
                if (dependArrayList1.soloDepend.startsWith("nn(") && dependArrayList1.soloDepend.contains(entity)) {
                    pairedItem = easyPairedItem(dependArrayList1.soloDepend, 2);
                    if (entity.contentEquals(clearEndingNumbers(pairedItem))) {
                        return "";
                    }
                    pairedItem = clearEndingNumbers(pairedItem);
                    compoundNoun = compoundNoun.concat(pairedItem + " ");
                }
            } catch (Exception ex) {
                System.out.flush();
                //System.out.println(dependArrayList.get(j).soloDepend);
                System.exit(1);

                System.err.println("Error executing query");
            }
        }
        compoundNoun = compoundNoun.concat(entity);
        entity = compoundNoun.trim();

        return entity;
    }

    private boolean isProperNoun(String x, String typedTree) {

        // Find the starting point of the X string in the typed tree
        int xIndex = typedTree.indexOf(clearEndingNumbers(x));

        // If the string "NNP" is assoctiated with it, then that means it's a proper nound and should stay how it is
        return typedTree.charAt(xIndex - 4) == 'N' && typedTree.charAt(xIndex - 3) == 'N' && typedTree.charAt(xIndex - 2) == 'P';
    }

    private boolean isPrep(String x, String typedTree) {

        // Find the starting point of the X string in the typed tree
        int xIndex = typedTree.indexOf(clearEndingNumbers(x));

        // If the string "PRP" is assoctiated with it, then that means it's a proper nound and should stay how it is
        return xIndex != -1 && typedTree.charAt(xIndex - 4) == 'P' && typedTree.charAt(xIndex - 3) == 'R' && typedTree.charAt(xIndex - 2) == 'P';
    }

    // A function to find the abbreviation of a said name
    private String getAbbreviation(String name) {

        ArrayList<String> namePieces = new ArrayList();     // An arrayList that will store the vital peices of the name
        String nameSplit[] = name.split(" ");               // A String array that holds parts of the name split form spaces
        String newName = "";                                // A temporary string thath is used to check if a subset of a name was already found

        // Delete words like "of" "the"
        for (String nameSplit1 : nameSplit) {
            if (nameSplit1.trim().toLowerCase().contentEquals("of") || nameSplit1.trim().toLowerCase().contentEquals("and")
                    || nameSplit1.trim().toLowerCase().contentEquals("the") || nameSplit1.trim().toLowerCase().contentEquals("for")) {
            } else {
                namePieces.add(nameSplit1);
            }
        }

        // Get the first letter of everyword in the namepieces
        for (String namePiece : namePieces) {
            newName = newName.concat(namePiece.substring(0, 1));
        }
        return newName;
    }

    private String easyPairedItem(String soloDepend, int piece) {

        String[] pairedItemArray;
        String pairedItem;

        pairedItem = soloDepend;
        pairedItem = pairedItem.replaceAll("\\(", " ");
        pairedItem = pairedItem.replaceAll("\\)", "");
        pairedItem = pairedItem.replaceAll(",", "");
        pairedItemArray = pairedItem.split(" ");

        return pairedItemArray[piece];

    }

    private void saysRelation(ArrayList<SentenceInfo> dependArrayList, CalculusInfo calcData, ArrayList<String> exemptWords) throws InterruptedException, IOException, ParserConfigurationException {

        String pairedRelation = "";
        String pairedX;
        boolean fetch = false;

        // Go through the entire dependency list
        for (int j = 0; j < dependArrayList.size(); j++) {

            // If we find an instance of ccomp, then get its paired relation 
            if (fetch == false && dependArrayList.get(j).soloDepend.startsWith("ccomp(")) {
                pairedRelation = easyPairedItem(dependArrayList.get(j).soloDepend, 2);
                fetch = true;
                j = 0;

            }

            // Now that we know the relation, we can connect it to an object or a subject
            if (fetch && dependArrayList.get(j).soloDepend.contains(pairedRelation) && ((dependArrayList.get(j).soloDepend.startsWith("nsubj(")
                    || dependArrayList.get(j).soloDepend.startsWith("nsubjpass(")) || dependArrayList.get(j).soloDepend.startsWith("dobj(")
                    || dependArrayList.get(j).soloDepend.startsWith("pobj(") || dependArrayList.get(j).soloDepend.startsWith("iobj("))) {
                pairedX = easyPairedItem(dependArrayList.get(j).soloDepend, 2);

                if (!clearEndingNumbers(pairedX).toLowerCase().contentEquals("i") && !clearEndingNumbers(pairedX).toLowerCase().contentEquals("we")) {
                    pairedX = checkForPoss(dependArrayList, pairedX);

                    if (Character.isUpperCase(pairedX.charAt(0)) && !exemptWords.contains(clearEndingNumbers(pairedX.toLowerCase()))) {
                        calcData.x = pairedX;
                        calcData.relation = pairedRelation;
                    }
                    return;
                }
            }
        }
    }

    private boolean hasOrg(String sentence) {
        return sentence.contains("</ORGANIZATION>");
    }

    private boolean isDataBad(CalculusInfo calcData, String typedTree, ArrayList<String> exemptWords) {
        return isPrep(calcData.x, typedTree) || clearEndingNumbers(calcData.x).toLowerCase().contentEquals("i")
                || exemptWords.contains(clearEndingNumbers(calcData.x).toLowerCase())
                || clearEndingNumbers(calcData.x).contentEquals(clearEndingNumbers(calcData.target))
                || clearEndingNumbers(calcData.relation).contentEquals("is") || clearEndingNumbers(calcData.relation).contentEquals("do")
                || calcData.relation.contains("says") || calcData.relation.contains("said") || calcData.relation.contains("told")
                || calcData.relation.contains("tells") || calcData.relation.contains("wrote") || calcData.relation.contains("written")
                || calcData.relation.contains("calls") || calcData.relation.contains("called");
    }

    private boolean isSaid(String relation) {

        return relation.contains("says") || relation.contains("said") || relation.contains("told")
                || relation.contains("tells") || relation.contains("wrote") || relation.contains("written")
                || relation.contains("calls") || relation.contains("called");
    }

    private void printUpdate(CalculusInfo calcData, String updateNum) {

        System.out.println("~ Update "+ updateNum+" ~");
        System.out.println(calcData.foundLine);
        System.out.println("Query Name:\t" + calcData.target);
        System.out.println("Relation:\t" + calcData.relation);
        System.out.println("Found Answer:\t" + calcData.x);

    }

    private ArrayList<String> createExemptWords() {
        ArrayList<String> exemptWords = new ArrayList();
        exemptWords.add("monday");
        exemptWords.add("tuesday");
        exemptWords.add("wednesday");
        exemptWords.add("thursday");
        exemptWords.add("friday");
        exemptWords.add("saturday");
        exemptWords.add("sunday");
        exemptWords.add("january");
        exemptWords.add("february");
        exemptWords.add("march");
        exemptWords.add("april");
        exemptWords.add("may");
        exemptWords.add("june");
        exemptWords.add("july");
        exemptWords.add("august");
        exemptWords.add("september");
        exemptWords.add("october");
        exemptWords.add("november");
        exemptWords.add("december");
        exemptWords.add("tonight");
        exemptWords.add("tomorrow");
        exemptWords.add("yesterday");
        exemptWords.add("country");

        return exemptWords;

    }

    public static void main(String argOne, String argTwo, String argThree) throws SQLException, InterruptedException, IOException, ParserConfigurationException {

        LoadSentence setUp = new LoadSentence();

        // USAGE
        // setUp.setUpSentence ([Name of Object you want to find Sentiment towards or from], [neg-towards, neg-from, pos-from, pos-towards], [The single sentence we are examining])
        setUp.setUpSentence(argOne, argTwo, argThree);
    }
}
