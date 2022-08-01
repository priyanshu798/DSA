package com.priyanshu;

public class nextLetter {
    public char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;
        boolean inc = letters[end] > letters[start];
        int mid = 0;

        while (start <= end) {
            mid = start + (end - start) / 2;

            if (target > letters[mid]) {
                start = mid + 1;
            } else if (target < letters[mid]) {
                end = mid - 1;
            }

        }
        int ans = 0;
        if (inc) {
            ans = letters[start];
        } else ans = letters[end];
        return letters[ans % (letters.length - 1)];
    }
}
