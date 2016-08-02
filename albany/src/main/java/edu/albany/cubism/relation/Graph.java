/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.albany.cubism.relation;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import edu.albany.cubism.sentiment.NewswireFindAnnotation;
import edu.albany.cubism.util.Settings;
import edu.albany.cubism.util.Tools;

/**
 *
 * @author cslin
 */
public class Graph implements Serializable {

    //private ArrayList<Node> listSourceNode = new ArrayList<Node>();
    //private ArrayList<Node> listDestNode = new ArrayList<Node>();
    private ArrayList<Node> listNode = new ArrayList<Node>();
    private ArrayList<Edge> listEdge = new ArrayList<Edge>();
    private int iNode = 0, iEdge = 0;
    private ArrayList<Edge> outEdge = null;
    //private ArrayList<Edge> inEdge = new ArrayList<Edge>();
    private ArrayList<Edge> inEdge = null;
    private final static long serialVersionUID = -3059622786385294161L; //7370388788340660600L;//4176635012854306031L;//7370388788340660600L;//7370388788340660600L;//
    private String sentence;
    private int startx;
    private int endx;
    private ArrayList expression = new ArrayList();

    public Graph() {
        expression.add("think");
        expression.add("say");
        expression.add("tell");
        expression.add("talk");
        expression.add("agree");
        expression.add("disagree");
        expression.add("wonder");
        expression.add("blame");
        expression.add("curse");
        expression.add("claim");
    }

    public ArrayList<Edge> getListEdge() {
        return listEdge;
    }

    public void checkNewEdge(Node sNode, Node dNode, String relation) {
        boolean bFst = false, bSnd = false;
        Node node1 = null, node2 = null;

        //check if the nodes exist
        for (int i = 0; i < listNode.size(); i++) {
            Node node = listNode.get(i);

            if (sNode.getId() == node.getId()) {
                bFst = true;
                node1 = node;
            }

            if (dNode.getId() == node.getId()) {
                bSnd = true;
                node2 = node;
            }
        }
        if (!bFst) {
            listNode.add(iNode, sNode);
            iNode++;
            node1 = sNode;
        }
        if (!bSnd) {
            listNode.add(iNode, dNode);
            iNode++;
            node2 = dNode;
        }

        //Update the parent head
        Edge edge = new Edge(node2, 1, relation);
        node1.adjacencies.add(edge);
        for (int i = 0; i < listNode.size(); i++) {
            Node node = listNode.get(i);
            if (node.getId() == node1.getId()) {
                listNode.set(i, node1);
            }
        }

        // add the new edge to Graph
        Edge newedge = new Edge(node1, node2, relation);
        listEdge.add(iEdge, newedge);
        iEdge++;
    }

    public ArrayList<Node> getNodes() {
        return listNode;
    }

    public Node getNode(int id) {

        for (int i = 0; i < listNode.size(); i++) {
            if ((listNode.get(i)).getId() == id) {
                return listNode.get(i);
            }
        }
        return null;
    }
    //added by TL

    public Node getNode(String name) {

        for (int i = 0; i < listNode.size(); i++) {
            if ((listNode.get(i)).equal(name)) {
                return listNode.get(i);
            }
        }
        return null;
    }

    public Node getStemmedNode(String stem) {

        for (int i = 0; i < listNode.size(); i++) {
            if ((listNode.get(i)).getLemmaWord().equalsIgnoreCase(stem)) {
                return listNode.get(i);
            }
        }
        return null;
    }//added by Zumrut 10/28/2013

    public ArrayList<Edge> getEdges() {
        return listEdge;
    }

    public ArrayList<Node> getChildren(Node node) {
        ArrayList<Node> children = new ArrayList<Node>();
        if (node == null) {
            return children;
        }

        synchronized (this) {
            int count = 0;

            for (int i = 0; i < listEdge.size(); i++) {
                Edge e = listEdge.get(i);
                Node nS = e.getParent();
                Node nD = e.getChild();

                if (nS.getId() == node.getId()) {
                    children.add(count, nD);
                    count++;
                }
            }
            return children;
        }

    }

    public Node getParent(Node node) {
        Node par = null;
        if (node == null) {
            return par;
        }

        synchronized (this) {
            int count = 0;

            for (int i = 0; i < listEdge.size(); i++) {
                Edge e = listEdge.get(i);
                Node nS = e.getParent();
                Node nD = e.getChild();

                if (nD.getId() == node.getId()) {
                    return nS;
                }
            }
            return par;
        }
    }

    public ArrayList getParents(Node node) {
        ArrayList pars = new ArrayList();
        Node par = null;
        if (node == null) {
            return pars;
        }

        synchronized (this) {
            int count = 0;

            for (int i = 0; i < listEdge.size(); i++) {
                Edge e = listEdge.get(i);
                Node nS = e.getParent();
                Node nD = e.getChild();

                if (nD.getId() == node.getId()) {
                    if (!pars.contains(nS)) {
                        pars.add(nS);
                    }
                }
            }
            return pars;
        }
    }

    /**
     * Extract all edges starting from head
     *
     */
    public ArrayList<Edge> outFlow(Node node) {
        ArrayList<Edge> outEdge = new ArrayList<Edge>();
        if (node == null) {
            return outEdge;
        }

        synchronized (this) {
            int count = 0;

            for (int i = 0; i < listEdge.size(); i++) {
                Edge e = listEdge.get(i);
                Node nS = e.getParent();
                Node nD = e.getChild();

                if (nS.getId() == node.getId()) {
                    outEdge.add(count, e);
                    count++;
                }
            }
            return outEdge;
        }

    }

    public Node getConj(Node node) {
        for (Edge edge : listEdge) {
            if (edge.getRelation().equals("conj")
                    && edge.contains(node)) {
                return edge.getTheOther(node);
            }
        }
        return null;
    }

    /**
     * Extract all edges ending in head
     *
     */
    public ArrayList<Edge> inFlow(Node node) {
        ArrayList<Edge> inEdge = new ArrayList<Edge>();
        if (node == null) {
            return inEdge;
        }

        synchronized (this) {
            int count = 0;
            for (int i = 0; i < listEdge.size(); i++) {
                Edge e = listEdge.get(i);
                Node nS = e.getParent();
                Node nD = e.getChild();

                if (nD.getId() == node.getId()) {
                    inEdge.add(count, e);
                    count++;
                }
            }
            return inEdge;
        }
    }

    public void resetNodeInit() {
        for (int i = 0; i < listNode.size(); i++) {
            //listNode.get(i).minDist= Double.POSITIVE_INFINITY;
            listNode.get(i).minDist = Double.POSITIVE_INFINITY;
            listNode.get(i).previous = null;
        }
    }

    public ArrayList<Node> getSortedNodes() {
        ArrayList<Node> nodeInOrder = new ArrayList<Node>();

        resetNodeInit();

        for (int i = 0; i < listNode.size(); i++) {
            nodeInOrder.add(i, listNode.get(i));
        }

        for (int top = nodeInOrder.size() - 1; top > 0; top--) {
            for (int i = 0; i < top; i++) {
                if (nodeInOrder.get(i).getId() > nodeInOrder.get(i + 1).getId()) {
                    Node temp = nodeInOrder.get(i);
                    nodeInOrder.set(i, nodeInOrder.get(i + 1));
                    nodeInOrder.set(i + 1, temp);
                }
            }
        }
        return nodeInOrder;
    }

    public List<Node> subShortestPath(Node startNode, Node endNode) {

        resetNodeInit();
        computeAllPaths(startNode);

        List<Node> path = getPathToTarget(endNode);
        return path;
    }

    /**
     * Generate the shortest path between startNode and endNode Return the
     * visiting nodes
     *
     * @param startNode
     * @param endNode
     * @return
     */
    public List<Node> shortestPath(Node startNode, Node endNode) {

        resetNodeInit();
        computeAllPaths(startNode);

        List<Node> path = getPathToTarget(endNode);

        if (path.size() == 1) {
            List<Node> biPath = subShortestPath(endNode, startNode);
            System.out.println("--------- Generate Shortest Path ---------");
            System.out.println("From (" + endNode.getName() + "-" + endNode.getId()
                    + ")-->(" + startNode.getName() + "-" + startNode.getId() + ")");
            System.out.print("Path: ");
            for (int i = 0; i < biPath.size(); i++) {
                System.out.print(biPath.get(i).getName() + "-" + biPath.get(i).getId() + "; ");
            }
            System.out.println();

            return biPath;
        } else {
            System.out.println("--------- Generate Shortest Path ---------");
            System.out.println("From (" + startNode.getName() + "-" + startNode.getId()
                    + ")-->(" + endNode.getName() + "-" + endNode.getId() + ")");
            System.out.print("Path: ");
            for (int i = 0; i < path.size(); i++) {
                System.out.print(path.get(i).getName() + "-" + path.get(i).getId() + "; ");
            }
            System.out.println();

            return path;
        }
    }

    public static List<Node> getPathToTarget(Node target) {
        List<Node> path = new ArrayList<Node>();
        for (Node vertex = target; vertex != null; vertex = vertex.previous) {
            path.add(vertex);
        }

        Collections.reverse(path);
        return path;
    }

    public List<Node> shortestPathV2(Node startNode, Node endNode) {
        if (startNode.equals(endNode)) {
            return new ArrayList();
        }
        ArrayList processed_nodes = new ArrayList();
        ArrayList<ArrayList<Node>> adjecents = new ArrayList();
        ArrayList<Node> starts = new ArrayList();
        starts.add(startNode);
//        System.out.println("add head: " + startNode.getName());
        adjecents.add(starts);
        for (int i = 0; i < adjecents.size(); i++) {
            ArrayList<Node> adjs = adjecents.get(i);
            adjecents.remove(i);
            i--;
            Node last = adjs.get(adjs.size() - 1);
            ArrayList<Node> children = this.getChildren(last);
            for (Node child : children) {
                if (processed_nodes.contains(child)) {
                    continue;
                }
                processed_nodes.add(child);
                if (endNode.equals(child)) {
//                    System.out.println("find path: " + endNode.getName());
                    adjs.add(child);
                    return adjs.subList(0, adjs.size());
                }
                ArrayList<Node> adjs_clone = (ArrayList) adjs.clone();
                if (adjs_clone.size() > 0) {
                    Node latest = adjs_clone.get(adjs_clone.size() - 1);
                    if (Math.abs(latest.getId() - child.getId()) <= 8) {
                        adjs_clone.add(child);
//                System.out.println("add head: " + child.getName());
                        adjecents.add(adjs_clone);
                    } else {
                        System.out.println("the two nodes are too far: " + child.getName() + "    " + latest.getName());
                    }
                } else {
                    adjs_clone.add(child);
//                System.out.println("add head: " + child.getName());
                    adjecents.add(adjs_clone);
                }
            }
            ArrayList<Node> parents = this.getParents(last);
            for (Node parent : parents) {
                if (processed_nodes.contains(parent)) {
                    continue;
                }
                processed_nodes.add(parent);
                if (endNode.equals(parent)) {
                    adjs.add(parent);
//                    System.out.println("find path: " + endNode.getName());
                    return adjs.subList(0, adjs.size());
                }
                ArrayList<Node> adjs_clone = (ArrayList) adjs.clone();
                if (adjs_clone.size() > 0) {
                    Node latest = adjs_clone.get(adjs_clone.size() - 1);
                    if (Math.abs(latest.getId() - parent.getId()) <= 8) {
                        adjs_clone.add(parent);
//                System.out.println("add head: " + child.getName());
                        adjecents.add(adjs_clone);
                    } else {
                        System.out.println("the two nodes are too far: " + parent.getName() + "    " + latest.getName());
                    }
                } else {
                    adjs_clone.add(parent);
//                System.out.println("add head: " + child.getName());
                    adjecents.add(adjs_clone);
                }
            }
        }
        return new ArrayList();
    }

    public void computeAllPaths(Node source) {
        source.minDist = 0.0;
        PriorityQueue<Node> nodeQueue = new PriorityQueue<Node>();
        nodeQueue.add(source);

        while (!nodeQueue.isEmpty()) {
            Node s = nodeQueue.poll();

            // Visit each edge starting from s
            for (Edge e : s.adjacencies) {
                Node d = e.getChild();
                double weight = e.getWeight();
                double distFromU = s.minDist + weight;

                if (distFromU < d.minDist) {
                    nodeQueue.remove(d);

                    d.minDist = distFromU;
                    d.previous = s;
                    nodeQueue.add(d);

                }

            }
        }
        System.out.println();
    }

    /**
     *
     * @return list of parent head of subjects from edge list
     */
    public ArrayList<Node> getSubHeads() {
        ArrayList subjhs = new ArrayList();
        for (Edge ed : this.listEdge) {
            if (ed.getRelation() != null
                    && ed.getRelation().contains("sub")) {
                subjhs.add(ed.getParent());
            }
        }
        return subjhs;
    }

    /**
     *
     * @return list of subjects from edge list
     */
    public ArrayList<Node> getSubjects(String spk_id) {
        ArrayList subjs = new ArrayList();
        for (Edge ed : this.listEdge) {
            if (ed.getRelation() != null
                    && ed.getRelation().contains("sub")
                    && !ed.getRelation().equals("nsubjpass")
                    && ed.getChild().getEre_entity() != null
                    && (ed.getChild().getEre_entity().getParent().getType().equals("PER")
                    || Tools.isOpinionWords(ed.getParent().getName()))/*
                     && ed.getChild().getEre_entity().getParent().getEntityId().equals(spk_id)*/) {
                subjs.add(ed.getChild());
            }
        }
        return subjs;
    }

    /**
     *
     * @return subject of a verb
     */
    public Node getSubject(Node verb) {
        for (Edge ed : this.listEdge) {
            if (ed.getRelation() != null
                    && ed.getRelation().contains("sub")
                    && !ed.getRelation().equals("nsubjpass")
                    && ed.getParent().equals(verb)) {
                return ed.getChild();
            }
        }
        return null;
    }

    /**
     *
     * @return list of parent head of subjects from edge list
     */
    public ArrayList<Node> getObjects() {
        ArrayList objs = new ArrayList();
        for (Edge ed : this.listEdge) {
            if (ed.getRelation() != null
                    && ed.getRelation().contains("obj")) {
                objs.add(ed.getChild());
            }
        }
        return objs;
    }

    /**
     *
     * @return list of parent head of subjects from edge list
     */
    public Node getObject(Node word) {
        for (Edge ed : this.listEdge) {
            if (ed.getRelation() != null
                    && ed.getParent().equals(word)
                    && ed.getRelation().contains("obj")) {
                return ed.getChild();
            }
            if (ed.getRelation() != null
                    && ed.getParent().equals(word)
                    && ed.getRelation().contains("prep")) {
                return this.getObject(ed.getChild());
            }

        }
        return null;
    }

    /**
     *
     * @return list of parent head of subjects from edge list
     */
    public boolean isObject(Node node) {
        ArrayList objs = new ArrayList();
        for (Edge ed : this.listEdge) {
            if (ed.getRelation() != null
                    && (ed.getRelation().contains("obj")
                    || ed.getRelation().equals("nsubjpass"))) {
                if (ed.getChild().equals(node)) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Input a phrase(?), return the head Node.
     *
     * @param phrase
     * @return
     */
    //public Node getHead(String phrase){
    public Node getHead(ArrayList<Node> nodeInOrder) {
        //ArrayList<Node> nodeInOrder = getSortedNodes();
        ArrayList<Node> nodePhrase = (ArrayList) nodeInOrder.clone();
        Collections.sort(nodePhrase);
        //find each word's head in the phrase
//     System.out.println("nodePhrase size: " + nodePhrase.size());
        ArrayList<Integer> iHeads = new ArrayList<Integer>();
        for (int i = 0; i < nodePhrase.size(); i++) {
            iHeads.add(i, 1);
        }

        for (int i = 0; i < nodePhrase.size(); i++) {
            for (int j = 0; j < nodePhrase.size(); j++) {
                if (i != j) {
                    for (int k = 0; k < listEdge.size(); k++) {
                        if (listEdge.get(k).getParent().getId() == nodePhrase.get(i).getId()
                                && listEdge.get(k).getChild().getId() == nodePhrase.get(j).getId()) {
                            iHeads.set(j, 0);
                        }
                    }
                }
            }
        }

        for (int i = 0; i < nodePhrase.size(); i++) {
            if (iHeads.get(i) == (Integer) 1) {
                return nodePhrase.get(i);
            }
        }

        /*int iLen=0;
         for (int j=0; j<token.length; j++){
         for (int i=0; i<nodeInOrder.size(); i++){
         //use stemmed word to compare
         String stemToken=Util.stem(token[j]);
         String stemNodeInOrder=Util.stem(nodeInOrder.get(i).getName());
         if (stemToken.equalsIgnoreCase(stemNodeInOrder)){
         nodePhrase.add(iLen, nodeInOrder.get(i));
         iLen++;
         }
         }
         }*/
        return null;
    }

    /**
     * Input a phrase(?), return the head Node.
     *
     * @param phrase
     * @return
     */
    public Node getHead(int s_offset, int e_offset) {
        //    public Node getHead(ArrayList<Node> nodeInOrder, String phrase) {                                                                                                                                                                     
        ArrayList<Node> nodeInOrder = getSortedNodes();
        ArrayList<Node> nodePhrase = new ArrayList<Node>();

        int iLen = 0;
        for (Node node : nodeInOrder) {
            //use stemmed word to compare                                                                                                                                                                                               
            //                String stemToken = Util.stem(token[j]);                                                                                                                                                                                   
            //                String stemNodeInOrder = Util.stem(nodeInOrder.get(i).getName());                                                                                                                                                         
            if (node.getStartx() >= s_offset && node.getStartx() <= e_offset
                    || node.getEndx() >= s_offset && node.getEndx() <= e_offset) {
                nodePhrase.add(iLen, node);
                iLen++;
            }
        }
        boolean found = true;

        //find each word's head in the phrase                                                                                                                                                                                               
        //     System.out.println("nodePhrase size: " + nodePhrase.size());                                                                                                                                                                         
        ArrayList<Integer> iHeads = new ArrayList<Integer>();
        for (int i = 0; i < nodePhrase.size(); i++) {
            iHeads.add(i, 1);
        }

        for (int i = 0; i < nodePhrase.size(); i++) {
            for (int j = 0; j < nodePhrase.size(); j++) {
                if (i != j) {
                    for (int k = 0; k < listEdge.size(); k++) {
                        if (listEdge.get(k).getParent().getId() == nodePhrase.get(i).getId()
                                && listEdge.get(k).getChild().getId() == nodePhrase.get(j).getId()) {
                            iHeads.set(j, 0);
                        }
                    }
                }
            }
        }

        for (int i = 0; i < nodePhrase.size(); i++) {
            if (iHeads.get(i) == (Integer) 1) {
                return nodePhrase.get(i);
            }
        }

        return null;
    }

    /**
     * Input a phrase(?), return the head Node.
     *
     * @param phrase
     * @return
     */
    public Node getHead(String phrase) {
//    public Node getHead(ArrayList<Node> nodeInOrder, String phrase) {
        ArrayList<Node> nodeInOrder = getSortedNodes();
        ArrayList<Node> nodePhrase = new ArrayList<Node>();

        String[] token = phrase.trim().split("[\\s\\p{Punct}]+");
        int iLen = 0;
        for (int j = 0; j < token.length; j++) {
            for (int i = 0; i < nodeInOrder.size(); i++) {
                //use stemmed word to compare
//                String stemToken = Util.stem(token[j]);
//                String stemNodeInOrder = Util.stem(nodeInOrder.get(i).getName());
                if (token[j].equalsIgnoreCase(nodeInOrder.get(i).getName())) {
                    nodePhrase.add(iLen, nodeInOrder.get(i));
                    iLen++;
                }
            }
        }
        boolean found = true;

        //find each word's head in the phrase
        System.out.println("nodePhrase size: " + nodePhrase.size());
        ArrayList<Integer> iHeads = new ArrayList<Integer>();
        for (int i = 0; i < nodePhrase.size(); i++) {
            iHeads.add(i, 1);
        }

        for (int i = 0; i < nodePhrase.size(); i++) {
            for (int j = 0; j < nodePhrase.size(); j++) {
                if (i != j) {
                    for (int k = 0; k < listEdge.size(); k++) {
                        if (listEdge.get(k).getParent().getId() == nodePhrase.get(i).getId()
                                && listEdge.get(k).getChild().getId() == nodePhrase.get(j).getId()) {
//			    System.out.println("set " + nodePhrase.get(j).getName() + " to be child");
                            iHeads.set(j, 0);
                        }
                    }
                }
            }
        }

        for (int i = 0; i < nodePhrase.size(); i++) {
            if (iHeads.get(i) == (Integer) 1) {
                return nodePhrase.get(i);
            }
        }

        return null;
    }

    public Node getHead(Node node) {
        Node parent = this.getParent(node);
        if (parent.getName().equalsIgnoreCase("of")) {
            parent = this.getParent(parent);
            if (parent.getPos().startsWith("N")) {
                return parent;
            }
        } else if (parent.getPos().startsWith("N")
                && (this.getRelation(node, parent).equals("nn")
                && !parent.getName().equals("-LRB-")
                || this.getRelation(node, parent).equals("poss"))) {
            return parent;
        }
        return null;
    }

    public Node getHead(String phrase, int startx, int endx) {
        if (Settings.getValue("language").equals("Chinese")) {
            return this.getHeadChinese(phrase, startx, endx);
        }
        ArrayList<Node> nodeInOrder = getSortedNodes();
        ArrayList<Node> nodePhrase = new ArrayList<Node>();
//        System.out.println("phrase: " + phrase);
//        System.out.println("offset: " + startx);
        String dash = "dfsfs";
        phrase = phrase.replaceAll("-", dash);
        String[] token = phrase.trim().split("[\\s\\p{Punct}]+");
        int iLen = 0;
        for (int j = 0; j < token.length; j++) {
            token[j] = token[j].replaceAll(dash, "-");
            for (int i = 0; i < nodeInOrder.size(); i++) {
                //use stemmed word to compare
//                String stemToken = Util.stem(token[j]);
//                String stemNodeInOrder = Util.stem(nodeInOrder.get(i).getName());
//                System.out.println("head offset start: " + nodeInOrder.get(i).getStartx());
//                System.out.println("head offset end: " + nodeInOrder.get(i).getEndx());
//                System.out.println("head name: " + nodeInOrder.get(i).getName());
                if (token[j].equalsIgnoreCase(nodeInOrder.get(i).getName())
                        && (nodeInOrder.get(i).getStartx() >= startx - 1 && nodeInOrder.get(i).getStartx() <= endx - 1
                        || nodeInOrder.get(i).getEndx() >= startx - 1 && nodeInOrder.get(i).getEndx() <= endx - 1)) { //added byTL -2 is caused by sentence offset is smaller than annotated ones //changed to -1 05/01/15
//                    System.out.println("add head: " + nodeInOrder.toString());
                    startx = nodeInOrder.get(i).getEndx();
                    nodePhrase.add(iLen, nodeInOrder.get(i));
                    iLen++;
                    break;
                }
            }
        }
        boolean found = true;

        //find each word's head in the phrase
//        System.out.println("nodePhrase: " + nodePhrase);
        ArrayList<Integer> iHeads = new ArrayList<Integer>();
        for (int i = 0; i < nodePhrase.size(); i++) {
            iHeads.add(i, 1);
        }

        for (int i = 0; i < nodePhrase.size(); i++) {
            for (int j = 0; j < nodePhrase.size(); j++) {
                if (i != j) {
                    for (int k = 0; k < listEdge.size(); k++) {
                        if (listEdge.get(k).getParent().getId() == nodePhrase.get(i).getId()
                                && listEdge.get(k).getChild().getId() == nodePhrase.get(j).getId()) {
//			    System.out.println("set " + nodePhrase.get(j).getName() + " to be child");
                            iHeads.set(j, 0);
                        }
                    }
                }
            }
        }

        for (int i = 0; i < nodePhrase.size(); i++) {
            if (iHeads.get(i) == (Integer) 1) {
                return nodePhrase.get(i);
            }
        }

        return null;
    }

    public Node getHeadChinese(String phrase, int startx, int endx) {
//    public Node getHead(ArrayList<Node> nodeInOrder, String phrase) {
//        System.out.println("in getHeadChinese");
        ArrayList<Node> nodeInOrder = getSortedNodes();
        ArrayList<Node> nodePhrase = new ArrayList<Node>();
//        System.out.println("phrase: " + phrase);
//        System.out.println("offset: " + startx);
        String dash = "dfsfs";
        phrase = phrase.replaceAll("-", dash);
        String[] token = phrase.trim().split("[\\s\\p{Punct}]+");
        int iLen = 0;
        for (int j = 0; j < token.length; j++) {
            token[j] = token[j].replaceAll(dash, "-");
            System.out.println("token: " + token[j]);
            for (int i = 0; i < nodeInOrder.size(); i++) {
//                System.out.println("nodeInOrder: " + nodeInOrder.get(i).getName());
//                System.out.println("node startx: " + nodeInOrder.get(i).getStartx());
//                System.out.println("node endx: " + nodeInOrder.get(i).getEndx());
                if (token[j].startsWith(nodeInOrder.get(i).getName())
                        && (nodeInOrder.get(i).getStartx() >= startx - 1 && nodeInOrder.get(i).getStartx() <= endx - 1
                        || nodeInOrder.get(i).getEndx() >= startx - 1 && nodeInOrder.get(i).getEndx() <= endx - 1)) { //added byTL -2 is caused by sentence offset is smaller than annotated ones //changed to -1 05/01/15
//                    System.out.println("add head: " + nodeInOrder.toString());
                    startx = nodeInOrder.get(i).getEndx();
                    nodePhrase.add(iLen, nodeInOrder.get(i));
                    token[j] = token[j].replace(nodeInOrder.get(i).getName(), "");
                    iLen++;
                    if (token[j].length() == 0) {
                        break;
                    }
                }
            }
        }
        boolean found = true;

        //find each word's head in the phrase
//        System.out.println("nodePhrase: " + nodePhrase);
        ArrayList<Integer> iHeads = new ArrayList<Integer>();
        for (int i = 0; i < nodePhrase.size(); i++) {
            iHeads.add(i, 1);
        }

        for (int i = 0; i < nodePhrase.size(); i++) {
            for (int j = 0; j < nodePhrase.size(); j++) {
                if (i != j) {
                    for (int k = 0; k < listEdge.size(); k++) {
                        if (listEdge.get(k).getParent().getId() == nodePhrase.get(i).getId()
                                && listEdge.get(k).getChild().getId() == nodePhrase.get(j).getId()) {
//			    System.out.println("set " + nodePhrase.get(j).getName() + " to be child");
                            iHeads.set(j, 0);
                        }
                    }
                }
            }
        }

        for (int i = 0; i < nodePhrase.size(); i++) {
            if (iHeads.get(i) == (Integer) 1) {
                return nodePhrase.get(i);
            }
        }

        return null;
    }

    /**
     *
     * @param en
     * @param offset_s
     * @param offset_e
     * @param sentence
     * @param sent_graph
     * @return list of entity heads in sentence refer to en By TL 04/09/15
     * modified by TL 03/20/16, if a head contains Entity mention, add it into
     * return list
     */
    public ArrayList<Node> getEnInstances(String en, int offset_s, int offset_e, String sentence, Graph sent_graph) {
        ArrayList<Node> nodes = this.getSortedNodes();
        ArrayList<Node> founds = new ArrayList();
        String[] items = en.split("[ ]+");
//        System.out.println("en: " + en);
        for (Node node : nodes) {

            if (node.hasRefs(en)) {
                if (offset_s == -1) {
                    founds.add(node);
                } else if (offset_s >= this.startx && offset_s <= this.endx
                        || offset_e >= this.startx && offset_e <= this.endx) {
                    founds.add(node);
                }
            }
        }
        if (founds.size() == 0) {
            for (Node node : nodes) {
                for (String item : items) {
                    if (node.getName().equalsIgnoreCase(item)
                            && (node.getPos().startsWith("N")
                            || node.getPos().equals("PRP"))) {
                        //added pronoun by TL 10/06/15
                        founds.add(node);
                    }
                }
            }
        }
        return founds;
    }

    public ArrayList<Node> getEnInstances() {
        ArrayList<Node> nodes = this.getSortedNodes();
        ArrayList<Node> founds = new ArrayList();
//        System.out.println("en: " + en);
        for (Node node : nodes) {

            if (node.getEntity() != null) {
                founds.add(node);
            }
        }
        return founds;
    }

    public ArrayList<Node> getEREEnInstances() {
        ArrayList<Node> nodes = this.getSortedNodes();
        ArrayList<Node> founds = new ArrayList();
//        System.out.println("en: " + en);
        for (Node node : nodes) {

            if (node.getEre_entity() != null) {
                founds.add(node);
            }
        }
        return founds;
    }

    /**
     * get relation between two nodes if exists by TL
     */
    public String getRelation(Node n1, Node n2) {
        for (Edge e : listEdge) {
            if (e.contains(n1)
                    && e.contains(n2)) {
                return e.getRelation();
            }
        }
        return null;
    }

    public Path getNodes(Node ori_node_, Node con_head_) {
        Path path = new Path();
        boolean start = false;
        for (Node node : listNode) {
            if (node.equals(ori_node_)
                    || node.equals(con_head_)) {
                if (!start) {
                    start = true;
                    path.add(node);
                    continue;
                } else {
                    path.add(node);
                    break;
                }
            }
            if (start) {
                path.add(node);
            }
        }
        return path;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }

    public void setStartx(int startx) {
        this.startx = startx;
    }

    public void setEndx(int endx) {
        this.endx = endx;
    }

    public String getSentence() {
        return sentence;
    }

    public int getStartx() {
        return startx;
    }

    public int getEndx() {
        return endx;
    }

    public void setNodesOffset() {
        ArrayList<Node> listNode = this.getSortedNodes();
        int startx = this.startx;
        int offset = 0;
//        System.out.println("sentence: " + this.sentence);
        for (int i = 1; i < listNode.size(); i++) {
            Node node = listNode.get(i);

            int starting_offset = this.sentence.indexOf(node.getName(), offset);
//            System.out.println("starting offset: " + starting_offset);
//            System.out.println("head: " + head.getName());
            int node_startx = startx + starting_offset;
            int node_endx = node_startx + node.getName().length();
            offset += node.getName().length();
            node.setStartx(node_startx);
            node.setEndx(node_endx);
        }
    }

    public boolean isNegate(Node node) {
        ArrayList<Node> children = this.getChildren(node);
        if (children != null) {
            for (Node child : children) {
                String r_type = this.getRelation(node, child);
                if (r_type.startsWith("neg")) {
                    return true;
                }
            }
        }
        return false;
    }

    public ArrayList<Node> getPatients(Node agent) {
        ArrayList<Node> outs = new ArrayList();
        ArrayList<Node> ents = this.getEREEnInstances();
        for (Node ent : ents) {
            if (ent.getName().equals(agent.getName())
                    && ent.getId() == agent.getId()) {
                continue;
            }
            ArrayList<Node> path = new ArrayList(this.shortestPathV2(agent, ent));
            //added by TL 06/20/16
            Node ent_par = this.getParent(ent);
            if (ent_par != null) {
                String rel = this.getRelation(ent, ent_par);
                if (rel == null || ent_par.getEre_entity() != null) {
                    continue;
                }
                if (!rel.contains("obj")) {
                    if (rel.contains("amod")) {
                        Node ent_par_par = this.getParent(ent_par);
                        if (ent_par_par == null) {
                            continue;
                        }
                        String rel_par = this.getRelation(ent_par, ent_par_par);
                        if (!rel_par.contains("obj")) {
                            continue;
                        }
                    } else {
                        continue;
                    }
                }
            }
            boolean hasEninBetween = false;
            Node pre_node = null;
            boolean bad_dependency = false;
            String bad_rel = null;
            for (Node node : path) {
                if (node.getEre_entity() != null
                        && !(node.equals(ent)
                        || node.equals(agent))) {
                    hasEninBetween = true;
                    break;
                }
                if (pre_node == null) {
                    pre_node = node;
                    continue;
                } else {
                    String rel = this.getRelation(node, pre_node);
                    System.out.println("rel between " + node.getName() + " and " + pre_node.getName() + " is: " + rel);
                    if (rel != null
                            && (rel.equals("dep")
                            || rel.equals("conj")
                            || rel.equals("advcl")
                            && node.getPos().startsWith("V"))) {
                        bad_rel = rel;
                        //dep - A dependency is labeled as dep when the system is unable to determine a more precise dependency relation between two words.
                        bad_dependency = true;
                        break;
                    }
                    pre_node = node;
                }
            }
            if (hasEninBetween) {
                System.out.println("this path has enity in between: " + path);
            } else if (path.size() > 5) {
                System.out.println("this path is too long: " + path);
            } else if (Math.abs(agent.getId() - ent.getId()) > 10) {
                System.out.println("the distance between agent and ent is too long: " + path);
            } else if (bad_dependency) {
                System.out.println("bad dependency: " + bad_rel);
            } else {
                System.out.println("add patient: " + ent.getName() + "  " + ent.getId());
                System.out.println("agent node: " + agent.getName() + "  " + agent.getId());
                outs.add(ent);
            }
        }
        return outs;
    }

    public boolean containsExpressionWords(Node node, ArrayList<String> expression) {
        if (expression.contains(node.getName())
                || expression.contains(node.getLemmaWord())) {
            return true;
        }
        return false;
    }

    public ArrayList<Node> getSpkPatients() {
        ArrayList<Node> outs = new ArrayList();
        ArrayList<Node> ents = this.getEREEnInstances();
        for (Node ent : ents) {
            if (ent.getEre_entity().getEntityMentionText().toLowerCase().contains("idiot")) {
                outs.add(ent);
                continue;
            }
            if (this.isObject(ent)) {
                //not dealing with object 
                System.out.println("find obj: " + ent);
                continue;
            }
            Node head = this.getHead(ent);
            if (head != null
                    && head.getEre_entity() != null) {
                //it's head can't be another entity
                continue;
            }
            if (ent.getName().equalsIgnoreCase("I")) {
                //it's the speaker 
                continue;
            }
//            if (head != null
//                    && !this.containsExpressionWords(head, expression)) {
            //only keep this entity
//                outs.clear();
//                outs.add(ent);
//                return outs;
////            }
            System.out.println("add patient for speaker: " + ent.getName() + "  " + ent.getId());
            outs.add(ent);
        }
        return outs;

    }

    public ArrayList<Node> getSpkPatientsObj() {
        ArrayList<Node> outs = new ArrayList();
        ArrayList<Node> ents = this.getEREEnInstances();
        for (Node ent : ents) {
            Node head = this.getHead(ent);
            if (head != null
                    && head.getEre_entity() != null) {
                //it's head can't be another entity
                String ent_bf = Tools.getBaseForm(ent.getName(), ent.getPos());
                if (!Tools.isGoodNegRelation(ent_bf)) {
                    continue;
                }
            }
            if (ent.getName().equalsIgnoreCase("I")) {
                //it's the speaker 
                continue;
            }
            if (!this.isObject(ent)) {
                //not dealing with object 
                System.out.println("find non-obj: " + ent);
                continue;
            }
            System.out.println("add patient for speaker: " + ent.getName() + "  " + ent.getId());
            outs.add(ent);
        }
        return outs;

    }
}
