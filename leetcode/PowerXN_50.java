package com.priyanshu;

public class PowerXN_50 {
    static double myPow(double x, int n) {
        if (n == 0 || x == 1) return 1;
        if (n > 0) {
            if (n == 1) return x;
            if (n % 2 == 0) {
                return myPow(x * x, n / 2);
            } else {
                return x * myPow(x, n - 1);
            }
        } else {
            if (n == -1) {
                return 1 / x;
            }
            if (n % 2 == 0) return myPow(x * x, n / 2);
            else {
                return myPow(x, n + 1) / x;
            }

        }

    }


    public static void main(String[] args) {
        System.out.println(myPow(34.00515, -3));
    }
}
