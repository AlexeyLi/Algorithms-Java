package Algorithms;

// LeetCode 345.

// Given a string s, reverse only all the vowels in the string and return it.
//The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.

import java.util.HashSet;

public class ReverseVowels {

    public String solution(String s) {

        HashSet<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');

        char[] chars = s.toCharArray();
        Character temp;

        int left  = 0;
        int right = s.length() - 1;

        while (left <= right) {
            if (set.contains(Character.toLowerCase(chars[left])) && set.contains(Character.toLowerCase(chars[right]))) {
                temp = s.charAt(left);
                chars[left] = chars[right];
                chars[right] = temp;
                left += 1;
                right -= 1;
            } else if (!set.contains((Character.toLowerCase(chars[left])))) {
                left += 1;
            } else if (!set.contains((Character.toLowerCase(chars[right])))) {
                right -= 1;
            }
        }

        return String.valueOf(chars);
    }
}
