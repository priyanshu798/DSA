package com.priyanshu;

import java.util.Locale;
import java.util.Stack;

public class DecodeString_394 {
    public static void main(String[] args) {
        System.out.println(decodeString("3[a2[c]]"));
    }

    static String decodeString(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<String> wordStack = new Stack<>();
        int number = 0;
        String word = "";
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                number = number * 10 + s.charAt(i) - '0';
            } else if (Character.isLetter(s.charAt(i))) {
                word+= s.charAt(i);
            } else if (s.charAt(i) == '[') {
                countStack.add(number);
                wordStack.add(word.toString());
                number = 0;
                word = "";
            } else {
                int count = countStack.pop();
                String duplicate = "";
                duplicate += wordStack.pop();
                for (int j = 0; j < count; j++) {
                    duplicate+= word;

                }
                word = duplicate;
            }
        }
        return word;
    }

}
