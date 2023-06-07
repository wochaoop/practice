package com.IharaYuki.DontTrustMe.Animal;

class Bird extends Animal implements Eat, Sleep {
    @Override
    public void eat() {
        System.out.println("Bird Eat");
    }

    @Override
    public void sleep() {
        System.out.println("Bird Sleep");
    }
}
