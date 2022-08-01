package com.priyanshu;

import java.util.*;

public class RemoveInvalidParenthesis_301 {
    public static void main(String[] args) {
        System.out.println(removeInvalidParentheses("(((())(a)(b))v)((d()"));
    }

    static List<String> removeInvalidParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') stack.push('(');
            else if (s.charAt(i) == ')') {
                if (stack.isEmpty()) stack.push(s.charAt(i));
                else if (stack.peek() == '(') stack.pop();
                else if (stack.peek() == ')') stack.push(s.charAt(i));
            }
        }
        List<String> res = new ArrayList<>();
        HashSet<String> set = new HashSet<>();
        removal(s, res, stack.size(), set);
        return res;
    }

    static void removal(String s, List<String> res, int mr, HashSet<String> set) {
        if (set.contains(s)) return;
        set.add(s);
        if (mr == 0) {
            if (isValid(s)) res.add(s);
            return;
        }
        for (int i = 0; i < s.length(); i++) {
            String l = s.substring(0, i);
            String r = s.substring(i + 1);
            removal(l + r, res, mr - 1, set);
        }
    }

    static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') stack.push(s.charAt(i));
            if (s.charAt(i) == ')') {
                if (stack.isEmpty()) return false;
                if (stack.peek() != '(') return false;
                else {
                    stack.pop();
                }
            }
        }

        if (!stack.isEmpty()) return false;
        return true;
    }


}

