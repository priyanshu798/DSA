package com.priyanshu;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElementII_503 {
    public static void main(String[] args) {
        int[] arr = {3, 8, 4, 1, 2};
        System.out.println(Arrays.toString(nextGreaterElements(arr)));
    }

    static int[] nextGreaterElements(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        for (int i = nums.length - 2; i >= 0; i--) {
            while (!stack.isEmpty() && nums[i] > stack.peek()) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                stack.push(nums[i]);
            }
            if (nums[i] < stack.peek()) {
                stack.push(nums[i]);
            }
        }
        int[] ans = new int[nums.length];

        System.out.println(stack);
        for (int i = nums.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && nums[i] >= stack.peek()) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                ans[i] = -1;
                stack.push(nums[i]);
            }
            if (nums[i] < stack.peek()) {
                ans[i] = stack.peek();
                stack.push(nums[i]);
            }
        }
        return ans;
    }
}
