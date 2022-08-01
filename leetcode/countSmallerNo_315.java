package com.priyanshu;

import java.util.ArrayList;
import java.util.List;

public class countSmallerNo_315 {
    static List<Integer> countSmaller(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < nums.length - 1; i++) {
            int answer = 0;
            for (int j = i + 1; j < nums.length; j++) {

                if (nums[j] < nums[i]) {
                    answer++;
                }
            }
            ans.add(answer);

        }
        ans.add(0);
        return (ans);
    }

    public static void main(String[] args) {
        int[] nums = {5,2,6,1};
        System.out.println(countSmaller(nums));
    }
}
