package com.IharaYuki.d0511;

public class JumpDemo {
    public static void main(String[] args) {
        swim(new ISwimming() {
            @Override
            public void Swim() {
                System.out.println("我孬你麻麻别");
            }
        });
        swim(new ISwimming() {
            @Override
            public void Swim() {
                System.out.println("涅麻麻地");
            }
        });
    }
    public static void swim(ISwimming iSwimming){
        iSwimming.Swim();
    }
}
