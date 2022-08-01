package com.priyanshu;

public class ValidSudoku_36 {
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
        System.out.println(isValidSudoku(board));
    }

    static boolean isValidSudoku(char[][] board) {
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board.length; col++) {
            if (board[row][col] != '.') {
                int number = Character.getNumericValue(board[row][col]);
                if ( !isSafe(board, row,col, number)) {
                    return false;
                }
            }
            }
        }
        return true;
    }

    static boolean isSafe(char[][] board, int row, int col, int number) {
        //search col
        for (int i = 0; i < board.length; i++) {
            if (i==row)continue;
            if (Character.getNumericValue(board[i][col]) == number) return false;
        }
        //search row
        for (int i = 0; i < board.length; i++) {
            if (i==col)continue;
            if (Character.getNumericValue(board[row][i]) == number) return false;
        }
        //search box
        int rowStart = (row / 3);
        rowStart *= 3;
        int colStart = (col / 3);
        colStart *= 3;
        for (int i = rowStart; i < rowStart + 3; i++) {
            for (int j = colStart; j < colStart + 3; j++) {
                if (i==row && j == col)continue;
                if (Character.getNumericValue(board[i][j]) == number) return false;
            }
        }
        return true;
    }
}
