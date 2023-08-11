import java.util.Scanner;

public class DateOfRetirement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.println("Enter date: ");
        int date = sc.nextInt();
        System.out.println("Enter month: ");
        int month = sc.nextInt();
        System.out.println("Enter year: ");
        int year = sc.nextInt();
        
        year+=60;
        System.out.println("The date is: "+date+" "+month+" "+year);
        


	}

}
