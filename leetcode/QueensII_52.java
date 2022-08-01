package com.priyanshu;

public class QueensII_52 {
    public static void main(String[] args) {
        System.out.println(totalNQueens(4));
    }
    static int totalNQueens(int n) {
        boolean[][] board = new boolean[n][n];
        int ans = queens(board, 0);
        return ans;
    }
    static int queens(boolean[][] board, int row) {
        if (row == board.length) {

            return 1;

        }
        int count = 0;
        //placing the queen
        for (int col = 0; col < board.length; col++) {
            //place the queen if it is safe
            if (isSafe(board, row, col)) {
                board[row][col] = true;
                count += queens(board, row + 1);
                board[row][col] = false;
            }
        }
        return count;
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        //check vertical row
        for (int i = 0; i < row; i++) {
            if (board[i][col] == true) return false;
        }
        //diagnol left
        int maxLeft = Math.min(row, col);
        for (int i = 1; i <= maxLeft; i++) {
            if (board[row - i][col - i] == true) return false;
        }
        //diagnol right
        int maxRight = Math.min(row, board.length - col - 1);
        for (int i = 1; i <= maxRight; i++) {
            if (board[row - i][col + i] == true) return false;
        }
        return true;
    }
}
