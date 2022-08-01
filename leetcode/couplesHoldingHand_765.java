package com.priyanshu;

public class couplesHoldingHand_765 {
    static int minSwapsCouples(int[] row) {
        int i = 0;
        int ans = 0;
        while (i < row.length) {
            if (row[i] % 2 == 0) {
                if (row[i + 1] != row[i] + 1) {
                    int couple = search(row, i, row[i] + 1);
                    swap(row, i + 1, couple);
                    ans++;
                }
            } else {
                if (row[i + 1] != row[i] - 1) {
                    int couple = search(row, i, row[i] - 1);
                    swap(row, i + 1, couple);
                    ans++;
                }
            }
            i = i + 2;
        }
        return ans;
    }

    static int search(int[] row, int i, int target) {
        for (int j = i + 2; j < row.length; j++) {
            if (row[j] == target) {
                return j;
            }

        }
        return -1;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[second];
        arr[second] = arr[first];
        arr[first] = temp;
    }

    public static void main(String[] args) {
        int[] row = {};
        System.out.println(minSwapsCouples(row));
    }
}

