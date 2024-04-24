package com.example.day16;
class MyFunctionalInterface1 implements MyFunctionalInterface{

    @Override
    public void method1() {
        System.out.println("(1)method1 call");
    }
//
//    @Override
//    public void method2() {
//        System.out.println("method2 call");
//    }
}

public class MyFunctionalInterfaceTest {
    public static void main(String[] args) {

        //첫번째 방법
        MyFunctionalInterface myFunctionalInterface1 = new MyFunctionalInterface1();

        //두번째 방법
        MyFunctionalInterface myFunctionalInterface2;
        myFunctionalInterface2 = new MyFunctionalInterface()
        {
            @Override
            public void method1() {
                System.out.println("(2)method1 call");
            }
//
//            @Override
//            public void method2() {
//                System.out.println("method2 call");
//            }
        };

        //세번째 방법
        MyFunctionalInterface myFunctionalInterface3;
        myFunctionalInterface3 = () -> System.out.println("(3)method1 call");

        //각 방법 메소드 호출
        myFunctionalInterface1.method1();
        myFunctionalInterface2.method1();
        myFunctionalInterface3.method1();
    }
}
