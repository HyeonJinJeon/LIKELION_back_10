package com.example.day16;

public class FinalVariableExam {
    public static void main(String[] args) {
        int x = 10;
        System.out.println("람다에서 파이널로 사용");

        Runnable r = () -> {
            System.out.println("x : " + x);
        };

        //x = 20;
        // 람다식 내에서 사용되는 변수는 final 또는 사실상 final이어야 합니다
        //실질적으로는 final로 동작하므로 값 변경 불가능
        r.run();
    }
}
