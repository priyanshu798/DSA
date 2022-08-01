package com.priyanshu;

public class checkSorting {
    static boolean checkIfArraySorted(int[] arr) {
        return checking(arr, 0);
    }

    static boolean checking(int[] arr, int start) {
        if (start == arr.length - 1) {
            return true;


        }
        return arr[start] < arr[start + 1] && checking(arr, start + 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 54, 677, 5677, 56778, 45};
        System.out.println(checkIfArraySorted(arr));
    }
}
