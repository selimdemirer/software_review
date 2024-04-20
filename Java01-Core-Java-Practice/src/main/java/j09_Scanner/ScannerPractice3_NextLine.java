package j09_Scanner;

import java.util.Scanner;

public class ScannerPractice3_NextLine {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); //Enter

        System.out.println("Enter your full name:");
        String fullName = input.nextLine(); //Wooden SpoonEnter

        System.out.println("Enter your Programming Language:"); //Java Programming LanguageEnter
        String programming = input.nextLine();

        System.out.println("Enter your age:");
        int age = input.nextInt(); //24

        input.nextLine(); // capture the Enter key that user pressed for nextInt()

        System.out.println("Enter your school name:");
        String schoolName = input.nextLine(); //CydeoEnter

        System.out.println("Full Name = " + fullName);
        System.out.println("Programming = " + programming);
        System.out.println("Age = " + age);
        System.out.println("School Name = " + schoolName);

        input.close();

    }

}
