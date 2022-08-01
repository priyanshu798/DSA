package com.priyanshu;

import java.util.Scanner;

public class fibonaciiNo {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//
//        int t = in.nextInt();
//        for (int i = 0; i < t; i++) {
//            int a = in.nextInt();
//            int b = in.nextInt();
//            int n = in.nextInt();
//
//            int c = 0;
//            for (int j = 1; j < n; j++) {
//                c = a ^ b;
//               a = b;
//               b = c;
//            }
//            System.out.println(c);
//        }


        Scanner in = new Scanner(System.in);

        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            int n = in.nextInt();
            int d=0;
            for ( int j = 3; j < n; j++ ) {
                d = a+b+c;
                a=b;
                b=c;
                c=d;
            }

            System.out.println(d);
        }

    }


//    static int fibo(int n) {
//        if (n < 2) {
//            return n;
//        }
//        return fibo(n - 1) + fibo(n - 2);
//    }
}
