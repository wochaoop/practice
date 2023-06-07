package com.PracticalTraining.N5;

class SY4_4 implements Runnable {
    public SY4_4() {
        TestThread testThread1 = new TestThread(this, "1");
        TestThread testThread2 = new TestThread(this, "2");
        testThread2.start();
        testThread1.start();
    }

    public static void main(String[] args) {
        SY4_4 demoThread = new SY4_4();
    }

    public void run() {
        TestThread t = (TestThread) Thread.currentThread();
        try {
            if (!t.getName().equalsIgnoreCase("1")) {
                synchronized (this) {
                    wait();
                }
            }
            while (true) {
                synchronized (this) {
                    System.out.println("Thread " + t.getName() + ": " + t.increaseTime());
                    if (t.getTime() % 10 == 0) {
                        System.out.println("*Lock and change thread*");
                        notifyAll();
                    }
                    if (t.getTime() >= 20)
                        break;
                }
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    class TestThread extends Thread {
        private int time = 0;

        public TestThread(Runnable r, String name) {
            super(r, name);
        }

        public int getTime() {
            return time;
        }

        public int increaseTime() {
            return ++time;
        }
    }
}
