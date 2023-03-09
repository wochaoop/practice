package com.xiwangly.work;

public class Work10 {
    private String name;
    private String color;
    private String variety;

    public Work10(String name, String color, String variety) {
        this.name = name;
        this.color = color;
        this.variety = variety;
    }

    public void eat() {
        System.out.println("啃骨头");
    }

    public void run() {
        System.out.println("叼着骨头跑");
    }

    public static void main(String[] args) {
        Work10 wuhuarou = new Work10("五花肉", "棕色", "阿拉斯加");
        wuhuarou.eat();
        wuhuarou.run();
    }
}
