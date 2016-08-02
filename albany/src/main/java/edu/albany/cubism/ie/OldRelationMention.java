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
public class OldRelationMention {

    public int startOffset;
    public int endOffset;
    public String context;
    public ArrayList<Argument> args;
    public String id;

    public OldRelationMention(int startOffset, int endOffset, String context, ArrayList<Argument> args, String id) {
        this.startOffset = startOffset;
        this.endOffset = endOffset;
        this.context = context;
        this.args = args;
    }
}
