package com.priyanshu;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class NoOfIslands_200 {
    public static void main(String[] args) {
        char[][] grid = {{'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'}, {'0', '0', '1', '0', '0'}, {'0', '0', '0', '1', '1'}};
        System.out.println(numIslands(grid));
    }

    static int numIslands(char[][] grid) {
        int ans = 0;

        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[0].length; col++) {
                if (grid[row][col] == '1') {
                    ans++;
                    convertWater(grid, row, col);
                }
            }
        }
        return ans;
    }

    private static void convertWater(char[][] grid, int row, int col) {
        if (row < 0 || row >= grid.length || col < 0 || col >= grid[0].length || grid[row][col] != '1') {
            return;
        }
        grid[row][col] = '0';
        convertWater(grid, row + 1, col);
        convertWater(grid, row - 1, col);
        convertWater(grid, row, col + 1);
        convertWater(grid, row, col - 1);
    }
}
