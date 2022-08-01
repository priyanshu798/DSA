package com.priyanshu;

import java.util.Arrays;
import java.util.Collections;

public class scope {
    public static void main(String[] args) {
        System.out.println(minDeletions("bbcebab"));
    }

    static int minDeletions(String s) {
        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }
        Arrays.sort(freq);
        Collections.reverse(Arrays.asList(freq));
        int ans = 0;
        int allowed = freq[25];
        for (int i = 25; i >= 0; i--) {

            if (freq[i] > allowed) {
                ans += freq[i] - allowed;
                freq[i] = allowed;
            }
            allowed = freq[i] - 1;
            if (allowed < 0) allowed = 0;
            if (freq[i] == 0 && freq[i - 1] == 0) break;
        }

        return ans;
    }
}

