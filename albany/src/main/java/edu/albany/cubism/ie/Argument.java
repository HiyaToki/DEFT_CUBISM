/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.albany.cubism.ie;

/**
 *
 * @author ting
 */
public class Argument {

    String ref_id; //name entity/entity mention id
    String rel_ref_id; //relation/relation mention id that the argument belong to
    String role; //arg1 or arg2
    int startOffset;
    int endOffset;
    String content;

    public Argument(String ref_id, String role, int startOffset, int endOffset, String content) {
        this.content = content;
        this.endOffset = endOffset;
        this.ref_id = ref_id;
        this.role = role;
        this.startOffset = startOffset;
    }

    public String getRelRefId() {
        return rel_ref_id;
    }

    public void setRelRefId(String rel_ref_id) {
        this.rel_ref_id = rel_ref_id;
    }

}
