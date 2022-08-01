package com.priyanshu;

public class BuySellStocksIII_123 {
    public static void main(String[] args) {
        int[] arr = {3,3,5,0,0,3,1,4};
        System.out.println(maxProfit(arr));
    }
    static int maxProfit(int[] prices) {
//        int[] prefix = new int[prices.length-1];
//        for (int i = 0; i < prefix.length; i++) {
//            prefix[i] = prices[i+1] - prices[i];
//        }
//        int ans = kadane(prefix, 0, prefix.length);
//        for (int i = 1; i < prefix.length -1; i++) {
//            int s = kadane(prefix, 0, i) + kadane (prefix, i, prefix.length);
//            ans = Math.max(ans, s);
//        }
//        return ans;

        int fb = Integer.MIN_VALUE;
        int sb = Integer.MIN_VALUE;
        int fs = 0;
        int ss = 0;
        for (int i = 0; i < prices.length; i++) {
            fb = Math.max(fb, -prices[i]);
            fs = Math.max(fs, fb + prices[i]);
            sb = Math.max(sb, fs - prices[i]);
            ss = Math.max(ss, sb + prices[i]);
        }
        return ss;
    }
    static int kadane (int[] prefix, int start, int end) {
        int max = 0;
        int current = 0;
        for (int i = start; i <end ; i++) {
            current += prefix[i];
            max = Math.max(current, max);
            if (current < 0){
                current = 0;
            }
        }
    return max;
    }
}
