package com.priyanshu;

import java.util.ArrayList;
import java.util.List;

public class PermutationSequence_60 {
    public static void main(String[] args) {
        System.out.println(getPermutation(4, 24));
    }

    static String getPermutation(int n, int k) {
        int factorial = 1;
        List<Integer> num = new ArrayList<>();
        for (int i = 1; i < n; i++) {
            factorial = factorial * i;
            num.add(i);
        }
        num.add(n);
        k--;
        String ans = "";
        while (true) {
            ans += num.get(k / factorial);
            num.remove(k / factorial);
            if (num.size() == 0) break;
            k = k % factorial;
            factorial = factorial / num.size();
        }
        return ans;
    }
}
