package j08_Switch;

public class Calculator {

    public static void main(String[] args) {

        double n1 = 200.5, n2 = 10.5;
        char operator = '$';
        boolean valid = operator == '+' || operator == '-' || operator == '*' || operator == '/';

        if(valid){

            switch (operator){
                case '+':
                    System.out.println(n1+n2);
                    break;
                case '-':
                    System.out.println(n1-n2);
                    break;
                case '*':
                    System.out.println(n1*n2);
                    break;
                default:
                    System.out.println(n1/n2);
            }

        }else {
            System.err.println("Invalid Operator = " + operator);
        }


    }

}
/*

Given two variables n1, n2 and a char variable named operator.

use switch statement to calculator the result of n1 & n2 based on the given operator

Valid opeartors are: -,+,*,/

*/