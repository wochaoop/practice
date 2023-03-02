package com.example.m2;

public class TransferType {
    public static void main(String[] args) {
        byte b = 1;
        short s = 2;
        char ch = 'a';
        long l1 = 3L;
        float f1 = 1.23F;
        double d1 = 4.56D;
        int i = b + s + ch;
        long l2 = i - l1;
        float f2 = i - f1;
        double d2 = i - d1;
        System.out.println("i=" + i);
        System.out.println("l2=" + l2);
        System.out.println("f2=" + f2);
        System.out.println("d2=" + d2);
    }
}
