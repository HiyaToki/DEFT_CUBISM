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
package us.ihmc.cubism.sociolinguistics;

import adept.common.Document;
import adept.common.HltContentContainer;
import adept.module.AdeptModuleException;
import adept.utilities.RegressionTest;

import java.io.FileNotFoundException;
import java.io.IOException;

// TODO: Auto-generated Javadoc

/**
 * The Class CubismBeliefExtractorRegressionTest.
 */
public class CubismSociolinguisticSentimentRegressionTest extends RegressionTest {


    private static String configFilename = "CubismSociolinguisticSentimentRegressionTest.xml";
    private static SentimentExtractor theAlgorithmProcessor = new SentimentExtractor();

    public void doDeactivate() {
    }

    public void doActivate(String workingDirectory, String algorithmConfig) {

        try {
            System.out.println("Algorithm Config: " + algorithmConfig);
            theAlgorithmProcessor.activate(algorithmConfig);
            System.out.println("Benchmark Working Directory: " + workingDirectory);
        } catch (AdeptModuleException e) {
            // TODO Auto-generated catch block

            System.out.println("FAIL!");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.out.println("FAIL!");
        }
    }

    /**
     * Initialize.
     */

    public static void main(String[] args) {

        System.out.println("Current Directory: " + System.getProperty("user.dir"));
        String packageName = new Object() {
        }.getClass().getPackage().getName();
        String packagePath = packageName.replace(".", "/") + "/";

        System.out.println("Package path: " + packagePath);

        try {
            new CubismSociolinguisticSentimentRegressionTest().Run(packagePath, configFilename, args);
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    /**
     * Creates the hlt content container.
     *
     * @param document the document
     * @return the hlt content container
     */
    protected HltContentContainer doProcess(Document document, HltContentContainer hltContentContainer) {
        try {
            // create the HltContentContainer object
            hltContentContainer = new HltContentContainer();
            System.out.println("The document is located at: " + document.getUri());
//            theAlgorithmProcessor.computeTopicalPositioningNetwork(document.getDefaultTokenStream().getTextValue().getBytes());
            return theAlgorithmProcessor.process(document, hltContentContainer);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return hltContentContainer;
    }

}
