package com.priyanshu;

import java.util.Arrays;

public class candySwap_888 {
    static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        Arrays.sort(aliceSizes);
        Arrays.sort(bobSizes);
        int sumA = 0;
        int sumB = 0;
        int ans2 = 0;
        int ans1 = 0;
        for (int i = 0; i < aliceSizes.length; i++) {
            sumA += aliceSizes[i];
        }
        for (int i = 0; i < bobSizes.length; i++) {
            sumB += bobSizes[i];
        }
        for (int i = 0; i < aliceSizes.length; i++) {
            ans1 = aliceSizes[i];
            int target = (2 * aliceSizes[i] + sumB - sumA) / 2;
            ans2 = binSearch(bobSizes, target);
            if (ans2 == target) {
                break;
            }
        }
        int[] arr = new int[2];
        arr[0] = ans1;
        arr[1] = ans2;
        return arr;
    }

    static int binSearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target > arr[mid]) {
                start = mid + 1;

            } else end = mid - 1;
        }
        return arr[start];
    }

    public static void main(String[] args) {
        int[] a = {35, 17, 4, 24, 10};
        int[] b = {63, 21};
        int[] ans = fairCandySwap(a,b);
        System.out.println(Arrays.toString(ans));
    }
}
