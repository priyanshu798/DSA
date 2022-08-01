package com.priyanshu;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class codeForces_784 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int n = in.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = in.nextInt();
            }
            String ans;
            ans="YES";
            if (arr[0] % 2 == 1) {
                for (int j = 0; j < n; j = j + 2) {
                    if (arr[j] % 2 == 0) {
                        ans = "NO";
                        break;
                    }
                }
                if (ans == "NO") {
                    System.out.println(ans);
                    break;
                }
            }
             else {
                for (int j = 0; j < n; j = j + 2) {
                    if (arr[j] % 2 == 1) {
                        System.out.println("NO");
                        break;
                    }
                }
                if (ans == "NO") {
                    System.out.println(ans);
                    break;
            }

            }
            if (arr[1] % 2 == 1) {
                for (int j = 1; j < n; j = j + 2) {
                    if (arr[j] % 2 == 0) {
                        ans = "NO";
                        break;
                    }
                }
                if (ans == "No") {
                    System.out.println(ans);
                    break;
                }
            }
             else {
                for (int j = 1; j < n; j = j + 2) {
                    if (arr[j] % 2 == 1) {
                        ans = "NO";
                        break;
                    }
                }
                if (ans == "NO") {
                    System.out.println(ans);
                    break;
                }
             }

            System.out.println(ans);
        }

    }
}
