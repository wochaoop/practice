package com.xiaoluo.study1.day2;

public class Computer {

    private String computerName;
    private float computerPrice;
    private String computerFrom;

    public String getComputerFrom() {
        return computerFrom;
    }

    public String getComputerName() {
        return computerName;
    }

    public float getComputerPrice() {
        return computerPrice;
    }

    public void setComputerFrom(String computerFrom) {
        this.computerFrom = computerFrom;
    }

    public void setComputerName(String computerName) {
        this.computerName = computerName;
    }

    public void setComputerPrice(float computerPrice) {
        this.computerPrice = computerPrice;
    }

    public void open() {
        System.out.println("电脑开机了");
    }
    public void run() {
        System.out.println("电脑正在运行");
    }
    public void shutdown() {
        System.out.println("电脑关机了");
    }
    public String toString() {
        return  "{" + "computerName:" + computerName + "," + "computerPrice:" + computerPrice + "," + "computerFrom:" + "," + computerFrom + "}";
    }

    public Computer() {

    }
    public Computer(String computerName, float computerPrice, String computerFrom) {
        this.computerName = computerName;
        this.computerPrice = computerPrice;
        this.computerFrom = computerFrom;
    }

    public static void main(String[] args) {
        Computer computer = new Computer("联想",5000.0F,"美国");
        computer.open();
        computer.run();
        computer.shutdown();
        System.out.println(computer.toString());
    }
}
