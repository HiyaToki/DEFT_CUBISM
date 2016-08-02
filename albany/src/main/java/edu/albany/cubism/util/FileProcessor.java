/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.albany.cubism.util;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.security.auth.login.Configuration;

/**
 *
 * @author ting
 */
public class FileProcessor {

    public static void writeObject(Object obj, String path) {
        ObjectOutputStream ops = null;
        try {
            ops = new ObjectOutputStream(new FileOutputStream(new File(path)));
            ops.writeObject(obj);
            ops.flush();
            ops.close();
        } catch (IOException ex) {
            ex.printStackTrace();
            Logger.getLogger(FileProcessor.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                ops.close();
            } catch (IOException ex) {
                Logger.getLogger(FileProcessor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public static void writeObject(Object obj, String path, int id) {
        ObjectOutputStream ops = null;
        try {
            ops = new ObjectOutputStream(new FileOutputStream(new File(path + "_" + id)));
            ops.writeObject(obj);
            ops.flush();
            ops.close();
        } catch (IOException ex) {
            ex.printStackTrace();
            Logger.getLogger(FileProcessor.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (ops != null) {
                    ops.close();
                }
            } catch (IOException ex) {
                Logger.getLogger(FileProcessor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public static Object readObject(String path) {
        ObjectInputStream ops = null;
        try {
            File input = new File(path);
            if (!input.exists() || input.listFiles().length == 0) {
                return null;
            }
            ArrayList<File> inputs = new ArrayList(Arrays.asList(input.listFiles()));
            System.out.println("inputs: " + inputs);
            ArrayList tis = new ArrayList();
            for (File in : inputs) {
                System.out.println("read: " + in.getName());
                ops = new ObjectInputStream(new FileInputStream(in));
                tis.addAll((ArrayList) ops.readObject());
                ops.close();
            }
//            System.out.println("tis: " + tis.size());
            return tis;
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
            Logger.getLogger(FileProcessor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            ex.printStackTrace();
            Logger.getLogger(FileProcessor.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (ops != null) {
                    ops.close();
                }
            } catch (IOException ex) {
                Logger.getLogger(FileProcessor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }

    public static HashSet readBadPatterns(String path) {
        BufferedReader br = null;
        try {
            HashSet badPatterns = new HashSet();
            br = new BufferedReader(new FileReader(new File(path)));
            String aLine = null;
            while ((aLine = br.readLine()) != null) {
                if (!aLine.equals("--------------")) {
                    continue;
                }
                aLine = br.readLine();
                if (aLine != null) {
                    badPatterns.add(aLine.split("    ")[0]);
                }
            }
            return badPatterns;
        } catch (IOException ex) {
            Logger.getLogger(FileProcessor.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                br.close();
            } catch (IOException ex) {
                Logger.getLogger(FileProcessor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }

    public static Object readRelations(String path) {
        ObjectInputStream ops = null;
        try {
            File input = new File(path);
            if (!input.exists()) {
                return null;
            }
            ArrayList<File> inputs = new ArrayList(Arrays.asList(input.listFiles()));
            System.out.println("inputs: " + inputs);
            ArrayList tis = new ArrayList();
            for (File in : inputs) {
                if (in.getName().indexOf("relations") == -1) {
                    continue;
                }
                System.out.println("read: " + in.getName());
                ops = new ObjectInputStream(new FileInputStream(in));
                tis.add(ops.readObject());
                ops.close();
            }
//            System.out.println("tis: " + tis.size());
            return tis;
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
            Logger.getLogger(FileProcessor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            ex.printStackTrace();
            Logger.getLogger(FileProcessor.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (ops != null) {
                    ops.close();
                }
            } catch (IOException ex) {
                Logger.getLogger(FileProcessor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }

    public static HashSet readMostFrequentVerbs(String path) {
        BufferedReader br = null;
        HashSet verbs = new HashSet();
        if (path.endsWith("’")) {
            path = path.substring(0, path.length() - 1);
        }
        try {
            br = new BufferedReader(new FileReader(new File(path)));
            String a_line = null;
            while ((a_line = br.readLine()) != null) {
                if (a_line.trim().length() == 0) {
                    continue;
                }
                //System.out.println("adding: " + a_line.split("[.\t]+")[1].trim());
                String[] items = a_line.split("[.\t]+");
                verbs.add(items[items.length - 1].trim());
            }
        } catch (IOException ex) {
            ex.printStackTrace();
            Logger.getLogger(FileProcessor.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                br.close();
                return verbs;
            } catch (IOException ex) {
                Logger.getLogger(FileProcessor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }

    public static void writeText(HashMap<String, Integer> rels, String outputrelationshashmap_eng_all) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(new File(outputrelationshashmap_eng_all)));
            ArrayList<String> keys = new ArrayList(Arrays.asList(rels.keySet().toArray()));
            for (String key : keys) {
                bw.write(key + ": " + rels.get(key) + "\n");
            }
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
