package com.priyanshu;

import java.util.Stack;

public class LongestValidParenthesis_32 {
    public static void main(String[] args) {
        System.out.println(longestValidParentheses("(((()(())()()())))))"));
    }

    static int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else {
                if (!stack.isEmpty() && s.charAt(stack.peek()) == '(') stack.pop();
                else stack.push(i);
            }
        }

        int ans = 0;
        if (stack.isEmpty()) return s.length();
        int end = s.length();
        int start = 0;
        while (!stack.isEmpty()) {
            start = stack.pop();
            ans = Math.max(ans, end - start - 1);
            end = start;
        }
        start = -1;
        ans = Math.max(ans, end - start - 1);
        return ans;
    }
}
