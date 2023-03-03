package com.xiwangly.work;

import java.util.Scanner;

public class Work9 {
    public static void main(String[] args) {
        try {
            Scanner myScanner = new Scanner(System.in);
            System.out.println("请输入正整数：");
            int n = Integer.parseInt(myScanner.next());
            if (n < 0) {
                System.out.println("输入错误，值应该大于0");
                System.exit(1);
            }
            long sum = 1L;
            for (int i = 1; i <= n; i++) {
                sum *= i;
            }
            if (sum == 0L && n != 0) {
                System.out.println("输入的值太大了");
                System.exit(1);
            }
            System.out.println(sum);
        }
        catch (Exception e) {
            System.out.println("输入错误");
            System.exit(1);
        }
    }
}
