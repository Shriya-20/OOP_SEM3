import java.util.Scanner;

public class Counting {

	public static void main(String[] args) {
		
				Scanner sc = new Scanner(System.in);

		        
		        System.out.print("Enter a string: ");
		        String str = sc.nextLine();

		        int strlen = str.length();
		        System.out.println("Character count: " + strlen);
		        
		        int wordcount=0;
		        for(int i=0;i<strlen;i++) {
					if(str.charAt(i)==' ')
						wordcount++;
		        }
			    System.out.println("Word count: " + wordcount);

		       


		        String[] lines = str.split(".");
		        int lineCount = lines.length;
		        System.out.println("Line count: " + lineCount);

		        // Count vowels
		        str = str.toLowerCase();
		        int vowelcount = 0;
		        for (int j = 0; j < str.length(); j++) {
		            char ch = str.charAt(j);
		            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
		                vowelcount++;
		            }
		        }
		        System.out.println("Vowel count: " + vowelcount);


		       
		    
		        
	}
	
}
	

		    