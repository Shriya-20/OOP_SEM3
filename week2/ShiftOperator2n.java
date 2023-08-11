package project;

import java.util.Scanner;

public class ShiftOperator2n {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number: ");
		int a=sc.nextInt();
		System.out.println("Enter n: ");
		int n=sc.nextInt();
		
		int multiply,divide;
		divide=a>>n;
		multiply=a<<n;
		System.out.println("On Multiplication with 2^n:  "+multiply);
		System.out.println("On division with 2^n:  "+divide);


		
		

	}

}
