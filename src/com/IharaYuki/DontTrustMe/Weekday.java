package com.IharaYuki.DontTrustMe;

import java.util.Scanner;

public class Weekday {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("输入一个代表第几天的数字（1-7）");
        int dayOfWeek = input.nextInt();
        String weekday = "";
        switch (dayOfWeek){
            case 1:
                weekday="星期一";
                break;
            case 2:
                weekday="星期二";
                break;
            case 3:
                weekday="星期三";
                break;
            case 4:
                weekday="星期四";
                break;
            case 5:
                weekday="星期五";
                break;
            case 6:
                weekday="星期六";
                break;
            case 7:
                weekday="星期天";
                break;
            default:
                System.out.printf("输入错误 请输入数字 （1-7）之间的内容");
                System.exit(0);
        }
        System.out.println("今天是"+weekday);
    }
}
