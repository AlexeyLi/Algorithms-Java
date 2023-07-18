package Algorithms;

// LeetCode 487.

// Given a binary array nums, return the maximum number of consecutive 1's in the array if you can flip at most one 0.

public class MaxConsecutiveOnesII {

    public int solution(int[] nums) {
        int left = 0;
        int right = 0;
        int k = 0;
        int zero = 0;
        int max = 0;

        while (right < nums.length) {
            if (nums[right] == 1) {
                right += 1;
            } else if (nums[right] == 0 && k < 1) {
                zero = right + 1;
                k += 1;
                right += 1;
            } else {
                left = zero;
                k = 0;
                right += 1;
            }

            // max = max > (right - left) + 1? max: (right - left) + 1;
            max = Math.max(max, right - left);
        }

        return max;
    }
}
