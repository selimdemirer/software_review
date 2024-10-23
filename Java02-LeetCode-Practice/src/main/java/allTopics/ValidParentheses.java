package allTopics;

import java.util.Stack;

public class ValidParentheses {

    public static void main(String[] args) {

        String s = "([])";
        System.out.println(isValid(s));

    }

    public static boolean isValid(String s) {

        // Create a stack to store open brackets
        Stack<Character> stack = new Stack<>();

        // Iterate through each character in the string
        for (char each : s.toCharArray()) {
            // If it's a close bracket
            if (each == '(' || each == '{' || each == '[') stack.push(each);
                // if it is a close bracket
            else {
                // Check if the stack is empty, meaning no matching open bracket
                if (stack.isEmpty()) return false;
                // Pop the top of the stack and check if it matches the corresponding open bracket
                char top = stack.pop();
                if (each == ')' && top != '(' ||
                        each == '}' && top != '{' ||
                        each == ']' && top != '[') {
                    return false;
                }
            }
        }
        // If the stack is empty, all brackets were matched correctly
        return stack.isEmpty();
    }

/*

Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
An input string is valid if:
Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.

Example 1:
Input: s = "()"
Output: true

Example 2:
Input: s = "()[]{}"
Output: true

Example 3:
Input: s = "(]"
Output: false

Example 4:
Input: s = "([])"
Output: true

Constraints:
1 <= s.length <= 104
s consists of parentheses only '()[]{}'.

 */

}
