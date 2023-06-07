package com.xiaoluo.study1.day4;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class GetAge {
    public static int getAge(String CardCode) {
        String year = CardCode.substring(6).substring(0, 4);// 得到年份
        String yue = CardCode.substring(10).substring(0, 2);// 得到月份
        String day = CardCode.substring(12).substring(0, 2);//得到日
        Date date = new Date();// 得到当前的系统时间
        SimpleDateFormat format = new SimpleDateFormat("2023-06-07");
        String fyear = format.format(date).substring(0, 4);// 当前年份
        String fyue = format.format(date).substring(5, 7);// 当前月份
        String fday = format.format(date).substring(8, 10);// 当前日
        int age = 0;
        if (Integer.parseInt(yue) < Integer.parseInt(fyue)) {
            age = Integer.parseInt(fyear) - Integer.parseInt(year) + 1;
        }
        else if (Integer.parseInt(yue) == Integer.parseInt(fyue)) {
            if (Integer.parseInt(fday) > Integer.parseInt(day)) {
                age = Integer.parseInt(fyear) - Integer.parseInt(year) + 1;
            }
            else {
                age = Integer.parseInt(fyear) - Integer.parseInt(year);
            }
        } else {
            age = Integer.parseInt(fyear) - Integer.parseInt(year);
        }
        return age;
    }

    public static void main(String[] args) {
        System.out.print("请输入你的身份证号：");
        Scanner scanner = new Scanner(System.in);
        String n = scanner.next();
        System.out.println("你现在的年龄是：" + getAge(n));
    }
}
