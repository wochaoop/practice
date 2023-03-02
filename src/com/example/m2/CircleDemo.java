package com.example.m2;

public class CircleDemo {
    public static void main(String[] args) {
        int n = -1;
        System.out.println(NumberOf1(n));
    }

    public static int NumberOf1(int n) {
        String ans = Integer.toBinaryString(n);
        System.out.println(ans);
        int count = 0;
        for (int i = 0; i < ans.length(); i++) {
            if (ans.charAt(i) == '1') {
                count++;
            }
        }
        return count;
    }
}