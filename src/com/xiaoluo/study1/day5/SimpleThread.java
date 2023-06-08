package com.xiaoluo.study1.day5;

class SimpleThread extends Thread{
    public SimpleThread(String str) {
        super(str);
    }
    public void run() {
        for (int i = 0; i < 10; i++) {
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

class SY4_1 {
    public static void main(String[] args) {
        new SimpleThread("Go To Beijing??").start();
        new SimpleThread("Stay here!!").start();
    }
}


