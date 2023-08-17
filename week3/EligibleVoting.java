package week3;

import java.util.Scanner;

public class EligibleVoting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your age: ");
		int age = sc.nextInt();
		
		if(age>130)
			System.out.print("Age is mostly not valid");
		else if(age>=18)
			System.out.print("Eligible to vote");
		
		else if(age<0)
			System.out.print("Age not valid");
		else
			System.out.print("Not eligible to vote");

		}

}
