package com.baby_lion.Thread;

public class ThreadExam2 {
    public static void main(String[] args) {
        Thread myThread = new Thread(new MyRunnable());
        myThread.start();
        try{
            System.out.println("main 시작!!");
            Thread.sleep(2000);
            System.out.println("main 끝!!");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
class MyRunnable implements Runnable{

    @Override
    public void run() {
        try{
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("스레드에서 할 일 구현");
    }
}