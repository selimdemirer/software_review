package j08_Switch;

public class MixedIfSwitchTernary {

    public static void main(String[] args) {

        // We mixed if~ternary~switch~ in that task!

        int year = 2000;
        int number = 2;

        String result = "";

        if (number >= 1 && number <= 12) { // number: 1~12

            switch (number) {

                case 2:
                    result = (year % 4 == 0) ? "29 days" : "28 days"; // if it is Leap Year, it is 29 days! //Ternary
                    break;

                case 4: case 6: case 9: case 11:
                    result = "30 days";
                    break;

                default:
                    result = "31 days";
            }

        } else {
            result = "Invalid Number";
        }

        System.out.println(result);

    }
}
/*
 NumberOfDays
			28 Days: 2 // only one option
			30 Days: 4, 6, 9, 11 // back to back for or logic
			31 Days: 1, 3, 5, 7, 8, 10, 12  // default case

			If(1~12){

			    switch

			}else{
				Invalid
			}
*/
