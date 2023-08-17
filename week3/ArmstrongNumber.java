package week3;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int num = sc.nextInt();
		int n=num;
		int sum=0;
		while(n!=0) {
			int dig=n%10;
			sum += Math.pow(dig, 3);
			n/=10;
		}
		if(num<0)
			System.out.print("Negative numbers cant be Armstrong Numbers");
		if(num==sum)
			System.out.print(num+" Is an Armstrong Number");
		else
			System.out.print(num+ " Is not an Armstrong Number");

			
		

	}

}
