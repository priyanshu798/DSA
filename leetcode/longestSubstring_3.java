package com.priyanshu;

import java.util.HashMap;
import java.util.HashSet;

public class longestSubstring_3 {
    static int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> h = new HashMap<>();
        int max = 0;
        int l = 0;
        int r = 0;
        while (r < s.length()) {
            if (h.containsKey(s.charAt(r))) {
                l = Math.max(h.get(s.charAt(r))+1, l);
            }
            h.put(s.charAt(r), r);
            max = Math.max(max, r - l + 1);
            r++;
        }

        return max;
    }

    public static void main(String[] args) {
        String arr = "abcdabcbb";
        System.out.println(lengthOfLongestSubstring(arr));
    }
}
