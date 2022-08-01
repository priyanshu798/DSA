package com.priyanshu;

import java.util.Arrays;
import java.util.Stack;

public class MostCompetetiveSubsequence_1673 {
    public static void main(String[] args) {
    int[] arr = {84,10,71,23,66,61,62,64,34,41,80,25,91,43,4,75,65,13,37,41,46,90,55,8,85,61,95,71};
        System.out.println(Arrays.toString(mostCompetitive(arr, 24)));
    }
    static int[] mostCompetitive(int[] nums, int k) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < nums.length; i++) {
            if (stack.size() == k - nums.length + i ){
                stack.push(nums[i]);
                continue;
            }
            while (!stack.isEmpty() && nums[i] < stack.peek()) {
                stack.pop();
            }
            stack.push(nums[i]);
        }
        while (stack.size() > k) {
            stack.pop();
        }
        int[] ans = new int[k];
        for (int i = ans.length - 1; i >= 0; i--) {
            ans[i] = stack.pop();
        }
        return ans;
    }
}
