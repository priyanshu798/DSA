package com.priyanshu;

public class nonDuplicate_540 {
    static int singleNonDuplicate(int[] nums) {
        int start =0;
        int end = nums.length-1;
        while ( start < end) {
            int mid = start + (end-start)/2;
            if ( nums[mid] != nums[mid-1] && nums[mid] != nums[mid+1]) {
                start = mid;
                break;
            }
            if ( mid%2==0) {
                if ( nums[mid] == nums[mid-1]) {
                    end = mid-1;
                }
                else if ( nums[mid] == nums[mid+1]) {
                    start = mid+1;
                }
            }
            else {
                if ( nums[mid] == nums[mid+1]) {
                    end = mid-1;
                }
                if ( nums[mid] == nums[mid-1]) {
                    start = mid+1;
                }
            }
        }
        return nums[start];  }

    public static void main(String[] args) {
        int[] nums = {3,3,7,7,10,11,11};
        System.out.println(singleNonDuplicate(nums));
    }
}
