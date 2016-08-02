/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.albany.cubism.kb;

import edu.albany.cubism.kb.TestInsertSentiment2;
import adept.common.ChannelName;
import adept.common.CharOffset;
import adept.common.ContentType;
import adept.common.Document;
import adept.common.Entity;
import adept.common.EntityMention;
import adept.common.HltContentContainer;
import adept.common.KBID;
import adept.common.OntType;
import adept.common.Pair;
import adept.common.Token;
import adept.common.TokenOffset;
import adept.common.TokenStream;
import adept.common.TokenizerType;
import adept.common.TranscriptType;
import adept.common.Type;
import adept.io.Reader;
import adept.kbapi.KB;
import adept.kbapi.KBEntity;
import adept.kbapi.KBOntologyMap;
import adept.kbapi.KBParameters;
import adept.kbapi.KBProvenance;
import adept.kbapi.KBQueryException;
import adept.kbapi.KBTextProvenance;
import adept.kbapi.KBUpdateException;
import adept.kbapi.RemoteSPARQLService;
import adept.kbapi.sql.QuickJDBC;
import adept.metadata.SourceAlgorithm;
import adept.utilities.DocumentMaker;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.InvalidPropertiesFormatException;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.Assert;
import static org.junit.Assert.assertTrue;

/**
 *
 * @author Ting Liu
 */
public class Insert {

    private final String entityType = "loc";
    private final String expectedResultEntityType = "Location";
    private final String entityMentionType = "NAME";
    private final float entityConfidence = 1.0f;
    private final float entityMentionConfidence = 1.0f;
    private final float entityCanonicalMentionConfidence = 1.0f;
    private final List<Pair<String, Double>> entityTypesWithConfidences;

    private final float updatedEntityMentionConfidence = 1.0f;
    private final float updatedEntityConfidence = 1.0f;
    private final float updatedEntityCanonicalMentionConfidence = 1.0f;

    private final Random rand = new Random();
    private String schemaName;
    private QuickJDBC quickJDBC;
    private Connection sqlConnection;
    private RemoteSPARQLService sparqlService;

    protected KBParameters unitTestKBParameters;
    protected TokenStream testTokenStream;
    protected TokenOffset testTokenOffset;
    protected KB kb;

    private static final String packagePath = new Object() {
    }.getClass().getPackage().getName().replace(".", "/");
    private static final String kbUnitTestingParamsFile = packagePath + "/KBUnitTestParameters.xml";
    private static final String sqlSchemaFile = "/adept/utilities/DEFT KB create schema.txt";

    private static KBOntologyMap tacMap;

    public Insert() {

        entityTypesWithConfidences = new ArrayList<Pair<String, Double>>();
        entityTypesWithConfidences.add(new Pair<String, Double>("per", 0.22));
        entityTypesWithConfidences.add(new Pair<String, Double>("loc", 0.33));

    }

    public static void main(String[] args) {

        TestInsertSentiment2 t = new TestInsertSentiment2();

        //t.buildSentiment(0.9f, 0.8f);
//        t.test(0.8f, 0.8f);
        t.sentimentNumbers();
        //test.testSentiment(packagePath, packagePath, packagePath, packagePath, packagePath, 1);
    }

//        Insert testInsert = new Insert();
//        try {
//            testInsert.insertEntity();
//        } catch (IOException ex) {
//            Logger.getLogger(Insert.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (KBUpdateException ex) {
//            Logger.getLogger(Insert.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (KBQueryException ex) {
//            Logger.getLogger(Insert.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        try {
//            testInsertSentiment.testSentiment();
//        } catch (KBQueryException ex) {
//            Logger.getLogger(Insert.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (KBUpdateException ex) {
//            Logger.getLogger(Insert.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (IOException ex) {
//            Logger.getLogger(Insert.class.getName()).log(Level.SEVERE, null, ex);
//        }
    public void insertEntity() throws FileNotFoundException, IOException, KBUpdateException, KBQueryException {
        Pair<Entity, List<EntityMention>> entityWithMentions = createEntityWithMentions(
                entityType, entityConfidence, entityMentionType, entityMentionConfidence,
                entityCanonicalMentionConfidence, entityTypesWithConfidences);

        // Initial insert
        KBEntity.InsertionBuilder insertionBuilder = KBEntity.entityInsertionBuilder(
                entityWithMentions.getL(), entityWithMentions.getR(),
                KBOntologyMap.getTACOntologyMap());

        KBEntity kbEntity = insertionBuilder.insert(kb);

        testQueryEntityById(kbEntity.getKBID(), entityType, entityConfidence,
                entityCanonicalMentionConfidence, entityTypesWithConfidences);
    }

    protected Pair<Entity, List<EntityMention>> createEntityWithMentions(String entityType,
            float entityConfidence, String entityMentionType, float entityMentionConfidence,
            float entityCanonicalMentionConfidence,
            List<Pair<String, Double>> entityTypesWithConfidences) {
        try {
            // create entity
            Entity entity = new Entity(4, new Type("loc"));

            init();

            // create mention
            List<EntityMention> mentions = new ArrayList<EntityMention>();
            EntityMention mention = new EntityMention(0, testTokenOffset, testTokenStream);
            mention.addEntityConfidencePair(entity.getEntityId(), entityMentionConfidence);
            mention.setMentionType(new Type(entityMentionType));
            mention.setSourceAlgorithm(new SourceAlgorithm("Example", "BBN"));
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

    public void init() throws FileNotFoundException {
        HltContentContainer hltContentContainer = new HltContentContainer();
        Document document = DocumentMaker.getInstance().createDefaultDocument("test.txt",
                null, "Text", "test_entity_1.txt", "English",
                Reader.getAbsolutePathFromClasspathOrFileSystem("adept/kbapi/test.txt"),
                hltContentContainer);
        CharOffset testCharOff = new CharOffset(0, 8);
        String testText = "Pakistan";
        Token testToken = new Token(0, testCharOff, testText);
        testTokenStream = new TokenStream(TokenizerType.WHITESPACE, TranscriptType.SOURCE,
                "English", ChannelName.NONE, ContentType.TEXT, document);
        testTokenOffset = new TokenOffset(0, 0);
        testTokenStream.add(testToken);
    }

    private void createUnitTestSqlSchema(String schemaName) {
        try {
            PreparedStatement createSchemaPreparedStmt = sqlConnection
                    .prepareStatement("CREATE SCHEMA " + schemaName);
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

    private void testQueryEntityById(KBID kbEntityId, String expectedEntityType,
            float expectedEntityConfidence, float expectedCanonicalMentionConfidence,
            List<Pair<String, Double>> expectedEntityTypesWithConfidences) throws KBQueryException,
            InvalidPropertiesFormatException, FileNotFoundException, IOException {
        boolean assertion = true;
        String assertionFailureText = "";

        KBEntity kbEntity = kb.getEntityById(kbEntityId);

        if (kbEntity == null) {
            assertion = false;
            assertionFailureText += "No entity returned from getEntityById(). ";
        }

        String entityType = KBOntologyMap.getTACOntologyMap()
                .getTypeForKBType(getTypeWithHighestConfidenceForKBEntity(kbEntity)).get()
                .getType();
        if (!entityType.equals(expectedEntityType)) {
            assertion = false;
            assertionFailureText += "Entity type " + entityType
                    + " does not match expected entity type of " + expectedEntityType + ". ";
        }

        if (kbEntity.getConfidence() != expectedEntityConfidence) {
            assertion = false;
            assertionFailureText += "Entity confidence " + kbEntity.getConfidence()
                    + " does not match expected entity confidence of " + expectedEntityConfidence
                    + ". ";
        }

        if (kbEntity.getCanonicalMentionConfidence() != expectedCanonicalMentionConfidence) {
            assertion = false;
            assertionFailureText += "Entity canonical mention confidence "
                    + kbEntity.getCanonicalMentionConfidence()
                    + " does not match expected canonical mention confidence of "
                    + expectedCanonicalMentionConfidence + ". ";
        }

        for (Pair<String, Double> expectedEntityTypeWithConfidence : expectedEntityTypesWithConfidences) {
            OntType expectedType = KBOntologyMap.getTACOntologyMap()
                    .getKBTypeForType(new Type(expectedEntityTypeWithConfidence.getL())).get();

            if (!kbEntity.getTypes().containsKey(expectedType)
                    || !kbEntity.getTypes().get(expectedType)
                    .equals(expectedEntityTypeWithConfidence.getR().floatValue())) {
                assertion = false;
                assertionFailureText += "No matching entity type of type " + expectedType.getType()
                        + " with confidence " + expectedEntityTypeWithConfidence.getR()
                        + " found. ";
            }
        }

        assertTrue(assertionFailureText, assertion);
    }

    private void testQueryEntitiesByStringRef(String stringReference) throws KBQueryException {
        List<KBEntity> kbEntities = kb.getEntitiesByStringReference(stringReference);

        int entitiesSize = kbEntities.size();
        assertTrue("Size of entities is not greater than 0.", entitiesSize > 0);

        for (KBEntity kbEntity : kbEntities) {
            // get mentions for entity

            int mentionsSize = kbEntity.getProvenances().size();
            assertTrue("Size of entity mentions is not greater than 0.", mentionsSize > 0);

            // for each mention, check that it matches with the arg string
            for (KBProvenance mention : kbEntity.getProvenances()) {
                KBTextProvenance textMention = (KBTextProvenance) mention;
                if (!textMention.getValue().equals(stringReference)) {
                    Assert.fail("Entity mentions do not match the expected argument string. Expected \""
                            + stringReference + "\" got \"" + textMention.getValue() + "\".");
                }
            }
        }
    }

    private static OntType getTypeWithHighestConfidenceForKBEntity(KBEntity kbEntity) {
        OntType currentOntType = null;
        float highestConfidence = Float.MIN_VALUE;
        for (OntType type : kbEntity.getTypes().keySet()) {
            if (kbEntity.getTypes().get(type) > highestConfidence) {
                highestConfidence = kbEntity.getTypes().get(type);
                currentOntType = type;
            }
        }
        return currentOntType;
    }

//    protected Chunk createTestChunk() {
//        try {
//            HltContentContainer hltContentContainer = new HltContentContainer();
//            Document document = DocumentMaker.getInstance().createDefaultDocument("sample.txt",
//                    null, "Text", "sample_entity_1.txt", "English",
//                    Reader.getAbsolutePathFromClasspathOrFileSystem("adept/kbapi/sample.txt"),
//                    hltContentContainer);
//            CharOffset testCharOff = new CharOffset(0, 16);
//            String testText = "BBN Technologies";
//            Token testToken = new Token(0, testCharOff, testText);
//            TokenStream tokenStream = new TokenStream(TokenizerType.WHITESPACE,
//                    TranscriptType.SOURCE, "English", ChannelName.NONE, ContentType.TEXT, document);
//            TokenOffset tokenOffset = new TokenOffset(0, 0);
//            tokenStream.add(testToken);
//            return new Chunk(tokenOffset, tokenStream);
//        } catch (Exception ex) {
//            ex.printStackTrace();
//            Assert.fail("Unable to create test chunk. " + ex.getMessage());
//        }
//        return null;
//    }
    public static void deleteFiles() {
        File dir = new File("/home/aparna/ihmc/deft/adept/adept-kb/src/test/resources/adept/kbapi/files");
        for (File file : dir.listFiles()) {
            file.delete();
        }
    }

    public static void createFiles(String target, String date, String str, String source, String chunk, int c) {
        try {

            File targetFile = new File("/home/aparna/ihmc/deft/adept/adept-kb/src/test/resources/adept/kbapi/files/target" + c + ".txt");
            File dateFile = new File("/home/aparna/ihmc/deft/adept/adept-kb/src/test/resources/adept/kbapi/files/date" + c + ".txt");
            File strFile = new File("/home/aparna/ihmc/deft/adept/adept-kb/src/test/resources/adept/kbapi/files/str" + c + ".txt");
            File sourceFile = new File("/home/aparna/ihmc/deft/adept/adept-kb/src/test/resources/adept/kbapi/files/source" + c + ".txt");
            File chunkFile = new File("/home/aparna/ihmc/deft/adept/adept-kb/src/test/resources/adept/kbapi/files/chunk" + c + ".txt");

            BufferedWriter bwTarget = new BufferedWriter(new FileWriter(targetFile));
            BufferedWriter bwDate = new BufferedWriter(new FileWriter(dateFile));
            BufferedWriter bwStr = new BufferedWriter(new FileWriter(strFile));
            BufferedWriter bwSource = new BufferedWriter(new FileWriter(sourceFile));
            BufferedWriter bwChunk = new BufferedWriter(new FileWriter(chunkFile));

            bwTarget.write(target);
            bwDate.write(date);
            bwStr.write(str);
            bwSource.write(source);
            bwChunk.write(chunk);

            bwTarget.close();
            bwDate.close();
            bwStr.close();
            bwSource.close();
            bwChunk.close();

        } catch (IOException ex) {
            Logger.getLogger(Insert.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void oldMain() {
        File infile = new File("/home/aparna/ihmc/deft/adept/adept-kb/src/test/resources/adept/kbapi/sentiments.txt");
        File infile2 = new File("/home/aparna/ihmc/deft/adept/adept-kb/src/test/resources/adept/kbapi/sentiments2.txt");
        try {
            BufferedReader br = new BufferedReader(new FileReader(infile));
            BufferedReader br2 = new BufferedReader(new FileReader(infile2));

            String line = "";

            String target = "";
            String date = "";
            String str = "";
            String source = "";
            String chunk = "";

            int c = 1;

            deleteFiles();

            while ((line = br2.readLine()) != null) {
                String[] token = line.split("\t");

                System.out.println("c:" + c);

                target = token[0];
                date = token[1].substring(0, 10);
                str = token[2];
                source = token[3];
                chunk = token[4];
                createFiles(target, date, str, source, chunk, c++);
            }

            c = 1;

            while ((line = br.readLine()) != null) {

                TestInsertSentiment2 testInsertSentiment = new TestInsertSentiment2();
                testInsertSentiment.init();
                String[] token = line.split("\t");

                target = token[0];
                date = token[1].substring(0, 10);
                str = token[2];
                source = token[3];
                chunk = token[4];

//                createFiles(target, date, str, source, chunk , c);
                System.out.println("target:" + target + date + str + source + chunk + c);

                try {
                    testInsertSentiment.testSentiment(target, date, str, source, chunk, c);
                } catch (KBQueryException ex) {
                    Logger.getLogger(Insert.class.getName()).log(Level.SEVERE, null, ex);
                } catch (KBUpdateException ex) {
                    Logger.getLogger(Insert.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InvalidPropertiesFormatException ex) {
                    Logger.getLogger(Insert.class.getName()).log(Level.SEVERE, null, ex);
                }

                testInsertSentiment.tearDown();
                System.out.println("number of sentiments: " + c++);
            }
            br.close();
            br2.close();

//        try {
//            tacMap = KBOntologyMap.getTACOntologyMap();
//            KBOntologyMap.getMap(tacMap);
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(Insert.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (IOException ex) {
//            Logger.getLogger(Insert.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        System.out.println(tacMap.toString());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Insert.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Insert.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
