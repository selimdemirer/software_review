package j07_NestedIf;

public class NameOfMonth {

    public static void main(String[] args) {

        int number = 4;
        String result = "";   // temporary value - empty string

        if (number <= 12 && number >= 1) { // if the number is valid // Pre-condition If

            if (number == 1) {
                result = "January";
            } else if (number == 2) {
                result = "February";
            } else if (number == 3) {
                result = "March";
            } else if (number == 4) {
                result = "April";
            } else if (number == 5) {
                result = "May";
            } else if (number == 6) {
                result = "June";
            } else if (number == 7) {
                result = "July";
            } else if (number == 8) {
                result = "August";
            } else if (number == 9) {
                result = "September";
            } else if (number == 10) {
                result = "October";
            } else if (number == 11) {
                result = "November";
            } else {
                result = "December";
            }

        } else { // if the number is NOT valid // Pre-condition Else
            result = "Invalid Number";
        }

        System.out.println(result);

        /*
        Finally, Print Statement prints the latest and true assigned String variable. So initially
        a temporary value ("") can be assigned for String datatype!
        */

    }

}
