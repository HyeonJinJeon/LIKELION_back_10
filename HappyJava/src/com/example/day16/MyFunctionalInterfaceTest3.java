package com.example.day16;

public class MyFunctionalInterfaceTest3 {
    public static void main(String[] args) {
        MyFunctionalInterface3 f3;
        f3 = (x, y) -> {
            int result = x * y;
            return result;
        };
        int num = f3.method(2,5);
        System.out.println(num);
    }
}
