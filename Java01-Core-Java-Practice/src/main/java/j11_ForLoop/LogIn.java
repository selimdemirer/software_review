package j11_ForLoop;

import java.util.Scanner;

public class LogIn {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your username:");
        String username = scanner.next();

        System.out.println("Enter your password:");
        String password = scanner.next();

        if (username.equals("Cydeo") && password.equals("WoodenSpoon")) System.out.println("Logged In");
        else {
            for (int i = 0; i < 3; i++) {
                System.err.println("Incorrect username or password!");
                System.out.println("Enter your username:");
                username = scanner.next();

                System.out.println("Enter your password:");
                password = scanner.next();

                if (username.equals("Cydeo") && password.equals("WoodenSpoon")){
                    System.out.println("Logged In");
                    break;
                }
            }
        }

        if (!(username.equals("Cydeo") && password.equals("WoodenSpoon"))) System.err.println("Your account is locked, Please contact support team");

        scanner.close();


    }

}
/*
    You are writing a code for the log-in function of the Cydeo Application, assume that your credentials are:
                                username: Cydeo
                                password: WoodenSpoon

                    Ask the user to enter their credentials.
                            If credentials are matched, your program should print "Logged in."
                            After the credentials are not matched, the program should allow the user to have three attempts
                            to enter correct credentials and if all three attempts are failed, then print
                            "Your account is locked."
 */