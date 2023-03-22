package com.xiaoluo.m5;

public class SchoolStudent {
    String name;
    static String school = "江西应用";

    public void setSchool() {
        System.out.println(name + "来自" + school);
    }

    public static void main(String[] args) {
        SchoolStudent student1 = new SchoolStudent();
        student1.name = "小罗";
        student1.setSchool();

        school = "江西环境";

        SchoolStudent student2 = new SchoolStudent();
        student2.name = "小黄";
        student2.setSchool();
    }
}
