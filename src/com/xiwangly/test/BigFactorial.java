package com.xiwangly.test;
import java.math.BigInteger;
public class BigFactorial {
    public static void main(String[] args) {
        BigInteger num = new BigInteger("8848"); // 需要计算阶乘的大数
        BigInteger result = BigInteger.ONE; // 初始化结果为1

        // 循环从2到num，累乘每个数字
        for (BigInteger i = BigInteger.valueOf(2); i.compareTo(num) <= 0; i = i.add(BigInteger.ONE)) {
            result = result.multiply(i);
        }

        System.out.println(result.toString()); // 输出结果
    }
}
