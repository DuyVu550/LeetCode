package com.example.demo;

public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        boolean[][] rows = new boolean[9][9];
        boolean[][] cols = new boolean[9][9];
        boolean[][] boxes = new boolean[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char positionValue = board[i][j];
                // ignore "."
                if (positionValue == '.')
                    continue;
                // convert char to int
                int number = positionValue - '1';
                // Determine box index
                int boxIndex = (i / 3) * 3 + (j / 3);
                // Check if number existed in 1 of rows, cols or box
                if (rows[i][number] || cols[j][number] || boxes[boxIndex][number]) {
                    return false;
                }
                rows[i][number] = true;
                cols[j][number] = true;
                boxes[boxIndex][number] = true;
            }
        }
        return true;
    }
}
