package com.priyanshu;

import java.util.ArrayList;
import java.util.List;

public class Combinations_77 {
    public static void main(String[] args) {
        System.out.println(combine(5, 4));
    }

    static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        combinations(n, k, ans, temp, 0);

        return ans;
    }

    static void combinations(int n, int k, List<List<Integer>> ans, List<Integer> temp, int index) {
        if (index == k) {
            ans.add(new ArrayList<>(temp));
            return;
        }
        int max = n - k + index + 1;
        int min = index + 1;
        for (int i = min; i <= max; i++) {
            if (temp.isEmpty() || (temp.size() > 0 && i > temp.get(temp.size() - 1))) {
                temp.add(i);
                combinations(n, k, ans, temp, index + 1);
                temp.remove(temp.size() - 1);

            }
        }
    }
}
