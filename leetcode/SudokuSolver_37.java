package com.priyanshu;

import java.util.Arrays;

public class SudokuSolver_37 {
    public static void main(String[] args) {
        char[][] board = {{'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};
        solveSudoku(board);
        for (int i = 0; i < board.length; i++) {
            System.out.println(Arrays.toString(board[i]));
        }

    }

    static void solveSudoku(char[][] board) {

        solve(board);

    }

    static boolean solve(char[][] board) {
        int row = -1;
        int col = -1;
        boolean emptyLeft = true;
        for (row = 0; row < board.length; row++) {
            for (col = 0; col < board.length; col++) {
                if (board[row][col] == '.') {
                    emptyLeft = false;
                    break;
                }
            }
            if (emptyLeft == false) break;
        }
        if (emptyLeft == true) {
            return true;
        } else {
            for (int number = 1; number <= 9; number++) {
                if (isSafe(board, row, col, number)) {
                    board[row][col] = (char) (number + '0');
                    if (solve(board)) {
                        return true;
                    } else {
                        board[row][col] = '.';
                    }
                }

            }
        }
        return false;
    }

    static boolean isSafe(char[][] board, int row, int col, int number) {
        //search col
        for (int i = 0; i < board.length; i++) {
            if (Character.getNumericValue(board[i][col]) == number) return false;
        }
        //search row
        for (int i = 0; i < board.length; i++) {
            if (Character.getNumericValue(board[row][i]) == number) return false;
        }
        //search box
        int rowStart = (row / 3);
        rowStart *= 3;
        int colStart = (col / 3);
        colStart *= 3;
        for (int i = rowStart; i < rowStart + 3; i++) {
            for (int j = colStart; j < colStart + 3; j++) {
                if (Character.getNumericValue(board[i][j]) == number) return false;
            }
        }
        return true;
    }

}
