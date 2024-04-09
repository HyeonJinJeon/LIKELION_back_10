package com.example.day07.interfaceExam;

public interface pet extends Animal{
    default public void walk(){
        System.out.println("우다다다");
    }
}
