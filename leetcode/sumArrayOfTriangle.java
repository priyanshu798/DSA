package com.priyanshu;

import java.util.Arrays;

public class sumArrayOfTriangle {
    static int[] sumTriangle(int[] nums) {
        int[] arr = new int[nums.length - 1];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = nums[i] + nums[i + 1];
        }
        if (arr.length == 1) {
            return arr;
        }
        return sumTriangle(arr);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(sumTriangle(arr)));
    }
}
