package com.example.day07.interfaceExam;

public interface Animal {
    int age = 1; // final로 사용된다고 생각해야함. 즉 상수이다.
    public void speak();

    default public void song(){
        System.out.println("나는 노래왕이야");
    }
}
