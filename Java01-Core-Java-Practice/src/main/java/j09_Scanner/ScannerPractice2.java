package j09_Scanner;

import java.util.Scanner;

public class ScannerPractice2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //System.out.println("Enter true or false:");
        //boolean result = input.nextBoolean();

        System.out.println("Enter your name:"); // Java Programming
        String name = input.next();

        System.out.println("name = " + name); // Java

        input.close(); // if you don't close the scanner, "ECLİPS" gives you a compile error


    }
}
