package org.example.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class MyController {

    @GetMapping("/home")
    public String hone(){
        return "home"; // view name
    }
    @GetMapping("/about")
    public String about(){
        return "about"; // view name
    }
    @GetMapping("/contact")
    public String contact(){
        return "contact"; // view name
    }
}
