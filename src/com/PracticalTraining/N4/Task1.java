package com.PracticalTraining.N4;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入您的身份证号码：");
        String idNumber = scanner.nextLine();

        if (isValidIdNumber(idNumber)) {
            int age = calculateAge(idNumber);
            System.out.println("您的年龄是：" + age + "岁");
        } else {
            System.out.println("身份证号码格式不正确！");
        }
    }

    public static boolean isValidIdNumber(String idNumber) {
        // 身份证号码验证逻辑，可以使用正则表达式等进行进一步验证
        // 在此处只作为示例，需要根据实际情况进行更严格的验证
        return idNumber.matches("\\d{17}[0-9Xx]");
    }

    public static int calculateAge(String idNumber) {
        int year = Integer.parseInt(idNumber.substring(6, 10));
        int month = Integer.parseInt(idNumber.substring(10, 12));
        int day = Integer.parseInt(idNumber.substring(12, 14));

        LocalDate currentDate = LocalDate.now();
        LocalDate birthDate = LocalDate.of(year, month, day);

        Period period = Period.between(birthDate, currentDate);
        return period.getYears();
    }
}
