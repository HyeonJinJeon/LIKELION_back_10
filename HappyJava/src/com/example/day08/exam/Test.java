package com.example.day08.exam;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank bank = new Bank("국민은행");
        Account account;
//        bank.getAccountList(); // 계좌 정보를 불러옵니다.

        while(true){
            System.out.println("1.계좌 생성 | 2.계좌 정보 조회 | 3.작업종료");
            int choose = sc.nextInt();
            if(choose == 1) {
                System.out.println("<계좌 생성>");
                bank.makeAccount();
            }else if(choose == 2){
                System.out.println("<계좌 정보 조회>");
                System.out.println("계좌번호를 입력해주세요");
                try{
                    account = bank.findAccount();
                    while(true){
                        System.out.println("1.입금 | 2.출금 | 3.작업종료");
                        choose = sc.nextInt();

                        if(choose == 1){
                            System.out.println("입금하고자 하는 금액을 입력해주세요");
                            int addMoney = sc.nextInt();
                            account.input(addMoney);
                        } else if(choose == 2){
                            System.out.println("출금하고자 하는 금액을 입력해주세요");
                            int minusMoney = sc.nextInt();
                            try{
                                account.output(minusMoney);
                            }catch (CustomException e){
                                System.out.println(e.getMessage());
                            }
                        } else {
                            break;
                        }
                    }
                }catch (CustomException e){
                    System.out.println(e.getMessage());
                }
            }else{
                break;
            }

        }
    }
}
