package com.priyanshu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubstringConcatenationOfWords_30 {
    public static void main(String[] args) {
        String[] words = {"foo", "bar"};
        System.out.println(findSubstring("barfoothefoobarman", words));
    }

    static List<Integer> findSubstring(String s, String[] words) {
        Map<String, Integer> frequencyMap = new HashMap<>();
        for (String k : words) {
            frequencyMap.put(k, frequencyMap.getOrDefault(k, 0) + 1);
        }
        int wordLength = words[0].length();
        int totalWords = words.length;
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i <= s.length() - wordLength * totalWords; i++) {
            Map<String, Integer> seenWords = new HashMap<>();
            for (int j = 0; j < totalWords; j++) {
                int wordIndex = i + j * wordLength;
                String word = s.substring(wordIndex, wordIndex + wordLength);
                if (!frequencyMap.containsKey(word)) break;
                seenWords.put(word, seenWords.getOrDefault(word, 0) + 1);
                if (seenWords.get(word) > frequencyMap.get(word)) break;
                if (j + 1 == totalWords) {
                    res.add(i);
                }
            }
        }
        return res;
    }
}
