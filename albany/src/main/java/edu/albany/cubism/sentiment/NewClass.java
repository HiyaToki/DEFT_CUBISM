/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.albany.cubism.sentiment;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
/**
 *
 * @author jrgiarrusso
 */
public class NewClass {
    public static void readFiles() {
        File file = new File("/Users/ting/ihmc/deft/ihmc/src/main/resources/us/albany/cubism/conf/NewClassFile");

                try {
                      BufferedReader br = new BufferedReader(new FileReader(file));
                      String a_line = null;
                      while((a_line = br.readLine()) != null) {
                         System.out.println(a_line);
                      }
                      br.close();

                  } catch (IOException ex) {
                      ;
                  }                
    }
    public static void main(String...args) {
        readFiles();
    }
}
