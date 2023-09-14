package week7;


import java.util.Scanner;

public class MenuDriven2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String firstString = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String secondString = scanner.nextLine();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Compare two strings");
            System.out.println("2. Convert uppercase characters to lowercase and vice-versa");
            System.out.println("3. Check if one string is a substring of the other");
            System.out.println("4. Replace substring with 'Hello'");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    compareStrings(firstString, secondString);
                    break;

                case 2:
                    convertCase(firstString, secondString);
                    break;

                case 3:
                    checkSubstring(firstString, secondString);
                    break;

                case 4:
                    String replacedString = replaceSubstring(firstString, secondString);
                    System.out.println("Result after replacement: " + replacedString);
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

    public static void compareStrings(String str1, String str2) {
        if (str1.equals(str2)) {
            System.out.println("The two strings are equal.");
        } else {
            System.out.println("The two strings are not equal.");
        }
    }

    public static void convertCase(String str1, String str2) {
        String invertedStr1 = invertCase(str1);
        String invertedStr2 = invertCase(str2);

        System.out.println("First string with inverted case: " + invertedStr1);
        System.out.println("Second string with inverted case: " + invertedStr2);
    }

    public static String invertCase(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (Character.isUpperCase(c)) {
                chars[i] = Character.toLowerCase(c);
            } else if (Character.isLowerCase(c)) {
                chars[i] = Character.toUpperCase(c);
            }
        }
        return new String(chars);
    }

    public static void checkSubstring(String str1, String str2) {
        if (str1.contains(str2) || str2.contains(str1)) {
            System.out.println("One string is a substring of the other.");
        } else {
            System.out.println("No substring relationship found.");
        }
    }

    public static String replaceSubstring(String str1, String str2) {
        if (str1.contains(str2)) {
            return str1.replace(str2, "Hello");
        } else if (str2.contains(str1)) {
            return str2.replace(str1, "Hello");
        } else {
            return str1;
        }
    }
}
