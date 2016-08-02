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
public class Sentiment {
    private ArrayList<SentimentMention> mentions = new ArrayList();
    private Entity source;
    private Object target;
    private double confidence = -1;

    public ArrayList<SentimentMention> getMentions() {
        return mentions;
    }

    public void setMentions(ArrayList<SentimentMention> mentions) {
        this.mentions = mentions;
    }

    public Entity getSource() {
        return source;
    }

    public void setSource(Entity source) {
        this.source = source;
    }

    public Object getTarget() {
        return target;
    }

    public void setTarget(Object target) {
        this.target = target;
    }

    public double getConfidence() {
        return confidence;
    }

    public void setConfidence(double confidence) {
        this.confidence = confidence;
    }
}
