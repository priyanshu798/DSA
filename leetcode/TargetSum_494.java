package com.priyanshu;

public class TargetSum_494 {
    public static void main(String[] args) {
        int[] nums = {1,1,1,1,1};
        System.out.println(findTargetSumWays(nums, 3));
    }
    static int findTargetSumWays(int[] nums, int target) {
        int ans = find(nums, target, 0);
        return ans;
    }

    static int find(int[] nums, int target, int index) {
        if (index == nums.length) {
            if (target==0)return 1;
            else return 0;
        }
        int ans = 0;
        ans += find(nums, target - nums[index], index + 1);
        ans += find(nums, target + nums[index], index + 1);
        return ans;
    }
}
