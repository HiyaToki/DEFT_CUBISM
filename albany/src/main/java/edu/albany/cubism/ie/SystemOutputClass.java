/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.albany.cubism.ie;

/**
 *
 * @author meenakshi
 */
public class SystemOutputClass {

    private String source;
    private String s_content;
    private int s_offset;
    private int s_length;
    private String target;
    private String t_content;
    private int t_offset;
    private int t_length;
    private String sourceFile;

    public void setSourceFile(String sourceFile) {
        this.sourceFile = sourceFile;
    }

    public String getSourceFile() {
        return sourceFile;
    }
    private String sentiment;

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public String getSentiment() {
        return sentiment;
    }

    public void setSentiment(String sentiment) {
        this.sentiment = sentiment;
    }

    public String getS_content() {
        return s_content;
    }

    public void setS_content(String s_content) {
        this.s_content = s_content;
    }

    public int getS_offset() {
        return s_offset;
    }

    public void setS_offset(int s_offset) {
        this.s_offset = s_offset;
    }

    public int getS_length() {
        return s_length;
    }

    public void setS_length(int s_length) {
        this.s_length = s_length;
    }

    public String getT_content() {
        return t_content;
    }

    public void setT_content(String t_content) {
        this.t_content = t_content;
    }

    public int getT_offset() {
        return t_offset;
    }

    public void setT_offset(int t_offset) {
        this.t_offset = t_offset;
    }

    public int getT_length() {
        return t_length;
    }

    public void setT_length(int t_length) {
        this.t_length = t_length;
    }

}
