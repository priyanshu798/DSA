package com.priyanshu;

import java.util.Arrays;

public class subarraySumK_560 {
    static int subarraySum(int[] nums, int k) {
        int ans = 0;
        int[] sumList = new int[nums.length + 1];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            sumList[i + 1] = sum;
        }
        for (int i = 1; i < sumList.length; i++) {
            ans += search(sumList, i, sumList[i] - k);
        }
        return ans;
    }

    static int search(int[] nums, int end, int k) {
        int ans = 0;
        for (int i = 0; i < end; i++) {
            if (nums[i] == k) {
                ans += 1;
            }

        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1};
        System.out.println((subarraySum(nums, 1)));
    }

}
