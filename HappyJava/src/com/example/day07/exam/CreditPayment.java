package com.example.day07.exam;

public class CreditPayment implements Payment{
    @Override
    public void processPayment(String name, int price, int myMoney) {
        System.out.println(name + "의 가격 " + price +"원 을 카드으로 지불해주세요.");
        System.out.println("결제되었습니다. 감사합니다.");
        if(price > myMoney){
            System.out.println("카드 잔액이 부족합니다");
        }
    }
}
