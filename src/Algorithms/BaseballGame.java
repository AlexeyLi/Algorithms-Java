package Algorithms;

// LeetCode 682.
/*
You are keeping the scores for a baseball game with strange rules. At the beginning of the game, you start with an empty record.

You are given a list of strings operations, where operations[i] is the ith operation you must apply to the record and is one of the following:

An integer x.
Record a new score of x.

'+'.
Record a new score that is the sum of the previous two scores.

'D'.
Record a new score that is the double of the previous score.

'C'.
Invalidate the previous score, removing it from the record.
Return the sum of all the scores on the record after applying all the operations.

The test cases are generated such that the answer and all intermediate calculations fit in a 32-bit integer and that all operations are valid.
 */

import java.util.ArrayDeque;
import java.util.Deque;

public class BaseballGame {

    public int solution(String[] operations) {

        Deque<Integer> stack = new ArrayDeque<>();
        int total = 0;

        for (String operation: operations) {
            if (operation.equals("+")) {
                int top = stack.pop();
                int newScore = top + stack.peek();
                stack.push(top);
                stack.push(newScore);
                total += newScore;
            } else if (operation.equals("D")) {
                int newScore = stack.peek() * 2;
                stack.push(newScore);
                total += newScore;
            } else if (operation.equals("C")) {
                int score = stack.pop();
                total -= score;
            } else {
                int val = Integer.valueOf(operation);
                stack.push(val);
                total += val;
            }
        }

        return total;
    }
    // Time: O(n)
    // Memory: O(n)
}
