package j14_LoopPractices;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num1 = scanner.nextInt();

        System.out.println("Enter a math operator:");
        char operator = scanner.next().charAt(0);

        if ( !(operator=='+' || operator=='-') ){ // if the operator is not valid
            System.err.println("Invalid Math Operator: "+operator);
            System.exit(0); // terminates the whole program
        }

        System.out.println("Enter a number:");
        int num2 = scanner.nextInt();








    }
}
