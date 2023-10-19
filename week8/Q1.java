package week8;
import  java.util.Scanner;


public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int[] arr=new int[3];
		
		System.out.println("Enter elements: ");
		for(int i=0;i<3;i++) {
			
		try {
				
		arr[i]=sc.nextInt();
		
		}catch(Exception e) {
				
		System.out.println("Int type not entered in array\n");
		}
		}
		
		
	}
	


	

}
