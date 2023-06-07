package com.xiaoluo.study1.day3;

public class Cat extends Animal implements Eat, Sleep{

    @Override
    public void eat() {
        System.out.println("cat eat");
    }

    @Override
    public void sleep() {
        System.out.println("cat sleep");
    }
}

