package com.example.m2;
import java.util.Scanner;
public class CalculateDemo {

    public static void main(String[] args) {
            //实现计算器功能
            Scanner scanner = new Scanner(System.in);
            boolean temp = true;
            while (temp) {
                System.out.println("+------------+");
                System.out.println("|    计算器   |");
                System.out.println("|   1.加法    |");
                System.out.println("|   2.减法    |");
                System.out.println("|   3.乘法    |");
                System.out.println("|   4.除法    |");
                System.out.println("|   5.退出    |");
                System.out.println("+------------+");
                System.out.print("请输入选项：");

                int choice = scanner.nextInt();
                int a;
                int b;

                switch (choice) {
                    case 1:
                        System.out.print("请输入第一个加数：");
                        a = scanner.nextInt();
                        System.out.print("请输入第二个加数：");
                        b = scanner.nextInt();
                        System.out.println("和为：" + add(a, b));
                        break;
                    case 2:
                        System.out.print("请输入第一个减数：");
                        a = scanner.nextInt();
                        System.out.print("请输入第二个减数：");
                        b = scanner.nextInt();
                        System.out.println("差为：" + sub(a, b));
                        break;
                    case 3:
                        System.out.print("请输入第一个乘数：");
                        a = scanner.nextInt();
                        System.out.print("请输入第二个乘数：");
                        b = scanner.nextInt();
                        System.out.println("积为：" + plus(a, b));
                        break;
                    case 4:
                        System.out.print("请输入被除数：");
                        a = scanner.nextInt();
                        System.out.print("请输入除数：");
                        b = scanner.nextInt();
                        System.out.println("商为：" + divide(a, b));
                        break;
                    case 5:
                        temp = false;
                        break;
                    default:
                        System.out.println("输入有误");
                }
            }
        }


        public static double add ( double a, double b){
            return a + b;
        }

        public static double sub ( double a, double b){
            return a - b;
        }

        public static double plus ( double a, double b){
            return a * b;
        }

        public static double divide ( double a, double b){
            return a / b;
        }
    }
