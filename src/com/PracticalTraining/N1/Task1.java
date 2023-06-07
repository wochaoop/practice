package com.PracticalTraining.N1;

public class Task1 {
    public static void main(String[] args) {
        int numSolutions = 0;

        for (int numCocks = 0; numCocks <= 20; numCocks++) {
            for (int numHens = 0; numHens <= 33; numHens++) {
                int numChicks = 100 - numCocks - numHens;
                int totalMoney = numCocks * 5 + numHens * 3 + numChicks / 3;
                if (numChicks % 3 == 0 && totalMoney == 100) {
                    numSolutions++;
                    System.out.println("解法 " + numSolutions + ":");
                    System.out.println("公鸡数量: " + numCocks);
                    System.out.println("母鸡数量: " + numHens);
                    System.out.println("小鸡数量: " + numChicks);
                    System.out.println();
                }
            }
        }

        System.out.println("总共的解法数量: " + numSolutions);
    }
}

