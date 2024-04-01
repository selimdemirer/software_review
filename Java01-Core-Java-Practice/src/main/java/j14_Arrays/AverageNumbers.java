package j14_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class AverageNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("How many numbers would you like to enter?");
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        double sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter "+(i+1)+". number:");
            numbers[i] = scanner.nextInt();
            sum+=numbers[i];
        }

        double averageNumber = sum/numbers.length;

        System.out.println("Numbers = " + Arrays.toString(numbers));
        System.out.println("Average Number = " + averageNumber);

        scanner.close();

    }
}

/*
AverageNumber:
			1. Ask the user how many numbers they want to enter
			2. get all the inputs from the user and store them into an array
			3. Iterate the array & return the average number
 */