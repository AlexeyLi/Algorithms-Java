package Algorithms;

// LeetCode 14.

// Write a function to find the longest common prefix string amongst an array of strings.
// If there is no common prefix, return an empty string "".

class LongestCommonPrefix {

    public String bruteForceSolution(String[] strs) {
        String result = "";

        int shortestString = Integer.MAX_VALUE;

        for (int k = 0; k < strs.length; k++) {
            shortestString = shortestString > strs[k].length()? strs[k].length(): shortestString;
        }

        for (int i = 0; i < shortestString; i++) {
            for (int j = 1; j < strs.length; j++) {
                if (strs[0].charAt(i) != strs[j].charAt(i)) {
                    return result;
                }
            }
            result += strs[0].charAt(i);
        }

        return result;
    }
    // Time: O(n^2)
    // Memory: O(1)

    public String solution(String[] strs) {
        if (strs.length == 0) {
            return "";
        }

        String commonPrefix = strs[0];

        for (int i = 0; i < strs.length; i++) {
            while (!strs[i].startsWith(commonPrefix)) {
                commonPrefix = commonPrefix.substring(0, commonPrefix.length() - 1);
            }
        }

        return commonPrefix;
    }
    // Time: O(n)
    // Memory: O(1)
}
