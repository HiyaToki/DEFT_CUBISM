/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.albany.cubism.ie;

import edu.albany.cubism.relation.Node;
import java.util.ArrayList;

/**
 *
 * @author Ting
 */
public class SentimentMention {
    private EntityMention source = null;
    private Object target = null;
    private int strength = 0;
    private double confidence = -1;
    private String justification;
    private int startx;
    private int endx;
    private String slot = null;
    private String source_file = null;
    private ArrayList<Node> relations = null;
    private double sent_score = -100;
    
    public EntityMention getSource() {
        return source;
    }

    public void setSource(EntityMention source) {
        this.source = source;
    }

    public Object getTarget() {
        return target;
    }

    public void setTarget(Object target) {
        this.target = target;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public double getConfidence() {
        return confidence;
    }

    public void setConfidence(double confidence) {
        this.confidence = confidence;
    }

    public String getJustification() {
        return justification;
    }

    public void setJustification(String justification) {
        this.justification = justification;
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

    public String getSlot() {
        return slot;
    }

    public void setSlot(String slot) {
        this.slot = slot;
    }

    public String getSource_file() {
        return source_file;
    }

    public void setSource_file(String source_file) {
        this.source_file = source_file;
    }

    public ArrayList<Node> getRelations() {
        return relations;
    }

    public void setRelations(ArrayList<Node> relations) {
        this.relations = relations;
    }

    public double getSent_score() {
        return sent_score;
    }

    public void setSent_score(double sent_score) {
        this.sent_score = sent_score;
    }
    @Override
    public String toString() {
        StringBuffer out = new StringBuffer();
        System.out.println("this.source: " + this.source.getEntityMentionsource());
        out.append("source: ").append(this.source.getEntityMentionId()).append("/").append(this.source.getParent().getEntityId()).append("  ---  ").append(this.source.getEntityMentionText()).append("\n");
        out.append("target: ").append(((EntityMention)this.target).getEntityMentionId()).append("/").append(((EntityMention)this.target).getParent().getEntityId()).append("  ---  ").append(((EntityMention)this.target).getEntityMentionText()).append("\n");
        out.append("relation: ").append(this.relations).append("\n");
        out.append("polarity: ").append(this.slot).append("\n");
        out.append("score: ").append(this.sent_score).append("\n");
        out.append("context: ").append(this.justification).append("\n");
        return out.toString();
    }
    
}
