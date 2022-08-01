package com.priyanshu;

import java.util.Locale;
import java.util.Stack;

public class RemoveAdjacentDuplicates_1047 {
    public static void main(String[] args) {
        System.out.println(removeDuplicates("aaxxxxxxyy"));
    }

    static String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (stack.isEmpty()) {
                stack.push(s.charAt(i));
            } else if (stack.peek() != s.charAt(i)) {
                stack.push(s.charAt(i));
            } else {
                stack.pop();
            }

        }
        StringBuilder ans = new StringBuilder();
        while (!stack.isEmpty()) {
            ans.insert(0, stack.pop());
        }
    return ans.toString();
    }
}
