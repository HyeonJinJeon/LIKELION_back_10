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
        System.out.println("통장잔고가 " + addMoney + "가 입금되어 " + this.remain + "이 되었습니다.");
    }

    public void output(int minusMoney) throws CustomException{
        if(minusMoney > this.remain){
            throw new CustomException("잔액이 부족합니댜");
        }
        this.remain = this.remain - minusMoney;
        System.out.println(minusMoney + "를 출금하여 잔액 " + this.remain + "이 되었습니다");
    }
}
