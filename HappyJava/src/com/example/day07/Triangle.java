package com.example.day07;

public class Triangle extends Shape implements Drawable{
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return base * height / 2;
    }

    @Override
    public void draw() {
        System.out.println("세모를 그립니다.");
    }
}
