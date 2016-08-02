/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.albany.cubism.ie;

import java.util.ArrayList;

/**
 *
 * @author Mehrdad
 */
public class Relation {
    private String id;
    private String type;
    private String subtype;
    private RelationMention relationMention;
    private ArrayList<RelationMention> rms;
//    private RelationArg relationArg1;
//    private RelationArg relationArg2;
//    private Trigger trigger;
//    
//    public Relation(String id, 
//            String type, 
//            String subtype,
//            RelationMention relationMention, 
//            RelationArg relationArg1, 
//            RelationArg relationArg2, 
//            Trigger trigger){
//        this.id = id;
//        this.type = type;
//        this.subtype = subtype;
//        this.relationMention = relationMention;
//        this.relationArg1 = relationArg1;
//        this.relationArg2 = relationArg2;
//        this.trigger = trigger;
//    }

    Relation(String id, String type, String subtype, RelationMention relationMention) {

        this.id = id;
        this.type = type;
        this.subtype = subtype;
        this.relationMention = relationMention;
//        this.relationArg1 = relationArg1;
//        this.relationArg2 = relationArg2;
//        this.trigger = trigger;
    }
    
    Relation(String id, String type, String subtype, ArrayList<RelationMention> relationMentions) {

        this.id = id;
        this.type = type;
        this.subtype = subtype;
        this.relationMention = relationMention;
//        this.relationArg1 = relationArg1;
//        this.relationArg2 = relationArg2;
//        this.trigger = trigger;
    }
    
    public String getId(){
        return id;
    }
    
    public String getType(){
        return type;
    }
    
    public String getSubtype(){
        return subtype;
    }
    
    public RelationMention getRelationMention(){
        return relationMention;
    }

    public ArrayList<RelationMention> getRms() {
        return rms;
    }

    public void setRms(ArrayList<RelationMention> rms) {
        this.rms = rms;
    }
}
