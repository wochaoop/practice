package com.IharaYuki.DontTrustMe;

public class Computer {
    // 定义私有属性
    private int id;
    private String brand;
    private double price;
    private String form;

    // 定义无参构造方法
    public Computer() {}

    // 定义有参构造方法
    public Computer(int id, String brand, double price, String form) {
        this.id = id;
        this.brand = brand;
        this.price = price;
        this.form = form;
    }

    // 设置和获取方法
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getForm(){
        return form;
    }

    public void setForm(String form){
        this.form=form;
    }

    // 描述计算机对象行为的方法
    public void turnOn() {
        System.out.println("计算机已开机");
    }

    public void autorun(){
        System.out.println("计算机正在运行");
    }

    public void turnOff() {
        System.out.println("计算机已关机");
    }

    public void printAllAttributes() {
        System.out.printf("计算机ID：%d，品牌：%s，价格：%.2f,地区：%s\n", id, brand, price, form);
    }
}

class ComputerTest {
    public static void main(String[] args) {
        // 创建一个计算机对象
        Computer computer = new Computer(1001, "Dell", 5000.00,"UK");

        // 输出计算机属性
        computer.printAllAttributes();
        // 设置计算机属性
        computer.setId(1002);
        computer.setBrand("HP");
        computer.setPrice(4500.00);
        computer.setForm("USA");

        // 输出修改后的计算机属性
        computer.printAllAttributes();

        // 打开计算机
        computer.turnOn();
        //正在运行计算机
        computer.autorun();
        // 关闭计算机
        computer.turnOff();
    }
}
