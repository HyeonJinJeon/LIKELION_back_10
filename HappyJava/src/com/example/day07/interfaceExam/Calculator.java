package com.example.day07.interfaceExam;

public interface Calculator {
    int add(int a, int b);
    int minus(int a, int b);

    //static과 default의 차이를 알아라!
    static void light(){
        System.out.println("불을 밝히다.");
    }
    default void say(){
        System.out.println("siu");
    }
}
