package j08_Switch;

public class Grade {

    public static void main(String[] args) {

        char ch = 'B'; // ==

        switch (ch) {

            case 'A':
                System.out.println("Excellent");
                break;

            case 'B':
                System.out.println("Great Job");
                break;

            case 'C':
                System.out.println("Good");
                break;

            case 'D':
                System.out.println("Passed");
                break;

            case 'F':
                System.out.println("Failed");
                break;

            default:
                System.out.println("Invalid");
                break;

        }


    }

}
//we could have used if statement but switch is faster.
/*
a char variable named grade is given. use switch statement to print the following messages:
			'A': excellent
			'B': great job
			'C': good
			'D': passed
			'F': failed
			otherwise: invalid
 */

