package com.example.day07.exam;

import java.util.Scanner;

public class OderDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BurgerOrder burgerOrder = new BurgerOrder("통새우 와퍼", 9900);
        PizzaOrder pizzaOrder = new PizzaOrder("존스페이버릿 피자", 29900);
        CashPayment cashPayment = new CashPayment();
        CreditPayment creditPayment = new CreditPayment();

        burgerOrder.prepareFood();
        burgerOrder.serveFood();

        System.out.println("지불할 액수를 입력하세요");
        int myMoney = sc.nextInt();
        cashPayment.processPayment(burgerOrder.getName(), burgerOrder.getPrice(), myMoney);

        System.out.println();
        System.out.println("******************************");
        System.out.println();

        pizzaOrder.prepareFood();
        pizzaOrder.serveFood();

        System.out.println("카드 잔액을 입력하세요");
        myMoney = sc.nextInt();
        creditPayment.processPayment(pizzaOrder.getName(), pizzaOrder.getPrice(), myMoney);
    }
}
