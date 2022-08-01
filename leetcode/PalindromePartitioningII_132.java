package com.priyanshu;

public class PalindromePartitioningII_132 {
    public static void main(String[] args) {
        System.out.println(minCut("aab"));
    }
    static int minCut(String s) {
        int ans = s.length();
        int cuts = 0;
        partitioning(s, 0, 0, ans);
        return ans;
    }

    static void partitioning(String s, int cuts, int index, int ans) {
        if (index == s.length()) {
            ans = Math.min(ans, cuts - 1);
            return;
        }

        for (int i = index; i < s.length(); i++) {
            if (isPalindrome(s, index, i)) {
                partitioning(s, cuts + 1, i + 1, ans);
            }
        }

    }

    static boolean isPalindrome(String p, int start, int end) {
        while (end >= start) {
            if (p.charAt(start) != p.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }
}
