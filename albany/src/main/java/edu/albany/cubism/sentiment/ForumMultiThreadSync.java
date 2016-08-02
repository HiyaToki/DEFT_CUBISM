/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.albany.cubism.sentiment;

import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Robert J. Giarrusso
 */

// Extracts and gets the pathname for a single annotation file
public class ForumMultiThreadSync {

    // Will store the Pathname for the Annotation file that was extracted
    String pathName = "";

    // Used to set the PathName for the annotation file
    public void setPathName(String str) {
        pathName = str;
    }

    public String createThreads(String docID) throws InterruptedException, IOException {

        // ArrayList to store the threads created
        ArrayList<Thread> threadCollection = new ArrayList();
        
        System.out.println("Inside Create Threads");

        // Create, Run, and wait for all eight threads to finish their jobs, then return the path found
        for (int i = 0; i < 9; i++) {
            threadCollection.add(new Thread(new RunnableForum("t" + (i + 1), docID, "", this)));
            threadCollection.get(i).start();
        }
        for (int i = 0; i < threadCollection.size(); i++) {
            threadCollection.get(i).join();
        }
        return pathName;
    }
}

class RunnableForum implements Runnable {

    private String thread_name;     // The name of the thread
    private Thread thread;          // The Thread itself
    private String docID;           // the document ID for the file we are looking for
    private String finalPathName;   // the final path name for the file we are looking for
    private ForumMultiThreadSync runObj; // An object from the MultiThradSync method we just came from

    // Initialize the variables for the Runnable thread
    public RunnableForum(String thread_name, String docID, String finalPathName, ForumMultiThreadSync runObj) {
        this.thread_name = thread_name;
        this.docID = docID;
        this.finalPathName = finalPathName;
        this.runObj = runObj;
    }

    @Override
    public void run() {
        try {

            this.finalPathName = new ForumAnnotations().lookupThreads(this.docID, this.thread_name, this.finalPathName);

            // If the final Pathname happens to not be NULL, then we report it!
            if (!finalPathName.contentEquals("")) {
                runObj.setPathName(this.finalPathName);
            }
        } catch (Exception ex) {
            Logger.getLogger(RunnableForum.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void start() {
        if (thread == null) {
            thread = new Thread(this, thread_name);
            thread.start();
        }
    }
}
