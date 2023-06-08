package com.PracticalTraining.N5;

// 版本 <= jdk 1.8

/*

import java.applet.*;
import java.awt.*;
import java.util.Date;

class SY4_2 extends Applet implements Runnable {
    Thread clockThread;

    @Override
    public void start() {
        if (clockThread == null) {
            clockThread = new Thread(this, "clock");
            clockThread.start();
        }
    }

    @Override
    public void run() {
        while (clockThread != null) {
            repaint();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void paint(Graphics g) {
        Date now = new Date();
        g.drawString(now.getHours() + ":" + now.getMinutes() + ":" + now.getSeconds(), 5, 10);
    }

    @Override
    public void stop() {
        clockThread.stop();
        clockThread = null;
    }
}

*/