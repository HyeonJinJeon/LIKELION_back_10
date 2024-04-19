package com.example.day13.syncExam;

//RobotPlayer 의 공유 객체가 된다!!
//synchronized 를 통해 method 를 동기화 시켜준다
public class Robot {
    public synchronized void methodA() {
        for(int i = 0; i < 5; i++){
            System.out.println("method A : " + i);
            try{
                Thread.sleep(500);
            }catch (InterruptedException e){
                throw new RuntimeException(e);
            }
        }
    }
    public synchronized void methodB() {
        for(int i = 0; i < 5; i++){
            System.out.println("method B : " + i);
            try{
                Thread.sleep(500);
            }catch (InterruptedException e){
                throw new RuntimeException(e);
            }
        }
    }
    public synchronized void methodC() {
        for(int i = 0; i < 5; i++){
            System.out.println("method C : " + i);
            try{
                Thread.sleep(500);
            }catch (InterruptedException e){
                throw new RuntimeException(e);
            }
        }
    }
    public synchronized void method(String name) {
        for(int i = 0; i < 5; i++){
            System.out.println("player " + name + ": " + i);
            try{
                Thread.sleep(500);
            }catch (InterruptedException e){
                throw new RuntimeException(e);
            }
        }
    }
}
