/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.albany.cubism.util;

/**
 *
 * @author ting
 */
public class ChineseSentenceSplitter {

    public static String[] splitSents(String passage) {
        String[] post_sents = passage.split("(?<=[。？！])(?=[一-龥a-zA-Z0-9])");
        for (String sent: post_sents) {
            System.out.println("sent: " + sent);
        }
        return post_sents;
    }
    
    public static void main(String[] args) {
        ChineseSentenceSplitter.splitSents("希望全国其他的城市也可以开展这样的行动，早早还老百姓们一个清静的生活空间！特别是伤风败俗，脱衣成名，潜规则交易，要狠抓严打，长抓不懈！！");
    }

}
