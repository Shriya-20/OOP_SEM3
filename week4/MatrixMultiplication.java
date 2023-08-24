package week4;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixMultiplication {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number or rows of matrix A: ");
		int m = sc.nextInt();
		System.out.println("Enter number or columns of matrix A: ");
		int n = sc.nextInt();
		System.out.println("Enter number or rows of matrix B: ");
		int p = sc.nextInt();
		System.out.println("Enter number or rows of matrix B: ");
		int q = sc.nextInt();
	
		int a[][]=new int[m][n];
		int b[][]=new int[p][q];
		int c[][]=new int[m][q];
		int k=0;

		
		if(n!=p) {
			System.out.println("Matrix multiplication not possible for the 2 matrices");
		}
		else {
			//Inputing matrix A
			System.out.println("Enter elements of the matrix 1: ");
			for(int i=0;i<m;i++) {
				for(int j=0;j<n;j++) {
					a[i][j]=sc.nextInt();
				}
			}
			//Inputing matrix B
			System.out.println("Enter elements of the matrix 2: ");
			for(int i=0;i<p;i++) {
				for(int j=0;j<q;j++) {
					b[i][j]=sc.nextInt();
				}
			}
			//multiplying
			for(int i=0;i<m;i++) {
				for(int j=0;j<q;j++) {
					for(k=0;k<p;k++) {
						c[i][j]+=a[i][k]*b[k][j];
					}
				}
			}
			//printing the arrays
			//array A
			for(int i=0;i<m;i++) {
				for(int j=0;j<n;j++) {
					System.out.print(a[i][j]+"\t");
				}
				System.out.println();
			}
			System.out.println();
			//array B
			for(int i=0;i<p;i++) {
				for(int j=0;j<q;j++) {
					System.out.print(b[i][j]+"\t");
				}
				System.out.println();
			}
			System.out.println();

			//arrayC
			System.out.println("Matrix after multiplication is: ");
			for(int i=0;i<m;i++) {
				for(int j=0;j<q;j++) {
					System.out.print(c[i][j]+"\t");
				}
				System.out.println();
			}
			System.out.println();


				
		}
		
		
	}

}
