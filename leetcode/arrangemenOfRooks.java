package com.priyanshu;


import java.util.Scanner;

public class arrangemenOfRooks {
    public static void main(String[] args) {

        {
            Scanner in = new Scanner(System.in);
            int t = in.nextInt();
            while (t-- > 0) {
                int n = in.nextInt();
                int k = in.nextInt();
                int key1 = 0;
                int key2 = 0;
                if (n < 2 * k - 1) {
                    System.out.println(-1);
                } else {
                    for (int j = 0; j < n; j++) {
                        for (int l = 0; l < n; l++) {
                            if (j == l && key1 % 2 == 0 && key2 % 2 == 0 && k > 0) {
                                System.out.print('R');
                                k--;
                            } else {
                                System.out.print('.');
                            }
                            key1++;
                        }
                        System.out.println();
                        key2++;

                    }

                }
            }

        }
    }
}
