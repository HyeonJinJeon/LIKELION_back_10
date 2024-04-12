package com.example.day09;

public class GreeterDemo {
    public static void main(String[] args) {
        Greeter morningGreeter = new Greeter() {
            @Override
            public void greet() {
                System.out.println("좋은 아침입니다.");
            }
        };

        Greeter eveningGreeter = new Greeter() {
            @Override
            public void greet() {
                System.out.println("좋은 저녁입니다.");
            }
        };
        morningGreeter.greet();
        eveningGreeter.greet();
    }
}
