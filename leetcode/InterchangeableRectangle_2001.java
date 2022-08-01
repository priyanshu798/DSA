package com.priyanshu;

import java.util.HashMap;
import java.util.Map;

public class InterchangeableRectangle_2001 {
    public static void main(String[] args) {
        int[][] s = {{4,8}, {10,20}, {25, 50}, {11,22}};
        System.out.println(interchangeableRectangles(s));

    }
    static long interchangeableRectangles(int[][] rectangles) {
        long ans = 0;
        double ratio = 0.00000;
        Map<Double, Long> map = new HashMap<>();
        for (int i = 0; i < rectangles.length; i++) {
            ratio = Double.valueOf(rectangles[i][0])/ Double.valueOf(rectangles[i][1]);
            if (map.containsKey(ratio))  {
                ans += map.get(ratio);
            }
            map.put(Double.valueOf(ratio) , map.getOrDefault(ratio, (long)0) + (long)1);
        }
    return ans;
    }
}
