package j10_String;

import java.util.Scanner;

public class StartsWithX {

    public static void main(String[] args) {

        //Scanner input = new Scanner(System.in); // if you are giving only one scanner input, you don't need to declare a scanner variable
        //String word = input.next();             // and you don't need to close the scanner

        System.out.println("Enter a word:");
        String word = new Scanner(System.in).next();

        if (word.charAt(0) == 'x'){
            word = word.replaceFirst("x", "a");
        }

        System.out.println(word);

/*
Write a program that asks user to enter a word. If the word starts with x, replace it with a.
                    Input:
                        xcodex
                    Output:
                        acodex
 */


    }
}
