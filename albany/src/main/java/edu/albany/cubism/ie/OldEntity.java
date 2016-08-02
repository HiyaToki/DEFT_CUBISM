/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.albany.cubism.ie;

import java.util.ArrayList;

/**
 *
 * @author ting
 */
public class OldEntity {

    public ArrayList<ReplaceWordData> replaceWordData = null;
    public ArrayList<CharSeq> wordData = null;
    String type;
    public ReplaceWordData pref_rpw = null;
    String id;

    public OldEntity(ArrayList<ReplaceWordData> replaceWordData, ArrayList<CharSeq> wordData, String type, String id) {
        this.replaceWordData = replaceWordData;
        this.wordData = wordData;
        this.type = type;
        this.setPrefRPW();
        this.id = id;
    }

    public OldEntity(ArrayList<ReplaceWordData> replaceWordList, ArrayList<CharSeq> charSeqList, String en_type) {
        this.replaceWordData = replaceWordList;
        this.wordData = charSeqList;
        this.type = en_type;
        this.setPrefRPW();
    }

    public void addMention(CharSeq mention) {
        this.wordData.add(mention);
        this.setPrefRPW();
    }

    public void setPrefRPW(ReplaceWordData pref_rpw) {
        this.pref_rpw = pref_rpw;
    }

    private void setPrefRPW() {
        if (pref_rpw != null) { //added by TL 11/19/15
            return;
        }
        if (replaceWordData == null) {
            return;
        }
        for (ReplaceWordData rpw : replaceWordData) {
            if (pref_rpw == null) {
                pref_rpw = rpw;
            } else if (rpw.replaceWord.split("[\\s]+").length > pref_rpw.replaceWord.split("[\\s]+").length) { //edit by TL to keep the entity representation for most number of words 03_24_15
                pref_rpw = rpw;
            }
        }
        for (CharSeq cs : wordData) {
            //for those no attributes defined in entity annotation file, set full expression itself 05/08/2015 by TL
            cs.setParent(this);
            if (pref_rpw == null) {
                cs.setFullExpression(cs.keyWord);
            } else {
                cs.setFullExpression(pref_rpw.replaceWord);
            }
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
