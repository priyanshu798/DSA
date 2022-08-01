package com.priyanshu;

import java.util.Arrays;

public class oops {


    public static void main(String[] args) {

        Student student = new Student();

        System.out.println(student.marks);


    }
    static class Student {
        int rno;
        String name;
        float marks;
    }
}
