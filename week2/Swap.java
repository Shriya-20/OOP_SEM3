package project;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

	 	System.out.println("Enter a string: ");
        String a = sc.nextLine();
        
        System.out.println("Enter integer: ");
        int b = sc.nextInt();
        

        String str2 = Integer.toString(b);

		System.out.println("Before Swap");
		System.out.println("a = " + a);
		System.out.println("b = " + str2);

		String temp = a;
        a = str2;
        str2 = temp;

		System.out.println("After swap");
		System.out.println("a = " + a);
		System.out.println("b = " + str2);
	}

	

}
