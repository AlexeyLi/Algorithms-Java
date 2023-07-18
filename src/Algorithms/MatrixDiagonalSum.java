package Algorithms;

// LeetCode 1572.

// Given a square matrix mat, return the sum of the matrix diagonals.
// Only include the sum of all the elements on the primary diagonal
// and all the elements on the secondary diagonal that are not part of the primary diagonal.

public class MatrixDiagonalSum {

    public int solution(int[][] mat) {

        int n = mat.length; // Get the size of the matrix

        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += mat[i][i]; // Add elements from top-left to bottom-right diagonal

            // Check if the current row index is not equal to the mirrored row index
            // This is to avoid adding the same element twice for matrices with odd dimensions
            if (i != n - 1 - i) {
                sum += mat[i][n - 1 - i]; // Add elements from top-right to bottom-left diagonal
            }
        }

        return sum;
    }
    // Time: O(n)
    // Memory: O(1)
}
