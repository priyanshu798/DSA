package com.priyanshu;

import java.util.Arrays;

public class MaxSumCombinations {
    public static void main(String[] args) {
    int[] A = {59, 63, 65, 6, 46, 82, 28, 62, 92, 96, 43, 28, 37, 92, 5, 3, 54, 93, 83};
        System.out.println(Arrays.toString(solve(A, A, 10)));
    }
    static int[] solve(int[] A, int[] B, int C) {
        Arrays.sort(A);
        Arrays.sort(B);
        int a = A.length-1;
        int b = B.length-1;
        int[] ans = new int[C];
        for (int i =0; i < C; i++) {
           if (i%3==0){
               ans[i] = A[a] + B[b];
               continue;
           }
           if (A[a-1] + B[b] > A[a] + B[b-1]){
               ans[i] = A[a-1] + B[b];
           }
           else {
               ans[i] =  A[a] + B[b-1];
           }
           if (i%3==2){
               a--;
               b--;
           }
        }
        return ans;
    }
}
