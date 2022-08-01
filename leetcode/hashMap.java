package com.priyanshu;

import java.util.HashMap;

public class hashMap {
    static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> num = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            num.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            int rem = target - n;
            if (num.containsKey(rem)) {
                int index = num.get(rem);
                if (index == i) continue;
                return new int[]{i, index};
            }
        }
        return new int[]{};
    }
}
