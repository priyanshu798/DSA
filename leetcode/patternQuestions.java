package com.priyanshu;

import org.w3c.dom.ls.LSOutput;

// how to approach
// 1. no. of lines = no. of rows = no of times outer loop will run
// 2. identify for every row no how many columns or type of elements in column
// 3. what do you need to print
public class patternQuestions {
    public static void main(String[] args) {

        pattern4(5);
    }

    static void pattern1(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern2(int n) {
        for (int rows = n - 1; rows >= 0; rows--) {
            for (int col = 0; col <= rows; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern3(int n) {
        for (int row = 0; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col);
            }
            System.out.println();
        }
    }

    static void pattern4(int n) {
        for (int rows = 1; rows <= n; rows++) {
            for (int col = 1; col <= rows; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int rows = n; rows < 2 * n; rows++) {
            for (int col = 1; col < 2 * n - rows; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern5(int n) {
        for (int rows = 1; rows <= n; rows++) {
            for (int col = 1; col <= n - rows; col++) {
                System.out.print(" ");
            }
            for (int col = 0; col < rows; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern6(int n) {
        for (int rows = 0; rows < n; rows++) {
            for (int col = 1; col <= rows; col++) {
                System.out.print(" ");
            }
            for (int col = 0; col < n - rows; col++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    static void pattern7(int n) {
        for (int rows = 1; rows <= n; rows++) {
            for (int col = 1; col <= 2 * n - 1 - rows; col++) {
                System.out.print(" ");
            }
            for (int i = 0; i < 2 * rows - 1; i++) {
                System.out.print("*");
            }
            for (int col = 1; col <= 2 * n - 1 - rows; col++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void pattern8(int n) {
        for (int rows = 1; rows <= n; rows++) {
            for (int col = 1; col <= 2 * n - 1 - rows; col++) {
                System.out.print(" ");
            }
            for (int i = 0; i < rows; i++) {
                System.out.print("* ");
            }
            for (int col = 1; col <= 2 * n - 1 - rows; col++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void pattern9(int n) {
        int k = 1;
        for (int rows = 1; rows <= n; rows++) {
            for (int col = 1; col <= rows; col++) {
                System.out.print(k + " ");
                k++;

            }
            System.out.println();
        }

    }
    static void triangle(int r, int c) {
        if (r==0)return;
        if ( c<r) {
            System.out.print("*");
            triangle(r, c+1);
        }
    }

}



