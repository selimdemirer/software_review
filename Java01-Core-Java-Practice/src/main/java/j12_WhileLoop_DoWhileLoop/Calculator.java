package j12_WhileLoop_DoWhileLoop;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first number:");
        int num1 = input.nextInt();

        System.out.println("Enter your second number:");
        int num2 = input.nextInt();

        System.out.println("Enter a math operator:");
        char ch = input.next().charAt(0);

        while (!(ch == '+' || ch == '-')) {
            System.err.println("Invalid Operator, Please re-enter:");
            ch = input.next().charAt(0);
        }

        /*
        for (int i = 0;!(ch == '+' || ch == '-');) { // since there is no iterator, practically this is a while loop
            System.err.println("Invalid Operator, Please re-enter:");
            ch = input.next().charAt(0);
        }
        */

        System.out.println("result = " +  ((ch=='+')? num1+num2 : num1-num2) );


    }

}
