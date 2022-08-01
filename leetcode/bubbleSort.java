package com.priyanshu;

import java.util.Arrays;

public class bubbleSort {

    static int[] bubble(int[] arr) {
        boolean swapped = false;
        for (int i = 0; i < arr.length; i++) {

            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }


        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {3, 6, 2, 1, 5, 7, 9, 8, 4};
        System.out.println(Arrays.toString(bubble(arr)));
    }

}

