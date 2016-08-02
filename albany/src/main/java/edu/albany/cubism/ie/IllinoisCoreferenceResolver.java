package edu.albany.cubism.ie;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.InvalidPropertiesFormatException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import edu.uiuc.common.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import LBJ2.learn.BatchTrainer;
import LBJ2.learn.Learner;
import LBJ2.parse.Parser;
import adept.common.AdeptException;
import adept.common.Coreference;
import adept.common.Document;
import adept.common.DocumentList;
import adept.common.Entity;
import adept.common.EntityMention;
import adept.common.EntityTypeFactory;
import adept.common.HltContentContainer;
import adept.common.MentionTypeFactory;
import adept.common.TokenOffset;
import adept.common.TokenStream;
import adept.common.TokenizerType;
import adept.common.Type;
import adept.common.IType;
import adept.module.AdeptModuleException;
import adept.module.CoreferenceResolver;
import adept.utilities.DocumentMaker;
import edu.illinois.cs.cogcomp.edison.annotators.GazetteerViewGenerator;
import edu.illinois.cs.cogcomp.edison.sentences.TextAnnotation;
import edu.illinois.cs.cogcomp.lbj.coref.Parameters;
import edu.illinois.cs.cogcomp.lbj.coref.decoders.BIODecoder;
import edu.illinois.cs.cogcomp.lbj.coref.decoders.BestLinkDecoderPronouns;
import edu.illinois.cs.cogcomp.lbj.coref.decoders.CorefKeyDecoder;
import edu.illinois.cs.cogcomp.lbj.coref.decoders.ExtendHeadsDecoder;
import edu.illinois.cs.cogcomp.lbj.coref.decoders.MentionDecoder;
import edu.illinois.cs.cogcomp.lbj.coref.features.EntityTypeFeatures;
import edu.illinois.cs.cogcomp.lbj.coref.io.loaders.DocFromTextLoader;
import edu.illinois.cs.cogcomp.lbj.coref.ir.Mention;
import edu.illinois.cs.cogcomp.lbj.coref.ir.docs.Doc;
import edu.illinois.cs.cogcomp.lbj.coref.ir.docs.DocPlainText;
import edu.illinois.cs.cogcomp.lbj.coref.ir.solutions.ChainSolution;
import edu.illinois.cs.cogcomp.lbj.coref.ir.solutions.MentionSolution;
import edu.illinois.cs.cogcomp.lbj.coref.learned.MDExtendHeads;
import edu.illinois.cs.cogcomp.lbj.coref.learned.MTypePredictor;
import edu.illinois.cs.cogcomp.lbj.coref.learned.MentionDetectorMyBIOHead;
import edu.illinois.cs.cogcomp.lbj.coref.learned.aceCorefSPLearner;
import edu.illinois.cs.cogcomp.lbj.coref.postProcessing.NestedPostProcessing;
import edu.illinois.cs.cogcomp.lbj.coref.postProcessing.RemoveSingletonProcessing;
import edu.illinois.cs.cogcomp.lbj.coref.scorers.BCubedScorer;
import edu.illinois.cs.cogcomp.lbj.coref.scorers.CoNLLScorer;
import edu.illinois.cs.cogcomp.lbj.coref.scorers.OutputD3Scorer;

/**
 * the core of the Illinois Discourse component.
 *
 * NOTES: ideally, we should factor out the dependency on the Illinois NER, by
 * making the NER its own component and putting its output in the input
 * HltContentContainer. But this may mean significant changes to the Illinois
 * Coref code, and given other constraints, may not be possible at this time.
 *
 * @author mssammon
 *
 */
public class IllinoisCoreferenceResolver extends CoreferenceResolver {

    private static final String NAME = IllinoisCoreferenceResolver.class.getCanonicalName();

    // TODO: we should use the logger provide in the adept module.
    private final Logger logger = LoggerFactory.getLogger(getClass());

    private double corefThreshold = -8;
    private double pronounThreshold = -8;
//	private String OntonotesCorefModel = null;
//	private String OntonotesProModel = null;
    private String aceCorefModel = null;
//	private String AceProModel = null;
    private String outputDirName = null;
    private String outputFormat = "None";
    private String annotationFormat = null;
    private Boolean useGoldMentions = false;
//	private String CuratorHost = null;
//	private int CuratorPort=-1;

    private String pathToGoldHeadLastWordPairCount = "countTable/CoNLL12_TRAIN_ENGLISH_All_AUTO_headLastWordCount";
    private String PreWordCount = null;
    private String pathToNonReferentialMention = "countTable/nonReferentialMention_CoNLL12_train";
    private String pathToNestedRepeatedMention = "countTable/nestedRepeatedMention_CoNLL12_train";

    private Learner corefClassifier;

    private Learner pronounClassifier;

    MentionDecoder mentionDecoder
            = new ExtendHeadsDecoder(new MDExtendHeads(),
                    new BIODecoder(new MentionDetectorMyBIOHead()));
    MTypePredictor mentionTyper = new MTypePredictor();

    private BestLinkDecoderPronouns decoderPronouns;

    private TokenizerType tokenizerType;

    private boolean failOnException;

    private String resultFormat;

    private GazetteerViewGenerator gazetteerManager;

    /**
     * The entity type factory.
     */
    private static EntityTypeFactory entityTypeFactory = null;

    /**
     * The mention type factory.
     */
    private static MentionTypeFactory mentionTypeFactory = null;

    public IllinoisCoreferenceResolver() {
        entityTypeFactory = null;
        mentionTypeFactory = null;
    }

    /**
     * initializes the module config should also specify module traits file path
     * traits are descriptive characteristics, user-defined, that detail the
     * dependencies, input/output data types, nature of processing performed,
     * etc.
     */
    @Override
    public void activate(String config) throws InvalidPropertiesFormatException, AdeptModuleException, IOException {
        super.activate(config);
        init(config);
    }

    private void init(String config_) throws InvalidPropertiesFormatException, IOException {
        UiucModuleConfig config = new UiucModuleConfig(config_);
        init(config);
    }

    private void init(UiucModuleConfig config) throws InvalidPropertiesFormatException, IOException {
        entityTypeFactory = EntityTypeFactory.getInstance();
        mentionTypeFactory = MentionTypeFactory.getInstance();
        this.failOnException = config.getBoolean(IllinoisConstants.FAIL_ON_EXCEPTION);
        this.tokenizerType = TokenizerType.valueOf(config.getString(IllinoisConstants.TOKENIZER_TYPE));

        Parameters.pathToGoldHeadLastWordPairCount = config.getProperty("pathToGoldHeadLastWordPairCount", pathToGoldHeadLastWordPairCount);
        Parameters.pathToNonReferentialMention = config.getProperty("pathToNonReferentialMention", pathToNonReferentialMention);
        Parameters.pathToNestedRepeatedMention = config.getProperty("pathToNestedRepeatedMention", pathToNestedRepeatedMention);
        Parameters.PreWordCount = config.getProperty("PREWORDCOUNT", PreWordCount);

        useGoldMentions = config.getBoolean(IllinoisConstants.USE_GOLD_MENTIONS);
        annotationFormat = config.getString(IllinoisConstants.ANNOTATION_FORMAT);
        outputFormat = config.getString(IllinoisConstants.OUTPUT_FORMAT);
        resultFormat = config.getString(IllinoisConstants.RESULT_FORMAT);
        corefClassifier = null;
        pronounClassifier = null;

        if (aceCorefModel != null) {
            corefClassifier = new aceCorefSPLearner(aceCorefModel + ".lc", aceCorefModel + ".lex");
        }

        if (corefClassifier == null) {
            corefClassifier = new aceCorefSPLearner();
        }

        mentionDecoder
                = new ExtendHeadsDecoder(new MDExtendHeads(),
                        new BIODecoder(new MentionDetectorMyBIOHead()));
        mentionTyper = new MTypePredictor();

        decoderPronouns = new BestLinkDecoderPronouns(corefClassifier, pronounClassifier);
        decoderPronouns.setThreshold(corefThreshold);
        decoderPronouns.setPronounThreshold(pronounThreshold);

        initParams(config);
        gazetteerManager = GazetteerViewGenerator.gazetteersInstance;
    }

    /**
     * Requires Sentences, POS and Chunk fields to be set.
     *
     *
     *
     * @see
     * adept.module.IDocumentListProcessor#process(adept.common.DocumentList,
     * adept.common.HltContentContainer)
     */
    @Override
    public HltContentContainer process(DocumentList documentList,
            HltContentContainer hltContentContainer) {

//		instead, use DOcFromTA method of DocPlainText?
//		For 
//		DocFromTextLoader loader = new DocFromTextLoader(mentionDecoder, mentionTyper);
        Iterator<Document> docIterator = documentList.iterator();
        List<Doc> docPlainTextList = new ArrayList<Doc>();
        while (docIterator.hasNext()) {
            Document document = docIterator.next();
            TextAnnotation ta = IllinoisUtils.convertAdeptDocHccToTextAnnotation(document, hltContentContainer, this.tokenizerType);
            if (ta == null) {
                docPlainTextList.add(null);
            } else {
                ta.addView(this.gazetteerManager);

                DocPlainText doc = new DocPlainText();
                doc.loadFromTA(ta);

                List<Mention> predMents = getPredMents(doc);
                doc.setPredictedMentions(predMents);

                docPlainTextList.add(doc);
            }
        }

		//    	//TODO: make sure the corefConfigPath is included in the class path
        //        String corefConfigPath = "AcePlainTextConfig";
        try {
            processDocumentList(docPlainTextList);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

        docIterator = documentList.iterator();
        //HltContentContainer container= new HltContentContainer();
        List<Coreference> corefListOut = new ArrayList<Coreference>();
        int idx = 0;
        while (docIterator.hasNext()) {
            Document document = docIterator.next();
            Doc doc = docPlainTextList.get(idx++);
            if (doc != null) {
                HltContentContainer ret;
                try {
                    ret = addIllinoisCoreferenceToHltContent(document, doc);
                    System.out.println("coref: " + ret.getCoreferences().get(0).getResolvedMentions().get(0).getCharOffset().getBegin());
                    corefListOut.add(ret.getCoreferences().get(0));
                } catch (AdeptException e) {
                    e.printStackTrace();
                    if (this.failOnException) {
                        System.exit(-1);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                    if (this.failOnException) {
                        System.exit(-1);
                    }
                }
            }
        }

        hltContentContainer.setCoreferences(corefListOut);
        return hltContentContainer;
    }

    private List<Mention> getPredMents(DocPlainText doc) {
        List<Mention> results = new ArrayList<Mention>();

	    //Does the decoder need to be reset before reusing?
        // note that something here loads some very large gazetteers...
        MentionSolution predMents = mentionDecoder.decode(doc);

	    //System.err.println("Mentions detected:\n" + predMents);
        for (Mention m : predMents.getMentions()) {
            String mType = mentionTyper.discreteValue(m);
            m.setType(mType);
            String eType = EntityTypeFeatures.getEType(m);
            m.setEntityType(eType);

            results.add(m);
        }
        return results;
    }


    /*
     * (non-Javadoc)
     * 
     * @see
     * adept.module.IDocumentListProcessor#processAsync(adept.common.DocumentList
     * , adept.common.HltContentContainer)
     */
    @Override
    public long processAsync(DocumentList documentList,
            HltContentContainer hltContentContainer) {
        // TODO Auto-generated method stub
        return 0;
    }

    /*
     * (non-Javadoc)
     * 
     * @see adept.module.IDocumentProcessor#process(adept.common.TextDocument,
     * adept.common.HltContentContainer)
     */
    @Override
    public HltContentContainer process(Document document,
            HltContentContainer hltContentContainer) {
        DocumentList documentList = new DocumentList();
        documentList.add(document);
        return process(documentList, hltContentContainer);
    }

    /*
     * (non-Javadoc)
     * sentenceListOut
     * @see
     * adept.module.IDocumentProcessor#processAsync(adept.common.TextDocument,
     * adept.common.HltContentContainer)
     */
    //TODO: Implement this function Later
    @Override
    public long processAsync(Document document,
            HltContentContainer hltContentContainer) {
        // TODO Auto-generated method stub
        return 0;
    }

    /*
     * (non-Javadoc)
     * 
     * @see adept.module.IDocumentProcessor#tryGetResult(long,
     * adept.common.HltContentContainer)
     */
    @Override
    public Boolean tryGetResult(long requestId,
            HltContentContainer hltContentContainer) {
        // TODO Auto-generated method stub
        return null;
    }

	// Helper function
    private HltContentContainer addIllinoisCoreferenceToHltContent(Document document, Doc d) throws AdeptException, IOException {
        HltContentContainer hltContentContainerOut = new HltContentContainer();
        List<Entity> entityListOut = new ArrayList<Entity>();
        List<EntityMention> entityMentionListOut = new ArrayList<EntityMention>();
        List<Coreference> corefListOut = new ArrayList<Coreference>();
        long entitySequenceId = 0, entityMentionSequenceId = 0, corefSequenceId = 0, neSequenceId = 0;

        //TODO: Check which TokenzierType we should use
        TokenStream tokenStream = document.getTokenStream(tokenizerType);
//		TokenStream tokenStream = 
//				IllinoisUtils.createTokenStream(document ); 
////												d.getWords().toArray(new String[d.getWords().size()]), 
////												d.getTextAnnotation(),
////												document.getValue());
        ChainSolution<Mention> corefChains = d.getCorefChains();

		// Create Entity
        for (Set<Mention> mentionSet : corefChains.getChains()) {
            Mention canonicalMention = pickCanonicalMention(mentionSet);
            // TODO: Check to avoid offset error
            int start = canonicalMention.getExtent().getStartWN();
            int end = canonicalMention.getExtent().getEndWN();
            if (end >= tokenStream.size()) {
                String errMsg = "Error: Coref token number " + end + " >= TokenStream size " + tokenStream.size() + " for mention "
                        + IllinoisDiscoursePrintHelper.printMention(canonicalMention);

                IllinoisPrintHelper.showTextAnnotation(d.getTextAnnotation(), System.err);
                logger.error(errMsg);

                IllinoisUtils.showTokenRepresentations(d.getTextAnnotation().getTokens(), tokenStream, System.err);

                throw new AdeptException(errMsg);
            }
            EntityMention canonicalEntityMention = new EntityMention(neSequenceId++,
                    new TokenOffset(start, end), tokenStream);

            String canonicalEntityType = translateEntityType(canonicalMention.getEntityType());
            canonicalEntityMention.setMentionType(mentionTypeFactory.getType(translateMentionType(canonicalMention.getType())));
            canonicalEntityMention.setEntityType(entityTypeFactory.getType(canonicalEntityType));

            /**
             * create the entity having the canonical mention obtained above
             */
            Entity entity = null;
            entity = new Entity(entitySequenceId++,
                    canonicalEntityMention.getEntityType());
            entity.setCanonicalMentions(canonicalEntityMention);
            if (!entityListOut.contains(entity)) {
                entityListOut.add(entity);
                System.out.println("add entity: " + entity.getEntity());
            } else {
                //System.out.println("#########entity found already#######\n entity id: " + entity.getEntityId());
                for (Entity e : entityListOut) {
                    if (e.equals(entity)) {
                        //System.out.println("Identical entity's ID is: " + e.getEntityId());
                        entity = e;
                        break;
                    }
                }
            }

            /**
             * create mentions corresponding to all the other words in the coref
             * chain
             */
            for (Mention referant : mentionSet) {
                System.out.println("mention: " + referant.getCleanText() + " --- offset: " + referant.getExtent().getStart() + ", " + referant.getExtent().getEnd() + " --- id: " + referant.getEntityID());
                int referantStart = referant.getExtent().getStartWN();
                int referantEnd = referant.getExtent().getEndWN();

                EntityMention entityMention = new EntityMention(entityMentionSequenceId++,
                        new TokenOffset(referantStart, referantEnd), tokenStream);
                String referantMentionType = translateMentionType(referant.getType());
                //				String referantEntityType = translateEntityType(referant.getEntityType());
                Type entityType = entityTypeFactory.getType(canonicalEntityType);

                if (null == entityType) {
                    entityType = new Type(IllinoisConstants.OTHER_ENTITY_TYPE);
                }
                entityMention.setEntityType(entityType);
//                System.out.println("entity mention: " + tokenStream.getTextValue());
                entityMention.setMentionType(mentionTypeFactory.getType(referantMentionType));
                entityMention.addEntityConfidencePair(entity.getEntityId(), 1.0F);
                if (!entityMentionListOut.contains(entityMention)) {
                    entityMentionListOut.add(entityMention);
                }
            }
        }

        /**
         * create the coreference container
         */
        Coreference corefOut = new Coreference(corefSequenceId++);
        corefOut.setEntities(entityListOut);
        corefOut.setResolvedMentions(entityMentionListOut);
        corefListOut.add(corefOut);

        hltContentContainerOut.setCoreferences(corefListOut);
        return hltContentContainerOut;
    }

    // TODO: improve this function to pick a better representative mention to a cluster
    private Mention pickCanonicalMention(Set<Mention> mentionSet) {
        ArrayList<Mention> sortedList = new ArrayList<Mention>(mentionSet);
        Collections.sort(sortedList);
        for (Mention m : sortedList) {
            if (m.getType().equals("NAM")) {
                return m;
            }
        }
        for (Mention m : sortedList) {
            if (m.getType().equals("NOM")) {
                return m;
            }
        }
        return sortedList.get(0);
    }

    private String translateMentionType(String mentionType) {
        if (mentionType.equals("NAM")) {
            return "NAME";
        }
        if (mentionType.equals("PRO")) {
            return "PRONOUN";
        }
        return "NOMINAL";
    }

    private String translateEntityType(String entityType) {
        // TODO: GPE?
        String[] validEntityTypeNamePool = {"PER", "ORG", "LOC", "GPE"};
        for (String validEntityTypeName : validEntityTypeNamePool) {
            if (entityType.equals(validEntityTypeName)) {
                return entityType;
            }
        }
        if (entityType.equalsIgnoreCase("unknown")) {
            return "UNKNOWN";
        }
        return "OTHER";
    }

    /**
     * Functions for testing.
     *
     */
    /**
     *
     */
    private static void outputCoreferenceContain(HltContentContainer container) {
        List<Coreference> coreferences = container.getCoreferences();
        for (Coreference corefGraph : coreferences) {
            System.out.println("Coreference Result : " + corefGraph.getCoreferenceId());
            for (Entity e : corefGraph.getEntities()) {
                System.out.println("Entity:" + e.getEntityId());
                IType t = e.getEntityType();
                if (null != t) {
                    System.out.println("\t Type: " + e.getEntityType().getType());
                } else {
                    System.out.println("\t Type: NONE");
                }

                System.out.println("\t CanonicalMention: " + e.getCanonicalMention().getValue() + " : " + e.getCanonicalMention().getMentionType().getType());
                System.out.println("\t Referant: ");
                for (EntityMention em : corefGraph.getResolvedMentions()) {
                    if (em.getEntityIdDistribution().containsKey(e.getEntityId())) {
                        System.out.println("\t\t " + em.getValue() + " : " + em.getMentionType().getType() + " , " + em.getEntityType().getType());
                    }
                }
            }

        }
    }

    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
//		String config = "/shared/austen/DEFT/UIUC/deft/resources/uiuc/llmTestConfig.txt";
//        String corpusPath = "/shared/corpora/corporaWeb/deft/eng/LDC2013E19_DEFT_Narrative_Text_Source_Data_R1/data/newswire";
        String config = "/Users/ting/NetBeansProjects/deft2015/ihmc/src/main/resources/us/albany/cubism/conf/llmTestConfig.txt";
        String corpusPath = "/Users/ting/NetBeansProjects/deft2015/ihmc/src/main/resources/us/albany/cubism/Data";
//		//TODO: To figure out how to read configFile

//        if (args.length != 2) {
//            System.err.println("Usage: " + NAME + " <config> <inputfile>");
//            System.err.println("    NOTE: if the directory containing the config file is on the classpath, "
//                    + "only the filename needs to be given. The input file requires either the absolute path "
//                    + "or the local path from the directory in which you run this process.");
//            System.exit(-1);
//        }

		//        String config = "/shared/austen/DEFT/UIUC/deft/resources/uiuc/llmTestConfig.txt";
        //        String corpusPath = "/shared/corpora/corporaWeb/deft/eng/LDC2013E19_DEFT_Narrative_Text_Source_Data_R1/data/newswire";
        //        
        //        String fileName = "AFP_ENG_20071202.0475.xml";
        //        String inputFile = corpusPath + "/" + fileName;
//        String corefConfigFile = args[0];
//        String inputFile = args[1];
        String corefConfigFile = config;
        String inputFile = corpusPath;

		//        String corefConfigPath = "AcePlainTextConfig";
		//        String fileName = "AFP_ENG_20071202.0475.xml";
        //
        //        String inputFile = corpusPath + "/" + fileName;
        IllinoisCoreferenceResolver illinoisCoreferenceResolver = new IllinoisCoreferenceResolver(); // new IllinoisCoreferenceResolver( corefConfigPath );
        illinoisCoreferenceResolver.activate(corefConfigFile);

        HltContentContainer hltContentContainer = new HltContentContainer();
        Document adeptDocument = DocumentMaker.getInstance().createDefaultDocument(
                "001", null, "Text", null, "English", inputFile, hltContentContainer, TokenizerType.UIUC);
        System.out.println("Start Testing Reading Data:");
        System.out.println(adeptDocument.getDocId() + " " + adeptDocument.getDocType()
                + " " + adeptDocument.getHeadline());
        System.out.println("Value: \n" + adeptDocument.getValue());

		// Starting Performing Coreference Resolution:
//		MentionDecoder mdDec =
//				new ExtendHeadsDecoder(new MDExtendHeads(),
//						new BIODecoder(new MentionDetectorMyBIOHead()));
//		MTypePredictor mTyper = new MTypePredictor();
//
//		DocFromTextLoader loader = new DocFromTextLoader(mdDec, mTyper);
//		Doc doc = loader.loadDoc(adeptDocument.getValue());
//		List<Doc> docs = new ArrayList<Doc>();
//		docs.add(doc);
//		System.out.println("Start Testing: call coref resolver inner layer functionality:");
//		IllinoisCorefHandler.TestCoref(docs, corefConfigFile);
//		for(Doc d: docs){
//			System.out.println("Output from Illinois Coref");
//			System.out.println(d.getTextAnnotation().getView("PRED_COREF_VIEW"));
//			System.out.println("===============");
//			// Test addIllinoisCoreferenceHltContent
//			HltContentContainer container = 
//					illinoisCoreferenceResolver.addIllinoisCoreferenceToHltContent(adeptDocument, d);
//			System.out.println("Output from HLT Container : ");
//			System.out.println("===============");
//			outputCoreferenceContain(container);
//			System.out.println("===============");
//		}
//		
        System.out.println("#### testing IllinoisCoreferenceResolver.process():");

        // Test functionality of "process"
        System.out.println("Start Testing Function process():");
        HltContentContainer ret = illinoisCoreferenceResolver.process(adeptDocument, hltContentContainer);
        outputCoreferenceContain(ret);
    }

    public void Train(Learner classifier, Parser trainingParser,
            int trainingRounds, String trainSampleFilename) throws Exception {
        logger.info("Training...");
        classifier.forget();
        BatchTrainer btTrain = new BatchTrainer(classifier, trainingParser, 100000);
        classifier.setLexicon(btTrain.preExtract(trainSampleFilename));
        btTrain.train(trainingRounds);
        logger.info("Done training; saving the classifier");
        classifier.save();
        logger.info("Done saving the classifier");
    }

    private void processDocumentList(List<Doc> docs) throws Exception {
        if (corefClassifier == null) {
            logger.error("Error: no coreference classifier");
        }

        List<ChainSolution<Mention>> preds = new ArrayList<ChainSolution<Mention>>();
        RemoveSingletonProcessing removeSingleton = new RemoveSingletonProcessing();

        NestedPostProcessing removeNested = new NestedPostProcessing();
        for (Doc d : docs) {
            if (d == null) {
                continue;
            }

            logger.info("document " + d.getDocID() + " has " + d.getMentions().size() + " mentions.");
            d.setUsePredictedMentions(!this.useGoldMentions);
            ChainSolution<Mention> presol = decoderPronouns.decode(d);
            ChainSolution<Mention> sol = presol;
            if (getAnnotationFormat().equals("Ontonotes")) {
                sol = removeSingleton.decode(d, removeNested.decode(d, presol));
            }
            preds.add(sol);
            d.setPredEntities(sol);
            if (outputFormat.contains("Ontonotes")) {
                CoNLLScorer scorer;
                if (outputDirName == null) {
                    scorer = new CoNLLScorer(d.getBaseFilename() + ".column.coref", null);
                } else {
                    scorer = new CoNLLScorer(outputDirName + "/" + d.getBaseFilename() + ".column.coref", null);
                }
                scorer.getScore(sol, d);
            }
            if (outputFormat.contains("Ace")) {
                FileOutputStream fop = null;
                String fileName = d.getBaseFilename() + "ace.coref";
                if (outputDirName != null) {
                    fileName = outputDirName + "/" + d.getBaseFilename() + ".ace.coref";
                }

                try {
                    File directory = new File(new File(fileName).getParent());
                    if (!directory.exists()) {
                        if (directory.mkdir() == false) {
                            System.err.println("Error in creating directory " + directory.getName());
                        } else {
                            System.err.println("Creating directory " + directory.getName());
                        }
                    }

                    fop = new FileOutputStream(new File(fileName));
                    fop.write(d.toAnnotatedString(false, false, false, true).getBytes());
                    fop.flush();
                    fop.close();
                } catch (IOException e) {
                    e.printStackTrace();
                } finally {
                    try {
                        if (fop != null) {
                            fop.close();
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
            if (outputFormat.contains("D3")) {
                OutputD3Scorer scorer;
                scorer = new OutputD3Scorer(outputDirName);
                scorer.getScore(null, sol);
            }
        }

        // Scoring:
        if (resultFormat.equals("BCub")) {
            List<ChainSolution<Mention>> keys = new ArrayList<ChainSolution<Mention>>();
            for (Doc d : docs) {
                keys.add(new CorefKeyDecoder().decode(d));
            }
            BCubedScorer scorer = new BCubedScorer();
            System.out.println(scorer.getScore(keys, preds));
        }
    }

//	private static List<BestLinkDecoderPronouns> decoders=null;
    public void initParams(UiucModuleConfig config_) {

        Parameters.Perceptron_learningRate = config_.getDouble("PERCEPTRON.LearningRate");
        logger.info("PERCEPTRON Learning Rate " + Parameters.Perceptron_learningRate);

        Parameters.Perceptron_thickness = config_.getDouble("PERCEPTRON.Thickness");
        logger.info("PERCEPTRON Thickness " + Parameters.Perceptron_thickness);

        Parameters.Perceptron_round = config_.getInt("PERCEPTRON.Round");
        logger.info("PERCEPTRON ROUND " + Parameters.Perceptron_round);

        corefThreshold = config_.getDouble("CorefThreshold");
        logger.info("COREF Threshold: " + corefThreshold);

		//	             		PronounThreshold = config_.getDouble("PronounThreshold");
        //	             		logger.info ("PRONOUN Threshold: " + PronounThreshold);
        outputDirName = config_.getString("OutputDirName");
        logger.info("result files: " + outputDirName);

		//	             		OntonotesCorefModel = config_.getString ("OntonotesCorefModel");
        //	             		logger.info ("OntonotesCorefModel: " + OntonotesCorefModel);
        //
        //	             		OntonotesProModel = config_.getString ("OntonotesProModel");
        //	             		logger.info ("OntonotesProModel: " + OntonotesProModel);
        //	             		AceCorefModel = config_.getString ("AceCorefModel");
        //	             		logger.info ("AceCorefModel: " + AceCorefModel);
        //
        //
        //	             		AceProModel = config_.getString ("AceProModel");
        //	             		logger.info ("AceProModel: " + AceProModel);
		//	             		OutputFormat = (config_.getString ("OutputFormat"));
        //	             		logger.info ("OutputFormat: " + OutputFormat);
        setAnnotationFormat(config_.getString("AnnotationFormat"));
        logger.info("AnnotationFormat: " + getAnnotationFormat());

		//	             		UseGoldMentions = config_.getBoolean("UseGoldMentions");
        //	             		logger.info ("UseGoldMentions: " + UseGoldMentions);
        //
        //	             		setCuratorHost(config_.getString ("CuratorHost"));
        //	             		logger.info ("CuratorHost: " + getCuratorHost());
        //
        //	             		setCuratorPort(Integer.valueOf(config_.getInt ("CuratorPort")));
        //	             		logger.info ("CuratorPort: " + getCuratorPort());
        if (getAnnotationFormat() == null) {
            logger.error("Please specify annotation format (Ontonotes or Ace)");
        }
    }

    public void setAnnotationFormat(String annotationFormat) {
        annotationFormat = annotationFormat;
    }

    public String getAnnotationFormat() {
        return annotationFormat;
    }

    /**
     * Applies the Coreference system to a set of documents with mention info
     * present and generates both an output file and a score.
     *
     * Expects a list of Coref Doc objects with gold standard mentions provided.
     *
     * @param docs
     * @throws AdeptException
     * @throws IOException
     * @throws Exception
     */
    public String evaluatePerformance(List<Doc> docs, String outputDirName) throws AdeptException, IOException {
        String result = null;

        if (corefClassifier == null) {
            String msg = "ERROR: " + NAME + ".evaluatePerformance(): no coreference classifier -- did you initialize correctly?";
            logger.error(msg);
            throw new AdeptException(msg);
        }

        if (outputDirName == null) {
            String msg = "ERROR: " + NAME + ".evaluatePerformance(): null output directory.";
            logger.error(msg);
            throw new AdeptException(msg);
        }

        BestLinkDecoderPronouns decoder = new BestLinkDecoderPronouns(corefClassifier, pronounClassifier);
        decoder.setThreshold(corefThreshold);
        decoder.setPronounThreshold(pronounThreshold);
        List<ChainSolution<Mention>> preds = new ArrayList<ChainSolution<Mention>>();
        RemoveSingletonProcessing removeSingleton = new RemoveSingletonProcessing();
        NestedPostProcessing removeNested = new NestedPostProcessing();
        for (Doc d : docs) {
            logger.info("processing doc with id '" + d.getDocID() + "'...");
            System.out.println(d.getMentions().size());
            d.setUsePredictedMentions(!useGoldMentions);
            ChainSolution<Mention> presol = decoder.decode(d);
            ChainSolution<Mention> sol = presol;
            if (getAnnotationFormat().equals("Ontonotes")) {
                sol = removeSingleton.decode(d, removeNested.decode(d, presol));
            }
            preds.add(sol);
            d.setPredEntities(sol);
            if (outputFormat.contains("Ontonotes")) {
                CoNLLScorer scorer = new CoNLLScorer(outputDirName + "/" + d.getBaseFilename() + ".column.coref", null);
                result = scorer.getScore(sol, d).getScoreString();
            }
            if (outputFormat.contains("Ace")) {
                FileOutputStream fop = null;
                String fileName = d.getDocID() + "ace.coref";
                fileName = outputDirName + "/" + fileName;

                try {
                    File directory = new File(new File(fileName).getParent());
                    if (!directory.exists()) {
                        if (directory.mkdir() == false) {
                            System.err.println("Error in creating directory " + directory.getName());
                        } else {
                            System.err.println("Creating directory " + directory.getName());
                        }
                    }

                    fop = new FileOutputStream(new File(fileName));
                    logger.info("writing processed document to file '" + fileName + "'...");

                    fop.write(d.toAnnotatedString(false, false, false, true).getBytes());
                    fop.flush();
                    fop.close();
                } catch (IOException e) {
                    e.printStackTrace();
                    logger.error(NAME + ".evaluatePerformance(): can't write to file '" + fileName + "': " + e.getMessage());
                    throw e;
                } finally {
                    try {
                        if (fop != null) {
                            fop.close();
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                        logger.error(NAME + ".evaluatePerformance(): can't close file '" + fileName + "': " + e.getMessage());
                        throw e;
                    }
                }
            }
            if (outputFormat.contains("D3")) {
                OutputD3Scorer scorer;
                scorer = new OutputD3Scorer(outputDirName);
                result = scorer.getScore(null, sol).getScoreString();
            }
        }

        List<ChainSolution<Mention>> keys = new ArrayList<ChainSolution<Mention>>();
        for (Doc d : docs) {
            keys.add(new CorefKeyDecoder().decode(d));
        }
        BCubedScorer scorer = new BCubedScorer();
        result = scorer.getScore(keys, preds).getScoreString();

        return result;
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

    @Override
    public List<HltContentContainer> process(DocumentList documentList)
            throws AdeptModuleException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public long processAsync(DocumentList documentList)
            throws AdeptModuleException {
        // TODO Auto-generated method stub
        return 0;
    }

}
