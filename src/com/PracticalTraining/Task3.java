package com.PracticalTraining;

public class Task3 {
    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public static double divide(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            throw new IllegalArgumentException("除数不能为0");
        }
    }
}

class CalculatorTest {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;

        int sum = Task3.add(num1, num2);
        int difference = Task3.subtract(num1, num2);
        int product = Task3.multiply(num1, num2);
        double quotient = Task3.divide(num1, num2);

        System.out.println("和: " + sum);
        System.out.println("差: " + difference);
        System.out.println("积: " + product);
        System.out.println("商: " + quotient);
    }
}
