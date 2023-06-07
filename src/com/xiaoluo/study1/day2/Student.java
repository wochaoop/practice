package com.xiaoluo.study1.day2;

public class Student {
    private int sNO;
    private String sName;
    private String sSex;
    private int sAge;
    private double sJava;

    public double getsJava() {
        return sJava;
    }

    public int getsAge() {
        return sAge;
    }

    public int getsNO() {
        return sNO;
    }

    public String getsName() {
        return sName;
    }

    public String getsSex() {
        return sSex;
    }

    public void setsAge(int sAge) {
        this.sAge = sAge;
    }

    public void setsJava(double sJava) {
        this.sJava = sJava;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public void setsNO(int sNO) {
        this.sNO = sNO;
    }

    public void setsSex(String sSex) {
        this.sSex = sSex;
    }

    public Student() {

    }

    public Student(int sNO, String sName, String sSex, int sAge, double sJava) {
        this.sAge = sAge;
        this.sJava = sJava;
        this.sName = sName;
        this.sNO = sNO;
        this.sSex = sSex;
    }

    @Override
    public String toString() {
        return "学生姓名: " + sName + " 学生学号: " + sNO + " 学生性别: " + sSex + " 学生年龄: " + sAge + " 学生Java课程成绩: " + sJava;
    }

    public static void main(String[] args) {
        Student student1 = new Student(1001, "name1", "男", 20, 88.0);
        Student student2 = new Student(1002, "name2", "男", 19, 85.0);
        Student student3 = new Student(1003, "name3", "女", 18, 90.0);
        Student student4 = new Student(1004, "name4", "男", 19, 86.6);
        Student student5 = new Student(1005, "name5", "女", 17, 81.0);

        System.out.println("学生信息：");
        System.out.println(student1.toString());
        System.out.println(student2.toString());
        System.out.println(student3.toString());
        System.out.println(student4.toString());
        System.out.println(student5.toString());

        double averageJava = (student1.getsJava() + student2.getsJava() + student3.getsJava() + student4.getsJava() + student5.getsJava()) / 5;
        System.out.println("Java语言成绩平均值：" + averageJava);

        double maxJava = Math.max(Math.max(Math.max(student1.getsJava(), student2.getsJava()), Math.max(student3.getsJava(), student4.getsJava())), student5.getsJava());
        double minJava = Math.min(Math.min(Math.min(student1.getsJava(), student2.getsJava()), Math.min(student3.getsJava(), student4.getsJava())), student5.getsJava());
        System.out.println("Java语言成绩最大值：" + maxJava);
        System.out.println("Java语言成绩最小值：" + minJava);
    }
}
