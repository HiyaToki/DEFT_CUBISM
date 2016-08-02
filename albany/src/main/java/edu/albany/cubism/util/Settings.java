package edu.albany.cubism.util;
//Author: Ken Sta
//**Settings class holds variables contained in the configuration file **//

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Comments for config file #lines beginning with # are comments, format is
 * key='value' #can define variables using $, must be defined before using
 * #values are parsed based on ' and '' puts ' in the value #please make sure to
 * match opening and closing quotes
 *
 */
public abstract class Settings {

    //location of config file
    private static String location = "./src/main/resources/us/albany/cubism/config.txt";
    public static final String TOPICTERMS = "topicterms";
    public static final String EMOTES = "emotes";
    public static final String SPANISH_EMOTES = "spanish_emotes";
    public static final String MALES = "malenames";
    public static final String ANEW = "anewfile";
    public static final String SPANISHANEW = "spanishanewfile";
    public static final String FARSIANEW = "farsianewfile";
    public static final String FEMALES = "femalenames";
    public static final String PW = "pw";
    public static final String NW = "nw";
    public static final String POLARITY_CUES = "polarity_cues";
    public static final String POSI_CONFS = "posi_confs";
    public static final String NEG_CONFS = "neg_confs";
    public static final String AFIRST_WORDS = "afirst_words";
    public static final String ACFIRST_WORDS = "acfirst_words";
    public static final String AAFIRST_WORDS = "aafirst_words";
    public static final String AACFIRST_WORDS = "aacfirst_words";
    public static final String STOP_WORDS = "stop_words";
    public static final String SPANISH_STOP_WORDS = "spanish_stop_words";
    public static final String RUSSIAN_STOP_WORDS = "russian_stop_words";
    public static final String EMOTIVE_WORDS = "emotive_words";
    public static final String PROCESS_TYPE = "process_type";
    public static final String REPORT = "report";
    public static final String TRAINING = "training";
    public static final String YES = "yes";
    public static final String NO = "no";
    public static final String WEB_SERVICE = "web_service";
    public static final String Processed_pids = "processed_list_path";
    public static final String Processed_pgs = "processed_passages_path";
//    public static final String URDU = "urdu";
    public static final String URDU_PATH = "urduTagPath";
    private static HashMap<String, String> settings;
    private static HashMap<String, String> variables;
    private static boolean initialized = false;
    //m2w: chinese . 5/17/11 1:43 PM
//    public static final String CHINESE = "chinese";
//    public static final String CHINESE_PATH = "chineseTagPath";
    public static final String LANGUAGE = "language";
    public static final String domain = "domain";
    public static final String POS_ENGLISH_MODEL = "posEnglishModel";
    public static final String POS_CHINESE_MODEL = "posChineseModel";
    public static final String CHINESE_SEG_DATA_DIR = "ChineseSegDataDir";
    public static final String POS_CHINESE_PROPS = "posChineseProps";
    public static final String RU_GENITIVE = "ru_genitive";
    public static final String RU_GENITIVE_PREFIX = "ru_genitive_prefix";
    public static final String FREELINGDIR = "freelingdir";
    public static final String GOOGLE_DOWNLOAD_DIR = "google_download_dir";
    public static final String BAD_RELATIONS = "bad_relations";
    public static final String TWITTER_NEG_RELATIONS = "twitter_neg_relations";
    public static final String TWITTER_POS_RELATIONS = "twitter_pos_relations";
    public static final String GOOD_NEG_RELATIONS = "good_neg_relations";
    public static final String GOOD_POS_RELATIONS = "good_pos_relations";
    public static final String twitters_sentiment_words = "twitters_sentiment_words";

    public static void initialize() {
        settings = new HashMap();
        variables = new HashMap();
        String curr_path = System.getProperty("user.dir");
//        System.out.println("curr_path(in intialize of Settings): " + curr_path);
        if (curr_path.endsWith("test-classes")) {
            location = curr_path+"/us/ihmc/cubism/sociolinguistics/config.txt";
        }
        File settingsFile = new File(location);
        try {
            BufferedReader br = new BufferedReader(new FileReader(settingsFile));
            while (br.ready()) {
                String lineOfData = br.readLine();
                parseSettingsLine(lineOfData);
            }
            initialized = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void parseSettingsLine(String param) {
        //System.out.println("processing: " + param);
        if (param.length() > 0) {
            if (param.charAt(0) != '#' && param.charAt(0) != '$') {
                String setKey = "";
                String setVal = "";
                int i;
                for (i = 0; i < param.length() && param.charAt(i) != '='; i++) {
                    if (!Character.isWhitespace(param.charAt(i))) {
                        setKey += param.charAt(i);
                    }
                }
//                System.out.println("setKey: " + setKey);
//                System.out.println("param.substring(i + 1): " + param.substring(i + 1));
                setVal = resolveValue(param.substring(i + 1));
//                System.out.println("setKey + setVal: " + setKey + " ====== " + setVal);
                settings.put(setKey, setVal);
            } else if (param.charAt(0) == '$') {
                String varKey = "";
                String varVal = "";
                int i;
                for (i = 1; (i < param.length()) && param.charAt(i) != '='; i++) {
                    if (!Character.isWhitespace(param.charAt(i))) {
                        varKey += param.charAt(i);
                    }
                }
                varVal = resolveValue(param.substring(i + 1));
//                System.out.println("varKey: " + varKey);
                if (varKey.equals("cubism")) {
                    String curr_path = System.getProperty("user.dir");
//                    System.out.println("curr_path(in parseSettingsLine of Settings): " + curr_path);
                    if (curr_path.endsWith("test-classes") ||
                            curr_path.endsWith("test-classes/")) {
                        varVal = curr_path+"/us/ihmc/cubism/sociolinguistics/";
                    }
                }
                if (varKey.equals("conf")) {
                    String curr_path = System.getProperty("user.dir");
//                    System.out.println("curr_path(in parseSettingsLine of Settings): " + curr_path);
                    if (curr_path.endsWith("test-classes")) {
                        varVal = curr_path+"/us/ihmc/cubism/sociolinguistics/conf/";
                    }
                }
//                System.out.println("varVal: " + varVal);
                variables.put(varKey, varVal);
            }
        }
//        System.out.println("variables: " + variables);
    }

    private static String resolveValue(String param) {
        String retval = "";
        String p = param.trim();
        ArrayList<String> tokens = new ArrayList();
        int i = 0;
        char quote = '\'';
//        System.out.println("param: " + p);
        while (i < p.length()) {
            String token = "";
            if (p.charAt(i) == quote) {
                i++;
                if (i < p.length() && p.charAt(i) == quote) {
                    token += quote;
                    i++;
                }
                //ok got the first case of 2 single quotes out of the way
                while (i < p.length() && p.charAt(i) != quote) {
                    token += p.charAt(i);
                    i++;
                    if (i < p.length() && p.charAt(i) == quote) {
                        i++;
                        if (i < p.length() && p.charAt(i) == quote) {
                            token += quote;
                            i++;
                        } else {
                            i--;
                        }
                        //double quote found, so add a single quote and continue parsing
                    }
                }
                i++;
            } else if (p.charAt(i) == '$') {
                i++;
                while (i < p.length() && !Character.isWhitespace(p.charAt(i))) {
                    token += p.charAt(i);
                    i++;
                }
//                System.out.println("token: " + token);
                if (!variables.containsKey(token)) {
                    System.err.println("Error in the configuration file. " + token);
                }
                token = variables.get(token);
            }
            while (i < p.length() && Character.isWhitespace(p.charAt(i))) {
                i++;
            }
            while (i < p.length() && p.charAt(i) != '$' && p.charAt(i) != quote) {
                i++;
            }
            if (token != null && token.length() > 0) {
                tokens.add(token);
            }
        }
        for (i = 0; i < tokens.size(); i++) {
            retval += tokens.get(i);
        }
//        System.out.println("retval: " + retval);
        return retval;
    }

    public static String getValue(String key) {
        if (!initialized) {
            initialize();
        }
        String retval = "";
//        System.out.println("key: " + key);
//        System.out.println("settings: " + settings);
        if (settings.containsKey(key)) {
            retval = settings.get(key);
        }
        if (retval != null) {
            if (retval.startsWith(".")) {
                retval = System.getProperty("user.dir") + "/" + retval;
            }
        }
//        System.out.println("retval: " + retval);
        return retval;
    }

    public static void setValue(String key, String val) {
        if (!initialized) {
            initialize();
        }
        if (settings.containsKey(key)) {
            settings.put(key, val);
        }
    }

    public static void addValue(String key, String val) {
        if (!initialized) {
            initialize();
        }
        settings.put(key, val);
    }

    public static HashMap<String, String> getSettingsHashMap() {
        return settings;
    }

    public static void main(String args[]) {
        try {
//            BufferedReader br = new BufferedReader(new FileReader(new File("/Users/ting/Documents/sentiment/evaluation/wrong_relations/wrong_relations_05_17_15_v1.txt")));
//            BufferedReader br = new BufferedReader(new FileReader(new File("/Users/ting/Downloads/Teach_Play_Test_Game_Segments_-_Exp2_Strings.csv")));
            BufferedReader br = new BufferedReader(new FileReader(new File("/Users/ting/NetBeansProjects/KBPSentimentEvaluation_2014/conf/learned/good_neg_relationsV2.txt")));
            ArrayList goods = new ArrayList();
            String a_line = null;
            while ((a_line = br.readLine()) != null) {
                goods.add(a_line.trim());
            }
            br.close();
            br = new BufferedReader(new FileReader(new File("/Users/ting/NetBeansProjects/KBPSentimentEvaluation_2014/conf/learned/bad_c_relations_05_20_15.txt")));
            while ((a_line = br.readLine()) != null) {
                String[] items = a_line.split(",");
                if (!goods.contains(items[0].trim())) {
                    System.out.println(a_line);
                }
            }
            /*
             String annKey = "answer: ----+)((----Cecilie1200----+)((----50550----+)((----50618----+)((----query: Flaylo----+)((----slot: neg-from";
             String[] annKey_infos = annKey.split("----\\+\\)\\(\\(----");
             System.out.println("annKey_infos[0]:" + annKey_infos[0]);
             System.out.println("annKey_infos[1]:" + annKey_infos[1]);
             String paragraph = "There is another possible scenario, and that is what happened in Poland. The <a href=\"http://en.wikipedia.org/wiki/Solidarity_%28Polish_trade_union%29\">Solidarity (Polish Trade Union)</a> was ultimately successful in replacing the authoritarian Communist regime via the electoral process. It's possible that a personality like the Polish \"Lech Wałęsa\" will emerge from among the ranks of the protest movement to assume leadership of the protesters and who will then be selected to be the President of Egypt.";
             String[] sents = paragraph.split("(?<=[.?!])\\s+(?=[a-zA-Z])");
             for (String sent: sents) {
             System.out.println("sent: " + sent);
             }
             */
        } catch (IOException ex) {
            Logger.getLogger(Settings.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
