package com.priyanshu;

public class sqrRoot {
    static int mySqrt(int x) {
        if ( x == 0 ) {
            return 0;
        }
        int start =1;
        int end = x;
        if ( x > 46340) {
            end = 46340;
        }
        while (start < end) {
            int mid = (start + end)/2;
            if ( start == mid) {
                if ( (end*end) <= x) {
                    start = end;
                }
                break;
            }
            if ( (mid*mid) > x ) {
                end = mid-1;
            }
            else if ( (mid*mid) < x ) {
                start = mid;
            }
            else if ((mid*mid) == x ) {
                start = mid;
                break;
            }
        }
        return start; }

    public static void main(String[] args) {
        int x = 2147395600;
        int ans = mySqrt(x);
        System.out.println(ans);
    }
}
