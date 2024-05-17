package org.example.aopexam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AopexamApplication implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(AopexamApplication.class,args);
    }

    @Autowired
    SimpleService service;
    @Override
    public void run(String... args) throws Exception {
        System.out.println("run test!");
        service.doSomething();
        System.out.println();
        service.hello();
        System.out.println();

        service.setName("Jeon");
    }
}
