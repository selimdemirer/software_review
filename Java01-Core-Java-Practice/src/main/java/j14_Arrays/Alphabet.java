package j14_Arrays;

import java.util.Arrays;

public class Alphabet {

    public static void main(String[] args) {

        char[] alphabets = new char[26]; // 26 represents number of elements, not indexes!
        char ch = 'Z';

        for (char i = 0; i <alphabets.length ; i++, ch--) {
            alphabets[i] = ch; // Z~A
        }

        /*
        for (char i = 0, j = 'Z'; i <alphabets.length; i++,j--) {
            alphabets[i]=j;
        }
        */

        System.out.println(Arrays.toString(alphabets)); // print the whole array
        System.out.println(alphabets[5]); // 5 represents index, not element! Print the element of array: 6. element!
        System.out.println(alphabets);


    }

}
