package Tests;

import Algorithms.RemoveElementFromArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RemoveElementFromArrayTest {

    @Test
    void testRemoveElementFromArray() {
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};

        int expectedResult = 5;

        RemoveElementFromArray removeElementFromArray = new RemoveElementFromArray();
        int actualResult = removeElementFromArray.removeElementFromArray(nums, 2);
        Assertions.assertEquals(expectedResult, actualResult);
    }
}
