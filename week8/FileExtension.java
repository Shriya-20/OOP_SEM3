package week8;

import java.util.Scanner;

class Invalid_File_Extn extends Exception {
    String des;

    Invalid_File_Extn(String des) {
        this.des = des;
    }
}

public class FileExtension {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many filenames: ");
        int n = sc.nextInt();
        String filenames[] = new String[n];

        System.out.println("Enter filenames: ");
        for (int i = 0; i < n; i++)
            filenames[i] = sc.next();

        int index = filenames[0].lastIndexOf('.');
        String ext = filenames[0].substring(index);
        try {
            for (int i = 1; i < filenames.length; i++) {
                if (!filenames[i].endsWith(ext))
                    throw new Invalid_File_Extn("invalid extension!");
            }
            System.out.println("All filenames have same extension.. ");
        } catch (Invalid_File_Extn ob) {
            System.out.println(ob.des);
        }

        sc.close();
    }
}



