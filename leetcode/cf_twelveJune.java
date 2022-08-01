package com.priyanshu;


import java.util.Arrays;
import java.util.Scanner;

public class cf_twelveJune {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int items = sc.nextInt();
        int query = sc.nextInt();
        Integer[] a = new Integer[items];
        for (int i = 0; i < items; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        Long[] b = new Long[items + 1];
        b[0] = 0l;
        for (int i = 1; i <= items; i++) {
            b[i] = b[i - 1] + a[i - 1];
        }
        int x = 0, y = 0;

        for (int i = 0; i < query; i++) {
            x = sc.nextInt();
            y = sc.nextInt();
            long sum = 0;
            sum = b[items - x + y] - b[items - x];

            System.out.println(sum);
        }

    }

}


