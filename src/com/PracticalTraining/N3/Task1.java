package com.PracticalTraining.N3;

// 定义抽象类：图形类
abstract class Shape {
    // 抽象方法：求周长
    public abstract double getPerimeter();

    // 抽象方法：求面积
    public abstract double getArea();

    // 抽象方法：描述图形
    public abstract String describe();
}

// 圆形类
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String describe() {
        return "这是一个圆形，周长是" + getPerimeter() + "，面积是" + getArea();
    }
}

// 长方形类
class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public String describe() {
        return "这是一个长方形，周长是" + getPerimeter() + "，面积是" + getArea();
    }
}

// 等边三角形类
class EquilateralTriangle extends Shape {
    private double sideLength;

    public EquilateralTriangle(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public double getPerimeter() {
        return 3 * sideLength;
    }

    @Override
    public double getArea() {
        return (Math.sqrt(3) / 4) * sideLength * sideLength;
    }

    @Override
    public String describe() {
        return "这是一个等边三角形，周长是" + getPerimeter() + "，面积是" + getArea();
    }
}

public class Task1 {
    public static void main(String[] args) {
        // 创建圆形对象并验证方法
        Circle circle = new Circle(5);
        System.out.println(circle.describe());

        // 创建长方形对象并验证方法
        Rectangle rectangle = new Rectangle(4, 6);
        System.out.println(rectangle.describe());

        // 创建等边三角形对象并验证方法
        EquilateralTriangle triangle = new EquilateralTriangle(3);
        System.out.println(triangle.describe());
    }
}
