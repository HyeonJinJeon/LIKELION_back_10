package com.example.day07.exam;

abstract public class Order {
    abstract void prepareFood();
    abstract void serveFood();
    final void completeOrder(){
        System.out.println("주문이 완료되었습니다!");
    }
}
