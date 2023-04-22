package com.xiaoluo.m5.day420;

public class A {
    void m() {

    }
    void n() {
        m();
    }
    public static void main(String[] args) {
        new A().n();
    }
}
