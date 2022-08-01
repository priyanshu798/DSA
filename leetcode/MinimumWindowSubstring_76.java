package com.priyanshu;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MinimumWindowSubstring_76 {
    public static void main(String[] args) {
        String s = "a";
        String t = "aa";
        System.out.println(minWindow(s,t));

    }

    static String minWindow(String s, String t) {

        String ans = "";
        String temp = new String();
        Map<Integer, String> map = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            String p = new String();
            p += (t.charAt(i));
            map.put(i, p);
        }
        int start = 0;
        int end = 0;
        while (end < s.length()) {
            boolean b = true;
            for (int i = 0; i < map.size(); i++) {
                b = b & s.substring(start, end+1).contains(map.get(i));
            }
            if (b) {
                temp = s.substring(start, end+1);
                if (temp.length() < ans.length() || ans == "" ) {
                    ans = temp;
                }
                start++;
            }
            else {
                end++;
            }
        }

        return ans;
    }
}
