//SentenceBuilder.java demonstrates Word and Sentence classes
//CSIS 312-D01

package sentencebuilder;

/**
 *
 * @author kiero
 */
public class SentenceBuilder {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      //output student and assignment
      System.out.println("Kieron Roberson – Assignment 04");
      
      Sentence sentence = new Sentence();
      
      for(int i = 1; i <= 20; i++){
      System.out.printf("%d. %s%n", i, sentence.getSentence());
      }
   }
   
}
