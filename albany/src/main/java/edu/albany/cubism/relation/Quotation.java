/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.albany.cubism.relation;

import java.util.ArrayList;

/**
 *
 * @author ting
 */
public class Quotation {
    private String speaker = null;
    private String content = null;
    private int startx = -1;
    private int endx = -1;
    private int sp_startx = -1; //speaker offset
    private int sp_endx = -1;  //speaker offset
    private ArrayList<Line> lines = new ArrayList();
    private Quotation quote = null;

    public String getSpeaker() {
        return speaker;
    }

    public void setSpeaker(String speaker) {
        this.speaker = speaker;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getStartx() {
        return startx;
    }

    public void setStartx(int startx) {
        this.startx = startx;
    }

    public int getEndx() {
        return endx;
    }

    public void setEndx(int endx) {
        this.endx = endx;
    }

    public Quotation getQuote() {
        return quote;
    }

    public void setQuote(Quotation quote) {
        this.quote = quote;
    }

    public ArrayList<Line> getLines() {
        return lines;
    }

    public void setLines(ArrayList<Line> lines) {
        this.lines = lines;
    }
 
    public void addLine(Line line) {
        this.lines.add(line);
    }

    public int getSp_startx() {
        return sp_startx;
    }

    public void setSp_startx(int sp_startx) {
        this.sp_startx = sp_startx;
    }

    public int getSp_endx() {
        return sp_endx;
    }

    public void setSp_endx(int sp_endx) {
        this.sp_endx = sp_endx;
    }
 
    public ArrayList<Utterance> genUtternces(String doc_content) {
        ArrayList utts = new ArrayList();
        for (Line l: lines) {
            utts.addAll(l.genUtterances(doc_content));
        }
        return utts;
    }
}
