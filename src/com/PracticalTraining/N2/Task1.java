package com.PracticalTraining.N2;

class Computer {
    private String brand;
    private double price;
    private String origin;

    // 无参构造方法
    public Computer() {
    }

    // 有参构造方法
    public Computer(String brand, double price, String origin) {
        this.brand = brand;
        this.price = price;
        this.origin = origin;
    }

    // 获取品牌
    public String getBrand() {
        return brand;
    }

    // 设置品牌
    public void setBrand(String brand) {
        this.brand = brand;
    }

    // 获取价格
    public double getPrice() {
        return price;
    }

    // 设置价格
    public void setPrice(double price) {
        this.price = price;
    }

    // 获取产地
    public String getOrigin() {
        return origin;
    }

    // 设置产地
    public void setOrigin(String origin) {
        this.origin = origin;
    }

    // 打印计算机对象的所有属性值
    public void printComputerDetails() {
        System.out.println("Computer{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", origin='" + origin + '\'' +
                '}');
    }

    // 计算机对象的行为方法示例
    public void turnOn() {
        System.out.println("电脑开机了");
    }

    public void turnOff() {
        System.out.println("电脑关机了");
    }
}

public class Task1 {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.setBrand("联想");
        computer.setPrice(50000.0);
        computer.setOrigin("美国");

        computer.turnOn();
        System.out.println("电脑正在运行");
        computer.turnOff();

        computer.printComputerDetails();
    }
}
