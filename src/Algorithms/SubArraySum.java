package Algorithms;

// Given an array of positive integers, find the contiguous sub array that sums to a given number X.

public class SubArraySum {

    // All integers are positive integers
    public int[] subArraySumSlidingWindow(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return null;
        }

        int left = 0;
        int right = 0;
        int sum = nums[0];

        while (left < nums.length) {
            if (left > right) {
                right = left;
                sum = nums[left];
            }

            if (sum < target) {
                right += 1;
                sum += nums[right];
            } else if (sum > target) {
                sum -= nums[left];
                left += 1;
            } else {
                return new int[] {left, right};
            }
        }
        return null;
    }
    // Time: O(n)
    // Memory: O(1)
}
