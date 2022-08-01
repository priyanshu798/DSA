package com.priyanshu;

public class newtonSQRT {
    public static void main(String[] args) {
        System.out.println(sqrt(36));
    }

    static double sqrt(double n) {
        double x = n;
        double root = 0;

        while (x > 0) {
            root = (x + (n / x)) / 2;
            if (Math.abs(root - x) < 0.1) break;
            x = root;
        }
        return root;
    }




    static int hcf(int a, int b) {
        if (a == 0) return b;
        return hcf((b % a), a);
    }



    static int lcm(int a, int b) {
        int hcf = hcf(a, b);
        return a * b / hcf;
    }
}
