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
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.zip.GZIPInputStream;
import edu.albany.cubism.util.Settings;

/**
 *
 * @author Robert J. Giarrusso
 */
public class OpenSourceCorpusAssessments {

    public void loadSourceCorpusAssess(ArrayList<ArrayList<String>> assessDocArrayList) throws InterruptedException, IOException {

        System.out.println("Finding Essential Source Corpus Documents...\n");

        // Initialization of a Hashmap to store the tokens of each line
        HashSet<String> assessDocsFoundSet = new HashSet();
        String[] assessLine, documentAndOffsetChunk;
        int count = 0;
        Iterator<ArrayList<String>> itr = assessDocArrayList.iterator();
        String documentAndOffset;
        String docid;

       
        int docIDStringOffset;
        int offsetLoc;
        while (itr.hasNext()) {
            ArrayList<String> element = itr.next();
            assessLine = element.get(0).split("\t");
            count++;
//            System.out.println(count);
//            System.out.println("array length:" + assessDocArrayList.size());

            documentAndOffset = assessLine[3];
            ArrayList<String> docOffsetString;
            documentAndOffsetChunk = documentAndOffset.split(",");
            docIDStringOffset = documentAndOffsetChunk[0].indexOf(":");
            docid = documentAndOffsetChunk[0].substring(0, docIDStringOffset);
            
//            System.out.println("DOC ID HELP 3:\t" + docid);
//            
//            System.out.println("DOC IDIDIDID:\t" + docid);
            //CS: direct access
            //searchDirectoryAssess(docid, assessDocsFoundSet);
        }
        // Open and extract each document needed for examination from the 
        // array list provided by the .XML file into a new file
        // for (int i = 0; i < assessDocArrayList.size(); i++) {

        //     searchDirectoryAssess(assessDocArrayList, assessDocsFoundSet);
        // }
    }

    public void searchDirectoryAssess(String docid, HashSet assessDocsFoundSet) throws IOException, InterruptedException {

        // The starting directory of the source corpus data
        File[] parentDirect = new File(Settings.getValue("kbp_data_path")+"/LDC2014E13_Disks/LDC2014E13_d0/data").listFiles();
        showFilesAssess(parentDirect, docid, assessDocsFoundSet);
    }

    public void showFilesAssess(File[] parentDirect, String docid, HashSet assessDocsFoundSet) throws IOException, InterruptedException {

        final String docDest = Settings.getValue("kbp_data_path")+"/Source_Corpus_Files_Assessment";
        String tempName;          // String to temporary hold the name of the file
        String ending = ".gz";  // The file ending of the compressed files we need

        //ArrayList<String> docsFoundList = new ArrayList<String>();
        // Recursively go through all of the files in the source and look for all of those that have
        // a file name contained within the doc id of the query
//        System.out.println("docId: " + docid);
        for (File file : parentDirect) {

            if (file.isDirectory()) {

                // Start Recursion              
//                System.out.println("files: " + file.getAbsolutePath());
                showFilesAssess(file.listFiles(), docid, assessDocsFoundSet);

            } else {

                tempName = file.getName();
//                System.out.println("name: " + tempName);
                if (tempName.endsWith(ending)) {

                    // Now set temp as the the filename, minus the ending of ".gz"
                    tempName = tempName.substring(0, tempName.lastIndexOf(ending));
                    if (docid.startsWith(tempName)) {

                        //System.out.println("FOUND: [DOCID: " + docid + "\tFILENAME: " + file.getName() + "]");
                        // Go through destination directory and decide whether or not the file has already been copied over
                        if (assessDocsFoundSet.contains(tempName)) {
                            System.out.println("IGNORE - ALREADY EXTRACTED" + tempName + "\n");
                        } else {

                            // If it hasn't been found yet, insert the tempname into the hashset and extract
                            // the found file into the destination directory
                            assessDocsFoundSet.add(tempName);
                            unpackGZip(file.getAbsolutePath(), docDest, tempName);
                        }

                    }
                } else { // If the file is not of the type .gz, then we don't care about it, simply return
                }
            }
        }
    }

    public void unpackGZip(String pathNameSource, String pathNameDest, String temp) throws IOException, InterruptedException {

        // If it is a document file
        if (pathNameSource.contains(".gz") && !pathNameSource.contains(".tar")) {

            System.out.println("Extracting " + temp);
            FileInputStream instream = new FileInputStream(pathNameSource);
            GZIPInputStream ginstream = new GZIPInputStream(instream);
            FileOutputStream outstream = new FileOutputStream(pathNameDest + "/" + temp);
            byte[] buf = new byte[1024];
            int len;
            while ((len = ginstream.read(buf)) > 0) {
                outstream.write(buf, 0, len);
            }
            ginstream.close();
            outstream.close();
            System.out.println("Extraction completed.\n");

            // If it is the Annotation file
        } else {

            //Runtime.getRuntime().exec(pathName);
            Process p = Runtime.getRuntime().exec("tar -zxvf " + pathNameSource + " -C " + pathNameDest);
            System.out.println("Running: tar -zxvf " + pathNameSource + " -C " + pathNameDest);
            System.out.println("Extracting...");
            p.waitFor();
            System.out.println("Extraction completed.\n");
        }
    }

}
