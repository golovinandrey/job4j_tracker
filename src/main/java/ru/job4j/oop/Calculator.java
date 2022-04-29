package ru.job4j.oop;

public class Calculator {

    private static int x = 5;
    int y = 10, a = 9, z = 15, c = 2;

    public static int sum(int y) {
        return x + y;
    }

    public static int minus(int a) {
        return a - x;
    }

    public int devide(int z) {
        return z / x;
    }

    public int multiply(int c) {
        return x * c;
    }

    public int sumAllOperation() {
        return sum(y) + minus(a) + devide(z) + multiply(c);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.sumAllOperation();
        System.out.println(calculator.sumAllOperation());
    }
}
