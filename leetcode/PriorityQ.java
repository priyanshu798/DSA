package com.priyanshu;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQ {
    public static void main(String[] args) {
        int[] arr = {1,4,7,32,7,2,6,786,46,78,36,4567};
        System.out.println(s(arr, 3));
    }
    static int s (int[] nums, int k) {
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < nums.length; i++) {
            q.add(nums[i]);
            if (q.size() > k)q.remove();
        }

        return q.peek();
    }


}
