package com.xiwangly.work;

public class Work8 {
    public static void main(String[] args) {
        int num = -10;
        long absNum = Math.abs((long) num);  // 转换为long类型，确保位运算不出错
        char[] binaryArray = new char[32];
        int index = 0;

        while (index < 32) {
            binaryArray[index] = (absNum & 1) == 1 ? '1' : '0';  // 取最低位，判断是0还是1
            absNum >>= 1;  // 右移一位
            index++;
        }

//        if (num < 0) {
            // 负数的补码等于其绝对值的按位取反再加一
            for (int i = 0; i < binaryArray.length; i++) {
                binaryArray[i] = binaryArray[i] == '0' ? '1' : '0';
            }
            int carry = 1;
            for (int i = binaryArray.length - 1; i >= 0; i--) {
                int sum = (binaryArray[i] - '0') + carry;
                if (sum == 2) {
                    binaryArray[i] = '0';
                    carry = 1;
                } else {
                    binaryArray[i] = (char) (sum + '0');
                    carry = 0;
                }
            }
//        }

        String binaryString = new String(binaryArray);
        System.out.println(binaryString);
    }
}
