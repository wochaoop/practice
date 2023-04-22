package com.xiaoluo.m5;

public class Person {
    String name;
    int age;
    Person() {
        name = "小罗";
        age = 19;
    }
    Person(String name) {
        name = name;
    }
    Person(String name, int age) {
        name = name;
        age = age;
    }
    public void speak() {
        System.out.println("姓名：" + name + " 年龄：" + age);
    }

    public static void main(String[] args) {
        Person p = new Person("小黄");
        p.speak();
    }
}
