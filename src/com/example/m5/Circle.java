package com.example.m5;

public class Circle {
    private float fRadius;

    final float PI=3.14f;
    void setRadius(float fR) {
        fRadius=fR;
    }
    void showArea(){
        System.out.println("The area of the circle is "+fRadius*fRadius*PI);

    final float PI = 3.14f;

    void setRadius(float fR) {
        fRadius = fR;
    }

    void showArea() {
        System.out.println("The area of the circle is " + fRadius * fRadius * PI);

    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRadius(5);
        circle.showArea();
    }
}

