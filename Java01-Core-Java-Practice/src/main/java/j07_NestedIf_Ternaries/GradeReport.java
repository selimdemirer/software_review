package j07_NestedIf_Ternaries;

public class GradeReport {

    public static void main(String[] args) {

        /*
        90 ~ 100 ==> Excellent
        80 ~ 89  ==> Great
        70 ~ 79  ==> Good
        60 ~ 69  ==> Passed
          0 ~ 59  ==> Failed
        */

        // First one used 6 print statement for each if block

        int score = 145;

        if(score >= 0 && score <= 100){ // if the score is valid

            // 5 possibilities: A,B,C,D,F
            if(score >= 90){ // typing "&& score<=100" is NOT necessary
                System.out.println("Excellent");
            }else if(score>=80){ // typing "&& score<90" is NOT necessary
                System.out.println("Great");
            }else if(score>=70){ // typing "&& score<80 is NOT necessary
                System.out.println("Good");
            }else if(score>=60){ // typing "&& score<70 is NOT necessary
                System.out.println("Passed");
            }else{
                System.out.println("Failed");
            }

        }else{ // if the score is NOT valid
            System.out.println("Invalid Score");
        }

        System.out.println("-------------------------");

        // Second one only used 1 print statement at the end!

        String result = ""; // temporary

        if(score >= 0 && score <= 100){ // if the score is valid

            // 5 possibilities: A,B,C,D,F
            if(score >= 90){ // typing "&& score<=100" is NOT necessary
                result= "Excellent";
            }else if(score>=80){ // typing "&& score<90" is NOT necessary
                result="Great";
            }else if(score>=70){ // typing "&& score<80 is NOT necessary
                result="Good";
            }else if(score>=60){ // typing "&& score<70 is NOT necessary
                result="Passed";
            }else{
                result="Failed";
            }

        }else{ // if the score is NOT valid
            result="Invalid Score";
        }

        System.out.println(result);


    }

}

