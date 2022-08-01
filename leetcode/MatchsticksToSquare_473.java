package com.priyanshu;

import java.util.Arrays;

public class MatchsticksToSquare_473 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 102};
        System.out.println(makesquare(arr));
    }

    static boolean makesquare(int[] matchsticks) {
        int perimeter = 0;
        for (int num : matchsticks) {
            perimeter += num;
        }

        if (perimeter % 4 != 0) return false;
        int sideLength = perimeter / 4;
        int[] sideArray = new int[]{sideLength, sideLength, sideLength, sideLength};
        return backtrack(matchsticks, 0, sideArray);

    }

    static boolean backtrack(int[] matchsticks, int index, int[] sideArray) {
        if (index == matchsticks.length) {
            return sideArray[0] == 0 && sideArray[1] == 0 && sideArray[2] == 0 && sideArray[3] == 0;
        }
        for (int i = 0; i < 4; i++) {
            if (matchsticks[index] > sideArray[i]) continue;
            sideArray[i] -= matchsticks[index];
            if (backtrack(matchsticks, index + 1, sideArray)) return true;
            sideArray[i] += matchsticks[index];
        }

        return false;

    }
}
