package top.xiwangly.test;

import java.math.BigInteger;

public class 特大数交换变量 {
    public static void main(String[] args) {
        BigInteger a = new BigInteger("123456789012345678901234567890");
        BigInteger b = new BigInteger("987654321098765432109876543210");

        System.out.println("交换前：");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // 交换变量的值
        a = a.add(b);
        b = a.subtract(b);
        a = a.subtract(b);

        System.out.println("交换后：");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
