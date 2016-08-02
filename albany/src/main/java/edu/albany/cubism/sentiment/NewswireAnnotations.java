/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.albany.cubism.sentiment;

import edu.albany.cubism.sentiment.CustomFileReader;
import edu.albany.cubism.sentiment.CustomFileReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.GZIPInputStream;
import edu.albany.cubism.sentiment.CustomFileReader;
import edu.albany.cubism.util.Settings;

/**
 *
 * @author Robert J. Giarrusso
 */
public class NewswireAnnotations {

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
//        File[] parentDirect1 = new File(Settings.getValue("kbp_data_path")+"/LDC2014E13_Disks/LDC2014E13_d0/docs/tarlogs/disc4").listFiles();
//        File[] parentDirect2 = new File(Settings.getValue("kbp_data_path")+"/LDC2014E13_Disks/LDC2014E13_d0/docs/tarlogs/disc5").listFiles();
//
//        // Depending on the name of the thread, it should look up a different set of files
//        // Have each thread look at the files and look for the one that matches the Document ID.
//        // If found, the finalpathName of "" will be replaced with the actual pathname, giving us our answer
//        if (threadName.contentEquals("t1")) {
//            for (File file : parentDirect1) {
//                finalPathName = generalFileLookup(2747, 3047, file, currLine, docID, batchName, batchPath, "t2", finalPathName);
//                if (!finalPathName.contentEquals("")) {
//                    return finalPathName;
//                }
//            }
//            return finalPathName;
//        } else if (threadName.contentEquals("t2")) {
//            for (File file : parentDirect1) {
//                finalPathName = generalFileLookup(3048, 3460, file, currLine, docID, batchName, batchPath, "t2", finalPathName);
//                if (!finalPathName.contentEquals("")) {
//                    return finalPathName;
//                }
//            }
//            return finalPathName;
//        } else if (threadName.contentEquals("t3")) {
//            for (File file : parentDirect2) {
//                finalPathName = generalFileLookup(3461, 3761, file, currLine, docID, batchName, batchPath, "t7", finalPathName);
//                if (!finalPathName.contentEquals("")) {
//                    return finalPathName;
//                }
//            }
//            return finalPathName;
//        } else if (threadName.contentEquals("t4")) {
//            for (File file : parentDirect2) {
//                finalPathName = generalFileLookup(3762, 4062, file, currLine, docID, batchName, batchPath, "t7", finalPathName);
//                if (!finalPathName.contentEquals("")) {
//                    return finalPathName;
//                }
//            }
//            return finalPathName;
//        } else if (threadName.contentEquals("t5")) {
//            for (File file : parentDirect2) {
//                finalPathName = generalFileLookup(4063, 4363, file, currLine, docID, batchName, batchPath, "t7", finalPathName);
//                if (!finalPathName.contentEquals("")) {
//                    return finalPathName;
//                }
//            }
//            return finalPathName;
//        } else if (threadName.contentEquals("t6")) {
//            for (File file : parentDirect2) {
//                finalPathName = generalFileLookup(4364, 4664, file, currLine, docID, batchName, batchPath, "t7", finalPathName);
//                if (!finalPathName.contentEquals("")) {
//                    return finalPathName;
//                }
//            }
//            return finalPathName;
//        } else if (threadName.contentEquals("t7")) {
//            for (File file : parentDirect2) {
//                finalPathName = generalFileLookup(4665, 4965, file, currLine, docID, batchName, batchPath, "t7", finalPathName);
//                if (!finalPathName.contentEquals("")) {
//                    return finalPathName;
//                }
//            }
//            return finalPathName;
//        } else if (threadName.contentEquals("t8")) {
//            for (File file : parentDirect2) {
//                finalPathName = generalFileLookup(4966, 5248, file, currLine, docID, batchName, batchPath, "t8", finalPathName);
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

    public BatchItems lookForDocID(File file, String docID, String batchName, String batchPath, String currLine) {

        // Obtain the name of the batchFile
        batchName = file.getName().substring(0, 10);

        // Obtain the path name for the batchfile
        String[] lineSplit = currLine.split(" ");
        batchPath = lineSplit[lineSplit.length - 1];

        BatchItems bItems = new BatchItems(batchName, batchPath);
        return bItems;
    }

    public String findBatchAnnote(BatchItems bi, String threadNum, String docID) throws IOException, InterruptedException {

        String finalPathName = "";

        System.out.println(threadNum + " has found the batchfile.");
        if (threadNum.contentEquals("t1") || threadNum.contentEquals("t2")) {
            String pathNameSource = Settings.getValue("kbp_data_path")+"/LDC2014E13_Disks/LDC2014E13_d4/" + bi.batchName + ".tar.bz";
//            String pathNameDest = Settings.getValue("kbp_data_path")+"/batch_files/" + bi.batchName;
            String pathNameDest = Settings.getValue("kbp_data_path")+"/2014evaluation/batch_files/" + bi.batchName;
            File file = new File(pathNameDest);

            if (!file.exists()) {

                // Create a directory to store the annotation file
                //commented out by TL 03/12/15
//                Process r = Runtime.getRuntime().exec("mkdir "+Settings.getValue("kbp_data_path")+"/batch_files/" + bi.batchName);
////            Process r = Runtime.getRuntime().exec("mkdir "+Settings.getValue("kbp_data_path")+"/2014evaluation/batch_files/" + bi.batchName);
//
//                System.out.println("Running: mkdir "+Settings.getValue("kbp_data_path")+"/2014evaluation/batch_files/" + bi.batchName);
//                r.waitFor();
//
//                // Extract the annotation file
//                //commented out by TL 03/12/15
//                Process q = Runtime.getRuntime().exec("tar -xvf " + pathNameSource + " -C " + pathNameDest + " " + bi.batchPath);
//                System.out.println("Running: tar -xvf " + pathNameSource + " -C " + pathNameDest + " " + bi.batchPath);
//                System.out.println("Extracting...");
//                q.waitFor();
//
//                System.out.println("Extraction of " + docID + " completed.\n");
            }
            // Return the final pathname
            finalPathName = pathNameDest + "/" + bi.batchPath;
            return finalPathName;

        } else {

            String pathNameSource = Settings.getValue("kbp_data_path")+"/LDC2014E13_Disks/LDC2014E13_d5/" + bi.batchName + ".tar.bz";
//            String pathNameDest = Settings.getValue("kbp_data_path")+"/batch_files/" + bi.batchName;
            String pathNameDest = Settings.getValue("kbp_data_path")+"/2014evaluation/batch_files/" + bi.batchName;

            File file = new File(pathNameDest);

            if (!file.exists()) {

                // Create a directory to store the annotation file
//                Process r = Runtime.getRuntime().exec("mkdir "+Settings.getValue("kbp_data_path")+"/batch_files/" + bi.batchName);
//                //commented out by TL 03/12/15
////            Process r = Runtime.getRuntime().exec("mkdir "+Settings.getValue("kbp_data_path")+"/2014evaluation/batch_files/" + bi.batchName);
//
//                System.out.println("Running: mkdir "+Settings.getValue("kbp_data_path")+"/2014evaluation/batch_files/" + bi.batchName);
//                r.waitFor();
//            // Extract the annotation file
//                //commented out by TL 03/12/15
//                Process q = Runtime.getRuntime().exec("tar -xvf " + pathNameSource + " -C " + pathNameDest + " " + bi.batchPath);
//                System.out.println("Running: tar -xvf " + pathNameSource + " -C " + pathNameDest + " " + bi.batchPath);
//                System.out.println("Extracting...");
//                q.waitFor();
//                System.out.println("Extraction completed.\n");
            }
            // return the final pathname
            finalPathName = pathNameDest + "/" + bi.batchPath;
            return finalPathName;
        }
    }

//    public String generalFileLookup(int startNum, int endNum, File file, String currLine, String docID, String batchName,
//            String batchPath, String threadNum, String finalPathName) {
//
//        // Read only the files this directory with a batchNumber higher than 2746
//        int batchNum = Integer.parseInt(file.getName().substring(6, 10));
//
//        if (batchNum >= startNum && batchNum <= endNum) {
//            CustomFileReader read1 = new CustomFileReader(file.getAbsolutePath());  // Open up the file found earlier  
//            read1.getNextLine();
//            currLine = read1.getNextLine();
//
//            // Read each line of the file
//            while (read1.hasNextLine() && currLine.endsWith(".apf")) {
//
//                currLine = read1.getNextLine();
//
//                // If the currentline contains the relevant docID, then extract the necessary batch data items from it
//                if (currLine.contains(docID)) {
//                    BatchItems bi = lookForDocID(file, docID, batchName, batchPath, currLine);
//                    try {
//                        // Use the found Batch items to find the annotations for the document and find the location pathname of the batchfile
//                        finalPathName = findBatchAnnote(bi, threadNum, docID);
//                    } catch (IOException | InterruptedException ex) {
//                        Logger.getLogger(NewswireAnnotations.class.getName()).log(Level.SEVERE, null, ex);
//                    }
//                    return finalPathName;
//                }
//            }
//            read1.closeFile();
//        }
//        return finalPathName;
//    }
}
