package com.priyanshu;

import java.util.Arrays;
import java.util.Scanner;

public class noOfPairs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        for (int i = 0; i < t; i++) {
            int n = in.nextInt();
            int l = in.nextInt();
            int r = in.nextInt();
            int[] arr = new int[n];
            int ans =0;

            for (int j = 0; j <n ; j++) {
                arr[j] = in.nextInt();
            }
            Arrays.sort(arr);
            for (int j = 0; j < n-1; j++) {
                int start =j+1;
                int end = n-1;
                while ( end >= start) {
                    int mid = start + (end-start)/2;
                    if ( arr[j] + arr[mid] > r) {
                        end = mid-1;
                    }
                    else if ( arr[j] + arr[mid] < l) {
                        start = mid+1;
                    }
                    else {ans++;
                        start = mid+1;

                    }


                }

            }

            System.out.println(ans);
        }


    }
}
