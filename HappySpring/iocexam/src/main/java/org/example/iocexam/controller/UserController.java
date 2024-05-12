package org.example.iocexam.controller;

import org.example.iocexam.domain.User;
import org.example.iocexam.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class UserController {
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    public void joinUser(){
        //실제 동잘할 때는 사용자로 부터 정보를 받아온다.
        User user = new User();
        user.setName("jeon");
        user.setEmail("md3807@naver.com");
        user.setPassword("1234");

        userService.joinUser(user);
    }
}
