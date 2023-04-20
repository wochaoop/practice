package com.xiaoluo.program;

import com.xiaoluo.m5.overwritedemo.Bank;

import java.util.Scanner;

public class Operate extends BankName {
    public static void main(String[] args) {
        BankName bankName1 = new BankName();
        bankName1.balance = 500;
        bankName1.account = "3428237080";
        bankName1.name = "小罗";
        bankName1.password = "040114";
        bankName1.CheckAccount();
        bankName1.CheckName();
        bankName1.EnterPassword();
        System.out.println("请选择您需要的操作：");
        System.out.println("1.存款");
        System.out.println("2.取款");
        System.out.println("3.查看余额");
        System.out.println("4.修改密码");
        System.out.println("5.结束服务");
        Scanner n = new Scanner(System.in);
        int num = n.nextInt();
            switch (num) {
                case 1:
                    bankName1.deposit();
                    bankName1.CheckBalance();
                    break;
                case 2:
                    bankName1.Withdrawal();
                    bankName1.CheckBalance();
                    break;
                case 3:
                    bankName1.CheckBalance();
                case 4:
                    bankName1.RevisePassword();
                case 5:
                    break;
            }
    }
}
