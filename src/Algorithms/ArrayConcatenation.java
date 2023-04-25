package Algorithms;

public class ArrayConcatenation {

    public int[] getConcatenation(int[] nums) {

        if (nums == null || nums.length == 0) {
            return null;
        }

        int n = nums.length;
        int result[] = new int[n * 2];

        for(int i = 0; i < n; i++){
            result[i] = nums[i];
            result[i + n] = nums[i];
        }

        return result;
    }
    // Time: O(n)
    // Memory: O(n)
}
