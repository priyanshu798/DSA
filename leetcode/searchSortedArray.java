package com.priyanshu;

public class searchSortedArray {
    static int search(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (nums[start] > nums[mid]) {
                end = mid - 1;
            } else start = mid;

        }
        return end;
    }

    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int ans = search(arr);
        System.out.println(ans);
    }
}
