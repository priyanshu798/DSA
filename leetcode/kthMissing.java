package com.priyanshu;

public class kthMissing {
    static int findKthPositive(int[] arr, int k) {
        int missingCount = 0;
        int current = 0;
        for ( int i=0; i< arr.length; i++) {
            if ( arr[i] - i - 1 >missingCount) {
                missingCount = arr[i] -i -1;
               current = arr[i] -1;
               if ( missingCount >= k) {
                   current = current - missingCount+k;
                   break;
               }
            }
        }
if (missingCount < k) {
    current = arr[arr.length-1] + k - missingCount;
}
        return current; }

    public static void main(String[] args) {
        int arr[] = {5,6,7,9,11,24,345};
        int ans = findKthPositive(arr, 5);
        System.out.println(ans);
    }
}
