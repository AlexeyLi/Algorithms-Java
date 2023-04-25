package Algorithms;

// LeetCode 392.
/* Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters
without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).
 */

public class SubsequenceString {

    public boolean solution(String sub, String str) {
        
        int i = 0;
        int y = 0;

        while (i < str.length() && y < sub.length()) {
            if (str.charAt(i) == sub.charAt(y)) {
                y += 1;
            }
            i += 1;
        }

        if (y == sub.length()) {
            return true;
        }

        return false;
    }
}
