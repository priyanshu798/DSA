package com.priyanshu;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountDistinctElements {
    public static void main(String[] args) {
        int[] arr = {0,0,0,0,0,0,0,0,0,0};
        System.out.println(subarraySum(arr, 0));
    }

    static void countDistinctElements(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < k; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        System.out.println(map.size());

        for (int i = k; i < arr.length; i++) {

            if (map.get(arr[i - k]) == 1) {
                map.remove(arr[i - k]);
            } else {
                map.put(arr[i - k], map.get(arr[i - k]) - 1);
            }
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            System.out.println(map.size());

        }
    }

    static int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int currentSum = nums[0];
        int ans = 0;

        map.put(currentSum, 1);
        if (currentSum == k) ans++;
        for (int i = 1; i < nums.length; i++) {
            currentSum += nums[i];

            if (map.containsKey(currentSum - k)) {
                ans += map.get(currentSum - k);
            }
            if (currentSum - k == 0) {
                ans++;
            }
            map.put(currentSum, map.getOrDefault(currentSum, 0) + 1);
        }
        return ans;
    }


}
