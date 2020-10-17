package Tests;

import Algorithms.TwoSum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TwoSumTest {

    @Test
    void testTwoSumBrootForce() {
        int[] nums = {1, 4, 5, 2, 8, 5, 3, 7, 9};
        int target = 9;
        int[] expectedResult = {0, 4};
        Assertions.assertArrayEquals(expectedResult, TwoSum.twoSumBrootForce(nums, target));
    }

    @Test
    void testTwoSum() {
        int[] nums = {0, 4, 3, 0};
        int target = 0;
        int[] expectedResult = {0, 3};

        Assertions.assertArrayEquals(expectedResult, TwoSum.twoSum(nums, target));
    }
}
