package com.xiwangly.work;

public class Work11 {
    private String name;
    private int age;
    private String gender;

    public Work11(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void eat() {
        System.out.println(name + "正在吃饭");
    }

    public void sleep() {
        System.out.println(name + "正在睡觉");
    }

    public void study() {
        System.out.println(name + "正在学习");
    }

    public static void main(String[] args) {
        Work11 Work11 = new Work11("张三", 18, "男");
        Work11.eat();
        Work11.sleep();
        Work11.study();
    }
}
