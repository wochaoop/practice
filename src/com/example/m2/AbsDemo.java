package com.example.m2;

import java.util.Scanner;

public class AbsDemo {
    public static void main(String[] args) {
        System.out.println("Please Input Num:");
        Scanner sc = new Scanner(System.in);//检测输入
        int a = sc.nextInt();
        int b;
        int i = a >> 31; //数字正负判断
        b = (i > 0) ? a : (~a + 1);
        System.out.println("Num's abs is " + b);


    }
}
