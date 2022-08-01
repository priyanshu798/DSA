package com.priyanshu;

public class searchRotatedArray_33 {
    static int search(int[] nums, int target) {
        int ans =-1;
        int start = 0;
        int end = nums.length-1;
        while ( start < end ) {
            int mid = start + ( end - start)/2;
            if ( nums[start] > nums[mid]) {
                end = mid-1;
            }
            else if ( nums[start] == nums[mid]) {
                start = mid+1;
            }
            else start =mid;
        }

        if ( target >= nums[0]) {
            ans = binSearch(nums, target, 0, start);
            if (nums[ans]!= target) {
                return -1;
            }
        }

        else {ans = binSearch(nums, target, start, nums.length-1);
            if (nums[ans]!= target) {
                return -1;
            }
        }
        return ans;
    }

    static int binSearch(int[] arr, int target, int start, int end)
    {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                break;
            }
        }
        return (start+end)/2;
    }

    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        System.out.println(search(nums, 0));
    }
}
