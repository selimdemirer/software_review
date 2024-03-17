package j06_IfStatements;

public class NameOfDay {

    public static void main(String[] args) {

        // Assume n=1~7
        int n = 5;

        if (n==1){
            System.out.println("monday");
        } else if (n == 4) {
            System.out.println("thursday");
        } else if (n == 3) {
            System.out.println("wednesday");
        } else if (n == 2) {
            System.out.println("tuesday");
        } else if (n == 5) {
            System.out.println("friday");
        } else if (n == 6) {
            System.out.println("saturday");
        } else{
            System.out.println("sunday");
        }

        System.out.println("-----------------------------");

        //Solution with one print statement only
        String day;

        if (n==1){
            day="Monday";
        } else if (n == 4) {
            day="thursday";
        } else if (n == 3) {
            day="wednesday";
        } else if (n == 2) {
            day="tuesday";
        } else if (n == 5) {
            day="friday";
        } else if (n == 6) {
            day="saturday";
        } else{
            day="sunday";
        }

        System.out.println("day = " + day);

    }
}
