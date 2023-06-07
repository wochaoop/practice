package com.PracticalTraining.N3;

// 定义抽象类：动物类
abstract class Animal {
    // 抽象方法：进食
    public abstract void eat();

    // 抽象方法：睡觉
    public abstract void sleep();
}

// 定义进食接口
interface Eat {
    void eat();
}

// 定义睡觉接口
interface Sleep {
    void sleep();
}

// 定义思考接口
interface Think {
    void think();
}

// 定义说话接口
interface Speak {
    void speak();
}

// 定义行走接口
interface Walk {
    void walk();
}

// 定义游泳接口
interface Swim {
    void swim();
}

// 定义飞翔接口
interface Fly {
    void fly();
}

// 猫类
class Cat extends Animal implements Eat, Sleep {
    @Override
    public void eat() {
        System.out.println("猫正在吃东西");
    }

    @Override
    public void sleep() {
        System.out.println("猫正在睡觉");
    }
}

// 人类
class Human extends Animal implements Eat, Sleep, Think, Speak, Walk {
    @Override
    public void eat() {
        System.out.println("人正在进食");
    }

    @Override
    public void sleep() {
        System.out.println("人正在睡觉");
    }

    @Override
    public void think() {
        System.out.println("人正在思考");
    }

    @Override
    public void speak() {
        System.out.println("人正在说话");
    }

    @Override
    public void walk() {
        System.out.println("人正在行走");
    }

}

// 鸟类
class Bird extends Animal implements Eat, Sleep, Think, Speak, Walk, Fly {
    @Override
    public void eat() {
        System.out.println("鸟正在进食");
    }

    @Override
    public void sleep() {
        System.out.println("鸟正在睡觉");
    }

    @Override
    public void think() {
        System.out.println("鸟正在思考");
    }

    @Override
    public void speak() {
        System.out.println("鸟正在说话");
    }

    @Override
    public void walk() {
        System.out.println("鸟正在行走");
    }

    @Override
    public void fly() {
        System.out.println("鸟正在飞翔");
    }
}

// 鱼类
class Fish extends Animal implements Eat, Sleep, Swim {
    @Override
    public void eat() {
        System.out.println("鱼正在进食");
    }

    @Override
    public void sleep() {
        System.out.println("鱼正在睡觉");
    }

    @Override
    public void swim() {
        System.out.println("鱼正在游泳");
    }
}

public class Task3 {
    public static void main(String[] args) {
        // 创建猫的实例并验证方法
        Animal cat = new Cat();
        cat.eat();
        cat.sleep();

        // 创建人类的实例并验证方法
        Human human = new Human();
        human.eat();
        human.sleep();
        human.think();
        human.speak();
        human.walk();

        // 创建鸟类的实例并验证方法
        Bird bird = new Bird();
        bird.eat();
        bird.sleep();
        bird.think();
        bird.speak();
        bird.walk();
        bird.fly();

        // 创建鱼类的实例并验证方法
        Fish fish = new Fish();
        fish.eat();
        fish.sleep();
        fish.swim();
    }
}
