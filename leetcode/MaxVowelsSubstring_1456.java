package com.priyanshu;

import java.util.Deque;
import java.util.LinkedList;

public class MaxVowelsSubstring_1456 {
    public static void main(String[] args) {
        System.out.println(maxVowels("leetcode", 3));
    }

    static int maxVowels(String s, int k) {
        int ans = 0;
        for (int i = 0; i < k; i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
                ans++;
            }
        }
        int count = ans;
        for (int i = k; i < s.length(); i++) {
            if (s.charAt(i - k) == 'a' || s.charAt(i - k) == 'e' || s.charAt(i - k) == 'i' || s.charAt(i - k) == 'o' || s.charAt(i - k) == 'u')
                count--;
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u')
                count++;
            ans = Math.max(ans, count);

        }
        return ans;
    }
}
