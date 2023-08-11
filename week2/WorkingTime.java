package project;

import java.util.Scanner;

public class WorkingTime {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter hours worked: ");
		double hours=sc.nextInt();
		System.out.println("Enter hourly rate: ");
		double rate=sc.nextInt();
		double salary=0;
		if(hours<=40)
			salary=hours*rate;
		else
		{
			salary=40*rate;
			salary+=((hours-40)*(1.5*rate));
		}
		System.out.println("Salary is: "+salary);
		

	}

}
