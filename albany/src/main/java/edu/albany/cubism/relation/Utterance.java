/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.albany.cubism.relation;

import edu.albany.cubism.ie.EntityMention;
import java.util.ArrayList;

/**
 * For forum data
 * @author ting
 */
public class Utterance {
    private String speaker = null;
    private String content = null;
    private String filtered_content = null;
    private Graph content_graph = null;
    private String query = null;
    private int startx = -1;
    private int endx = -1;
    private String id = null;
    private int rank = -1;
    private ArrayList<Relation> rels = new ArrayList();
    private String post_time;
    private int speaker_start = -1;
    private int speaker_end = -1;
    private boolean from_quote = false;
    private EntityMention spk_mention = null;
    
    public Utterance() {
        
    }

    public String getSpeaker() {
        return speaker;
    }

    public String getContent() {
        return content;
    }

    public String getFilteredContent() {
        return filtered_content;
    }

    public Graph getContentGraph() {
        return content_graph;
    }

    public String getQuery() {
        return query;
    }

    public int getStartx() {
        return startx;
    }

    public int getEndx() {
        return endx;
    }

    public String getId() {
        return id;
    }

    public int getRank() {
        return rank;
    }

    public ArrayList<Relation> getRels() {
        return rels;
    }

    public String getPostTime() {
        return post_time;
    }

    public void setPostTime(String post_time) {
        this.post_time = post_time;
    }

    public boolean isFromQuote() {
        return from_quote;
    }

    public void setFromQuote(boolean from_quote) {
        this.from_quote = from_quote;
    }

    public void addRel(Relation rel) {
        this.rels.add(rel);
    }
    
    public void setRels(ArrayList<Relation> rels) {
        this.rels = rels;
    }
    
    public void setId(String id) {
        this.id = id;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public void setSpeaker(String speaker) {
        this.speaker = speaker;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setFilteredContent(String content) {
        this.filtered_content = content.replaceAll("[\\s]+", " ");
    }

    public void setContentGraph(Graph content_graph) {
        this.content_graph = content_graph;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public void setStartx(int startx) {
        this.startx = startx;
    }

    public void setEndx(int endx) {
        this.endx = endx;
    }

    public int getSpeakerStartx() {
        return speaker_start;
    }

    public void setSpeakerStartx(int speaker_start) {
        this.speaker_start = speaker_start;
    }

    public int getSpeakerEndx() {
        return speaker_end;
    }

    public void setSpeakerEndx(int speaker_end) {
        this.speaker_end = speaker_end;
    }

    public EntityMention getSpk_mention() {
        return spk_mention;
    }

    public void setSpk_mention(EntityMention spk_mention) {
        this.spk_mention = spk_mention;
    }
    
    @Override
    public String toString() {
        return speaker + "  " + this.content;
    }
    
}
