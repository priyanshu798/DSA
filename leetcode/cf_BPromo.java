package com.priyanshu;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class cf_BPromo {
    public static PrintWriter out = new PrintWriter(System.out);


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int q = in.nextInt();
        int[] price = new int[n];
        for (int i = 0; i < n; i++) {
            price[i] = in.nextInt();
        }
        Arrays.sort(price);
        long[] prefix = new long[n + 1];
        prefix[n] = price[0];
        for (int i = n - 1; i >= 0; i--) {
            prefix[i] = prefix[i + 1] + price[i];
        }


        for (int i = 0; i < q; i++) {
            int x = in.nextInt();
            int y = in.nextInt();

            System.out.println(prefix[n - x] - prefix[n - x + y]);
        }
        out.flush();
    }
}

