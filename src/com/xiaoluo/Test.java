package com.xiaoluo;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生的人数：");
        int r = sc.nextInt();
        System.out.println("请输入考试科目数：");
        int k = sc.nextInt();
        int[][] grade = new int[r][k];
        for (int i = 0; i < r; i++) {
            System.out.println("请录入第" + (i + 1) + "个学生的成绩：");
            for (int j = 0; j < k; j++) {
                System.out.println("请录入第" + (i + 1) + "个学生的第" + (j + 1) + "科成绩");
                grade[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < r; i++) {
            //计算一个学生所有科目的范湖
            int sum = 0;
            int max = grade[i][0];
            int min = grade[i][0];
            for (int j = 0; j < k; j++) {
                //求一个学生的分数和
                sum += grade[i][j];
            }
            System.out.println("第" + (i + 1) + "个学生的总分为：" + sum + "\t平均分为：" + (sum * 1.0 / k));
        }
        sc.close();
    }
}