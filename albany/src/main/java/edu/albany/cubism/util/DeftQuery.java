/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.albany.cubism.util;

/**
 *
 * @author ting
 */
public class DeftQuery {
    String query_id = null;
    String name = null;
    String startx = "-1";
    String endx = "-1";
    String entity_type = null;
    String slot = null;
    String docid = null;

    public DeftQuery() {
    }

    public String getDocid() {
        return docid;
    }

    public void setDocid(String docid) {
        this.docid = docid;
    }

    
    public String getQuery_id() {
        return query_id;
    }

    public void setQuery_id(String query_id) {
        this.query_id = query_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStartx() {
        return startx;
    }

    public void setStartx(String startx) {
        this.startx = startx;
    }

    public String getEndx() {
        return endx;
    }

    public void setEndx(String endx) {
        this.endx = endx;
    }

    public String getEntity_type() {
        return entity_type;
    }

    public void setEntity_type(String entity_type) {
        this.entity_type = entity_type;
    }

    public String getSlot() {
        return slot;
    }

    public void setSlot(String slot) {
        this.slot = slot;
    }
}
