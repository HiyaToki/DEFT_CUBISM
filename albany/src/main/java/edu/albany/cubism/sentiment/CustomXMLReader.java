/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.albany.cubism.sentiment;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 *
 * @author jrgiarrusso
 */
public class CustomXMLReader {

    /**
     * @param args the command line arguments
     * @throws org.xml.sax.SAXException
     * @throws java.io.IOException
     * @throws javax.xml.parsers.ParserConfigurationException
     * @throws javax.xml.transform.TransformerException
     */
    private DocumentBuilderFactory docBuilderFactory;
    private DocumentBuilder docBuilder;
    private Document document;

    public void openFile(String dir) throws SAXException, IOException, ParserConfigurationException, TransformerException {

        // Set up the tools to parse through an XML file
        docBuilderFactory = DocumentBuilderFactory.newInstance();
        docBuilder = docBuilderFactory.newDocumentBuilder();
        document = docBuilder.parse(new File(dir));

    }

    public void printNodeList(String nodeName) {

        NodeList nodeList = document.getElementsByTagName("*");
        for (int i = 0; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);
            if (node.getNodeType() == Node.ELEMENT_NODE && node.getNodeName().contentEquals(nodeName)) {
                System.out.println(node.getTextContent());
            }
        }
    }

    public void createArrayListFromNode(String nodeName) {

        NodeList nodeList = document.getElementsByTagName("*");
        ArrayList<String> nodeArrayList = new ArrayList();
        for (int i = 0; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);
            if (node.getNodeType() == Node.ELEMENT_NODE && node.getNodeName().contentEquals(nodeName)) {
                nodeArrayList.add(node.getTextContent());
            }
        }
        System.out.println("Nodes in List:");
        for (String nodeArrayList1 : nodeArrayList) {
            System.out.println("-> " + nodeArrayList1);
        }
    }

    public void listNumberOfOccurences(String nodeName) {

        HashMap<String, Integer> hash1 = new HashMap();
        ArrayList<String> list1 = new ArrayList();
        int temp;
        NodeList nodeList = document.getElementsByTagName("*");

        // Count the number of occurences using keys and values with a hashmap
        for (int i = 0; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);
            if (node.getNodeType() == Node.ELEMENT_NODE && node.getNodeName().contentEquals(nodeName)) {
                if (hash1.containsKey(node.getTextContent())) {
                    temp = hash1.get(node.getTextContent());
                    hash1.put(node.getTextContent(), temp + 1);
                } else {
                    hash1.put(node.getTextContent(), 1);
                    list1.add(node.getTextContent());
                }
            }
        }

        for (String list11 : list1) {
            System.out.print(list11 + "\t");
            System.out.println(hash1.get(list11));
        }
    }
    
    public CustomXMLReader(String dir) throws SAXException, IOException, ParserConfigurationException, TransformerException {
        this.docBuilderFactory = null;
        this.docBuilder = null;
        this.document = null;
        this.openFile(dir);
    }

}
