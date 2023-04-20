package com.xiaoluo.m5;

class Timer {
    int minute,second;
    public Timer(int m,int s) {
        minute = m;
        second = s;
    }

    void showTime() {
        System.out.println("现在时间是：" + minute + "分" + second + "秒");
    }

    static void swapTime(Timer t1, Timer t2) {
        Timer t = t1;
        t1 = t2;
        t2 = t;
    }
}
