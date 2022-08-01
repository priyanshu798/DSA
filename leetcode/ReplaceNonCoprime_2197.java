package com.priyanshu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReplaceNonCoprime_2197 {
    public static void main(String[] args) {
        int[] arr = {287, 41, 49, 287, 899, 23, 23, 20677, 5, 825};
        System.out.println(replaceNonCoprimes(arr));
    }

    static List<Integer> replaceNonCoprimes(int[] nums) {
        List<Integer> res = new ArrayList<>();
        if (nums.length==1){
            res.add(nums[0]);
            return res;
        }
        int l = 0;
        int r = 2;
        if (hcf(nums[0], nums[1]) == 1) {
            res.add(nums[0]);
            res.add(nums[1]);
            l = 1;
        } else {
            res.add((nums[0] / hcf(nums[0], nums[1])) * nums[1]);
        }
        while (r < nums.length) {
            if (hcf(res.get(l), nums[r]) == 1) {
                res.add(nums[r]);
                l++;
                r++;
            } else {
               int lcm = (nums[r] / hcf(nums[r], res.get(l))) * res.get(l);
               res.remove(l);
               res.add(l, lcm);
               r++;
                while (l > 0 && hcf(res.get(l), res.get(l-1)) != 1) {
                    int lc = (res.get(l)/hcf(res.get(l), res.get(l-1)))*res.get(l-1);
                    res.remove(l);
                    res.remove(l-1);
                    res.add(lc);
                    l--;
                }
            }

        }

        return res;
    }

    static int hcf(int a, int b) {
        if (a == 0) {
            return b;
        }
        return hcf(b % a, a);
    }
}
