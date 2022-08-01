package com.priyanshu;



public class RemoveMinAndMax_2091 {
    public static void main(String[] args) {
        int[] arr = {2,10,7,5,4,1,8,6};
            System.out.println(monotoneIncreasingDigits(3351));

    }
    static int monotoneIncreasingDigits(int n) {
        StringBuilder s = new StringBuilder();
        s.append(n);
        int p = s.length();
        for (int i =0; i < s.length()-1 ; i++) {

            if ( Character.getNumericValue(s.charAt(i)) >= Character.getNumericValue(s.charAt(i+1))) {
                int ch = Character.getNumericValue(s.charAt(i));
                s.deleteCharAt(i);
                s.insert(i, ch-1);
               p = i+1;
               break;
            }

        }
        for (int i = p; i < s.length(); i++) {
            s.deleteCharAt(i);
            s.insert(i, '9');
        }
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            ans += Character.getNumericValue(s.charAt(i))*Math.pow(10, s.length()-i-1);
        }
return ans;
    }
}
