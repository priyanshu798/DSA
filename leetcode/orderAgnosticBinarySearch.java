package com.priyanshu;

public class orderAgnosticBinarySearch {
    static int orderBinSearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean inc = arr[end] > arr[start];
        int mid=0;
        if (inc) {
            if (target > arr[arr.length-1] )
                return -1;
        }
        else if ( target > arr[0]) {
            return -1;
        }
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (inc) {
                if (target > arr[mid]) {
                    start = mid + 1;
                } else if (target < arr[mid]) {
                    end = mid - 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else if (target < arr[mid]) {
                    start = mid + 1;
                }

            }
        }
        int ans=0;
        if ( inc) {
            ans= arr[start];
        }
        else ans = arr[end];
        return ans;
    }

    public static void main(String[] args) {
        int nums[] = {100, 98, 87, 84, 77, 68, 65, 63, 55, 54, 53, 51, 45, 32, 12, 9, 7, 6, 3, 2, 1};
        int target = 101;
        int ans = orderBinSearch(nums, target);
        System.out.println(ans);
    }
}