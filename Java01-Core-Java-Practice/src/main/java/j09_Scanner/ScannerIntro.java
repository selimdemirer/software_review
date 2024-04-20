package j09_Scanner;

/*
* if we are using nextLine() method after the other methods of scanner, we MUST provide one additional nextLine(). The other methods, they all ignore the "enter" key, so enter key left in the memory of the scanner. In order to take out the enter key in the memory of the scanner, we need to give one more addition nextLine() method. The only time that you need to give one additional nextLine() method is, if this nextLine() method is being used after the other methods of Scanner, such as nextInt(), next(), nextFloat() nextDouble()
 */

import java.util.Scanner;

public class ScannerIntro {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // We assigned our keyword to the variable "input"

        System.out.println("Enter an integer:");
        int num1 = input.nextInt();

        System.out.println("Enter a decimal:");
        double num2 = input.nextDouble();

        System.out.println(num1);
        System.out.println(num2);
        System.out.println("Multiplication: " + (num1 * num2));

        input.close(); // closes the scanner, after this scanner can not be used anymore

    }

}
/*
        System.out.println("Enter an integer:");
        int num3 = input.nextInt();
        System.out.println(num3);
*/
