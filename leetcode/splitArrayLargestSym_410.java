package com.priyanshu;

public class splitArrayLargestSym_410 {
    static int splitArray(int[] weights, int days) {
        int start = 0;
        int end = 0;
        for (int i = 0; i < weights.length; i++) {
            start = Math.max(start, weights[i]);
            end += weights[i];
        }
        while (end > start) {
            int mid = start + (end - start) / 2;
            int count = 1;
            int maxSum = 0;
            for (int i = 0; i < weights.length; i++) {
                maxSum += weights[i];
                if (maxSum > mid) {
                    maxSum = weights[i];
                    count++;
                }

            }
            if (count > days) {
                start = mid + 1;
            } else {
                end = mid;
            }

        }
        return start;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(splitArray(nums, 5));
    }
}
