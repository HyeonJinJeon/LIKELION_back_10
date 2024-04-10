package com.example.day07.Exam;

public class CashPayment implements Payment{

    @Override
    public void processPayment(String name, int price, int myMoney) {
        System.out.println(name + "의 가격 " + price +"원 을 현금으로 지불해주세요.");
        if(price < myMoney) {
            System.out.println("거스름돈 " + (myMoney - price) + "을 받으세요.");
        } else if (price == myMoney) {
            System.out.println("결제되었습니다. 감사합니다.");
        } else {
            System.out.println((price - myMoney) + "를 더 지불해주세요");
        }
    }
}
