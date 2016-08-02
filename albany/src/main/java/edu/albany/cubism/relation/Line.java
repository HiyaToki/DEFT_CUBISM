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
public class Line {

    private String speaker = null;
    private String content = null;
    private int startx = -1;
    private int endx = -1;
    private boolean in_quote = false;
    private int spk_startx;
    private int spk_endx;

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

    public String getSpeaker() {
        return speaker;
    }

    public void setSpeaker(String speaker) {
        this.speaker = speaker;
    }

    public boolean isIn_quote() {
        return in_quote;
    }

    public void setIn_quote(boolean in_quote) {
        this.in_quote = in_quote;
    }

    public ArrayList genUtterances(String doc_content) {
        ArrayList utts = new ArrayList();
        String post = this.content;
        Utterance utt = new Utterance();
        if (post.length() > 60) {
            //added by TL 05/13/15
            String[] post_sents = post.split("(?<=[.?!])\\s+(?=[a-zA-Z])");
            for (String post_sent : post_sents) {
                utt.setContent(post_sent);
//                            System.out.println("split utt: " + post_sent);
//                            System.out.println("startx: " + startx);
//                utt.setRank(rank);
                int utt_startx = doc_content.indexOf(post_sent, startx);
//                            System.out.println("utt_startx: " + utt_startx);
                utt.setStartx(utt_startx);
                utt.setEndx(utt_startx + post_sent.length());
                startx = utt_startx + post_sent.length();
                utt.setFilteredContent(post_sent.replaceAll("[\\s]+", " "));
                utt.setSpeaker(speaker);
                utt.setSpeakerStartx(spk_startx);
                utt.setSpeakerEndx(spk_endx);
                utt.setPostTime(null);
                utt.setId(null);
                utt.setFromQuote(in_quote);
                utts.add(utt);
                utt = new Utterance();
            }
        } else {
            utt.setContent(post);
//                utt.setRank(rank);
            int utt_startx = doc_content.indexOf(post, startx);
//                        System.out.println("utt_startx: " + utt_startx);
            utt.setStartx(utt_startx);
            utt.setEndx(utt_startx + post.length());
            startx = utt_startx + post.length();
            utt.setFilteredContent(post.replaceAll("[\\s]+", " "));
            utt.setSpeaker(speaker);
            utt.setSpeakerStartx(spk_startx);
            utt.setSpeakerEndx(spk_endx);
            utt.setPostTime(null);
            utt.setId(null);
            utts.add(utt);
            utt.setFromQuote(in_quote);
        }
        return utts;
    }

    public int getSpk_startx() {
        return spk_startx;
    }

    public void setSpk_startx(int spk_startx) {
        this.spk_startx = spk_startx;
    }

    public int getSpk_endx() {
        return spk_endx;
    }

    public void setSpk_endx(int spk_endx) {
        this.spk_endx = spk_endx;
    }
}
