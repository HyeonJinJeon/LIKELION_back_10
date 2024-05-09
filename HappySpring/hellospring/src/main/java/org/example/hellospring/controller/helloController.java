package org.example.hellospring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

public class helloController {
    @RestController
    public class HelloController {

        @GetMapping("/hi")
        public String hi() {
            return "반갑습니다";
        }
        @GetMapping("/exam")
        public String exam() {
            return "실습 중입니다";
        }
        @GetMapping("/lunch")
        public String lunch() {
            return "밥 먹고 오겠습니다";
        }
    }
}
