package Algorithms;

// LeetCode 1768.

// You are given two strings word1 and word2. Merge the strings by adding letters in alternating order,
// starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.
// Return the merged string.

public class MergeStringsAlternately {

    public String solution(String word1, String word2) {

        StringBuilder sb = new StringBuilder();
        int word1Length = word1.length();
        int word2Length = word2.length();

        int k = Math.min(word1Length, word2Length);

        for (int i = 0; i < k; i++) {
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));
        }

        if (word1Length > word2Length) {
            sb.append(word1.substring(k, word1Length));
        } else if (word2Length > word1Length) {
            sb.append(word2.substring(k, word2Length));
        }

        return sb.toString();
    }
    // Time: O(n)
    // Memory: O(n)
}
