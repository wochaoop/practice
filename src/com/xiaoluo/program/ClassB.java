package com.xiaoluo.program;

public class ClassB {
    public static void main(String[] args) {
        ClassA classA = new ClassA();
        classA.a = 10;  //公共的，可以在任何地方使用
        classA.b = 20;  //保护访问修饰符，可以在同一个包内使用
        //classA.c = 30;    无法调用，因为private访问修饰符表示的是私有的，只能在本类使用
        classA.A();
        classA.B();
        //classA.C();   无法调用，原因同上
    }
}
