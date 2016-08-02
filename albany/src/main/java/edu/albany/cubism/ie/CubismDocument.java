/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.albany.cubism.ie;

import edu.albany.cubism.relation.Utterance;
import java.util.ArrayList;

/**
 *
 * @author ting
 */
public class CubismDocument {
    String name = null;
    String uri = null;
    String oriDoc = null;
    ArrayList<OldEntity> entities = null;
    ArrayList<OldRelation> relations = null;
    ArrayList<Event> events = null;
    ArrayList<Utterance> utts = null;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public String getOriDoc() {
        return oriDoc;
    }

    public void setOriDoc(String oriDoc) {
        this.oriDoc = oriDoc;
    }

    public ArrayList<OldEntity> getEntities() {
        return entities;
    }

    public void setEntities(ArrayList<OldEntity> entities) {
        this.entities = entities;
    }

    public ArrayList<OldRelation> getRelations() {
        return relations;
    }

    public void setRelations(ArrayList<OldRelation> relations) {
        this.relations = relations;
    }

    public ArrayList<Event> getEvents() {
        return events;
    }

    public void setEvents(ArrayList<Event> events) {
        this.events = events;
    }

    public ArrayList<Utterance> getUtts() {
        return utts;
    }

    public void setUtts(ArrayList<Utterance> utts) {
        this.utts = utts;
    }
}
