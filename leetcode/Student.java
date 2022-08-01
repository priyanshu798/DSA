package com.priyanshu;

public class Student {
    String name;
    String address;
    int age;

    //constructor
    public Student(String name, int age, String address) {
        this.name = name;
        this.address = address;
        this.age = age;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public static void main(String[] args) {
        Student john = new Student("John", 1, "EFew");
        System.out.println(john.getAge());
    }

}
