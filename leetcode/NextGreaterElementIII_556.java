package com.priyanshu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class NextGreaterElementIII_556 {
    public static void main(String[] args) {
        System.out.println(nextGreaterElement(230241));
    }

    static int nextGreaterElement(int n) {
        long s = n;
        int digits = 0;
        while (s > 0) {
            digits++;
            s /= 10;
        }
        s = n;
        int[] arr = new int[digits];
        for (int i = arr.length-1; i >= 0; i--) {
            arr[i] = (int)s % 10;
            s /= 10;
        }
        int i = arr.length - 2;
        while (i >= 0) {
            if (arr[i] < arr[i + 1]) {
                break;
            }
            i--;
        }
        if (i == -1) return -1;
        for (int j = arr.length - 1; j >= i; j--) {
            if (arr[j] > arr[i]) {
                swap(arr, i, j);
                break;
            }
        }
        int end = arr.length - 1;
        while (end > i + 1) {
            swap(arr, i + 1, end);
            i++;
            end--;
        }
        for (int j = arr.length - 1; j >= 0; j--) {
            s += arr[j] * Math.pow(10, arr.length - 1 - j);
        }
        if (s > Integer.MAX_VALUE)return -1;
        return (int)s;
    }

    static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }


}
