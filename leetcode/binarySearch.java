package com.priyanshu;

public class binarySearch {

    static int binSearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if  (target > arr[mid]) {
                start = mid + 1;

            }
            else end= mid-1;
        }
       return arr[start];
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 5, 12, 21, 25, 31, 36, 44, 46, 47, 67, 77, 86, 99, 104, 331, 333};
        int target = 300;
        int ans = binSearch(nums, target);
        System.out.println(ans);
    }

}
