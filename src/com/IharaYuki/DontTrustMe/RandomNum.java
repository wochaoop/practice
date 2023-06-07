package com.IharaYuki.DontTrustMe;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomNum {
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
            System.out.print(number+" ");

        }
    }
}
