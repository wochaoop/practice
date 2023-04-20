package com.xiaoluo.m5;

public class Children extends Parent {
    static int age;

    public static void main(String[] args) {
        Children children = new Children();
        children.name = "小罗";
        children.age = 19;
        children.showInfo();
        System.out.println(age);
    }
}