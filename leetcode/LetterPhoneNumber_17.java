package com.priyanshu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterPhoneNumber_17 {
    public static void main(String[] args) {
        System.out.println(letterCombinations("3753"));
    }
    static List<String> letterCombinations(String digits) {
        String[] map = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

        List<String> ans = pad("", digits, map);
        return ans;
    }
    static List<String> pad (String p, String up, String[] map) {
        if (up.isEmpty()) {
            List<String> res = new ArrayList<>();
            res.add(p);
            return res;
        }


        char ch = up.charAt(0);
        List<String> ans = new ArrayList<>();
        for (int i = 0; i < map[Character.getNumericValue(ch)].length(); i++) {
           List<String> s = pad(p + map[Character.getNumericValue(ch)].charAt(i), up.substring(1), map);
           ans.addAll(s);
        }
   return ans;
    }
}
