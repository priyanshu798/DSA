package com.priyanshu;

import java.util.Arrays;

public class ShortestSubarrayWithSumAtleastK_862 {
    public static void main(String[] args) {
        int[] arr = {1, 5,7,4,-14,2,-46,36,-32,45,-2,4};
        System.out.println(shortestSubarray(arr, 3));
    }
    static int shortestSubarray(int[] nums, int k) {
        int ans = -1;
        long[] prefix = new long[nums.length + 1];
        prefix[0] = 0;
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i-1] + nums[i-1];
        }
        int left = 0;
        int right = 1;

        System.out.println(Arrays.toString(prefix));
        return 1;
    }
}
