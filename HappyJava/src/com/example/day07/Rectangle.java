package com.example.day07;
//클래스가 인터페이스를 구현한다.
public class Rectangle extends Shape implements Drawable{
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public void draw() {
        System.out.println("네모를 그립니다.");
    }
}
