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
import java.util.zip.GZIPInputStream;
import edu.albany.cubism.sentiment.LoadQuerys.QueryInput;
import edu.albany.cubism.util.Settings;

/**
 *
 * @author Robert J. Giarrusso
 */
public class OpenSourceCorpus {

    public void loadSourceCorpus(ArrayList<QueryInput> queryArrayList) throws IOException, InterruptedException {

        System.out.println("Finding Essential Source Corpus Documents...\n");

        //  /*OLD*/ final String sourceCorpusPath = "/home/jrgiarrusso/Documents/LDC2013E45_TAC_2013_KBP_Source_Corpus_disc_2.tar.gz";
       /*NEW*/ final String sourceCorpusPath = Settings.getValue("kbp_data_path")+"/LDC2014E13_Disks/LDC2014E13_d0.tar.gz";

        final String sourceCorpusDest = "/home/jrgiarrusso/Documents";

        // Initialization of a Hashmap to store the tokens of each line
        HashSet<String> docsFoundSet = new HashSet();

        //Unpack the entire source gZip file, "test" is a dummy string
        //unpackGZip(sourceCorpusPath, sourceCorpusDest, "test");

        // Open and extract each document needed for examination from the 
        // array list provided by the .XML file into a new file
        for (int i = 0; i < queryArrayList.size(); i++) {

            searchDirectory(queryArrayList.get(i).docid, docsFoundSet);
        }

    }

    public void searchDirectory(String docid, HashSet docsFoundSet) throws IOException, InterruptedException {

        // The starting directory of the source corpus data
///*OLD*/ File[] parentDirect = new File("/home/jrgiarrusso/Documents/LDC2013E45_TAC_2013_KBP_Source_Corpus_disc_2").listFiles();
/*NEW*/ File[] parentDirect = new File(Settings.getValue("kbp_data_path")+"/LDC2014E13_Disks/LDC2014E13_d0/data").listFiles();
        showFiles(parentDirect, docid, docsFoundSet);
    }

    public void showFiles(File[] parentDirect, String docid, HashSet docsFoundSet) throws IOException, InterruptedException {

        final String docDest = Settings.getValue("kbp_data_path")+"/2014evaluation/Source_Corpus_Files";
        String tempName;          // String to temporary hold the name of the file
        String ending = ".gz";  // The file ending of the compressed files we need

        //ArrayList<String> docsFoundList = new ArrayList<String>();
        // Recursively go through all of the files in the source and look for all of those that have
        // a file name contained within the doc id of the query
        for (File file : parentDirect) {

            if (file.isDirectory()) {

                // Start Recursion                
                showFiles(file.listFiles(), docid, docsFoundSet);

            } else {

                tempName = file.getName();
                if (tempName.endsWith(ending)) {

                    // Now set temp as the the filename, minus the ending of ".gz"
                    tempName = tempName.substring(0, tempName.lastIndexOf(ending));
                    if (docid.contains(tempName)) {

                        //System.out.println("FOUND: [DOCID: " + docid + "\tFILENAME: " + file.getName() + "]");
                        // Go through destination directory and decide whether or not the file has already been copied over
                        if (docsFoundSet.contains(tempName)) {
                            //System.out.println("IGNORE - ALREADY EXTRACTED\n");
                        } else {

                            // If it hasn't been found yet, insert the tempname into the hashset and extract
                            // the found file into the destination directory
                            docsFoundSet.add(tempName);
                            System.out.println("Absolute Path:\t" + file.getAbsolutePath());
                            System.out.println("docDest:\t" + docDest);
                            System.out.println("tempName:\t" + tempName);
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
