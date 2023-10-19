//Write a program that handles ArrayOverflowException. [ Hint: Consider the array size]

package week8;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[] array=new int[5];
		System.out.println("Enter the elements: ");
		try {
		for(int i=0;i<5;i++) {
			array[i]=sc.nextInt();
			
			}
		}catch(Exception e) {
			System.out.println("ArrayOverflowException occured");
		}
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
		

	}

}
