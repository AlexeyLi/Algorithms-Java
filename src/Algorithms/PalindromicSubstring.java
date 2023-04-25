package Algorithms;

import java.util.HashSet;

public class PalindromicSubstring {

    public int solution(String str) {
        int result = 0;

        for (int i = 0; i < str.length(); i++) {
            int left = i, right = i;

            while (left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)) {
                result += 1;
                left -= 1;
                right += 1;
            }

            int l = i, r = i + 1;
            while (l >= 0 && r < str.length() && str.charAt(l) == str.charAt(r)) {
                result += 1;
                l -= 1;
                r += 1;
            }
        }

        return result;
    }

    // Time: O(n^2)
    // Memory: O(1)
}
