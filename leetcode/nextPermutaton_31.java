package com.priyanshu;

public class nextPermutaton_31 {
    static void nextPermutation(int[] nums) {
        int i=nums.length-2;
        while ( i >=0) {
            if ( nums[i] < nums[i+1]) {
                break;
            }
            i--;

        }
       if ( i==-1 ) {
           reverse(nums, 0);
       }
       else {
           int s = search(nums, i + 1, nums[i]);

           int temp = nums[i];
           nums[i] = nums[s];
           nums[s] = temp;
           reverse(nums, i + 1);
       }
    }
    static int search(int[]nums, int start, int base) {
        int a=100;
        int ans=0;
        for ( int i=start; i < nums.length; i++) {
            if (nums[i] <= a && nums[i] > base) {
                a = nums[i];
                ans = i;
            }
        }
        return ans;
    }
    static void reverse(int[] nums, int start) {
        int end = nums.length-1;
        while ( start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] nums = {2,3,1,3,3};
        nextPermutation(nums);
    }
}
