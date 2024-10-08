package allTopics;

public class RomanToIntegerBruteForce {

    public static void main(String[] args) {

        String s = "MCMXCIV"; // 1000 + 900 + 90 + 4
        System.out.println(romanToInt(s));

    }

    public static int romanToInt(String s) {

        int number = 0;

        for (int i = 0; i < s.length(); i++) {

            char current = s.charAt(i),
                 next = s.charAt(i + 1),
                 previous = s.charAt(i-1);

            if (i - 1 > 0 && current == 'M' && previous == 'C' ){
                continue;
            }
            else if (current == 'M') {
                number += 1000;
                continue;
            }

            if (i - 1 > 0 && current == 'C' && previous == 'X' ){
                continue;
            }
            else if (i + 1 < s.length() && current == 'C' && next == 'M') {
                number += 900;
                continue;
            } else if (i + 1 < s.length() && current == 'C' && next == 'D') {
                number += 400;
                continue;
            } else if (current == 'C') {
                number += 100;
                continue;
            }

            if (i - 1 > 0 && current == 'D' && previous == 'C' ){
                continue;
            }
            else if (current == 'D') {
                number += 500;
                continue;
            }

            if (i - 1 > 0 && current == 'X' && previous == 'I' ){
                continue;
            }
            else if (i + 1 < s.length() && current == 'X' && next == 'C') {
                number += 90;
                continue;
            } else if (i + 1 < s.length() && current == 'X' && next == 'L') {
                number += 40;
                continue;
            } else if (current == 'X') {
                number += 10;
                continue;
            }

            if (i - 1 > 0 && current == 'L' && previous == 'X' ){
                continue;
            }
            else if (current == 'L') {
                number += 50;
                continue;
            }

            if (i + 1 < s.length() && current == 'I' && next == 'X') {
                number += 9;
                continue;
            } else if (i + 1 < s.length() && current == 'I' && next == 'V') {
                number += 4;
                continue;
            } else if (current == 'I') {
                number += 1;
                continue;
            }

            if (i - 1 > 0 && current == 'V' && previous == 'I' ){
                continue;
            }
            else if (current == 'V') {
                number += 5;
            }

        }

        return number;

    }

/*

Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

I can be placed before V (5) and X (10) to make 4 and 9.
X can be placed before L (50) and C (100) to make 40 and 90.
C can be placed before D (500) and M (1000) to make 400 and 900.
Given a roman numeral, convert it to an integer.

Example 1:
Input: s = "III"
Output: 3
Explanation: III = 3.

Example 2:
Input: s = "LVIII"
Output: 58
Explanation: L = 50, V= 5, III = 3.

Example 3:
Input: s = "MCMXCIV"
Output: 1994
Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.


Constraints:
1 <= s.length <= 15
s contains only the characters ('I', 'V', 'X', 'L', 'C', 'D', 'M').
It is guaranteed that s is a valid roman numeral in the range [1, 3999].

 */
}
