package com.priyanshu;

import java.util.Arrays;

public class repeatAndMissingNo {
    static int[] repeatedNumber(final int[] A) {
        int[] nums = new int[A.length];
        int[] ans = new int[2];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = A[i];
        }
        int i = 0;
        while (i < nums.length) {
            if (nums[i] != i + 1) {
                if (nums[nums[i] - 1] != nums[i]) {
                    swap(nums, i, nums[i] - 1);
                } else {
                    ans[0] = nums[i];
                    i++;
                }
            } else {
                i++;
            }

        }
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] == ans[0] && j != ans[0] - 1) ans[1] = j + 1;
        }
        return ans;
    }


    static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 4, 1, 6, 8, 3, 4};
        System.out.println(Arrays.toString(repeatedNumber(arr)));
    }
}
