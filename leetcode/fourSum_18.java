package com.priyanshu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class fourSum_18 {
    static List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < nums.length - 3; i++) {
            for (int j = i + 1; j < nums.length - 2; j++) {
                int start = j + 1;
                int end = nums.length - 1;
                while (end > start) {
                    int sum = nums[i] + nums[j] + nums[start] + nums[end];
                    if (sum == target) {
                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[start]);
                        temp.add(nums[end]);
                        res.add(temp);
                        while (start < end && nums[start] == temp.get(2)) {
                            start++;
                        }
                        while (start < end && nums[end] == temp.get(3)) {
                            end--;
                        }

                    } else if (sum > target) {
                        end--;
                    } else {
                        start++;
                    }
                }
                while (j < nums.length - 1 && nums[j] == nums[j + 1]) {
                    j++;
                }
            }
            while (i < nums.length - 1 && nums[i] == nums[i + 1]) {
                i++;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[] arr = {-3,-2,-1,0,0,1,2,3};
        System.out.println(fourSum(arr, 0));
    }
}
