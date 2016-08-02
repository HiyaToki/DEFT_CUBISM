/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.albany.cubism.sentiment;

import java.io.File;
import edu.albany.cubism.util.Settings;

/**
 *
 * @author jrgiarrusso
 */
public class ManageOutput {

    public void gatherOutput() {

        String currLine = "";
        CustomFileWriter answerFile = new CustomFileWriter(Settings.getValue("kbp_data_path")+"/2014Answer");
        File[] parentDirect = new File(Settings.getValue("kbp_data_path")+"/newswire_output").listFiles();
        for (File child : parentDirect) {
            if (!child.getName().contains("2014Answer") && !child.getName().contains(".DS_Store")) {
                CustomFileReader readFile = new CustomFileReader(child.getAbsolutePath());
                while (readFile.hasNextLine()) {
                    currLine = readFile.getNextLine();
                    answerFile.println(currLine);
                }
                readFile.closeFile();
            }
        }
//        File[] parentDirect2 = new File("/home/tejasrao/Documents/tejas_look_in_here/Data/2014evaluation/forum_output").listFiles();
//        for (File child : parentDirect2) {
//            if (!child.getName().contains("2014Answer")) {
//                CustomFileReader readFile = new CustomFileReader(child.getAbsolutePath());
//                while (readFile.hasNextLine()) {
//                    currLine = readFile.getNextLine();
//                    answerFile.println(currLine);
//                }
//                readFile.closeFile();
//            }
//        }
        answerFile.closeFile();
    }
}
