package com.priyanshu;

import java.util.*;

import static java.lang.Math.E;

public class TaskScheduler_621 {
    public static void main(String[] args) {
        char[] arr = {'A', 'A', 'A', 'B', 'B', 'B'};
        System.out.println(leastInterval(arr, 2));
    }

    static int leastInterval(char[] tasks, int n) {
        Map<Character, Integer> counts = new HashMap<>();
        for (char c : tasks) {
            counts.put(c, counts.getOrDefault(c, 0) + 1);
        }
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        q.addAll(counts.values());
        int ans = 0;
        while (!q.isEmpty()) {
            int time = 0;
            List<Integer> tmp = new ArrayList<>();
            for (int i = 0; i < n + 1; i++) {
                if (!q.isEmpty()) {
                    tmp.add(q.remove() - 1);
                    time++;
                }
            }
            for (int t : tmp) {
                if (t > 0) q.add(t);

            }
            if (q.isEmpty()) ans += time;
            else ans += n + 1;
        }

        return ans;
    }
}
