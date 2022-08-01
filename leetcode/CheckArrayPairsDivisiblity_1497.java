package com.priyanshu;

import java.nio.charset.StandardCharsets;
import java.util.*;

public class CheckArrayPairsDivisiblity_1497 {

    static boolean canArrange(int[] arr, int k) {
        int[] moduloFrq = new int[k];
        for (int i = 0; i < arr.length; i++) {
            int x = arr[i] % k;
            if (x < 0) x += k;
            moduloFrq[x]++;
        }
        if (moduloFrq[0] % 2 != 0) return false;
        for (int i = 1; i < moduloFrq.length - 1; i++) {
            if (moduloFrq[i] != moduloFrq[k - i]) return false;
        }

        return true;
    }


    static long countPairs_2183(int[] nums, int k) {

        int[] moduloFrq = new int[k];
        for (int i = 0; i < nums.length; i++) {
            int x = nums[i] % k;
            if (x < 0) x += k;
            moduloFrq[x]++;
        }
        long ans = 0;
        for (int i = 1; i < k; i++) {
            ans += moduloFrq[0] * moduloFrq[i];
        }
        ans += moduloFrq[0] * (moduloFrq[0] - 1) / 2;
        for (int i = 2; i < k; i++) {
            for (int j = 2; j <= i; j++) {
                if ((i * j) % k == 0) {
                    if (i == j) ans += moduloFrq[i] * (moduloFrq[i] - 1) / 2;
                    else ans += moduloFrq[i] * moduloFrq[j];
                }
            }


        }

        return ans;


    }

    static List<String> letterCombinations(String digits) {
        List<String> stringArray = new ArrayList<String>();
        String[] mapping = new String[]{"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        if (digits.length() == 0) return stringArray;
        else if (digits.length() == 1) {
            stringArray.add(mapping[digits.charAt(0)]);
        } else if (digits.length() == 2) {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    StringBuilder s = new StringBuilder();
                    s.append(mapping[digits.charAt(0)].charAt(i));
                    s.append(mapping[digits.charAt(0)].charAt(j));
                    stringArray.add(String.valueOf(s));
                }
            }

        } else if (digits.length() == 3) {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    for (int k = 0; k < 3; k++) {

                            StringBuilder s = new StringBuilder();
                            s.append(mapping[digits.charAt(0)].charAt(i));
                            s.append(mapping[digits.charAt(0)].charAt(j));
                            s.append(mapping[digits.charAt(0)].charAt(k));
                            stringArray.add(String.valueOf(s));

                    }
                }
            }
        }
        else {for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    for (int l = 0; l < 3; l++) {
                        StringBuilder s = new StringBuilder();
                        s.append(mapping[digits.charAt(0)].charAt(i));
                        s.append(mapping[digits.charAt(0)].charAt(j));
                        s.append(mapping[digits.charAt(0)].charAt(k));
                        s.append(mapping[digits.charAt(0)].charAt(l));
                        stringArray.add(String.valueOf(s));
                    }
                }
                    }
                }

        }
        return stringArray;
    }
    static int lengthOfLongestSubstring(String s) {
        int ans = 0;
        int max=0;
        Map <Character, Integer> hash = new HashMap<>();
        for (int i =0; i < s.length(); i++) {
            if (!hash.containsKey(s.charAt(i))) {
                ans++;
                max = Math.max(max, ans);
            }
            else {
                ans= i - hash.get(s.charAt(i)) ;
                int x = hash.get(s.charAt(i))+1;
                hash.clear();
                for (int j = x; j <= i; j++) {
                    hash.put(s.charAt(j), j );
                }
            }
            hash.put(s.charAt(i), i);
        }
        return max;
    }



    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));

    }
}

