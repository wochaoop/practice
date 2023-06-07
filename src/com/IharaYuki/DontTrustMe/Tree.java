package com.IharaYuki.DontTrustMe;

import java.util.Scanner;

public class Tree {
    public static void printTree(int number) {
        for (int i = 1; i <= number; i++) {
            // 打印空格
            for (int j = 1; j <= number - i; j++) {
                System.out.print(" ");
            }

            // 打印星号
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.printf("输入树的高度（阿拉伯数字）");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        System.out.println("树的高度为 " + number + " 时：");
        printTree(number);
    }
}
