package com.priyanshu;

import java.util.HashMap;
import java.util.Map;

public class MakeLargeIsland_827 {
    public static void main(String[] args) {
        int[][] grid = {{1,0},{0,1}};
        System.out.println(largestIsland(grid));
    }

    static int largestIsland(int[][] grid) {
        int ans = 0;
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[0].length; col++) {
                if (grid[row][col] == 1) {
                    int current = helper(grid, row, col, 0);
                    ans = Math.max(ans, current);
                }
            }
        }
        return ans;

    }

    static int helper(int[][] grid, int row, int col, int zeroes) {
        if (row < 0 || row >= grid.length || col < 0 || col >= grid[0].length || grid[row][col] == 0 && zeroes == 1) {
            return 0;
        }

        int ans = 0;
        if (grid[row][col] == 1) {
            ans = 1;
            grid[row][col] = 2;
            ans += helper(grid, row + 1, col, zeroes);
            ans += helper(grid, row, col + 1, zeroes);
            ans += helper(grid, row - 1, col, zeroes);
            ans += helper(grid, row, col - 1, zeroes);
        }
        else if (grid[row][col] == 0) {
            ans = 1;
            grid[row][col] = 2;
            ans += helper(grid, row + 1, col, zeroes+1);
            ans += helper(grid, row, col + 1, zeroes+1);
            ans += helper(grid, row - 1, col, zeroes+1);
            ans += helper(grid, row, col - 1, zeroes+1);
        }
        return ans;
    }
}
