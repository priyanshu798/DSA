package com.priyanshu;

import java.util.ArrayList;
import java.util.List;

public class MazeProb {
    public static void main(String[] args) {
        System.out.println(mazePathDiagnol("", 2,2));
    }

    static int mazeCount(int r, int c) {
        if (c == 0 || r == 0) {
            return 1;
        }

        return mazeCount(r - 1, c) + mazeCount(r, c - 1);
    }

    static List<String> mazePath(String path, int r, int c) {

        if (r == 0 && c == 0) {
            List<String> s = new ArrayList<>();
            s.add(path);
            return s;
        }
        List<String> ans = new ArrayList<>();

        if (c > 0) {
            ans.addAll(mazePath(path + 'R', r, c - 1));
        }
        if (r > 0) {
            ans.addAll(mazePath(path + 'D', r - 1, c));
        }

        return ans;
    }

    static List<String> mazePathDiagnol(String path, int r, int c) {

        if (r == 0 && c == 0) {
            List<String> s = new ArrayList<>();
            s.add(path);
            return s;
        }
        List<String> ans = new ArrayList<>();
        if (c > 0 && r > 0) {
            ans.addAll(mazePathDiagnol(path + 'D', r-1, c-1));
        }
        if (c > 0) {
            ans.addAll(mazePathDiagnol(path + 'H', r, c - 1));
        }
        if (r > 0) {
            ans.addAll(mazePathDiagnol(path + 'V', r - 1, c));
        }

        return ans;
    }
}
