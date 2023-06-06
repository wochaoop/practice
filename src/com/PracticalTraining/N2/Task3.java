package com.PracticalTraining.N2;

class Student {
    private String sNO;
    private String sName;
    private String sSex;
    private int sAge;
    private double sJava;

    public Student(String sNO, String sName, String sSex, int sAge, double sJava) {
        this.sNO = sNO;
        this.sName = sName;
        this.sSex = sSex;
        this.sAge = sAge;
        this.sJava = sJava;
    }

    public String getNo() {
        return sNO;
    }

    public String getName() {
        return sName;
    }

    public String getSex() {
        return sSex;
    }

    public int getAge() {
        return sAge;
    }

    public double getJava() {
        return sJava;
    }

    public void setNo(String sNO) {
        this.sNO = sNO;
    }

    public void setName(String sName) {
        this.sName = sName;
    }

    public void setSex(String sSex) {
        this.sSex = sSex;
    }

    public void setAge(int sAge) {
        this.sAge = sAge;
    }

    public void setJava(double sJava) {
        this.sJava = sJava;
    }
}

public class Task3 {
    public static void main(String[] args) {
        // 创建五个学生对象
        Student student1 = new Student("1001", "小明", "男", 20, 85.5);
        Student student2 = new Student("1002", "小红", "女", 19, 77.2);
        Student student3 = new Student("1003", "小华", "女", 21, 92.3);
        Student student4 = new Student("1004", "小强", "男", 22, 81.8);
        Student student5 = new Student("1005", "小丽", "女", 20, 88.9);

        // 输出每个学生的信息
        System.out.println("学生信息：");
        System.out.println("学生 1：" + student1.getNo() + "，" + student1.getName() + "，" + student1.getSex() + "，" + student1.getAge() + "，" + student1.getJava());
        System.out.println("学生 2：" + student2.getNo() + "，" + student2.getName() + "，" + student2.getSex() + "，" + student2.getAge() + "，" + student2.getJava());
        System.out.println("学生 3：" + student3.getNo() + "，" + student3.getName() + "，" + student3.getSex() + "，" + student3.getAge() + "，" + student3.getJava());
        System.out.println("学生 4：" + student4.getNo() + "，" + student4.getName() + "，" + student4.getSex() + "，" + student4.getAge() + "，" + student4.getJava());
        System.out.println("学生 5：" + student5.getNo() + "，" + student5.getName() + "，" + student5.getSex() + "，" + student5.getAge() + "，" + student5.getJava());

        // 计算并输出Java语言成绩的平均值
        double averageJava = (student1.getJava() + student2.getJava() + student3.getJava() + student4.getJava() + student5.getJava()) / 5;
        System.out.println("Java语言成绩平均值：" + averageJava);

        // 计算并输出Java语言成绩的最大值和最小值
        double maxJava = Math.max(Math.max(Math.max(student1.getJava(), student2.getJava()), Math.max(student3.getJava(), student4.getJava())), student5.getJava());
        double minJava = Math.min(Math.min(Math.min(student1.getJava(), student2.getJava()), Math.min(student3.getJava(), student4.getJava())), student5.getJava());
        System.out.println("Java语言成绩最大值：" + maxJava);
        System.out.println("Java语言成绩最小值：" + minJava);
    }
}
