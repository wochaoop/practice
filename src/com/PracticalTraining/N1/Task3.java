package com.PracticalTraining.N1;

public class Task3 {
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
            throw new IllegalArgumentException("除数不能为0");
        }
    }
}

class CalculatorTest {
    public static void main(String[] args) {
        double num1 = 10;
        double num2 = 5;

        double sum = Task3.add(num1, num2);
        double difference = Task3.subtract(num1, num2);
        double product = Task3.multiply(num1, num2);
        double quotient = Task3.divide(num1, num2);

        System.out.println("和: " + sum);
        System.out.println("差: " + difference);
        System.out.println("积: " + product);
        System.out.println("商: " + quotient);
    }
}
