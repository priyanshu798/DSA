package com.priyanshu;

public class Candy_135 {
    public static void main(String[] args) {
        int[] arr = {1,2,2};
        System.out.println(candy(arr));
    }
    static int candy(int[] ratings) {

        int[] arr = new int[ratings.length];
        int x =1;
        for (int i =0; i < ratings.length; i++) {
            if (i > 0 && ratings[i] > ratings[i-1])x++;
            else {
                x=1;
            }
            arr[i] = x;
        }
        x=1;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (i < arr.length -1 && ratings[i] > ratings[i+1]){
                x++;
            }
            else {
                x=1;
            }
            arr[i] = Math.max(arr[i], x);
        }
        x=0;
        for (int num: arr) {
            x+= num;
        }
        return x;
    }
}
