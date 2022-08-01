package com.priyanshu;

import java.util.ArrayList;
import java.util.List;

public class MaxDistanceClosestPerson_849 {
    public static void main(String[] args) {
    int[] arr = {0,1};
        System.out.println(maxDistToClosest(arr));
    }
    static int maxDistToClosest(int[] seats) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < seats.length; i++) {
            if (seats[i] == 1) list.add(i);
        }
        int counter = -1;
        int ans = 0;
        for (int i = 0; i < seats.length; i++) {
            if (seats[i] == 1){
                counter++;
                continue;
            }
            int current=0;
            if (counter > -1) {
                current = Math.abs(i - list.get(counter));
                if (counter < list.size() - 1){
                    current = Math.min(current, Math.abs(i - list.get(counter + 1)));
                }
            }
            else {
                current = Math.abs(i - list.get(counter + 1));
            }

           ans = Math.max(ans, current);
        }
    return ans;
    }
}
