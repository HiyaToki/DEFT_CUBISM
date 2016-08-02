/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.albany.cubism.relation;

/**
 *
 * @author ting
 */
public class Poster {
    
    private String speaker = null;
    private String content = null;
    private int startx = -1;
    private int endx = -1;
    private Quotation quote = null;

    /**
     * Get the value of speaker
     *
     * @return the value of speaker
     */
    public String getSpeaker() {
        return speaker;
    }

    /**
     * Set the value of speaker
     *
     * @param speaker new value of speaker
     */
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

}
