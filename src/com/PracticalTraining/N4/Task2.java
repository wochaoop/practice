package com.PracticalTraining.N4;

import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> randomNumbers = new ArrayList<>();
        Random random = new Random();

        // 生成随机数并添加到列表中
        for (int i = 0; i < 10; i++) {
            int randomNumber = random.nextInt(100); // 生成0到99之间的随机数
            randomNumbers.add(randomNumber);
        }

        // 使用Iterator遍历列表
        for (int number : randomNumbers) {
            System.out.println(number);
        }
    }
}
