package com.priyanshu;

public class WordSearch_79 {
    public static void main(String[] args) {
        char[][] board = {{'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}};
        System.out.println(exist(board, "SEE"));
    }

    static boolean exist(char[][] board, String word) {
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[0].length; col++) {
                if (board[row][col] == word.charAt(0)) {
                    if (search(board, word.substring(1), row, col)) return true;
                }
            }
        }
        return false;
    }

    static boolean search(char[][] board, String word, int row, int col) {
        if (word.isEmpty()) {
            return true;
        }
        //down
        if (row < board.length - 1) {
            if (board[row + 1][col] == word.charAt(0)) {
                char ch = board[row][col];
                board[row][col] = '.';
                if (search(board, word.substring(1), row + 1, col)) return true;
                board[row][col] = ch;
            }
        }
        //right
        if (col < board[0].length - 1) {
            if (board[row][col + 1] == word.charAt(0)) {
                char ch = board[row][col];
                board[row][col] = '.';
                if (search(board, word.substring(1), row, col + 1)) return true;
                board[row][col] = ch;
            }
        }
        //up
        if (row > 0) {
            if (board[row - 1][col] == word.charAt(0)) {
                char ch = board[row][col];
                board[row][col] = '.';
                if (search(board, word.substring(1), row - 1, col)) return true;
                board[row][col] = ch;
            }
        }
        //left
        if (col > 0) {
            if (board[row][col - 1] == word.charAt(0)) {
                char ch = board[row][col];
                board[row][col] = '.';
                if (search(board, word.substring(1), row, col - 1)) return true;
                board[row][col] = ch;
            }
        }
        return false;
    }

}
