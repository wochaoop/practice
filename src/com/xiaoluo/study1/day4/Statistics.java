package com.xiaoluo.study1.day4;

import java.util.Scanner;

public class Statistics {
    public static void main(String[] args) {
        System.out.print("请输入一串字符串:");
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        int upper = 0;
        int lower = 0;
        int digit = 0;
        int other = 0;
        for (int i = 0; i < n.length(); i++) {
            char ch = n.charAt(i);
            if(Character.isUpperCase(ch))
                upper++;
            else if(Character.isLowerCase(ch))
                lower++;
            else if(Character.isDigit(ch))
                digit++;
            else
                other++;
        }
        System.out.println("大写字符:" + upper);
        System.out.println("小写字符:" + lower);
        System.out.println("数字字符:" + digit);
        System.out.println("其他字符:" + other);
    }
}
