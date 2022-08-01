package com.priyanshu;

import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning_131 {
    public static void main(String[] args) {
        System.out.println(partition("aabb"));
    }

    static List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        List<String> k = new ArrayList<>();
        partitioning( s, res, k, 0);
        return res;
    }

    static void partitioning(String s, List<List<String>> res, List<String> k, int index) {
        if (index == s.length()) {
            res.add(new ArrayList<>(k));
            return;
        }

        for (int i = index; i < s.length(); i++) {
            if (isPalindrome(s, index, i)) {
                k.add(s.substring(index, i+1));
                partitioning(s, res, k, i + 1);
                k.remove(k.size()-1);
            }
        }

    }

    static boolean isPalindrome(String p, int start, int end) {
        while (end > start) {
            if (p.charAt(start) != p.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }
}
