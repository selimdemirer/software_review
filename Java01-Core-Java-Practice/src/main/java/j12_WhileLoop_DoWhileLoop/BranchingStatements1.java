package j12_WhileLoop_DoWhileLoop;

import java.util.Scanner;

public class BranchingStatements1 {

    public static void main(String[] args) {

        for (char i = 'A'; i <= 'Z'; i++) {

            System.out.print(i+" ");

            if (i == 'F'){
                break; // Exits the loop
            }
        }
        System.out.println();
        System.out.println("---------------------1---------------------");

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a number");
            int num = input.nextInt();
            if (num<0){
                break;
            }
        }


    }

}
