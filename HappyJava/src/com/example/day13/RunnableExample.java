package com.example.day13;

public class RunnableExample implements Runnable {
    @Override
    public void run() {
        System.out.println("새로운 Thread 시작.");
        for (int i = 0; i < 5; i++) {
            System.out.println("스레드 실행 중: " + i);

            try {
                Thread.sleep((int) (Math.random() * 1000));
            }catch (InterruptedException e){
                throw new RuntimeException(e);
            }
        }
        System.out.println("새로운 Thread 끝.");
    }

    public static void main(String[] args) {
        System.out.println("main thread 시작.");
        Runnable runnable = new RunnableExample();
        Thread thread = new Thread(runnable);
        thread.start();
        System.out.println("main thread 끝.");
    }
}