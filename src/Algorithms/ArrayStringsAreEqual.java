package Algorithms;

// LeetCode 1662.

// Given two string arrays word1 and word2, return true if the two arrays represent the same string, and false otherwise.
// A string is represented by an array if the array elements concatenated in order forms the string.

public class ArrayStringsAreEqual {

    public boolean solution(String[] word1, String[] word2) {
        String s1 = merge(word1);
        String s2 = merge(word2);

        return s1.equals(s2);

    }
    // Time: O(n)
    // Memory: O(n^2)

    private String merge(String[] strs) {

        String result = "";

        for (String s: strs) {
            result += s;
        }

        return result;
    }
}
