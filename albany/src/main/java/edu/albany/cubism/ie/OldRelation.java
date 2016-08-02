/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.albany.cubism.ie;

import java.util.ArrayList;

/**
 *
 * @author ting
 */
public class OldRelation {

    public String type;
    public String subtyp;
    public ArrayList<Argument> args;
    public ArrayList<OldRelationMention> relMens;

    public OldRelation(String type, String subtype, String id, ArrayList<Argument> args, ArrayList<OldRelationMention> relMens) {
        this.args = args;
        this.relMens = relMens;
    }

}
