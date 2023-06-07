package com.PracticalTraining.N4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> numbers = generateRandomNumbers(10); // 生成10个随机数并存入List集合

        System.out.println("随机数列表：");
        printNumbers(numbers); // 遍历并输出随机数列表
    }

    public static List<Integer> generateRandomNumbers(int count) {
        List<Integer> numbers = new ArrayList<>();

        Random random = new Random(); // 创建Random对象

        for (int i = 0; i < count; i++) {
            int randomNumber = random.nextInt(100); // 生成0到99之间的随机数
            numbers.add(randomNumber); // 将随机数添加到List集合
        }

        return numbers;
    }

    public static void printNumbers(List<Integer> numbers) {
        Iterator<Integer> iterator = numbers.iterator(); // 创建Iterator对象

        while (iterator.hasNext()) {
            int number = iterator.next(); // 获取下一个元素
            System.out.println(number); // 输出元素值
        }
    }
}
