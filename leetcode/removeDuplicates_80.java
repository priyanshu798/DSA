package com.priyanshu;

import java.util.Arrays;

public class removeDuplicates_80 {
    static int[] removeDuplicates(int[] nums) {
        int start=0;
        int end =1;
        int count=1;
        while ( end < nums.length) {
            if ( nums[end]==nums[start]) {
                if ( count==1 ) {
                    start++;
                    count++;
                }
                else {
                    end++;
                    count++;
                }
            }
            else {
                start++;
                count=1;
                nums[start]=nums[end];
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,1,2,3,3};
        System.out.println(Arrays.toString(removeDuplicates(nums)));
    }
}
