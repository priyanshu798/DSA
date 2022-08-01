package com.priyanshu;

//leetcode.com/problems/missing-number

import java.util.Arrays;

import static com.priyanshu.selectionSort.maxIndex;
import static com.priyanshu.selectionSort.swap;

class missingNo_268 {
    static int missingNumber(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            if (nums[i] != i && nums[nums[i] - 1] != nums[i]) {
                swap(nums, i, nums[i]);
            } else {
                i++;
            }


        }
        for (int j = 0; j < nums.length; j++) {
            if (j != nums[j]) {
                return j;
            }
        }
        return nums.length;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 3, 5};
        System.out.println(missingNumber(nums));
    }
}
