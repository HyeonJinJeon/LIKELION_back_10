package org.example.aopexam;

import org.springframework.stereotype.Service;

@Service
public class SimpleService {
    public String doSomething(){
        //핵심관심, Target
        System.out.println("SimpleService doSomething run");
        return "Doing something...";
    }

    public void hello(){
        System.out.println("SimpleService hello run");
//        return "hello...";
    }

    public void setName(String name){
        System.out.println("setName() method run");
    }
}
