package com.PracticalTraining.N4;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入一个字符串: ");
        String str = scanner.nextLine();

        StringBuffer reversedStr = new StringBuffer();

        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);

            if (Character.isUpperCase(ch)) {
                reversedStr.append(Character.toLowerCase(ch));
            } else {
                reversedStr.append(Character.toUpperCase(ch));
            }
        }

        String result = reversedStr.toString();
        System.out.println("反转并转换大小写后的字符串: " + result);
    }
}
