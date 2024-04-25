package com.example.day13.exam1;

public class IncrementCounter implements Runnable{
    @Override
    public void run() {
        System.out.println("Increment 시작");
        for(int i = 100; i > 0; i--){
            try {
                System.out.println("Increment: " + i);
                Thread.sleep(60);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Increment 종료");
    }
}
