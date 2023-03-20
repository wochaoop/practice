package com.xiaoluo;

import java.util.Scanner;

public class work8 {
    public static void main(String[] args) {
        int num = -1;
        for (int i = 31; i >= 0; i--) {
            int bit = (num >> i) & 1;
            System.out.print(bit);
        }
    }
}
