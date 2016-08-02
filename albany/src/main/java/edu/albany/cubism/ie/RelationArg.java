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
public class RelationArg {
    private String entity_id;
    private String entity_mention_id;
    private String role;
    private String text;
    
    public RelationArg(String entity_id, 
            String entity_mention_id, 
            String role, 
            String text){
        this.entity_id = entity_id;
        this.entity_mention_id = entity_mention_id;
        this.role = role;
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
    
    public String getText(){
        return text;
    }
}
