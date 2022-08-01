package com.priyanshu;

public class factorial {
    static int factorialNo(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorialNo(n - 1);

    }

    static int sumOfDigits(int n) {
        if (n < 10) {
            return n;
        }
        return n % 10 + sumOfDigits(n / 10);
    }
static void reverseNo(int n) {
        if ( n < 10) {
            System.out.print(n);
            return;
        }
    System.out.print(n%10+" ");
        reverseNo(n/10);

}

    public static void main(String[] args) {
        reverseNo(12343247);
    }
}
