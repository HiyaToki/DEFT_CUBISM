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
import adept.common.DocumentRelation;
import adept.common.DocumentRelationArgument;
import adept.common.DocumentSentiment;
import adept.common.Entity;
import adept.common.EntityMention;
import adept.common.Relation;
import adept.common.RelationMention;
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
import adept.kbapi.KBRelation;
import adept.kbapi.KBNumber;
import adept.kbapi.KBOntologyMap;
import adept.kbapi.KBOntologyModel;
import adept.kbapi.KBParameters;
import adept.kbapi.KBPredicateArgument;
import adept.kbapi.KBQueryException;
import adept.kbapi.KBRelation;
import adept.kbapi.KBSentiment;
import adept.kbapi.KBTextProvenance;
import adept.kbapi.KBUpdateException;
import adept.metadata.SourceAlgorithm;
import com.google.common.base.Optional;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
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
public class RelationKBOp {

    private DocumentSentiment documentSentiment;
    private Map<Item, KBPredicateArgument> kbArgumentsMap;

    private final float initialSentimentConfidence = 0.9f;
    private final float sentimentMentionConfidence = 0.8f;
    private final float updatedSentimentConfidence = 0.7f;

    private KBRelation kbRelation1;
    private KBRelation kbRelation2;

    protected final String defaultRelationType = "org";
    protected final String defaultRelationMentionType = "NAME";
    protected final float defaultRelationConfidence = 1.0f;
    protected final float defaultRelationMentionConfidence = 1.0f;
    protected final float defaultRelationCanonicalMentionConfidence = 1.0f;
    protected final List<Pair<String, Double>> defaultRelationTypesWithConfidences;

//    protected final String defaultRelationType = "Sentiment";

    protected KBParameters unitTestKBParameters;
//    protected TokenStream tokenStream;
//    protected TokenOffset tokenOffset;
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

    public RelationKBOp() {
        defaultRelationTypesWithConfidences = new ArrayList<Pair<String, Double>>();
        defaultRelationTypesWithConfidences.add(new Pair<String, Double>("per", 0.22));
        defaultRelationTypesWithConfidences.add(new Pair<String, Double>("loc", 0.33));
    }

    public KBRelation checkExists(Relation relation) {
        List<KBRelation> kbRelationes = null;
        try {
            kbRelationes = kb.getRelationsByArg(null);
            if (kbRelationes == null || kbRelationes.isEmpty()) {
                return null;
            }
        } catch (KBQueryException ex) {
            Logger.getLogger(RelationKBOp.class.getName()).log(Level.SEVERE, null, ex);
        }
        return kbRelationes.get(0);
    }

    public OntType getType(String type) throws FileNotFoundException, IOException {
        return KBOntologyMap.getTACOntologyMap().getKBTypeForType(new Type(type)).get();
    }

    public void updateKBRelation(KBRelation kbRelation, RelationMention em) {
        KBRelation.UpdateBuilder relationUpdateBuilder = (KBRelation.UpdateBuilder)kbRelation.updateBuilder();
        relationUpdateBuilder.setConfidence(1);
        relationUpdateBuilder.removeProvenance(kbRelation.getProvenances().iterator().next());

        KBTextProvenance.InsertionBuilder otherMentionBuilder = KBTextProvenance.builder(
                em.getJustification(), 1);

        relationUpdateBuilder.addProvenance(otherMentionBuilder);
        try {
            KBRelation updatedKbRelation = relationUpdateBuilder.update(kb);
        } catch (KBUpdateException ex) {
            Logger.getLogger(RelationKBOp.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public List<KBRelation> searchKBENtity(KBID kbid, String mention_type, String relation_type) {
        List<KBRelation> kbes = null;
        try {
            kbes = kb.getRelationsByArgAndType(kbid, this.getType(relation_type));
            return kbes;
        } catch (IOException ex) {
            Logger.getLogger(RelationKBOp.class.getName()).log(Level.SEVERE, null, ex);
        } catch (KBQueryException ex) {
            Logger.getLogger(RelationKBOp.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public void insertRelation(int start, int end, Document document, String mention, String date, String chunk, KB kb, String mention_type, String relation_type) throws KBQueryException, KBUpdateException,
            InvalidPropertiesFormatException, IOException {

        this.kb = kb;
        // create sentiment
        /*
        Pair<Relation, List<RelationMention>> relationWithMentions = this.createRelationWithMentions(start, end, mention, document, relation_type, defaultRelationConfidence, mention_type, sentimentMentionConfidence, defaultRelationCanonicalMentionConfidence, defaultRelationTypesWithConfidences);

        KBRelation.InsertionBuilder insertionBuilder = KBRelation.relationInsertionBuilder(
                relationWithMentions.getL(), relationWithMentions.getR(),
                KBOntologyMap.getTACOntologyMap());
        insertionBuilder.addExternalKBId(new KBID("External_Relation_ID", "ihmc_sentiment"));
        KBRelation kbRelation = insertionBuilder.insert(kb);
                */
    }

    public void insertRelation(Pair<Relation, List<RelationMention>> relationWithMentions, KB kb) throws KBQueryException, KBUpdateException,
            InvalidPropertiesFormatException, IOException {

        this.kb = kb;
        // create sentiment
/*
        KBRelation.InsertionBuilder insertionBuilder = KBRelation.relationInsertionBuilder(
                relationWithMentions.getL(), relationWithMentions.getR(),
                KBOntologyMap.getTACOntologyMap());
        insertionBuilder.addExternalKBId(new KBID("External_Relation_ID", "ihmc_sentiment"));
        KBRelation kbRelation = insertionBuilder.insert(kb);
        */
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
            Logger.getLogger(RelationKBOp.class.getName()).log(Level.SEVERE, null, ex);
        }
        ArrayList strengthPair = new ArrayList();
        strengthPair.add(strengthNumericValue);
        strengthPair.add(kbStrength);
//        return new Pair(strengthNumericValue, kbStrength);
        return strengthPair;
    }

	protected Pair<DocumentRelation, HashMap<Item, KBPredicateArgument>> createRelationWithEntityMap(
			KBEntity kbEntity1, KBEntity kbEntity2, String relationType, float relationConfidence,
			float relationMentionConfidence, Entity entity1, Entity entity2, TokenOffset tokenOffset, TokenStream tokenStream) {

		// entity and entity mention creation

		// create mention
		EntityMention locationmention = new EntityMention(0, tokenOffset, tokenStream);
		locationmention.addEntityConfidencePair(entity1.getEntityId(), 0.9f);
		locationmention.setMentionType(new Type("NAME"));
		locationmention.setSourceAlgorithm(new SourceAlgorithm("Example", "BBN"));

		EntityMention personmention = new EntityMention(1, tokenOffset, tokenStream);
		personmention.addEntityConfidencePair(entity2.getEntityId(), 0.9f);
		personmention.setMentionType(new Type("NAME"));
		personmention.setSourceAlgorithm(new SourceAlgorithm("Example", "BBN"));

		// set canonical mention and confidences on entities
		entity1.setCanonicalMentions(locationmention);
		entity1.setEntityConfidence(0.8f);
		entity1.setCanonicalMentionConfidence(0.63);

		entity2.setCanonicalMentions(personmention);
		entity2.setEntityConfidence(0.87);
		entity2.setCanonicalMentionConfidence(0.1);

		// create relation mention
		RelationMention.Builder relationMentionBuilder = RelationMention.builder(new Type(
				relationType));
		relationMentionBuilder.setConfidence(relationMentionConfidence);
		relationMentionBuilder.addJustification(new Chunk(tokenOffset, tokenStream));
		RelationMention.Filler argFiller1 = RelationMention.Filler.fromEntityMention(personmention,
				new Type("arg-1"), 0.51f);
		relationMentionBuilder.addArgument(argFiller1);
		RelationMention.Filler argFiller2 = RelationMention.Filler.fromEntityMention(
				locationmention, new Type("arg-2"), 0.52f);
		relationMentionBuilder.addArgument(argFiller2);

		List<RelationMention> provenances = new ArrayList<RelationMention>();
		provenances.add(relationMentionBuilder.build());

		// create document relation
		DocumentRelation.Builder documentRelationBuilder = DocumentRelation.builder(new Type(
				relationType));
		documentRelationBuilder.addProvenances(provenances);
		documentRelationBuilder.setConfidence(relationConfidence);
		DocumentRelationArgument.Builder arg1Builder = DocumentRelationArgument.builder(new Type(
				"arg-1"), DocumentRelationArgument.Filler.fromEntity(entity2), 0.51f);
		arg1Builder.addProvenance(argFiller1);
		documentRelationBuilder.addArgument(arg1Builder.build());
		DocumentRelationArgument.Builder arg2Builder = DocumentRelationArgument.builder(new Type(
				"arg-2"), DocumentRelationArgument.Filler.fromEntity(entity1), 0.52f);
		arg2Builder.addProvenance(argFiller2);
		documentRelationBuilder.addArgument(arg2Builder.build());

		// map from document entities to Adept KB entities
		HashMap<Item, KBPredicateArgument> entityMap = new HashMap<Item, KBPredicateArgument>();
		entityMap.put(entity2, kbEntity1);
		entityMap.put(entity1, kbEntity2);

		DocumentRelation documentRelation = documentRelationBuilder.build();

		return new Pair<DocumentRelation, HashMap<Item, KBPredicateArgument>>(documentRelation,
				entityMap);
	}

}
