//Word.java - generates random words from arrays
//CSIS 312-D01

package sentencebuilder;

/**
 *
 * @author kiero
 */

import java.util.Random;

public class Word {
   //random value variable
   Random wordIndex = new Random();
   private String[] article;
   private String[] noun;
   private String[] verb;
   private String[] preposition;
   
   public Word(){
      String[] article = {"the", "a", "one", "some", "any"};
      this.article = article;
      String[] noun = {"boy", "girl", "dog", "town", "car"};
      this.noun = noun;
      String[] verb = {"drove", "jumped", "ran", "walked", "skipped"};
      this.verb = verb;
      String[] preposition = {"to", "from", "over", "under", "on"};
      this.preposition = preposition;
   }
   
   
   public String getArticle(){
      return this.article[wordIndex.nextInt(5)];
   }
   
   public String getNoun(){
      return this.noun[wordIndex.nextInt(5)];
   }
   
   public String getVerb(){
      return this.verb[wordIndex.nextInt(5)];
   }
   
   public String getPreposition(){
      return this.preposition[wordIndex.nextInt(5)];
   }
   
}
