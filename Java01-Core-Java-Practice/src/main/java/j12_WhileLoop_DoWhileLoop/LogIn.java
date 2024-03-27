package j12_WhileLoop_DoWhileLoop;

import java.util.Scanner;

public class LogIn {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your username:");
        String u = input.next();

        System.out.println("Enter your password:");
        String p = input.next();

        int firstAttempt = 1;

        if (u.equals("Cydeo") && p.equals("Cydeo123")) {
            System.out.println("Logged in");
            firstAttempt--;
        } else {
            int attempts = 3;
            while (!(u.equals("Cydeo") && p.equals("Cydeo123")) && attempts > 0) { // while the credentials are invalid, and user has attempts t re-enter
                if (attempts == 1){
                    System.err.println("This Is Your Last Chance");
                }
                System.out.println("Incorrect username or password, please re-enter");
                System.out.println("Enter your username:");
                u = input.next();

                System.out.println("Enter your password:");
                p = input.next();

                attempts--;
            }
        }

        if (u.equals("Cydeo") && p.equals("Cydeo123")) {
            if(firstAttempt==1) System.out.println("Logged in");
        } else {
            System.err.println("Your account is locked");
        }

        input.close();


    }

}
/*
You are writing a code for the log-in function of the Cybertek Application, assume that your credentials are:
                    username: Cydeo
                    password: Cydeo123

        Ask the user to enter their credentials.
                If credentials are matched, your program should print "Logged in."
                If the credentials are not matched, the program should allow the user to have three attempts to
                enter correct credentials and if all three attempts are failed, then print "Your account is locked."



    	for(int i = 1; i <= 3; i++){

    		if(valid){
    			sout("Loged In")
    			break;
    		}

    		if( i==3){
    			sout(Your account is locked)
    		}

    	}

 */