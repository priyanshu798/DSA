package com.priyanshu;

import java.util.Arrays;

public class trappingRainWater_42 {
    static int trap(int[] height) {
//        int[] left = new int[height.length];
//        int x = 0;
//        for (int i = 0; i < left.length; i++) {
//            x = Math.max(x, height[i]);
//            left[i] = x;
//        }
//        x=0;
//        int[] right = new int[height.length];
//        for (int i = right.length-1; i >=0; i--) {
//            x = Math.max(x, height[i]);
//            right[i] = x;
//        }
//        x=0;
//        for (int i = 0; i < height.length; i++) {
//            if ( Math.min(left[i], right[i]) - height[i] >=0)
//            x += Math.min(left[i], right[i]) - height[i];
//        }
//    return x;

        int l = 0;
        int r = height.length - 1;
        int ans = 0;
        int lmax = 0;
        int rmax = 0;

        while (r >= l) {
            lmax = Math.max(lmax, height[l]);
            rmax = Math.max(rmax, height[r]);
            if (height[l] <= height[r]) {
                ans += lmax - height[l];
                l++;
            } else {
                ans += rmax - height[r];
                r--;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(trap(arr));
    }

}
