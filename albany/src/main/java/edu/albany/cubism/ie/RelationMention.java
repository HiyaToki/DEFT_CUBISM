/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.albany.cubism.ie;

/**
 *
 * @author Mehrdad
 */
public class RelationMention {
    private String id;
    private String realis;
    private RelationArg relationArg1;
    private RelationArg relationArg2;
    private Trigger trigger;
//    private String entity_id1;
//    private String entity_mention_id1;
//    private String role1;
//    private String text1;
//    private String entity_id2;
//    private String entity_mention_id2;
//    private String role2;
//    private String text2;
    
    public RelationMention(String id, 
            String realis,
            RelationArg relationArg1,
            RelationArg relationArg2,
            Trigger trigger
//            String entity_id1, 
//            String entity_mention_id1, 
//            String role1, 
//            String text1, 
//            String entity_id2, 
//            String entity_mention_id2, 
//            String role2, 
//            String text2
    ){
        this.id = id;
        this.realis = realis;
        this.relationArg1 = relationArg1;
        this.relationArg2 = relationArg2;
        this.trigger = trigger;
//        this.entity_id1 = entity_id1;
//        this.entity_mention_id1 = entity_mention_id1;
//        this.role1 = role1;
//        this.text1 = text1;
//        this.entity_id2 = entity_id2;
//        this.entity_mention_id2 = entity_mention_id2;
//        this.role2 = role2;
//        this.text2 = text2;        
    }
    
    public String getId(){
        return id;
    }
    
    public String getRealis(){
        return realis;
    }
    
    public RelationArg getRelationArg1(){
        return relationArg1;
    }
    
    public RelationArg getRelationArg2(){
        return relationArg2;
    }
    
    public Trigger getTrigger(){
        return trigger;
    }
}
