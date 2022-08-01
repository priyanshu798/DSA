package com.priyanshu;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AsciValue {
    public static void main(String[] args) {
        subseqAsci("", "abc");
        List<List<Integer>> a = new ArrayList<>();



    }

    static void subseqAsci(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        subseqAsci(p + up.charAt(0), up.substring(1));
        subseqAsci(p + (up.charAt(0) + 0), up.substring(1));
        subseqAsci(p, up.substring(1));
    }



}
