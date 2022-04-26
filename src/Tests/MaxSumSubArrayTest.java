package Tests;

import Algorithms.MaxSumSubArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaxSumSubArrayTest {

    @Test
    void testMaxSumSubArrayBruteForce() {
        int[] nums = {-2, -3, 4, -1, -2, 1, 5, -1};
        int expectedResult = 7;

        MaxSumSubArray maxSumSubArray = new MaxSumSubArray();
        int actualResult = maxSumSubArray.maxSumSubArrayBruteForce(nums);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void testMaxSumSubArray() {
        int[] nums = {-2, -3, 4, -1, -2, 1, 5, -1};
        int expectedResult = 7;

        MaxSumSubArray maxSumSubArray = new MaxSumSubArray();
        int actualResult = maxSumSubArray.maxSumSubArray(nums);
        Assertions.assertEquals(expectedResult, actualResult);
    }
}
