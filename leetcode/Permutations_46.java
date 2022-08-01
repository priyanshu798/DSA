package com.priyanshu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutations_46 {
    public static void main(String[] args) {
        int[] ans = {1, 2, 2, 1};
        System.out.println(permute(ans));

    }

    static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> p = new ArrayList<>();
        per(p, nums, 0, res);
        return res;
    }

    static void per(List<Integer> p, int[] nums, int i, List<List<Integer>> ans) {
        if (i == nums.length) {
            if (!ans.contains(p)) {
                ans.add(new ArrayList<>(p));
            }
            return;
        }


        for (int j = 0; j <= p.size(); j++) {
            List<Integer> s = new ArrayList<>(p);
            s.add(j, nums[i]);
            per(s, nums, i + 1, ans);
        }


    }

}
