package com.example.m5;

public class Person {
    private String name;
    private int age;

    public Person() {
        // 默认的不带参数的构造方法
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        // 创建不带参数的Person对象
        Person p1 = new Person();
        System.out.println(p1.name); // 输出null
        System.out.println(p1.age); // 输出0

        // 创建只有name参数的Person对象
        Person p2 = new Person("Alice");
        System.out.println(p2.name); // 输出Alice
        System.out.println(p2.age); // 输出0

        // 创建含有name和age参数的Person对象
        Person p3 = new Person("Bob", 30);
        System.out.println(p3.name); // 输出Bob
        System.out.println(p3.age); // 输出30
    }
}

/*
上述代码定义了一个Person类，包含name和age两个属性。Person类有三个构造方法，
分别是不带参数的构造方法、只有name参数的构造方法和含有name和age参数的构造方法。
这三个构造方法都没有使用this对象，而是直接为属性赋值。

在main函数中，分别使用不同的构造方法创建了三个Person对象，
分别是不带参数的Person对象、只有name参数的Person对象和含有name和age参数的Person对象。
在输出属性值时，可以发现不带参数的Person对象的name和age属性都是null和0，
而只有name参数和含有name和age参数的Person对象的name和age属性分别是构造方法传入的参数值。

这是因为在不使用this对象的情况下，属性名和形参名相同时，形参名会遮盖属性名，导致无法正确访问属性。
因此，对于含有属性的类，建议使用this关键字来明确指定属性，避免出现类似的问题。
 */