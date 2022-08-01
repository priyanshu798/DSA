package com.priyanshu;

import java.util.Scanner;

public class equalLIS {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int n = in.nextInt();
            if (n % 2 == 0) {
                if (n == 2) {
                    System.out.println("NO");
                } else {
                    System.out.println("YES");
                    System.out.print(n / 2);
                    System.out.print(" ");
                    for (int j = 0; j < n / 2 - 2; j++) {
                        int s = n / 2 + 2 + j;
                        System.out.print(s);
                        System.out.print(" ");
                    }
                    System.out.print(n);
                    System.out.print(" ");
                    for (int j = 1; j < n / 2; j++) {
                        System.out.print(n / 2 - j);
                        System.out.print(" ");
                    }
                    System.out.print(n / 2 + 1);

                }

            } else {
                System.out.println("YES");

                for (int j = 0; j < n / 2; j++) {
                    System.out.print(j + 1);
                    System.out.print(" ");

                }
                for (int j = n / 2; j < n; j++) {
                    System.out.print(n + n / 2 - j);
                    System.out.print(" ");
                }
                System.out.println();


            }


        }
    }
}
