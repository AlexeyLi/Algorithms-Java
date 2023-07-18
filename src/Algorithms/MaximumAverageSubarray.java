package Algorithms;

public class MaximumAverageSubarray {

    public double solutionBruteForce(int[] nums, int k) {
        if (nums == null || nums.length == 0 || nums.length < k) {
            return -1;
        }

        int start = 0;
        int end = k;

        double maxSum = Double.NEGATIVE_INFINITY;

        while (end <= nums.length) {
            int sum = 0;

            for (int i = start; i < end; i++) {
                sum += nums[i];
            }

            maxSum = maxSum > sum? maxSum: sum;
            start += 1;
            end += 1;
        }

        return maxSum / k;
    }

    public double solution(int[] nums, int k) {
        int start = 0;
        int end = 0;

        int sum = 0;
        int maxSum = Integer.MIN_VALUE;

        while (end < nums.length) {
            sum += nums[end];

            if (end - start + 1 < k) {
                end += 1;
            } else if (end - start + 1 == k) {
                maxSum = maxSum > sum? maxSum: sum;
                sum = sum - nums[start];
                start += 1;
                end += 1;
            }
        }

        return (double)maxSum / k;
    }
}
