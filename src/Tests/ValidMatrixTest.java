package Tests;

import Algorithms.ValidMatrix;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ValidMatrixTest {

    @Test
    void testValidMatrix() {

        int[][] matrix = {{1, 1, 1}, {1, 2, 3}, {1, 2, 3}};

        ValidMatrix validMatrix = new ValidMatrix();

        Assertions.assertFalse(validMatrix.solution(matrix));
    }
}
