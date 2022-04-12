package Tests;

import Algorithms.MoveZeroes;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoveZeroesTest {

    @Test
    void testMoveZeroesToEnd() {
        int[] array = {1, 0, 2, 5, 0, 8, 9, 0, 11};
        int[] expectedResult = {1, 2, 5, 8, 9, 11, 0, 0, 0};
        MoveZeroes moveZeroes = new MoveZeroes();
        int[] actualResult = moveZeroes.moveZeroes(array);
        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}
