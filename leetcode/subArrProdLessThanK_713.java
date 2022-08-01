package com.priyanshu;

public class subArrProdLessThanK_713 {
    static int numSubarrayProductLessThanK(int[] nums, int k) {
        if ( k<=1) return 0;
        int ans=0;
        int start=0;
        int end=0;
        int p=1;
        while ( end < nums.length) {
            p*= nums[end];
            while ( p >=k) p /=nums[start++];
            ans += end-start+1;
            end++;  }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {10,9,10,4,3,8,3,3,6,2,10,10,9,3};
        System.out.println(numSubarrayProductLessThanK(arr, 19));
    }
}
