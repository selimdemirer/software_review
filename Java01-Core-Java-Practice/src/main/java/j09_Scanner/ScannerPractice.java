package j09_Scanner;

import java.util.Scanner;

// import java.util.*; wild import:imports everything from the package

public class ScannerPractice {

    public static void main(String[] args) {

       /*
        new Scanner(System.in).nextInt();
        new Scanner(System.in).nextInt();
        ...
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 1 to 7:");
        int num = input.nextInt();

        String result = "" ; // temp

        if(num >= 1 && num <= 7){ //num: 1~7
            result =(num==1)?"Monday"  :(num==2)?"Tuesday"  :(num==3)?"Wednesday"
                    :(num==4)?"Thursday" :(num==5)?"Friday" :(num==6)?"Saturday" : "Sunday";
        }else{
            result = "Invalid Number";
        }

        System.out.println(result);

        input.close();


    }
}
