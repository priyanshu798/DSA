package com.priyanshu;

public class linearSearchRecursion {
    static boolean checkIf(int[] arr, int target, int index) {
        if (index == arr.length) {
            return false;
        }
        return arr[index] == target || checkIf(arr, target, index+1);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,56,44,6,7,657,86548,54457};
        System.out.println(checkIf(arr, 174, 0));

    }
}
