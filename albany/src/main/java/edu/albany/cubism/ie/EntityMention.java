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
public class EntityMention {
    private String id;
    private String noun_type;
    private String source;
    private int offset;
    private int length;
    private String text;
    private NomHead nom_head;
    private Entity parent;
    
//    EntityMention(String id, String noun_type, String source, int offset, int length, String text, NomHead nom_head){
//        this.id = id;
//        this.noun_type = noun_type;
//        this.source = source;
//        this.offset = offset;
//        this.length = length;
//        this.text = text;
//        this.nom_head = nom_head;
//    }

    EntityMention(String id, String noun_type, String source, int offset, int length, String text, NomHead nom_head) {
        this.id = id;
        this.noun_type = noun_type;
        this.source = source;
        this.offset = offset;
        this.length = length;
        this.text = text;
        this.nom_head = nom_head;
    }

    
    public String getEntityMentionId(){
        return id;
    }
    
    public String getEntityMentionNounType(){
        return noun_type;
    }
    
    public String getEntityMentionsource(){
        return source;
    }
    
    public int getEntityMentionOffset(){
        return offset;
    }
    
    public int getEntityMentionLength(){
        return length;
    }
    
    public String getEntityMentionText(){
        return text;
    }
    
    public NomHead getNomHead(){
        return nom_head;
    }
        
    public void setEntityMentionId(String id){
        this.id = id;
    }
    
    public void setEntityMentionNounType(String noun_type){
        this.noun_type = noun_type;
    }
    
    public void setEntityMentionSource(String source){
        this.source = source;
    }
    
    public void setEntityMentionOffset(int offset){
        this.offset = offset;
    }
    
    public void setEntityMentionLength(int length){
        this.length = length;
    }
    
    public void setEntityMentionText(String text){
        this.text = text;
    }
    
    public void setNomHead (NomHead nomHead){
        this.nom_head = nomHead;
    }

    public Entity getParent() {
        return parent;
    }

    public void setParent(Entity parent) {
        this.parent = parent;
    }
        
}