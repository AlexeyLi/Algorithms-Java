package Tests;

import Algorithms.RunningSum;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RunningSumTest {

    @Test
    void testRunningSum() {
        int[] nums = {1, 2, 3, 4};
        int[] expectedResult = {1, 3, 6, 10};

        RunningSum runningSum = new RunningSum();
        int[] actualResult = runningSum.solution(nums);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}
