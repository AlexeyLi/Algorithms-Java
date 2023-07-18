package Tests;

import Algorithms.TicTacToe;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TicTacToeTest {

    @Test
    void testTicTacToe() {
        int[][] moves = {{0, 0}, {2, 0}, {1, 1}, {2, 1}, {2, 2}};
        String expectedResult = "A";

        TicTacToe ticTacToe = new TicTacToe();
        String actualResult = ticTacToe.solution(moves);

        Assertions.assertTrue(expectedResult.equals(actualResult));

    }
}
