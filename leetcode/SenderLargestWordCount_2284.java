package com.priyanshu;

import java.util.HashMap;
import java.util.Map;

public class SenderLargestWordCount_2284 {
    public static void main(String[] args) {
    String[] messages = {"How is leetcode for everyone","Leetcode is useful for practice"};
    String[] senders = {"Bob","Charlie"};
        System.out.println(largestWordCount(messages, senders));
    }

    static String largestWordCount(String[] messages, String[] senders) {
        for (int i = 0; i < messages.length; i++) {
            messages[i] = messages[i] + " ";
        }
        Map<String, Integer> freq = new HashMap<>();
        for (int i = 0; i < messages.length; i++) {
            int wordCount = 0;
            String s = messages[i];
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == ' ') wordCount++;
            }
            freq.put(senders[i], freq.getOrDefault(senders[i], 0) + wordCount);
        }
        int maxCount = 0;
        String ans = "";
        for (Map.Entry<String, Integer> entry : freq.entrySet()) {
            if (entry.getValue() > maxCount){
                maxCount = entry.getValue();
                ans = entry.getKey();
            }
            else if (entry.getValue() == maxCount) {
                if (ans.compareTo(entry.getKey()) < 0)ans = entry.getKey();
            }
        }
   return ans;
    }
}
