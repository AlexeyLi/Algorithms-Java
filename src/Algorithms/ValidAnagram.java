package Algorithms;

// LeetCode 242.

// Given two strings s and t, return true if t is an anagram of s, and false otherwise.
// An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
// typically using all the original letters exactly once.

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ValidAnagram {

    public boolean solution(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        List<Character> list = new ArrayList<>();

        for (char c: s.toCharArray()) {
            list.add(c);
        }

        for (char c: t.toCharArray()) {
            if (list.contains(c)) {
                list.remove(Character.valueOf(c));
            } else {
                return false;
            }
        }

        return list.isEmpty();
    }

    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> map = new HashMap<>();

        // Count the occurrences of characters in string s
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // Subtract the occurrences of characters in string t
        for (char c : t.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) - 1);
                if (map.get(c) == 0) {
                    map.remove(c);
                }
            } else {
                return false; // Character not present in map
            }
        }

        return map.isEmpty();
    }
    // Time: O(n)
    // Memory: O(1)
}
