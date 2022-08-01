package com.priyanshu;

import java.util.HashSet;

public class happyNumbr_202 {
    static boolean isHappy(int n) {
        HashSet<Integer> myset = new HashSet<>();
        while (n != 1) {
            if (myset.contains(n)) {
                return false;
            }
            myset.add(n);
            int x = 0;
            while (n != 0) {
                x += (n % 10) * (n % 10);
                n = n / 10;
            }
            n = x;
        }
        return true;
    }

    public static void main(String[] args) {

        System.out.println(isHappy(29));
    }
}

