package com.exam;

class Animal {
    void voice() {
        System.out.println("动物发出声音");
    }
}

class Dog extends Animal {
    @Override
    void voice() {
        System.out.println("汪汪");
    }
}

class Cat extends Animal {
    @Override
    void voice() {
        System.out.println("喵喵");
    }
}

public class 动物类 {
    public static void main(String[] args) {
        Dog doggie = new Dog();
        doggie.voice(); // 输出信息：“汪汪”

        Cat kitty = new Cat();
        kitty.voice(); // 输出信息：“喵喵”
    }
}
