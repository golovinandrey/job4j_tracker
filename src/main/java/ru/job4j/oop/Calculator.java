package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int b) {
        return x + b;
    }

    public static int minus(int b) {
        return b - x;
    }

    public int devide(int b) {
        return b / x;
    }

    public int multiply(int b) {
        return x * b;
    }

    public int sumAllOperation(int b) {
        return sum(b) + minus(b) + devide(b) + multiply(b);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.sumAllOperation(10);
        System.out.println(calculator.sumAllOperation(10));
    }
}
