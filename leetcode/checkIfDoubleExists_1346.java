package com.priyanshu;

import java.util.Arrays;

public class checkIfDoubleExists_1346 {
    static boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        for ( int i =0; i < arr.length-1; i++) {
            int target =0;
            if ( arr[i] >=0) {
                target = 2*arr[i]; }
            else { if ( arr[i]%2 == -1) {
                target = arr[i]-1;
            }
            else  target = arr[i]/2;}
            int ans = binSearch(arr, target, i+1, arr.length-1);
            if ( ans == target) {
                return true;
            }
        }

        return false;
    }
    static int binSearch(int[] arr, int target, int start, int end) {


        while (start <= end) {
            int mid = start + (end - start) / 2;

            if  (target > arr[mid]) {
                start = mid + 1;

            }
            else end= mid-1;
        }
        if ( start > arr.length-1) {
            return 0;
        }
        return arr[start];
    }

    public static void main(String[] args) {
        int[] arr = {102,-592,457,802,98,-132,883,356,-857,461,-453,522,250,476,991,540,-852,-485,-637,999,-803,-691,-880,881,-584,750,-124,745,-909,-892,304,-814,868,665,50,-40,26,-242,-797,-360,-918,-741,88,-933,-93,360,-738,833,-191,563,449,840,806,-87,-950,508,74,-448,-815,-488,639,-334};
        System.out.println(checkIfExist(arr));
    }
}
