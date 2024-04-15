package com.example.day10;

public class ContainerDemo {
    public static void main(String[] args) {
        //IntegerContainer 객체 생성 방법 2가지
        IntegerContainer integerContainer = new IntegerContainer();
        integerContainer.set(10);
        integerContainer.get();

        Container<Integer> container1 = new IntegerContainer();
        container1.set(10);
        container1.get();

        //StringContainer 객체 생성 방법 2가지
        StringContainer stringContainer = new StringContainer();
        stringContainer.set("안녕하세요");
        stringContainer.get();

        Container<String> container2 = new StringContainer();
        container2.set("안녕하세요");
        container2.get();
    }
}
