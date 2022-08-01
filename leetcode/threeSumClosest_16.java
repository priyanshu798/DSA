package com.priyanshu;

import java.util.Arrays;

public class threeSumClosest_16 {

    static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int ans = 114432;
        for (int i = 0; i < nums.length - 2; i++) {
            int start = i + 1;
            int end = nums.length - 1;
            while (end > start) {
                int sum = nums[i] + nums[start] + nums[end];
                if (Math.abs(sum - target) < Math.abs(ans - target)) {
                    ans = sum;
                }
                if (sum < target) {
                    start++;
                } else {
                    end--;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 2};
        System.out.println(threeSumClosest(arr, 0));
    }
}
