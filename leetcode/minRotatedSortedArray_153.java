package com.priyanshu;

public class minRotatedSortedArray_153 {
    static int findMin(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        while ( start <= end ) {
            int mid = start + ( end - start )/2;
            if (start == mid) {
                if (nums[end] > nums[start]) {
                        start++;
                }
                break;
            }
            if ( nums[start] > nums[mid] ) {
                end = mid-1;
            }
            else if ( nums[start] == nums[mid]) {
                start = mid+1;
            }
            else start =mid;
        }
        int ans = nums[(start+1)%nums.length];
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {2,1};
        System.out.println(findMin(arr));
    }
}
