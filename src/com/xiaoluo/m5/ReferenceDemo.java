package src.com.xiaoluo.m5;

public class ReferenceDemo {
    public static void main(String[] args) {
        Timer t1 = new Timer(9,10);
        Timer t2 = new Timer(11,12);
        t1.showTime();
        t2.showTime();
        System.out.println("使用swapTime方法交换Timer实例后：");
        Timer.swapTime(t1,t2);
        t1.showTime();
        t2.showTime();
    }
}
