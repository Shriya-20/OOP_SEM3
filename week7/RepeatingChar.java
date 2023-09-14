package week7;

import java.util.Scanner;

public class RepeatingChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        // Input the sentence
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        // Input the word to be replaced
        System.out.print("Enter the word to replace: ");
        String wordToReplace = scanner.nextLine();

        // Input the replacement string
        System.out.print("Enter the replacement string (repeating characters): ");
        String replacement = scanner.nextLine();

        // Replace all occurrences of the word with the repeating characters
        String modifiedSentence = replaceWordWithRepeatingChars(sentence, wordToReplace, replacement);
        
     // Display the modified sentence
        System.out.println("Modified Sentence: " + modifiedSentence);

        scanner.close();
    }

    public static String replaceWordWithRepeatingChars(String sentence, String wordToReplace, String replacement) {
        // Use the replaceAll() method to replace all occurrences of the word with the replacement string
        return sentence.replaceAll(wordToReplace, replacement);
    }

	

}
