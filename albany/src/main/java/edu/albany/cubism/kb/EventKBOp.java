/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.albany.cubism.kb;

import adept.common.ChannelName;
import adept.common.CharOffset;
import adept.common.Chunk;
import adept.common.ContentType;
import adept.common.Document;
import adept.common.DocumentMentalStateArgument;
import adept.common.DocumentRelation;
import adept.common.DocumentRelationArgument;
import adept.common.DocumentSentiment;
import adept.common.Entity;
import adept.common.EntityMention;
import adept.common.HltContentContainer;
import adept.common.Item;
import adept.common.KBID;
import adept.common.NumberPhrase;
import adept.common.NumericValue;
import adept.common.Pair;
import adept.common.RelationMention;
import adept.common.SentimentMention;
import adept.common.TemporalResolution;
import adept.common.TemporalSpan;
import adept.common.TemporalValue;
import adept.common.TimePhrase;
import adept.common.Token;
import adept.common.TokenOffset;
import adept.common.TokenStream;
import adept.common.TokenizerType;
import adept.common.TranscriptType;
import adept.common.Type;
import adept.common.XSDDate;
import adept.io.Reader;
import adept.kbapi.KB;
import adept.kbapi.KBBelief;
import adept.kbapi.KBDate;
import adept.kbapi.KBEntity;
import adept.kbapi.KBEvent;
import adept.kbapi.KBGenericThing;
import adept.kbapi.KBNumber;
import adept.kbapi.KBOntologyMap;
import adept.kbapi.KBParameters;
import adept.kbapi.KBPredicateArgument;
import adept.kbapi.KBProvenance;
import adept.kbapi.KBQueryException;
import adept.kbapi.KBRelation;
import adept.kbapi.KBRelationArgument;
import adept.kbapi.KBSentiment;
import adept.kbapi.KBTemporalSpan;
import adept.kbapi.KBTextProvenance;
import adept.kbapi.KBUpdateException;
import adept.kbapi.RemoteSPARQLService;
import adept.kbapi.sql.QuickJDBC;
import adept.metadata.SourceAlgorithm;
import adept.utilities.DocumentMaker;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableSet;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.update.GraphStoreFactory;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.InvalidPropertiesFormatException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import sun.util.calendar.CalendarDate;

/**
 *
 * @author Mehrdad
 */
//public class TestInsertSentiment extends KBUnitM {
public class EventKBOp {

    private DocumentSentiment documentSentiment;
    private Map<Item, KBPredicateArgument> kbArgumentsMap;

    private final float initialSentimentConfidence = 0.9f;
    private final float sentimentMentionConfidence = 0.8f;
    private final float updatedSentimentConfidence = 0.7f;

    private KBEntity kbEntity1;
    private KBEntity kbEntity2;

    protected final String defaultEntityType = "org";
    protected final String defaultEntityMentionType = "NAME";
    protected final float defaultEntityConfidence = 0.8f;
    protected final float defaultEntityMentionConfidence = 0.9f;
    protected final float defaultEntityCanonicalMentionConfidence = 0.63f;
    protected final List<Pair<String, Double>> defaultEntityTypesWithConfidences;

    protected final String defaultRelationType = "per:cities_of_residence";
//    protected final String defaultRelationType = "Sentiment";

    protected final float defaultRelationConfidence = 0.9f;
    protected final float defaultRelationMentionConfidence = 0.9f;

    private final Random rand = new Random();
    private String schemaName;
    private QuickJDBC quickJDBC;
    private Connection sqlConnection;
    private RemoteSPARQLService sparqlService;

    protected KBParameters unitTestKBParameters;
//    protected TokenStream testTokenStream;
//    protected TokenOffset testTokenOffset;
    protected KB kb;

    KBNumber kbStrength = null;

    private static final String packagePath = new Object() {
    }.getClass().getPackage().getName().replace(".", "/");
    private static String workingPath = System.getProperty("user.dir");
    String inputPath = workingPath + "/src/test/resources/us/ihmc/cubism/sociolinguistics/input.benchmark/";
    private static final String kbUnitTestingParamsFile = workingPath + "/src/test/resources/us/albany/cubism/unittests/KBParameters.xml";//packagePath + "/KBUnitTestParameters.xml";
    private static final String sqlSchemaFile = workingPath + "/src/test/resources/us/albany/cubism/utilities/DEFT_KB_create_schema.txt";
//    private static final String kbUnitTestingParamsFile = packagePath + "/KBUnitTestParameters.xml";
//    private static final String sqlSchemaFile = "/adept/utilities/DEFT KB create schema.txt";

    public EventKBOp() {
        defaultEntityTypesWithConfidences = new ArrayList<Pair<String, Double>>();
        defaultEntityTypesWithConfidences.add(new Pair<String, Double>("per", 0.22));
        defaultEntityTypesWithConfidences.add(new Pair<String, Double>("loc", 0.33));
    }

    public void insert(float sentimentConfidence, float sentimentMentionConfidence) {
        try {
            buildSentiment(sentimentConfidence, sentimentMentionConfidence);
            this.closeKB();
        } catch (KBUpdateException ex) {
            Logger.getLogger(EventKBOp.class.getName()).log(Level.SEVERE, null, ex);
        } catch (KBQueryException ex) {
            Logger.getLogger(EventKBOp.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(EventKBOp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void insertSentiment(String target, String date, String str, String source, String chunk, int c) throws KBQueryException, KBUpdateException,
            InvalidPropertiesFormatException, IOException {

        // create sentiment
        buildSentiment(initialSentimentConfidence, sentimentMentionConfidence);

        KBSentiment.InsertionBuilder sentimentInsertionBuilder = KBSentiment
                .sentimentInsertionBuilder(documentSentiment, kbArgumentsMap,
                        KBOntologyMap.getTACOntologyMap());
        sentimentInsertionBuilder.addExternalKBId(new KBID("External_Sentiment", "ExampleKB"));
        KBSentiment kbSentiment = sentimentInsertionBuilder.insert(kb);
        assertEqualsAndHashCodeByQueryByKBID(kbSentiment);

        testQuerySentimentById(kbSentiment.getKBID(), 1, initialSentimentConfidence,
                documentSentiment.getArguments().size(), sentimentMentionConfidence);
        testQuerySentimentByArg(kbEntity1.getKBID());
//        testQuerySentimentByStringRef("BBN Technologies");
        KBRelationArgument argument = kbSentiment.getArguments().iterator().next();
        KBRelationArgument.UpdateBuilder argumentUpdateBuilder = argument.updateBuilder();
        argumentUpdateBuilder.setConfidence(0.2f);

        KBSentiment.UpdateBuilder updateBuilder = kbSentiment.updateBuilder();
        updateBuilder.addUpdatedArgument(argumentUpdateBuilder);
        updateBuilder.setConfidence(updatedSentimentConfidence);

        KBSentiment updatedSentiment = updateBuilder.update(kb);

        testQuerySentimentById(updatedSentiment.getKBID(), 1, updatedSentimentConfidence,
                documentSentiment.getArguments().size(), sentimentMentionConfidence);
        testQuerySentimentByArg(kbEntity1.getKBID());
//        testQuerySentimentByStringRef("BBN Technologies");

//        tearDown();
    }

    private String genStrength(String str) {
        double str_double = new Double(str).doubleValue();
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

    private void buildSentiment(float sentimentConfidence, float sentimentMentionConfidence)
            throws KBUpdateException, KBQueryException, InvalidPropertiesFormatException,
            IOException {
        // create and insert entity into KB

        List<SentimentMention> SentimentMentionList = new ArrayList<SentimentMention>();
        List<Entity> SourceEntityList = new ArrayList<Entity>();
        List<Entity> TargetEntityList = new ArrayList<Entity>();
        Pair<List<Entity>, List<Entity>> SourceTargetEntity = null;

        List<String> dateList = new ArrayList<String>();

        Pair<List<SentimentMention>, Pair<List<Entity>, List<Entity>>> SentimentMentionListWithEntity = null;

        File infile = new File(workingPath + "/src/test/resources/us/albany/cubism/sentiment_mentions_withdate.txt");
//        File infile = new File("/Users/ting/NetBeansProjects/deft2015/adept/adept-kb/src/test/resources/adept/kbapi/sentiments_sorted.txt");

        BufferedReader br = new BufferedReader(new FileReader(infile));

        String line = "";

        String target = "";
        String date = "";
        String str = "";
        String source = "";
        String chunk = "";
        String target_type = "";

        int c = 1;

        init();
        Document document = null;
//        System.out.println("kb information about blackwater: " + kb.getEntitiesByStringReference("New York", this.schemaName).size());
        while ((line = br.readLine()) != null) {

            String[] token = line.split("\t");

            target = token[1];
            target_type = token[2];
            date = token[6].substring(0, 10);
            str = this.genStrength(token[4]);
            source = token[0];
            chunk = token[5];

            Pair<Entity, List<EntityMention>> entityWithMentionsSource = createEntityWithMentions(source, c,
                    "per", defaultEntityConfidence, defaultEntityMentionType, defaultEntityMentionConfidence, defaultEntityCanonicalMentionConfidence, defaultEntityTypesWithConfidences);
            KBEntity.InsertionBuilder entityInsertionBuilder = KBEntity.entityInsertionBuilder(entityWithMentionsSource.getL(), entityWithMentionsSource.getR(), KBOntologyMap.getTACOntologyMap());
            kbEntity1 = entityInsertionBuilder.insert(kb);
            assertEqualsAndHashCodeByQueryByKBID(kbEntity1);

            Pair<Entity, List<EntityMention>> entityWithMentionsTarget = createEntityWithMentions(target, c,
                    target_type, defaultEntityConfidence, defaultEntityMentionType, defaultEntityMentionConfidence, defaultEntityCanonicalMentionConfidence, defaultEntityTypesWithConfidences);
            KBEntity.InsertionBuilder entityInsertionBuilder2 = KBEntity.entityInsertionBuilder(entityWithMentionsTarget.getL(), entityWithMentionsTarget.getR(), KBOntologyMap.getTACOntologyMap());
            kbEntity2 = entityInsertionBuilder2.insert(kb);
            assertEqualsAndHashCodeByQueryByKBID(kbEntity2);
            System.out.println("kb information about blackwater: " + kb.getEntitiesByStringReference("New York").size());

            SourceEntityList.add(entityWithMentionsSource.getL());
            TargetEntityList.add(entityWithMentionsTarget.getL());

            // create and insert strength value into KB
            HltContentContainer hltContentContainer = new HltContentContainer();
            String sample_path = workingPath + "/src/test/resources/us/albany/cubism/sample.txt";
            BufferedWriter bw;
            bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(sample_path), "utf-8"));
            bw.write(str);
            bw.close();
            document = DocumentMaker
                    .getInstance()
                    .createDefaultDocument(
                            "sample.txt",
                            null,
                            "Text",
                            "sample.txt",
                            "English",
                            //"/home/aparna/ihmc/deft/adept/adept-kb/src/test/resources/adept/kbapi/files/str" + c + ".txt",

                            sample_path,
                            hltContentContainer
                    );
            CharOffset numberCharOffset = new CharOffset(0, str.length());
            String numberText = str;
            Token numberToken = new Token(1, numberCharOffset, numberText);
            TokenOffset numberTokenOffset = new TokenOffset(0, 0);
            TokenStream testNumericTokenStream = new TokenStream(TokenizerType.WHITESPACE,
                    TranscriptType.SOURCE, "English", ChannelName.NONE, ContentType.TEXT, document);
            testNumericTokenStream.add(numberToken);
            NumberPhrase numberPhrase = new NumberPhrase(numberTokenOffset, testNumericTokenStream);
            NumericValue strengthNumericValue = new NumericValue(new Integer(2));
            numberPhrase.setNumber(strengthNumericValue.asNumber());

            KBNumber.InsertionBuilder numberInsertionBuilder = KBNumber.numberInsertionBuilder(
                    strengthNumericValue, Collections.singletonList(numberPhrase));
            KBNumber kbStrength = numberInsertionBuilder.insert(kb);
            assertEqualsAndHashCodeByQueryByKBID(kbStrength);

            // create and insert relation into KB
            //Pair<DocumentRelation, HashMap<Item, KBPredicateArgument>> relationWithEntityMap = createTestRelationWithEntityMap(target, source, c,
            //        kbEntity1, kbEntity2, defaultRelationType, defaultRelationConfidence,
            //        defaultRelationMentionConfidence);
            //Pair<DocumentRelation, HashMap<Item, KBPredicateArgument>> relationWithEntityMap = createRelationWithEntityMap(entityWithMentionsSource, entityWithMentionsTarget,
            //        chunk, kbEntity1, kbEntity2, defaultRelationType, defaultRelationConfidence,
            //        defaultRelationMentionConfidence);
            //RelationMention relationMention = relationWithEntityMap.getL().getProvenances().iterator()
            //        .next();
            //RelationMention.Filler relationMentionArg = relationMention.getArguments().iterator()
            //        .next();
            //KBRelation.InsertionBuilder relationInsertionBuilder = KBRelation.relationInsertionBuilder(
            //        relationWithEntityMap.getL(), relationWithEntityMap.getR(),
            //        KBOntologyMap.getTACOntologyMap());
            //KBRelation kbRelation = relationInsertionBuilder.insert(kb);
            //assertEqualsAndHashCodeByQueryByKBID(kbRelation);
            //KBRelationArgument kbRelationArg = kbRelation.getArguments().iterator().next();
            // added by me
            HltContentContainer hltContentContainer1 = new HltContentContainer();

//            String sample_path = workingPath + "/src/test/resources/us/albany/cubism/sample.txt";
//            BufferedWriter bw;
            bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(sample_path), "utf-8"));
            bw.write(chunk);
            bw.close();
            Document document1 = DocumentMaker.getInstance().createDefaultDocument("sample.txt",
                    null, "Text", "sample.txt", "English",
                    sample_path,
                    //                Reader.getAbsolutePathFromClasspathOrFileSystem("adept/kbapi/files/chunk" + c + ".txt"),
                    hltContentContainer1);
            CharOffset testCharOff1 = new CharOffset(0, chunk.length());
            String testText1 = chunk;
            Token testToken1 = new Token(0, testCharOff1, testText1);
            TokenStream TokenStream1 = new TokenStream(TokenizerType.WHITESPACE, TranscriptType.SOURCE,
                    "English", ChannelName.NONE, ContentType.TEXT, document1);
            TokenOffset TokenOffset1 = new TokenOffset(0, 0);
            TokenStream1.add(testToken1);
            //

            SentimentMention.Builder sentimentMentionBuilder = SentimentMention.builder();
            sentimentMentionBuilder.setConfidence(sentimentMentionConfidence);
            sentimentMentionBuilder.addJustification(new Chunk(TokenOffset1, TokenStream1));
            sentimentMentionBuilder.addArgument(SentimentMention.Filler.createSourceArgument(
                    entityWithMentionsSource.getR().get(0), 0.8f));
            sentimentMentionBuilder.addArgument(SentimentMention.Filler.createStrengthArgument(
                    numberPhrase, 0.7f));
            //sentimentMentionBuilder.addArgument(SentimentMention.Filler.createTargetArgument(
            //        relationMention, 0.86f));
            sentimentMentionBuilder.addArgument(SentimentMention.Filler.createTargetArgument(
                    entityWithMentionsTarget.getR().get(0), 0.86f));

            //sentimentMentionBuilder.addArgument(SentimentMention.Filler.createTargetArgument(
            //        relationMention, relationMentionArg, 0.72f));
            //Add to List of Sentiment Mentions
            SentimentMentionList.add(sentimentMentionBuilder.build());

            /* 
             HltContentContainer dateHltContentContainer = new HltContentContainer();
             Document dateDocument = DocumentMaker.getInstance().createDefaultDocument(
             "sample_date.txt", null, "Text", "sample_date_1.txt", "English",
             Reader.getAbsolutePathFromClasspathOrFileSystem("adept/kbapi/sample_date.txt"),
             dateHltContentContainer,
             date);

             CharOffset testCharOff = new CharOffset(0, 9);
             String testText = date;
             Token testToken = new Token(0, testCharOff, testText);

             TokenStream testTemporalSpanTokenStream = new TokenStream(TokenizerType.WHITESPACE,
             TranscriptType.SOURCE, "English", ChannelName.NONE, ContentType.TEXT, dateDocument);

             TokenOffset testTemporalSpanTokenOffset = new TokenOffset(0, 0);

            
             testTemporalSpanTokenStream.add(testToken);

             SourceAlgorithm testSourceAlgorithm = new SourceAlgorithm("UnitTestAlgorithm", "BBN");

             XSDDate date1 = XSDDate.fromString("2015-09-01");

             TimePhrase timePhrase1 = new TimePhrase(testTemporalSpanTokenOffset,
             testTemporalSpanTokenStream, null);

             TemporalResolution temporalResolution1 = TemporalResolution.builder()
             .setResolvedTemporalValue(date1).setConfidence(0.5f).setTimePhrase(timePhrase1)
             .setSourceAlgorithm(testSourceAlgorithm).build();
             Set<TemporalResolution> temporalResolutions1 = new HashSet<TemporalResolution>();
             temporalResolutions1.add(temporalResolution1);

             KBDate.InsertionBuilder dateInsertionBuilder1 = KBDate.xsdDateInsertionBuilder(date1,
             temporalResolutions1);
             KBDate kbDate1 = dateInsertionBuilder1.insert(kb);
             System.out.println("************date: "+dateInsertionBuilder1.getTimexDate());
             assertEqualsAndHashCodeByQueryByKBID(kbDate1);
             assertTrue("Date KBID returned from insertXSDDate() is null", kbDate1.getKBID() != null);
             System.out.println("Inserted xsd date: " + kbDate1.getKBID().getObjectID());

             //dateList.add(dateTokenStream);
             */
            dateList.add(date);
        }

        SourceTargetEntity = new Pair<List<Entity>, List<Entity>>(SourceEntityList, TargetEntityList);
        SentimentMentionListWithEntity = new Pair<List<SentimentMention>, Pair<List<Entity>, List<Entity>>>(SentimentMentionList, SourceTargetEntity);

        //Pair< ArrayList<ArrayList<Pair<XSDDate, KBDate>>>, Pair< ArrayList<ArrayList<SentimentMention>>, ArrayList<String>>> P = aggregate(
        //        SentimentMentionList, dateList);
        //Pair<List<SentimentMention>, Pair<List<Entity>, List<Entity>>> SentimentMentionListWithEntity
//        Pair<List<SentimentMention>, ArrayList<String>>> P = aggregate(
//                SentimentMentionListWithEntity);
        Pair< Pair< ArrayList<ArrayList<SentimentMention>>, ArrayList<String>>, Pair<ArrayList< Entity>, ArrayList<Entity>>> P = aggregate(SentimentMentionListWithEntity);
        System.out.println("------Aggregation Done------");

        ArrayList<ArrayList<Pair<XSDDate, KBDate>>> DateKB = aggregateTime(SentimentMentionListWithEntity, dateList);

        Pair<ArrayList<ArrayList<SentimentMention>>, ArrayList<String>> SentMenStr = P.getL();
        ArrayList<ArrayList<SentimentMention>> SenMen = SentMenStr.getL();
        ArrayList<String> Str = SentMenStr.getR();

        ArrayList<Entity> SourceEntity = P.getR().getL();
        ArrayList<Entity> TargetEntity = P.getR().getR();

        List<SentimentMention> provenances = new ArrayList<SentimentMention>();

        String strength = "";

        ArrayList<DocumentSentiment> documentSentimentList = new ArrayList<DocumentSentiment>();
        System.out.println("senMen size: " + SenMen.size());
        for (ArrayList<SentimentMention> sameSentimentList : SenMen) {
            provenances = sameSentimentList;

            int index = SenMen.indexOf(sameSentimentList);
            strength = Str.get(index);

            ArrayList strengthPair = this.insertStrength(strength, document);

            HashMap<TemporalValue, KBDate> datesMap = new HashMap<TemporalValue, KBDate>();

            for (int i = 0; i < DateKB.get(index).size(); i++) {
                datesMap.put(DateKB.get(index).get(i).getL(), DateKB.get(index).get(i).getR());
            }

            XSDDate date1 = DateKB.get(index).get(0).getL();
            XSDDate date2 = DateKB.get(index).get(DateKB.get(index).size() - 1).getL();

            TemporalSpan temporalSpan = TemporalSpan.builder().setBeginDate(date1).setEndDate(date2)
                    .build();

            KBTemporalSpan.InsertionBuilder temporalSpanInsertionBuilder = KBTemporalSpan
                    .temporalSpanInsertionBuilder(temporalSpan, 1f, datesMap,
                            Optional.of(new Float(1)), Optional.of(new Float(1)));
            KBTemporalSpan kbSpan = temporalSpanInsertionBuilder.insert(kb);
            System.out.println("======================================");
            System.out.println("date1: " + date1.asString() + " date2: " + date2.asString());
            ImmutableSet<KBRelationArgument> args = kbSpan.getArguments();
            for (KBRelationArgument arg : args) {
                System.out.println("arg role: " + arg.getRole().getType());
            }
//            assertEqualsAndHashCodeByQueryByKBID(kbSpan);

            // create document sentiment
            DocumentSentiment.Builder documentSentimentBuilder = DocumentSentiment.builder();
            documentSentimentBuilder.addProvenances(provenances);
            documentSentimentBuilder.setConfidence(sentimentConfidence);

//
            Iterator it = sameSentimentList.get(0).getArguments().iterator();

            while (it.hasNext()) {
                SentimentMention.Filler arg = (SentimentMention.Filler) it.next();
                String type = arg.getArgumentType();

                //System.out.println("type is:" + type + "-- entity mention: " + arg.asEntityMention() + "-- rel arg: " + arg.asRelationArgument() + "-- rel men: " + arg.asRelationMention() + "-- str: " + arg.asStrength());
                if (type.equals("source")) {
                    Optional<EntityMention> EM = arg.asEntityMention();
                }

                if (type.equals("target")) {
                    String trgt = arg.asEntityMention().get().getValue();
                }

                if (type.equals("strength")) {
                    int strt = Integer.valueOf(arg.asStrength().get().getValue());
                }
            }

//
            DocumentMentalStateArgument.Builder sourceArgBuilder = DocumentMentalStateArgument.builder(
                    new Type("source"),
                    DocumentMentalStateArgument.Filler.createSourceArgument(SourceEntity.get(index)),
                    0.51f);
            sourceArgBuilder.addProvenance(provenances.get(0).getArguments().asList().get(0));

            documentSentimentBuilder.addArgument(sourceArgBuilder.build());
            documentSentimentBuilder.addArgument(DocumentMentalStateArgument.builder(
                    new Type("strength"),
                    DocumentMentalStateArgument.Filler.createStrengthArgument((NumericValue) strengthPair.get(0)),
                    0.64f).build());
            documentSentimentBuilder.addArgument(DocumentMentalStateArgument.builder(
                    new Type("target"),
                    DocumentMentalStateArgument.Filler.createTargetArgument(TargetEntity.get(index)), 0.86f).build());
            //documentSentimentBuilder.addArgument(DocumentMentalStateArgument.builder(
            //        new Type("target"),
            //        DocumentMentalStateArgument.Filler.createTargetArgument(
            //                relationWithEntityMap.getL(), relationWithEntityMap.getL().getArguments()
            //                .iterator().next()), 0.72f).build());
            documentSentimentBuilder.addArgument(DocumentMentalStateArgument.builder(
                    new Type("validTemporalSpan"),
                    DocumentMentalStateArgument.Filler.createValidTemporalSpanArgument(temporalSpan),
                    0.44f).build());

            // map to Adept KB entities
            System.out.println("strengthPair.get(0): " + strengthPair.get(0));
            kbArgumentsMap = new HashMap<Item, KBPredicateArgument>();
            //kbArgumentsMap.put(entityWithMentions.getL(), kbEntity1);
            kbArgumentsMap.put(SourceEntity.get(index), kbEntity1);
            kbArgumentsMap.put(TargetEntity.get(index), kbEntity2);
//            kbArgumentsMap.put((NumericValue) strengthPair.get(0), (KBNumber) strengthPair.get(1));
            kbArgumentsMap.put((Item) strengthPair.get(0), (KBNumber) strengthPair.get(1));
            //kbArgumentsMap.put(relationWithEntityMap.getL().getArguments().iterator().next()
            //        .getFiller().asItem().get(), kbRelationArg);
            kbArgumentsMap.put(temporalSpan, kbSpan);

            documentSentiment = documentSentimentBuilder.build();
            System.out.println("kbArgumentsMap: " + kbArgumentsMap);
            System.out.println("kbArgumentsMap.get((Item) strengthPair.get(0): " + kbArgumentsMap.get((Item) strengthPair.get(0)));
            KBSentiment.InsertionBuilder sentimentInsertionBuilder = KBSentiment
                    .sentimentInsertionBuilder(documentSentiment, kbArgumentsMap,
                            KBOntologyMap.getTACOntologyMap());
            sentimentInsertionBuilder.addExternalKBId(new KBID("External_Sentiment", "ExampleKB"));
            KBSentiment kbSentiment = sentimentInsertionBuilder.insert(kb);
//            assertEqualsAndHashCodeByQueryByKBID(kbSentiment);

            //documentSentimentList.add(documentSentiment);
        }

        //for (int i = 0; i < list.size(); i++) {
        //    System.out.println(list.get(i).get(0));
        //    System.out.println(list.get(i).get(1));
        //    System.out.println(list.get(i).get(2));
        //}
        //for (SentimentMention s : SentimentMentionList) {
        //for (int i = 0; i < SentimentMentionList.size(); i++) {
        //Iterator it = SentimentMentionList.get(i).getArguments().iterator();
        //while (it.hasNext()) {
        //SentimentMention.Filler arg = (SentimentMention.Filler) it.next();
        //String type = arg.getArgumentType();
        //System.out.println("type is:" + type + "-- entity mention: " + arg.asEntityMention() + "-- rel arg: " + arg.asRelationArgument() + "-- rel men: " + arg.asRelationMention() + "-- str: " + arg.asStrength());
        //EntityMention insert = arg.asEntityMention();
        //String src = arg.asEntityMention().get().getValue();
        //String trgt = arg.asEntityMention().get().getValue();
        //String strh = arg.asStrength().get().getValue();
        //if (type.equals("source")) {
        //    String en = arg.asEntityMention().get().getValue();
        //    System.out.println("source value: " + en);
        //} else if (type.equals("target")) {
        //    String en = arg.asEntityMention().get().getValue();
        //    System.out.println("target value: " + en);
        //} else if (type.equals("strength")) {
        //    String en = arg.asStrength().get().getValue();
        //    System.out.println("str value: " + en);
        //}
        //}
        //}
        br.close();
    }

    public ArrayList insertStrength(String str, Document document) {
        NumericValue strengthNumericValue = null;
        try {
            CharOffset numberCharOffset = new CharOffset(0, str.length());
            String numberText = str;
            Token numberToken = new Token(1, numberCharOffset, numberText);
            TokenOffset numberTokenOffset = new TokenOffset(0, 0);
            TokenStream testNumericTokenStream = new TokenStream(TokenizerType.WHITESPACE,
                    TranscriptType.SOURCE, "English", ChannelName.NONE, ContentType.TEXT, document);
            testNumericTokenStream.add(numberToken);
            NumberPhrase numberPhrase = new NumberPhrase(numberTokenOffset, testNumericTokenStream);
            strengthNumericValue = new NumericValue(new Integer(str));
            numberPhrase.setNumber(strengthNumericValue.asNumber());

            KBNumber.InsertionBuilder numberInsertionBuilder = KBNumber.numberInsertionBuilder(
                    strengthNumericValue, Collections.singletonList(numberPhrase));
            kbStrength = numberInsertionBuilder.insert(kb);
            assertEqualsAndHashCodeByQueryByKBID(kbStrength);
        } catch (KBUpdateException ex) {
            Logger.getLogger(EventKBOp.class.getName()).log(Level.SEVERE, null, ex);
        } catch (KBQueryException ex) {
            Logger.getLogger(EventKBOp.class.getName()).log(Level.SEVERE, null, ex);
        }
        ArrayList strengthPair = new ArrayList();
        strengthPair.add(strengthNumericValue);
        strengthPair.add(kbStrength);
//        return new Pair(strengthNumericValue, kbStrength);
        return strengthPair;
    }

    public void assertEqualsAndHashCodeByQueryByKBID(KBPredicateArgument kbpa)
            throws KBQueryException {
        assertNotNull("Given KB object is null.", kbpa);
        Class<?> kbpaClass = kbpa.getClass();
        KBPredicateArgument queriedKbpa;
        if (kbpaClass == KBDate.class) {
            queriedKbpa = kb.getKBDateByDateId(kbpa.getKBID());
        } else if (kbpaClass == KBEntity.class) {
            queriedKbpa = kb.getEntityById(kbpa.getKBID());
        } else if (kbpaClass == KBGenericThing.class) {
            queriedKbpa = kb.getGenericThingByID(kbpa.getKBID());
        } else if (kbpaClass == KBNumber.class) {
            queriedKbpa = kb.getNumberValueByID(kbpa.getKBID());
        } else if (kbpaClass == KBRelation.class) {
            queriedKbpa = kb.getRelationById(kbpa.getKBID());
        } else if (kbpaClass == KBTemporalSpan.class) {
            queriedKbpa = kb.getTemporalSpanByID(kbpa.getKBID());
        } else if (kbpaClass == KBBelief.class) {
            queriedKbpa = kb.getBeliefById(kbpa.getKBID());
        } else if (kbpaClass == KBEvent.class) {
            queriedKbpa = kb.getEventById(kbpa.getKBID());
        } else if (kbpaClass == KBSentiment.class) {
            queriedKbpa = kb.getSentimentById(kbpa.getKBID());
        } else {
            throw new IllegalArgumentException("Unrecognized KBPredicateArgument subclass "
                    + kbpaClass.getSimpleName() + ".");
        }
        System.out.println("queiredKbpa: " + queriedKbpa.getKBID().getObjectID() + " --kbpa getID:" + kbpa.getKBID().getObjectID());
        assertEquals(String.format("Queried %s is not equal to inserted %s",
                kbpaClass.getSimpleName(), kbpaClass.getSimpleName()), (KBPredicateArgument) kbpa, (KBPredicateArgument) queriedKbpa);
        assertEquals(String.format(
                "Queried %s's hashCode() is not equal to inserted %s's hashCode()",
                kbpaClass.getSimpleName(), kbpaClass.getSimpleName()), kbpa.hashCode(),
                queriedKbpa.hashCode());
    }

    public Pair<Entity, List<EntityMention>> createEntityWithMentions(String text, int c, String entityType,
            float entityConfidence, String entityMentionType, float entityMentionConfidence,
            float entityCanonicalMentionConfidence,
            List<Pair<String, Double>> entityTypesWithConfidences) {
        try {
            // create entity
            Entity entity = new Entity(1, new Type(entityType));

            // added by me
            HltContentContainer hltContentContainer = new HltContentContainer();
            String sample_path = workingPath + "/src/test/resources/us/albany/cubism/sample" + c + ".txt";
            BufferedWriter bw;
            bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(sample_path), "utf-8"));
            bw.write(text);
            bw.close();
            Document entityDocument = DocumentMaker.getInstance().createDefaultDocument("sample" + c + ".txt",
                    null, "Text", "sample" + c + ".txt", "English",
                    //"/home/aparna/ihmc/deft/adept/adept-kb/src/test/resources/adept/kbapi/sample.txt",
                    sample_path,
                    hltContentContainer);
            int start = 0;
            int end = text.length();
            CharOffset testCharOff = new CharOffset(start, end);
            String testText = text;
            Token testToken = new Token(0, testCharOff, testText);
            TokenStream TokenStream1 = new TokenStream(TokenizerType.WHITESPACE, TranscriptType.SOURCE,
                    "English", ChannelName.NONE, ContentType.TEXT, entityDocument);
            TokenOffset TokenOffset1 = new TokenOffset(0, 0);
            TokenStream1.add(testToken);
            //

            // create mention
            List<EntityMention> mentions = new ArrayList<EntityMention>();
            EntityMention mention = new EntityMention(0, TokenOffset1, TokenStream1);
            mention.addEntityConfidencePair(entity.getEntityId(), entityMentionConfidence);
            mention.setMentionType(new Type(entityMentionType));
            mention.setSourceAlgorithm(new SourceAlgorithm("Sentiment", "CUBISM"));
            mention.setEntityType(new Type(entityType));
            mentions.add(mention);

            // create a second mention
//            EntityMention otherMention = new EntityMention(0, testTokenOffset, testTokenStream);
//            otherMention.addEntityConfidencePair(entity.getEntityId(), 0.3f);
//            otherMention.setMentionType(new Type(entityMentionType));
//            otherMention.setSourceAlgorithm(new SourceAlgorithm("Example2", "CUBISM"));
//            otherMention.setEntityType(new Type(entityType));
//            mentions.add(otherMention);
            // set canonical mention
            entity.setCanonicalMentions(mention);
            entity.setEntityConfidence(entityConfidence);
            entity.setCanonicalMentionConfidence(entityCanonicalMentionConfidence);

            for (Pair<String, Double> entityTypeWithConfidence : entityTypesWithConfidences) {
                entity.addType(new Type(entityTypeWithConfidence.getL()),
                        entityTypeWithConfidence.getR());
            }

            return new Pair<Entity, List<EntityMention>>(entity, mentions);
        } catch (Exception ex) {
            ex.printStackTrace();
            Assert.fail("Unable to create entity object. " + ex.getMessage());
        }

        return null;
    }

    protected Pair<Entity, List<EntityMention>> createTargetEntityWithMentions(int start, int end, String text, int c, String entityType,
            float entityConfidence, String entityMentionType, float entityMentionConfidence,
            float entityCanonicalMentionConfidence,
            List<Pair<String, Double>> entityTypesWithConfidences) {
        try {
            // create entity
            Entity entity = new Entity(1, new Type(entityType));

            // added by me
            HltContentContainer hltContentContainer = new HltContentContainer();

            String sample_path = workingPath + "/src/test/resources/us/albany/cubism/target" + c + ".txt";
            BufferedWriter bw;
            bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(sample_path), "utf-8"));
            bw.write(text);
            bw.close();
//            System.out.println("reader:" + Reader.getAbsolutePathFromClasspathOrFileSystem("adept/kbapi/sample.txt"));
            Document document = DocumentMaker.getInstance().createDefaultDocument("target" + c + ".txt",
                    null, "Text", "target" + c + ".txt", "English",
                    //"/home/aparna/ihmc/deft/adept/adept-kb/src/test/resources/adept/kbapi/sample.txt",
                    sample_path,
                    hltContentContainer);

            CharOffset testCharOff = new CharOffset(start, end);
            String testText = text;
            Token testToken = new Token(0, testCharOff, testText);
            TokenStream TokenStream1 = new TokenStream(TokenizerType.WHITESPACE, TranscriptType.SOURCE,
                    "English", ChannelName.NONE, ContentType.TEXT, document);
            TokenOffset TokenOffset1 = new TokenOffset(0, 0);
            TokenStream1.add(testToken);
            //

            // create mention
            List<EntityMention> mentions = new ArrayList<EntityMention>();
            EntityMention mention = new EntityMention(0, TokenOffset1, TokenStream1);
            mention.addEntityConfidencePair(entity.getEntityId(), entityMentionConfidence);
            mention.setMentionType(new Type(entityMentionType));
            mention.setSourceAlgorithm(new SourceAlgorithm("Sentiment", "CUBISM"));
            mention.setEntityType(new Type(entityType));
            mentions.add(mention);

            // set canonical mention
            entity.setCanonicalMentions(mention);
            entity.setEntityConfidence(entityConfidence);
            entity.setCanonicalMentionConfidence(entityCanonicalMentionConfidence);

            for (Pair<String, Double> entityTypeWithConfidence : entityTypesWithConfidences) {
                entity.addType(new Type(entityTypeWithConfidence.getL()),
                        entityTypeWithConfidence.getR());
            }

            return new Pair<Entity, List<EntityMention>>(entity, mentions);
        } catch (Exception ex) {
            ex.printStackTrace();
            Assert.fail("Unable to create entity object. " + ex.getMessage());
        }

        return null;
    }

    protected Pair<Entity, List<EntityMention>> createSourceEntityWithMentions(int start, int end, String text, int c, String entityType,
            float entityConfidence, String entityMentionType, float entityMentionConfidence,
            float entityCanonicalMentionConfidence,
            List<Pair<String, Double>> entityTypesWithConfidences) {
        try {
            // create entity
            Entity entity = new Entity(2, new Type(entityType));

            HltContentContainer hltContentContainer = new HltContentContainer();
            String sample_path = workingPath + "/src/test/resources/us/albany/cubism/source" + c + ".txt";
            BufferedWriter bw;
            bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(sample_path), "utf-8"));
            bw.write(text);
            bw.close();
            Document document = DocumentMaker.getInstance().createDefaultDocument("source" + c + ".txt",
                    null, "Text", "source" + c + ".txt", "English",
                    sample_path,
                    hltContentContainer);
            CharOffset testCharOff = new CharOffset(start, end);
            String testText = text;
            Token testToken = new Token(0, testCharOff, testText);
            TokenStream TokenStream1 = new TokenStream(TokenizerType.WHITESPACE, TranscriptType.SOURCE,
                    "English", ChannelName.NONE, ContentType.TEXT, document);
            TokenOffset TokenOffset1 = new TokenOffset(0, 0);
            TokenStream1.add(testToken);
            //

            // create mention
            List<EntityMention> mentions = new ArrayList<EntityMention>();
            EntityMention mention = new EntityMention(0, TokenOffset1, TokenStream1);
            mention.addEntityConfidencePair(entity.getEntityId(), entityMentionConfidence);
            mention.setMentionType(new Type(entityMentionType));
            mention.setSourceAlgorithm(new SourceAlgorithm("Sentiment", "CUBISM"));
            mention.setEntityType(new Type(entityType));
            mentions.add(mention);

            // set canonical mention
            entity.setCanonicalMentions(mention);
            entity.setEntityConfidence(entityConfidence);
            entity.setCanonicalMentionConfidence(entityCanonicalMentionConfidence);

            for (Pair<String, Double> entityTypeWithConfidence : entityTypesWithConfidences) {
                entity.addType(new Type(entityTypeWithConfidence.getL()),
                        entityTypeWithConfidence.getR());
            }

            return new Pair<Entity, List<EntityMention>>(entity, mentions);
        } catch (Exception ex) {
            ex.printStackTrace();
            Assert.fail("Unable to create entity object. " + ex.getMessage());
        }

        return null;
    }

    public void init() {
        try {
            schemaName = "cubism_sentiment";

//            Model model = ModelFactory.createRDFSModel(ModelFactory.createDefaultModel());
//            model.read(getClass().getResourceAsStream("/adept/ontology/adept-base.ttl"), "", "TTL");
//            model.read(getClass().getResourceAsStream("/adept/ontology/adept-core.ttl"), "", "TTL");
//  commented out by TL 02/25/16
            
            unitTestKBParameters = new KBParameters(kbUnitTestingParamsFile);
            sparqlService = new RemoteSPARQLService(unitTestKBParameters); //changed from LocalSPARQLService to Remote... suggested by David (BBN)
            quickJDBC = new QuickJDBC(unitTestKBParameters);
            sqlConnection = quickJDBC.getConnection();
            sqlConnection.setAutoCommit(true);
            createUnitTestSqlSchema(schemaName);
            sqlConnection.setAutoCommit(false);

            // Build schema
            /*
             String schema = new String(Files.readAllBytes(Paths.get(sqlSchemaFile)));
             PreparedStatement createSchema = sqlConnection.prepareStatement(schema);
             createSchema.executeUpdate();
             createSchema.close();
             sqlConnection.commit();
             */
//            kb = new KB(unitTestKBParameters);

            kb = new KB(unitTestKBParameters, schemaName, sparqlService); //old setup

        } catch (Exception ex) {
            ex.printStackTrace();
            Assert.fail("Unable to initialize data stores for unit tests. " + ex.getMessage());
        }
    }

    protected void closeKB() {
        try {
//            dropUnitTestSqlSchema(schemaName);
            kb.close();
//            sqlConnection.commit();
            sqlConnection.close();
            quickJDBC.close();
        } catch (Exception ex) {
            ex.printStackTrace();
            Assert.fail("Unable to deconstruct data stores for unit tests. " + ex.getMessage());
        }
    }

    private void createUnitTestSqlSchema(String schemaName) {
        try {
//            PreparedStatement createSchemaPreparedStmt = sqlConnection
//                    .prepareStatement("DO $$ BEGIN IF NOT EXISTS (SELECT schema_name FROM information_schema.schemata WHERE schema_name = '" + schemaName+ "') THEN EXECUTE 'CREATE SCHEMA " + schemaName + "'; END IF; END $$;");
//            PreparedStatement createSchemaPreparedStmt = sqlConnection
//                    .prepareStatement("SELECT schema_name FROM information_schema.schemata WHERE schema_name = '" + schemaName+ "'");
//            createSchemaPreparedStmt.executeUpdate();
//            createSchemaPreparedStmt.close();

            PreparedStatement setSearchPathPreparedStmt = sqlConnection
                    .prepareStatement("SET search_path TO " + schemaName);
            setSearchPathPreparedStmt.executeUpdate();
            setSearchPathPreparedStmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
            Assert.fail("Unable to create unit test sql schema. " + ex.getMessage());
        }
    }

    private void openUnitTestSqlSchema(String schemaName) {
        try {
            PreparedStatement createSchemaPreparedStmt = sqlConnection
                    .prepareStatement("OPEN SCHEMA " + schemaName);
            createSchemaPreparedStmt.executeUpdate();
            createSchemaPreparedStmt.close();

            PreparedStatement setSearchPathPreparedStmt = sqlConnection
                    .prepareStatement("SET search_path TO " + schemaName);
            setSearchPathPreparedStmt.executeUpdate();
            setSearchPathPreparedStmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
            Assert.fail("Unable to create unit test sql schema. " + ex.getMessage());
        }
    }

    private void testQuerySentimentById(KBID sentimentId, int expectedNumberOfProvenances,
            float expectedSentimentConfidence, int expectedNumberOfArguments,
            float expectedSentimentMentionConfidence) throws KBQueryException {
        KBSentiment sentiment = kb.getSentimentById(sentimentId);

        assertTrue("Sentiment returned is null.", sentiment != null);

        assertTrue("Expected " + expectedNumberOfProvenances
                + " document relation provenances, got " + sentiment.getProvenances().size(),
                sentiment.getProvenances().size() == expectedNumberOfProvenances);

        assertTrue("Expected document sentiment confidence " + expectedSentimentConfidence
                + " got " + sentiment.getConfidence() + ".",
                sentiment.getConfidence() == expectedSentimentConfidence);

        assertTrue("Expected " + expectedNumberOfArguments
                + " arguments in sentiment mention, got " + sentiment.getArguments().size() + ".",
                sentiment.getArguments().size() == expectedNumberOfArguments);

        Iterator<KBProvenance> iterator = sentiment.getProvenances().iterator();
        while (iterator.hasNext()) {
            KBTextProvenance provenance = (KBTextProvenance) iterator.next();
            assertTrue("Expected sentiment mention confidence "
                    + expectedSentimentMentionConfidence + " got " + provenance.getConfidence()
                    + ".", provenance.getConfidence() == expectedSentimentMentionConfidence);
        }
    }

    private void testQuerySentimentByArg(KBID entityId) throws KBQueryException {
        boolean assertion = false;

        List<KBSentiment> sentiments = kb.getSentimentsByArg(entityId);
        int size = sentiments.size();
        assertTrue("Size of sentiments is not > 0", size > 0);

        for (KBSentiment sentiment : sentiments) {
            List<KBID> externalKbIds = kb.getExternalKBIDs(sentiment.getKBID());
            for (KBID kbId : externalKbIds) {
                if (kbId.getObjectID().equals("External_Sentiment")) {
                    assertion = true;
                    break;
                }
            }
        }

        assertTrue("assertion is false in testQuerySentimentByArg", assertion);
    }

    private void testQuerySentimentByStringRef(String stringReference) throws KBQueryException {
        List<KBSentiment> sentiments = kb.getSentimentsByStringReference(stringReference);

        int size = sentiments.size();
        assertTrue("Size of sentiments is not greater than zero", size > 0);

        for (KBSentiment sentiment : sentiments) {
            int mentionsSize = sentiment.getProvenances().size();
            assertTrue("Size of sentiment mentions is not greater than 0.", mentionsSize > 0);

            // for each mention, check presence of justification
            for (KBProvenance provenance : sentiment.getProvenances()) {
                KBTextProvenance textProvenance = (KBTextProvenance) provenance;
                assertTrue("Relation justification is null", textProvenance.getValue() != null);
                if (!textProvenance.getValue().equals(stringReference)) {
                    Assert.fail("Relation mentions do not match the expected argument string. Expected \""
                            + stringReference + "\" got \"" + textProvenance.getValue() + "\".");
                }
            }
        }
    }

    public void tearDown() {
        try {
            kb.close();
        } catch (KBUpdateException e) {
            e.printStackTrace();
        }
        deconstructDataStores();
    }

    protected void deconstructDataStores() {
        try {
            dropUnitTestSqlSchema(schemaName);
            sqlConnection.close();
            quickJDBC.close();
        } catch (Exception ex) {
            ex.printStackTrace();
            Assert.fail("Unable to deconstruct data stores for unit tests. " + ex.getMessage());
        }
    }

    private void dropUnitTestSqlSchema(String schemaName) {
        try {
            sqlConnection.setAutoCommit(true);
            PreparedStatement dropSchemaPreparedStmt = sqlConnection
                    .prepareStatement("DROP SCHEMA " + schemaName + " CASCADE");
            dropSchemaPreparedStmt.setQueryTimeout(30);
            dropSchemaPreparedStmt.executeUpdate();
            dropSchemaPreparedStmt.close();
            sqlConnection.setAutoCommit(false);
        } catch (SQLException ex) {
            ex.printStackTrace();
            Assert.fail("Unable to drop unit test sql schema \"" + schemaName
                    + "\", this will have to be manually dropped. " + ex.getMessage());
        }
    }

//    private Pair< ArrayList<ArrayList<Pair<XSDDate, KBDate>>>, Pair< ArrayList<ArrayList<SentimentMention>>, ArrayList< String>>> aggregate(
    //          Pair<List<SentimentMention>, Pair<List<Entity>, List<Entity>>> SentimentMentionListWithEntity, List<String> DateList) throws FileNotFoundException, KBUpdateException, KBQueryException {
    private Pair< Pair< ArrayList<ArrayList<SentimentMention>>, ArrayList<String>>, Pair<ArrayList< Entity>, ArrayList<Entity>>> aggregate(
            Pair<List<SentimentMention>, Pair<List<Entity>, List<Entity>>> SentimentMentionListWithEntity) throws FileNotFoundException, KBUpdateException, KBQueryException {

        ArrayList<String> srcs = new ArrayList<String>();
        ArrayList<String> trgts = new ArrayList<String>();
        ArrayList<Integer> strs = new ArrayList<Integer>();

        ArrayList<Integer> str = new ArrayList<Integer>();
        //ArrayList<SentimentMention> sameSent = new ArrayList<SentimentMention>();
        ArrayList<Entity> Source = new ArrayList<Entity>();
        ArrayList<Entity> Target = new ArrayList<Entity>();

        ArrayList<ArrayList<SentimentMention>> sent = new ArrayList<ArrayList<SentimentMention>>();
        //ArrayList<ArrayList<Pair<XSDDate, KBDate>>> date = new ArrayList<ArrayList<Pair<XSDDate, KBDate>>>();

        ArrayList<String> ss = new ArrayList<String>();

        //Pair P = null;
        for (int i = 0; i < SentimentMentionListWithEntity.getL().size(); i++) {
            Iterator it = SentimentMentionListWithEntity.getL().get(i).getArguments().iterator();
            boolean found_src = false;
            boolean found_target = false;
            boolean found_str = false;
            while (it.hasNext()) {
                SentimentMention.Filler arg = (SentimentMention.Filler) it.next();
                String type = arg.getArgumentType();
                //System.out.println("type is:" + type + "-- entity mention: " + arg.asEntityMention() + "-- rel arg: " + arg.asRelationArgument() + "-- rel men: " + arg.asRelationMention() + "-- str: " + arg.asStrength());
                if (type.equals("source")) {
                    String src = arg.asEntityMention().get().getValue();
                    srcs.add(src);
                    found_src = true;
                }

                if (type.equals("target")) {
                    String trgt = arg.asEntityMention().get().getValue();
                    trgts.add(trgt);
                    found_target = true;
                }

                if (type.equals("strength")) {
                    int strt = Integer.valueOf(arg.asStrength().get().getValue());
                    strs.add(strt);
                    found_str = true;
                }
            }
            if (!found_src || !found_target || !found_str) {
                System.out.println("something missing: " + i + " " + found_src + " " + found_target + " " + found_str + " ");
            }
        }
        System.out.println("SentimentMentionListWithEntity size: " + SentimentMentionListWithEntity.getL().size());
        System.out.println("srcs size: " + srcs.size());
        for (int i = 0; i < srcs.size() - 1; i++) {

            ArrayList<SentimentMention> sameSent = new ArrayList<SentimentMention>();
            ArrayList<Entity> sameSource = new ArrayList<Entity>();
            ArrayList<Entity> sameTarget = new ArrayList<Entity>();

            str = new ArrayList<Integer>();

            str.add(strs.get(i));
            sameSent.add(SentimentMentionListWithEntity.getL().get(i));

            Entity source = SentimentMentionListWithEntity.getR().getL().get(i);
            Entity target = SentimentMentionListWithEntity.getR().getR().get(i);
            System.out.println("i: " + i);
            while (i < srcs.size() - 1 && srcs.get(i).equals(srcs.get(i + 1)) && trgts.get(i).equals(trgts.get(i + 1))) {
                str.add(strs.get(i + 1));

                sameSent.add(SentimentMentionListWithEntity.getL().get(i + 1));
                //Source = (SentimentMentionListWithEntity.getR().getL().get(i + 1));
                //Target = (SentimentMentionListWithEntity.getR().getL().get(i + 1));

                i++;
            }
            System.out.println("sameSent: " + sameSent.size());
            Source.add(source);
            Target.add(target);

            sent.add(sameSent);

            int p = 0;
            int n = 0;
            HashMap<Integer, Integer> strAggs = new HashMap();
            for (int s : str) {
                Integer count = strAggs.get(s);
                if (count == null) {
                    count = 0;
                }
                count++;
                strAggs.put(s, count);
            }

            String strAgg = "";
            Integer maxCount = -100;
            Integer str_agg = 0;
            ArrayList<Integer> keys = new ArrayList(Arrays.asList(strAggs.keySet().toArray()));
            for (Integer key : keys) {
                if (strAggs.get(key) > maxCount) {
                    maxCount = strAggs.get(key);
                    str_agg = key;
                }
            }
            strAgg = str_agg.toString();
            ss.add(strAgg);
//ArrayList<String> a = new ArrayList<String>();
            //sent.add(source.get(i) + "\t" + target.get(i) + "\t" + val.get(i) + "\t" + startTime + "\t" + time.get(i) + "\t" + allstr);
            System.out.println(srcs.get(i) + "\t" + trgts.get(i) + "\tstrength: " + strAgg);
        }
        Pair< ArrayList<ArrayList<SentimentMention>>, ArrayList<String>> sentss = new Pair<ArrayList<ArrayList<SentimentMention>>, ArrayList<String>>(sent, ss);
        Pair<ArrayList<Entity>, ArrayList<Entity>> SourceTarget = new Pair<ArrayList<Entity>, ArrayList<Entity>>(Source, Target);

        return new Pair< Pair< ArrayList<ArrayList<SentimentMention>>, ArrayList<String>>, Pair<ArrayList< Entity>, ArrayList<Entity>>>(sentss, SourceTarget);

        //return new Pair< ArrayList<ArrayList<Pair<XSDDate, KBDate>>>, Pair< ArrayList<ArrayList<SentimentMention>>, ArrayList<String>>>(date, P);
    }

    private ArrayList<ArrayList<Pair<XSDDate, KBDate>>> aggregateTime(
            Pair<List<SentimentMention>, Pair<List<Entity>, List<Entity>>> SentimentMentionListWithEntity, List<String> DateList) throws FileNotFoundException, KBUpdateException, KBQueryException {

        ArrayList<String> srcs = new ArrayList<String>();
        ArrayList<String> trgts = new ArrayList<String>();
        ArrayList<Integer> strs = new ArrayList<Integer>();

        //ArrayList<Integer> str = new ArrayList<Integer>();
        ArrayList<ArrayList<SentimentMention>> sent = new ArrayList<ArrayList<SentimentMention>>();
        ArrayList<ArrayList<Pair<XSDDate, KBDate>>> date = new ArrayList<ArrayList<Pair<XSDDate, KBDate>>>();

        //ArrayList<String> ss = new ArrayList<String>();
        //Pair P = null;
        for (int i = 0; i < SentimentMentionListWithEntity.getL().size(); i++) {
            Iterator it = SentimentMentionListWithEntity.getL().get(i).getArguments().iterator();

            while (it.hasNext()) {
                SentimentMention.Filler arg = (SentimentMention.Filler) it.next();
                String type = arg.getArgumentType();
                //System.out.println("type is:" + type + "-- entity mention: " + arg.asEntityMention() + "-- rel arg: " + arg.asRelationArgument() + "-- rel men: " + arg.asRelationMention() + "-- str: " + arg.asStrength());
                if (type.equals("source")) {
                    String src = arg.asEntityMention().get().getValue();
                    srcs.add(src);
                }

                if (type.equals("target")) {
                    String trgt = arg.asEntityMention().get().getValue();
                    trgts.add(trgt);
                }

                if (type.equals("strength")) {
                    int strt = Integer.valueOf(arg.asStrength().get().getValue());
                    strs.add(strt);
                }
            }
        }

        for (int i = 0; i < srcs.size() - 1; i++) {
            //ArrayList<String> Sentrstr = new ArrayList<String>();

            //ArrayList<SentimentMention> sameSent = new ArrayList<SentimentMention>();
            ArrayList<String> sameDate = new ArrayList();
            HltContentContainer dateHltContentContainer = new HltContentContainer();
            String sample_path = workingPath + "/src/test/resources/us/albany/cubism/sample_date.txt";
            BufferedWriter bw;
            try {
                bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(sample_path), "utf-8"));
                bw.write(DateList.get(i));
                bw.close();
            } catch (UnsupportedEncodingException ex) {
                Logger.getLogger(EventKBOp.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(EventKBOp.class.getName()).log(Level.SEVERE, null, ex);
            }
            Document dateDocument = DocumentMaker.getInstance().createDefaultDocument(
                    "sample_date.txt", null, "Text", "sample_date_1.txt", "English",
                    sample_path,
                    dateHltContentContainer);
            TokenStream testTemporalSpanTokenStream = new TokenStream(TokenizerType.WHITESPACE,
                    TranscriptType.SOURCE, "English", ChannelName.NONE, ContentType.TEXT, dateDocument);
            int offset = 0;
            sameDate.add(DateList.get(i));
//            String sd = addDate(DateList.get(i)).getL().asString();

            //str = new ArrayList<Integer>();
            //str.add(strs.get(i));
            while (i < srcs.size() - 1 && srcs.get(i).equals(srcs.get(i + 1)) && trgts.get(i).equals(trgts.get(i + 1))) {
                //str.add(strs.get(i + 1));

                //sameSent.add(SentimentMentionListWithEntity.getL().get(i));
                sameDate.add(DateList.get(i + 1));
                i++;
            }
            //String allstr = "";

            //sent.add(sameSent);
            date.add(this.addDate(sameDate, testTemporalSpanTokenStream));
        }

        return date;
    }

    public Pair<XSDDate, KBDate> addDate(String dateString, TokenStream testTemporalSpanTokenStream, int offset) throws FileNotFoundException, KBUpdateException, KBQueryException {

        CharOffset testCharOff = new CharOffset(0, dateString.length());
        String testText = dateString;
        Token testToken = new Token(0, testCharOff, testText);

//        if (testTemporalSpanTokenStream == null) {
//        TokenStream testTemporalSpanTokenStream = new TokenStream(TokenizerType.WHITESPACE,
//                TranscriptType.SOURCE, "English", ChannelName.NONE, ContentType.TEXT, dateDocument);
//        }
        TokenOffset testTemporalSpanTokenOffset = new TokenOffset(offset, offset);

        testTemporalSpanTokenStream.add(testToken);

        SourceAlgorithm testSourceAlgorithm = new SourceAlgorithm("Sentiment", "CUBISM");

        XSDDate date = XSDDate.fromString(dateString);

        TimePhrase timePhrase1 = new TimePhrase(testTemporalSpanTokenOffset,
                testTemporalSpanTokenStream, null);

        TemporalResolution temporalResolution1 = TemporalResolution.builder()
                .setResolvedTemporalValue(date).setConfidence(0.5f).setTimePhrase(timePhrase1)
                .setSourceAlgorithm(testSourceAlgorithm).build();
        Set<TemporalResolution> temporalResolutions1 = new HashSet<TemporalResolution>();
        temporalResolutions1.add(temporalResolution1);

        KBDate.InsertionBuilder dateInsertionBuilder1 = KBDate.xsdDateInsertionBuilder(date,
                temporalResolutions1);
        KBDate kbDate = dateInsertionBuilder1.insert(kb);
        assertEqualsAndHashCodeByQueryByKBID(kbDate);
        assertTrue("Date KBID returned from insertXSDDate() is null", kbDate.getKBID() != null);
        System.out.println("Inserted xsd date: " + kbDate.getKBID().getObjectID());

        HashMap<TemporalValue, KBDate> datesMap = new HashMap<TemporalValue, KBDate>();
        datesMap.put(date, kbDate);
        //datesMap.put(date2, kbDate2);
        Pair p = new Pair<XSDDate, KBDate>(date, kbDate);
        return p;
    }

    public ArrayList<Pair<XSDDate, KBDate>> addDate(ArrayList<String> dateStrings, TokenStream testTemporalSpanTokenStream) throws FileNotFoundException, KBUpdateException, KBQueryException {
        ArrayList pairs = new ArrayList();
        if (dateStrings.size() < 2) {
            dateStrings.add(new String(dateStrings.get(0)));
        }
        int offset = 0;
        for (String dateString : dateStrings) {
            CharOffset testCharOff = new CharOffset(0, dateString.length());
            String testText = dateString;
            Token testToken = new Token(0, testCharOff, testText);

//        if (testTemporalSpanTokenStream == null) {
//        TokenStream testTemporalSpanTokenStream = new TokenStream(TokenizerType.WHITESPACE,
//                TranscriptType.SOURCE, "English", ChannelName.NONE, ContentType.TEXT, dateDocument);
//        }
            testTemporalSpanTokenStream.add(testToken);
        }
        SourceAlgorithm testSourceAlgorithm = new SourceAlgorithm("Sentiment", "CUBISM");
        for (String dateString : dateStrings) {
            TokenOffset testTemporalSpanTokenOffset = new TokenOffset(offset, offset);
            offset++;
            XSDDate date = XSDDate.fromString(dateString);

            TimePhrase timePhrase1 = new TimePhrase(testTemporalSpanTokenOffset,
                    testTemporalSpanTokenStream, null);

            TemporalResolution temporalResolution1 = TemporalResolution.builder()
                    .setResolvedTemporalValue(date).setConfidence(0.5f).setTimePhrase(timePhrase1)
                    .setSourceAlgorithm(testSourceAlgorithm).build();
            Set<TemporalResolution> temporalResolutions1 = new HashSet<TemporalResolution>();
            temporalResolutions1.add(temporalResolution1);

            KBDate.InsertionBuilder dateInsertionBuilder1 = KBDate.xsdDateInsertionBuilder(date,
                    temporalResolutions1);
            KBDate kbDate = dateInsertionBuilder1.insert(kb);
            assertEqualsAndHashCodeByQueryByKBID(kbDate);
            assertTrue("Date KBID returned from insertXSDDate() is null", kbDate.getKBID() != null);
            System.out.println("Inserted xsd date: " + kbDate.getKBID().getObjectID());

            Pair p = new Pair<XSDDate, KBDate>(date, kbDate);
            pairs.add(p);
        }
        System.out.println("pairs size: " + pairs.size());
        return pairs;
    }
}
