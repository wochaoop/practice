package com.xiaoluo.m5;

import java.security.SecureRandom;

public class Dog {
    String name;
    String color;
    String variety;

    public void eat() {
        System.out.println(variety + name + "啃骨头");
    }

    public void run() {
        System.out.println(variety + name + "能叼着骨头跑");
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name = "五花肉";
        dog.color = "棕色";
        dog.variety = "阿拉斯加";
        dog.eat();
        dog.run();
    }
}
