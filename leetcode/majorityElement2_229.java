package com.priyanshu;

import java.util.ArrayList;
import java.util.List;

public class majorityElement2_229 {
    static List<Integer> majorityElement(int[] nums) {
        int number1 = -1;
        int number2 = -1;
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == number1) {
                count1++;
            } else if (nums[i] == number2) {
                count2++;
            } else if (count1 == 0) {
                number1 = nums[i];
                count1 = 1;
            } else if (count2 == 0) {
                number2 = nums[i];
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        count1 = 0;
        count2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == number1) count1++;
        }
        if (count1 > nums.length / 3) {
            ans.add(number1);
        }
        if (number2 != number1) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == number2) count2++;
            }
            if (count2 > nums.length / 3) {
                ans.add(number2);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {-1, -1, -1};
        System.out.println(majorityElement(arr));
    }
}
