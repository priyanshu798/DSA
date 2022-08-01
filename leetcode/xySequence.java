package com.priyanshu;

import java.util.Scanner;

public class xySequence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int n = in.nextInt();
            int[] arr = new int[n];
            for ( int j=0; j < n; j++) {
                arr[j] = in.nextInt();
            }
            int[] ans = new int[n];
            for ( int j=0; j < n; j++) {
                ans[j] = arr[n-j];
            }

            System.out.println(ans);

        }
    }
    static long[] getMinMax(long[] a, long n)
    {
        long max = 1;
        for ( int i=0; i < a.length; i++) {
            if ( a[i] > max) {
                max = a[i];
            }
        }
        long min = max;
        for ( int i=0; i < a.length; i++) {
            if ( a[i] < min) {
                min = a[i];
            }
        }
        return new long[]{max, min};
    }

}
