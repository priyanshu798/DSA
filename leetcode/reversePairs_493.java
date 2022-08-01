package com.priyanshu;

public class reversePairs_493 {
    static int reversePairs(int[] nums) {
        int ans =0;
        int i = nums.length-1;
        while ( i >0) {
            for (int j=0; j <i; j++) {
                if ((double)nums[j] > 2*(double)nums[i]){
                    ans++;
                }

            }
            i--; }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {2147483647,2147483647,2147483647,2147483647,2147483647,2147483647};
        System.out.println(reversePairs(arr));
    }
}
