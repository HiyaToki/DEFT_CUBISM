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
public class Filler {
    String id;
    String source;
    int offset;
    int length;
    String type;
    String nom_time;
    String text;
    
    public Filler(String id, String source, int offset, int length, String type, String nom_time, String text){
        this.id = id;
        this.source = source;
        this.offset = offset;
        this.length = length;
        this.type = type;
        this.nom_time = nom_time;
        this.text = text;
    }
}
