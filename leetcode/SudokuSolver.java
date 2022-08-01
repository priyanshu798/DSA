package com.priyanshu;

public class SudokuSolver {
    public static void main(String[] args) {
        int[][] board = { {3, 0, 6, 5, 0, 8, 4, 0, 0},
                {5, 2, 0, 0, 0, 0, 0, 0, 0},
                {0, 8, 7, 0, 0, 0, 0, 3, 1},
                {0, 0, 3, 0, 1, 0, 0, 8, 0},
                {9, 0, 0, 8, 6, 3, 0, 0, 5},
                {0, 5, 0, 0, 9, 0, 6, 0, 0},
                {1, 3, 0, 0, 0, 0, 2, 5, 0},
                {0, 0, 0, 0, 0, 0, 0, 7, 4},
                {0, 0, 5, 2, 0, 6, 3, 0, 0} };
        solve(board);
    }

    static boolean solve(int[][] board) {
        int row = -1;
        int col = -1;
        boolean emptyLeft = true;
        for (row = 0; row < board.length; row++) {
            for (col = 0; col < board.length; col++) {
                if (board[row][col] == 0) {
                    emptyLeft = false;
                    break;
                }
            }
            if (emptyLeft == false) break;
        }
        if (emptyLeft == true) {
            display(board);
            return true;
        } else {
            for (int number = 1; number <= 9; number++) {
                if (isSafe(board, row, col, number)) {
                    board[row][col] = number;
                    if (solve(board)) {
                        return true;
                    } else {
                        board[row][col] = 0;
                    }
                }

            }
        }
        return false;
    }

    private static void display(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }

    }


    static boolean isSafe(int[][] board, int row, int col, int number) {
        //search col
        for (int i = 0; i < board.length; i++) {
            if (board[i][col] == number) return false;
        }
        //search row
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] == number) return false;
        }
        //search box
        int rowStart = (row / 3);
        rowStart *= 3;
        int colStart = (col / 3);
        colStart *= 3;
        for (int i = rowStart; i < rowStart + 3; i++) {
            for (int j = colStart; j < colStart + 3; j++) {
                if (board[i][j] == number) return false;
            }
        }
        return true;
    }

}
