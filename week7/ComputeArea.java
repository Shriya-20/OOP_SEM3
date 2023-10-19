package week7;

import java.util.Scanner;

abstract class shape
{
	 abstract double area();
}
class triangle extends shape
{	
	double base,height ;
	triangle(double b,double h)
	{
		this.base=b;
		this.height=h;
	}
	double ar;
	double area()
	{
		ar=((base*height)/2);
		return ar;
	}
}

class rectangle extends shape{	
	double base,height ;
	rectangle(double b,double h)
	{
		this.base=b;
		this.height=h;
	}
	double area()
	{
		return (base*height);
	}
}
public class ComputeArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		double l,b;
		System.out.println("Enter length: ");
		l=sc.nextDouble();
		System.out.println("Enter breadth: ");
		b=sc.nextDouble();
		if(l>0 && b>0)
		{
			rectangle rect= new rectangle(l,b);
			System.out.println("The area of rectangle is  "+rect.area()+" sq. units");
			triangle tri= new triangle(l,b);
			System.out.println("The area of triangle is  "+tri.area()+" sq. units");
			
		}
		else
		{
			System.out.println("Invalid dimensions for shape");
		}
		
				
    }
    
}
