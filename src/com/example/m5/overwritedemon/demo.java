package com.example.m5.overwritedemon;

class superClass{
    int num = 10;
    public void print(){
        System.out.println(num); //  10
    }
}
class subClass extends superClass{
    int num = 20;
    @Override
    public void print(){
        System.out.println(num); //  20
    }
}
public class demo{
    public static void main(){
        superClass obj = new subclass();
        obj.print(); // 20
        System.out.println(obj.num); //  10
        System.out.println(((subclass)obj).num); //  20
    }
}
