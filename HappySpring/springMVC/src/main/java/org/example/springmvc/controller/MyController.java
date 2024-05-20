package org.example.springmvc.controller;

import ch.qos.logback.core.model.Model;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class MyController {

    @GetMapping("/home")
    public String hone(){
        return "home"; // view name
    }

    @RequestMapping(value = "/about", method = RequestMethod.GET)
    public String about(){
        return "about"; // view name
    }

    @GetMapping("/contact")
    public String contact(){
        return "contact"; // view name
    }

    //응답을 데이터(리턴값)로 한다
    @ResponseBody
    @GetMapping("rest")
    public String rest(){
        return "restbody test!!"; // view name
    }

    @GetMapping("greeting")
    public String greet(@RequestParam(name = "abc", required = false, defaultValue = "Jeon") String name,
                        @RequestParam(name = "age", required = false) int age,
                        HttpServletRequest request){
        // http://localhost:8888/greeting?abc=h_jinnny&age=26
        // ?name=h_jinnny&age=20 쿼리문자열
        // 실제 매개변수 name에 값을 넣어주는거는 핸들러가 하고 있을 것이다.
        // 매개변수 타입이 int면 형변환이 팔요한데 값을 압력하지 않으면 null을 int로 형변환을 할 수 없기 때문에 오류가 나온다
        System.out.println(name);
        System.out.println(age);

        System.out.println("request:::" + request.getParameter("name"));
        System.out.println("request:::" + request.getParameter("age"));

        return "greeting";
    }
}
