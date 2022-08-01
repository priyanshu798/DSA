package com.priyanshu;

public class gridUniquePaths_62 {
    static int uniquePaths(int m, int n) {
return countPaths(m,n,0,0);
    }
    static int countPaths(int m, int n, int i, int j) {
        if ( i>=m || j>=n)return 0;
        if (i==m-1 && j==n-1) return 1;
        else return countPaths(m,n,i+1,j) + countPaths(m,n,i,j+1);
    }

    public static void main(String[] args) {
        System.out.println(uniquePaths(3,4));
    }
}
