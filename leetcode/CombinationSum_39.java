package com.priyanshu;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum_39 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 6, 7};
        List<List<Integer>> s = combinationSum(arr, 7);
        for (int i = 0; i < s.size(); i++) {
            System.out.println(s.get(i));
        }
    }

    static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        combSum(candidates, target, l, ans, 0);
        return ans;
    }

    static void combSum(int[] candidates, int target, List<Integer> l, List<List<Integer>> ans, int index) {
        if (index == candidates.length) {
            if (target == 0) {
                ans.add(new ArrayList<>(l));

            }
            return;
        }
        if (target >= candidates[index]) {
            l.add(candidates[index]);
            combSum(candidates, target - candidates[index], l, ans, index);
            l.remove(l.size() - 1);
        }
        combSum(candidates, target, l, ans, index + 1);

    }

}


