package com.priyanshu;

import java.util.Arrays;

public class binaryTwoD {
    static int search(int[][] grid) {
        int r = 0;
        int c = grid[0].length - 1;
        int ans =0;
        while (r < grid.length && c >= 0)  {
            if ( grid[r][c] > -1) {
                r++;
            }
            else  {
                ans += grid.length-r;
                c--;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[][] = {
                {4, 3, 2, -1},
                {3, 2, 1, -1},
                {1, 1, -1, -2},
                {-1, -1, -2, -3}
        };
        int ans = search(arr);
        System.out.println(ans);

    }
}
