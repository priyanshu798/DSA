package com.priyanshu;


import java.util.ArrayList;
import java.util.List;


public class NQueens_51 {
    public static void main(String[] args) {
        System.out.println(solveNQueens(10));
    }

    static List<List<String>> solveNQueens(int n) {
        List<List<String>> s = new ArrayList<>();
        boolean[][] board = new boolean[n][n];
        s.addAll(queens(board, 0));
        return s;
    }

    static List<List<String>> queens(boolean[][] board, int row) {
        if (row == board.length) {
            List<List<String>> res = new ArrayList<>();
            List<String> temp = p(board);
            res.add(temp);
            return res;
        }

        List<List<String>> ans = new ArrayList<>();
        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = true;
                ans.addAll(queens(board, row + 1));
                board[row][col] = false;
            }
        }
        return ans;
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

    static List<String> p(boolean[][] board) {
        List<String> res = new ArrayList<>();
        for (int row = 0; row < board.length; row++) {
            String temp = new String();
            for (int col = 0; col < board.length; col++) {
                if (board[row][col]) {
                    temp = temp + 'Q';
                } else {
                    temp = temp + '.';
                }
            }
            res.add(temp);
        }
        return res;
    }
}
