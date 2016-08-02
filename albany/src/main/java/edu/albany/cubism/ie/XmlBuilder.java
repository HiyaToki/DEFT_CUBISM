/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.albany.cubism.ie;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import java.io.File;
import java.util.ArrayList;
import javax.xml.transform.OutputKeys;

/**
 *
 * @author Meenakshi Alagesan
 */
public class XmlBuilder {

    public void buildXml(ArrayList<SentimentMention> inputList, String output_path, String id) {

        try {
            DocumentBuilderFactory dbFactory
                    = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder
                    = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.newDocument();

            // root element
            Element rootElement = doc.createElement("committed_belief_doc");
            Attr attrTypeR = doc.createAttribute("id");
            attrTypeR.setValue(id);
            rootElement.setAttributeNode(attrTypeR);
            doc.appendChild(rootElement);

            //  entities element
            Element sentiment = doc.createElement("sentiment_annotations");
            rootElement.appendChild(sentiment);
            Element entities = doc.createElement("entities");
            sentiment.appendChild(entities);
            //  relations element
            Element relations = doc.createElement("relations");
            sentiment.appendChild(relations);
            //  events element
            Element events = doc.createElement("events");
            sentiment.appendChild(events);

            for (int i = 0; i < inputList.size(); i++) {

                SentimentMention sentimentObject = inputList.get(i);
                if (sentimentObject == null) {
                    continue;
                }
                if (sentimentObject.getTarget() instanceof EntityMention) {
                    EntityMention targetObj = (EntityMention) sentimentObject.getTarget();

                    if (sentimentObject.getSource() != null) {
                        EntityMention entityObject = sentimentObject.getSource();
                        Element entity = doc.createElement("entity");
                        Attr attrType1 = doc.createAttribute("ere_id");
                        attrType1.setValue(targetObj.getEntityMentionId());
                        Attr attrType2 = doc.createAttribute("offset");
                        attrType2.setValue("" + targetObj.getEntityMentionOffset());
                        Attr attrType3 = doc.createAttribute("length");
                        attrType3.setValue("" + targetObj.getEntityMentionLength());
                        entity.setAttributeNode(attrType1);
                        entity.setAttributeNode(attrType2);
                        entity.setAttributeNode(attrType3);
                        Element text = doc.createElement("text");
                        text.appendChild(
                                doc.createTextNode(targetObj.getEntityMentionText()));
                        entity.appendChild(text);
                        Element sentiment1 = doc.createElement("sentiment");
                        Attr senti1AttrType1 = doc.createAttribute("polarity");
                        if (sentimentObject.getSlot() != null) {
                            senti1AttrType1.setValue(sentimentObject.getSlot());
                        } else {
                            senti1AttrType1.setValue("");
                        }

                        Attr senti1AttrType2 = doc.createAttribute("sarcasm");
                        senti1AttrType2.setValue("no");

                        sentiment1.setAttributeNode(senti1AttrType1);
                        sentiment1.setAttributeNode(senti1AttrType2);

                        Element source1 = doc.createElement("source");
                        Attr src1AttrType1 = doc.createAttribute("ere_id");
                        src1AttrType1.setValue(entityObject.getEntityMentionId());
                        Attr src1AttrType2 = doc.createAttribute("offset");
                        src1AttrType2.setValue("" + entityObject.getEntityMentionOffset());
                        Attr src1AttrType3 = doc.createAttribute("length");
                        src1AttrType3.setValue("" + entityObject.getEntityMentionLength());
                        source1.appendChild(
                                doc.createTextNode(entityObject.getEntityMentionText()));
                        source1.setAttributeNode(src1AttrType1);
                        source1.setAttributeNode(src1AttrType2);
                        source1.setAttributeNode(src1AttrType3);
                        sentiment1.appendChild(source1);

                        entity.appendChild(sentiment1);
                        entities.appendChild(entity);

                    } else {
                        System.err.println("Null source Object!!");
                    }
                } else if (sentimentObject.getTarget() instanceof RelationMention) {
                    // relation element
                    RelationMention targetObj = (RelationMention) sentimentObject.getTarget();
                    if (sentimentObject.getSource() != null) {

                        EntityMention entityObject = sentimentObject.getSource();
                        Element relation = doc.createElement("relation");
                        Attr relationAttrType1 = doc.createAttribute("ere_id");
                        relationAttrType1.setValue(targetObj.getId());

                        relation.setAttributeNode(relationAttrType1);

                        Element trigger1 = doc.createElement("trigger");
                        Attr trigger1AttrType2 = doc.createAttribute("offset");
                        trigger1AttrType2.setValue("" + targetObj.getTrigger().getOffset());
                        Attr trigger1AttrType1 = doc.createAttribute("length");
                        trigger1AttrType1.setValue("" + targetObj.getTrigger().getLength());
                        trigger1.appendChild(
                                doc.createTextNode(targetObj.getTrigger().getText()));
                        trigger1.setAttributeNode(trigger1AttrType2);
                        trigger1.setAttributeNode(trigger1AttrType1);
                        relation.appendChild(trigger1);
                        Element sentiment2 = doc.createElement("sentiment");
                        Attr senti2AttrType1 = doc.createAttribute("polarity");
                        if (sentimentObject.getSlot() != null) {
                            senti2AttrType1.setValue(sentimentObject.getSlot());
                        } else {
                            senti2AttrType1.setValue("");
                        }
                        Attr senti2AttrType2 = doc.createAttribute("sarcasm");
                        senti2AttrType2.setValue("no");

                        sentiment2.setAttributeNode(senti2AttrType1);
                        sentiment2.setAttributeNode(senti2AttrType2);

                        Element source2 = doc.createElement("source");
                        Attr src2AttrType1 = doc.createAttribute("ere_id");
                        src2AttrType1.setValue(entityObject.getEntityMentionId());
                        Attr src2AttrType2 = doc.createAttribute("offset");
                        src2AttrType2.setValue("" + entityObject.getEntityMentionOffset());
                        Attr src2AttrType3 = doc.createAttribute("length");
                        src2AttrType3.setValue("" + entityObject.getEntityMentionLength());
                        source2.appendChild(
                                doc.createTextNode(entityObject.getEntityMentionText()));
                        source2.setAttributeNode(src2AttrType1);
                        source2.setAttributeNode(src2AttrType2);
                        source2.setAttributeNode(src2AttrType3);
                        sentiment2.appendChild(source2);
                        relation.appendChild(sentiment2);
                        relations.appendChild(relation);
                    } else {
                        System.err.println("Null source Object!!");
                    }

                } else if (sentimentObject.getTarget() instanceof EventMention) {
                    EventMention targetObj = (EventMention) sentimentObject.getTarget();
                    if (sentimentObject.getSource() != null) {

                        // event element
                        EntityMention entityObject = sentimentObject.getSource();
                        Element event = doc.createElement("event");
                        Attr eventAttrType1 = doc.createAttribute("ere_id");
                        eventAttrType1.setValue(targetObj.getId());

                        event.setAttributeNode(eventAttrType1);

                        Element trigger2 = doc.createElement("trigger");
                        Attr trigger2AttrType2 = doc.createAttribute("offset");
                        trigger2AttrType2.setValue("" + targetObj.getTrigger().getOffset());
                        Attr trigger2AttrType1 = doc.createAttribute("length");
                        trigger2AttrType1.setValue("" + targetObj.getTrigger().getLength());
                        trigger2.appendChild(
                                doc.createTextNode(targetObj.getTrigger().getText()));
                        trigger2.setAttributeNode(trigger2AttrType1);
                        trigger2.setAttributeNode(trigger2AttrType2);
                        event.appendChild(trigger2);
                        Element sentiment3 = doc.createElement("sentiment");
                        Attr senti3AttrType1 = doc.createAttribute("polarity");
                        if (sentimentObject.getSlot() != null) {
                            senti3AttrType1.setValue(sentimentObject.getSlot());
                        } else {
                            senti3AttrType1.setValue("");
                        }
                        Attr senti3AttrType2 = doc.createAttribute("sarcasm");
                        senti3AttrType2.setValue("no");

                        sentiment3.setAttributeNode(senti3AttrType1);
                        sentiment3.setAttributeNode(senti3AttrType2);

                        Element source3 = doc.createElement("source");
                        Attr src3AttrType1 = doc.createAttribute("ere_id");
                        src3AttrType1.setValue(entityObject.getEntityMentionId());
                        Attr src3AttrType2 = doc.createAttribute("offset");
                        src3AttrType2.setValue("" + entityObject.getEntityMentionLength());
                        Attr src3AttrType3 = doc.createAttribute("length");
                        src3AttrType3.setValue("" + entityObject.getEntityMentionLength());
                        source3.appendChild(
                                doc.createTextNode(entityObject.getEntityMentionText()));
                        source3.setAttributeNode(src3AttrType1);
                        source3.setAttributeNode(src3AttrType2);
                        source3.setAttributeNode(src3AttrType3);
                        sentiment3.appendChild(source3);

                        event.appendChild(sentiment3);
                        events.appendChild(event);
                    } else {
                        System.err.println("Null source Object!!");
                    }
                } else {
                    System.err.println("Null sentiment  object!!");
                }

                TransformerFactory transformerFactory
                        = TransformerFactory.newInstance();
                Transformer transformer
                        = transformerFactory.newTransformer();
                transformer.setOutputProperty(OutputKeys.METHOD, "xml");
                transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "no");
                transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
                transformer.setOutputProperty(OutputKeys.INDENT, "yes");
                transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
                StreamResult consoleResult
                        = new StreamResult(System.out);
                transformer.transform(new DOMSource(doc), consoleResult);
                DOMSource src = new DOMSource(doc);
                StreamResult result
                        = new StreamResult(new File(output_path));
                transformer.transform(src, result);
                // Output to console for testing
//                StreamResult consoleResult
//                        = new StreamResult(System.out);
//                transformer.transform(src, consoleResult);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

