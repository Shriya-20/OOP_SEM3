package week7;

import java.util.Scanner;

class library
{	
	String name;
	int  id, price;
	library(String s ,int i,int p)
	{
		name=s;
		id=i;
		price=p;
	}
}
class book extends library
{
	book(String s ,int i,int p)
	{
		super(s,i,p);
	}
	int getID()
	{
		return id ;
		}
	int getPrice()
	{
		return price ;
	}
	String getName()
	{
		return name;
	}
	}

public class BookClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

		
			System.out.println("Enter name of the book: ");
			String s= sc.nextLine();
			System.out.println("Enter ID of the book: ");
			int d=sc.nextInt();
			System.out.println("Enter price of the book in rupees:");
			int c=sc.nextInt();
			book b= new book(s,d,c);
	
			System.out.println("Book ID: " +b.getID());
			System.out.println("Title: " +b.getName());
			System.out.println("Price: Rs. " +b.getPrice()); 
	}

        
    
    
}
