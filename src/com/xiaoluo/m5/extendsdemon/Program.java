package com.xiaoluo.m5.extendsdemon;

public class Program extends Employee {
    int bonus = 10000;
    public void print() {
        System.out.println("bonus :"+this.bonus);
    }
    public static void main(String[] args) {
        Program p = new Program();
        System.out.println("salary:" + p.salary);
        System.out.println("bonus:" + p.bonus);
    }
}
