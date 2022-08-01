package com.priyanshu;

public class ValidPalindrome_125 {
    public static void main(String[] args) {
        System.out.println(isPalindrome("OP"));
    }
    static boolean isPalindrome(String s) {
        String sh = "";
        for(int i =0; i <s.length(); i++) {
            if (Character.isLetter(s.charAt(i))){
        sh += s.charAt(i);
            }
        }
        sh = sh.toLowerCase();
        int start = 0;
        int end = sh.length() - 1;
        while (end > start) {
            if (sh.charAt(start) != sh.charAt(end))return false;
            start++;
            end--;
        }
        return true;
    }
}
