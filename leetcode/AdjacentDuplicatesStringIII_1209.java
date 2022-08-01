package com.priyanshu;

import java.util.Stack;

public class AdjacentDuplicatesStringIII_1209 {
    public static void main(String[] args) {
        System.out.println(removeDuplicates("deeedbbcccbdaa", 3));
    }

    static String removeDuplicates(String s, int k) {
        int counter = 0;
        Stack<Character> stack = new Stack<>();
        Stack<Integer> c = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
          if (stack.isEmpty()) {
              stack.push(s.charAt(i));
              counter = 1;
              c.push(counter);
          }
          else {
              if (s.charAt(i) == stack.peek()) {
                   counter ++;
                  c.pop();
                  c.push(counter);
                  stack.push(s.charAt(i));
              }
              else {
                  counter = 1;
                  c.push(counter);
                  stack.push(s.charAt(i));
              }
          }

          if (counter == k) {
              for (int j = 0; j < k; j++) {
                  stack.pop();
              }
              c.pop();
              if (!c.isEmpty())counter = c.peek();
              else counter = 0;

          }
        }

        StringBuilder ans = new StringBuilder();
        while (!stack.isEmpty()) {
            ans.insert(0, stack.peek());
            stack.pop();
        }


        return ans.toString();



    }
}
