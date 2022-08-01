package com.priyanshu;

import java.util.Arrays;
import java.util.List;

public class ReverseWordsString_151 {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder();
        s.append("asfgf");

        StringBuilder t = new StringBuilder();
        t.append("Asdasf");
        s.insert(0, t);
        System.out.println(s);
        System.out.println(reverseWords("      hello      world     "));

    }

    static String reverseWords(String s) {

        StringBuilder ans = new StringBuilder();
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            temp.append(s.charAt(i));
            if (s.charAt(i) == ' ') {
                temp.delete(temp.length() - 1, temp.length());
                ans.insert(0, temp);
                temp.delete(0, temp.length());
                if (i < s.length() - 1 && s.charAt(i + 1) != ' ' && !ans.isEmpty()) {
                    ans.insert(0, ' ');
                }
            }
        }

        ans.insert(0, temp);
        return ans.toString();
    }
}
