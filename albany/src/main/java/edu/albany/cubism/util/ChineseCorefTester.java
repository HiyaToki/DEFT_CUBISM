/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.albany.cubism.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import edu.stanford.nlp.ling.CoreAnnotations;
import edu.stanford.nlp.ling.CoreLabel;
import edu.stanford.nlp.util.ArraySet;
import edu.stanford.nlp.util.CoreMap;
import edu.stanford.nlp.util.Generics;
import edu.stanford.nlp.util.IntTuple;
import edu.stanford.nlp.util.Pair;
import edu.stanford.nlp.util.StringUtils;
import java.io.*;
import java.util.*;
import edu.stanford.nlp.io.*;
import edu.stanford.nlp.ling.*;
import edu.stanford.nlp.pipeline.*;
import edu.stanford.nlp.process.DocumentPreprocessor;
import edu.stanford.nlp.trees.*;
import edu.stanford.nlp.trees.TreeCoreAnnotations.*;
import edu.stanford.nlp.trees.international.pennchinese.ChineseTreebankLanguagePack;
import edu.stanford.nlp.util.*;

public class ChineseCorefTester {

    public static void main(String[] args) {

        String text = "我住在美国。";
        Annotation document = new Annotation(text);
        Properties props = StringUtils.argsToProperties(args);
        StanfordCoreNLP corenlp = new StanfordCoreNLP(props);
        corenlp.annotate(document);
        System.out.println(document);   
        ChineseCorefTester cct = new ChineseCorefTester();
        cct.SentenceSplitting();
    }

    public void SentenceSplitting() {
        TreebankLanguagePack tlp = new ChineseTreebankLanguagePack();
        String paragraph = "希望全国其他的城市也可以开展这样的行动，早早还老百姓们一个清静的生活空间！特别是伤风败俗，脱衣成名，潜规则交易，要狠抓严打，长抓不懈！！";
        Reader reader = new StringReader(paragraph);
        DocumentPreprocessor dp = new DocumentPreprocessor(reader);
        dp.setSentenceDelimiter("[！]+");
        List<String> sentenceList = new ArrayList<String>();

        for (List<HasWord> sentence : dp) {
            String sentenceString = Sentence.listToString(sentence);
            sentenceList.add(sentenceString.toString());
        }

        for (String sentence : sentenceList) {
            System.out.println(sentence);
        }
    }
}
