package j06_IfStatements;

public class PosNegZero {

    public static void main(String[] args) {

        int n = 100;

        if (n>0){                                   // Those 3 if statements are unnecessary.It is wasting the source.
            System.out.println("Positive");
        }

        if (n<0){
            System.out.println("Negative");
        }

        if (n==0){
            System.out.println("Zero");
        }

        System.out.println("---------------------1---------------------");

        boolean positive = n>0;
        boolean negative = n<0;

        if (positive){
            System.out.println("positive");
        }else if (negative){
            System.out.println("negative");
        }else{
            System.out.println("zero");
        }

        System.out.println("---------------------2---------------------");

                                                // There are three conditions/possibilities, but if we use one
        if (positive){                          // independent "If Statement" and one "If & Else Statement" the result
            System.out.println("positive");     // will be wrong. "If & Else Statement" we can
        }                                       // never apply for the tasks that requires more than two conditions.

        if (negative){
            System.out.println("negative");
        }else {
            System.out.println("zero");
        }


    }

}
