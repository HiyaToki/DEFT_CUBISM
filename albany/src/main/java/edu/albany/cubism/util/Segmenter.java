/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.albany.cubism.util;

import edu.stanford.nlp.ie.crf.CRFClassifier;
import edu.stanford.nlp.ling.CoreLabel;
import java.io.PrintStream;
import java.util.List;
import java.util.Properties;
import edu.albany.cubism.relation.Graph;

/**
 *
 * @author mehrdad
 */
public class Segmenter {
    private static final String basedir = "/Users/ting/NetBeansProjects/deft_2.3/stanford_parser_chinese/stanford-parser-full-2015-12-09/stanford-segmenter-2015-12-09/data";
    private CRFClassifier<CoreLabel> segmenter = null;
    public Segmenter() {
        System.out.println("basedir: " + basedir);
        Properties props = new Properties();
        props.setProperty("sighanCorporaDict", basedir);
    // props.setProperty("NormalizationTable", "data/norm.simp.utf8");
        // props.setProperty("normTableEncoding", "UTF-8");
        // below is needed because CTBSegDocumentIteratorFactory accesses it
        props.setProperty("serDictionary", basedir + "/dict-chris6.ser.gz");
        props.setProperty("inputEncoding", "UTF-8");
        props.setProperty("sighanPostProcessing", "true");

        this.segmenter = new CRFClassifier<CoreLabel>(props);
        segmenter.loadClassifierNoExceptions(basedir + "/ctb.gz", props);
        
    }
    
    public String segment(String sentence) {
        List<String> segmented = segmenter.segmentString(sentence);
        String segments = "";
        for (int i = 0; i < segmented.size()-1; i++){
            segments = segments + segmented.get(i)+" ";
        }
        segments = segments + segmented.get(segmented.size()-1);
        return segments;
    }

    public static void main(String[] args) throws Exception {
        Segmenter seg = new Segmenter();
        String sample = "我住在美国。我住在美国。我住在美国。";
        String segmented = seg.segment(sample);
        System.out.println(segmented);
        
        System.out.println(sample);
        
        System.out.println("Segmented Sentence: " + segmented);

        StanfordChineseParser sp_ = new StanfordChineseParser();
        Graph g = new Graph();
        sp_.buildDependcyGraph(segmented, g);
        System.out.println();
    }
}
