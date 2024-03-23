package j11_ForLoop;

import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {

        // Write a program that can calculate the sum of all integers between 1 to 100

        int sum = 0;

        for (int i = 0; i < 101; i++) {
            sum += i;
        }

        System.out.println("sum = " + sum);

        System.out.println("=====================================");

        // Write a program that can calculate the sum of given 5 numbers

        Scanner scanner = new Scanner(System.in);
        int total = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number");
            total += scanner.nextInt();
        }

        System.out.println("total = " + total);


    }
}
