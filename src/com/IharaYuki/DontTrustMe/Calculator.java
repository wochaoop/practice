package com.IharaYuki.DontTrustMe;

import static com.IharaYuki.DontTrustMe.Calculator.*;

public class Calculator {
    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public static double divide(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.printf("除数不能为0");
        }
        return 0;
    }
}

class CalculatorTest {
    public static void main(String[] args) {
        double num1 = 10;
        double num2 = 0;

        double sum = add(num1, num2);
        double difference = subtract(num1, num2);
        double product = multiply(num1, num2);
        double quotient =divide(num1, num2);

        System.out.println("和: " + sum);
        System.out.println("差: " + difference);
        System.out.println("积: " + product);
        System.out.println("商: " + quotient);
    }
}

