package com.priyanshu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PartitionLabels_763 {
    public static void main(String[] args) {
        System.out.println(partitionLabels("caedbdedda"));
    }
    static List<Integer> partitionLabels(String s) {
      int[] map = new int[26];
        for (int i = 0; i < s.length(); i++) {
            map[s.charAt(i) - 'a'] = i;
        }
        List<Integer> ans = new ArrayList<>();
        int x = 0;
        int lastIndex = -1;
        for (int i = 0; i < s.length(); i++) {
            lastIndex = Math.max(lastIndex, map[s.charAt(i) - 'a']);
            if (i == lastIndex){
                ans.add(i+1 - x);
                x = i+1;
            }
        }
    return ans;}
}
