package com.example.day07;

public interface Drawable {
    default public void draw(){
        System.out.println("도형을 그립니다.");
    }

    default public void test(){
        //인터페이가 변경되면 인터페이스를 구현하는 모든 클래스들이 해당 메소드를 구현해야 하는 문제가 있다.
        //이를 해결하고자 default가 생겼다.
        System.out.println("default 메소드 입니다.");
    }
}
