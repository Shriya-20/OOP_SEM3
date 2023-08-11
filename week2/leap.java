

package project;

import java.util.Scanner;

public class leap {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        System.out.println("Enter year: ");
        int year;
        year = sc.nextInt();
        
        boolean leap=false;
        
        if (year%4==0) 
        {	leap=true;
        	
        	if((year%100==0))
        	{
        		if(year%400==0)
        			leap=true;
        		else
        			leap=false;
        			
        			
        	}
        }
        else
        	leap=false;


	
	
	if (leap)
        System.out.println("leap year");
	else
        System.out.println("not leap year ");

	}
}
