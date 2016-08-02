/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.albany.cubism.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import edu.albany.cubism.util.Settings;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Arrays;

/**
 *
 * @author jrgiarrusso
 */
public class OpenANEW {

    private final String dataurl = "jdbc:mysql://cycles.ss.albany.edu/metaphor_repository?useUnicode=true&characterEncoding=utf-8";
    private final String user = "anassman";
    private final String password = "D0samrD9";
    private Connection con;
    HashMap<String, Double> wsMap = new HashMap<String, Double>();
    HashMap<String, Double> twitterMap = new HashMap<String, Double>();
    private ArrayList<String> non_sent_heads = new ArrayList<String>() {
        {
            add("time_unit");
        }
    };

    public OpenANEW() {
        BufferedReader br = null;
        try {
            String aNewPath = Settings.getValue("ANEW");
            System.out.println("aNew path: " + aNewPath);
            br = new BufferedReader(new FileReader(new File(aNewPath)));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(OpenANEW.class.getName()).log(Level.SEVERE, null, ex);
        }

        String a_line = null;
        int i = 0;
        try {
            while ((a_line = br.readLine()) != null) {
                if (i == 0) {
                    i++;
                    continue;
                }

                i++;
                if (a_line.trim().length() > 0) {
                    String[] tokens = a_line.split("\t");
                    String word = tokens[4].trim();
                    double score = Double.parseDouble(tokens[1]);
                    wsMap.put(word, score);
                }
            }
            br.close();
//                System.out.println("bad_relations: " + bad_relations);
        } catch (IOException ex) {
            System.out.println("No anew_english_hyponym_sept2013.csv");
        }
//        this.loadTwitterSentiWords();
    }

    public void createChineseAnew() {
        BufferedReader br = null;
        StringBuffer c_lexicon = new StringBuffer();
        HashMap<String, ArrayList<Double>> c_lexicons = new HashMap();
        try {
            String aNewPath = Settings.getValue("ANEWToChinese");
            br = new BufferedReader(new FileReader(new File(aNewPath)));
            String a_line = null;
            int i = 0;
            while ((a_line = br.readLine()) != null) {
                if (i == 0) {
                    i++;
                    continue;
                }

                i++;
                if (a_line.trim().length() > 0) {
                    String[] tokens = a_line.split("\t");
                    String e_word = tokens[0].trim();
                    String c_word = tokens[1].trim();
                    double score = this.wordSentimentOf(e_word);
                    ArrayList scores = c_lexicons.get(c_word);
                    if (scores == null) {
                        scores = new ArrayList();
                        c_lexicons.put(c_word, scores);
                    }
                    scores.add(score);
//                    c_lexicon.append(c_word).append("\t").append(score).append("\n");
                }
            }
            br.close();
            ArrayList<String> keys = new ArrayList(Arrays.asList(c_lexicons.keySet().toArray()));
            for (String key : keys) {
                ArrayList<Double> scores = c_lexicons.get(key);
                int p_count = 0;
                double p_total = 0;
                int n_count = 0;
                double n_total = 0;
                for (Double score : scores) {
                    if (score > 0.5) {
                        p_count++;
                        p_total += score;
                    } else if (score < 0.5) {
                        n_count++;
                        n_total += score;
                    }
                }
                if (p_count > n_count) {
                    double c_score = p_total / p_count;
                    c_lexicon.append(key).append("\t").append(c_score);
                } else if (n_count > p_count) {
                    double c_score = n_total / n_count;
                    c_lexicon.append(key).append("\t").append(c_score);
                } else {
                    double c_score = (p_total + n_total) / (p_count + n_count);
                    c_lexicon.append(key).append("\t").append(c_score);
                }
                c_lexicon.append("\n");
            }
            BufferedWriter bw = new BufferedWriter(new FileWriter(new File(Settings.getValue("ANEWChinese"))));
            bw.write(c_lexicon.toString().trim());
            bw.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(OpenANEW.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(OpenANEW.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                br.close();
            } catch (IOException ex) {
                Logger.getLogger(OpenANEW.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void loadTwitterSentiWords() {
        BufferedReader br = null;
        String twitterPath = Settings.getValue(Settings.twitters_sentiment_words);
        try {
            br = new BufferedReader(new FileReader(new File(twitterPath)));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(OpenANEW.class.getName()).log(Level.SEVERE, null, ex);
        }
        String a_line = null;
        int i = 0;
        try {
            while ((a_line = br.readLine()) != null) {
                if (i == 0) {
                    i++;
                    continue;
                }

                i++;
                if (a_line.trim().length() > 0) {
                    String[] tokens = a_line.split(": ");
                    String word = tokens[0].trim();
                    double score = Double.parseDouble(tokens[1].trim());
                    this.twitterMap.put(word, score);
                }
            }
            br.close();
//                System.out.println("bad_relations: " + bad_relations);
        } catch (IOException ex) {
            System.out.println("No anew_english_hyponym_sept2013.csv");
        }
    }

    public Connection getConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            con = DriverManager.getConnection(dataurl, user, password);
        } catch (Exception ex) {
            Logger.getLogger(OpenANEW.class.getName()).log(Level.SEVERE, null, ex);
            System.out.flush();
            System.err.println("Error connecting to database");
            System.exit(1);
        }
        return con;
    }

    public void printTable() {
        if (con == null) {
            con = this.getConnection();
        }
        PreparedStatement ps;
        ResultSet rs;
        try {
            ps = con.prepareStatement("SELECT * FROM DEFT.anew_english_hyponym_sept2013 where id > ?");
            ps.setInt(1, 95555);
            rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getInt("id") + "\t" + rs.getDouble("score") + "\t" + rs.getString("english_derived") + "\t" + rs.getString("word"));
            }

            rs.close();
            ps.close();
        } catch (Exception ex) {
            ex.printStackTrace();
            System.exit(1);
            System.out.flush();
            System.err.println("Error executing query");
        }

    }

    public double wordSentimentOf(String word) {

//        double wordScore = -1;
//        if (con == null) {
//            con = this.getConnection();
//        }
//        PreparedStatement ps;
//        ResultSet rs;
//        try {
//            ps = con.prepareStatement("SELECT score FROM DEFT.anew_english_hyponym_sept2013 where word = ?");
//            ps.setString(1, word);
//            rs = ps.executeQuery();
//            while (rs.next()) {
////                System.out.println(rs.getDouble("score"));
//                wordScore = rs.getDouble("score");
//            }
//
//            rs.close();
//            ps.close();
//        } catch (Exception ex) {
//            ex.printStackTrace();
//            System.exit(1);
//            System.out.flush();
//            System.err.println("Error executing query");
//        }
//
//        return wordScore;
        double wordScore = -1;
        word = word.replaceAll("\"", "");
        if (wsMap.containsKey(word)) {
            return wsMap.get(word);
        }
//        if (this.twitterMap.containsKey(word)) {
//            System.out.println("find a sentiment from twitter sentiment map: " + word);
//            return this.twitterMap.get(word);
//        }
        return wordScore;

    }

    public static void main(String... args) throws SQLException, IOException {
//         new OpenANEW().printTable();
        OpenANEW oa = new OpenANEW();
        oa.createChineseAnew();
//        System.out.println("word senti: " + oa.wordSentimentOf("impressed"));
//        System.out.println("word senti: " + oa.wordSentimentOf("asshat"));
    }
}
