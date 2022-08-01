package com.priyanshu;

public class NKnights {
    public static void main(String[] args) {
        int n = 3;
        boolean[][] board = new boolean[n][n];
        knight(board, 0, 0, n);
    }

    static void knight(boolean[][] board, int row, int col, int knights) {


        if (knights == 0) {
            display(board);
            System.out.println();
            return;
        }
        if (row == board.length - 1 && col == board.length) {
            return;
        }

        if (col == board.length) {
            knight(board, row + 1, 0, knights);
            return;
        }

        if (isSafe(board, row, col)) {
            board[row][col] = true;
            knight(board, row, col + 1, knights - 1);
            board[row][col] = false;
        }
        knight(board, row, col + 1, knights);
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        if (row >= 2 && col >= 1 && board[row - 2][col - 1]) {
            return false;
        }
        if (row >= 2 && col <= board.length - 2 && board[row - 2][col + 1]) {
            return false;
        }
        if (row >= 1 && col >= 2 && board[row - 1][col - 2]) {
            return false;
        }
        if (row >= 1 && col <= board.length - 3 && board[row - 1][col + 2]) {
            return false;
        }
        return true;
    }

    private static void display(boolean[][] board) {
        for (boolean[] row : board) {
            for (boolean col : row) {
                if (col) {
                    System.out.print("N ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
    }
}
