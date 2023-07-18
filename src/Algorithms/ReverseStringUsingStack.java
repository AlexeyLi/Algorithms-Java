package Algorithms;

import java.util.Stack;

public class ReverseStringUsingStack {

    public String solution(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c: s.toCharArray()) {
            stack.push(c);
        }

        String result = "";

        while (!stack.empty()) {
            result += stack.pop();
        }

        return result;
    }
}
