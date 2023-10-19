package week7;

import java.util.Scanner;

class account
{	
	String name,type;
	int no;

	account(int no,String name,String type)
	{
		this.name=name;
		this.no=no;
		this.type=type;
	}	
	

}



class savings extends account
{	
	int min=500,penality =20,rate=10,balance=0;
    int interest;

	savings(int no,String name,String type)
	{
		super(no,name,type);
	}
    void deposit(int dep)
	
	{
		balance =balance+dep;
	}
	void display_interest()
	{
		System.out.println("The interest is : "+interest);
	}
	void with(int a)
	{	
		System.out.println("Rs. "+a+" amount has been withdrawn ");
		balance =balance-a;
	}
	void interest(int time) {
		interest=(balance*rate*time)/100 ;
		balance=balance+interest;
		System.out.println("The interest of savings is : "+interest);
	}
	void check() {
		if (balance<min)
			{
			System.out.println("Account balance is low .\n Penality given is : "+penality);
			balance=balance-penality;
			}
		else
			System.out.println("Account balance is sufficient. ");
	}
	void display()
	{
		System.out.println("The balance of savings account is : "+balance);
	}

}
class current_account extends account
{	
	int min =500,penality =40,rate=10,balance=0,interest;
	current_account(int no,String name,String type)
	{
		super(no,name,type);
	}
   void deposit(int dep)
	
	{
		balance =balance+dep;
	}
	void display_interest()
	{
		System.out.println("The interest is : "+interest);
	}
	void with(int a)
	{	
		System.out.println("Rs. "+a+" amount has been withdrawn ");
		balance =balance-a;
	}
	void interest(int time) {
		
		interest=(balance*rate*time)/100 ;
		balance=balance+interest;
		System.out.println("The interest  of savings is : "+interest);
	}
	void check() {
		if (balance<min)
			{
			
			balance=balance-penality;
			System.out.println("Account balance is low.");
			System.out.println("Penality given is : "+penality);
			}
		else
			System.out.println("Account balance is sufficient ");
	}
	void display()
	{
		System.out.println("The balance of current account is : "+balance);
	}
	
}


public class Account {
    public static void main(String[] args) {


    int b,k;
	String l,m;
	Scanner sc= new Scanner(System.in);
	
	
	System.out.println("Enter account type: ");
	m=sc.nextLine();
	System.out.println("Enter account number: ");
	k=sc.nextInt();
	System.out.println("Enter name: ");
	l=sc.next ();
	
	if (m.equals("s"))
	{
		savings s = new savings(k,l,m);

		while(true)
		{
			
			System.out.println("\n 1. Withdrawal \n 2. Deposit  \n 3. Display  \n 4. Interest  \n 5. Exit ");
			System.out.println("Enter you choice: ");
			b=sc.nextInt();
			if(b==5)
				break;
			switch (b) {
			case 1 :
			{
				System.out.println("Enter amount for withdrawal: ");
				int c= sc.nextInt();
				s.with(c);
				s.check();
				s.display();
				break;
			}
			case 2 :
			{
				System.out.println("Enter amount for deposit: ");
				int d= sc.nextInt();
				s.deposit(d);
				s.check();
				s.display();
				break;
			}
			case 3 :
			{
				s.check();
				s.display();
				break;
			}
			case 4 :
			{
				System.out.println("Enter time since deposit in years: ");
				int e= sc.nextInt();
				s.interest(e);
				s.check();
				s.display();
				break;
			}
			default:
			{
				System.out.println("Invalid entry");
			}
		
			}
		}
	}
	else if (m.equalsIgnoreCase("current"))
	{
		current_account s = new current_account(k,l,m);
		while(true)
		{
			System.out.println("\n 1. Withdrawal \n 2. Deposit  \n 3. Display  \n 4. Interest  \n 5. Exit ");
			System.out.println("Enter you choice: ");
			b=sc.nextInt();
			if(b==5)
				break;
			switch (b) {
			case 1 :
			{
				System.out.println("Enter amount for withdrawal: ");
				int c= sc.nextInt();
				s.with(c);
				s.check();
				s.display();
				break;
			}
			case 2 :
			{
				System.out.println("Enter amount for deposit: ");
				int d= sc.nextInt();
				
				s.deposit(d);
				s.check();
				s.display();
				break;
			}
			case 3 :
			{
				s.check();
				s.display();
				break;
			}
			case 4 :
			{
				System.out.println("Enter time since deposit in years: ");
				int e= sc.nextInt();
				s.interest(e);
				s.check();
				s.display();
				break;
			}
			default:
			{
				System.out.println("Invalid entry");
			}
				
			}
		}
	}
		
	}

}


        
    
    

