package week3;

import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter length: ");
		float l = sc.nextFloat();
		System.out.print("Enter breadth: ");
		float b = sc.nextFloat();
		float area=l*b;
		float circumference=2*(l+b);
		
		System.out.println("Area is: "+area+" square units");
		System.out.println("Circumference is: "+circumference+" units");

		
		

	}

}
