package Tests;

import Algorithms.MaximumDifference;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaximumDifferenceTest {

    @Test
    void testMaximumDifference() {
        int arr[] = {25, 1, 2, 3, 4, 5, 6, 7, 8, 9, -5};
        int expectedResult = 30;
        int actualResult = MaximumDifference.maximumDiff(arr);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void testSortedArrMaximumDifference() {
        int arr[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, -5};
        int expectedResult = 14;
        int actualResult = MaximumDifference.sortedArrMaximumDiff(arr);
        Assertions.assertEquals(expectedResult, actualResult);
    }
}
