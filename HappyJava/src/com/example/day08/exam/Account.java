package com.example.day08.exam;

public class Account {
    private int number;
    private String who;
    private int remain;
    private String bankerId;

    public Account(int number, String who, int remain, String bankerId) {
        this.number = number;
        this.who = who;
        this.remain = remain;
        this.bankerId = bankerId;
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
        Bank bank = new Bank("국민은행");
        try{
            Banker myBanker = bank.findBanker(this.bankerId);
            System.out.println("안녕하세요 담당자 " + myBanker.getName() + "입니다.");
            if(myBanker.approveOutput() == true){
                this.remain = this.remain - minusMoney;
                System.out.println("------------------------------------");
                System.out.println("출금된 금액:" + minusMoney + " | 잔액:" + this.remain);
                System.out.println("------------------------------------");
            }else{
                System.out.println("출금이 거부되었습니다. | 잔액: " + this.remain);
            }
        }catch (CustomException e){
            System.out.println(e.getMessage());
        }
    }
}
