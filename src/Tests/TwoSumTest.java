package Tests;

import Algorithms.TwoSum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TwoSumTest {

    @Test
    void testTwoSumBruteForce() {
        int[] array = {6, 3, 5, 2, 1, 7};
        int target = 4;
        int[] expectedResult = {1, 4};
        TwoSum twoSum = new TwoSum();
        int[] actualResult = twoSum.twoSumBruteForce(array, target);
        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    void testTwoSumHashMap() {
        int[] array = {6, 3, 5, 2, 1, 7};
        int target = 4;
        int[] expectedResult = {1, 4};
        TwoSum twoSum = new TwoSum();
        int[] actualResult = twoSum.twoSumHashmap(array, target);
        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}
