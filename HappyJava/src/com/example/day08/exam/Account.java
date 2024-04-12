package com.example.day08.exam;

public class Account {
    private int number;
    private String who;
    private int remain;

    public Account(int number, String who, int remain) {
        this.number = number;
        this.who = who;
        this.remain = remain;
    }

    public String getWho() {
        return who;
    }

    public int getRemain() {
        return remain;
    }

    public int getNumber() {
        return number;
    }

    public void input(int addMoney){
        this.remain = this.remain + addMoney;
        System.out.println("------------------------------------");
        System.out.println("입금된 금액: " + addMoney + " | 잔액:" + this.remain);
        System.out.println("------------------------------------");
    }

    public void output(int minusMoney) throws CustomException{
        if(minusMoney > this.remain){
            throw new CustomException("잔액이 부족합니댜");
        }
        this.remain = this.remain - minusMoney;
        System.out.println("------------------------------------");
        System.out.println("출금된 금액:" + minusMoney + " | 잔액:" + this.remain);
        System.out.println("------------------------------------");
    }
}
