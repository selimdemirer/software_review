package j08_Switch;

/*

* Switch-case statement used to compare the value of a variable with multiple values and execute some statements based on the match.
* Switch statement’s expression must be evaluated to a single value, it can not be long, double, float and Boolean data types.
* All the case block statements are optional including break. Blank case is perfectly legal code. Last break statement is optional, we don't have type it because switch  will end already with the "}"
* 'default' block can appear anywhere in the code. It should not be the last one. There can only be one default block.
* Switch is faster than If.
* We can use "or (||) logic" in switch by declaring case blocks back to back without using 'break'. We cannot use and (&&) logic.
* Only comparison that you can use in switch is equal.

*/

public class SwitchIntro {

    public static void main(String[] args) {

        int number = 7;
        // long number = 7L;        We can never use these four data type in switch
        // float number = 9F;
        // double number = 9D;
        // boolean = true;

        switch (number) {

            case 1:
                System.out.println("Monday");
                break; // exits the switch after executing the case block

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            case 7:
                System.out.println("Sunday");
                break;

            default: // only gets executed if none of the case blocks are matching. There can only be one default block
                System.out.println("Invalid Number");
                break; // Last break statement is optional, we don't have type it because switch  will end already with the "}"
        }


    }
}
