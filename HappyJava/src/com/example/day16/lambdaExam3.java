package com.example.day16;

import java.util.function.*;

public class lambdaExam3 {
    public static void main(String[] args) {

//        Predicate<Integer> isPositive = new Predicate<Integer>() {
//            @Override
//            public boolean test(Integer integer) {
//                if(integer > 0){
//                    return true;
//                }else {
//                    return true;
//                }
//            }
//        };

        //Predicate
        //입력을 받고 boolean 을 반환함
        Predicate<Integer> isPositive = x -> x>0;
        System.out.println(isPositive.test(10));
        System.out.println(isPositive.test(-10));

        //Consumer
        //입력을 받고 반환 값이 없는 연산을 수행
        Consumer<String> printer = s -> System.out.println(s);
        printer.accept("hello");

        //Function
        //입력을 받아서 출력을 반환함
        Function<String, Integer> length = s -> s.length();
        System.out.println(length.apply("hello im h_jinnny"));

        //Supplier
        //입력 없이 값을 반환함
        Supplier<Double> randomSupplier =() -> Math.random();
        System.out.println(randomSupplier.get());

        IntSupplier intSupplier = () -> (int) (Math.random() * 6) +1;
        System.out.println(intSupplier.getAsInt());

        //UnaryOperator
        //입력과 출력이 같은 타입의 값일 때 사용
        UnaryOperator<Integer> square = x -> x * x;
        System.out.println(square.apply(5));

        //BiFunction
        //두 개의 입력을 받고 하나의 결과를 반환
        BiFunction<Integer ,Integer, Integer> add = (a, b) -> a+b;
        System.out.println(add.apply(5,6));

        //Consumer 의 andThen 메소드 활용
        Consumer<String> conA = s -> System.out.println(s+"aaa");
        Consumer<String> conB = s -> System.out.println(s+"bbb");

        conA.accept("h_jinnny ");
        conB.accept("h_jinnny ");

        conA.andThen(conB);//conA가 할 일을 하고 이어서 conB가 할 일을 진행한다.

        Consumer<String> conAB = conA.andThen(conB);
        conAB.accept("hello ");
    }
}
