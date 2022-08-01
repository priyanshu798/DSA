package com.priyanshu;

public class UniquePathIII_980 {
    public static void main(String[] args) {
        int[][] grid = {{1, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 2, -1}};
        System.out.println(uniquePathsIII(grid));
    }

    static int uniquePathsIII(int[][] grid) {
        int ans = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) ans = paths(grid, i, j);
            }

        }
        return ans;
    }

    static int paths(int[][] grid, int row, int col) {
        if (grid[row][col] == 2) {
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[0].length; j++) {
                    if (i == row && j == col) continue;
                    if (grid[i][j] != -1) return 0;
                }

            }
            return 1;
        }
        int ans = 0;
        //down
        if (row < grid.length - 1) {
            if (grid[row + 1][col] == 0 || grid[row + 1][col] == 2) {
                grid[row][col] = -1;
                ans += paths(grid, row + 1, col);
                grid[row][col] = 0;
            }
        }
        //right
        if (col < grid[0].length - 1) {
            if (grid[row][col + 1] == 0 || grid[row][col + 1] == 2) {
                grid[row][col] = -1;
                ans += paths(grid, row, col + 1);
                grid[row][col] = 0;
            }
        }
        //up
        if (row > 0) {
            if (grid[row - 1][col] == 0 || grid[row - 1][col] == 2) {
                grid[row][col] = -1;
                ans += paths(grid, row - 1, col);
                grid[row][col] = 0;
            }
        }
        // left
        if (col > 0) {
            if (grid[row][col - 1] == 0 || grid[row][col - 1] == 2) {
                grid[row][col] = -1;
                ans += paths(grid, row, col - 1);
                grid[row][col] = 0;
            }
        }
        return ans;
    }
}
