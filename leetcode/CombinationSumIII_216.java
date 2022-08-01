package com.priyanshu;

import java.util.ArrayList;
import java.util.List;

public class CombinationSumIII_216 {
    public static void main(String[] args) {
        System.out.println(combinationSum3(3, 7));
    }

    static List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        combinations(n, k, ans, temp, 0);
        return ans;
    }

    static void combinations(int n, int k, List<List<Integer>> ans, List<Integer> temp, int index) {
        if ( n < 0 || index > k)return;
        if (index == k) {
            if (n == 0) {
                ans.add(new ArrayList<>(temp));

            }
            return;
        }

        int sum = 0;
        for (int i = 0; i < temp.size(); i++) {
            sum += temp.get(i);
        }
        int min = index + 1;
        if (index > 0) min = temp.get(index - 1) + 1;
        int max = 9 - k + index + 1;

        for (int i = min; i <= max; i++) {
            temp.add(i);
            if (i <= n) {
                combinations(n - i, k, ans, temp, index + 1);

            }
            else {
                return;
            }
            temp.remove(temp.size() - 1);
        }

    }
}
