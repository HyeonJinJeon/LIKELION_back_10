package org.example.iocexam.config;

import org.example.iocexam.controller.UserController;
import org.example.iocexam.dao.UserDao;
import org.example.iocexam.dao.UserDaoImpl;
import org.example.iocexam.service.UserService;
import org.example.iocexam.service.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "org.example.iocexam")
public class UserConfig {
    //IOC 컨테이너에 Bean을 등록하는 방법을 생각해보고 동작 할 수 있도록 작성해주세요.
    //1. javaconfig를 이용해서 동작되도록!!
    //2. componentScan을 이용해서 동작되도록..
//
//    @Bean
//    public UserController joinUser(){
//        return new UserController();
//    }
//    @Bean
//    public UserDao addUser(){
//        return new UserDaoImpl();
//    }
//    @Bean
//    UserService insertUser(){
//        return new UserServiceImpl();
//    }
}
