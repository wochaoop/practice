package com.IharaYuki.DontTrustMe;

public class BuyChicken {
        public static void main(String[] args) {
            int count = 0;
            for (int i = 0; i <= 20; i++) {
                for (int j = 0; j <= 33; j++) {
                    int k = 100 - i - j;
                    if (5 * i + 3 * j + k / 3 == 100 && k % 3 == 0) {
                        count++;
                        System.out.println("第" + count + "种方案：公的" + i + "只，母的" + j + "只，小的" + k + "只");
                    }
                }
            }
            System.out.println("总共有"+count+"种方案");

        }



}
