package week4;
import java.util.Scanner;
import java.util.Arrays;

public class SumOfElements {

	public static void main(String[] args) {
		
		System.out.println("Enter size of the array: ");
		
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		float sum=0;
		float arr[]=new float[size];
		
		System.out.println("Enter elements of the array: ");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextFloat();
		}
		System.out.println("The array: "+Arrays.toString(arr));

		for(int i=0;i<size;i++) {
			sum+=arr[i];
		}
		System.out.print("The sum of the elements is: "+sum);

			

	}

}
