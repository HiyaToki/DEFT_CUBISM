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
public class EventMention {

    private String id;
    private String type;
    private String subtype;
    private String realis;
    private ArrayList<EventMentionArgEntity> eventMentionArgEntity;
    private ArrayList<EventMentionArgFiller> eventMentionArgFiller;
    private Trigger trigger;
    private Event parent;

    public EventMention(String id,
            String type,
            String subtype,
            String realis,
            ArrayList<EventMentionArgEntity> eventMentionArgEntity,
            ArrayList<EventMentionArgFiller> eventMentionArgFiller,
            Trigger trigger) {
        this.id = id;
        this.type = type;
        this.subtype = subtype;
        this.realis = realis;
        this.eventMentionArgEntity = eventMentionArgEntity;
        this.eventMentionArgFiller = eventMentionArgFiller;
        this.trigger = trigger;
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
    
    public String getRealis(){
        return realis;
    }
    
    public ArrayList<EventMentionArgEntity> getEventMentionArgEntity(){
        return eventMentionArgEntity;
    }
    
    public ArrayList<EventMentionArgFiller> getEventMentionArgFiller(){
        return eventMentionArgFiller;
    }
    
    public Trigger getTrigger(){
        return trigger;
    }

    public Event getParent() {
        return parent;
    }

    public void setParent(Event parent) {
        this.parent = parent;
    }
}
