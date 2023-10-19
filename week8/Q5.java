//Write a program to enter student’s Name, Roll Number and Marks in three subjects 
//and find the percentage, grade and handle NumberFormatException

package week8;

import java.util.Scanner;

class input{
	String name;
	int roll;
	int[] marks;
	
	input(String name, int roll,int[] marks){
		this.name=name;
		this.roll=roll;
		marks=marks;
		
	}


	
double percentage(int[] marks) {
	double sum=0;
	for(int i=0;i<3;i++)
		sum+=marks[i];
	return (sum/300)*100;
}
	
	
	
}


	
	
	
	

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[] marks=new int[3];
		System.out.println("Enter name: ");
		String name=sc.next();
		System.out.println("Enter roll: ");
		int roll=sc.nextInt();
		System.out.println("Enter marks: ");
		for(int i=0;i<3;i++) {
			
			try {
			marks[i]=sc.nextInt();
			
			if(marks[i]>100 || marks[i]<0) {
				System.out.println("RE Enter: ");
				marks[i]=sc.nextInt();
				throw new NumberFormatException(); 

				}
			
			}
			catch(NumberFormatException e){
				System.out.println("Exception handled, continue");

			}
		}
		
		
		input obj=new input(name,roll,marks);
		System.out.println("The percentage score of student: "+obj.percentage(marks));
		
		
		

	}

}
