package com.priyanshu;

public class LengthLastWord_58 {
    public static void main(String[] args) {

    }

    public int lengthOfLastWord(String s) {
        int ans = 0;
        boolean x = false;
        for (int i = s.length(); i >= 0; i--) {
            if (s.charAt(i) == ' ' && x) break;
            if (Character.isLetter(s.charAt(i))) {
                x = true;
                ans++;
            }
        }
        return ans;
    }
}
