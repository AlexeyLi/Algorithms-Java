package Algorithms;

// LeetCode 2133.

// An n x n matrix is valid if every row and every column contains all the integers from 1 to n (inclusive).
// Given an n x n integer matrix matrix, return true if the matrix is valid. Otherwise, return false.

import java.util.HashSet;

public class ValidMatrix {

    public boolean solution(int[][] matrix) {

        int n = matrix.length;

        for (int i = 0 ; i < n; i ++){
            HashSet<Integer> rows = new HashSet<>();
            HashSet<Integer> cols = new HashSet<>();

            for (int j = 0 ; j < n ; j++){
                rows.add(matrix[i][j]);
                cols.add(matrix[j][i]);
            }

            if (rows.size() != n || cols.size() != n){
                return false;
            }
        }

        return true;
    }
}
