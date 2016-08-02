/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.albany.cubism.sentiment;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.GZIPInputStream;
import edu.albany.cubism.util.Settings;

/**
 *
 * @author Robert J. Giarrusso
 */
public class ForumAnnotations {

    // Holds the target, relation, and the X for each of the lines of the file
    private class BatchItems {

        String batchName;
        String batchPath;

        public BatchItems(String batchName, String batchPath) {
            this.batchName = batchName;
            this.batchPath = batchPath;
        }
    }

    public String lookupThreads(String docID, String threadName, String finalPathName) throws InterruptedException, IOException {
        return fileLookup(docID, threadName, finalPathName);
    }

    public String fileLookup(String docID, String threadName, String finalPathName) throws IOException, InterruptedException {

//        String batchName = "";   // Holds the name of the found batch file
//        String batchPath = "";  // Holds the name of the batchfile path
//        String currLine = "\n";
//        File[] parentDirect1 = new File(Settings.getValue("kbp_data_path")+"/LDC2014E13_Disks/LDC2014E13_d0/docs/tarlogs/disc1").listFiles();
//        File[] parentDirect2 = new File(Settings.getValue("kbp_data_path")+"/LDC2014E13_Disks/LDC2014E13_d0/docs/tarlogs/disc2").listFiles();
//        File[] parentDirect3 = new File(Settings.getValue("kbp_data_path")+"/LDC2014E13_Disks/LDC2014E13_d0/docs/tarlogs/disc3").listFiles();
//        File[] parentDirect4 = new File(Settings.getValue("kbp_data_path")+"/LDC2014E13_Disks/LDC2014E13_d0/docs/tarlogs/disc4").listFiles();
//
//        // Depending on the name of the thread, it should look up a different set of files
//        // Have each thread look at the files and look for the one that matches the Document ID.
//        // If found, the finalpathName of "" will be replaced with the actual pathname, giving us our answer
//        if (threadName.contentEquals("t1")) {
//            for (File file : parentDirect1) {
//                finalPathName = generalFileLookup(0000, 0350, file, currLine, docID, batchName, batchPath, "t1", finalPathName);
//                if (!finalPathName.contentEquals("")) {
//                    return finalPathName;
//                }
//            }
//            return finalPathName;
//        } else if (threadName.contentEquals("t2")) {
//            for (File file : parentDirect1) {
//                finalPathName = generalFileLookup(0351, 0651, file, currLine, docID, batchName, batchPath, "t2", finalPathName);
//                if (!finalPathName.contentEquals("")) {
//                    return finalPathName;
//                }
//            }
//            return finalPathName;
//        } else if (threadName.contentEquals("t3")) {
//            for (File file : parentDirect1) {
//                finalPathName = generalFileLookup(0651, 1002, file, currLine, docID, batchName, batchPath, "t3", finalPathName);
//                if (!finalPathName.contentEquals("")) {
//                    return finalPathName;
//                }
//            }
//            return finalPathName;
//        } else if (threadName.contentEquals("t4")) {
//            for (File file : parentDirect2) {
//                finalPathName = generalFileLookup(1003, 1353, file, currLine, docID, batchName, batchPath, "t4", finalPathName);
//                if (!finalPathName.contentEquals("")) {
//                    return finalPathName;
//                }
//            }
//            return finalPathName;
//        } else if (threadName.contentEquals("t5")) {
//            for (File file : parentDirect2) {
//                finalPathName = generalFileLookup(1354, 1700, file, currLine, docID, batchName, batchPath, "t5", finalPathName);
//                if (!finalPathName.contentEquals("")) {
//                    return finalPathName;
//                }
//            }
//            return finalPathName;
//        } else if (threadName.contentEquals("t6")) {
//            for (File file : parentDirect2) {
//                finalPathName = generalFileLookup(1701, 2003, file, currLine, docID, batchName, batchPath, "t6", finalPathName);
//                if (!finalPathName.contentEquals("")) {
//                    return finalPathName;
//                }
//            }
//            return finalPathName;
//        } else if (threadName.contentEquals("t7")) {
//            for (File file : parentDirect3) {
//                finalPathName = generalFileLookup(2004, 2300, file, currLine, docID, batchName, batchPath, "t7", finalPathName);
//                if (!finalPathName.contentEquals("")) {
//                    return finalPathName;
//                }
//            }
//            return finalPathName;
//        } else if (threadName.contentEquals("t8")) {
//            for (File file : parentDirect3) {
//                finalPathName = generalFileLookup(2301, 2590, file, currLine, docID, batchName, batchPath, "t8", finalPathName);
//                if (!finalPathName.contentEquals("")) {
//                    return finalPathName;
//                }
//            }
//            return finalPathName;
//        } else if (threadName.contentEquals("t9")) {
//            for (File file : parentDirect4) {
//                finalPathName = generalFileLookup(2591, 2747, file, currLine, docID, batchName, batchPath, "t9", finalPathName);
//                if (!finalPathName.contentEquals("")) {
//                    return finalPathName;
//                }
//            }
//            return finalPathName;
//        }
//
//        return finalPathName;
        return "/" + docID + ".sgm.apf";
    }

    private BatchItems lookForDocID(File file, String docID, String batchName, String batchPath, String currLine) {

        // Obtain the name of the batchFile
        batchName = file.getName().substring(0, 10);

        // Obtain the path name for the batchfile
        String[] lineSplit = currLine.split(" ");
        batchPath = lineSplit[lineSplit.length - 1];

        BatchItems bItems = new BatchItems(batchName, batchPath);
        return bItems;
    }

    private String findBatchAnnote(BatchItems bi, String threadNum, String docID) throws IOException, InterruptedException {

        String finalPathName = "";

        System.out.println(threadNum + " has found the batchfile.");
        File file = new File("");
        if (threadNum.contentEquals("t1") || threadNum.contentEquals("t2") || threadNum.contentEquals("t3")) {
            String pathNameSource = Settings.getValue("kbp_data_path")+"/LDC2014E13_Disks/LDC2014E13_d1/" + bi.batchName + ".tar.bz";
            String pathNameDest = Settings.getValue("kbp_data_path")+"/2014evaluation/batch_files_forum/" + bi.batchName;

            // Create a directory to store the annotation file
            file = new File(Settings.getValue("kbp_data_path")+"/2014evaluation/batch_files_forum/" + bi.batchName);
            if (!file.exists()) {
//                Process r = Runtime.getRuntime().exec("mkdir "+Settings.getValue("kbp_data_path")+"/2014evaluation/batch_files_forum/" + bi.batchName);
//                System.out.println("Running: mkdir "+Settings.getValue("kbp_data_path")+"/2014evaluation/batch_files_forum/" + bi.batchName);
//                r.waitFor();
//
//                // Extract the annotation file
//                Process q = Runtime.getRuntime().exec("tar -xvf " + pathNameSource + " -C " + pathNameDest + " " + bi.batchPath);
//                System.out.println("Running: tar -xvf " + pathNameSource + " -C " + pathNameDest + " " + bi.batchPath);
//                System.out.println("Extracting...");
//                q.waitFor();

                System.out.println("Extraction of " + docID + " completed.\n");
            }

            // Return the final pathname
            finalPathName = pathNameDest + "/" + bi.batchPath;
            return finalPathName;

        } else if (threadNum.contentEquals("t4") || threadNum.contentEquals("t5") || threadNum.contentEquals("t6")) {

            String pathNameSource = Settings.getValue("kbp_data_path")+"/LDC2014E13_Disks/LDC2014E13_d2/" + bi.batchName + ".tar.bz";
            String pathNameDest = Settings.getValue("kbp_data_path")+"/2014evaluation/batch_files_forum/" + bi.batchName;

            // Create a directory to store the annotation file
            file = new File(Settings.getValue("kbp_data_path")+"/2014evaluation/batch_files_forum/" + bi.batchName);
            if (!file.exists()) {
//                Process r = Runtime.getRuntime().exec("mkdir "+Settings.getValue("kbp_data_path")+"/2014evaluation/batch_files_forum/" + bi.batchName);
//                System.out.println("Running: mkdir "+Settings.getValue("kbp_data_path")+"/2014evaluation/batch_files_forum/" + bi.batchName);
//                r.waitFor();
//
//                // Extract the annotation file
//                Process q = Runtime.getRuntime().exec("tar -xvf " + pathNameSource + " -C " + pathNameDest + " " + bi.batchPath);
//                System.out.println("Running: tar -xvf " + pathNameSource + " -C " + pathNameDest + " " + bi.batchPath);
//                System.out.println("Extracting...");
//                q.waitFor();

                System.out.println("Extraction completed.\n");
            }

            // return the final pathname
            finalPathName = pathNameDest + "/" + bi.batchPath;
            return finalPathName;
        } else if (threadNum.contentEquals("t7") || threadNum.contentEquals("t8")) {

            String pathNameSource = Settings.getValue("kbp_data_path")+"/LDC2014E13_Disks/LDC2014E13_d3/" + bi.batchName + ".tar.bz";
            String pathNameDest = Settings.getValue("kbp_data_path")+"/2014evaluation/batch_files_forum/" + bi.batchName;

            file = new File(Settings.getValue("kbp_data_path")+"/2014evaluation/batch_files_forum/" + bi.batchName);
            if (!file.exists()) {
                System.out.println("Extraction completed.\n");
            }
            // return the final pathname
            finalPathName = pathNameDest + "/" + bi.batchPath;
            return finalPathName;
        } else {
            String pathNameSource = Settings.getValue("kbp_data_path")+"/LDC2014E13_Disks/LDC2014E13_d4/" + bi.batchName + ".tar.bz";
            String pathNameDest = Settings.getValue("kbp_data_path")+"/2014evaluation/batch_files_forum/" + bi.batchName;

            file = new File(Settings.getValue("kbp_data_path")+"/2014evaluation/batch_files_forum/" + bi.batchName);
            if (!file.exists()) {

                System.out.println("Extraction completed.\n");
            }
            // return the final pathname
            finalPathName = pathNameDest + "/" + bi.batchPath;
            return finalPathName;

        }
    }

}
