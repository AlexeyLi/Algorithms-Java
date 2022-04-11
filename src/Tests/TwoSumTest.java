package Tests;

import Algorithms.TwoSum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TwoSumTest {

    @Test
    void testTwoSumBruteForce() {
        int[] array = {6, 3, 5, 2, 1, 7};
        int target = 4;
        int[] expectedResult = {3, 1};
        TwoSum twoSum = new TwoSum();
        int[] actualResult = twoSum.twoSumBruteForce(array, target);
        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

}
