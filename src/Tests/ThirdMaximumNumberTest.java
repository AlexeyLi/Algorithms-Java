package Tests;

import Algorithms.ThirdMaximumNumber;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ThirdMaximumNumberTest {

    @Test
    void testThirdMaximumNumber() {
        int[] nums = {2, 2, 3, 1};
        int expectedResult = 1;

        ThirdMaximumNumber thirdMaximumNumber = new ThirdMaximumNumber();
        int actualResult = thirdMaximumNumber.solution(nums);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
