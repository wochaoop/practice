package com.xiaoluo.program;

import java.util.Scanner;

public class BankName {
    String account;
    String name;
    String password;
    float balance;

    void CheckBalance() {   //查看余额
        System.out.println(balance);
    }

    void CheckAccount() {   //查看账号
        System.out.println(account);
    }

    void CheckName() {  //查看用户姓名
        System.out.println(name);
    }

    void EnterPassword() {  //输入密码，并确认密码正确性
        System.out.println("请输入您的密码：");
        Scanner word = new Scanner(System.in);
        String Password = null;
        while (true) {
            String PrintPassword = word.next();
            if (PrintPassword.equals(password)) {
                System.out.println("密码正确，进入系统");
                break;
            } else {
                System.out.println("密码错误，请重新输入");
            }
        }
    }

    void RevisePassword() { //修改密码
        System.out.println("请输入您的密码：");
        Scanner word = new Scanner(System.in);
        String Password = null;
        while (true) {
            String PrintPassword = word.next();
            if (PrintPassword.equals(password)) {
                System.out.println("密码正确，请输入您要修改的密码");
                Scanner password1 = new Scanner(System.in);
                String n = password1.next();
                System.out.println("请确认您要修改的密码：");
                while (true) {
                    Scanner password2 = new Scanner(System.in);
                    String m = password2.next();
                    if (m.equals(n)) {
                        System.out.println("输入正确，密码修改成功");
                        password = m;
                        break;
                    } else {
                        System.out.println("输入错误，请重新输入");
                    }
                }
            } else {
                System.out.println("密码错误，请重新输入");
            }
        }
    }

    void deposit() {    //存款
        System.out.println("请输入您的存款数额：");
        Scanner deposit = new Scanner(System.in);
        float n = deposit.nextFloat();
        balance = balance + n;
    }

    void Withdrawal() { //取款
        System.out.println("请输入您的取款数额：");
        Scanner withdrawal = new Scanner(System.in);
        int n = withdrawal.nextInt();
        balance = balance - n;
    }
}
