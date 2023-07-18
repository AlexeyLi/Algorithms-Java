package Tests;

import Algorithms.MatrixDiagonalSum;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MatrixDiagonalSumTest {

    @Test
    void testMatrixDiagonalSum() {

        int[][] mat = {{1, 1, 1, 1},
                {1, 1, 1, 1},
                {1, 1, 1, 1},
                {1, 1, 1, 1}};

        int expectedResult = 8;

        MatrixDiagonalSum matrixDiagonalSum = new MatrixDiagonalSum();
        int actualResult = matrixDiagonalSum.solution(mat);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
