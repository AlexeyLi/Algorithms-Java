package Algorithms;

/*
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.
 */

import java.util.Stack;

public class ValidParentheses {

    public boolean solution(String str) {
        Stack<Character> stack = new Stack<>();

        char[] charArray = str.toCharArray();

        for (char ch: charArray) {

            switch(ch) {

                case '(':
                case '{':
                case '[':
                    stack.push(ch);
                    break;
                case ')':
                    if (stack.empty() || stack.pop() != '(') {
                        return false;
                    }
                    break;
                case '}':
                    if (stack.empty() || stack.pop() != '{') {
                        return false;
                    }
                    break;
                case ']':
                    if (stack.isEmpty() || stack.pop() != '[') {
                        return false;
                    }
                    break;
            }
        }

        return stack.isEmpty();
    }
    // Time: O(n)
    // Memory: O(1)
}
