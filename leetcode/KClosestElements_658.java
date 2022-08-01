package com.priyanshu;

import java.util.*;

public class KClosestElements_658 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(findClosestElements(arr, 4, 3));
    }

    static List<Integer> findClosestElements(int[] arr, int k, int x) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(i, Math.abs(arr[i] - x));
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            pq.add(entry.getValue());
            if (pq.size() > k) pq.remove();
        }
        List<Integer> ans = new ArrayList<>();
        while (!pq.isEmpty()) {
            ans.add(arr[getKey(map, pq.remove())]);
            map.remove(ans.get(ans.size() - 1));
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
