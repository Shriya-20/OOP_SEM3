package week4;

import java.util.Scanner;

public class SumAverageOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter size of the array: ");
		
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		float sum=0;
		float avg;
		float arr[]=new float[size];
		
		System.out.println("Enter elements of the array: ");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextFloat();
		}
		for(int i=0;i<size;i++) {
			sum+=arr[i];
		}
		avg=sum/size;
		System.out.println("The sum of the elements is: "+sum);
		System.out.println("The average of the elements is: "+avg);


	}

}
