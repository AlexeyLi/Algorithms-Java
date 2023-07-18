package Algorithms;

// LeetCode 1004.

//Given a binary array nums and an integer k,
// return the maximum number of consecutive 1's in the array if you can flip at most k 0's.

public class MaxConsecutiveOnesIII {

    public int solution(int[] nums, int k) {

        int left = 0;
        int right;
        int numOfOnes = 0;
        int max = 0;

        for (right = 0; right < nums.length; right++) {
            if (nums[right] == 0) {
                numOfOnes += 1;
            }

            if (numOfOnes > k) {
                if (nums[left] == 0) {
                    numOfOnes -= 1;
                    left += 1;
                }
            }

            if (numOfOnes <= k) {
                max = Math.max(max, right - left + 1);
            }
        }

        return max;
    }
}
