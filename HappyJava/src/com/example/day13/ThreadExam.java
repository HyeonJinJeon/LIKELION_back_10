package com.example.day13;

class MyThread extends Thread{  // 상속 .. Thread 를 상속 받은 MyThread 는 Thread 이다.

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
class YourThread extends Thread{  // 상속 .. Thread 를 상속 받은 MyThread 는 Thread 이다.

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

public class ThreadExam {
    public static void main(String[] args) {
        System.out.println("main 출발");

        //스레드 생성
        MyThread myThread = new MyThread();
        myThread.start();

        YourThread yourThread = new YourThread();
        yourThread.start();

        for(int i = 0; i < 100; i ++){
            System.out.println("main 안녕!!");
        }
        System.out.println("main 종료!!");
    }

}
