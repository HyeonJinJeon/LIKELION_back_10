package com.example.securityexam;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/")
    public String home(){
        return "home";
    }
    @GetMapping("/loginForm")
    public String loginForm(){
        return "loginForm";
    }

    @GetMapping("/info")
    public String info(){
        return "info";
    }

    @GetMapping("/hi")
    public String hi(){
        return "hi";
    }

    //계정이 user 하나만 존재. -- 계정 추가
    //인증만되면 어떤 페이지든 갈 수 있다. --권한을 추가할 필요가 있다
}
