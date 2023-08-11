import java.util.Scanner;

public class Taksi {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        
        System.out.println("Enter Fare: ");
        float fare = sc.nextFloat();
        
        float dist = 0;

        if (fare>0 && fare <= 50)
            dist = fare/10 ;
        
        else if (fare > 50 && fare <=170)
            dist = (fare-50) /8 + 5 ;
        
        else if (fare > 170)
            dist = (fare - 170)/5 + 20;
        else
            System.out.println("Invalid fare entry");

        	
        
        
       
        System.out.println("Distance covered: " + dist);
        System.out.println("Amount: " + fare);

    }

	

}
