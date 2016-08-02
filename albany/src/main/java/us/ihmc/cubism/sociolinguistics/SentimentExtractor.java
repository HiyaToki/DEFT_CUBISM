package us.ihmc.cubism.sociolinguistics;

import adept.common.*;
import adept.io.Reader;
import adept.metadata.SourceAlgorithm;
import adept.module.AbstractModule;
import adept.module.AdeptModuleException;
import adept.module.IDocumentProcessor;
import adept.utilities.DocumentMaker;
import adept.common.NumberPhrase;
import java.io.BufferedWriter;

import org.apache.xpath.SourceTree;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.InvalidPropertiesFormatException;
import java.util.List;
import java.util.logging.Level;
import javax.xml.parsers.ParserConfigurationException;
import org.junit.Assert;
import edu.albany.cubism.sentiment.CubismSentimentExtractor;
import edu.albany.cubism.sentiment.ForumDependencies;
import edu.albany.cubism.util.Settings;

public class SentimentExtractor extends AbstractModule implements
        IDocumentProcessor {

    /**
     * The logger.
     */
    private final Logger logger = LoggerFactory.getLogger(getClass());
    private Document document = null;
    HashMap<Long, Pair<Entity, List<EntityMention>>> entities;
    long entity_id = 0;
    long entity_mention_id = 0;
    private String test_type = null; //regression test or benchmark test

    public SentimentExtractor() {
        this.entities = new HashMap();
    }

    @Override
    public void activate(String configFilePath)
            throws InvalidPropertiesFormatException, IOException,
            AdeptModuleException {
        super.activate(configFilePath);
    }

    @Override
    public HltContentContainer process(
            Document document,
            HltContentContainer hltContentContainerIn
    ) {
        this.document = document;
        return computeSentiment(document.getDefaultTokenStream().getTextValue().getBytes());
    }

    private HltContentContainer extractSentiment(HltContentContainer chcc,
            org.w3c.dom.Document xmldoc) {
        try {
            XPath xPath = XPathFactory.newInstance().newXPath();
            CubismSentimentExtractor cse = new CubismSentimentExtractor();
            ArrayList<ForumDependencies.CalculusInfo> sents = cse.extractSentiment(xmldoc);
            List<SentimentMention> sms = new ArrayList();
            for (ForumDependencies.CalculusInfo sent : sents) {
                SentimentMention sm;
                String sourceText1 = sent.oriQuery;
                System.out.println("query: " + sent.oriQuery);
                String source_type = "per";
                if (sent.query_node != null) {
                    source_type = sent.query_node.getEntityType();
                }
                Pair<Entity, EntityMention> source_eem = this.createEntityWithMentions(sourceText1, source_type, 1, "NAM", 1, 1, entity_id, entity_mention_id);
                String targetText1 = sent.x;
                System.out.println("sent.x: " + sent.x);
                String target_type = "per";
                if (sent.en_x != null) {
                    target_type = sent.en_x.parent.getType();
                }
                String mention_type = "NAM";
                Pair<Entity, EntityMention> target_eem = this.createEntityWithMentions(targetText1, target_type, 1, mention_type, 1, 1, entity_id, entity_mention_id);
                Pair<TokenOffset, TokenStream> ch_ts = this.createTokenStream(sent.foundLine);
                Chunk chk = new Chunk(ch_ts.getL(), ch_ts.getR());
                sm = this.createSentimentMention((float) 0.8, chk, source_eem.getR(), target_eem.getR(), this.genStrength(sent.sentiment));
                sms.add(sm);
            }
            chcc.setSentimentMentions(sms);
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(SentimentExtractor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            java.util.logging.Logger.getLogger(SentimentExtractor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParserConfigurationException ex) {
            java.util.logging.Logger.getLogger(SentimentExtractor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(SentimentExtractor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SAXException ex) {
            java.util.logging.Logger.getLogger(SentimentExtractor.class.getName()).log(Level.SEVERE, null, ex);
        }
        return chcc;
    }

    private HltContentContainer extractSentimentRegression(HltContentContainer chcc,
            org.w3c.dom.Document xmldoc) {
        try {
            XPath xPath = XPathFactory.newInstance().newXPath();
            CubismSentimentExtractor cse = new CubismSentimentExtractor();
            ArrayList<ForumDependencies.CalculusInfo> sents = cse.extractSentiment(xmldoc);
            List<SentimentMention> sms = new ArrayList();
            for (ForumDependencies.CalculusInfo sent : sents) {
                SentimentMention sm;
                String sourceText1 = sent.oriQuery;
                System.out.println("query: " + sent.oriQuery);
                String source_type = "per";
                if (sent.query_node != null) {
                    source_type = sent.query_node.getEntityType();
                }
                Pair<Entity, EntityMention> source_eem = this.createEntityWithMentions(sourceText1, source_type, 1, "NAM", 1, 1, entity_id, entity_mention_id);
                String targetText1 = sent.x;
                System.out.println("sent.x: " + sent.x);
                String target_type = "per";
                if (sent.en_x != null) {
                    target_type = sent.en_x.parent.getType();
                }
                String mention_type = "NAM";
                Pair<Entity, EntityMention> target_eem = this.createEntityWithMentions(targetText1, target_type, 1, mention_type, 1, 1, entity_id, entity_mention_id);
                Pair<TokenOffset, TokenStream> ch_ts = this.createTokenStream(sent.foundLine);
                Chunk chk = new Chunk(ch_ts.getL(), ch_ts.getR());
                sm = this.createSentimentMention((float) 0.8, chk, source_eem.getR(), target_eem.getR(), this.genStrength(sent.sentiment));
                sms.add(sm);
            }
            chcc.setSentimentMentions(sms);
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(SentimentExtractor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            java.util.logging.Logger.getLogger(SentimentExtractor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParserConfigurationException ex) {
            java.util.logging.Logger.getLogger(SentimentExtractor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(SentimentExtractor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SAXException ex) {
            java.util.logging.Logger.getLogger(SentimentExtractor.class.getName()).log(Level.SEVERE, null, ex);
        }
        return chcc;
    }

    private HltContentContainer extractSentimentBenchmark(HltContentContainer chcc,
            org.w3c.dom.Document xmldoc) {
        try {
            XPath xPath = XPathFactory.newInstance().newXPath();
            CubismSentimentExtractor cse = new CubismSentimentExtractor();
            ArrayList<ForumDependencies.CalculusInfo> sents = cse.extractSentiment(xmldoc);
            List<SentimentMention> sms = new ArrayList();
            for (ForumDependencies.CalculusInfo sent : sents) {
                SentimentMention sm;
                String sourceText1 = sent.oriQuery;
                System.out.println("query: " + sent.oriQuery);
                String source_type = "per";
                if (sent.query_node != null) {
                    source_type = sent.query_node.getEntityType();
                }
                Pair<Entity, EntityMention> source_eem = this.createEntityWithMentions(sourceText1, source_type, 1, "NAM", 1, 1, entity_id, entity_mention_id);
                String targetText1 = sent.x;
                System.out.println("sent.x: " + sent.x);
                String target_type = "per";
                if (sent.en_x != null) {
                    target_type = sent.en_x.parent.getType();
                }
                String mention_type = "NAM";
                Pair<Entity, EntityMention> target_eem = this.createEntityWithMentions(targetText1, target_type, 1, mention_type, 1, 1, entity_id, entity_mention_id);
                Pair<TokenOffset, TokenStream> ch_ts = this.createTokenStream(sent.foundLine);
                Chunk chk = new Chunk(ch_ts.getL(), ch_ts.getR());
                sm = this.createSentimentMention((float) 0.8, chk, source_eem.getR(), target_eem.getR(), this.genStrength(sent.sentiment));
                sms.add(sm);
            }
            chcc.setSentimentMentions(sms);
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(SentimentExtractor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            java.util.logging.Logger.getLogger(SentimentExtractor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParserConfigurationException ex) {
            java.util.logging.Logger.getLogger(SentimentExtractor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(SentimentExtractor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SAXException ex) {
            java.util.logging.Logger.getLogger(SentimentExtractor.class.getName()).log(Level.SEVERE, null, ex);
        }
        return chcc;
    }

    public String getTestType() {
        return test_type;
    }

    public void setTestType(String test_format) {
        this.test_type = test_format;
    }

    public Document createDocument(String content) {
        String path = "";
        try {
            System.out.println("sample file path: " + Settings.getValue("tmp_file"));
            String curr_path = System.getProperty("user.dir");
//                    System.out.println("curr_path(in parseSettingsLine of Settings): " + curr_path);
            if (curr_path.endsWith("test-classes")
                    || curr_path.endsWith("test-classes/")) {
                path = curr_path + "/us/ihmc/cubism/sociolinguistics/conf/tmp_file";
            } else {
                path = curr_path + "main/resources/us/albany/cubism/conf/tmp_file";
            }
            BufferedWriter bw = new BufferedWriter(new FileWriter(new File(path)));
            bw.write(content);
            bw.flush();
            bw.close();
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(SentimentExtractor.class.getName()).log(Level.SEVERE, null, ex);
        }
        Document document = DocumentMaker
                .getInstance()
                .createDefaultDocument(
                        "sample.txt",
                        null,
                        "Text",
                        "sample.txt",
                        "English",
                        //"/home/aparna/ihmc/deft/adept/adept-kb/src/test/resources/adept/kbapi/files/str" + c + ".txt",

                        path,
                        new HltContentContainer()
                );
        return document;
    }

    private String genStrength(double str_double) {
        String str_score = null;
        if (str_double >= 2.5) {
            str_score = "3";
        } else if (str_double >= 1.5) {
            str_score = "2";
        } else if (str_double >= 0) {
            str_score = "1";
        } else if (str_double > -1.5) {
            str_score = "-1";
        } else if (str_double > -2.5) {
            str_score = "-2";
        } else {
            str_score = "3";
        }
        return str_score;
    }

    public SentimentMention createSentimentMention(float sentimentMentionConfidence,
            Chunk chunk,
            EntityMention source,
            EntityMention target,
            String strength) {
        CharOffset numberCharOffset = new CharOffset(0, strength.length());
        String numberText = strength;
        Token numberToken = new Token(1, numberCharOffset, numberText);
        TokenOffset numberTokenOffset = new TokenOffset(0, 0);
        TokenStream testNumericTokenStream = new TokenStream(TokenizerType.WHITESPACE,
                TranscriptType.SOURCE, "English", ChannelName.NONE, ContentType.TEXT, document);
        testNumericTokenStream.add(numberToken);
        NumberPhrase strengthPhrase = new NumberPhrase(numberTokenOffset, testNumericTokenStream);
        NumericValue strengthNumericValue = new NumericValue(new Integer(strength));
        strengthPhrase.setNumber(strengthNumericValue.asNumber());
        SentimentMention.Builder sentimentMentionBuilder = SentimentMention.builder();
        sentimentMentionBuilder.setConfidence(sentimentMentionConfidence);
        sentimentMentionBuilder.addJustification(chunk);
        sentimentMentionBuilder.addArgument(SentimentMention.Filler.createSourceArgument(
                source, 0.51f));
        sentimentMentionBuilder.addArgument(SentimentMention.Filler.createStrengthArgument(
                strengthPhrase, 1.0f));
        //sentimentMentionBuilder.addArgument(SentimentMention.Filler.createTargetArgument(
        //        relationMention, 0.86f));
        sentimentMentionBuilder.addArgument(SentimentMention.Filler.createTargetArgument(
                target, 0.86f));

        SentimentMention sm = sentimentMentionBuilder.build();
        return sm;
    }

    public Pair<Entity, EntityMention> createEntityWithMentions(String text, String entityType,
            float entityConfidence, String entityMentionType, float entityMentionConfidence,
            float entityCanonicalMentionConfidence, long entity_id, long entity_mention_id) {
        Pair<Entity, EntityMention> eem = null;
        try {
            // create entity
            if (this.entities.containsKey(entity_id)) {
                Pair<Entity, List<EntityMention>> eems = this.entities.get(entity_id);
                ArrayList<EntityMention> ems = (ArrayList) eems.getR();
                boolean containsEm = false;
                for (EntityMention em : ems) {
                    if (em.getSequenceId() == entity_mention_id) {
                        eem = new Pair(eems.getL(), em);
                        containsEm = true;
                        break;
                    }
                }
                if (!containsEm) {
                    Pair<TokenOffset, TokenStream> tt = this.createTokenStream(text);
                    EntityMention mention = this.createEntityMention(tt, entity_id, entity_mention_id, entityType, entityMentionConfidence, entityMentionType);
                    ems.add(mention);
                    entity_mention_id++;
                    eem = new Pair(eems.getL(), mention);
                }
            } else {
                Pair<TokenOffset, TokenStream> tt = this.createTokenStream(text);

                // create mention
                List<EntityMention> mentions = new ArrayList<EntityMention>();
                EntityMention mention = this.createEntityMention(tt, entity_id, entity_mention_id, entityType, entityMentionConfidence, entityMentionType);
                mentions.add(mention);
                entity_mention_id++;

                // create entity
                Entity entity = this.createEntity(mention, entityConfidence, entityCanonicalMentionConfidence, entity_id, entityType);
                entity_id++;
                Pair<Entity, List<EntityMention>> eems = new Pair(entity, mentions);
                this.entities.put(entity_id, eems);
                eem = new Pair(entity, mention);
            }
            return eem;
        } catch (Exception ex) {
            ex.printStackTrace();
            Assert.fail("Unable to create entity object. " + ex.getMessage());
        }

        return eem;
    }

    public Entity createEntity(EntityMention mention, float entityConfidence, float entityCanonicalMentionConfidence, long entity_id, String entityType) {
        Entity entity = new Entity(entity_id, new Type(entityType));
        entity.setCanonicalMentions(mention);
        entity.setEntityConfidence(entityConfidence);
        entity.setCanonicalMentionConfidence(entityCanonicalMentionConfidence);
        return entity;
    }

    public EntityMention createEntityMention(Pair<TokenOffset, TokenStream> tt, long entity_id, long entity_mention_id, String entityType,
            float entityMentionConfidence, String entityMentionType) {
        EntityMention mention = new EntityMention(entity_mention_id, tt.getL(), tt.getR());
        mention.addEntityConfidencePair(entity_id, entityMentionConfidence);
        mention.setMentionType(new Type(entityMentionType));
        mention.setSourceAlgorithm(new SourceAlgorithm("Sentiment", "CUBISM"));
        mention.setEntityType(new Type(entityType));
        return mention;
    }

    public Pair<TokenOffset, TokenStream> createTokenStream(String text) {
        int start = 0;
        int end = text.length();
        CharOffset testCharOff = new CharOffset(start, end);
        System.out.println("text: " + text);
        Token testToken = new Token(0, testCharOff, text);
        document = this.createDocument(text);
        TokenStream TokenStream1 = new TokenStream(TokenizerType.WHITESPACE, TranscriptType.SOURCE,
                "English", ChannelName.NONE, ContentType.TEXT, document);
        TokenOffset TokenOffset1 = new TokenOffset(0, 0);
        TokenStream1.add(testToken);
        return new Pair(TokenOffset1, TokenStream1);
    }

    public HltContentContainer computeSentiment(byte[] tpnxml) {
        HltContentContainer chcc = new HltContentContainer();
        try {
            DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
            InputStream instr = new ByteArrayInputStream(tpnxml);

            InputSource is = new InputSource(instr);
            org.w3c.dom.Document xmldoc = docBuilder.parse(is);

            // normalize text representation
            xmldoc.getDocumentElement().normalize();
            chcc = extractSentiment(chcc, xmldoc);

        } catch (SAXParseException err) {
            System.out.println("** Parsing error" + ", line "
                    + err.getLineNumber() + ", uri " + err.getSystemId());
            System.out.println(" " + err.getMessage());

        } catch (SAXException e) {
            Exception x = e.getException();
            ((x == null) ? e : x).printStackTrace();

        } catch (Throwable t) {
            t.printStackTrace();
        }
        return chcc;
    }

    public HltContentContainer computeSentimentRegression(byte[] tpnxml) {
        HltContentContainer chcc = new HltContentContainer();
        try {
            DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
            InputStream instr = new ByteArrayInputStream(tpnxml);

            InputSource is = new InputSource(instr);
            org.w3c.dom.Document xmldoc = docBuilder.parse(is);

            // normalize text representation
            xmldoc.getDocumentElement().normalize();
            chcc = extractSentimentRegression(chcc, xmldoc);

        } catch (SAXParseException err) {
            System.out.println("** Parsing error" + ", line "
                    + err.getLineNumber() + ", uri " + err.getSystemId());
            System.out.println(" " + err.getMessage());

        } catch (SAXException e) {
            Exception x = e.getException();
            ((x == null) ? e : x).printStackTrace();

        } catch (Throwable t) {
            t.printStackTrace();
        }
        return chcc;
    }

    public HltContentContainer computeSentimentBenchmark(byte[] tpnxml) {
        HltContentContainer chcc = new HltContentContainer();
        try {
            DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
            InputStream instr = new ByteArrayInputStream(tpnxml);

            InputSource is = new InputSource(instr);
            org.w3c.dom.Document xmldoc = docBuilder.parse(is);

            // normalize text representation
            xmldoc.getDocumentElement().normalize();
            chcc = extractSentimentBenchmark(chcc, xmldoc);

        } catch (SAXParseException err) {
            System.out.println("** Parsing error" + ", line "
                    + err.getLineNumber() + ", uri " + err.getSystemId());
            System.out.println(" " + err.getMessage());

        } catch (SAXException e) {
            Exception x = e.getException();
            ((x == null) ? e : x).printStackTrace();

        } catch (Throwable t) {
            t.printStackTrace();
        }
        return chcc;
    }

    @Override
    public long processAsync(Document document,
            HltContentContainer hltContentContainer)
            throws AdeptModuleException {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public Boolean tryGetResult(long requestId,
            HltContentContainer hltContentContainer)
            throws AdeptModuleException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public HltContentContainer process(Document document)
            throws AdeptModuleException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public long processAsync(Document document) throws AdeptModuleException {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void process(HltContentContainer hltContentContainer)
            throws AdeptModuleException {
        // TODO Auto-generated method stub

    }

    @Override
    public long processAsync(HltContentContainer hltContentContainer)
            throws AdeptModuleException {
        // TODO Auto-generated method stub
        return 0;
    }
}
