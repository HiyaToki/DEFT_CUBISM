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
import adept.common.NumberPhrase;
import adept.common.NumericValue;
import adept.common.Token;
import adept.common.TokenOffset;
import adept.common.TokenStream;
import adept.common.TokenizerType;
import adept.common.TranscriptType;
import adept.kbapi.KB;
import adept.kbapi.KBNumber;
import adept.kbapi.KBUpdateException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mehrdad
 */
//public class TestInsertSentiment extends KBUnitM {
public class StrengthKBOp {


    public static ArrayList insertStrength(String str, Document document, KB kb) {
        NumericValue strengthNumericValue = null;
        KBNumber kbStrength = null;
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
            Logger.getLogger(StrengthKBOp.class.getName()).log(Level.SEVERE, null, ex);
        }
        ArrayList strengthPair = new ArrayList();
        strengthPair.add(strengthNumericValue);
        strengthPair.add(kbStrength);
//        return new Pair(strengthNumericValue, kbStrength);
        return strengthPair;
    }


}
