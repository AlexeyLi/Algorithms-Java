package Tests;

import Algorithms.ReverseArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReverseArrayTest {

    @Test
    void testReverseArray() {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] expectedresult = {8, 7, 6, 5, 4, 3, 2, 1};

        ReverseArray reverseArray = new ReverseArray();
        int[] actualResult = reverseArray.reverseArray(nums);
        Assertions.assertArrayEquals(expectedresult, actualResult);
    }
}
