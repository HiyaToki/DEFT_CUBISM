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
public class CleanXML {

    public void cleanXMl() {
        String newDocsPath = Settings.getValue("kbp_data_path")+"/2014evaluation/cleaned_xml";
        File[] xmlFiles = new File(Settings.getValue("kbp_data_path")+"/2014evaluation/converted_docs").listFiles();
        String currLine = "";
        for (File file : xmlFiles) {
            CustomFileReader readXmlFile = new CustomFileReader(file.getAbsolutePath());
            CustomFileWriter newXmlFile = new CustomFileWriter(newDocsPath + "/" + file.getName());
          //  if (file.getName().contentEquals("forum_convo4.xml")) {
                while (readXmlFile.hasNextLine()) {
                    currLine = readXmlFile.getNextLine();
                    currLine = replaceTags(currLine);
                    currLine = replaceWeblink(currLine);
                    currLine = replaceEmpty(currLine);
                    currLine = ridQuotes(currLine);
                    newXmlFile.println(currLine);
                }
                readXmlFile.closeFile();
                newXmlFile.closeFile();
          //  }
        }
    }

    public String replaceTags(String currLine) {
        while (currLine.contains("</a>")) {
            currLine = currLine.replaceAll("</a>", "");
        }
        return currLine;
    }

    public String replaceWeblink(String currLine) {
        while (currLine.contains("WEBLINK>") || currLine.contains("WEBLINK PIECE") || currLine.contains("<WEBLINK")) {
            if (currLine.contains("WEBLINK>")) {
                currLine = currLine.replaceAll("WEBLINK>", "WEBLINK");
            }
            if (currLine.contains("WEBLINK PIECE")) {
                currLine = currLine.replaceAll("WEBLINK PIECE", "WEBLINK");
            }
            if (currLine.contains("<WEBLINK")) {
                currLine = currLine.replaceAll("<WEBLINK", "WEBLINK");
            }
        }
        return currLine;
    }

    public String replaceEmpty(String currLine) {
        if (currLine.contains(">  </turn>")) {
            currLine = currLine.replaceAll(">  </turn>", ">SPACE</turn>");
        }
        return currLine;
    }

    public String ridQuotes(String currLine) {

        if (currLine.startsWith("<turn comm_act_type")) {
            return currLine.replaceFirst(currLine.subSequence(currLine.indexOf("topic=\"") + 7, currLine.indexOf("turn_no=\"") - 2).toString(), currLine.subSequence(currLine.indexOf("topic=\"") + 7, currLine.indexOf("turn_no=\"") - 2).toString().replaceAll("\"", ""));
        }
        return currLine;
    }
}
