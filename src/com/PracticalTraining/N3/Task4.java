package com.PracticalTraining.N3;

import java.math.BigDecimal;
import java.text.DecimalFormat;

class BankAccount {
    private static BigDecimal minBalance = BigDecimal.valueOf(10000); // 最小余额
    private static BigDecimal currentInterestRate = BigDecimal.valueOf(0.02); // 活期利息

    private String accountNumber;
    private String accountHolderName;
    private String address;
    private BigDecimal balance;
    private BigDecimal interest;

    public BankAccount(String accountNumber, String accountHolderName, String address, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.address = address;
        this.balance = BigDecimal.valueOf(balance);
        this.interest = BigDecimal.ZERO;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            BigDecimal depositAmount = BigDecimal.valueOf(amount);
            balance = balance.add(depositAmount);
            System.out.println("存款成功！");
        } else {
            System.out.println("存款金额必须大于0！");
        }
    }

    public void withdraw(double amount) {
        BigDecimal withdrawAmount = BigDecimal.valueOf(amount);
        if (balance.subtract(withdrawAmount).compareTo(minBalance) >= 0) {
            balance = balance.subtract(withdrawAmount);
            System.out.println("取款成功！");
        } else {
            System.out.println("余额不足！");
        }
    }

    public void checkBalance() {
        System.out.println("当前余额：" + formatAmount(balance));
    }

    public void calculateInterest() {
        interest = balance.multiply(currentInterestRate);
        System.out.println("计算利息成功！");
    }

    public void accumulateInterest() {
        balance = balance.add(interest);
        interest = BigDecimal.ZERO;
        System.out.println("累加利息成功！");
    }

    public static BigDecimal getMinBalance() {
        return minBalance;
    }

    public static void setMinBalance(double minBalance) {
        BankAccount.minBalance = BigDecimal.valueOf(minBalance);
    }

    public static BigDecimal getCurrentInterestRate() {
        return currentInterestRate;
    }

    public static void setCurrentInterestRate(double currentInterestRate) {
        BankAccount.currentInterestRate = BigDecimal.valueOf(currentInterestRate);
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public BigDecimal getInterest() {
        return interest;
    }

    public String formatAmount(BigDecimal amount) {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        return df.format(amount);
    }
}

public class Task4 {
    public static void main(String[] args) {
        BankAccount.setMinBalance(10000); // 设置最小存款金额

        BankAccount account = new BankAccount("123456789", "John Doe", "123 Main Street", 1000000000000000.0);

        System.out.println("账户余额：" + account.formatAmount(account.getBalance()));
        System.out.print("你要存几年：");
        int years = 2; // 假设存款时间为2年
        System.out.print(years);
        System.out.print("你存入" + account.formatAmount(BigDecimal.valueOf(463812.32)) + "元，");
        account.deposit(463812.32);
        System.out.println("账户余额：" + account.formatAmount(account.getBalance()) + "元");

        System.out.print("你取出" + account.formatAmount(BigDecimal.valueOf(4132.4)) + "元，");
        account.withdraw(4132.4);
        System.out.println("账户余额：" + account.formatAmount(account.getBalance()) + "元");

        account.calculateInterest();
        System.out.println("你的利息为：" + account.formatAmount(account.getInterest()));

        account.accumulateInterest();
        System.out.println("你的累加利息为：" + account.formatAmount(account.getInterest()));

        System.out.println("本银行最小存钱为：" + account.formatAmount(BankAccount.getMinBalance()));
    }
}
