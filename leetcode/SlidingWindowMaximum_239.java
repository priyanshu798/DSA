package com.priyanshu;

import java.util.*;

public class SlidingWindowMaximum_239 {
    public static void main(String[] args) {
        int[] arr = {2, 7, 6, 3, 1, 9, 7, 5, 4, 3, 8, 0, 9};
        System.out.println(Arrays.toString(maxSlidingWindow(arr, 4)));
    }

    static int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> deq = new LinkedList<>();
        int[] ans = new int[nums.length - k + 1];
        for (int i = 0; i < k; i++) {
            while (!deq.isEmpty() && deq.getFirst() < i - k) {
                deq.removeFirst();
            }
            while (!deq.isEmpty() && nums[deq.getLast()] < nums[i]) {
                deq.removeLast();
            }
            deq.addLast(i);
            ans[0] = nums[deq.getFirst()];
        }

        for (int i = k; i < nums.length; i++) {
            while (!deq.isEmpty() && deq.getFirst() <= i - k) {
                deq.removeFirst();
            }
            while (!deq.isEmpty() && nums[deq.getLast()] < nums[i]){
                deq.removeLast();
            }
            deq.addLast(i);
            ans[i-k+1] = nums[deq.getFirst()];
        }

        return ans;
    }

}
