package Tests;

import Algorithms.RemoveDuplicatesFromSortedArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RemoveDuplicatesFromSortedArrayTest {

    @Test
    void testRemoveDuplicatesFromSortedArray() {
        int[] arr = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

        int expectedResult = 5;
        RemoveDuplicatesFromSortedArray removeDuplicatesFromSortedArray = new RemoveDuplicatesFromSortedArray();
        int actualResult = removeDuplicatesFromSortedArray.removeDuplicatesFromSortedArray(arr);
        Assertions.assertEquals(expectedResult, actualResult);
    }
}
