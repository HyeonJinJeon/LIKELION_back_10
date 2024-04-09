package com.example.day07;

public class Tea extends BeverageRecipe{
    @Override
    public void addCondiments() {
        System.out.println("레몬을 추가합니다");
    }

    @Override
    public void brew() {
        System.out.println("차를 우려냅니다");
    }
}
