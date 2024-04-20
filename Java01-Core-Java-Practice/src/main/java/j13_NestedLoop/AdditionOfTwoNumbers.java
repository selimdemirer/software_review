package j13_NestedLoop;

import java.util.Scanner;

public class AdditionOfTwoNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            String num1 = "";
            String num2 = "";

            while (true) {
                boolean onlyDigits1 = true;
                System.out.println("Enter your first number:");
                num1 = scanner.next();
                for (char c : num1.toCharArray()) {
                    if (!Character.isDigit(c)) {
                        onlyDigits1 = false;
                    }
                }
                if (!onlyDigits1) System.err.println("Invalid entry!");
                if (onlyDigits1) break;
            }

            while (true) {
                boolean onlyDigits2 = true;
                System.out.println("Enter your second number:");
                num2 = scanner.next();
                for (char c : num2.toCharArray()) {
                    if (!Character.isDigit(c)) {
                        onlyDigits2 = false;
                    }
                }
                if (!onlyDigits2) System.err.println("Invalid entry!");
                if (onlyDigits2) break;
            }

            System.out.println("Addition: " + (Integer.valueOf(num1) + Integer.valueOf(num2)));

            System.out.println("Would you like to continue?");
            String a = scanner.next().toLowerCase();

            while (!(a.equals("yes") || a.equals("no"))) {
                System.err.println("Invalid entry, please re-enter");
                a = scanner.next().toLowerCase();
            }

            if (a.equals("no")) {
                break;
            }
        }

        scanner.close();


    }

}
