package com.example.day07.interfaceExam;

public class StaticDemo implements Calculator{
    public static void main(String[] args) {
        Calculator.light();
        Calculator cal = new StaticDemo();
        cal.say();
    }

    @Override
    public int add(int a, int b) {
        return 0;
    }

    @Override
    public int minus(int a, int b) {
        return 0;
    }
}
