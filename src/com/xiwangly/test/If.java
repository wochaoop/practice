package com.xiwangly.test;

public class If {
    public static void main(String[] args) {
        int a = 6;
        int b = 6, c;
        if (a > b)
            if (a - 1 > b)
                if (a > 3) c = 6;
                else c = 1;
            else c = 2;
    }
}
