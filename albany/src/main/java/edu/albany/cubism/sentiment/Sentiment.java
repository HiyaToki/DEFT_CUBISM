/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.albany.cubism.sentiment;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import edu.albany.cubism.relation.Node;

/**
 *
 * @author Mehrdad
 */
public class Sentiment {

    private int start;
    private int end;
    private String context;
    private String slot;
    private String originalQueryName;
    private String relation;
    private Double strength;
    private String foundAnswer;
    private Node query;
    private Node target;

    public Sentiment(int start,
            int end,
            String context,
            String slot,
            String oqn,
            String relation,
            Double strength,
            String foundAnswer) {
        this.start = start;
        this.end = end;
        this.context = context;
        this.slot = slot;
        this.originalQueryName = oqn;
        this.relation = relation;
        this.strength = strength;
        this.foundAnswer = foundAnswer;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public void setSlot(String slot) {
        this.slot = slot;
    }

    public void setOriginalQueryName(String originalQueryName) {
        this.originalQueryName = originalQueryName;
    }

    public void setRelation(String relation) {
        this.relation = relation;
    }

    public void setStrength(Double strength) {
        this.strength = strength;
    }

    public void setFoundAnswer(String foundAnswer) {
        this.foundAnswer = foundAnswer;
    }

    public void setQuery(Node query) {
        this.query = query;
    }

    public void setTarget(Node target) {
        this.target = target;
    }

    public Double getStrength() {
        return strength;
    }

    public Node getQuery() {
        return query;
    }

    public Node getTarget() {
        return target;
    }
    
    public int getStart(){
        return start;
    }
    
    public int getEnd(){
        return end;
    }
    
    public String getContext(){
        return context;
    }
    
    public String getSlot(){
        return slot;
    }
    
    public String getOriginalQueryName(){
        return originalQueryName;
    }
    
    public String getRelation(){
        return relation;
    }
    
    public Double getStrenght(){
        return strength;
    }
    
    public String getFoundAnswer(){
        return foundAnswer;
    }
    
}
