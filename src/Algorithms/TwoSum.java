package Algorithms;

public class TwoSum {

    public int[] twoSumBruteForce(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                if (nums[i] + nums[j] == target) {
                    int[] result = {nums[i], nums[j]};
                    return result;
                }
            }
        }
        return null;
    }

}
