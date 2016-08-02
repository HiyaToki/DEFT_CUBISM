/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.albany.cubism.sentiment;

import edu.albany.ils.remnd.util.StanfordParser;
import edu.stanford.nlp.trees.Tree;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author John M. Lien
 */
public class Sandbox {

    private boolean found;
    private Tree tree;
    private HashMap<Integer, ArrayList<Tree>> recusion_mapping;
    private int subject_recusion_level;
    StanfordParser parser;

    public String findObject(String relation) {
        this.found = false;
        Tree objectTree = searchTreeForObject(tree, relation);
        return (objectTree != null) ? this.treeToString(objectTree) : null;
    }

    public String findSubject(String relation) {
        this.found = false;
        this.subject_recusion_level = -1;
        this.recusion_mapping.clear();
        searchTreeForSubject(tree, relation, 0);
        /* if the relation was found */
        if (this.subject_recusion_level >= 0) {
            ArrayList<Tree> trees = this.recusion_mapping.get(this.subject_recusion_level);
            /* if the list of siblings contains more than just the relation */
            if (trees.size() >= 2) {
                /* return the closest sibling */
                return this.treeToString(trees.get(trees.size() - 2));
            }
        }
        return null;
    }

    public boolean searchTreeForSubject(Tree tree, String relation, int index) {
        for (Tree child : tree.children()) {
            this.addMapping(index, child);
            if (child.isLeaf()) {
                /* If the leaf equals the search term then the relation has been found */
                if (child.value().equals(relation)) {
                    return true;
                }
            } else {
                /* If the relation has been found */
                if (searchTreeForSubject(child, relation, index + 1)) {
                    /* if subject _recusion_level has not been recorded */
                    if (this.subject_recusion_level < 0) {
                        this.subject_recusion_level = index;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public void addMapping(int recursion_level, Tree tree) {
        if (!this.recusion_mapping.containsKey(recursion_level)) {
            this.recusion_mapping.put(recursion_level, new ArrayList());
            this.recusion_mapping.get(recursion_level).add(tree.deepCopy());
        } else {
            this.recusion_mapping.get(recursion_level).add(tree.deepCopy());
        }
    }

    public Tree searchTreeForObject(Tree tree, String relation) {
        Tree result;
        for (Tree child : tree.children()) {
            if (child.isLeaf()) {
                /* If the leaf equals the search term then the relation has been found */
                if (child.value().equals(relation)) {
                    found = true;
                }
            } else {
                if (found) {
                    /* If relation if found then this is the tree immedidate following the relation */
                    return child;
                } else {
                    /* If the sub tree has been found then pass-it-up the recursion */
                    if ((result = searchTreeForObject(child, relation)) != null) {
                        return result;
                    }
                }
            }
        }
        return null;
    }

    private String treeToString(Tree tree) {
        StringBuilder sb = new StringBuilder();
        treeToStringHelper(tree, sb);
        return sb.toString().trim();
    }

    private void treeToStringHelper(Tree tree, StringBuilder sb) {
        for (Tree child : tree.children()) {
            if (child.isLeaf()) {
                sb.append(child.value());
                sb.append(" ");
            } else {
                treeToStringHelper(child, sb);
            }
        }
    }

    public void parse(String sentence) {
        this.parser.parse(sentence);
        this.tree = this.parser.getTree();
    }

    public Sandbox() {
        this.parser = new StanfordParser();
        this.recusion_mapping = new HashMap();
    }

    public static void main(String[] args) throws SQLException, IOException {
//        String typedTree;
//                String typedDepend;
//
//        sentiment_evaluation.StanfordParser sp = new sentiment_evaluation.StanfordParser();
//        
//         sentiment_evaluation.StanfordParser.ParserParts pp = sp.parse("Her efforts have been lauded by President Barack Obama and Education Secretary Arne Duncan.");
//                typedTree = pp.tree;
//                typedDepend = pp.dependency;
//                
//                System.out.println(typedTree);
//                System.out.println(typedDepend);

        Sandbox run = new Sandbox();
        run.parse("Deschamps not only claimed the league championship, but also led Marseille to the League Cup title by beating Bordeaux in March.");
        System.out.println("OBJ:\t" + run.findObject("led"));
        System.out.println("SUB:\t" + run.findSubject("led"));
    }
}
