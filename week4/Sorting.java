package week4;

import java.util.Arrays;
import java.util.Scanner;

public class Sorting {

	public static void main(String[] args) {
		
		System.out.println("Enter size of the array: ");
		
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int arr[]=new int[size];
		
		System.out.println("Enter elements of the array: ");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("The array before sorting: "+Arrays.toString(arr));
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
					
			}
		}
		
		System.out.println("The array after sorting: "+Arrays.toString(arr));

	}
		
}
