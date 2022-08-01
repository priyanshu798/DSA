package com.priyanshu;

import java.util.Arrays;

public class mergeSortedArray_88 {
    static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int[] ans = new int[nums1.length];
        int index = 0;
        int i = 0;
        int j = 0;
        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                ans[index] = nums1[i];
                index++;
                i++;
            } else if (nums1[i] > nums2[j]) {
                ans[index] = nums2[j];
                index++;
                j++;
            } else {
                ans[index] = nums1[i];
                index++;
                i++;
                ans[index] = nums2[j];
                index++;
                j++;
            }

        }
        if (j < n) {
            for (int k = j; k < n; k++) {
                ans[index] = nums2[k];
                index++;
            }

        } else if (i < m) {
            for (int k = i; k < m; k++) {
                ans[index] = nums1[k];
                index++;
            }
        }
        for (int k = 0; k < nums1.length; k++) {
            nums1[k] = ans[k];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums1 = {0};
        int m = 0;
        int[] nums2 = {1};
        int n = 1;
        System.out.println(Arrays.toString(merge(nums1, m, nums2, n)));
    }


}
