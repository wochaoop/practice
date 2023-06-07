package com.PracticalTraining.N1;

public class Task2 {
    public static void main(String[] args) {
        int day = 3; // 要判断的天数（1代表第一天，2代表第二天，以此类推）

        switch (day) {
            case 1:
                System.out.println("星期日");
                break;
            case 2:
                System.out.println("星期一");
                break;
            case 3:
                System.out.println("星期二");
                break;
            case 4:
                System.out.println("星期三");
                break;
            case 5:
                System.out.println("星期四");
                break;
            case 6:
                System.out.println("星期五");
                break;
            case 7:
                System.out.println("星期六");
                break;
            default:
                System.out.println("无效的天数");
                break;
        }
    }
}
