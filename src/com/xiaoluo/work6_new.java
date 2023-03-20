package com.xiaoluo;

public class work6_new {
    public static void main(String[] args) {
        int a = -10;
        int absValue = (a >> 31) == 0 ? a : (~a + 1);
        int i = 0;
        while (i <= 32) {
            a = a >> 1;
            i++;
        }
        System.out.println(absValue);
    }
}
