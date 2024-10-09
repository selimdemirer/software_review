package allTopics;

import java.util.Arrays;

public class PalindromeNumber {

    public static void main(String[] args) {

        int n = 121;
        System.out.println(isPalindrome(n));

    }

    public static boolean isPalindrome(int x) {

        String number = String.valueOf(x);
        char[] arry = number.toCharArray();
        char[] reversed = new char[arry.length];
        for (int i = 0,j= arry.length-1; i < arry.length; i++,j--) {
            reversed[i] = arry[j];
        }

        return (Arrays.equals(reversed,arry));

    }

/*
Given an integer x, return true if x is a palindrome, and false otherwise.

Example 1:
Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.

Example 2:
Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.

Example 3:
Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.

Constraints:
-231 <= x <= 231 - 1

 */

}
