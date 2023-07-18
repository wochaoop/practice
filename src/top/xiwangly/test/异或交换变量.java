package top.xiwangly.test;

public class 异或交换变量 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        a = a ^ b;
        b = b ^ a;
        a = a ^ b;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
