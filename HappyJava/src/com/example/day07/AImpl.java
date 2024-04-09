package com.example.day07;

public class AImpl implements Ainter {
    @Override
    public void aMethod() {
        System.out.println("a매소드 구현");
    }

    @Override
    public void same() {
        System.out.println("same메소드 구현");
    }

    public void say(){
        System.out.println("하하");
    }
}
