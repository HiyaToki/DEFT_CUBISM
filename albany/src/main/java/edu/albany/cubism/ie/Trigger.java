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
public class Trigger {
    private String source;
    private int offset;
    private int length;
    private String text;
    
    public Trigger(String source, int offset, int length, String text){
        this.source = source;
        this.offset = offset;
        this.length = length;
        this.text = text;
    }
    
    public String getSource(){
         return source;
    }
    
    public int getOffset(){
        return offset;
    }
    
    public int getLength(){
        return length;
    }
    
    public String getText(){
        return text;
    }
}
