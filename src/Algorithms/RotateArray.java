package Algorithms;

public class RotateArray {

    public int[] rotate(int[] nums, int k) {
        while (k > 0) {

            int n = nums.length - 1;
            int lastNum = nums[n];

            while (n > 0) {

                nums[n] = nums[n - 1];
                n -= 1;
            }
            nums[0] = lastNum;
            k -= 1;
        }
        return nums;
    }
}
