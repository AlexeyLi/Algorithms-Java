package Algorithms;

// Leetcode 1380.

// Given an m x n matrix of distinct numbers, return all lucky numbers in the matrix in any order.
//A lucky number is an element of the matrix such that it is the minimum element in its row and maximum in its column.

import java.util.ArrayList;
import java.util.List;

public class LuckyNumberInMatrix {

    public List<Integer> solution(int[][] matrix) {

        List<Integer> result = new ArrayList<>();

        int rows = matrix.length;
        int cols = matrix[0].length;

        int[] rowMin = new int[rows];
        int[] colMax = new int[cols];

        // Find the minimum in a row
        for (int i = 0; i < rows; i++) {
            int minInRow = Integer.MAX_VALUE;
            for (int j = 0; j < cols; j++) {
                minInRow = matrix[i][j] < minInRow ? matrix[i][j] : minInRow;
            }
            rowMin[i] = minInRow;
        }

        // Find the max in a column
        for (int i = 0; i < cols; i++) {
            int maxInColumn = Integer.MIN_VALUE;
            for (int j = 0; j < rows; j++) {
                maxInColumn = matrix[j][i] > maxInColumn ? matrix[j][i] : maxInColumn;
            }
            colMax[i] = maxInColumn;
        }

        // Check for lucky numbers
        for (int i = 0; i < rowMin.length; i++) {
            for (int j = 0; j < colMax.length; j++) {
                if (matrix[i][j] == rowMin[i] && matrix[i][j] == colMax[j]) {
                    result.add(matrix[i][j]);
                }
            }
        }

        return result;
    }
}
