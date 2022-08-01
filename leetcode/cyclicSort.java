package com.priyanshu;

import java.lang.reflect.Array;
import java.util.Arrays;

import static com.priyanshu.selectionSort.swap;

public class cyclicSort {
    static int[] cycleSorting(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if (arr[i] != i + 1) {
                swap(arr, i, arr[i] - 1);
            } else {
                i++;
            }

        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {6, 3, 4, 1, 2, 5, 7};
        System.out.println(Arrays.toString(cycleSorting(arr)));
    }

}
