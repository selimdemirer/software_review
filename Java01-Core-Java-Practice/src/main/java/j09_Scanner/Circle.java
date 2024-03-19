package j09_Scanner;

import java.util.Scanner;

public class Circle {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // We assigned our keyword to the variable "input"

        System.out.println("Enter the radius of the circle:");

        double r = input.nextDouble();

        double area = 3.14 * r * r;
        double perimeter = 2 * 3.14 * r;

        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);

        input.close(); // I cannot use scanner method after this line

    }
}
/*
Circle:
            1.1 Ask the user to enter the radius of the circle
            1.1 Calculate the area and perimeter of the circle by using the radius
*/