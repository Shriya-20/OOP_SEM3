package project;

import java.util.Scanner;

public class Bitwise {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number: ");
		int a=sc.nextInt();
		System.out.println("Enter second number: ");
		int b=sc.nextInt();
		int carry=0;
		while(b!=0)
		{
			carry=a&b;
			a=a^b;
			b=carry<<1;
			
			
		}
		System.out.println("Sum is: "+a);
		
	}

}
