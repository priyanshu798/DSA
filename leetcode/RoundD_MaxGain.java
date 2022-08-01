package com.priyanshu;

import java.util.Scanner;

public class RoundD_MaxGain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int n1 = in.nextInt();
            int[] arr1 = new int[n1];
            for (int j = 0; j < n1; j++) {
                arr1[j] = in.nextInt();
            }
            int n2 = in.nextInt();
            int[] arr2 = new int[n2];
            for (int j = 0; j < n2; j++) {
                arr2[j] = in.nextInt();
            }
            int k = in.nextInt();
            fnc(arr1, arr2, k);
        }
    }

    static void fnc(int[] arr1, int[] arr2, int k) {
        for (int i = 0; i <= k; i++) {
            int d1 = 0;
        }
    }
    static int st(int[] arr, int i) {
        int prefix[] = new int[arr.length+1];
        prefix[0] = 0;
        for (int j = 1; j <prefix.length ; j++) {
            prefix[j] = prefix[j-1] + arr[j-1];
        }
        int ans = 0;

   return 1;
    }

}
