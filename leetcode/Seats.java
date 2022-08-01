package com.priyanshu;

import java.util.ArrayList;
import java.util.List;

public class Seats {
    public static void main(String[] args) {
        System.out.println(seats("xx.....xx.x..xxxx..xxxx.xx..xx..x.xxxx"));
    }
    static int seats(String A) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) == 'x')list.add(i);
        }
        if (list.size()==0)return 0;
        int median = list.get(list.size()/2);
        int ans = 0;
        int pos = median;
        for (int i = list.size()/2; i >=0 ; i--) {
            ans += Math.abs(list.get(i) - pos);
            pos--;
        }
        pos = median + 1;
        for (int i = list.size()/2 + 1; i < list.size(); i++) {
            ans += Math.abs(list.get(i) - pos);
            pos++;
        }
    return ans;
    }
}
