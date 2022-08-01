package com.priyanshu;

public class romanToInteger_13 {
    static int romanToInt(String s) {
        int i = s.length() - 1;
        int ans = 0;
        while (i > 0) {
            if (s.charAt(i) == 'I') {
                ans++;
                i--;
                if (i <= 0) break;
            }
            if (s.charAt(i) == 'V' && s.charAt(i - 1) == 'I') {
                ans += 4;
                i = i - 2;
                if (i <= 0) break;

            }
            if (s.charAt(i) == 'V' && s.charAt(i - 1) != 'I') {
                ans += 5;
                i = i - 1;
                if (i <= 0) break;
            }
            if (s.charAt(i) == 'X' && s.charAt(i - 1) == 'I') {
                ans += 9;
                i = i - 2;
                if (i <= 0) break;
            }
            if (s.charAt(i) == 'X' && s.charAt(i - 1) != 'I') {
                ans += 10;
                i = i - 1;
                if (i <= 0) break;
            }
            if (s.charAt(i) == 'L' && s.charAt(i - 1) == 'X') {
                ans += 40;
                i = i - 2;
                if (i <= 0) break;
            }
            if (s.charAt(i) == 'L' && s.charAt(i - 1) != 'X') {
                ans += 50;
                i = i - 1;
                if (i <= 0) break;
            }
            if (s.charAt(i) == 'C' && s.charAt(i - 1) == 'X') {
                ans += 90;
                i = i - 2;
                if (i <= 0) break;
            }
            if (s.charAt(i) == 'C' && s.charAt(i - 1) != 'X') {
                ans += 100;
                i = i - 1;
                if (i <= 0) break;
            }
            if (s.charAt(i) == 'D' && s.charAt(i - 1) == 'C') {
                ans += 400;
                i = i - 2;
                if (i <= 0) break;
            }
            if (s.charAt(i) == 'D' && s.charAt(i - 1) != 'C') {
                ans += 500;
                i = i - 1;
                if (i <= 0) break;
            }
            if (s.charAt(i) == 'M' && s.charAt(i - 1) == 'C') {
                ans += 900;
                i = i - 2;
                if (i <= 0) break;
            }
            if (s.charAt(i) == 'M' && s.charAt(i - 1) != 'C') {
                ans += 1000;
                i = i - 1;
            }
        }
        if (i == 0) {
            if (s.charAt(0) == 'I') ans += 1;
            else if (s.charAt(0) == 'V') ans += 5;
            else if (s.charAt(0) == 'X') ans += 10;
            else if (s.charAt(0) == 'L') ans += 50;
            else if (s.charAt(0) == 'C') ans += 100;
            else if (s.charAt(0) == 'D') ans += 500;
            else if (s.charAt(0) == 'M') ans += 1000;
        }
        return ans;
    }

    public static void main(String[] args) {
        String s = "CMLII";
        System.out.println(romanToInt(s));
    }
}


