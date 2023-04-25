package Algorithms;

import java.util.HashMap;

public class SubArrayPrefixSums {

    public int[] zeroSumSubArray(int nums[]) {

        if (nums == null || nums.length == 0) {
            return null;
        }

        int sum = 0;
        HashMap<Integer, Integer> map = new HashMap();

        for (int i = 0; i < nums.length; i++) {
            if (sum == 0) {
                return new int[] {0, i};
            }

            if (map.containsKey(sum)) {
                return new int[] {map.get(sum) + 1, i};
            }

            map.put(sum, i);
        }

        return null;
    }

//    public int[] targetSumSubArray(int[] nums, int target) {
//
//        int sum = 0;
//
//        for (int i = 0; i < nums.length; i++) {
//            if (sum == target) {
//                return new int[] {0, i};
//            }
//        }
//    }
}
