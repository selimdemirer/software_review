package j19_CustomMethods_Overloading;

import utilities.StringUtility;

public class Test1 {

    public static void main(String[] args) {

        String str = "Java Programming Language";

        StringUtility.printEachChar(str);

        System.out.println("---------------------1---------------------");

        String s1 = "Cydeo School";

        String reverse = StringUtility.reverse(s1);

        System.out.println(reverse);

        System.out.println("---------------------2---------------------");

        String word = "Java";

        boolean palindrome = StringUtility.isPalindrome(word);

        System.out.println("Is " + word + " a palindrome? = " + palindrome);

        System.out.println("---------------------3---------------------");

        String[] names = {"Anna", "Java", "Python", "racecar", "Mom", "Cydeo"};

        int count=0;

        for (String each : names) {
            if(StringUtility.isPalindrome(each)){
                count++;
            }
        }

        System.out.println(count);

        System.out.println("---------------------4---------------------");

        String s2 = "aaaaabbbbbbccccddddd";

        String nonDup = StringUtility.removeDuplicates(s2);

        System.out.println(nonDup);


    }

}