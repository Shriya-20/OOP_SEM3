import java.util.Scanner;

class menu2{
	String s = new String();
	
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter string:");
		s = sc.next();
	}
	
	boolean compare(String s2) {
		if(s.compareTo(s2)==0)
			return true;
		else
			return false;
	}
	
	String swapcase() {
		String new_s = new String();
		for(int i=0; i<s.length();i++) {
			if(s.charAt(i)>='A' && s.charAt(i)<='Z') {
				new_s += (char)(s.charAt(i)+32);
			}
			else if(s.charAt(i)>='a' && s.charAt(i)<='z') {
				new_s += (char)(s.charAt(i)-32);
			}
			else
				new_s += s.charAt(i);
		}
		return new_s;
 		
	}
	boolean sub(String s2) {
		return s.contains(s2);
	}
	void replace(String s2) {
		if(sub(s2)) {
			s2 = "hello";
		}
		System.out.println("s2 is:"+s2);
	}
}
public class MenuDrivenP2 {

	public static void main(String[] args) {
		while(true)
		{
		menu2 a = new menu2();
		Scanner sc = new Scanner(System.in);
		
		a.input();
		String s3 = new String();
		System.out.println("enter second string");
		s3 = sc.nextLine();
		System.out.println("a:compare");
		System.out.println("b:togglecase");
		System.out.println("c:substring");
		System.out.println("d:replacesubstring");

		
		
		
		char choice = sc.next().charAt(0);
		switch(choice) {
		case 1:
			if(a.compare(s3))
				System.out.println("Equal");
			else
				System.out.println("Not Equal");

				
		case 'b':
			System.out.println(a.swapcase());
			break;
		case 'c':
			if(a.sub(s3))
				System.out.println("it is a substring");
			else
				System.out.println("not a substring");
			break;
		case 'd':
			a.replace(s3);
			break;
		default:
			System.out.println("invalid");
		}
		
	}
	}

}