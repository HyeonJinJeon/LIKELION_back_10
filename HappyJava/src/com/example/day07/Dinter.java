package com.example.day07;

public interface Dinter extends Cinter, Binter{
    //인터페이스들 간에는 다중상속이 가능하다.
    public void dMethod();
}
