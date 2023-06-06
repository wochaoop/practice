package com.PracticalTraining.N3;

// 定义抽象接口：求和与统计数量
interface Calculate {
    int sumNumbers();
    int countNumbers();
}

// 奇数类
class OddNumber implements Calculate {
    @Override
    public int sumNumbers() {
        int sum = 0;
        for (int i = 1; i <= 100; i += 2) {
            sum += i;
        }
        return sum;
    }

    @Override
    public int countNumbers() {
        int count = 0;
        for (int i = 1; i <= 100; i += 2) {
            count++;
        }
        return count;
    }
}

// 偶数类
class EvenNumber implements Calculate {
    @Override
    public int sumNumbers() {
        int sum = 0;
        for (int i = 2; i <= 100; i += 2) {
            sum += i;
        }
        return sum;
    }

    @Override
    public int countNumbers() {
        int count = 0;
        for (int i = 2; i <= 100; i += 2) {
            count++;
        }
        return count;
    }
}

public class Task2 {
    public static void main(String[] args) {
        // 创建奇数类对象并验证方法
        Calculate oddNumber = new OddNumber();
        System.out.println("奇数的和：" + oddNumber.sumNumbers());
        System.out.println("奇数的个数：" + oddNumber.countNumbers());

        // 创建偶数类对象并验证方法
        Calculate evenNumber = new EvenNumber();
        System.out.println("偶数的和：" + evenNumber.sumNumbers());
        System.out.println("偶数的个数：" + evenNumber.countNumbers());
    }
}
