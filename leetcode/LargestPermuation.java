package com.priyanshu;

import java.util.Arrays;

public class LargestPermuation {
    public static void main(String[] args) {
        int[] A = {3, 2, 4, 1, 5 };
        System.out.println(Arrays.toString(solve(A, 3)));
    }
    static int[] solve(int[] A, int B) {
        int[] arr = new int[A.length+1];
        for (int i=0; i < A.length; i++) {
            arr[A[i]] = i;
        }
        for (int i=0; i < A.length; i++) {
            if (A[i] != A.length - i){
                swap(A, i, arr[A.length - i]);
                swap(arr, A[i], A[arr[A.length - i]]);
                B--;
            }
            if (B==0)break;
        }
        return A;}
    static void swap (int[] A, int l, int r) {
        int temp = A[l];
        A[l] = A[r];
        A[r] = temp;
    }
}
