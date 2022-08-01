package com.priyanshu;

import java.util.Arrays;


public class FloodFill_733 {
    public static void main(String[] args) {
        int[][] arr = {{0, 0, 0}, {0, 0, 0}};
        int[][] ans = (floodFill(arr, 1, 0, 2));
        for (int i = 0; i < ans.length; i++) {
            System.out.println(Arrays.toString(ans[i]));
        }


    }

    static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if (image[sr][sc] == color) return image;
        int precolor = image[sr][sc];
        fill(image, sr, sc, color, precolor);
        return image;

    }

    static void fill(int[][] image, int r, int c, int color, int preColor) {
        if (r < 0 || r >= image.length || c < 0 || c >= image[r].length || image[r][c] != preColor) {
            return;
        }

        image[r][c] = color;
        fill(image, r + 1, c, color, preColor);
        fill(image, r, c + 1, color, preColor);
        fill(image, r - 1, c, color, preColor);
        fill(image, r, c - 1, color, preColor);
    }
}
