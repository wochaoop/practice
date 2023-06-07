package com.xiaoluo.study1.day1;

import java.util.Scanner;

public class Switch1 {
    public static void main(String[] args) {
        System.out.println("请输入第几天:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        switch (n) {
            case 1:System.out.println("星期天");break;
            case 2:System.out.println("星期一");break;
            case 3:System.out.println("星期二");break;
            case 4:System.out.println("星期三");break;
            case 5:System.out.println("星期四");break;
            case 6:System.out.println("星期五");break;
            case 7:System.out.println("星期六");break;
            default:System.out.println("输入错误");break;
        }
    }
}
