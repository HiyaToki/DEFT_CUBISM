package edu.albany.cubism.sentiment;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//import us.albany.cubism.sentiment.*;
import edu.albany.cubism.belief.*;
import adept.common.Document;
import edu.albany.cubism.ie.BoltDocument;
import edu.albany.cubism.ie.BoltDocumentBuilder;
import edu.albany.cubism.ie.SentimentMention;
import edu.albany.cubism.ie.XmlBuilder;
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
import edu.albany.cubism.util.StanfordChineseParser;
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
public class CubismTargetFocusedSentimentExtractor {

    StanfordParser sp = new StanfordParser();
    String language = Settings.getValue("language");
    StanfordChineseParser spc = null;

    public ArrayList<ForumDependencies.CalculusInfo> extractSentiment(org.w3c.dom.Document xmldoc) throws IOException, InterruptedException, ParserConfigurationException, SQLException, SAXException {

//        ///////////////////// OLD ORDER //////////////////
//        // Create an Array List of the XML file and then use that to
//        // Decide which source files to extract and save
        ArrayList sentiments = new ArrayList();
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
        sentiments.addAll(new NewsArticlePrep().extractSentiment(lq.queryArrayList, assessDocsFullHash, utts));

//        new TestOutput().initalize();
//
        new ManageOutput().gatherOutput();
        return sentiments;

    }

    public ArrayList<Node> extractSentiment(ArrayList<Utterance> utts) {
        int sp_counts = 0;
        ArrayList<Node> sentiments = new ArrayList();
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
            sentiments.addAll(rels);
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
        return sentiments;
    }

    public StringBuffer extractSentiment(ArrayList<File> fileList, String out_path, String ere_path) throws IOException, InterruptedException, ParserConfigurationException, SQLException, SAXException {

//        ///////////////////// OLD ORDER //////////////////
//        // Create an Array List of the XML file and then use that to
//        // Decide which source files to extract and save
        StringBuffer sentiments = new StringBuffer();
        ArrayList<BoltDocument> boltDocs = new ArrayList();
        for (File file : fileList) {
            if (!file.getAbsolutePath().contains("bolt")) {
                continue;
            }
            System.out.println("parsing: " + file.getAbsolutePath());
            boltDocs = BoltDocumentBuilder.parseBoltDocuments(file.getAbsolutePath(), ere_path);
            ForumEnSentimentExtractor fse = new ForumEnSentimentExtractor();
//            fse.findSentiment(boltDocs);
            /*
             ArrayList<Utterance> utts = new ArrayList();
             BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF8"));
             StringBuffer doc = new StringBuffer();
             StringBuffer ori_doc = new StringBuffer();
             int startx = 0;
             Tools.getPostInfoforBelief(br, null, doc, startx, utts, ori_doc);
             BoltDocument boltDoc = new BoltDocument();
             boltDoc.setOriDoc(ori_doc.toString());
             boltDoc.setUtts(utts);
             boltDoc.setUri(file.getAbsolutePath());
             String filename = file.getName();
             String annotatted_path = getAnnotationPath(filename);
             boltDoc.createEntityList(annotatted_path);
             boltDoc.createRelationList(annotatted_path);
             */
//            sentiments.addAll(CubismTargetFocusedSentimentExtractor.this.extractSentiment(utts));
//            BeliefXML.createBeliefXMLFile(sentiments, file.getName().replace(".txt", ""), out_path);
            sentiments = new StringBuffer();
        }

//        new TestOutput().initalize();
//
//        new ManageOutput().gatherOutput();
        return sentiments;

    }

    public void extractSentimentRichERE(ArrayList<File> fileList, String out_path, String ere_path) throws IOException, InterruptedException, ParserConfigurationException, SQLException, SAXException {

//        ///////////////////// OLD ORDER //////////////////
//        // Create an Array List of the XML file and then use that to
//        // Decide which source files to extract and save
        BoltDocument boltDoc = null;
        XmlBuilder xmlb = new XmlBuilder();
        ArrayList<SentimentMention> all_sents = new ArrayList();        
        for (File file : fileList) {
            if (!file.getAbsolutePath().contains("txt")) {
                continue;
            }
            System.out.println("parsing: " + file.getName().replace(".cmp.txt", ""));
            /*
            if (!file.getName().replace(".cmp.txt", "").equals("0cfdfe102b7a4cb34e1a181c1d36d23d")) {
                continue;
            }
                    */
            boltDoc = BoltDocumentBuilder.parseBoltDocument(file.getAbsolutePath(), file.getName().replace(".cmp.txt", ""), ere_path);
            ForumEnSentimentExtractor fse = new ForumEnSentimentExtractor();
            ArrayList<SentimentMention> sents = new ArrayList();
            fse.findSentiment(boltDoc, sents, ere_path);
            System.out.println("sents size: " + sents.size());
            this.printSentiments(sents);
            all_sents.addAll(sents);
            xmlb.buildXml(sents, out_path+"/"+file.getName().replace(".cmp.txt", "") + ".best.xml", file.getName());
//            break;
        }
        this.printSentiments(all_sents);
    }
    
    public void printSentiments(ArrayList<SentimentMention> sents) {
        System.out.println("+++++++++++++++++++sentiments++++++++++++++++++++");
        for (SentimentMention sent: sents) {
            if (sent == null) {
                continue;
            }
            System.out.println(sent.toString());
            System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        }
    }

    public StringBuffer extractSentimentRichEREChinese(ArrayList<File> fileList, String out_path, String ere_path) throws IOException, InterruptedException, ParserConfigurationException, SQLException, SAXException {

//        ///////////////////// OLD ORDER //////////////////
//        // Create an Array List of the XML file and then use that to
//        // Decide which source files to extract and save
        StringBuffer sentiments = new StringBuffer();
        BoltDocument boltDoc = null;
        XmlBuilder xmlb = new XmlBuilder();
        ArrayList<SentimentMention> all_sents = new ArrayList();        
        for (File file : fileList) {
            if (!file.getAbsolutePath().contains("txt")) {
                continue;
            }
            System.out.println("parsing: " + file.getName().replace(".cmp.txt", ""));
            boltDoc = BoltDocumentBuilder.parseBoltDocument(file.getAbsolutePath(), file.getName().replace(".cmp.txt", ""), ere_path);
            ForumSentimentExtractorChineseNew fse = new ForumSentimentExtractorChineseNew();
            ArrayList<SentimentMention> sents = new ArrayList();
            fse.findSentiment(boltDoc, sents, ere_path);
            System.out.println("sents size: " + sents.size());
            this.printSentiments(sents);
            all_sents.addAll(sents);
            xmlb.buildXml(sents, out_path+"/"+file.getName().replace(".cmp.txt", "") + ".best.xml", file.getName());
//            ArrayList<SentimentMention> sents = new ArrayList();
//            fse.findSentiment(boltDoc, sents, ere_path);

        }
        return sentiments;

    }

    public String getAnnotationPath(String fileName) {
        String path = null;

        return path;
    }

    public ArrayList<Node> extractSentiment(Document fileList, String out_path) throws IOException, InterruptedException, ParserConfigurationException, SQLException, SAXException {

//        ///////////////////// OLD ORDER //////////////////
//        // Create an Array List of the XML file and then use that to
//        // Decide which source files to extract and save
        ArrayList<Node> sentiments = new ArrayList();
        BufferedReader listbr = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(fileList.getDefaultTokenStream().getTextValue().getBytes())));
        String aLine = null;
        System.out.println("fileList path: " + fileList.getSourceUri());
        String workingPath = System.getProperty("user.dir");
        String inputPath = workingPath + "/src/test/resources/us/ihmc/cubism/sociolinguistics/input.benchmark/";
        if (workingPath.contains("test-classes")) {
            inputPath = workingPath + "/us/ihmc/cubism/sociolinguistics/input.benchmark/";
        }
        out_path = inputPath + "LDC2014E125_DEFT_Committed_Belief_Annotation_Self-Evaluation_Package/data/sys_out/";
        while ((aLine = listbr.readLine()) != null) {
            System.out.println("aLine: " + aLine);
            ArrayList<Utterance> utts = new ArrayList();
            BufferedReader filebr;
            File file = new File(inputPath + aLine);
            filebr = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF8"));
            StringBuffer doc = new StringBuffer();
            StringBuffer ori_doc = new StringBuffer();
            int startx = 0;
            Tools.getPostInfoforBelief(filebr, null, doc, startx, utts, ori_doc);
            sentiments.addAll(CubismTargetFocusedSentimentExtractor.this.extractSentiment(utts));
            BeliefXML.createBeliefXMLFile(sentiments, file.getName().replace(".txt", ""), out_path);
            sentiments.clear();
        }

//        new TestOutput().initalize();
//
        new ManageOutput().gatherOutput();
        return sentiments;

    }

    public static void main(String[] args) {
//        String file_folder = "/Users/ting/Documents/DEFT/belief/data/LDC2014E125_DEFT_Committed_Belief_Annotation_Self-Evaluation_Package/data/source/";
        String file_folder = Settings.getValue("LDCData") + "/source";
        String file_folder_chinese = Settings.getValue("LDCDataChinese") + "/source";
//        String file_folder = "/Users/ting/NetBeansProjects/deft_2.3/albany/src/main/resources/us/albany/cubism/Data/Source_Corpus_Files_Assessment";
        String out_folder = "/Users/ting/NetBeansProjects/deft_2.3/albany/src/main/resources/us/albany/cubism/Data/2014evaluation/LDC2016E27_DEFT_English_Belief_and_Sentiment_Annotation_V2/data/output/";
        String out_folder_chinese = "/Users/ting/NetBeansProjects/deft_2.3/albany/src/main/resources/us/albany/cubism/Data/2014evaluation/LDC2016E28_DEFT_Chinese_Belief_and_Sentiment_Annotation/data/output/";
        ArrayList<File> fls = new ArrayList(Arrays.asList((new File(file_folder)).listFiles()));
        ArrayList<File> fls_chinese = new ArrayList(Arrays.asList((new File(file_folder_chinese)).listFiles()));
        CubismTargetFocusedSentimentExtractor cbe = new CubismTargetFocusedSentimentExtractor();
        String ere_path = Settings.getValue("LDCData") + "/ere/";
        String ere_path_chinese = Settings.getValue("LDCDataChinese") + "/ere/";
        try {
            String lan = cbe.getLanguage();
//            System.out.println("lan: " + lan);
            if (lan.equals("Chinese")) {
                cbe.buildSpc();
                cbe.extractSentimentRichEREChinese(fls_chinese, out_folder_chinese, ere_path_chinese);
            } else {
                cbe.buildSp();
                cbe.extractSentimentRichERE(fls, out_folder, ere_path);
            }
        } catch (IOException ex) {
            Logger.getLogger(CubismTargetFocusedSentimentExtractor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(CubismTargetFocusedSentimentExtractor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(CubismTargetFocusedSentimentExtractor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CubismTargetFocusedSentimentExtractor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SAXException ex) {
            Logger.getLogger(CubismTargetFocusedSentimentExtractor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void createAnnotationMap() {

        // Read through the Annotation file and turn it into a HashMap where
        // the key is the Query id and it's contents are all of its respective
        // columns in the annotation file
        readAnnotation rdAnnote = new readAnnotation();
        try {
            rdAnnote.parseAnnotation();
        } catch (IOException ex) {
            Logger.getLogger(CubismTargetFocusedSentimentExtractor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public StanfordParser getSp() {
        return sp;
    }

    public void setSp(StanfordParser sp) {
        this.sp = sp;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public StanfordChineseParser getSpc() {
        return spc;
    }

    public void setSpc(StanfordChineseParser spc) {
        this.spc = spc;
    }

    public void buildSp() {
        this.sp = new StanfordParser();
    }

    public void buildSpc() {
        this.spc = new StanfordChineseParser();
    }
}
