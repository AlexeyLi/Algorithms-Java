package Tests;

import Algorithms.SubArraySum;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SubArraySumTest {

    @Test
    void testTwoSumSlidingWindow() {
        int[] nums = {5, 3, 1, 7, 6, 4, 2, 3};
        int[] expectedResult = {2, 4};

        SubArraySum subArraySum = new SubArraySum();
        int[] actualResult = subArraySum.subArraySumSlidingWindow(nums, 14);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}
