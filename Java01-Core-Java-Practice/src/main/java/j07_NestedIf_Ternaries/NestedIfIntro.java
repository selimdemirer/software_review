package j07_NestedIf_Ternaries;

public class NestedIfIntro {

    public static void main(String[] args) {

        int score = 101;

        if (score>=0 && score<=100){ // if score is valid

            if (score >=60) { // if student passed the exam
                System.out.println("Passed");
            }else{ // if student failed the exam
                System.out.println("Failed");
            }
        }else{ // if score is invalid
            System.out.println("Invalid Score");
        }

        System.out.println("-----------------------------");

        int age = 17;
        boolean hasID = true;

        if (hasID){ // if the person has ID

            if (age>=21){ // If the person is 21 years old or older
                System.out.println("Eligible to buy alcohol");
            }else{ // if the person is less than 21 years old
                System.out.println("Not eligible to buy alcohol");
            }

        }else{ // if the person does not ID
            System.out.println("You must have an ID to buy alcohol");
        }

        System.out.println("----------------------------------------");

        int number = -2; // 1~7
            // 1<= number <=7    ==> This math formula does not work in Java
        if (number>=1 && number<=7){ // Nested If. if the number is a valid number

            // 7 options
            if (number==1){
                System.out.println("Monday");
            } else if (number==2) {
                System.out.println("Tuesday");
            }else if (number==3) {
                System.out.println("Wednesday");
            }else if (number==4) {
                System.out.println("Thursday");
            }else if (number==5) {
                System.out.println("Friday");
            }else if (number==6) {
                System.out.println("Saturday");
            }else{
                System.out.println("Sunday");
            }

        }else { // Nested If. if the number is not valid
            System.out.println("Invalid Number");
        }

    }

}
