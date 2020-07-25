//Sentence.java - uses word objects to generate a random sentence
//CSIS 312-D01

package sentencebuilder;

/**
 *
 * @author kiero
 */

import java.util.Arrays;

public class Sentence {
   Word word = new Word();
   
   public Sentence(){
      
   }
   
   public StringBuilder getSentence(){
      //create StringBuilder object
      StringBuilder sentence = new StringBuilder();
      
      //build sentence
      sentence.append(word.getArticle())
              .append(" ")
              .append(word.getNoun())
              .append(" ")
              .append(word.getVerb())
              .append(" ")
              .append(word.getPreposition())
              .append(" ")
              .append(word.getArticle())
              .append(" ")
              .append(word.getNoun())
              .append(".")
              .append(System.getProperty("line.separator"));
      
      //identify and capitalize first letter
      char capLetter = Character.toUpperCase(sentence.charAt(0));
      
      //replace lowercase letter with uppercase
      sentence.setCharAt(0, capLetter);
      
      //return sentence
      return sentence;
   }
}
