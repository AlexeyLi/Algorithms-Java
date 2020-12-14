package Algorithms;

import java.util.ArrayList;

public class IntegerPalindrome {

    /* Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.
       Example 1:
       Input: 121
       Output: true

       Example 2:
       Input: -121
       Output: false
       Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.

       Example 3:
       Input: 10
       Output: false
       Explanation: Reads 01 from right to left. Therefore it is not a palindrome.

       Follow up:
       Could you solve it without converting the integer to a string?
     */

    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        int y = x;
        int result = 0;

        while (x > 0) {
            int num = x % 10;
            x = x / 10;
            int temp = result * 10 + num;
            result = temp;
        }
        return result == y;
    }

    // Time: O(lg(n))
    // Memory: O(1)
}
