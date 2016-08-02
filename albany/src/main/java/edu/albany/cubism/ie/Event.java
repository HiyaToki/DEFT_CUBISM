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
public class Event {

    private String id;
    private EventMention eventMention; 
    private ArrayList<EventMention> evms;

    public Event(String id, ArrayList<EventMention> evms) {
        this.id = id;
        this.evms = evms;
    }
    
    public Event(String id, EventMention eventMention){
        this.id = id;
        this.eventMention = eventMention;
        this.eventMention.setParent(this);
    }

    public String getEventId() {
        return id;
    }
    
    public EventMention getEventMention(){
        return eventMention;
    }
    
    public void setEventId(String id){
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<EventMention> getEvms() {
        return evms;
    }

    public void setEvms(ArrayList<EventMention> evms) {
        this.evms = evms;
    }

}
