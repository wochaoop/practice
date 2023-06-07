package com.xiaoluo.study1.day3;

public class Bird extends Animal implements Eat, Sleep {

    @Override
    public void eat() {
        System.out.println("Bird eat");
    }

    @Override
    public void sleep() {
        System.out.println("Bird sleep");
    }
}
