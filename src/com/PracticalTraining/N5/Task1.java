package com.PracticalTraining.N5;

class SimpleThread extends Thread {
    public SimpleThread(String str) {
        super(str);
    }

    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println(i + " " + getName());
                sleep((int) (Math.random() * 1000));
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("DONE! " + getName());
    }
}

public class Task1 {
    public static void main(String[] args) {
        new SimpleThread("Go to Beijing").start();
        new SimpleThread("Stay here").start();
    }
}
