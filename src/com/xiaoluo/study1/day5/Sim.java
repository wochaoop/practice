package com.xiaoluo.study1.day5;

class Sim extends Thread {
    public Sim(String str) {
        super(str);
    }
    public void run() {
        for (int i = 0; i < 6; i++) {
            System.out.println(i + " " + getName());
            try {
                sleep((int)(Math.random() * 1000));
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("DONE!" + getName());
    }
}

class T4 {
    public static void main(String[] args) {
        new Sim("Go To Beijing??").start();
        new Sim("stay here!!").start();
    }
}