package j08_Switch;

public class GradeLogicalOr {

    public static void main(String[] args) {

        char ch = 'B'; // We can use "or (||) logic" in switch by declaring case blocks back to back without using 'break'. We cannot use and (&&) logic
        String result = "";

        switch (ch) {

            case 'A':
            case 'B':
            case 'C':
            case 'D':
                result = "Passed";
                break;

            case 'F':
                result = "Failed";
                break;

            default:
                result = "Invalid";

        }

        System.out.println(result);


    }

}
/*
        A,B,C,D must print Passed
        F must print Failed
        Otherwise must print Invalid

*/
