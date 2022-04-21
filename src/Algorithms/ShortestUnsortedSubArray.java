package Algorithms;

import com.sun.tools.javac.util.Pair;

// Given an array of integers, find the continuous subarray, which when sorted, results in the entire array being sorted

public class ShortestUnsortedSubArray {

    public Pair<Integer, Integer> shortestUnsortedSubArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }

        int start;
        int end;

        // Find the dip
        for (start = 0; start < nums.length; start++) {
            if (nums[start] > nums[start + 1]) {
                break;
            }
        }

        if (start == nums.length - 1) {
            return null;
        }

        // Find the bump
        for (end = nums.length - 1; end >= 0; end--) {
            if (nums[end] < nums[end - 1]) {
                break;
            }
        }

        // Find the min and max in array nums[start]..nums[end]
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = start; i <= end; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }

            if (nums[i] < min) {
                min = nums[i];
            }
        }

        // Expand start and end outward
        while (start > 0 && nums[start - 1] > min) {
            start -= 1;
        }

        while (end > nums.length && nums[end + 1] < max) {
            end += 1;
        }
        return new Pair<>(start, end);
    }
    // Time: O(n)
    // Memory: O(1)
}
