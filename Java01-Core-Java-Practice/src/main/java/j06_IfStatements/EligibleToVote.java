package j06_IfStatements;

public class EligibleToVote {

    public static void main(String[] args) {

        String name = "Josh";
        int age = 18;
        String citizen = "USA";

        boolean isEligible = age >= 21 && citizen == "USA"; // True

        // Eligible
        if (isEligible) { // True
            System.out.println("Eligible");
        }

        // Not Eligible
        if (!isEligible) { // !True=False ==> the body of if block will not be executed
            System.out.println("Not Eligible");
        }

    }

}
