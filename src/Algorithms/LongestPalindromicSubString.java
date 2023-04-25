package Algorithms;

// LeetCode 5.
// Given a string s, return the longest palindromic substring in s.

public class LongestPalindromicSubString {

    public String solution(String str) {

        if (str.length() < 2) {
            return str;
        }

        String result = "";
        int resultLength = 0;
        for (int i = 0; i < str.length(); i++) {

            // Odd length
            int left = i, right = i;
            while (left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)) {
                if (right - left + 1 > resultLength) {
                    result = str.substring(left, right + 1);
                    resultLength = right - left + 1;
                }
                left -= 1;
                right += 1;
            }

            // Even length
            int l = i, r = i + 1;
            while (l >= 0 && r < str.length() && str.charAt(l) == str.charAt(r)) {
                if (r - l + 1 > resultLength) {
                    result = str.substring(l, r + 1);
                    resultLength = r - l + 1;
                }
                l -= 1;
                r += 1;
            }
        }

        return result;
    }
    // Time: O(n^2)
    // Space: O(n)
}
