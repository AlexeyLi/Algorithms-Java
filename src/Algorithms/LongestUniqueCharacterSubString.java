package Algorithms;

import java.util.HashMap;

// Given a String, find the longest substring with unique characters.

public class LongestUniqueCharacterSubString {

    public int[] longestUniqueCharacterSubString(String str) {
        int start = 0;
        int end = 0;
        int longest = 1;
        int[] result = {0, 0};
        HashMap<Character, Integer> map = new HashMap<>();
        map.put(str.charAt(0), 0);

        while (end < str.length() - 1) {
            end += 1;
            char toAdd = str.charAt(end);

            if (map.containsKey(toAdd) && map.get(toAdd) >= start) {
                start = map.get(toAdd) + 1;
            }

            map.put(toAdd,  end);

            if (end - start + 1 > longest) {
                longest = end - start + 1;
                result[0] = start;
                result[1] = end;
            }

        }

        return result;
    }
}
