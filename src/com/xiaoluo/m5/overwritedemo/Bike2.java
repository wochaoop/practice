package com.xiaoluo.m5.overwritedemo;

public class Bike2 extends Vehicle {
    @Override
    public void run() {
        System.out.println("Bike2 run");
    }

    public static void main(String[] args) {

        Bike2 bike2 = new Bike2();
        bike2.run();

        Bike2 bike22 = new Bike2();
        Vehicle vehicle22 = new Bike2();
        vehicle22.run();

        Vehicle vehicle = new Bike2();
        vehicle.run();
    }
}