package week8;
import  java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=sc.next();
		
		
		try {
			int num=Integer.parseInt(str);
			
		System.out.println(num+" is now converted to int\n");
		
		}catch(NumberFormatException e) {
			System.out.println(" Invalid conversion of a string to a number");
			
		}
	
		

	}

}
