/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.albany.cubism.relation;

import java.util.ArrayList;

/**
 *
 * @author ting
 */
public class Path extends ArrayList<Node> {

    //@Override
    public String toString(Node con_head, Node rel_node) {
        StringBuffer out = new StringBuffer();
        ArrayList processed_nodes = new ArrayList();
        for (int i = 0; i < size(); i++) {
            Node node = get(i);
            if (processed_nodes.contains(node)) {
                remove(node);
                i--;
                continue;   
            }
            processed_nodes.add(node);
            if (!node.equals(con_head) && !node.equals(rel_node)) {
                out.append(node.getName() + "/" + node.getPos() + " ");
            } else if (!node.equals(rel_node)) {
                out.append("CONCEPT/" + node.getPos() + " ");
            }
        }
        return out.toString().trim();
    }

    public String toExactString(Node con_head, Node rel_node) {
        StringBuffer out = new StringBuffer();
        ArrayList processed_nodes = new ArrayList();
        for (int i = 0; i < size(); i++) {
            Node node = get(i);
            if (processed_nodes.contains(node)) {
                remove(node);
                i--;
                continue;   
            }
            processed_nodes.add(node);
            if (!node.equals(con_head) && !node.equals(rel_node)) {
                out.append(node.getName() + " ");
            } else if (!node.equals(rel_node)) {
                ;//out.append("CONCEPT" + " ");
            }
        }
        return out.toString().trim();
    }

    public ArrayList<String> toStringWithSyn(Node con_head, Node rel_node) {
        String out = "";
        ArrayList processed_nodes = new ArrayList();
        ArrayList<String> outs = new ArrayList();
        outs.add(out);
        System.out.println("outs:" + outs);
        for (int i = 0; i < size(); i++) {
            Node node = get(i);
            if (processed_nodes.contains(node)) {
                remove(node);
                i--;
                continue;   
            }
            processed_nodes.add(node);
            if (!node.equals(con_head) && !node.equals(rel_node)) {
                for (int j = 0; j < outs.size(); j++) {
                    String out1 = outs.get(j);
                    out1 = out1 + node.getName() + "/" + node.getPos() + " ";
                    outs.set(j, out1);
                }
            } else if (!node.equals(rel_node)) {
                for (int j = 0; j < outs.size(); j++) {
                    String out1 = outs.get(j);
                    out1 = out1 + "CONCEPT/" + node.getPos() + " ";
                    outs.set(j, out1);
                }
            }
//            System.out.println("outs: " + outs);
        }
        return outs;
    }

//    public ArrayList<String> getRelSyns(Node rel_node) {
//        String pos = this.getPOS(rel_node.getPos());
//        if ((Settings.getValue(Settings.LANGUAGE)).equals("english")) {
//            return Util.wn_.getSynonymFront_Mses(rel_node.getName(), pos, 2);
//        } else if ((Settings.getValue(Settings.LANGUAGE)).equals("spanish")) {
//            return Util.spwn_.getSynonymFront_Mses(rel_node.getName(), pos, 2);
//        } else if ((Settings.getValue(Settings.LANGUAGE)).equals("russian")) {
//            return Util.ruwn_.getSynonymFront_Mses(rel_node.getName(), pos, 2);
//        } else if ((Settings.getValue(Settings.LANGUAGE)).equals("farsi")) {
//            return Util.fawn_.getSynonymFront_Mses(rel_node.getName(), pos, 2);
//        }
//        return null;
//    }
//
    public String getPOS(String pos) {
        if (pos.startsWith("N")) {
            return "noun";
        } else if (pos.startsWith("V")) {
            return "verb";
        } else if (pos.startsWith("A")) {
            return "adj";
        } else {
            return "noun";
        }
    }

    public String toStringWithOW(Node con_head, Node rel_node) {
        ArrayList processed_nodes = new ArrayList();
        StringBuffer out = new StringBuffer();
        for (int i = 0; i < size(); i++) {
            Node node = get(i);
            if (processed_nodes.contains(node)) {
                remove(node);
                i--;
                continue;   
            }
            processed_nodes.add(node);
            if (!node.equals(con_head) && !node.equals(rel_node)) {
                out.append(node.getName() + "/" + node.getPos() + " ");
            } else if (!node.equals(rel_node)) {
                out.append("CONCEPT/" + node.getPos() + " ");
            }
        }
        return out.toString().trim();
    }

    public boolean contains(String type, String content) {
        for (int i = 0; i < size(); i++) {
            Node node = get(i);
            if (type.equals(this.POS)) {
                if (node.getPos().equals(content)) {
                    return true;
                }
            } else {
//                System.out.println("path node: " + node.getLemmaWord() + "---" + node.getName());
                if ((node.getLemmaWord() != null
                        && node.getLemmaWord().trim().equals(content))
                        || node.getName().trim().equals(content)) {
                    return true;
                }
            }
        }
        return false;
    }

    public String toExactStringW1POS(Node con_head, Node rel_node) {
        ArrayList processed_nodes = new ArrayList();
        StringBuffer out = new StringBuffer();
        for (int i = 0; i < size(); i++) {
            Node node = get(i);
            if (processed_nodes.contains(node)) {
                remove(node);
                i--;
                continue;   
            }
            processed_nodes.add(node);
            if (!node.equals(con_head) && !node.equals(rel_node)) {
                out.append(node.getName() + "/" + node.getPos().substring(0, 1) + " ");
            } else if (!node.equals(rel_node)) {
                ;//out.append("CONCEPT/" + node.getPos() + " ");
            }
        }
        return out.toString().trim();
    }
    
    public ArrayList getDependencyTypes(Graph sent_graph) {
        if (dependency_types.size() > 0) {
            return dependency_types;
        }
        for (int i = 0; i < size() - 1; i++)  {
            Node fn = get(i);
            for (int j = i+1; j < size(); j++) {
                Node sn = get(j);
                String dt = sent_graph.getRelation(fn, sn);
                if (dt != null) {
                    dependency_types.add(dt);
                }
            }
        }
        return dependency_types;
    }
    private static final long serialVersionUID = 9114711482163825155L;
    public static final String POS = "pos";
    public static final String WORD = "word";
    public ArrayList<String> dependency_types = new ArrayList();
}
