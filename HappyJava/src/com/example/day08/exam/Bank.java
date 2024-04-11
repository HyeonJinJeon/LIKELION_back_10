package com.example.day08.exam;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Bank {
    private String name;

    public ArrayList<Account> getAccountList() {
        return accountList;
    }

    private ArrayList<Account> accountList= new ArrayList<Account>();
    Scanner sc = new Scanner(System.in);

    public Bank(String name) {
        this.name = name;
    }

    public void makeAccount(){
        Random r = new Random();

        System.out.println("통장을 개설하는 본인의 이름을 작성해주세요");
        String name= sc.next();

        System.out.println("통장 계좌정보는 다음과 같습니다");
        int number = (r.nextInt(90000) + 10000 );
        while(checkAccount(number) == false){
            number = (r.nextInt(90000) + 10000 );
        }
        Account account = new Account(number, name, 0);
        accountList.add(account);
        System.out.println("이름: " + name + "계좌번호: " + number);
    }

    public boolean checkAccount(int number){
        boolean result = true;
        for(int i = 0; i < accountList.size(); i++){
            if(accountList.indexOf(number) != -1){
                result = false;
                break;
            }
        }
        return result;
    }

    public Account findAccount() throws CustomException{
        int number = sc.nextInt();
        for (Account account : accountList) {
            if (account.getNumber() == number) {
                System.out.println("이름: " + account.getWho() + " 계좌번호: " + account.getNumber() + " 잔액: " + account.getRemain());
                return account;
            }
        }
//        System.out.println("일치하는 계좌가 없습니다.");
        throw new CustomException("일치하는 계좌가 없습니다.");
    }
}
