package com.priyanshu;

import java.util.ArrayList;
import java.util.List;

public class GrayCode_89 {
    public static void main(String[] args) {
        System.out.println(grayCode(7));
    }

    static List<Integer> grayCode(int n) {
        List<Integer> ans = new ArrayList<>();
        ans.add(0);
        ans.add(1);
        for (int i = 2; i <= n; i++) {
            int temp = ans.get(ans.size() - 1);
            int pointer = ans.size() - 1;
            temp = temp + temp * 2;
            ans.add(temp);
            while (pointer > 0) {

                temp = temp + ans.get(pointer - 1) - ans.get(pointer--);
                ans.add(temp);

            }
        }
        return ans;
    }
}
