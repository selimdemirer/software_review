package j14_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MinMaxNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter a number:");
            numbers[i] = scanner.nextInt(); // each user input will be assigned to the indexes of the array numbers
        }

        int max = numbers[0]; // assumption
        int min = numbers[0]; // assumption

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] > max) {
                max = numbers[i];
            }

            if (numbers[i] < min){
                min = numbers[i];
            }

        }

        System.out.println("numbers = " + Arrays.toString(numbers));
        System.out.println("min = " + min);
        System.out.println("max = " + max);

        scanner.close();

    }
}
/*
Write a program that asks user to enter a number 10 times:
			1. store all user entered numbers in an array
			2. find the max number
			3. find the min number
 */