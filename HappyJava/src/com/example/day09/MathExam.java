package com.example.day09;

public class MathExam {
    public static void main(String[] args) {
        int maxNumber = Math.max(10, 20);
        int minNUmber = Math.min(10, 20);
        double squareRoot = Math.sqrt(16); // 제곱근
        double power = Math.pow(2,3); // 제곱

        double randomValue = Math.random(); //0.0 ~ 1.0의 난수

        System.out.println("최대값: " + maxNumber);
        System.out.println("최솟값: " + minNUmber);
        System.out.println("제곱근: " + squareRoot);
        System.out.println("제곱: " + power);

        System.out.println(randomValue);
    }
}
