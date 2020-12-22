package Tests;

import Algorithms.MoveZeroes;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoveZeroesTest {

    @Test
    void testMoveZeroes() {
        // int[] nums = {0,1,0,3,0,12};
        int[] nums = {0,0,1};
        // int[] expectedResult = {1,3,12,0,0,0};
        int[] expectedResult = {1,0,0};
        MoveZeroes.moveZeroes(nums);
        Assertions.assertArrayEquals(expectedResult, nums);
    }
}


// 0, 0, 1
// 0, 1, 0
