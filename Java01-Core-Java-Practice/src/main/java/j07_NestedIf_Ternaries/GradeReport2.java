package j07_NestedIf_Ternaries;

public class GradeReport2 {

    public static void main(String[] args) {

        int s = 85;

        if (s >= 0 && s <= 100) { // if the s is valid

            // 5 possibilities: A,B,C,D,F
            if (s >= 90) { // typing "&& s<=100" is NOT necessary
                System.out.println("Excellent");
            } else if (s >= 80) { // typing "&& s<90" is NOT necessary
                System.out.println("Great");
            } else if (s >= 70) { // typing "&& s<80 is NOT necessary
                System.out.println("Good");
            } else if (s >= 60) { // typing "&& s<70 is NOT necessary
                System.out.println("Passed");
            } else {
                System.out.println("Failed");
            }

        } else { // if the s is NOT valid
            System.out.println("Invalid s");
        }

        System.out.println("========= Do it with Ternary ===========");

        String result = (s >= 0 && s <= 100)? (s >= 90)? "Excellent" :(s >= 80)? "Great"
                :(s >= 70)? "Good" :(s >= 60)? "Passed" : "Failed" :"invalid s";

        System.out.println(result);


        System.out.println("========== Another Solution: Mix ===========");

        String result2 = "";

        if (s >= 0 && s <= 100) { // if the s is valid (0~100)

            result2 = (s >= 90) ? "Excellent" : (s >= 80) ? "Great"
                    : (s >= 70) ? "Good" : (s >= 60) ? "Passed" : "Failed";

        } else { // if the s is NOT valid
            result2 = "Invalid s";
        }

        System.out.println(result2);


    }

}