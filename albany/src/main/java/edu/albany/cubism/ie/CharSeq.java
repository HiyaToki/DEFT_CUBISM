/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.albany.cubism.ie;

/**
 *
 * @author ting
 */
public class CharSeq {

    public int startOffset;
    public int endOffset;
    public String keyWord;
    public String full_expression;
    public String id;
    public OldEntity parent;

    public CharSeq(int startOffset, int endOffset, String keyWord, String id) {
        this.startOffset = startOffset;
        this.endOffset = endOffset;
        this.keyWord = keyWord;
        this.id = id;
    }

    public CharSeq(int parseInt, int parseInt0, String charSeq) {
        this.startOffset = parseInt;
        this.endOffset = parseInt0;
        this.keyWord = charSeq;
    }

    public void setFullExpression(String fe) {
        this.full_expression = fe;
    }

    public String getFullExpression() {
        return this.full_expression;
    }

    public OldEntity getParent() {
        return parent;
    }

    public void setParent(OldEntity parent) {
        this.parent = parent;
    }

    public String getKeyWord() {
        return keyWord;
    }

    public void setKeyWord(String keyWord) {
        this.keyWord = keyWord;
    }

}
