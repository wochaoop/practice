package com.xiwangly.work;

public class Work8 {
    public static void main(String[] args) {
        int num = -1;  // 负整数
        for (int i = 31; i >= 0; i--) {  // 从高位到低位遍历32位二进制数
            int bit = (num >> i) & 1;  // 取出当前位的值
            System.out.print(bit);  // 输出当前位的值
        }
    }
}
