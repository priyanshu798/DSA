package com.priyanshu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subsets {

    public static void main(String[] args) {
        int[] nums = {4,4,4,1,4};
        System.out.println(subsets(nums));
    }

    static void subsetStr(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subsetStr(p + ch, up.substring(1));
        subsetStr(p, up.substring(1));

    }

    static List<String> subsetStrRet(String p, String up) {
        if (up.isEmpty()) {
            List<String> s = new ArrayList<>();
            s.add(p);
            return s;
        }
        List<String> l = subsetStrRet(p + up.charAt(0), up.substring(1));
        List<String> r = subsetStrRet(p, up.substring(1));
        r.addAll(l);
        return r;

    }

    static List<List<Integer>> subsets(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>());
        int end = 1;
        for (int i = 0; i < nums.length; i++) {
            int n = res.size();
            int start = 0;
            if ( i > 0 && nums[i] == nums[i-1]){
                start = end;
            }
            end = res.size();
            for (int j = start; j < n; j++) {
                List<Integer> s = new ArrayList<>(res.get(j));
                s.add(nums[i]);
               res.add(s);
            }

        }

        return res;
    }


}
