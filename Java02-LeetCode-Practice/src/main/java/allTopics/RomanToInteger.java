package allTopics;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    public static void main(String[] args) {

        String s = "MCMXCIV"; // 5 - 1 + 100 - 10 + 1000 - 100 + 1000 = 1994
        System.out.println(romanToInt1(s));
        System.out.println(romanToInt2(s));

    }

    public static int romanToInt1(String s) {

        int result = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            char currentChar = s.charAt(i);
            int currentValue = 0;

            if (currentChar == 'I') {
                currentValue = 1;
            } else if (currentChar == 'V') {
                currentValue = 5;
            } else if (currentChar == 'X') {
                currentValue = 10;
            } else if (currentChar == 'L') {
                currentValue = 50;
            } else if (currentChar == 'C') {
                currentValue = 100;
            } else if (currentChar == 'D') {
                currentValue = 500;
            } else if (currentChar == 'M') {
                currentValue = 1000;
            }

            if (currentValue < prevValue) {
                result -= currentValue;
            } else {
                result += currentValue;
            }
            prevValue = currentValue;
        }

        return result;

    }

    public static int romanToInt2(String s){

        Map<Character,Integer> romanMap = new HashMap<>();
        romanMap.put('I',1);
        romanMap.put('V',5);
        romanMap.put('X',10);
        romanMap.put('L',50);
        romanMap.put('C',100);
        romanMap.put('D',500);
        romanMap.put('M',1000);

        int result = 0;
        int prevValue = 0;

        for (int i = s.length()-1; i >=0 ; i--) {
            char currentChar = s.charAt(i);
            int currentValue = romanMap.get(currentChar);

            if (currentValue < prevValue){
                result -= currentValue;
            }else {
                result += currentValue;
            }
            prevValue = currentValue;
        }

        return result;

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
