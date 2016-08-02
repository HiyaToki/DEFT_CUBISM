/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.albany.cubism.relation;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import edu.albany.cubism.ie.CharSeq;
import edu.albany.cubism.ie.EntityMention;
import edu.albany.cubism.ie.EventMention;
import edu.albany.cubism.ie.OldRelationMention;
import edu.albany.cubism.ie.OldRelation;
import edu.albany.cubism.ie.RelationMention;
import edu.albany.cubism.ie.ReplaceWordData;
import edu.albany.cubism.sentiment.NewswireFindAnnotation;

/**
 *
 * @author cslin
 */
public class Node implements Comparable<Node>, Serializable{
    private int        id;
    private String     name;
    private String     pos;
    private String     stemmedWord;
    private String     lemmaWord;
    private String     wholePhrase;
    private boolean bad_node; //for m4
    private int startx;
    private int endx;
    private String entity_type;
    private String annoteEntity;
    private CharSeq entity = null;
    private EntityMention ere_entity = null;
    private RelationMention ere_relation_mention = null;
    private EventMention ere_event = null;
    private ArrayList<ReplaceWordData> refs = null;
    private OldRelationMention relMen = null;
    private edu.albany.cubism.ie.OldRelation rel = null;
    private static final long serialVersionUID = 30135220683341766L;
    private boolean isQuery = false;
    private boolean hasNeg = false;
    private double sentiment = -1;
    
    public String getLemmaWord() {
        if (lemmaWord == null) {
            System.out.println("lemmaword is null, return original word: " + name);
            return name;
        }
        return lemmaWord;
    }

    public void setLemmaWord(String lemmaWord) {
        this.lemmaWord = lemmaWord;
    }
    public double minDist = Double.POSITIVE_INFINITY;
    public ArrayList<Edge> adjacencies = new ArrayList<Edge>();

    public ArrayList<Edge> getAdjacencies() {
        return adjacencies;
    }
    public Node previous;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPos() {
        return pos;
    }

    public boolean isBadNode() {
        return bad_node;
    }
    public String getWholePhrase(){
        return wholePhrase;
    }
    public void setWholePhrase(String wP){
        wholePhrase=wP;
    }

    public boolean equal(String name, String pos) {
        if (this.name.equalsIgnoreCase(name) && this.pos.equalsIgnoreCase(pos))
            return true;
        return false;
    }
    
    public boolean equal(String name) {
        if (this.name.equalsIgnoreCase(name))
            return true;
        return false;
    }
    
    
    public Node( int id, String nm, String pos )
    {
        this.id=id;
        this.name = nm;
        this.pos=pos;         
    }
    
    public void setName(String name) {
        this.name = name;
    }

    
    public int compareTo(Node o) {
        return Double.compare(minDist, o.minDist);
    }

    public void setBadNode(boolean bad_node) {
        this.bad_node = bad_node;
    }
    @Override
    public String toString() {
        StringBuffer out = new StringBuffer();
        out.append("name: " + name + " , POS: " + pos);
        return out.toString();
    }

    public int getStartx() {
        return startx;
    }

    public int getEndx() {
        return endx;
    }

    public String getEntityType() {
        return entity_type;
    }

    public String getAnnoteEntity() {
        return annoteEntity;
    }

    public void setStartx(int startx) {
        this.startx = startx;
    }

    public void setEndx(int endx) {
        this.endx = endx;
    }

    public void setEntityType(String entity_type) {
        this.entity_type = entity_type;
    }

    public void setAnnoteEntity(String annoteEntity) {
        this.annoteEntity = annoteEntity;
    }

    public void setEntity(CharSeq entity) {
        this.entity = entity;
    }

    public CharSeq getEntity() {
        return entity;
    }

    public void setEntityRefs(ArrayList<ReplaceWordData> refs) {
        this.refs = refs;
    }

    public ArrayList<ReplaceWordData> getEntityRefs() {
        return this.refs;
    }

    public OldRelationMention getRelMen() {
        return relMen;
    }

    public OldRelation getRel() {
        return rel;
    }

    public void setRel(OldRelation rel) {
        this.rel = rel;
    }

    public void setRelMen(OldRelationMention relMen) {
        this.relMen = relMen;
    }

    public boolean hasRefs(String ref) {
	if (refs == null)  {
//            System.out.println("no refs: " + this.entity + " " + this.name);
	    return false;
	}
//        System.out.println("ref: " + ref);
//        System.out.println("node name: " + this.entity.keyWord);
	for (ReplaceWordData reff: refs) {
//            System.out.println("reff: " + reff.replaceWord);
	    if ((reff.replaceWord.replaceAll("[\\s]+", " ").contains(ref)
                    && !(reff.replaceWord.endsWith("New York London")
                    && ref.equals("London")))||
                    ref.contains(reff.replaceWord.replaceAll("[\\s]+", " "))) {
                return true;
            }
	}
        return false;
     }
 
    public void setIsQuery(boolean isQuery) {
        this.isQuery = isQuery;
    }

    public boolean isIsQuery() {
        return isQuery;
    }

    public EntityMention getEre_entity() {
        return ere_entity;
    }

    public void setEre_entity(EntityMention ere_entity) {
        this.ere_entity = ere_entity;
    }

    public RelationMention getEreRelationMention() {
        return ere_relation_mention;
    }

    public void setEreRelationMention(RelationMention ere_relation) {
        this.ere_relation_mention = ere_relation;
    }

    public EventMention getEreEventMention() {
        return ere_event;
    }

    public void setEreEventMention(EventMention eve_event) {
        this.ere_event = eve_event;
    }

    public boolean isHasNeg() {
        return hasNeg;
    }

    public void setHasNeg(boolean hasNeg) {
        this.hasNeg = hasNeg;
    }

    public double getSentiment() {
        return sentiment;
    }

    public void setSentiment(double neg) {
        this.sentiment = neg;
    }
    
}
