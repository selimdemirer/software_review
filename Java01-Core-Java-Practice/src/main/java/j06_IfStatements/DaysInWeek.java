package j06_IfStatements;

public class DaysInWeek {

    public static void main(String[] args) {

        int n = 5; // Assume n=1~7

        if (n == 1) {
            System.out.println("monday");
        } else if (n == 2) {
            System.out.println("tuesday");
        } else if (n == 3) {
            System.out.println("wednesday");
        } else if (n == 4) {
            System.out.println("thursday");
        } else if (n == 5) {
            System.out.println("friday");
        } else if (n == 6) {
            System.out.println("saturday");
        } else {
            System.out.println("sunday");
        }

        System.out.println("=========Do it with Ternary=============");

        String result = (n==1)? "monday" :(n==2)? "tuesday" :(n==3)? "wednesday" :(n==4)? "thursday"
                :(n==5)? "friday" :(n==6)? "saturday" : "sunday";

        System.out.println(result);

    }

}
