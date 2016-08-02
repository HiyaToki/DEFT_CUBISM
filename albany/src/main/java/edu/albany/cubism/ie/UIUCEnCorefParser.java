/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.albany.cubism.ie;

import adept.common.Coreference;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import edu.albany.cubism.ie.IllinoisCoreferenceResolverApp;
import adept.common.HltContentContainer;
import java.util.List;
import adept.common.Entity;
import adept.common.EntityMention;

/**
 *
 * @author ting
 */
public class UIUCEnCorefParser {

    private static String theAlgorithmConfig = "target/classes/edu/uiuc/discourse/IllinoisCorefConfig.xml"; // "AcePlainTextConfig.xml";
    private IllinoisCoreferenceResolverApp uiuc_coref = new IllinoisCoreferenceResolverApp();

    public UIUCEnCorefParser(String filePath) {
        this.filePath = filePath;
    }

    public UIUCEnCorefParser() {
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public ArrayList<edu.albany.cubism.ie.OldEntity> parseFromCorefRun() {
        ArrayList<edu.albany.cubism.ie.OldEntity> enList = new ArrayList();
        String[] args = new String[4];
        args[0] = "-i";
        args[1] = this.filePath;
        args[2] = "-o";
        args[3] = this.filePath;
        System.out.println("filepath: " + this.filePath);
        uiuc_coref.Run(args, theAlgorithmConfig);
        synchronized(this)  {
            while (uiuc_coref.getHltCon() == null) {
                try {
                    this.wait();
                } catch (InterruptedException ex) {
                    Logger.getLogger(UIUCEnCorefParser.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        HltContentContainer hlt_con = uiuc_coref.getHltCon();
        List<Coreference> corefs = hlt_con.getCoreferences();
        for (Coreference coref : corefs) {
            List<Entity> ensList = coref.getEntities();
            List<EntityMention> enmList = coref.getResolvedMentions();
            for (EntityMention enm : enmList) {
                String enm_name = enm.getTokenStream().getTextValue();
                int startx = enm.getTokenOffset().getBegin();
                int endx = enm.getTokenOffset().getEnd();
                CharSeq enm_c = new CharSeq(startx, endx, enm_name);
                Long entity_id_long = ((Long) enm.getEntityIdDistribution().keySet().iterator().next());
                String entity_id = entity_id_long.toString();

                boolean found = false;
                for (edu.albany.cubism.ie.OldEntity enalb : enList) {
                    if (enalb.id.equals(entity_id)) {
                        enalb.addMention(enm_c);
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    ArrayList mens = new ArrayList();
                    for (Entity en : ensList) {
                        if (en.getEntityId() == entity_id_long) {
                            String entity_name = en.getEntity();
                            ReplaceWordData rwd = new ReplaceWordData(en.getCanonicalMention().getTokenOffset().getBegin(), en.getCanonicalMention().getTokenOffset().getEnd(), entity_name);
                            edu.albany.cubism.ie.OldEntity new_en = new edu.albany.cubism.ie.OldEntity(new ArrayList(), mens, en.getEntityType().getType(), (new Long(en.getEntityId())).toString());
                            new_en.setPrefRPW(rwd);
                            new_en.addMention(enm_c);
                        }
                    }
                }
            }
        }
        return enList;
    }

    public ArrayList<edu.albany.cubism.ie.OldEntity> parse() {
        ArrayList<edu.albany.cubism.ie.OldEntity> enList = new ArrayList();
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
                        edu.albany.cubism.ie.OldEntity en = new edu.albany.cubism.ie.OldEntity(new ArrayList(), mens, en_type, en_id);
                        enList.add(en);
                    } else {
                        edu.albany.cubism.ie.OldEntity en = enList.get(enList.size() - 1);
                        if (en.id.equals(en_id)) {
                            en.addMention(enm);
                        } else {
                            en = new edu.albany.cubism.ie.OldEntity(new ArrayList(), mens, en_type, en_id);
                            enList.add(en);
                        }
                    }
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(UIUCEnCorefParser.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(UIUCEnCorefParser.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                br.close();
            } catch (IOException ex) {
                Logger.getLogger(UIUCEnCorefParser.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return enList;
    }

    private String filePath = null;
}
