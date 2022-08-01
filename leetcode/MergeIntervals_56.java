package com.priyanshu;

import jdk.swing.interop.SwingInterOpUtils;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals_56 {
    public static void main(String[] args) {
        int[][] interval = {{2,3}, {4,5}, {6,7}, {8,9}, {1,10}};
        System.out.println(merge(interval));
    }

    static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (arr1, arr2) -> Integer.compare(arr1[0], arr2[0]));
        List<Integer> list = new ArrayList<>();
        int s1 = 0;
        int min = intervals[0][0];
        int max = intervals[0][1];
        while (s1 < intervals.length) {
        min = Math.min(min, intervals[s1][0]);
            max = Math.max(max, intervals[s1][1]);
            if (s1 == intervals.length - 1 || max < intervals[s1+1][0]){
                min = Math.min(min, intervals[s1][0]);
                max = Math.max(max, intervals[s1][1]);
                list.add(min);
                list.add(max);
                System.out.println(list);
                min = Integer.MAX_VALUE;
                max = Integer.MIN_VALUE;
            }
            s1++;

        }



        int[][] ans = new int[list.size() / 2][2];
        int index = 0;
        int k = 0;
        for (int i = 0; i < list.size(); i++) {
            ans[index][k] = list.get(i);

            if (k == 0) k++;
            else {
                index++;
                k--;
            }
        }
        return ans;
    }
}
