package com.priyanshu;

import javax.swing.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class MostKFrequentElements_347 {
    public static void main(String[] args) {
    int[] arr = {1,2};
        System.out.println(Arrays.toString(topKFrequent(arr, 2)));
    }

    static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            pq.add(entry.getValue());
            if (pq.size() > k) pq.remove();
        }
        int[] ans = new int[k];
        for (int i = 0; i < k; i++) {
            ans[i] = getKey(map, pq.remove());
            map.remove(ans[i]);
        }
        return ans;

    }

    public static <K, V> K getKey(Map<K, V> map, V value) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (value.equals(entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;
    }
}
