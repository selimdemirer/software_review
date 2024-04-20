package j13_NestedLoop;

public class Triangle {

    public static void main(String[] args) {

        int rows = 10; // we have to connect the outer and inner loops!! Therefor we are using "i" in the inner loop!!

        for (int i = 1; i <= rows; ++i) { // it gives just extra lines

            for (int j = 1; j <= i; ++j) { // it prints
                System.out.print("* ");
            }

            System.out.println();

        }


    }

}
/*
Use a nested loop to print the following shape

        *
        * *
        * * *
        * * * *
        * * * * *
        * * * * * *
        * * * * * * *
        * * * * * * * *
        * * * * * * * * *
        * * * * * * * * * *
 */

