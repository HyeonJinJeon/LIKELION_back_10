package com.example.day16;

//publuc int method(intx, inty) 이런 메서드를 가진 FunctionalInterface를 정의하고
//이런 인터페이스를 사용하는 코드를 만들어 보세요

public class MyFunctionalInterfaceTest2 {
    public static void main(String[] args) {
        MyFunctionalInterface2 f12;

        f12 = new MyFunctionalInterface2() {
            @Override
            public void method1(int x) {
                int result = x * 5;
                System.out.println(result);
            }
        };
        f12.method1(10);

        f12 = x -> {
            int result = x * 5;
            System.out.println(result);
        };
        f12.method1(5);

        f12 = x -> {
            int result = x * 2;
            System.out.println(result);
        };
        f12.method1(5);
    }

}
