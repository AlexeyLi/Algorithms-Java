package Tests;

import Algorithms.LargestUniqueNumber;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LargestUniqueNumberTest {

    @Test
    void testLargestUniqueNumber() {

        int[] nums = {5, 7, 3, 9, 4, 9, 8, 3, 1};
        int expectedResult = 8;

        LargestUniqueNumber largestUniqueNumber = new LargestUniqueNumber();

        int actualResult = largestUniqueNumber.solution(nums);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
