package Algorithms;

// Given an array of numbers, replace each even number with two of the same number. e.g, [1,2,5,6,8, , , ,] -> [1,2,2,5,6,6,8,8].

public class CloneEvenNumbers {

    public int[] cloneEvenNumbers(int[] nums) {
        int end = nums.length;
        int lastNum = findLastNum(nums);

        for (int i = lastNum; i >= 0; i--) {
            if (nums[i] % 2 == 0) {
                end -= 1;
                nums[end] = nums[i];
                end -= 1;
                nums[end] = nums[i];
            } else {
                end -= 1;
                nums[end] = nums[i];
            }
        }
        return nums;
    }

    private int findLastNum(int[] nums) {
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] != -1) {
                return i;
            }
        }

        return -1;
    }
}
