package com.priyanshu;

import java.util.Arrays;

public class selectionSort {
    static int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int maxIndex = maxIndex(arr, i);
            swap(arr, maxIndex, arr.length - i - 1);
        }
        return arr;
    }

    static int maxIndex(int[] arr, int end) {
        int max = 0;
        for (int i = 1; i < arr.length-end; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[second];
        arr[second] = arr[first];
        arr[first] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {0,65,-22,11};
        System.out.println(Arrays.toString(selectionSort(arr)));
    }
}
