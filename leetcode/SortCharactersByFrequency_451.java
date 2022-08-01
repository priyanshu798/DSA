package com.priyanshu;

import java.util.*;

public class SortCharactersByFrequency_451 {
    public static void main(String[] args) {
        System.out.println(frequencySort( "tree"));
    }
    static String frequencySort(String s) {
       int[] map = new int[26];
        for (int i = 0; i < s.length(); i++) {
            map[(int)(s.charAt(i) - 'a')]++;
        }
        System.out.println(Arrays.toString(map));
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < 26; i++) {
            if (map[i] != 0 )pq.add(map[i]);

        }
        return "";
    }


}
