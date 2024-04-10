package com.example.day07.Exam;

public class BurgerOrder extends Order{
    private int price;
    private String name;

    public BurgerOrder(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    void prepareFood() {
        System.out.println(name + "을(를) 조리 중 입니다.");
    }

    @Override
    void serveFood() {
        System.out.println("고객님의" + name +"을(를) 서빙합니다");
    }
}
