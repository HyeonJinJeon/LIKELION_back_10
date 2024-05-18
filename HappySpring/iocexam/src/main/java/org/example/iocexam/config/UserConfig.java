package org.example.iocexam.config;

import org.example.iocexam.controller.UserController;
import org.example.iocexam.dao.UserDao;
import org.example.iocexam.dao.UserDaoImpl;
import org.example.iocexam.dao.UserJeonDaoImpl;
import org.example.iocexam.service.UserService;
import org.example.iocexam.service.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "org.example.iocexam")
public class UserConfig {
    //IOC 컨테이너에 Bean을 등록하는 방법을 생각해보고 동작 할 수 있도록 작성해주세요.
    //1. javaconfig를 이용해서 동작되도록!!
    //생성자로 주입
    @Bean
    public UserController userController(UserService userService){
        return new UserController(userService);
    }

    //생성자로 주입
    @Bean
    public UserService userService(UserDao userDao){
        return new UserServiceImpl(userDao);
    }

    //설정자로 주입
//    @Bean
//    public UserService userService(UserDao userDao){
//        UserServiceImpl userService = new UserServiceImpl();
//        userService.setUserDao(userDao);
//        return userService;
//    }

    @Bean
    public UserDao userDao(){
        return new UserJeonDaoImpl();
    }

    //2. componentScan을 이용해서 동작되도록..
//

}
