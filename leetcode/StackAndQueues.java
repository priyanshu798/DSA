package com.priyanshu;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackAndQueues {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.pop();

        System.out.println(s.peek());

        Queue<Integer> q = new LinkedList<>();
        q.add(3);
        q.add(6);
        q.add(9);
        q.add(12);
        q.remove(12);
        System.out.println(q);
    }
}
