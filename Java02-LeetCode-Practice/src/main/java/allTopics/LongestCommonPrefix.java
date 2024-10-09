package allTopics;

import java.util.HashMap;
import java.util.Map;

public class LongestCommonPrefix {

    public static void main(String[] args) {

        String[] strs = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(strs));

    }

    public static String longestCommonPrefix(String[] strs) {

        // If the array is empty, return an empty string
        if (strs == null || strs.length == 0) {
            return "";
        }

        // Take the first string as a reference
        String prefix = strs[0]; // I took this -> "flower", and I will reduce it step by step

        // Iterate over the array of strings
        for (int i = 1; i < strs.length; i++) {
            // Check the current string and reduce the prefix length as necessary
            while (strs[i].indexOf(prefix) != 0) {
                // If the prefix is not found at the start of the string, shorten it
                prefix = prefix.substring(0, prefix.length() - 1);
                // If the prefix becomes an empty string, return empty string
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;

    }

/*

Write a function to find the longest common prefix string amongst an array of strings.
If there is no common prefix, return an empty string "".

Example 1:
Input: strs = ["flower","flow","flight"]
Output: "fl"

Example 2:
Input: strs = ["dog","racecar","car"]
Output: ""

Explanation: There is no common prefix among the input strings.

Constraints:
1 <= strs.length <= 200
0 <= strs[i].length <= 200
strs[i] consists of only lowercase English letters.

 */

}
