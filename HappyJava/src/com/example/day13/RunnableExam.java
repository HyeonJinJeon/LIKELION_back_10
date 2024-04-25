package com.example.day13;

class MyRunnable implements Runnable{ //MyRunnable 은 스레드는 아니다.

    @Override
    public void run() {
        System.out.println("myThread 출발");
        //스레드가 해야하는 일
        for(int i = 0; i < 100; i++){
            System.out.println("My 안녕!!");
        }
        System.out.println("myThread 종료!!!");
    }
}
class YourRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("YourThread 출발");
        //스레드가 해야하는 일
        for(int i = 0; i < 100; i++){
            System.out.println("Your 안녕!!");
        }
        System.out.println("YourThread 종료!!!");
    }
}
public class RunnableExam {
    public static void main(String[] args) {
        Thread myThread = new Thread(new MyRunnable());
        myThread.start();

        Thread yourThread = new Thread(new YourRunnable());
        yourThread.start();

        for(int i = 0; i < 100; i ++){
            System.out.println("main 안녕!!");
        }
        System.out.println("main 종료!!");
    }
}
