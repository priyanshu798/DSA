package com.priyanshu;

import java.util.*;

public class theatreTickets {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        for (int i = 0; i < t; i++) {
            int n = in.nextInt();
            int[] nums = new int[n];
            for (int j = 0; j < n; j++) {
                nums[j] = in.nextInt();
            }
            int ans = 0;
            int a = 0;
            int b = n - 1;
            int aWeight = nums[a];
            int bWeight = nums[b];
            int totalCandies = 0;
            while (b - a > 0) {

                totalCandies = a + 1 + n - b;
                if (aWeight > bWeight) {
                    b--;
                } else if (aWeight < bWeight) {
                    a++;
                } else {
                    ans = totalCandies;
                    a++;
                    b--;
                }
                aWeight += nums[a + 1];
                bWeight += nums[b - 1];
                totalCandies = 0;
            }
            System.out.println(ans);
        }
    }
}

