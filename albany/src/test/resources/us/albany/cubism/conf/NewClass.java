import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.FileInputStream;

/**
 *
 * @author jrgiarrusso
 */
public class NewClass {
    public static void readFiles(){
        File file = new File("/Users/ting/ihmc/deft/ihmc/src/main/resources/us/albany/cubism/Data/Source_Corpus_Files_Assessment/XIN_ENG_201002");
                try {
                      BufferedReader br = new BufferedReader( new FileReader( file));
                      
                      String a_line = null;
                      while((a_line = br.readLine()) != null) {
                         System.out.println(a_line);
                      }
                      br.close();

                  } catch (IOException ex) {
                      ;
                  }                
        
    }
    public static void main(String...args){
        readFiles();
    }
}
