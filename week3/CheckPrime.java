package week3;

import java.util.Scanner;

public class CheckPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int n = sc.nextInt();
		boolean prime=true;
		
		for(int i=2;i<n/2;i++) {
			
			if(n%i==0) {
				prime=false;
				break;
			}
		}
		if(n==1)
			System.out.print(n +" is neither prime nor composite");
		else if(prime)
			System.out.print(n +" is a prime number");
		else
			System.out.print(n +" is not a prime number");

			

			

	}

}
