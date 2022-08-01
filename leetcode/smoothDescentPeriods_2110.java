package com.priyanshu;

public class smoothDescentPeriods_2110 {
    static long getDescentPeriods(int[] prices) {
        long ans=0;
        long start=0;
        long end=1;
        while (end < prices.length) {
            if ( prices[(int)start] == prices[(int)end]+ (int)end - (int)start ) {
                ans+= end-start;
                end++;
            }
            else start++;
        }
        return ans + prices.length;
    }

    public static void main(String[] args) {
        int[] arr = {8,7,7,7};
        System.out.println(getDescentPeriods(arr));
    }

}
