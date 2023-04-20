package com.xiaoluo.m5.overwritedemo;

public class TextBank {
    static void printRate(Bank bank) {
        System.out.println(bank.getRate());
    }

    public static void main(String[] args) {
        printRate(new Bank());
        printRate(new SBI());
        printRate(new ICIC());
        printRate(new AXIS());

        Bank bank = new SBI();
        bank.fRate = 20;
        System.out.println(bank);
    }
}
