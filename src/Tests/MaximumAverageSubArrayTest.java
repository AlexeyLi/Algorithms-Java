package Tests;

import Algorithms.MaximumAverageSubarray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaximumAverageSubArrayTest {

    @Test
    void testMaximumAverageSubArray() {
        int[] nums = {1, 12, -5, -6, 50, 3};
        int k = 4;

        double expectedResult = 12.75;

        MaximumAverageSubarray maximumAverageSubarray = new MaximumAverageSubarray();
        double actualResult = maximumAverageSubarray.solution(nums, k);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
