package com.priyanshu;

public class infiniteArraySearching {
   static int ans(int[] arr, int target) {
       int start =0; int end =1;
       while ( target > arr[end] ) {
           int newStart = end+1;
           end = end + (end-start+1)*2;
           start = newStart;
       }
       return binSearch(arr, target, start, end);
   }
    static int binSearch(int[] arr, int target, int start, int end) {



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
    return (start+end)/2;}
}