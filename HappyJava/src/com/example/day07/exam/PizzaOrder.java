package com.example.day07.exam;

public class PizzaOrder extends Order{
    private int price;
    private String name;

    public PizzaOrder(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
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
