package com.example.day08;

public  class Parent {
    public final void print(){
        System.out.println("Parent");
    }
}

class Child extends Parent{
    //final메소드 오버라이딭 불가능
//    @Override
//    public void print(){
//        super.print();
//    }
}
//상속 불가능!!
//class Child extends Parent(){};

//불변성 보장
//상속 방지
//불변 클래스 생성
//성능 최적
//확장 불가능
//메소드 오버라이딩 방지