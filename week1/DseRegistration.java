import java.util.Scanner;

public class DseRegistration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.println("Enter a 9-digit registertion number: ");
        int reg = sc.nextInt();
        int regno=reg;
        int count=0;

        while(regno>0)
        {
        	regno/=10;
        	count++;
        }
        
        
        while(reg > 100)
        	{reg /= 10;
        	}
        
        
        
        System.out.println("count is " +count);
        if(count==9)
        	System.out.println("The student joined in year " +(2000+ reg));
        else if(count==8)
        	{reg/=10;
            System.out.println("The student joined in year " +(2000+ reg));
        	}
        else
            System.out.println("The registration numbe ris invalid");



	
	

	}
}
