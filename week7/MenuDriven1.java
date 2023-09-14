package week7;


import java.util.Scanner;

public class MenuDriven1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Check if the string is a palindrome");
            System.out.println("2. Write the string in alphabetical order");
            System.out.println("3. Reverse the string");
            System.out.println("4. Concatenate the original and reversed string");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");

            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    if (isPalindrome(input)) {
                        System.out.println("The string is a palindrome.");
                    } else {
                        System.out.println("The string is not a palindrome.");
                    }
                    break;

                case 2:
                    String sortedString = sortStringAlphabetically(input);
                    System.out.println("String in alphabetical order: " + sortedString);
                    break;

                case 3:
                    String reversedString = reverseString(input);
                    System.out.println("Reversed string: " + reversedString);
                    break;

                case 4:
                    String concatenatedString = input + reverseString(input);
                    System.out.println("Concatenated string: " + concatenatedString);
                    break;

                case 5:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    break;
            }
        }
    }
    
    

    public static boolean isPalindrome(String str) {
        String reversed = reverseString(str);
        return str.equals(reversed);
    }

    public static String sortStringAlphabetically(String str) {
        char[] chars = str.toCharArray();
        bubbleSort(chars);
        return new String(chars);
    }

    public static void bubbleSort(char[] arr) {
        int n = arr.length;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (arr[i - 1] > arr[i]) {
                    // Swap arr[i-1] and arr[i]
                    char temp = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
    }

    public static String reverseString(String str) {
    	char[] chars = str.toCharArray();
        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            // Swap characters at the left and right indices
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;

            left++;
            right--;
        }
        return new String(chars);

    }
    
    
}


