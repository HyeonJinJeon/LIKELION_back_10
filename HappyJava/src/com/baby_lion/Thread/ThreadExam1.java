package com.baby_lion.Thread;

public class ThreadExam1 {
    public static void main(String[] args) {
        System.out.println("main 시작!!");
        MyThread myThread = new MyThread();
        myThread.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("main 끝!!");
    }
}
class MyThread extends Thread{
    @Override
    public void run() {
        try{
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("스레드에서 실제 하고자 하는 일 구현!!!");
    }
}
