package com.xiaoluo.m5;

public class Person {
    private String name;
    private int age;
    public Person() {
        this.name = "小罗";
        this.age = 19;
    }
    public Person(String name) {
        this.name = name;
        age = 19;
    }
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void speak() {
        System.out.println("姓名：" + name + " 年龄：" + age);
    }
    public static void main(String[] args) {
        Person p = new Person("小黄");
        p.speak();
        Person p1 = new Person("小黄", 19);
        p1.speak();
        Person p2 = new Person();
        p2.speak();
    }
}