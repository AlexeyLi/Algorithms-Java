package Tests;

import Algorithms.SearchInsertPosition;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SearchInsertPositionTest {

    @Test
    void testSearchInsertPosition() {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 5;
        int expectedResult = 4;

        SearchInsertPosition searchInsertPosition = new SearchInsertPosition();
        int actualresult = searchInsertPosition.solution(nums, target);

        Assertions.assertEquals(expectedResult, actualresult);
    }
}
