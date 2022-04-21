package Tests;

import Algorithms.ShortestUnsortedSubArray;
import com.sun.tools.javac.util.Pair;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ShortestUnsortedSubArrayTest {

    @Test
    void testShortestUnsortedSubArray() {
        int[] nums = {0, 2, 3, 1, 8, 6, 9};
        Pair<Integer, Integer> expectedResult = new Pair<>(1, 5);

        ShortestUnsortedSubArray shortestUnsortedSubArray = new ShortestUnsortedSubArray();
        Pair<Integer, Integer> actualresult = shortestUnsortedSubArray.shortestUnsortedSubArray(nums);

        Assertions.assertEquals(expectedResult, actualresult);
    }
}
