package com.xiwangly.calculator;

import java.io.IOException;
import java.net.URLEncoder;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner myScanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n请输入计算式：");
            String message = myScanner.next();
            if (message.equals("exit")) {
                break;
            }
            message = URLEncoder.encode(message, "UTF-8");
            System.out.println("计算结果：");
            String return_message = new Calc(message).toString();
        }
    }
}
