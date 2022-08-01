package com.priyanshu;

public class zigzag_6 {
    static String convert(String s, int numRows) {
        if (s.length() < 3 || numRows == 1) {
            return s;
        }
        String r = "";
        int n = (numRows - 1) * 2;
        for (int i = 0; i < numRows; i++) {
            int j = i;
            boolean x = false;
            while (j < s.length()) {
                r += s.charAt(j);
                if (x == false) {
                    j += (numRows - i - 1) * 2;

                } else {
                    j += n - (numRows - i - 1) * 2;

                }
                if (i != 0 && i != numRows - 1) {
                    if (x == false) x = true;
                    else {
                        x = false;
                    }
                }
            }
        }
        return r;
    }

    public static void main(String[] args) {
        String k = "PAYPALISHIRING";
        System.out.println(convert(k, 3));
    }
}
