package com.PracticalTraining.N1;

public class Task4 {
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
        int number1 = 5;
        int number2 = 10;

        System.out.println("树的高度为 " + number1 + " 时：");
        printTree(number1);

        System.out.println("树的高度为 " + number2 + " 时：");
        printTree(number2);
    }
}
