package top.xiwangly.work;

class Timer {
    int minute, second;

    public Timer(int m, int s) {
        minute = m;
        second = s;
    }

    void showTime() {
        System.out.println("现在时间是：" + minute + "分" + second + "秒");
    }

    //    static void swapTime (Timer t1, Timer t2) {
//        Timer t = t1;
//        t1 = t2;
//        t2 = t;
//    }
    static void swapTime(Timer t1, Timer t2) {
        int tempMinute = t1.minute;
        int tempSecond = t1.second;
        t1.minute = t2.minute;
        t1.second = t2.second;
        t2.minute = tempMinute;
        t2.second = tempSecond;
    }

}

public class ReferenceDemo {
    public static void main(String[] args) {
        Timer t1 = new Timer(9, 10);
        Timer t2 = new Timer(11, 12);
        t1.showTime();
        t2.showTime();
        System.out.println("使用 swapTime 方法交换 Timer 实例后：");
        Timer.swapTime(t1, t2);
        t1.showTime();
        t2.showTime();
    }
}
