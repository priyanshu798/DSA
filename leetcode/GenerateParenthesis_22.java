package com.priyanshu;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis_22 {
    public static void main(String[] args) {
        System.out.println(generateParenthesis(8));
    }
    static List<String> generateParenthesis(int n) {
        List<String> res = xyz("", n, n);

        return res;
    }
    static List<String> xyz (String p, int a, int b) {
        if ( a == 0 && b == 0) {
            List<String> s = new ArrayList<>();
            s.add(p);
            return s;
         }
        List<String> ans = new ArrayList<>();
        if ( a > 0)
        ans.addAll(xyz(p + '(', a-1, b));
        if (a != b && b > 0) {
            ans.addAll(xyz(p + ')', a, b-1));
        }
        return ans;
    }
}
