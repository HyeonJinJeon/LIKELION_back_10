package com.example.day07.interfaceExam;

public class Dog implements pet{
    @Override
    public void speak() {
        System.out.println("멍멍");
    }
}
