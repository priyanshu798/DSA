package com.priyanshu;

public class StringAdd_415 {
    static String addStrings(String num1, String num2) {
        StringBuilder res = new StringBuilder();
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int s = 0;
        int carry = 0;
        while (i >= 0 || j >= 0) {
            if (i >= 0 && j >= 0) s = num1.charAt(i) - '0' + num2.charAt(j) - '0' + carry;
            else if (i >= 0 && j < 0) s = num1.charAt(i) - '0' + carry;
            else if (i < 0 && j >= 0) s = num2.charAt(j) - '0' + carry;

            carry = 0;

            res.append(s % 10);
            if (s >= 10) carry = 1;
            i--;
            j--;
        }
        if (carry > 0) res.append(carry);
        res.reverse();
        return (String) (res.toString());
    }

    static boolean validPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        int counter = 0;
        while (left < right) {
            if (s.charAt(left) == s.charAt(right)) {
                left++;
                right--;
            }
            if (s.charAt(left) != s.charAt(right)) {
                counter++;
                if (right - left == 1) break;
                else {
                    if (s.charAt(left + 1) == s.charAt(right)) left++;
                    else if (s.charAt(left) == s.charAt(right - 1)) right--;
                    else return false;
                }
            }
        }
        if (left == right && counter ==0)return true;
        return counter < 2;
    }
    static int strStr(String haystack, String needle) {
        int ans = 0;
        if (haystack.length() - needle.length()==0){
            if (haystack.equals(needle))return 0;
            return -1;
        }
        for(int i = 0 ; i <= haystack.length() - needle.length(); i++) {
            if (haystack.substring(i, i + needle.length()).equals(needle)) {
                ans = i;
                return ans;
            }
        }
        if (ans==0)ans=-1;
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(strStr("abc", "c"));
    }

}
