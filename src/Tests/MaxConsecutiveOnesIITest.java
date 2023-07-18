package Tests;

import Algorithms.MaxConsecutiveOnesII;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaxConsecutiveOnesIITest {

    @Test
    void testSolution() {

        int[] nums = {1, 0, 1, 1, 0};
        int expectedResult = 4;

        MaxConsecutiveOnesII maxConsecutiveOnesII = new MaxConsecutiveOnesII();
        int actualResult = maxConsecutiveOnesII.solution(nums);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
