package com.priyanshu;

import java.util.Arrays;

public class patternRecursions {
    public static void main(String[] args) {
        int[] arr = {3, 6, 2, 1, 5, 7, 9, 8, 4};
        selection(arr, 9, 0, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void triangle(int r, int c) {
        if (r == 0) return;
        if (c < r) {
            System.out.print("*");
            triangle(r, c + 1);


        } else {
            System.out.println();
            triangle(r - 1, 0);

        }
    }

    static void bubble(int[] arr, int r, int c) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            if (arr[c] > arr[c + 1]) {
                int temp = arr[c];
                arr[c] = arr[c + 1];
                arr[c + 1] = temp;
            }
            bubble(arr, r, c + 1);
        } else {
            bubble(arr, r - 1, 0);
        }
    }

    static void selection(int[] arr, int r, int c, int max) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            if (arr[c] > arr[max]) {
                selection(arr, r, c + 1, c);
            } else {
                selection(arr, r, c + 1, max);
            }
        } else {
            int temp = arr[max];
            arr[max] = arr[r - 1];
            arr[r - 1] = temp;
            selection(arr, r - 1, 0, 0);
        }
    }
}
