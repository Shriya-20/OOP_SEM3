import java.util.Scanner;

public class GreatestNumber {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        
	        System.out.println("Input the 1st number: ");
	        int n1 = sc.nextInt();
	        
	        System.out.println("Input the 2nd number: ");
	        int n2 = sc.nextInt();
	        
	        System.out.println("Input the 3rd number: ");
	        int n3 = sc.nextInt();
	        
	       
	    
	    if(n1>=n2)
	    	if(n1>=n3){
	    		System.out.println(n1+" is the biggest number");
	        
	    }
	    else
	    {
	    	if(n2>n3)
	    		System.out.println(n2+" is the biggest number");
	    	else
	    		System.out.println(n3+" is the biggest number");
	        
	    }

	

}
}
