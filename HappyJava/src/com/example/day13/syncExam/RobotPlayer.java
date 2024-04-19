package com.example.day13.syncExam;

//RobotPlayer 는 Robot 이라는 공유 객체를 사용한다,
//각 RobotPlayer 는 Thread 를 상속받아 정의된다.
public class RobotPlayer extends Thread {

    private String name;
    private  Robot robot;
    public RobotPlayer(String name, Robot robot) {
        this.name = name;
        this.robot = robot;
    }

    @Override
    public void run() {
//        if(name.equals("A")){
//            robot.methodA();
//        }else if (name.equals("B")){
//            robot.methodB();
//        }else{
//            robot.methodC();
//        }
        robot.method(name);
    }
}
