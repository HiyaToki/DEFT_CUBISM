/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.albany.cubism.util;

import edu.albany.cubism.relation.Node;
import java.io.File;
import java.util.ArrayList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/**
 *
 * @author ting
 */
public class BeliefXML {

    public static void createBeliefXMLFile(ArrayList<Node> beliefs, String source_file_name, String outpath) {
        try {

            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

            // root elements
            Document doc = docBuilder.newDocument();
            Element rootElement = doc.createElement("committed_belief_doc");
            doc.appendChild(rootElement);

            Attr attr = doc.createAttribute("id");
            attr.setValue(source_file_name);
            rootElement.setAttributeNode(attr);
            int count = 1;
            for (Node bf : beliefs) {
                // belief elements
                Element belief = doc.createElement("annotation");
                rootElement.appendChild(belief);
                
                // set attribute to belief element
                Attr belief_id = doc.createAttribute("id");
                belief_id.setValue("sys-" + count);
                belief.setAttributeNode(belief_id);
                
                count++;

                Attr source_id = doc.createAttribute("source_id");
                source_id.setValue(source_file_name);
                belief.setAttributeNode(source_id);

                Attr offset = doc.createAttribute("offset");
                offset.setValue((new Integer(bf.getStartx())).toString());
                belief.setAttributeNode(offset);

                Attr length = doc.createAttribute("length");
                length.setValue((new Integer(bf.getEndx() - bf.getStartx())).toString());
                belief.setAttributeNode(length);

                // belief_type elements
                Element belief_type = doc.createElement("belief_type");
                belief_type.appendChild(doc.createTextNode("CB"));
                belief.appendChild(belief_type);

                // annotation_text elements
                Element annotation_text = doc.createElement("annotation_text");
                annotation_text.appendChild(doc.createTextNode(bf.getName()));
                belief.appendChild(annotation_text);

            }
            // write the content into xml file
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");

            DOMSource source = new DOMSource(doc);
            File output = new File(outpath+"/"+source_file_name+".xml");
            if (!output.exists()) {
                return;
            }
            StreamResult result = new StreamResult(output);

            // Output to console for testing
            // StreamResult result = new StreamResult(System.out);
            transformer.transform(source, result);

            System.out.println("File saved!");

        } catch (ParserConfigurationException pce) {
            pce.printStackTrace();
        } catch (TransformerException tfe) {
            tfe.printStackTrace();
        }
    }
}
