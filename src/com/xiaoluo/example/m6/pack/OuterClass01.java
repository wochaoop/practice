package com.xiaoluo.example.m6.pack;

public class OuterClass01 {
    public int i = 1;
    private  int j = 2;
    public static int x = 3;
    private static int y = 4;

    public class InerClass01{
        public void print() {
            System.out.println(i);
            System.out.println(j);
            System.out.println(x);
            System.out.println(y);
        }
    }
}
