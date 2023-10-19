package week7;

import java.util.Scanner;


class account1
{	
	String name,type;
	int no,balance=0,interest;

	account1(int no,String name,String type)
	{
		this.name=name;
		this.no=no;
		this.type=type;
	}	
	

}
class saving extends account
{	
	int min=100,penality =20,rate=10,balance=10000,interest;
	saving(int no,String name,String type)
	{
		super(no,name,type);
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
			System.out.println("Account balance is low.");
			System.out.println("Service tax given is : "+penality);
			balance=balance-penality;
			}
		else
			System.out.println("Account balance is sufficient. ");
	}
	void display()
	{
		System.out.println("The balance of savings is : "+balance);
	}

}
public class SavingsAccount{
    public static void main(String[] args) {

        int b,k;
		String l;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter account number: ");
		k=sc.nextInt();
		System.out.println("Enter name: ");
		l=sc.next ();
		
			saving s = new saving(k,l,"savings");
			while(true)
			{
				
				System.out.println("\n 1. Withdrawal \n 2. Interest  \n 3. Display  \n 4. Exit");
				System.out.println("Enter you choice: ");
				b=sc.nextInt();
				if(b==4)
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
					System.out.println("Enter time since deposit in years: ");
					int e= sc.nextInt();
					s.interest(e);
					s.check();
					s.display();
					break;
				}
				case 3 :
				{
					
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
        
    
