package Algorithms;

import java.util.HashSet;

// Given an array nums containing n distinct numbers in the range [0, n],
// return the only number in the range that is missing from the array.

public class MissingNumber {

    public int bruteForceSolution(int[] nums) {

        if (nums == null || nums.length == 0) {
            return -1;
        }

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        for (int j = 0; j < nums.length; j++) {
            if (!set.contains(j)) {
                return j;
            }
        }

        return -1;
    }
    // Time: O(n)
    // Memory: O(n^2)

    public int solution(int[] nums) {

        if (nums == null || nums.length == 0) {
            return -1;
        }

        int result = nums.length;

        for (int i = 0; i < nums.length; i++) {
            result += (i - nums[i]);
        }

        return result;
    }
    // Time: O(n)
    // Memory: O(1)
}
