package com.priyanshu;

public class GoogleStones {
    public static void main(String[] args) {
        int[] arr = {6, 2, 3, 4, 5, 5};
        System.out.println(stones(arr));
    }

    static int stones(int[] arr) {
        int ans = 0;
        int totalSum = 0;
        for (int i = 0; i < arr.length; i++) {
            totalSum += arr[i];
        }
        int start = 0;
        int end = arr.length - 1;

        while (end > start) {
            int currentSum = 0;
            for (int i = 0; i < arr.length; i++) {
                currentSum += arr[i];
                

            }
        }

        return ans;
    }
}
