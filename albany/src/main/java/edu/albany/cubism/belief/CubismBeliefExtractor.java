package edu.albany.cubism.belief;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//import us.albany.cubism.sentiment.*;
import adept.common.Document;
import edu.albany.cubism.relation.Graph;
import edu.albany.cubism.relation.Node;
import java.io.File;
import edu.albany.cubism.sentiment.LoadQuerys.LoadedQuery;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;
import edu.albany.cubism.relation.Utterance;
import edu.albany.cubism.sentiment.LoadQuerys;
import edu.albany.cubism.sentiment.ManageOutput;
import edu.albany.cubism.sentiment.StanfordParser;
import edu.albany.cubism.sentiment.StoreDocumentsAssessments;
import edu.albany.cubism.sentiment.readAnnotation;
import edu.albany.cubism.util.BeliefXML;
import edu.albany.cubism.util.Settings;
import edu.albany.cubism.util.Tools;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 *
 * @author Ting Liu
 */
public class CubismBeliefExtractor {

    StanfordParser sp = new StanfordParser();

    public ArrayList<ForumDependencies.CalculusInfo> extractBelief(org.w3c.dom.Document xmldoc) throws IOException, InterruptedException, ParserConfigurationException, SQLException, SAXException {

//        ///////////////////// OLD ORDER //////////////////
//        // Create an Array List of the XML file and then use that to
//        // Decide which source files to extract and save
        ArrayList beliefs = new ArrayList();
        LoadQuerys cds = new LoadQuerys();
        LoadedQuery lq = cds.initialize(xmldoc);

        File dir = new File(Settings.getValue("kbp_data_path") + "/newswire_output");
        for (File file : dir.listFiles()) {
            file.delete();
        }
        dir = new File(Settings.getValue("kbp_data_path") + "/newswire_sentences");
        for (File file : dir.listFiles()) {
            file.delete();
        }
//        System.out.println("assessed data: " + lq.toStringDocs());
//
//        // Go through all the assessment files and print out the data to the .txt file - THIS WORKS NOW!
        HashMap<String, String> assessDocsFullHash = new HashMap();
        StoreDocumentsAssessments getSentences = new StoreDocumentsAssessments(); //read assessment file
//
//        //Save entire documents
        assessDocsFullHash = getSentences.searchArrayList(lq.docArrayList, lq.queryArrayList);
        System.out.println("SIZE:\t" + assessDocsFullHash.size());
        ArrayList<Utterance> utts = new ArrayList();
//
//        // new ConvertForumOutputXML().openTestDocs(assessDocsFullHash);
//        new CleanXML().cleanXMl();
//
        // Get dependency data for the Newswire dependencie
        beliefs.addAll(new NewsArticlePrep().extractBelief(lq.queryArrayList, assessDocsFullHash, utts));

//        new TestOutput().initalize();
//
        new ManageOutput().gatherOutput();
        return beliefs;

        // The isolated version of the original program
//     LoadSentence.main("", "pos-towards", "Marge	loves	Homer.");
        ///////////////////////////////////////////
        ///////// NEW ORDER //////////////////////
        //////////////////////////////////////////
        // Create an Array List of the XML file and then use that to
        // Decide which source files to extract and save
        //     ArrayList<StoreQuery.QueryInput> queryArrayList = new ArrayList();
        //     queryArrayList = createXMLArray();
        // Open and extract all the necessary assessments files from the source corpus identified by the array list queryArrayList- THIS WORKS!
        // OpenSourceCorpus openSC = new OpenSourceCorpus();
        //openSC.loadSourceCorpus(queryArrayList);
        // Go through the saved documents and store the required passages
        //  HashMap<String, String> docsFullHash = new HashMap();       // A HashMap to store the documents necessary
        //   StoreDocuments storeDocs = new StoreDocuments();
        //   docsFullHash = storeDocs.searchArrayList(queryArrayList);
        // Convert the forum output data into XML files and clean them extraneous text as well
        //new ConvertForumOutputXML().openTestDocs(docsFullHash);
        //new CleanXML().cleanXMl();
        //new ForumOutput().initialize(docsFullHash, queryArrayList);
        // Get dependency data for the Newswire dependencies
        //  new NewswireDependencies().getNewsSentenceFile(queryArrayList, new NewswireParse().openOutputText(queryArrayList), docsFullHash);
        // Create the HashMap for the Annotation file
        // createAnnotationMap();
        //    new ManageOutput().gatherOutput();
        //      new ModifyAnswer().initialize();
    }

    public ArrayList<Node> extractBelief(ArrayList<Utterance> utts) {
        int sp_counts = 0;
        ArrayList<Node> beliefs = new ArrayList();
        for (Utterance utt : utts) {
            String cutSentence = utt.getContent();
            Graph sent_graph = new Graph();
            sp.buildDependcyGraph(cutSentence, sent_graph);
//            System.out.println("Current Sentence:\t" + cutSentence);
            sent_graph.setSentence(cutSentence);
            sent_graph.setStartx(utt.getStartx());
            sent_graph.setEndx(utt.getEndx());
            sent_graph.setNodesOffset();
            ArrayList<Node> rels = sent_graph.getSubHeads();
            beliefs.addAll(rels);
            /*
            for (Node node: rels) {
                
            }
                    */
            sp_counts++;
            if (sp_counts == 300) {
                sp_counts = 0;
                sp = new StanfordParser();
            }
        }
        return beliefs;
    }
    
    public ArrayList<Node> extractBelief(ArrayList<File> fileList, String out_path) throws IOException, InterruptedException, ParserConfigurationException, SQLException, SAXException {

//        ///////////////////// OLD ORDER //////////////////
//        // Create an Array List of the XML file and then use that to
//        // Decide which source files to extract and save
        ArrayList<Node> beliefs = new ArrayList();
        for (File file : fileList) {
            if (!file.getAbsolutePath().endsWith("txt")) {
                continue;
            }
            ArrayList<Utterance> utts = new ArrayList();
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF8"));
            StringBuffer doc = new StringBuffer();
            StringBuffer ori_doc = new StringBuffer();
            int startx = 0;
            Tools.getPostInfoforBelief(br, null, doc, startx, utts, ori_doc);
            beliefs.addAll(extractBelief(utts));
            BeliefXML.createBeliefXMLFile(beliefs, file.getName().replace(".txt", ""), out_path);
            beliefs.clear();
        }

//        new TestOutput().initalize();
//
        new ManageOutput().gatherOutput();
        return beliefs;

    }

    public ArrayList<Node> extractBelief(Document fileList, String out_path) throws IOException, InterruptedException, ParserConfigurationException, SQLException, SAXException {

//        ///////////////////// OLD ORDER //////////////////
//        // Create an Array List of the XML file and then use that to
//        // Decide which source files to extract and save
        ArrayList<Node> beliefs = new ArrayList();
        BufferedReader listbr = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(fileList.getDefaultTokenStream().getTextValue().getBytes())));
        String aLine = null;
        System.out.println("fileList path: " + fileList.getSourceUri());
        String workingPath = System.getProperty("user.dir");
        String inputPath = workingPath+"/src/test/resources/us/ihmc/cubism/sociolinguistics/input.benchmark/";
        if (workingPath.contains("test-classes")) {
            inputPath = workingPath+"/us/ihmc/cubism/sociolinguistics/input.benchmark/";
        }
        out_path = inputPath+"LDC2014E125_DEFT_Committed_Belief_Annotation_Self-Evaluation_Package/data/sys_out/";
        while ((aLine = listbr.readLine())!= null) {
            System.out.println("aLine: " + aLine);
            ArrayList<Utterance> utts = new ArrayList();
            BufferedReader filebr;
            File file = new File(inputPath+aLine);
            filebr = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF8"));
            StringBuffer doc = new StringBuffer();
            StringBuffer ori_doc = new StringBuffer();
            int startx = 0;
            Tools.getPostInfoforBelief(filebr, null, doc, startx, utts, ori_doc);
            beliefs.addAll(extractBelief(utts));
            BeliefXML.createBeliefXMLFile(beliefs, file.getName().replace(".txt", ""), out_path);
            beliefs.clear();
        }

//        new TestOutput().initalize();
//
        new ManageOutput().gatherOutput();
        return beliefs;

    }

    public ArrayList<Node> extractBeliefs(Document fileList, String out_path) throws IOException, InterruptedException, ParserConfigurationException, SQLException, SAXException {

//        ///////////////////// OLD ORDER //////////////////
//        // Create an Array List of the XML file and then use that to
//        // Decide which source files to extract and save
        ArrayList<Node> beliefs = new ArrayList();
        BufferedReader filebr = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(fileList.getDefaultTokenStream().getTextValue().getBytes())));
        String aLine = null;
        System.out.println("fileList path: " + fileList.getUri());
        String fileuri = fileList.getUri();
        String name = fileuri.substring(fileuri.lastIndexOf("/")+1);
        System.out.println("name: " + name);
        String workingPath = System.getProperty("user.dir");
        String inputPath = workingPath+"/src/test/resources/us/ihmc/cubism/sociolinguistics/input.benchmark/";
        if (workingPath.contains("test-classes")) {
            inputPath = workingPath+"/us/ihmc/cubism/sociolinguistics/input.benchmark/";
        }
        out_path = inputPath+"LDC2014E125_DEFT_Committed_Belief_Annotation_Self-Evaluation_Package/data/sys_out/";
//        while ((aLine = listbr.readLine())!= null) {
//            System.out.println("aLine: " + aLine);
            ArrayList<Utterance> utts = new ArrayList();
//            BufferedReader filebr;
//            File file = new File(inputPath+aLine);
            filebr = new BufferedReader(new InputStreamReader(new FileInputStream(fileuri), "UTF8"));
            StringBuffer doc = new StringBuffer();
            StringBuffer ori_doc = new StringBuffer();
            int startx = 0;
            Tools.getPostInfoforBelief(filebr, null, doc, startx, utts, ori_doc);
            beliefs.addAll(extractBelief(utts));
            BeliefXML.createBeliefXMLFile(beliefs, name.replace(".txt", ""), out_path);
//            beliefs.clear();
//        }

//        new TestOutput().initalize();
//
//        new ManageOutput().gatherOutput();
        return beliefs;

    }

    public static void main(String[] args) {
        String file_folder = "/Users/ting/Documents/DEFT/belief/data/LDC2014E125_DEFT_Committed_Belief_Annotation_Self-Evaluation_Package/data/source/";
        String out_folder = "/Users/ting/Documents/DEFT/belief/data/LDC2014E125_DEFT_Committed_Belief_Annotation_Self-Evaluation_Package/data/sys_out/";
        ArrayList<File> fls = new ArrayList(Arrays.asList((new File(file_folder)).listFiles()));
        CubismBeliefExtractor cbe = new CubismBeliefExtractor();
        try {
            cbe.extractBelief(fls, out_folder);
        } catch (IOException ex) {
            Logger.getLogger(CubismBeliefExtractor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(CubismBeliefExtractor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(CubismBeliefExtractor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CubismBeliefExtractor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SAXException ex) {
            Logger.getLogger(CubismBeliefExtractor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    /*
    public static void main(String[] args) throws IOException, InterruptedException, ParserConfigurationException, SQLException, SAXException {

//        ///////////////////// OLD ORDER //////////////////
//        // Create an Array List of the XML file and then use that to
//        // Decide which source files to extract and save
        LoadQuerys cds = new LoadQuerys();
        LoadedQuery lq = cds.initialize();

        File dir = new File(Settings.getValue("kbp_data_path") + "/newswire_output");
        for (File file : dir.listFiles()) {
            file.delete();
        }
        dir = new File(Settings.getValue("kbp_data_path") + "/newswire_sentences");
        for (File file : dir.listFiles()) {
            file.delete();
        }
//        System.out.println("assessed data: " + lq.toStringDocs());
//
//        // Go through all the assessment files and print out the data to the .txt file - THIS WORKS NOW!
        HashMap<String, String> assessDocsFullHash = new HashMap();
        StoreDocumentsAssessments getSentences = new StoreDocumentsAssessments(); //read assessment file
//
//        //Save entire documents
        assessDocsFullHash = getSentences.searchArrayList(lq.docArrayList, lq.queryArrayList);
        System.out.println("SIZE:\t" + assessDocsFullHash.size());
        ArrayList<Utterance> utts = new ArrayList();
//
//        // new ConvertForumOutputXML().openTestDocs(assessDocsFullHash);
//        new CleanXML().cleanXMl();
//
        // Get dependency data for the Newswire dependencie
        NewsArticlePrep.main(lq.queryArrayList, assessDocsFullHash, utts);

//        new TestOutput().initalize();
//
        new ManageOutput().gatherOutput();

        // The isolated version of the original program
//     LoadSentence.main("", "pos-towards", "Marge	loves	Homer.");
        ///////////////////////////////////////////
        ///////// NEW ORDER //////////////////////
        //////////////////////////////////////////
        // Create an Array List of the XML file and then use that to
        // Decide which source files to extract and save
        //     ArrayList<StoreQuery.QueryInput> queryArrayList = new ArrayList();
        //     queryArrayList = createXMLArray();
        // Open and extract all the necessary assessments files from the source corpus identified by the array list queryArrayList- THIS WORKS!
        // OpenSourceCorpus openSC = new OpenSourceCorpus();
        //openSC.loadSourceCorpus(queryArrayList);
        // Go through the saved documents and store the required passages
        //  HashMap<String, String> docsFullHash = new HashMap();       // A HashMap to store the documents necessary
        //   StoreDocuments storeDocs = new StoreDocuments();
        //   docsFullHash = storeDocs.searchArrayList(queryArrayList);
        // Convert the forum output data into XML files and clean them extraneous text as well
        //new ConvertForumOutputXML().openTestDocs(docsFullHash);
        //new CleanXML().cleanXMl();
        //new ForumOutput().initialize(docsFullHash, queryArrayList);
        // Get dependency data for the Newswire dependencies
        //  new NewswireDependencies().getNewsSentenceFile(queryArrayList, new NewswireParse().openOutputText(queryArrayList), docsFullHash);
        // Create the HashMap for the Annotation file
        // createAnnotationMap();
        //    new ManageOutput().gatherOutput();
        //      new ModifyAnswer().initialize();
    }
*/
    public void createAnnotationMap() {

        // Read through the Annotation file and turn it into a HashMap where
        // the key is the Query id and it's contents are all of its respective
        // columns in the annotation file
        readAnnotation rdAnnote = new readAnnotation();
        try {
            rdAnnote.parseAnnotation();
        } catch (IOException ex) {
            Logger.getLogger(CubismBeliefExtractor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
