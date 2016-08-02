/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.albany.cubism.ie;

import java.util.ArrayList;

/**
 *
 * @author Mehrdad/Ting
 */
public class Entity {
    private String id;
    private String type;
    private String specifity;
    private String ref = null;
    ArrayList<EntityMention> entityMentions = new ArrayList<EntityMention>();
    
    public Entity(String id, String type, String specifity, ArrayList<EntityMention> entityMentions){
        this.id = id;
        this.type = type;
        this.specifity = specifity;
        this.entityMentions = entityMentions;
        for (EntityMention em: entityMentions) {
            em.setParent(this);
            if (em.getEntityMentionNounType().equals("NAM")) {
                if (ref == null) {
                    ref = em.getEntityMentionText();
                }
            }
        }
    }
    
    public String getEntityId(){
        return id;
    }
    
    public String getEntityType(){
        return type;
    }
    
    public String getEntitySpecifity(){
        return specifity;
    }
    
    public ArrayList<EntityMention> getEntityMentions(){
        return entityMentions;
    }
    
    public void setEntityId(String id){
        this.id = id;
    }
    
    public void setEntityType(String type){
        this.type = type;
    }
    
    public void setSpecifity(String specifity){
        this.specifity = specifity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }
    
    public EntityMention containsEntity(int startx, int endx, String name) {
        for (EntityMention em: entityMentions) {
//            System.out.println("em startx: " + em.getEntityMentionOffset() + "    " + em.getEntityMentionText());
            if (em.getEntityMentionOffset() >= startx &&
                    em.getEntityMentionOffset() <= endx ||
                    em.getEntityMentionOffset() + em.getEntityMentionLength() >= startx &&
                    em.getEntityMentionOffset() + em.getEntityMentionLength() <= endx) {
                if (em.getEntityMentionText().equals(name) ||
                        name.contains(em.getEntityMentionText())) {
                    return em;
                }
            }
        }
        return null;
    }
}
