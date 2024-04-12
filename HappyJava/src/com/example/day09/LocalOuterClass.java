package com.example.day09;

public class LocalOuterClass {
    private int outerField = 10;

    //메서드 안에서 클래스가 정의되는 것을 로컬 내부 클래스라고 한다!!!!!!
    //즉 메서드 안에서만 접근이 가능한 것을 말한다.
    public void outerMethod(){
        class InnerClass{
            public void InnerMethod(){
                System.out.println("outerField : " + outerField);
            }
        }
        InnerClass inner = new InnerClass();
        inner.InnerMethod();
    }

}
