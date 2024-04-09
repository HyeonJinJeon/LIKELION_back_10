package com.example.day07;

public class Child extends Parent {
    public Child() {
        super("홍길동", 0);
    }

    @Override
    public String getName() {
        System.out.println("나는 자식클래스에서 구현한 getName()입니다.");
        return super.getName();
    }
}
