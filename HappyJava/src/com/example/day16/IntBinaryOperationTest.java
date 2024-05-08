package com.example.day16;

class Sum implements IntBinaryOperation{

    @Override
    public int apply(int a, int b) {
        return a+b;
    }
}
public class IntBinaryOperationTest {
    public static void main(String[] args) {
        Sum sum = new Sum();
        System.out.println(sum.apply(10,5));

        IntBinaryOperation add = (a, b) -> a + b;
        IntBinaryOperation subtract = (a, b) -> a - b;
        IntBinaryOperation multiply = (a, b) -> a * b;
        IntBinaryOperation divide = (a, b) -> a / b;
        System.out.println("10 + 5 = " + add.apply(10, 5));
        System.out.println("10 - 5 = " + subtract.apply(10, 5));
        System.out.println("10 * 5 = " + multiply.apply(10, 5));
        System.out.println("10 / 5 = " + divide.apply(10, 5));
    }
}
