package com.priyanshu;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class binSearchRecursion {

    static int binSearch( int[] arr, int target, int s, int e) {
        if ( s > e) {
            return -1;
        }
        int m = s + (e-s)/2;
        if ( arr[m] == target) {
            return m;
        }
        if ( arr[m] > target) {
            return binSearch(arr, target, s, m-1);
        }
        return binSearch(arr, target, m+1, e);
    }

    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,55,66,643,2333,5664,345,345636};
//        System.out.println(binSearch(arr, 11, 0, arr.length-1));
//            binSearchRecursion b = new binSearchRecursion();


        List<String> list = Arrays.asList("aa", "bb", "vv", "bb");
        Set<String> set = new HashSet<>(list);

        String s = "fsdfs";
        String s1 = "dsfsdf";

        System.out.println(list);
        System.out.println(set);
    }
}
