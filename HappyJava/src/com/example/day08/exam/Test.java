package com.example.day08.exam;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank bank = new Bank("국민은행");
        Account account;
//        bank.getAccountList(); // 계좌 정보를 불러옵니다.

        while(true){
            System.out.println("계좌를 생성하려면 1번, 계좌 정보를 조회한 후 서비스를 이용하려면 2번을 눌러주세요. 취소하시려면 다른 숫자를 눌러주세요.");
            int choose = sc.nextInt();
            if(choose == 1) {
                System.out.println("계좌를 생성하는 절차를 따라주세요.");
                bank.makeAccount();
            }else if(choose == 2){
                System.out.println("계좌 정보를 확인하기 위해 계좌번호를 입력하세요.");
                try{
                    account = bank.findAccount();
                    while(true){
                        System.out.println("입금을 원하시면 1번, 출금을 원하시면 2번을 눌러주세요. 작업을 취소하시려면 다른 번호를 눌러주세요.");
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
