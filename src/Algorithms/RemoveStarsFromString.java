package Algorithms;

// LeetCode 2390.

/*
You are given a string s, which contains stars *.

In one operation, you can:

Choose a star in s.
Remove the closest non-star character to its left, as well as remove the star itself.
Return the string after all stars have been removed.

Note:

The input will be generated such that the operation is always possible.
It can be shown that the resulting string will always be unique.
 */

import java.util.Stack;

public class RemoveStarsFromString {

    public String solution(String s) {

        int indexOfLastLetter = 0;
        int i = 0;

        while (i < s.length()) {
            if (s.charAt(i) != '*') {
                indexOfLastLetter = i;
                i += 1;
            } else {
                s = s.substring(0, indexOfLastLetter) + s.substring(i + 1);
                indexOfLastLetter = i - 2;
                i -= 1;
            }
        }

        return s;
    }

    public String solutionStack(String s) {

        Stack<Character> stack = new Stack<>();

        for (char c: s.toCharArray()) {
            if (c == '*' && !stack.empty()) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }

        s = "";

        for (char c: stack) {
            s += c;
        }

        return s;
    }
}
