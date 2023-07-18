package Algorithms;

// LeetCode 205.

// Given two strings s and t, determine if they are isomorphic.
// Two strings s and t are isomorphic if the characters in s can be replaced to get t.
// All occurrences of a character must be replaced with another character while preserving the order of characters.
// No two characters may map to the same character, but a character may map to itself.

import java.util.HashMap;

public class IsomorphicStrings {

    public boolean isIsomorphic(String s, String t) {

        return transform(s).equals(transform(t));
    }

    public String transform(String str) {

        HashMap<Character, Integer> map = new HashMap<>();
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (!map.containsKey(str.charAt(i))) {
                map.put(str.charAt(i), i);
            }

            builder.append(map.get(str.charAt(i)));
            builder.append(" ");
        }

        return builder.toString();
    }
    // Time: O(n)
    // Memory: O(n)
}
