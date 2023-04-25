package Algorithms;

public class MinimumOperationsToMakeArrayIncreasing {

    public int solution(int[] nums) {

        if (nums.length == 1) {
            return 0;
        }

        int n = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] <= nums[i]) {
                n += nums[i] - nums[i + 1] + 1;
                nums[i + 1] = nums[i] + 1;
            }
        }
        return n;
    }
}
