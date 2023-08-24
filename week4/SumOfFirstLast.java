package week4;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfFirstLast {

	public static void main(String[] args) {
		
		System.out.println("Enter size of the array: ");
		
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int sum=0;
		int arr[]=new int[size];
		
		System.out.println("Enter elements of the array: ");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("The array: "+Arrays.toString(arr));
		if(size%2==0)
			System.out.println("Sum of first and last elements is: "+(arr[0]+arr[size-1]));
		else
			System.out.println("Sum of first, middle and last elements is: "+(arr[0]+arr[size/2]+arr[size-1]));

		
	}

}
