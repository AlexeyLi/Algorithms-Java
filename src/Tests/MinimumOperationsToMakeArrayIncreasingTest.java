package Tests;

import Algorithms.MinimumOperationsToMakeArrayIncreasing;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MinimumOperationsToMakeArrayIncreasingTest {

    @Test
    void testSolution() {
        int[] nums = {1, 5, 2, 4, 1};
        int expectedResult = 14;

        MinimumOperationsToMakeArrayIncreasing minimumOperationsToMakeArrayIncreasing = new MinimumOperationsToMakeArrayIncreasing();
        int actualResult = minimumOperationsToMakeArrayIncreasing.solution(nums);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
