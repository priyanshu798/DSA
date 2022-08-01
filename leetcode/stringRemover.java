package com.priyanshu;

public class stringRemover {

    public static void main(String[] args) {

        System.out.println(skipApple("sfjgapplesgdsg"));
    }

    static void skip(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        if (up.charAt(0) == 'a') {
            skip(p, up.substring(1));
        } else {
            skip(p + up.charAt(0), up.substring(1));
        }
    }

    static String skipApple(String p) {
        if (p.isEmpty()) {
            return "";
        }
        if (p.startsWith("apple")) {
            return skipApple(p.substring(5));
        }

        return p.charAt(0) + skipApple(p.substring(1));

    }

}
