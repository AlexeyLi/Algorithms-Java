package Algorithms;

import java.util.HashMap;
import java.util.Map;

// LeetCode 1133.
// Given an integer array nums, return the largest integer that only occurs once. If no integer occurs once, return -1.

public class LargestUniqueNumber {

    public int solution(int[] nums) {

        if (nums == null || nums.length == 0) {
            return -1;
        }

        int result = -1;

        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int num : nums){
            if (map.get(num) == 1 && num > result)
                result = num;
        }

        return result;
    }
    // Time: O(n)
    // Memory: O(n)
}
