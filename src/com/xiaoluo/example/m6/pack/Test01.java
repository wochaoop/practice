package com.xiaoluo.example.m6.pack;

public class Test01 {
    public static void main(String[] args) {
        OuterClass01 outerClass01 = new OuterClass01();
        OuterClass01.InerClass01 inerClass01 = outerClass01.new InerClass01();
        inerClass01.print();
    }
}
