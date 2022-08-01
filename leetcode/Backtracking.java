package com.priyanshu;

import java.util.Arrays;
import java.util.jar.JarOutputStream;

public class Backtracking {
    public static void main(String[] args) {
        boolean[][] maze = {{true, true, true},
                {true, true, true}, {true, true, true}};
        int[][] array = new int[maze.length][maze[0].length];
        mazeWithObstacles(1, "", maze, 0,0, array);
    }
    static void mazeWithObstacles (int n, String path, boolean[][] maze, int r, int c, int[][] array) {

        if (r== maze.length - 1 && c == maze[0].length - 1) {
            array[r][c] = n;
            for (int i = 0; i < array.length; i++) {
                System.out.println(Arrays.toString(array[i]));
            }
            System.out.println(path);
            System.out.println();
            return;
        }
        if (!maze[r][c]) {
            return;
        }

        maze[r][c] = false;
        array[r][c] = n;
        if ( r < maze.length -1 ) {

            mazeWithObstacles(n+1, path + 'D', maze, r+1, c, array);

        }
        if (c < maze[0].length - 1) {
            mazeWithObstacles(n+1, path + 'R', maze, r, c+1, array);

        }
        if ( r > 0 ) {
            mazeWithObstacles(n+1, path + 'U', maze, r-1, c, array);

        }
        if (c > 0) {

            mazeWithObstacles(n + 1, path + 'L', maze, r, c - 1, array);

        }
        maze[r][c] = true;
        array[r][c] = 0;
    }
}
