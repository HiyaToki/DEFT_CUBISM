/*******************************************************************************
 * Raytheon BBN Technologies Corp., March 2013
 * 
 * THIS CODE IS PROVIDED "AS IS" WITHOUT WARRANTY OF ANY KIND, EITHER EXPRESS
 * OR IMPLIED, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF
 * MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE.
 * 
 * Copyright 2013 Raytheon BBN Technologies Corp.  All Rights Reserved.
 ******************************************************************************/
// Next line is site-specific.
package edu.albany.cubism.ie;


import java.io.IOException;
import java.io.File;
import java.util.List;

import edu.uiuc.chunk.IllinoisChunker;
import edu.uiuc.common.IllinoisConstants;
import edu.uiuc.common.UiucModuleConfig;
import edu.uiuc.nlp.IllinoisSentenceSegmenter;
import edu.uiuc.pos.IllinoisPosTagger;

import adept.common.AdeptException;
import adept.common.ContentType;
import adept.common.Document;
import adept.common.HltContentContainer;
import adept.common.Sentence;
import adept.common.SyntacticChunk;
import adept.common.TokenStream;
import adept.common.TokenizerType;
import adept.module.AdeptModuleException;
import adept.utilities.CommandLineApp;

//import edu.uiuc.discourse.IllinoisCoreferenceResolver;


// TODO: Auto-generated Javadoc
/**
 * The Class IllinoisCoreferenceResolverApp.
 */
public class IllinoisCoreferenceResolverApp  extends CommandLineApp
{
	// The only site-specific members are config file and processor instance.
	private static String theAlgorithmConfig = "target/classes/edu/uiuc/discourse/IllinoisCorefConfig.xml"; // "AcePlainTextConfig.xml";
	private static IllinoisCoreferenceResolver theAlgorithmProcessor;// = new IllinoisCoreferenceResolver(moduleConfigFilePath);
	private static final String NAME = IllinoisCoreferenceResolverApp.class.getCanonicalName();

	private IllinoisChunker chunker;
	private IllinoisPosTagger posTagger;
	private IllinoisSentenceSegmenter iss;
	private TokenizerType tokenizerType;
	//private Logger logger = LoggerFactory.getLogger( UiucDiscourseRegressionTest.class );
	private boolean failOnException;
        HltContentContainer hlt_con = null;
	/**
	 * Initialize.
	 */
	public static void main(String[] args)
	{
//                System.out.println("args1: " + args[0]);
		new IllinoisCoreferenceResolverApp().Run(args, theAlgorithmConfig);
	}
	
	// The rest is applicable to any subclass of CommandLineApp.
	protected void doActivate(String algorithmConfig)
	{
		try {
			File f = new File( algorithmConfig);
			if ( !f.exists())
			{
				// Hack for Eclipse
				System.out.println("Config file not found:  " + algorithmConfig);
				algorithmConfig = "edu/uiuc/discourse/" + algorithmConfig;
				System.out.println("Hack for Eclipse:  " + algorithmConfig);
				f = new File(algorithmConfig);
			}
			if ( !f.exists())
			{
				// Hack for command line
				algorithmConfig = theAlgorithmConfig;				
				System.out.println("Config file not found:  " + f.getAbsolutePath());
				algorithmConfig = "target/classes/us/albany/cubism/ie/" + algorithmConfig; //switch path by TL 11/05/2015
				//algorithmConfig = "../config/" + algorithmConfig;
				f = new File(algorithmConfig);
				System.out.println("Hack for command line:  " + algorithmConfig);
			}
			if ( !f.exists()) algorithmConfig = theAlgorithmConfig;
			//if ( !f.exists()) throw new RuntimeException("Config not found: " + algorithmConfig);
            // configFilePath is not an XML file. Cannot activate.
			theAlgorithmProcessor = new IllinoisCoreferenceResolver();
			iss = new IllinoisSentenceSegmenter();
			posTagger = new IllinoisPosTagger();
			chunker = new IllinoisChunker();

			UiucModuleConfig config = new UiucModuleConfig( algorithmConfig );

			failOnException = config.getBoolean( IllinoisConstants.FAIL_ON_EXCEPTION );
			tokenizerType = TokenizerType.valueOf( config.getString( IllinoisConstants.TOKENIZER_TYPE ) );
			
			chunker.activate( algorithmConfig );
			posTagger.activate( algorithmConfig );
			iss.activate( config );
			theAlgorithmProcessor.activate(algorithmConfig);
//                        theAlgorithmProcessor.
			//System.out.println("Activated:  " + algorithmConfig);
		} catch (AdeptModuleException e) {
			e.printStackTrace();
			if ( failOnException )
				System.exit( -1 );
		} catch (IOException e) {
			e.printStackTrace();
			if ( failOnException )
				System.exit( -1 );
		}
	}
	
	protected void doDeactivate()
	{
		try {
			theAlgorithmProcessor.deactivate();
		} catch (AdeptModuleException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * If this method is called and HltContentContainer has sentences, POS, and syntactic chunks, these will be used. 
	 * If HltContentContainer is null, this method populates these views using Illinois NLP tools. 
	 * 
	 * Creates the hlt content container with coreference output. 
	 *
	 * @param document the document
	 * @return the hlt content container
	 */
	protected HltContentContainer doProcess(Document document, HltContentContainer hltContentContainer)
	{
		try {
			// create the HltContentContainer object
			if(hltContentContainer==null) hltContentContainer = new HltContentContainer();
			hltContentContainer = iss.tokenizeDocument( document );
			if(hltContentContainer==null || !checkRequiredViews( document, hltContentContainer ) ) 
			{
				hltContentContainer = new HltContentContainer();
			
				TokenStream tokenStream = new TokenStream( tokenizerType, null, "English", null, ContentType.TEXT, document);
//				tokenStream.setDocument( document );
				document.addTokenStream( tokenStream );

				List<Sentence> sentences = iss.getSentences( document.getValue(), document.getTokenStream( tokenizerType ) );
				hltContentContainer.setSentences(sentences);

				try {
					HltContentContainer posOutput = posTagger.process( document, hltContentContainer );
				} catch (AdeptException e1) {
					e1.printStackTrace();					
					throw e1;
				}

				HltContentContainer initChunkerOut = null;
				try {
					initChunkerOut = chunker.process( document, hltContentContainer );
				} catch (AdeptModuleException e1) {
					e1.printStackTrace();
					throw e1;
				}
			}			
			this.hlt_con = theAlgorithmProcessor.process(document, hltContentContainer);
			//logger.info("hltContentContainer populated with sentences, POS tags and Entity mentions");
			return this.hlt_con;
		} catch (Exception e) {
			e.printStackTrace();
			if ( failOnException )
				System.exit( -1 );
		}
		return null;
	}
        
        public HltContentContainer getHltCon() {
            return this.hlt_con;
        }
	
	/** 
	 * determine whether or not prerequisites are satisfied.  If they are, make sure tokenization type is set
	 *   to whatever is provided, rather than what is specified in the config file.
	 *   
	 * @param hltContentContainer
	 * @return
	 */

	private boolean checkRequiredViews(Document doc, HltContentContainer hcc ) 
	{
		boolean isSentences = false;
		boolean isTokenizerTypePresent = false;
		boolean isPos = false;
		boolean isChunk = false;
		
		if ( null != hcc.getSentences() && !hcc.getSentences().isEmpty() )
			isSentences = true;
		
		if ( null != hcc.getPartOfSpeechs() && !hcc.getPartOfSpeechs().isEmpty() )
			isPos = true;
		
		if ( null != hcc.getSyntacticChunks() && !hcc.getSyntacticChunks().isEmpty() )
			isChunk = true;
				
		boolean isHigherLevelAnnotationPresent = isSentences && isPos && isChunk;
		
		if ( null != doc.getTokenStream(tokenizerType) )
			isTokenizerTypePresent = true;
		else if ( isHigherLevelAnnotationPresent && !doc.getTokenStreamList().isEmpty() )
		{
			isTokenizerTypePresent = true;
			
			TokenizerType newTokenizerType = doc.getTokenStreamList().get( 0 ).getTokenizerType();

			System.out.println( NAME + ".checkRequiredViews(): tokenizer type specified in config file (" + tokenizerType.name() + 
					") not present, but other annotations are. Setting tokenizer type to '" + newTokenizerType.name() + "'." );
			
			tokenizerType = newTokenizerType;
		}	
		return ( isTokenizerTypePresent && isHigherLevelAnnotationPresent );
	}

}
