/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.albany.cubism.ie;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 *
 * @author Mehrdad
 */
public class EREParser {

    /**
     * @param args the command line arguments
     */
    public static ArrayList<Entity> findEntity(Document doc) {

        ArrayList<Entity> EntityList = new ArrayList<Entity>();

        NodeList entityList = doc.getElementsByTagName("entity");

        for (int temp = 0; temp < entityList.getLength(); temp++) {
            Node nNode = entityList.item(temp);
            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                Element eElement = (Element) nNode;

                Entity entity = null;

                String id = eElement.getAttribute("id");
                String type = eElement.getAttribute("type");
                String specifity = eElement.getAttribute("specificity");

//                System.out.println("id: " + id);
//                System.out.println("type: " + type);
//                System.out.println("specifity: " + specifity);
                ArrayList<EntityMention> entityMentions = new ArrayList<EntityMention>();

                NodeList entityMentionList = eElement.getElementsByTagName("entity_mention");

                for (int i = 0; i < entityMentionList.getLength(); i++) {
                    Node emNode = entityMentionList.item(i);
                    if (emNode.getNodeType() == Node.ELEMENT_NODE) {
                        Element emElement = (Element) emNode;

                        String EMid = emElement.getAttribute("id");
                        String EMnoun_type = emElement.getAttribute("noun_type");
                        String EMsource = emElement.getAttribute("source");
                        String EMoffset = emElement.getAttribute("offset");
                        String EMlength = emElement.getAttribute("length");
                        String EMtext = emElement.getElementsByTagName("mention_text").item(0).getTextContent();

                        int EMoffsetInt = Integer.parseInt(EMoffset);
                        int EMlengthInt = Integer.parseInt(EMlength);

                        Node nom_headNode = emElement.getElementsByTagName("nom_head").item(0);
                        Element nhElement = (Element) nom_headNode;

                        NomHead nomHead = null;
                        String NHsource = "";
                        String NHoffset = "";
                        String NHlength = "";
                        String NHtext = "";

                        if (nhElement != null) {
                            NHsource = nhElement.getAttribute("source");
                            NHoffset = nhElement.getAttribute("offset");
                            NHlength = nhElement.getAttribute("length");
                            NHtext = emElement.getElementsByTagName("nom_head").item(0).getTextContent();

                            int NHoffsetInt = Integer.parseInt(NHoffset);
                            int NHlengthInt = Integer.parseInt(NHlength);
                            nomHead = new NomHead(NHsource, NHoffsetInt, NHlengthInt, NHtext);
                        }

                        EntityMention entityMention = new EntityMention(EMid, EMnoun_type, EMsource, EMoffsetInt, EMlengthInt, EMtext, nomHead);
                        entityMentions.add(entityMention);

//                        System.out.println("id: " + EMid);
//                        System.out.println("noun_type: " + EMnoun_type);
//                        System.out.println("source: " + EMsource);
//                        System.out.println("offset: " + EMoffset);
//                        System.out.println("length: " + EMlength);
//                        System.out.println("mention_text: " + EMtext);
//                        System.out.println("================");
                        if (nhElement != null) {
//                            System.out.println("nh source: " + NHsource);
//                            System.out.println("nh offset: " + NHoffset);
//                            System.out.println("nh length: " + NHlength);
//                            System.out.println("nh text: " + NHtext);
                        }
//                        System.out.println("--=--=--=--=--=--=--=--=--=--=--=--=--=--=--=--=--=");
                    }
                }
//                System.out.println("======== NEXT ========");

                entity = new Entity(id, type, specifity, entityMentions);
                EntityList.add(entity);
            }
        }
        return EntityList;
    }

    public static ArrayList<Relation> findRelation(Document doc) {

        ArrayList<Relation> RelationList = new ArrayList<Relation>();

        NodeList relationList = doc.getElementsByTagName("relation");

        for (int temp = 0; temp < relationList.getLength(); temp++) {
            Relation relation = null;
            Node nNode = relationList.item(temp);
            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                Element eElement = (Element) nNode;

                String id = eElement.getAttribute("id");
                String type = eElement.getAttribute("type");
                String subtype = eElement.getAttribute("subtype");

//                System.out.println("id: " + id);
//                System.out.println("type: " + type);
//                System.out.println("subtype: " + subtype);
                NodeList relationMentionNodes = eElement.getElementsByTagName("relation_mention");
                ArrayList<RelationMention> rms = new ArrayList();
                for (int i = 0; i < relationMentionNodes.getLength(); i++) {
                    Node relationMentionNode = relationMentionNodes.item(i);
                    if (relationMentionNode.getNodeType() == Node.ELEMENT_NODE) {
                        Element rmElement = (Element) relationMentionNode;
                        Node rel_arg1Node = rmElement.getElementsByTagName("rel_arg1").item(0);
                        Node rel_arg2Node = rmElement.getElementsByTagName("rel_arg2").item(0);
                        Node triggerNode = rmElement.getElementsByTagName("trigger").item(0);

                        Element RMElement = (Element) relationMentionNode;
                        Element RA1Element = (Element) rel_arg1Node;
                        Element RA2Element = (Element) rel_arg2Node;
                        Element TElement = (Element) triggerNode;

                        String relationMentionId = RMElement.getAttribute("id");
                        String relationMentionRealis = RMElement.getAttribute("realis");

                        String relArg1EntityId = RA1Element.getAttribute("entity_id");
                        String relArg1EntityMentionId = RA1Element.getAttribute("entity_mention_id");
                        String relArg1Role = RA1Element.getAttribute("role");
                        String relArg1Text = RA1Element.getTextContent();

                        RelationArg relationArg1 = new RelationArg(relArg1EntityId, relArg1EntityMentionId, relArg1Role, relArg1Text);

                        String relArg2EntityId = RA2Element.getAttribute("entity_id");
                        String relArg2EntityMentionId = RA2Element.getAttribute("entity_mention_id");
                        String relArg2Role = RA2Element.getAttribute("role");
                        String relArg2Text = RA2Element.getTextContent();

                        RelationArg relationArg2 = new RelationArg(relArg2EntityId, relArg2EntityMentionId, relArg2Role, relArg2Text);

                        String triggerSource = "";
                        String triggerOffset = "0";
                        String triggerLength = "0";
                        String triggerText = "";

                        if (TElement != null) {
                            triggerSource = TElement.getAttribute("source");
                            triggerOffset = TElement.getAttribute("offset");
                            triggerLength = TElement.getAttribute("length");
                            triggerText = TElement.getTextContent();
                        }

                        Trigger trigger = new Trigger(triggerSource, Integer.parseInt(triggerOffset), Integer.parseInt(triggerLength), triggerText);

                        RelationMention relationMention = new RelationMention(relationMentionId, relationMentionRealis, relationArg1, relationArg2, trigger);
                        rms.add(relationMention);
                    }
                }
                relation = new Relation(id, type, subtype, rms);

//                System.out.println("rel men id: " + relationMentionId);
//                System.out.println("rel men type: " + relationMentionRealis);
//                System.out.println("rel arg1 id: " + relArg1EntityId);
//                System.out.println("rel arg1 e m id: " + relArg1EntityMentionId);
//                System.out.println("rel arg1 role: " + relArg1Role);
//                System.out.println("rel arg1 text: " + relArg1Text);
//                System.out.println("rel arg2 id: " + relArg2EntityId);
//                System.out.println("rel arg2 e m id: " + relArg2EntityMentionId);
//                System.out.println("rel arg2 role: " + relArg2Role);
//                System.out.println("rel arg1 text: " + relArg2Text);
//                System.out.println("trig src: " + triggerSource);
//                System.out.println("trig off: " + triggerOffset);
//                System.out.println("trig len: " + triggerLength);
//                System.out.println("trig txt: " + triggerText);
//                System.out.println("======== NEXT ========");
            }
            RelationList.add(relation);
        }
        return RelationList;
    }

    public static ArrayList<Event> findEvent(Document doc) {

        ArrayList<Event> EventList = new ArrayList<Event>();

        NodeList eventList = doc.getElementsByTagName("hopper");

        for (int temp = 0; temp < eventList.getLength(); temp++) {
            Event event = null;
            Node nNode = eventList.item(temp);
            ArrayList<EventMention> evmss = new ArrayList();
            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                Element eElement = (Element) nNode;

                String id = eElement.getAttribute("id");

//                System.out.println("id: " + id);
                NodeList evms = eElement.getElementsByTagName("event_mention");
                for (int j = 0; j < evms.getLength(); j++) {
                    Node eventMentionNode = evms.item(j);
                    if (eventMentionNode.getNodeType() == Node.ELEMENT_NODE) {
                        Element EMElement = (Element) eventMentionNode;
                        Node triggerNode = EMElement.getElementsByTagName("trigger").item(0);

//                Element EMElement = (Element) eventMentionNode;
//                Element EMEElement = null;
//                Element EMFElement = null;
                        NodeList emargNodeList = eElement.getElementsByTagName("em_arg");
                        int l = emargNodeList.getLength();

                        EventMentionArgEntity eventMentionArgEntity = null;
                        EventMentionArgFiller eventMentionArgFiller = null;

                        ArrayList<EventMentionArgEntity> eventMentionArgEntities = new ArrayList<EventMentionArgEntity>();
                        ArrayList<EventMentionArgFiller> eventMentionArgFillers = new ArrayList<EventMentionArgFiller>();

                        for (int i = 0; i < l; i++) {
                            Node emargNode = emargNodeList.item(i);
                            Element EAElement = (Element) emargNode;
//                    System.out.println("** " + emargNode.getAttributes().item(0).getNodeName());
                            if (emargNode.getAttributes().item(0).getNodeName().startsWith("entity")) {
                                String entityId = EAElement.getAttribute("entity_id");
                                String entityMentionId = EAElement.getAttribute("entity_mention_id");
                                String role = EAElement.getAttribute("role");
                                String realis = EAElement.getAttribute("realis");
                                String text = EAElement.getTextContent();
//                        System.out.println("=========================");
//                        System.out.println("Event Mention Arg Entity:");
//                        System.out.println("entity_id: " + entityId);
//                        System.out.println("entity_mention_id: " + entityMentionId);
//                        System.out.println("role: " + role);
//                        System.out.println("realis: " + realis);
//                        System.out.println("text: " + text);
                                eventMentionArgEntity = new EventMentionArgEntity(entityId, entityMentionId, role, realis, text);
                                eventMentionArgEntities.add(eventMentionArgEntity);
                            }

                            if (emargNode.getAttributes().item(0).getNodeName().startsWith("filler")) {
                                String fillerId = EAElement.getAttribute("filler_id");
                                String role = EAElement.getAttribute("role");
                                String realis = EAElement.getAttribute("realis");
                                String text = EAElement.getTextContent();
                                eventMentionArgFiller = new EventMentionArgFiller(fillerId, role, realis, text);
//                        System.out.println("=========================");
//                        System.out.println("Event Mention Arg Filler:");
//                        System.out.println("filler_id: " + fillerId);
//                        System.out.println("role: " + role);
//                        System.out.println("realis: " + realis);
//                        System.out.println("text: " + text);
                                eventMentionArgFiller = new EventMentionArgFiller(fillerId, role, realis, text);
                                eventMentionArgFillers.add(eventMentionArgFiller);
                            }

                        }

                        Element TElement = (Element) triggerNode;

                        String eventMentionId = EMElement.getAttribute("id");
                        String eventMentionType = EMElement.getAttribute("type");
                        String eventMentionSubtype = EMElement.getAttribute("subtype");
                        String eventMentionRealis = EMElement.getAttribute("realis");

                        String triggerSource = TElement.getAttribute("source");
                        String triggerOffset = TElement.getAttribute("offset");
                        String triggerLength = TElement.getAttribute("length");
                        String triggerText = TElement.getTextContent();

                        Trigger trigger = new Trigger(triggerSource, Integer.parseInt(triggerOffset), Integer.parseInt(triggerLength), triggerText);

                        EventMention eventMention = new EventMention(eventMentionId, eventMentionType, eventMentionSubtype, eventMentionRealis, eventMentionArgEntities, eventMentionArgFillers, trigger);
                        evmss.add(eventMention);
                    }
                }
                event = new Event(id, evmss);

            }
            EventList.add(event);
        }
        return EventList;
    }

    public static void main(String[] args) {
        try {
            File xmlFile = new File("/home/aparna/Downloads/0f03cc5a508d630c6c8c8c61396e31a9.rich_ere.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = null;
            Document doc = null;

            dBuilder = dbFactory.newDocumentBuilder();
            doc = dBuilder.parse(xmlFile);

            doc.getDocumentElement().normalize();

            ArrayList<Entity> entityList = new ArrayList<Entity>();
            ArrayList<Event> eventList = new ArrayList<Event>();
            ArrayList<Relation> relationList = new ArrayList<Relation>();

            // Entity
            entityList = findEntity(doc);

            for (Entity entity : entityList) {
                System.out.println("Entity ID: " + entity.getEntityId());
                System.out.println("Entity Type: " + entity.getEntityType());
                System.out.println("Entity Specifity: " + entity.getEntitySpecifity());
                ArrayList<EntityMention> entityMentions = entity.getEntityMentions();
                for (EntityMention entityMention : entityMentions) {
                    System.out.println("Entity Mention ID: " + entityMention.getEntityMentionId());
                    System.out.println("Entity Mention noun_type: " + entityMention.getEntityMentionNounType());
                    System.out.println("Entity Mention source: " + entityMention.getEntityMentionsource());
                    System.out.println("Entity Mention offset: " + entityMention.getEntityMentionOffset());
                    System.out.println("Entity Mention length: " + entityMention.getEntityMentionLength());
                    System.out.println("Entity Mention text: " + entityMention.getEntityMentionText());
                    NomHead nomHead = entityMention.getNomHead();
                    if (nomHead != null) {
                        System.out.println("nom head source: " + nomHead.getSource());
                        System.out.println("nom head offset: " + nomHead.getOffset());
                        System.out.println("nom head length" + nomHead.getLength());
                        System.out.println("nom head text: " + nomHead.getText());
                    }
                }
                System.out.println("---------------");
            }

            // Relation
            relationList = findRelation(doc);

            for (Relation relation : relationList) {
                System.out.println("Relation ID: " + relation.getId());
                System.out.println("Relation Type: " + relation.getType());
                System.out.println("Relation Subtype: " + relation.getSubtype());
                RelationMention relationMention = relation.getRelationMention();
                System.out.println("Relation Mention ID: " + relationMention.getId());
                System.out.println("Relation Mention realis: " + relationMention.getRealis());
                RelationArg relationArg1 = relationMention.getRelationArg1();
                System.out.println("Relation Arg1 entity ID: " + relationArg1.getEntityId());
                System.out.println("Relation Arg1 entity mention ID: " + relationArg1.getEntityMentionId());
                System.out.println("Relation Arg1 role: " + relationArg1.getRole());
                System.out.println("Relation Arg1 text: " + relationArg1.getText());
                RelationArg relationArg2 = relationMention.getRelationArg2();
                System.out.println("Relation Arg2 entity ID: " + relationArg2.getEntityId());
                System.out.println("Relation Arg2 entity mention ID: " + relationArg2.getEntityMentionId());
                System.out.println("Relation Arg2 role: " + relationArg2.getRole());
                System.out.println("Relation Arg2 text: " + relationArg2.getText());
                Trigger trigger = relationMention.getTrigger();
                System.out.println("Trigger source: " + trigger.getSource());
                System.out.println("Trigger offset: " + trigger.getOffset());
                System.out.println("Trigger length: " + trigger.getLength());
                System.out.println("Trigger text: " + trigger.getText());
                System.out.println("---------------");
            }

            // Event
            eventList = findEvent(doc);

            for (Event event : eventList) {
                System.out.println("Event ID: " + event.getEventId());
                EventMention eventMention = event.getEventMention();
                System.out.println("Event Mention ID: " + eventMention.getId());
                System.out.println("Event Mention Type: " + eventMention.getType());
                System.out.println("Event Mention Subtype: " + eventMention.getSubtype());
                System.out.println("Event Mention Realis: " + eventMention.getRealis());
                ArrayList<EventMentionArgEntity> eventMentionArgEntityList = eventMention.getEventMentionArgEntity();
                for (EventMentionArgEntity eventMentionArgEntity : eventMentionArgEntityList) {
                    System.out.println("Event Mention Arg Entity ID: " + eventMentionArgEntity.getEntityId());
                    System.out.println("Event Mention Arg Entity Mention ID: " + eventMentionArgEntity.getEntityMentionId());
                    System.out.println("Event Mention Arg Entity Role: " + eventMentionArgEntity.getRole());
                    System.out.println("Event Mention Arg Entity Realis: " + eventMentionArgEntity.getRealis());
                    System.out.println("Event Mention Arg Entity text: " + eventMentionArgEntity.getText());
                }
                ArrayList<EventMentionArgFiller> eventMentionArgFillerList = eventMention.getEventMentionArgFiller();
                for (EventMentionArgFiller eventMentionArgFiller : eventMentionArgFillerList) {
                    System.out.println("Event Mention Arg Filler ID: " + eventMentionArgFiller.getFillerId());
                    System.out.println("Event Mention Arg Filler Role: " + eventMentionArgFiller.getRole());
                    System.out.println("Event Mention Arg Filler Realis: " + eventMentionArgFiller.getRealis());
                    System.out.println("Event Mention Arg Filler text: " + eventMentionArgFiller.getText());
                }
                Trigger trigger = eventMention.getTrigger();
                System.out.println("Trigger source: " + trigger.getSource());
                System.out.println("Trigger offset: " + trigger.getOffset());
                System.out.println("Trigger length: " + trigger.getLength());
                System.out.println("Trigger text: " + trigger.getText());
                System.out.println("---------------");
            }

        } catch (SAXException ex) {
            Logger.getLogger(EREParser.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(EREParser.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(EREParser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     *
     * @param path: the path of xml file that contains event annotation
     * @return
     */
    public static ArrayList<Entity> findEntities(String path) {
        try {
            File xmlFile = new File(path);
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = null;
            Document doc = null;

            dBuilder = dbFactory.newDocumentBuilder();
            doc = dBuilder.parse(xmlFile);

            doc.getDocumentElement().normalize();

            ArrayList<Entity> entityList = new ArrayList<Entity>();
            // Entity
            entityList = findEntity(doc);
            return entityList;
        } catch (SAXException ex) {
            Logger.getLogger(EREParser.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(EREParser.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(EREParser.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    /**
     *
     * @param path: the path of xml file that contains event annotation
     * @return
     */
    public static ArrayList<Relation> findRelations(String path) {
        try {
            File xmlFile = new File(path);
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = null;
            Document doc = null;

            dBuilder = dbFactory.newDocumentBuilder();
            doc = dBuilder.parse(xmlFile);

            doc.getDocumentElement().normalize();

            ArrayList<Relation> relationList = new ArrayList<Relation>();

            // Relation
            relationList = findRelation(doc);
            return relationList;
        } catch (SAXException ex) {
            Logger.getLogger(EREParser.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(EREParser.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(EREParser.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    /**
     *
     * @param path: the path of xml file that contains event annotation
     * @return
     */
    public static ArrayList<Event> findEvents(String path) {
        try {
//            File xmlFile = new File("/home/aparna/Downloads/0f03cc5a508d630c6c8c8c61396e31a9.rich_ere.xml");
            File xmlFile = new File(path);
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = null;
            Document doc = null;

            dBuilder = dbFactory.newDocumentBuilder();
            doc = dBuilder.parse(xmlFile);

            doc.getDocumentElement().normalize();

            ArrayList<Event> eventList = new ArrayList<Event>();

            // Event
            eventList = findEvent(doc);
            return eventList;

        } catch (SAXException ex) {
            Logger.getLogger(EREParser.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(EREParser.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(EREParser.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

}
