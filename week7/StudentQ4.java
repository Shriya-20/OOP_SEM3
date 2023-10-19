package week7;


import java.util.Scanner;

class mcard
{
	int id,sum2=0;
	int [] marks =new int [5];
	mcard(int id ,int[] marks)
	{
		this.id=id;
		this.marks=marks ;
	}
}
class student extends mcard
{
	student (int id ,int[] marks)
	{
		super(id,marks);
		
	}
	void tot()
	{
		for (int i =0;i<5;i++)
		{
			sum2=sum2+marks[i];
		}
		
	}
	void check() {
		if(sum2<40)
		{
			System.out.println("Student has failed" );
		}
		else
		{
			System.out.println("Student has passed" );
		}
	}
	void display()
	{
		System.out.println("Total marks are : "+sum2);
	}
}

public class StudentQ4 {
    public static void main(String[] args) {
        int[] marks= new int[5];
		int id;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter ID of student: " );
		id=sc.nextInt();
		
		for (int i=0;i<5;i++)
		{
			System.out.print("Enter the marks for subject "+(i+1)+": " );
			marks[i]=sc.nextInt();
		}
		
		student s= new student(id,marks);
		s.tot();
		s.display();
		s.check();
	}

    
    
}
