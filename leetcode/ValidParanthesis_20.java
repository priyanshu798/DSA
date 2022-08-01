package com.priyanshu;

import java.util.Stack;

public class ValidParanthesis_20 {
    public static void main(String[] args) {
        System.out.println(isValid("()[]{}"));
    }

    static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') stack.push(s.charAt(i));
            if (s.charAt(i) == ')') {
                if (stack.isEmpty()) return false;
                if (stack.peek() != '(') return false;
                else {
                    stack.pop();
                }
            }
            if (s.charAt(i) == '}') {
                if (stack.isEmpty()) return false;
                if (stack.peek() != '{') return false;
                else {
                    stack.pop();
                }
            }

            if (s.charAt(i) == ']') {
                if (stack.isEmpty()) return false;
                if (stack.peek() != '[') return false;
                else {
                    stack.pop();
                }
            }


        }
        if (!stack.isEmpty()) return false;
        return true;
    }
}
