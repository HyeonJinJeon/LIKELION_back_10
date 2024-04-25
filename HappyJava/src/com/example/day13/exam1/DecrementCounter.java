package com.example.day13.exam1;

public class DecrementCounter implements Runnable{
    @Override
    public void run() {
        System.out.println("Decrement 시작");
        for(int i = 100; i > 0; i--){
            try {
                System.out.println("Decrement: " + i);
                Thread.sleep(20);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Decrement 종료");
    }
}
