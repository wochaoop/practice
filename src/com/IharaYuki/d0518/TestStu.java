package com.IharaYuki.d0518;

public class TestStu {
    public static void initAry(Student[][] aryStudent) {
        for (int i = 0; i< aryStudent.length; i++){
            for (int j = 0; j< aryStudent[i].length; i++){
                Student student = new Student();
                student.name="name"+i+j;
                student.cs_score= (int)Math.random()*100;
                student.en_score= (int)Math.random()*100;
                student.math_score= (int)Math.random()*100;
                aryStudent[i][j] = student;
            }

        }

    }
    public static void talAry(Student[][] aryStudent) {
        for (int i = 0; i< aryStudent.length; i++){
            for (int j = 0; j< aryStudent[i].length; i++){
                Student suStudent = aryStudent[i][j];
                System.out.print(aryStudent[i][j].name+" ");
            }
            System.out.println();
        }

    }


    public static void main(String[] args) {
        Student[][] aryStudent = new Student[4][5];
        initAry(aryStudent);
        talAry(aryStudent);
    }
}
