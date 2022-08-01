package com.priyanshu;

import java.util.Arrays;

public class mostFrequentElement_1838 {
    static int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int frequency = 0;
        int maxFrequency = 0;

        for (int i = nums.length - 1; i > 0; i--) {
            int start = 0;
            int end = i - 1;
            int mid = start + (end - start) / 2;
            int sum = 0;
            for (int j = mid; j < i; j++) {
                sum += nums[j];

            }
            while (start >= end) {
                if ((i - mid) * (nums[i]) > sum + k) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
            frequency = i - start;
            if ( frequency>= maxFrequency) {
                maxFrequency= frequency;
            }
        }
    return maxFrequency;
    }
}
