package com.priyanshu;

public class DiceQuestion {
    public static void main(String[] args) {
        dice("", 8);

    }
    static void dice (String p, int num ) {

        if (num==0) {
            System.out.println(p);
        }
        for (int i = 1; i <=6 && i <= num ; i++) {
            dice(p + (char)(i + '0') , num-i);
        }
    }
}
