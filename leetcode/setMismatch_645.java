package com.priyanshu;

import java.util.Arrays;

public class setMismatch_645 {
    static int[] findErrorNums(int[] nums) {
        int[] ans = new int[2];
        int i = 0;
        while (i < nums.length) {
            if (nums[i] != i + 1 && nums[nums[i]-1]!= nums[i]) {
                swap(nums, i, nums[i] - 1);
            } else {
                i++;
            }

        }
        for ( int j=0; j < nums.length; j++) {
            if (nums[j] != j+1) {
                ans[0]=nums[j];
                ans[1]= j+1;
            }
        }
        return ans; }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[second];
        arr[second] = arr[first];
        arr[first] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {2,2};
        System.out.println(Arrays.toString(findErrorNums(nums)));
    }
}
