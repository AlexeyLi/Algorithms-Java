package Tests;

import Algorithms.TransposeMatrix;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TransposeMatrixTest {

    @Test
    void testTransposeMatrix() {

        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] expectedResult = {{1, 4, 7}, {2, 5, 8}, {3, 6, 9}};

        TransposeMatrix transposeMatrix = new TransposeMatrix();
        int[][] actualResult = transposeMatrix.solution(matrix);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}
