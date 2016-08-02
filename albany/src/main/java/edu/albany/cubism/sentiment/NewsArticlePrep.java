/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.albany.cubism.sentiment;

import edu.albany.cubism.sentiment.LoadQuerys.LoadedQuery;
import edu.albany.cubism.sentiment.LoadQuerys.QueryInput;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import javax.xml.parsers.ParserConfigurationException;
import edu.albany.cubism.relation.Utterance;
import edu.albany.cubism.util.Settings;

/**
 *
 * @author jrgiarrusso
 */
public class NewsArticlePrep {

    public static void main(ArrayList<QueryInput> queryArrayList,  HashMap<String, String> assessDocsFullHash, ArrayList<Utterance> utts) throws InterruptedException, IOException, ParserConfigurationException, SQLException {
        
        NewswireParse np = new NewswireParse();
        ForumParse fp = new ForumParse();
        
//        new NewswireDependencies().getNewsSentenceFile(queryArrayList, fp.openForumText(queryArrayList), assessDocsFullHash);
        String dataType=Settings.getValue("SentiDataType");
        
        if (dataType.contains("newswire"))
           new NewswireDependencies().getNewsSentenceFile(queryArrayList, np.openOutputText(queryArrayList), assessDocsFullHash);
        
        if (dataType.contains("forum"))
           new ForumDependencies().getNewsSentenceFile(queryArrayList, fp.openForumText(queryArrayList), assessDocsFullHash);

    }

    public ArrayList<ForumDependencies.CalculusInfo> extractSentiment(ArrayList<QueryInput> queryArrayList,  HashMap<String, String> assessDocsFullHash, ArrayList<Utterance> utts) throws InterruptedException, IOException, ParserConfigurationException, SQLException {
        
        NewswireParse np = new NewswireParse();
        ForumParse fp = new ForumParse();
        ArrayList sentiments = new ArrayList();
        
        
//        new NewswireDependencies().getNewsSentenceFile(queryArrayList, fp.openForumText(queryArrayList), assessDocsFullHash);
        String dataType=Settings.getValue("SentiDataType");
        
        if (dataType.contains("newswire"))
           return new NewswireDependencies().getNewsSentenceFile(queryArrayList, np.openOutputText(queryArrayList), assessDocsFullHash);
        
        if (dataType.contains("forum"))
           return new ForumDependencies().getNewsSentenceFile(queryArrayList, fp.openForumText(queryArrayList), assessDocsFullHash);
        return sentiments;
    }

}
