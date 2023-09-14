import java.util.Scanner;

public class repeating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        
        System.out.print("Enter the word to replace: ");
        String wordToReplace = sc.nextLine();

        System.out.print("Enter the replacement string: ");
        String replacement_string = sc.nextLine();
        
        String newSentence=sentence.replaceAll(wordToReplace, replacement_string);
        
        //sentence doesn't change. its immutable.
        System.out.println("New Sentence: " + newSentence);

    }

    

	

}