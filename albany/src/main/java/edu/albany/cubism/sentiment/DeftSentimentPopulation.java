package edu.albany.cubism.sentiment;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
import edu.albany.cubism.util.Settings;

/**
 *
 * @author Ting Liu
 */
public class DeftSentimentPopulation {
    
    
    public static void sentiment(String[] args) throws IOException, InterruptedException, ParserConfigurationException, SQLException, SAXException {

//        ///////////////////// OLD ORDER //////////////////
//        // Create an Array List of the XML file and then use that to
//        // Decide which source files to extract and save
        LoadQuerys cds = new LoadQuerys();
        LoadedQuery lq = cds.initialize();
        
        File dir=new File(Settings.getValue("kbp_data_path")+"/newswire_output");
        for(File file: dir.listFiles()) 
            file.delete();
        dir=new File(Settings.getValue("kbp_data_path")+"/newswire_sentences");
        for(File file: dir.listFiles()) 
            file.delete();        
//        System.out.println("assessed data: " + lq.toStringDocs());
//
//        // Go through all the assessment files and print out the data to the .txt file - THIS WORKS NOW!
        HashMap<String, String> assessDocsFullHash = new HashMap();
        StoreDocumentsAssessments getSentences = new StoreDocumentsAssessments(); //read assessment file and data file
//
//        //Save entire documents
        assessDocsFullHash = getSentences.searchArrayList(lq.docArrayList, lq.queryArrayList);
        System.out.println("SIZE:\t" +         assessDocsFullHash.size());
        ArrayList<Utterance> utts = new ArrayList();
//
//        // new ConvertForumOutputXML().openTestDocs(assessDocsFullHash);
//        new CleanXML().cleanXMl();
//
        // Get dependency data for the Newswire dependencie
        NewsArticlePrepPopulation.main(lq.queryArrayList, assessDocsFullHash, utts);

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

    public static void main(String[] args) throws IOException, InterruptedException, ParserConfigurationException, SQLException, SAXException {

//        ///////////////////// OLD ORDER //////////////////
//        // Create an Array List of the XML file and then use that to
//        // Decide which source files to extract and save
        LoadQuerys cds = new LoadQuerys();
        LoadedQuery lq = cds.initialize();
        
        File dir=new File(Settings.getValue("kbp_data_path")+"/newswire_output");
        for(File file: dir.listFiles()) 
            file.delete();
        dir=new File(Settings.getValue("kbp_data_path")+"/newswire_sentences");
        for(File file: dir.listFiles()) 
            file.delete();        
//        System.out.println("assessed data: " + lq.toStringDocs());
//
//        // Go through all the assessment files and print out the data to the .txt file - THIS WORKS NOW!
        HashMap<String, String> assessDocsFullHash = new HashMap();
        StoreDocumentsAssessments getSentences = new StoreDocumentsAssessments(); //read assessment file
//
//        //Save entire documents that related to each query to one document
        assessDocsFullHash = getSentences.searchArrayList(lq.docArrayList, lq.queryArrayList);
        System.out.println("SIZE:\t" +         assessDocsFullHash.size());
        ArrayList<Utterance> utts = new ArrayList();
//
//        // new ConvertForumOutputXML().openTestDocs(assessDocsFullHash);
//        new CleanXML().cleanXMl();
//
        // Get dependency data for the Newswire dependencie
        NewsArticlePrepPopulation.main(lq.queryArrayList, assessDocsFullHash, utts);

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

    public void createAnnotationMap() {

        // Read through the Annotation file and turn it into a HashMap where
        // the key is the Query id and it's contents are all of its respective
        // columns in the annotation file
        readAnnotation rdAnnote = new readAnnotation();
        try {
            rdAnnote.parseAnnotation();
        } catch (IOException ex) {
            Logger.getLogger(DeftSentimentPopulation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
