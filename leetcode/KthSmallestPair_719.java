package com.priyanshu;

import java.util.Arrays;

public class KthSmallestPair_719 {
    public static void main(String[] args) {
    int[] arr = {1,14,11,15,6};
        System.out.println(smallestDistancePair(arr, 6));
    }

    static int smallestDistancePair(int[] nums, int k) {
        Arrays.sort(nums);
        int start = 0;
        int end = nums[nums.length - 1] - nums[0];
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (isSmallPairs(nums, k, mid)) {
                end = mid;
            } else start = mid + 1;
        }
        return start;
    }

    static boolean isSmallPairs(int[] nums, int k, int mid) {
        int left = 0;
        int count = 0;
        for (int right = 1; right < nums.length; right++) {
            while (nums[right] - nums[left] > mid) left++;
            count += right - left;
        }
        return count >= k;
    }
}
