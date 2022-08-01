package com.priyanshu;

import java.util.PriorityQueue;

public class LongestHappyString_1405 {
    public static void main(String[] args) {
        System.out.println(longestDiverseString(2,3,5));
    }

    static String longestDiverseString(int a, int b, int c) {
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair('a', a));
        pq.add(new Pair('b', b));
        pq.add(new Pair('c', c));
        System.out.println(pq);
        return "";

    }

    static class Pair {
        public Character ch;
        int count;

        public Pair(Character ch, int count) {
            this.ch = ch;
            this.count = count;
        }
    }
}
