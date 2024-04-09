package com.example.day07;

public class DImpl implements Dinter{
    @Override
    public void aMethod() {
        System.out.println("amethod 구현");
    }

    @Override
    public void cMethod() {
        System.out.println("ㅊmethod 구현");
    }

    @Override
    public void same() {
        System.out.println("same 구현");
    }

    @Override
    public void bMethod() {
        System.out.println("bmethod 구현");
    }

    @Override
    public void dMethod() {
        System.out.println("dmethod 구현");
    }
}
