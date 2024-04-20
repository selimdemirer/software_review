package j06_IfStatements;

public class SingleIfStatementInfo {

    public static void main(String[] args) {

        int number = 300;

        /*
        System.out.println("Odd Number");
        System.out.println("Even Number");
        */

        boolean evenNumber = number%2 == 0;
        boolean oddNumber = !evenNumber;

        if (evenNumber) { // only this one will be printed, because it is true
            System.out.println(number + " is even number");
        }

        if (oddNumber){ // this one won't be executed, because it is false
            System.out.println(number+ " is odd number");
        }

        System.out.println("---------------------1---------------------");

        int n = 200;

        // positive
        if (n>0){ // if the n is greater than zero, then it's positive
            System.out.println(n+" is positive");
        }

        // negative
        if (n<0){ // if the n is less than zero, then it's negative
            System.out.println(n+" is negative");
        }

        // zero
        if (n==0){
            System.out.println(n+" is zero");
        }

    }
}
