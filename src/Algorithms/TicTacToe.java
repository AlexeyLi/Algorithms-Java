package Algorithms;

import java.util.Arrays;

public class TicTacToe {

    public String solution(int[][] moves) {

        int[][][] wins = {
                {{0, 0}, {0, 1}, {0, 2}},
                {{1, 0}, {1, 1}, {1, 2}},
                {{2, 0}, {2, 1}, {2, 2}},
                {{0, 0}, {1, 0}, {2, 0}},
                {{1, 0}, {1, 1}, {1, 2}},
                {{2, 0}, {2, 1}, {2, 2}},
                {{0, 0}, {1, 1}, {2, 2}},
                {{0, 2}, {1, 1}, {1, 0}}};

        int[][] a = new int[3][];
        int[][] b = new int[3][];

        if (moves.length == 9) {
            return "Draw";
        } else {

            int y = 0;
            for (int i = 0; i < moves.length; i += 2) {
                a[y] = moves[i];
                y += 1;
            }

            int x = 0;
            for (int i = 1; i < moves.length; i += 2) {
                b[x] = moves[i];
                x += 1;
            }

            for (int i = 0; i < wins.length; i++) {
                if (Arrays.deepEquals(wins[i], a)) {
                    return "A";
                } else if (Arrays.deepEquals(wins[i], b)) {
                    return "B";
                }
            }
        }
        return "Pending";
    }
}
