package edu.albany.cubism.sentiment;

import edu.stanford.nlp.ie.AbstractSequenceClassifier;
import edu.stanford.nlp.ie.crf.CRFClassifier;
import edu.stanford.nlp.ling.CoreLabel;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author John M. Lien
 */
public class GenerateMetaDataXML implements Runnable {

    private final String serializedClassifier = "./src/main/ext/stanford-ner-2014-06-16/classifiers/english.muc.7class.distsim.crf.ser.gz";
    private AbstractSequenceClassifier<CoreLabel> classifier;
    private CustomFileReader read;
    private CustomFileWriter write;
    private String threadName;
    private String searchDir;

    public void searchDirectory(String rootDir, String fileNameMatch, String outputFileName) {
        // Directory path here
        File file;
        File folder = new File(rootDir);
        File[] listOfFiles = folder.listFiles();

        for (File listOfFile : listOfFiles) {
            file = listOfFile;
            if (listOfFile.isFile()) {
                if (file.getName().equals(fileNameMatch)) {
                    System.out.println(((threadName == null) ? "null" : threadName) + "\t" + file.getAbsolutePath());
                    generateXMLFile(file.getAbsolutePath(), rootDir + outputFileName);
                }
            } else {
                if (listOfFile.isDirectory()) {
                    searchDirectory(listOfFile.getAbsolutePath(), fileNameMatch, outputFileName);
                }
            }
        }
    }

    private void generateXMLFile(String input, String output) {
        read.openFile(input);
        write.createFile(output);
        write.println("<?xml version=\"1.0\"?>");
        write.println("<HEAD>");
        while (read.hasNextLine()) {
            write.println("\t<SENTENCE>" + this.classifyWithInlineXML(read.getNextLine()).replaceAll("[\\s+]", " ").replace("&", "and").trim() + "</SENTENCE>");
        }
        write.println("</HEAD>");
        write.closeFile();
    }

    public String[] classifyWithInlineXML(String[] list) {
        String[] newList;
        if (list != null && list.length != 0) {
            newList = new String[list.length];
            for (int i = 0; i < list.length; i++) {
                newList[i] = this.classifyWithInlineXML(list[i]);
            }
            return newList;
        } else {
            return list;
        }
    }

    public ArrayList<String> classifyWithInlineXML(ArrayList<String> list) {
        ArrayList<String> newList;
        if (list != null && !list.isEmpty()) {
            newList = new ArrayList();
            for (String tok : list) {
                newList.add(this.classifyWithInlineXML(tok));
            }
            return newList;
        } else {
            return list;
        }
    }

    public String classifyWithInlineXML(String strLine) {
        return this.classifier.classifyWithInlineXML(strLine);
    }

    public GenerateMetaDataXML() {
        try {
            this.classifier = CRFClassifier.getClassifier(this.getClassifierPath(serializedClassifier));
            this.read = new CustomFileReader();
            this.write = new CustomFileWriter();
        } catch (Exception ex) {
            Logger.getLogger(GenerateMetaDataXML.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public GenerateMetaDataXML(String searchDir, String threadName) {
        try {
            this.classifier = CRFClassifier.getClassifier(this.getClassifierPath(serializedClassifier));
            this.searchDir = searchDir;
            this.threadName = threadName;
            this.read = new CustomFileReader();
            this.write = new CustomFileWriter();
        } catch (Exception ex) {
            Logger.getLogger(GenerateMetaDataXML.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String getClassifierPath(String path) {
        String curr_path = System.getProperty("user.dir");
        String cl_path = null;
//                    System.out.println("curr_path(in parseSettingsLine of Settings): " + curr_path);
        if (curr_path.endsWith("test-classes/") ||
                curr_path.endsWith("test-classes")) {
            cl_path = curr_path + "/../../" + path;
        } else {
            cl_path = curr_path + "/" + path;
        }
        return cl_path;
    }

    @Override
    public void run() {
        if (this.searchDir != null && !this.searchDir.isEmpty()) {
            this.searchDirectory(searchDir, "Text_File_2.txt", "/XML_Sentences.xml");
        }
    }

    // public static void main(String... args) {
    public static String initialize(String args, GenerateMetaDataXML run) {

       // GenerateMetaDataXML run = new GenerateMetaDataXML();
        return run.classifyWithInlineXML(args);
//        String[] NPDir = {
//            "/media/administrator/AndrewLabStorage/CaseDownloads/downloads/ANTI_GUN/www.bradycampaign.org",
//            "/media/administrator/AndrewLabStorage/CaseDownloads/downloads/ANTI_GUN/www.cagv.org",
//            "/media/administrator/AndrewLabStorage/CaseDownloads/downloads/ANTI_GUN/www.capecodgag.org",
//            "/media/administrator/AndrewLabStorage/CaseDownloads/downloads/ANTI_GUN/www.ceasefireusa.org",
//            "/media/administrator/AndrewLabStorage/CaseDownloads/downloads/ANTI_GUN/www.csgv.org",
//            "/media/administrator/AndrewLabStorage/CaseDownloads/downloads/ANTI_GUN/www.joycefdn.org",
//            "/media/administrator/AndrewLabStorage/CaseDownloads/downloads/ANTI_GUN/www.momsdemandaction.org",
//            "/media/administrator/AndrewLabStorage/CaseDownloads/downloads/ANTI_GUN/www.ncgv.org",
//            "/media/administrator/AndrewLabStorage/CaseDownloads/downloads/ANTI_GUN/www.nyagv.org",
//            "/media/administrator/AndrewLabStorage/CaseDownloads/downloads/ANTI_GUN/www.ohioceasefire.org",
//            "/media/administrator/AndrewLabStorage/CaseDownloads/downloads/ANTI_GUN/www.pledge.org",
//            "/media/administrator/AndrewLabStorage/CaseDownloads/downloads/ANTI_GUN/www.sbcoalition.org",
//            "/media/administrator/AndrewLabStorage/CaseDownloads/downloads/ANTI_GUN/www.smartgunlaws.org",
//            "/media/administrator/AndrewLabStorage/CaseDownloads/downloads/PRO_GUN/www.azcdl.org",
//            "/media/administrator/AndrewLabStorage/CaseDownloads/downloads/PRO_GUN/www.ccrkba.org",
//            "/media/administrator/AndrewLabStorage/CaseDownloads/downloads/PRO_GUN/www.guncite.com",
//            "/media/administrator/AndrewLabStorage/CaseDownloads/downloads/PRO_GUN/www.keepandbeararms.com",
//            "/media/administrator/AndrewLabStorage/CaseDownloads/downloads/PRO_GUN/www.nationalgunrights.org",
//            "/media/administrator/AndrewLabStorage/CaseDownloads/downloads/PRO_GUN/www.wagc.com",};
//        Thread[] threads = new Thread[NPDir.length];
//        for (int i = 0; i < NPDir.length; i++) {
//            threads[i] = new Thread(new GenerateMetaDataXML(NPDir[i], "THEAD_" + (i + 1)));
//            threads[i].start();
//        }
    }
}
