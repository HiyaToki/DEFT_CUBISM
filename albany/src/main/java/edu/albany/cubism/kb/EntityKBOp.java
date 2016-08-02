/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.albany.cubism.kb;

import adept.common.ChannelName;
import adept.common.CharOffset;
import adept.common.ContentType;
import adept.common.Document;
import adept.common.DocumentSentiment;
import adept.common.Entity;
import adept.common.EntityMention;
import adept.common.HltContentContainer;
import adept.common.Item;
import adept.common.KBID;
import adept.common.NumberPhrase;
import adept.common.NumericValue;
import adept.common.OntType;
import adept.common.Pair;
import adept.common.Token;
import adept.common.TokenOffset;
import adept.common.TokenStream;
import adept.common.TokenizerType;
import adept.common.TranscriptType;
import adept.common.Type;
import adept.kbapi.KB;
import adept.kbapi.KBEntity;
import adept.kbapi.KBNumber;
import adept.kbapi.KBOntologyMap;
import adept.kbapi.KBOntologyModel;
import adept.kbapi.KBParameters;
import adept.kbapi.KBPredicateArgument;
import adept.kbapi.KBQueryException;
import adept.kbapi.KBSentiment;
import adept.kbapi.KBTextProvenance;
import adept.kbapi.KBUpdateException;
import adept.metadata.SourceAlgorithm;
import com.google.common.base.Optional;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.InvalidPropertiesFormatException;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.hadoop.classification.InterfaceAudience.Public;
import org.junit.Assert;

/**
 *
 * @author Mehrdad
 */
//public class TestInsertSentiment extends KBUnitM {
public class EntityKBOp {

    private DocumentSentiment documentSentiment;
    private Map<Item, KBPredicateArgument> kbArgumentsMap;

    private final float initialSentimentConfidence = 0.9f;
    private final float sentimentMentionConfidence = 0.8f;
    private final float updatedSentimentConfidence = 0.7f;

    private KBEntity kbEntity1;
    private KBEntity kbEntity2;

    protected final String defaultEntityType = "org";
    protected final String defaultEntityMentionType = "NAME";
    protected final float defaultEntityConfidence = 1.0f;
    protected final float defaultEntityMentionConfidence = 1.0f;
    protected final float defaultEntityCanonicalMentionConfidence = 1.0f;
    protected final List<Pair<String, Double>> defaultEntityTypesWithConfidences;

    protected final String defaultRelationType = "per:cities_of_residence";
//    protected final String defaultRelationType = "Sentiment";

    protected KBParameters unitTestKBParameters;
//    protected TokenStream testTokenStream;
//    protected TokenOffset testTokenOffset;
    protected KB kb;

    KBNumber kbStrength = null;

    private static final String packagePath = new Object() {
    }.getClass().getPackage().getName().replace(".", "/");
//    private static String workingPath = System.getProperty("user.dir");
//    String inputPath = workingPath + "/src/test/resources/us/ihmc/cubism/sociolinguistics/input.benchmark/";
//    private static final String kbUnitTestingParamsFile = workingPath + "/src/test/resources/us/albany/cubism/unittests/KBParameters.xml";//packagePath + "/KBUnitTestParameters.xml";
//    private static final String sqlSchemaFile = workingPath + "/src/test/resources/us/albany/cubism/utilities/DEFT_KB_create_schema.txt";
//    private static final String kbUnitTestingParamsFile = packagePath + "/KBUnitTestParameters.xml";
//    private static final String sqlSchemaFile = "/adept/utilities/DEFT KB create schema.txt";

    public EntityKBOp() {
        defaultEntityTypesWithConfidences = new ArrayList<Pair<String, Double>>();
        defaultEntityTypesWithConfidences.add(new Pair<String, Double>("per", 0.22));
        defaultEntityTypesWithConfidences.add(new Pair<String, Double>("loc", 0.33));
    }

    public KBEntity checkExists(Entity entity) {
        List<KBEntity> kbEntities = null;
        try {
            kbEntities = kb.getEntitiesByValueAndType(entity.getEntity(), this.getType(entity.getEntityType().getType()));
            if (kbEntities == null || kbEntities.isEmpty()) {
                return null;
            }
        } catch (KBQueryException ex) {
            Logger.getLogger(EntityKBOp.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(EntityKBOp.class.getName()).log(Level.SEVERE, null, ex);
        }
        return kbEntities.get(0);
    }

    public OntType getType(String type) throws FileNotFoundException, IOException {
        return KBOntologyMap.getTACOntologyMap().getKBTypeForType(new Type(type)).get();
    }

    public void updateKBEntity(KBEntity kbEntity, EntityMention em) {
        KBEntity.UpdateBuilder entityUpdateBuilder = kbEntity.updateBuilder();
        entityUpdateBuilder.setConfidence(1);
        entityUpdateBuilder.removeProvenance(kbEntity.getProvenances().iterator().next());

        KBTextProvenance.InsertionBuilder otherMentionBuilder = KBTextProvenance.builder(
                em, 1);

        entityUpdateBuilder.addProvenance(otherMentionBuilder);
        try {
            KBEntity updatedKbEntity = entityUpdateBuilder.update(kb);
        } catch (KBUpdateException ex) {
            Logger.getLogger(EntityKBOp.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public List<KBEntity> searchKBENtity(String mention, String mention_type, String entity_type) {
        List<KBEntity> kbes = null;
        try {
            kbes = kb.getEntitiesByValueAndType(mention, this.getType(entity_type));
            return kbes;
        } catch (IOException ex) {
            Logger.getLogger(EntityKBOp.class.getName()).log(Level.SEVERE, null, ex);
        } catch (KBQueryException ex) {
            Logger.getLogger(EntityKBOp.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public void insertEntity(int start, int end, Document document, String mention, String date, String chunk, KB kb, String mention_type, String entity_type) throws KBQueryException, KBUpdateException,
            InvalidPropertiesFormatException, IOException {

        this.kb = kb;
        // create sentiment
        Pair<Entity, List<EntityMention>> entityWithMentions = this.createEntityWithMentions(start, end, mention, document, entity_type, defaultEntityConfidence, mention_type, sentimentMentionConfidence, defaultEntityCanonicalMentionConfidence, defaultEntityTypesWithConfidences);

        KBEntity.InsertionBuilder insertionBuilder = KBEntity.entityInsertionBuilder(
                entityWithMentions.getL(), entityWithMentions.getR(),
                KBOntologyMap.getTACOntologyMap());
        insertionBuilder.addExternalKBId(new KBID("External_Entity_ID", "ihmc_sentiment"));
        KBEntity kbEntity = insertionBuilder.insert(kb);
    }

    public void insertEntity(Pair<Entity, List<EntityMention>> entityWithMentions, KB kb) throws KBQueryException, KBUpdateException,
            InvalidPropertiesFormatException, IOException {

        this.kb = kb;
        // create sentiment

        KBEntity.InsertionBuilder insertionBuilder = KBEntity.entityInsertionBuilder(
                entityWithMentions.getL(), entityWithMentions.getR(),
                KBOntologyMap.getTACOntologyMap());
        insertionBuilder.addExternalKBId(new KBID("External_Entity_ID", "ihmc_sentiment"));
        KBEntity kbEntity = insertionBuilder.insert(kb);
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
        } catch (KBUpdateException ex) {
            Logger.getLogger(EntityKBOp.class.getName()).log(Level.SEVERE, null, ex);
        }
        ArrayList strengthPair = new ArrayList();
        strengthPair.add(strengthNumericValue);
        strengthPair.add(kbStrength);
//        return new Pair(strengthNumericValue, kbStrength);
        return strengthPair;
    }

    protected Pair<Entity, List<EntityMention>> createEntityWithMentions(int start, int end, String text, Document document, String entityType,
            float entityConfidence, String entityMentionType, float entityMentionConfidence,
            float entityCanonicalMentionConfidence,
            List<Pair<String, Double>> entityTypesWithConfidences) {
        try {
            // create entity
            Entity entity = new Entity(2, new Type(entityType));

            HltContentContainer hltContentContainer = new HltContentContainer();
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

    protected EntityMention createEntityMention(KBEntity kbe, int start, int end, String text, Document document, String entityMentionType, float entityMentionConfidence, String entityType) {
        try {
            // create entity

            HltContentContainer hltContentContainer = new HltContentContainer();
            CharOffset testCharOff = new CharOffset(start, end);
            String testText = text;
            Token testToken = new Token(0, testCharOff, testText);
            TokenStream TokenStream1 = new TokenStream(TokenizerType.WHITESPACE, TranscriptType.SOURCE,
                    "English", ChannelName.NONE, ContentType.TEXT, document);
            TokenOffset TokenOffset1 = new TokenOffset(0, 0);
            TokenStream1.add(testToken);
            //

            // create mention
            EntityMention mention = new EntityMention(0, TokenOffset1, TokenStream1);
            mention.addEntityConfidencePair(0, entityMentionConfidence);
            mention.setMentionType(new Type(entityMentionType));
            mention.setSourceAlgorithm(new SourceAlgorithm("Sentiment", "CUBISM"));
            mention.setEntityType(new Type(entityType));

            return mention;
        } catch (Exception ex) {
            ex.printStackTrace();
            Assert.fail("Unable to create entity object. " + ex.getMessage());
        }

        return null;
    }

}
