package com.priyanshu;

import java.util.ArrayList;
import java.util.List;

public class disappearedNumbers_448 {
    static List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            if (nums[i] != i + 1 && nums[nums[i] - 1]!=nums[i]  ) {
                swap(nums, i, nums[i] - 1);
            } else {
                i++;
            }

        }
        List<Integer> ans = new ArrayList<>();
        for ( int j=0; j < nums.length; j++) {
            if ( nums[j]!= j+1) {
                ans.add(j+1);
            }
        }
        return ans;  }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[second];
        arr[second] = arr[first];
        arr[first] = temp;
    }

    public static void main(String[] args) {
     int[] nums = {1,1};
        System.out.println(findDisappearedNumbers(nums));
         }
    }

