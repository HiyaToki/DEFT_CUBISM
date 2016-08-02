/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.albany.cubism.ie;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import edu.illinois.cs.cogcomp.lbj.coref.*;

/**
 *
 * @author ting
 */
public class UIUCEnCorefProcessor {

    public UIUCEnCorefProcessor(String filePath) {
        this.filePath = filePath;
    }

    public UIUCEnCorefProcessor() {
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public ArrayList<OldEntity> parse() {
        ArrayList<OldEntity> enList = new ArrayList();
        BufferedReader br = null;
        try {
            String aLine = null;
            br = new BufferedReader(new FileReader(new File(this.filePath)));
            while ((aLine = br.readLine()) != null) {
                String[] items = aLine.split("; ");
                if (items.length > 1) {
                    String en_mention = items[1].substring(1, items[1].length() - 1);
                    String[] elses = items[0].split(", ");
                    String en_id = elses[0].substring(6, elses[0].length());
                    String en_type = elses[1];
                    int start = Integer.valueOf(elses[2]);
                    int end = Integer.valueOf(elses[3]);
                    CharSeq enm = new CharSeq(start, end, en_mention);
                    ArrayList mens = new ArrayList();
                    if (enList.size() == 0) {
                        mens.add(enm);
                        OldEntity en = new OldEntity(new ArrayList(), mens, en_type, en_id);
                        enList.add(en);
                    } else {
                        OldEntity en = enList.get(enList.size() - 1);
                        if (en.id.equals(en_id)) {
                            en.addMention(enm);
                        } else {
                            en = new OldEntity(new ArrayList(), mens, en_type, en_id);
                            enList.add(en);
                        }
                    }
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(UIUCEnCorefProcessor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(UIUCEnCorefProcessor.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                br.close();
            } catch (IOException ex) {
                Logger.getLogger(UIUCEnCorefProcessor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return enList;
    }

    private String filePath = null;
}
