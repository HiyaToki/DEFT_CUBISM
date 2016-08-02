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
public class EventMentionArgEntity {
    private String entity_id;
    private String entity_mention_id;
    private String role;
    private String realis;
    private String text;
    
    public EventMentionArgEntity(String entity_id, String entity_mention_id, String role, String realis, String text){
        this.entity_id = entity_id;
        this.entity_mention_id = entity_mention_id;
        this.role = role;
        this.realis = realis;
        this.text = text;
    }
    
    public String getEntityId(){
        return entity_id;
    }
    
    public String getEntityMentionId(){
        return entity_mention_id;
    }
    
    public String getRole(){
        return role;
    }
    
    public String getRealis(){
        return realis;
    }
    
    public String getText(){
        return text;
    }
}
