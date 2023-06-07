package com.PracticalTraining.N4;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入字符串：");
        String str = scanner.nextLine();

        int uppercaseCount = 0;
        int lowercaseCount = 0;
        int digitCount = 0;
        int otherCount = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isUpperCase(ch)) {
                uppercaseCount++;
            } else if (Character.isLowerCase(ch)) {
                lowercaseCount++;
            } else if (Character.isDigit(ch)) {
                digitCount++;
            } else {
                otherCount++;
            }
        }

        System.out.println("大写字母个数：" + uppercaseCount);
        System.out.println("小写字母个数：" + lowercaseCount);
        System.out.println("数字字符个数：" + digitCount);
        System.out.println("其他字符个数：" + otherCount);
    }
}
