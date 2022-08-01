package com.priyanshu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CombinationSumII_40 {
    public static void main(String[] args) {
        int[] arr = {2, 5, 2, 1, 2};
        System.out.println(combinationSum2(arr, 5));
    }

    static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<Integer> l = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        combSum(candidates, target, l, ans, 0);
        return ans;
    }

    static void combSum(int[] candidates, int target, List<Integer> l, List<List<Integer>> ans, int index) {
        if (target == 0) {

            ans.add(new ArrayList<>(l));

            return;
        }
        for (int i = index; i < candidates.length; i++) {
           if (target - candidates[i] < 0) {
               break;
           }
           if (i > index && candidates[i] == candidates[i-1])continue;
           if (target - candidates[i] >= 0) {
               l.add(candidates[i]);
               combSum(candidates, target - candidates[i], l, ans, i+1);
               l.remove(l.size()-1);
           }
        }
    }
}
