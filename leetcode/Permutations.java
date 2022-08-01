package com.priyanshu;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public static void main(String[] args) {
        System.out.println(permutationsList("", "abc"));
    }
    static void permutations (String p, String up ) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            permutations(p.substring(0, i) + ch + p.substring(i , p.length()) , up.substring(1));
        }
    }
    static ArrayList<String> permutationsList (String p, String up ) {
        if (up.isEmpty()) {
            ArrayList<String> s = new ArrayList<>();
            s.add(p);
            return s;

        }
        ArrayList<String> res = new ArrayList<>();
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            res.addAll(permutationsList(p.substring(0, i) + ch + p.substring(i , p.length()) , up.substring(1)));
        }
        return res;
    }

    static int permutationsCount (String p, String up ) {
        if (up.isEmpty()) {
            return 1;

        }
        int count = 0;
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            count += permutationsCount(p.substring(0, i) + ch + p.substring(i, p.length()), up.substring(1));
        }

   return count;
    }


}
