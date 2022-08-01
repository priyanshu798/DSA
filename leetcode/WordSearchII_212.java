package com.priyanshu;

import java.util.ArrayList;
import java.util.List;

public class WordSearchII_212 {
    public static void main(String[] args) {
        char[][] board = {{'o', 'a', 'a', 'n'},
                {'e', 't', 'a', 'e', 'k'},
                {'i', 'h', 'k', 'r'},
                {'i', 'f', 'l', 'v'}};
        String[] words = {"oath", "pea", "eat", "rain"};
        System.out.println(findWords(board, words));
    }

    static List<String> findWords(char[][] board, String[] words) {
        List<String> res = new ArrayList<>();
        for (String k : words) {
            for (int row = 0; row < board.length; row++) {
                for (int col = 0; col < board[0].length; col++) {
                    if (board[row][col] == k.charAt(0)) {
                        if (search(board, k.substring(1), row, col, "")) {
                            if (!res.contains(k)) {
                                res.add(k);
                            }

                        }
                    }
                }
            }
        }
        return res;
    }

    static boolean search(char[][] board, String word, int row, int col, String s) {
        if (word.isEmpty()) {
            return true;
        }
        //down
        if (row < board.length - 1) {
            if (board[row + 1][col] == word.charAt(0)) {
                char ch = board[row][col];
                board[row][col] = '.';
                if (search(board, word.substring(1), row + 1, col, s + word.charAt(0))) {
                    board[row][col] = ch;
                    return true;
                }
                board[row][col] = ch;
            }
        }
        //right
        if (col < board[0].length - 1) {
            if (board[row][col + 1] == word.charAt(0)) {
                char ch = board[row][col];
                board[row][col] = '.';
                if (search(board, word.substring(1), row, col + 1, s + word.charAt(0))) {
                    board[row][col] = ch;
                    return true;
                }
                board[row][col] = ch;
            }
        }
        //up
        if (row > 0) {
            if (board[row - 1][col] == word.charAt(0)) {
                char ch = board[row][col];
                board[row][col] = '.';
                if (search(board, word.substring(1), row - 1, col, s + word.charAt(0))) {
                    board[row][col] = ch;
                    return true;
                }
                board[row][col] = ch;
            }
        }
        //left
        if (col > 0) {
            if (board[row][col - 1] == word.charAt(0)) {
                char ch = board[row][col];
                board[row][col] = '.';
                if (search(board, word.substring(1), row, col - 1, s + word.charAt(0))) {
                    board[row][col] = ch;
                    return true;
                }
                board[row][col] = ch;
            }
        }
        return false;
    }
}
