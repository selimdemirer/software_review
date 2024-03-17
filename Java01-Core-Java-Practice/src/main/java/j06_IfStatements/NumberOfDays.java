package j06_IfStatements;

public class NumberOfDays {

    public static void main(String[] args) {

        //Assume n=1~12
        int number = 5;

        boolean has28Days= number == 2; // for the months that has 28 days
        boolean has31Days= number == 4 || number == 6 || number ==9 || number == 11; // for the months that has 31 days
        boolean has30Days= !has28Days && !has31Days; // for the months that does not have 28 days and does not have 31 days

        if (has28Days){
            System.out.println("28 days");
        }

        if (has31Days){
            System.out.println("31 days");
        }

        if (has30Days){
            System.out.println("30 days");
        }

        if (5>6){ // we don't need to create a boolean datatype for single if statement. This is a condition as well.
            System.out.println("yeap"); //it will be executed if the condition is true
        }

    }
}
/*
Write a program that can print the number of days in a month

			Ex:
				number = 1 ~ 12;

			output:
				31 Days


			Hints:
				Months that has 31 days: 1, 3, 5, 7, 8, 10, 12
				Months that has 30 days: 4, 6, 9, 11
				Month that has 28 days: 2
 */