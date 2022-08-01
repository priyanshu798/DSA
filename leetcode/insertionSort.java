package com.priyanshu;

import java.util.Arrays;

import static com.priyanshu.selectionSort.swap;

public class insertionSort {
    static int[] insertionSorting(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                } else {
                    break;
                }

            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {};
        System.out.println(Arrays.toString(insertionSorting(arr)));
    }
}
