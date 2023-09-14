import java.util.Arrays;
import java.util.Scanner;



class menu{
	String s = new String();
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter string:");
		s = sc.next();
	}
	boolean palindrome() {
		int i;
		String rev = new String();
		for(i=s.length()-1;i>=0;i--)
			rev+=s.charAt(i);
		return s.equals(rev);
	}
	String sort() {
		char tempArray[] = s.toCharArray();
        Arrays.sort(tempArray);
        return toString(tempArray);
	}
	
	public static String toString(char[] a)
    {
        String string = new String(a);
        return string;
    }
	String reverse() {
		/* int i;
		String sreverse = new String();
		for(i=s.length()-1;i>=0;i--)
			sreverse+=s.charAt(i);
		return sreverse;
		*/
		char[] charstring=s.toCharArray();
		int left = 0;
        int right = charstring.length - 1;

        while (left < right) {
            
            char temp = charstring[left];
            charstring[left] = charstring[right];
            charstring[right] = temp;

            left++;
            right--;
        }	        
        return new String(charstring); //Here return type is String,an object

	}
	
	String addrev() {
		String s_rev = reverse();
		String add = s + s_rev;
		return add;
	}
}

public class MenuDrivenP1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		menu a = new menu();
		a.input();
		while (true) {
			
		
        System.out.println("1. Check if the string is a palindrome");
        System.out.println("2. Write the string in alphabetical order");
        System.out.println("3. Reverse the string");
        System.out.println("4. Concatenate the original and reversed string");
        System.out.println("5. Exit");
        System.out.print("Enter your choice (1-5): ");
        
		int choice = sc.nextInt();
		
		switch(choice) {
		case 1:
			System.out.println(a.palindrome());
			break;
		case 2:
			System.out.println(a.sort());
			break;
		case 3:
			System.out.println(a.reverse());
			break;
		case 4:
			System.out.println(a.addrev());
			break;
		case 5:
			System.exit(0);
			break;
		
			}
		}
	
		
		
		
	}	
}
        			
	
		
		
		



