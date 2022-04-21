package Tests;

import Algorithms.DutchNationalFlag;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DutchNationalFlagTest {

    @Test
    void testDutchNationalFlag() {
        int[] nums = {5, 2, 4, 4, 6, 4, 4, 3};
        int[] expectedResult = {3, 2, 4, 4, 4, 4, 6, 5};

        DutchNationalFlag dutchNationalFlag = new DutchNationalFlag();
        int[] actualResult = dutchNationalFlag.dutchNationalFlag(nums, 4);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}
