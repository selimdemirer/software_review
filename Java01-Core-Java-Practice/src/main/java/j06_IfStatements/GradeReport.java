package j06_IfStatements;

public class GradeReport {

    public static void main(String[] args) {
/*
        System.out.println(true == !false); // true
        System.out.println(!true != false); // false
        System.out.println(!false == true); // true
        System.out.println(!!false); // false
        System.out.println(!!!true); // false

        Relational operators are also if conditions.
*/

        int score = 85;

        boolean a = score >= 90 && score <= 100;
        boolean b = score >= 80 && score <=  89; // or ==> boolean b = score >= 80 && !a;
        boolean c = score >= 70 && score <=  79; // or ==> boolean c = score >= 70 && !a && !b;
        boolean d = score >= 60 && score <=  69; // or ==> boolean d = score >= 60 && !a && !b && !c;
        boolean f = score >=  0 && score <=  59; // or ==> boolean e = score >=  0 && !a && !b && !c && !d;

        if (a){
            System.out.println("Excellent");
        }
        if (b){
            System.out.println("Great");
        }
        if (c){
            System.out.println("Good");
        }
        if (d){
            System.out.println("Passed");
        }
        if (f){
            System.out.println("Failed");
        }

    }
}
/*
    90 ~ 100 ==> Excellent
    80 ~ 89  ==> Great
    70 ~ 79  ==> Good
    60 ~ 69  ==> Passed
     0 ~ 59  ==> Failed
 */