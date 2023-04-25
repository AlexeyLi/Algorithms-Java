package Tests;

import Algorithms.MinAndMaxNumInArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MinAndMaxNumInArrayTest {

    @Test
    void testMinAndMax() {
        int[] nums = {3, 34, 5, 49, -1, 0, 15};
        int[] expectedResult = {-1, 49};

        MinAndMaxNumInArray minAndMaxNum = new MinAndMaxNumInArray();
        int[] actualResult = minAndMaxNum.minAndMaxNum(nums);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}
