package com.IharaYuki.DontTrustMe.Animal;

class Cat extends Animal implements Eat, Sleep{
    @Override
    public void eat() {
        System.out.println("Cat Eat");
    }

    @Override
    public void sleep() {
        System.out.println("Cat Sleep");
    }
}

