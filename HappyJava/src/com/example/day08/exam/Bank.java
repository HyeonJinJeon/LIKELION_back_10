package com.example.day08.exam;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Bank {
    private String name;

    private ArrayList<Account> accountList= new ArrayList<Account>();
    private ArrayList<Banker> bankerList;

    public Bank(String name) {
        this.name = name;
        bankerList = new ArrayList<>();
        bankerList.add(new Banker("홍길동", "qqqq11"));
        bankerList.add(new Banker("신짱구", "wwww22"));
        bankerList.add(new Banker("김철수", "eeee33"));
        bankerList.add(new Banker("홍유리", "rrrr44"));
        bankerList.add(new Banker("박맹구", "tttt55"));
    }

    Scanner sc = new Scanner(System.in);

    public void makeAccount(){
        System.out.println("은행원 리스트입니다");
        for(Banker banker : bankerList){
            System.out.println("이름: " + banker.getName() + " | ID: " + banker.getId());
        }
        System.out.println();
        System.out.println("계좌 개설을 담당하는 은행원의 ID를 입력해주세요");
        Scanner sc = new Scanner(System.in);
        String bankerId = sc.next();
        try{
            Banker myBanker = findBanker(bankerId);
            System.out.println("통장을 개설하는 본인의 이름을 작성해주세요");
            String name= sc.next();

            Random r = new Random();

            if(myBanker.approveMakeAccount() == true){
                System.out.println("입금할 초기 자금을 입력헤주세요");
                int firstMoney = sc.nextInt();

                System.out.println("통장 계좌정보는 다음과 같습니다");
                int number = (r.nextInt(90000) + 10000 );
                while(checkAccount(number) == false){
                    number = (r.nextInt(90000) + 10000 );
                }
                Account account = new Account(number, name, firstMoney, myBanker.getId());
                accountList.add(account);
                System.out.println("--------------------------------");
                System.out.println("이름: " + name + " | 계좌번호: " + number + " | 잔액: " + firstMoney);
                System.out.println("--------------------------------");
            } else {
                System.out.println("계좌 개설이 거부되었습니다.");
            }
        }catch (CustomException e){
            System.out.println(e.getMessage());
        }
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
                System.out.println("------------------------------------");
                System.out.println("이름: " + account.getWho() + " | 계좌번호: " + account.getNumber() + " | 잔액: " + account.getRemain());
                System.out.println("------------------------------------");
                return account;
            }
        }
        throw new CustomException("일치하는 계좌가 없습니다.");
    }
    public Banker findBanker(String bankerId) throws CustomException{

        for (Banker banker : bankerList) {
            if (banker.getId().equals(bankerId)) {
                System.out.println("------------------------------------");
                System.out.println("은행원 이름: " + banker.getName() + " | ID: " + banker.getId());
                System.out.println("------------------------------------");
                return banker;
            }
        }
        throw new CustomException("일치하는 은행원이 없습니다.");
    }
}
