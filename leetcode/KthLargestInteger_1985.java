package com.priyanshu;

import java.math.BigInteger;
import java.util.PriorityQueue;

public class KthLargestInteger_1985 {
    public static void main(String[] args) {
    String[] nums = {"3", "6", "7", "10"};
        System.out.println(kthLargestNumber(nums, 4));
    }

    static String kthLargestNumber(String[] nums, int k) {
        PriorityQueue<String> minHeap = new PriorityQueue<>();
        System.out.println(minHeap);
        for (String num : nums) {
            minHeap.offer(num);
            if (minHeap.size() > k) {
                minHeap.remove();
            }
        }

        return minHeap.remove();
    }
}
