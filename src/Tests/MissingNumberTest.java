package Tests;

import Algorithms.MissingNumber;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MissingNumberTest {

    @Test
    void testBruteForceSolution() {

        int[] nums = {0, 1, 3, 4, 5, 6, 7, 8, 9};

        int expectedResult = 2;

        MissingNumber missingNumber = new MissingNumber();
        int actualResult = missingNumber.bruteForceSolution(nums);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void testSolution() {

        int[] nums = {0, 1, 3, 4, 5, 6, 7, 8, 9};

        int expectedResult = 2;

        MissingNumber missingNumber = new MissingNumber();
        int actualResult = missingNumber.solution(nums);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
