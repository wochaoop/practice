package com.xiwangly.test;

public class Factorial {
    public static long factorial(long num) {
        return num == 1 ? 1 : num * factorial(num - 1);
    }
    public static void main(String[] args) {
        long num = 12;
        System.out.println(factorial(num));
    }
}
