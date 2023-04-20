package com.xiaoluo.m5.circle;

public class Circle {
    private float fRadius;
    final float PI = 3.14f;

    void setRadius(float fR) {
        fRadius = fR;
    }

    //设置圆的半径
    void showArea() {
        System.out.println("The area of circle is " + fRadius * fRadius * PI);
    }

    //计算和输出圆的面积
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRadius(6);
        circle.showArea();
    }
}
