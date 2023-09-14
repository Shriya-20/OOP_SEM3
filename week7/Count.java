package week7;

import java.util.Scanner;

public class Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		// TODO Auto-generated method 

				Scanner sc = new Scanner(System.in);

		        // Read the input string from the user
		        System.out.print("Enter a string: ");
		        String str;
		        StringBuilder inputText = new StringBuilder();
		        while (true) {
		            str = sc.nextLine();

		            if (str.equalsIgnoreCase("exit")) {
		                break; // Exit the loop if the user types 'exit'
		            }

		            inputText.append(str);
		            inputText.append('\n'); // Add a newline character to separate lines
		        }

		        // Count characters
		        int charCount = str.length();
		        
		     // Count words
		        String[] words = str.split("\\s+");
		        int wordCount = words.length;

		        // Count lines
		        String[] lines = str.split("\n");
		        int lineCount = lines.length;

		        // Count vowels
		        int vowelCount = countVowels(str);

		        // Display the results
		        System.out.println("Character count: " + charCount);
		        System.out.println("Word count: " + wordCount);
		        System.out.println("Line count: " + lineCount);
		        System.out.println("Vowel count: " + vowelCount);

		    }

		    // Function to count vowels in a string
		    public static int countVowels(String str) {
		        str = str.toLowerCase(); // Convert to lowercase to handle both uppercase and lowercase vowels
		        int count = 0;
		        for (int i = 0; i < str.length(); i++) {
		            char ch = str.charAt(i);
		            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
		                count++;
		            }
		        }
		        return count;
		    }

	}


