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
public class ReplaceWordData {

    public int startOffset;
    public int endOffset;
    public String replaceWord;

    public ReplaceWordData(int startOffset, int endOffset, String replaceWord) {
        this.startOffset = startOffset;
        this.endOffset = endOffset;
        this.replaceWord = replaceWord;
    }
}