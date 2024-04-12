package com.example.day08.exam;

import java.util.Scanner;

public class Banker {
    private String name;
    private String id;
    Scanner sc = new Scanner(System.in);

    public Banker(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public boolean approveMakeAccount(){
        System.out.println("1. 계좌 개설 승인 | 2. 계좌 개설 거부");
        int choose = sc.nextInt();
        if(choose == 1){
            System.out.println("계좌 계설을 승인합니다.");
            return true;
        } else{
            System.out.println("계좌 개설을 거부합니다.");
            return false;
        }
    }
    public boolean approveOutput(){
        System.out.println("1. 출금 승인 | 2. 출금 거부");
        int choose = sc.nextInt();
        if(choose == 1){
            System.out.println("출금을 승인합니다.");
            return true;
        } else{
            System.out.println("출금을 거부합니다.");
            return false;
        }
    }
}
