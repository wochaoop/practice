package com.xiaoluo.example.m7.day0518;

public class TestStudent {

    public static void initAry(Student[][] aryStudent) {
        for (int i = 0; i < aryStudent.length; i++) {
            for (int j = 0; j < aryStudent[i].length; j++) {
                Student student = new Student();
                student.name = "name" + i + j;
                student.cs_score = (int)(Math.random() * 100);
                student.en_score = (int)(Math.random() * 100);
                student.math_score = (int)(Math.random() * 100);
                aryStudent[i][j] = student;
            }
        }
    }

    public static void tralAry(Student[][] aryStudent) {
        for (int i = 0; i < aryStudent.length; i++) {
            for (int j = 0; j < aryStudent[i].length; j++) {
                System.out.print(aryStudent[i][j].name);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static Student seachAry(Student[][] aryStudent, String name) {
        Student student = null;
        for (int i = 0; i < aryStudent.length; i++) {
            for (int j = 0; j < aryStudent[i].length; j++ ) {
                if (aryStudent[i][j].name.equals(name))
                    return aryStudent[i][j];
            }
        }
        return student;
    }

    public static void main(String[] args) {
        Student[][] aryStudent = new Student[4][5];
        initAry(aryStudent);
        tralAry(aryStudent);
        Student student = seachAry(aryStudent,"name22");
        System.out.println("该学生的名字为：" + student.name);
        System.out.println("该学生语文成绩为：" + student.cs_score);
        System.out.println("该学生数学成绩为：" + student.math_score);
    }
}
