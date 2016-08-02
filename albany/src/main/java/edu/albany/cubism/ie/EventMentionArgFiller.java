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
public class EventMentionArgFiller {
    private String filler_id;
    private String role;
    private String realis;
    private String text;
    
    public EventMentionArgFiller(String filler_id, String role, String realis, String text){
        this.filler_id = filler_id;
        this.role = role;
        this.realis = realis;
        this.text = text;                
    }
    
    public String getFillerId(){
        return filler_id;
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
