package com.priyanshu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class longestConsecutiveSequence_128 {
    static int longestConsecutive(int[] nums) {
        HashSet<Integer> h = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            h.add(nums[i]);
        }
        int longestStreak = 1;
        for (int i = 0; i < nums.length; i++) {
            if (h.contains(nums[i] - 1)) {
                continue;
            } else {
                int x = 1;
                int currentStreak = 1;
                while (h.contains(nums[i] + x)) {
                    currentStreak++;
                    x++;
                    longestStreak = Math.max(currentStreak, longestStreak);
                }
            }
        }
        return longestStreak;
    }

    public static void main(String[] args) {
        int[] arr = {0, 0};
        System.out.println(longestConsecutive(arr));
        int x= arr[0];
        x = 100;
        System.out.println(Arrays.toString(arr));
        List<Integer> s = new ArrayList<>();
        s.add(1);
        s.add(2);
        x = s.get(0);
        x =100;
        System.out.println(s);
        List<List<Integer>> y = new ArrayList<>();
        y.add(s);
        List<Integer> p = new ArrayList<>(y.get(0));
        p.add(100);
        System.out.println(y);
    }
}
